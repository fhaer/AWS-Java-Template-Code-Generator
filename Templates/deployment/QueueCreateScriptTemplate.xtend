package de.uniba.wiai.seda.fha.swarchitektur.templates.deployment

import de.uniba.wiai.seda.fha.swarchitektur.templates.AbstractTemplateFile
import java.util.List

/**
 * generiert ein Skript zur Erstellung von Message Queues
 */
class QueueCreateScriptTemplate extends AbstractTemplateFile {
	
	private List<String> queueNames
	
	new() {
		fileName = '''queueCreateSkript.bat'''
	}
	
	def setQueueNames(List<String> queueNames) {
		this.queueNames = queueNames
	}
	
	override generate()
		'''
		«FOR queueName : queueNames»
		REM erstelle Queue und ConnectionFactory fuer «queueName»
		cmd /c C:\glassfish4\bin\asadmin create-jms-resource --restype javax.jms.QueueConnectionFactory --enabled=true --property transaction-support=XATransaction «queueName»CF
		cmd /c C:\glassfish4\bin\asadmin create-jms-resource --restype javax.jms.Queue --enabled=true --property Name=«queueName»Phys «queueName»
		
		«ENDFOR»
		pause
		'''
}