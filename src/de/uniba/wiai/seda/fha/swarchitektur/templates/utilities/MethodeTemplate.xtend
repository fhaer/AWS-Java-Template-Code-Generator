package de.uniba.wiai.seda.fha.swarchitektur.templates.utilities

import org.eclipse.emf.common.util.EList
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.InvokeQueueAsync
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.InvokeEJBSync
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.Methode
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.Invoke
import java.util.List
import java.util.ArrayList
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.Methodensignatur
import de.uniba.wiai.seda.fha.swarchitektur.generator.Namespace
import de.uniba.wiai.seda.fha.swarchitektur.templates.javaee.MessageDrivenBeanTemplate
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.StatelessSessionBean

/**
 * Hilfsklasse mit statische Membern zur Generierung von Methoden.
 */
class MethodeTemplate {
	
	/**
	 *  Variablenname für eine Entität, die mit CRUD-Methoden verwendet wird.
	 */
	private final static String ENTITY_VARIABLE = "_entity"
	
	/**
	 *  Variable, die den von der Methode zurückzugebenden Wert speichert.
	 */
	private final static String RETURN_VARIABLE = "_returnValue"
	
	/**
	 * generiert eine Methode
	 */
	def static genMethode(Methode m, String name, Namespace ns) {
		var typ = getTyp(m.outputTyp, ns)
		'''
		«genJavaDoc()»
		public «typ» «m.name.toFirstLower»(«genMethodenParameterTyp(m.inputTypen, ns)») {
			«genReturnVariable(typ)»
			«FOR i : m.invoke»
			«genInvoke(i, m, name, typ)»
			«ENDFOR»
			«genGetterSetter(m, typ)»
			«IF ns.isEntitaetsService()»
			«genCRUD(m.name, typ, m.inputTypen)»
			«ENDIF»
			«genReturnStatement(m, typ, ns)»
		}
		'''
	}
	
	/**
	 * generiert eine Vaiable die den von der Methode zurückzugebenden Wert speichert
	 */
	def static genReturnVariable(String typ) {
		if (!typ.equals("void")) {
			return '''«typ.toFirstUpper» «RETURN_VARIABLE» = null;'''
		} 
		return ''''''
	}
	
	/**
	 * generiert eine Methode, die eine gleichnamige in der Superklasse überschreibt
	 */
	def static genOverrideMethode(Methode m, Namespace ns) {
		var typ = getTyp(m.outputTyp, ns)
		'''
		@Override
		public «typ» «m.name.toFirstLower»(«genMethodenParameterTyp(m.inputTypen, ns)») {
			«IF typ.equals("void")»
			super.«m.name.toFirstLower»(«genMethodenParameter(m.inputTypen, ns)»);
			«ELSE»
			return super.«m.name.toFirstLower»(«genMethodenParameter(m.inputTypen, ns)»);			
			«ENDIF»
		}
		'''
	}
	
	/**
	 * generiert Getter- und Setter-Methoden
	 */
	def static genGetterSetter(Methode methode, String typ) {
		if (methode.name.matches("^get.*")) {
			return genGetter(methode.name, typ)
		} else if (methode.name.matches("^set.*")) {
			return genSetter(methode.name, methode.inputTypen)
		} 
	}
	
	/**
	 * generiert das Return-Statement einer Methode
	 */
	def static genReturnStatement(Methode methode, String typ, Namespace ns) {
		if (!typ.equals("void")) {
			return '''return «RETURN_VARIABLE»;'''
		}
	}
	
