package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.finanzwesenvs;

import java.io.Serializable;

import javax.ejb.*;
import javax.inject.Inject;
import javax.jms.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.finanzwesenvs.forderungvse.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.finanzwesenes.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.finanzwesenvs.rechnungvse.*;
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
	mappedName = "FinanzwesenVS_Queue") 
public class FinanzwesenVS_MDB implements MessageListener {
	
	@EJB
	private FinanzwesenVS _vorgangsservice;
	
	public void onMessage(Message queueMessage) {
		try {
			Object messageObject = ((ObjectMessage) queueMessage).getObject();
			if (messageObject instanceof Forderung) {
				Forderung message = (Forderung) messageObject;
				_vorgangsservice.meldeForderung(message);
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
