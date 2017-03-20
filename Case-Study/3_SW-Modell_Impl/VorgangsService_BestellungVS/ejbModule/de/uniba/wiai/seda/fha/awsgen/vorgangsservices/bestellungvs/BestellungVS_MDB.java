package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.bestellungvs;

import java.io.Serializable;

import javax.ejb.*;
import javax.inject.Inject;
import javax.jms.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.bestellungvs.auftragvse.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.bestellungvs.produktionsauftragvse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.*;

/**
 * Message Driven Bean zur asynchronen Kommunikation zwischen
 * nicht-elementaren Vorgangs-Services
 *
 * @generated
 */
@SuppressWarnings("all")
@MessageDriven(activationConfig = 
	{ @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")}, 
	mappedName = "BestellungVS_Queue") 
public class BestellungVS_MDB implements MessageListener {
	
	@EJB
	private BestellungVS _vorgangsservice;
	
	public void onMessage(Message queueMessage) {
		try {
			Object messageObject = ((ObjectMessage) queueMessage).getObject();
			if (messageObject instanceof Bestellung) {
				Bestellung message = (Bestellung) messageObject;
				_vorgangsservice.bearbeiteAuftrag(message);
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Sendet das übergebene Objekt als ObjectMessage an eine JMS-Queue
	 */
	public static void sendMessage(String queueName, Serializable messageObject) {
	    try {
			InitialContext ctx = new InitialContext();
		    Queue queue = (Queue) ctx.lookup(queueName);
		    QueueConnectionFactory factory =
		        (QueueConnectionFactory) ctx.lookup(queueName + "CF");
		    QueueConnection connection = factory.createQueueConnection();
			QueueSession session = connection.createQueueSession(false,
			        QueueSession.AUTO_ACKNOWLEDGE);
			QueueSender sender = session.createSender(queue);
			sender.send(session.createObjectMessage(messageObject));
		} catch (JMSException | NamingException e) {
			// log error on server
			e.printStackTrace();
		}
	}
}