	/**
	 * generiert einen Methodenaufruf
	 */
	def static genInvoke(Invoke invoke, Methode m, String name, String typ) {
		if (invoke instanceof InvokeEJBSync) {
			var i = invoke as InvokeEJBSync
			var ms = i.methodensignatur
			var object = "this"
			var isVSElementar = false
			if (i.ejb != null) { 
				object = i.ejb.name;
			}
			if (object.equalsIgnoreCase(name)) {
				object = "this"
			}
			if (i.ejb instanceof StatelessSessionBean) {
				// Ausfuehrung eines elementaren Vorgangs-Service
				isVSElementar = true
			}
			if (ms != null) {
				'''
				«IF isVSElementar»
				startActivity("«ms.name»");
				«ENDIF»
				«genVariable(ms, typ)»«object.toFirstLower».«ms.name.toFirstLower»(«genParameter(ms.inputTypen, m.inputTypen)»);
				«IF isVSElementar»
				stopActivity("«ms.name»");
				«ENDIF»
				'''
			}
		} else if (invoke instanceof InvokeQueueAsync) {
			var i = invoke as InvokeQueueAsync
			'''«MessageDrivenBeanTemplate.genSendMessage(name, i.queueName.name, genParameter(i.nachrichtenTypen, m.inputTypen))»;'''
		}
	}
	
	/**
	 * generiert eine Variable, die den zurückgegebenen Wert eines Methodenaurufs speichert 
	 */
	def static genVariable(Methodensignatur ms, String typ) {
		if (ms.outputTyp != null && ms.outputTyp.length > 0) {
			if (ms.outputTyp.equalsIgnoreCase(typ)) {
				'''«RETURN_VARIABLE» = '''
			} else {
				'''«ms.outputTyp.toFirstUpper» «ms.outputTyp.toFirstLower» = '''
			}
		} else {
			''''''
		}
	}
	
	/**
	 * generiert Methodenparameter mit Typ
	 */
	def static genMethodenParameterTyp(EList<String> parameterTypen, Namespace ns) {
		'''«FOR t : parameterTypen SEPARATOR ', '»«getTyp(t, ns)» _«t.toFirstLower»«ENDFOR»'''
	}
	
	/**
	 * generiert Methodenparameter ohne Typ
	 */
	def static genMethodenParameter(EList<String> parameterTypen, Namespace ns) {
		'''«FOR t : parameterTypen SEPARATOR ', '» _«t.toFirstLower»«ENDFOR»'''
	}
	
	/**
	 * gibt den Typ einer Methode oder eines Parameters zurück
	 */
	def static getTyp(String typ, Namespace ns) {
		var typString = ""
		if (typ == null || typ.trim.length == 0) {
			typString = "void"
		} else if (typ.equalsIgnoreCase("ID")) {
			typString = "Integer" 
		} else {
			typString = typ.toFirstUpper
		}
		return typString
	}
    
    /**
     * generiert Methodensignaturen
     */
	def static genMethodensignatur(Methodensignatur m, Namespace ns) {
		var typ = "void"
		if (m.outputTyp != null && m.outputTyp.trim.length > 0) {
			typ = m.outputTyp.toFirstUpper
		}
		'''
		«genJavaDoc()»
		public «typ» «m.name.toFirstLower»(«MethodeTemplate.genMethodenParameterTyp(m.inputTypen, ns)»);
		'''
	}
	
	/**
	 * generierte eine mit Kommata getrennte Parameterliste. Jeder Parameter ist
	 * ein exitierendes Objekt oder wird mittels "new" Keyword erstellt.
	 */
	def static genParameter(EList<String> parameterTypes, EList<String> existingTypes) {
		var List<String> parameterStrings = new ArrayList<String>()
		for (typ : parameterTypes) {
			var createNewObject = true
			for (existingType : existingTypes) {
				if (existingType.equalsIgnoreCase(typ)) {
					createNewObject = false
				}
			}
			if (createNewObject) {
				parameterStrings.add("new " + typ.toFirstUpper + "()")
			} else {
				parameterStrings.add("_" + typ.toFirstLower)
			}
		}
		'''«FOR parameter : parameterStrings SEPARATOR ', '»«parameter»«ENDFOR»'''
	}
	
