package de.uniba.wiai.seda.fha.swarchitektur.templates.javaee

import de.uniba.wiai.seda.fha.swarchitektur.swdesign.MessageDrivenBean
import java.util.List
import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile
import de.uniba.wiai.seda.fha.swarchitektur.generator.Namespace
import de.uniba.wiai.seda.fha.swarchitektur.templates.utilities.NamespaceTemplate

/**
 * generiert Message Driven Beans
 */
class MessageDrivenBeanTemplate extends AbstractTemplateFile {
	
	private MessageDrivenBean bean
	private List<Namespace> importNs
	private String name
	private String vorgangsServiceName
	
	public final static String CLASS_NAME_SUFFIX = "_MDB"
	
	new() {
		moduleDir='''ejbModule'''
	}

	def setBean(MessageDrivenBean bean) {
		this.bean = bean
	}

	def setImportNs(List<Namespace> importNs) {
		this.importNs = importNs
	}
	
	override setFileName(String name, String erweiterung) {
		this.name = name.toFirstUpper + CLASS_NAME_SUFFIX
		this.fileName = this.name + "." + erweiterung
	}
	
	def setVorgangsServiceName(String vorgangsServiceName) {
		this.vorgangsServiceName = vorgangsServiceName.toFirstUpper
	}
	
	override generate()
		'''
		package «namespace»;
		
		import java.io.Serializable;
		
		import javax.ejb.*;
		import javax.inject.Inject;
		import javax.jms.*;
		import javax.naming.InitialContext;
		import javax.naming.NamingException;
		«NamespaceTemplate.genImportNamespaces(namespace, importNs)»
		
		«genJavaDoc()»
		@SuppressWarnings("all")
		@MessageDriven(activationConfig = 
			{ @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")}, 
			mappedName = "«bean.queue.name»") 
		public class «name» implements MessageListener {
			
			@EJB
			private «vorgangsServiceName» _vorgangsservice;
			
			public void onMessage(Message queueMessage) {
				try {
					Object messageObject = ((ObjectMessage) queueMessage).getObject();
					«FOR methode : bean.methode»
					«FOR paramTyp : methode.inputTypen»
					«var typ = paramTyp.toFirstUpper»
					if (messageObject instanceof «typ») {
						«typ» message = («typ») messageObject;
						_vorgangsservice.«methode.name.toFirstLower»(message);
					}
					«ENDFOR»
					«ENDFOR»
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
		'''	
		
		def static genJavaDoc() {
			'''
			/**
			 * Message Driven Bean zur asynchronen Kommunikation zwischen
			 * nicht-elementaren Vorgangs-Services
			 *
			 * @generated
			 */
			'''
		}
	
	def static genSendMessage(String name, String queueName, CharSequence message) {
		'''messageDrivenBean.sendMessage("«queueName»", «message»)'''
	}
	
}