    /**
     * generiert einer Getter-Methode ohne Return-Statement, 
     * schreibt Wert in Variable GETTER_VALUE_VARIABLE
     */
    def static genGetter(String methodName, String typ) {
    	var attribut = "null"
    	if (methodName.matches("^get.*")) {
    		// Konvention: Name enthält Attribut-Name
    		attribut = "this." + methodName.substring(3).toFirstLower
    	}
    	'''
    	«RETURN_VARIABLE» = «attribut»;
    	'''
    }
	
	/**
	 * generiert eine Setter-Methode
	 */
	 def static genSetter(String methodName, EList<String> parameterTypes) {
	 	// Konvention: Parameter-Namen sind Attribut-Namen
	 	'''
	 	«FOR parameter : parameterTypes»
	 	this.«methodName.substring(3).toFirstLower» = _«parameter.toFirstLower»;
	 	«ENDFOR»
	 	'''
	 }
	 
	 /**
	  * generiert CRUD-Methoden
	  */
	 def static genCRUD(String methodName, String returnTyp, EList<String> parameter) {
	 	var String entityTyp = "Object"
	 	var String entityAssignment = ""
	 	var primaryKeyParam = "0"
    	if (methodName.matches("^create.*")) {
    		entityTyp = returnTyp.toFirstUpper
    		// erstelle neue Entity mit vorgeschriebenem Konstruktor
    		entityAssignment = "new " + entityTyp + "()";
    		return genCreateMeathod(entityTyp, entityAssignment)
    	} else if (methodName.matches("^read.*")) {
    		entityTyp = returnTyp.toFirstUpper
    		// Konvention: erster Parameter ist eine ID (Primärschlüssel)
    		if (parameter.size > 0) 
    			primaryKeyParam = "_" + parameter.get(0).toFirstLower
    		return genReadMeathod(entityTyp, entityAssignment, primaryKeyParam)
    	} else if (methodName.matches("^update.*") && parameter.size > 0) {
    		// Konvention: erster Parameter ist die Entität, die aktualisiert werden soll 
    		entityTyp = parameter.get(0).toFirstUpper
    		entityAssignment = parameter.get(0).toFirstLower;
    		return genUpdateMeathod(entityTyp, entityAssignment)
    	} else if (methodName.matches("^delete.*") && parameter.size > 0) {
    		// Konvention: erster Parameter ist die zu löschende Entität 
    		entityTyp = parameter.get(0).toFirstUpper
    		entityAssignment = parameter.get(0).toFirstLower;
    		return genDeleteMeathod(entityTyp, entityAssignment)
    	}
	 }
	 
	 /**
	  * generiert CRUD-Methoden: create
	  */
	 def static genCreateMeathod(String entityTyp, String entityAssignment) '''
		«RETURN_VARIABLE» = super.create(«entityAssignment»);
		'''
	  
	 /**
	  * generiert CRUD-Methoden: read
	  */
	 def static genReadMeathod(String entityTyp, String entityAssignment, String primaryKeyParameter) '''
	 	«RETURN_VARIABLE» = super.read(«entityTyp».class, «primaryKeyParameter»);
	 	'''
	
	 /**
	  * generiert CRUD-Methoden: update
	  */
	 def static genUpdateMeathod(String entityTyp, String entityAssignment) '''
		«entityTyp» «ENTITY_VARIABLE» = _«entityAssignment»;
		super.update(«ENTITY_VARIABLE»);
	 	'''
	 
	 /**
	  * generiert CRUD-Methoden: delete
	  */
	 def static genDeleteMeathod(String entityTyp, String entityAssignment) '''
		«entityTyp» «ENTITY_VARIABLE» = _«entityAssignment»;
		super.delete(«ENTITY_VARIABLE»);
	 	'''
	 
	/**
	 * generiert JavaDoc
	 */
	def static genJavaDoc() '''
		/**
		 * @generated
		 */
		'''
}