package de.uniba.wiai.seda.fha.swarchitektur.generator

import de.uniba.wiai.seda.fha.swarchitektur.swdesign.EJBModule
import de.uniba.wiai.seda.fha.swarchitektur.templates.javaee.SessionBeanTemplate
import de.uniba.wiai.seda.fha.swarchitektur.templates.javaee.MessageDrivenBeanTemplate
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.MessageDrivenBean
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.StatelessSessionBean
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.StatefulSessionBean
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.BusinessInterface
import java.util.List
import de.uniba.wiai.seda.fha.swarchitektur.templates.javaee.BusinessInterfaceTemplate
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.JPAEntity
import de.uniba.wiai.seda.fha.swarchitektur.templates.javaee.EntityTemplate
import java.util.ArrayList
import de.uniba.wiai.seda.fha.swarchitektur.swdesign.EJB
import de.uniba.wiai.seda.fha.swarchitektur.templates.javaee.AbstractSessionBeanTemplate

/**
 * Klasse zur Generierung von Java-EE-Quellcode
 */
class JavaEEFileGenerator {
	
	/**
	 * Erstellung (Schreiben) von Dateien
	 */
	private TemplateFileWriter fileGenerator
	
	/**
	 * Verwaltung von Namespaces
	 */
	private NamespaceManager namespaceManager
	
	/**
	 * Namespace für generierte Artefakte
	 */
	private Namespace baseNamespace
	
	/**
	 * Referenz auf GUI
	 */
	private View view
	
	/**
	 * setzt den Namespace für zu generierende Artefakte
	 */
	def setBaseNamespace(Namespace baseNamespace) {
		this.baseNamespace = baseNamespace
	}
	
	/**
	 * setzt den NamespaceManager zur Verwaltung von Namespaces
	 */
	def setNamespaceManager(NamespaceManager namespaceManager) {
		this.namespaceManager = namespaceManager
	}
	
	/**
	 * setzt eine Referenz zum Schreiben generierter Templates
	 */
	def setFileGenerator(TemplateFileWriter fileGenerator) {
		this.fileGenerator = fileGenerator
	}
	
	/**
	 * setzt eine Referenz auf die GUI
	 */
	def setView(View view) {
		this.view = view
	}
	
	/**
	 * generiert Entitäten eines Moduls
	 */
	def void genEntities(EJBModule module, List<JPAEntity> entities, List<EJBModule> moduleList) {
		view.addStatusText("  " + module.name)
		for (entity : entities) {
			view.addStatusText("    " + entity.name)
			var Namespace ns = baseNamespace.append(entity.package)
			namespaceManager.addEntitaet(entity.name, ns)
			
			var e = new EntityTemplate()
			e.setEntity(entity)
			e.setFileName(entity.name, 'java')
			e.setModule(module)
			e.setNamespace(ns)
			e.setImportNs(new ArrayList<Namespace>())
			e.setNsManager(namespaceManager)
			
			fileGenerator.add(e)
			
			// Kopiere Entity zum Zugriff in alle Vorgangsservices
			for (vorgangsServiceModule : moduleList) {
				if (vorgangsServiceModule.entities.size == 0) {
					var entityForOtherModule = new EntityTemplate(e)
					entityForOtherModule.setModule(vorgangsServiceModule)
					fileGenerator.add(entityForOtherModule)
				}
			}
		}
	}
	
	/**
	 * generiert EJBs eines Moduls
	 */
	def genEJB(List<EJB> ejbs, EJBModule module, List<Namespace> importNs) {
		view.addStatusText("  " + module.name)
		for (ejb : ejbs) {
			var ns = baseNamespace.append(ejb.package)
			importNs.add(baseNamespace)
			importNs.addAll(namespaceManager.getEntitaetNamespaces(ejb.methode, ejb.attribute))
			
			if (ejb instanceof StatefulSessionBean) {
				genStatefulSessionBean(ejb, importNs, module, ns)
			} else if (ejb instanceof StatelessSessionBean) {
				genStatelessSessionBean(ejb, importNs, module, ns)
			} else if (ejb instanceof MessageDrivenBean) {
				genMessageDrivenBean(ejb, importNs, module, ns)
			}
		}
	}
	
	/**
	 * generiert eine Message Driven Bean eines Moduls 
	 */
	def genMessageDrivenBean(EJB ejb, List<Namespace> importNs, EJBModule module, Namespace ns) {
		view.addStatusText("    Message Drive Bean: " + ejb.name)
		
		getNamespacesOfOtherServices(ns, importNs)
		
		var MessageDrivenBeanTemplate template = new MessageDrivenBeanTemplate()
		template.setBean(ejb as MessageDrivenBean)
		template.setImportNs(importNs)
		template.setVorgangsServiceName(ejb.name)
		template.setFileName(ejb.name, 'java')
		template.setModule(module)
		template.setNamespace(ns)
		
		fileGenerator.add(template)
	}

	/**
	 * generiert eine Stateful Session Bean eines Moduls
	 */
	def genStatefulSessionBean(EJB ejb, List<Namespace> importNs, EJBModule module, Namespace ns) {
		view.addStatusText("    Stateful Session Bean: " + ejb.name)
		
		var SessionBeanTemplate sbTemplate = new SessionBeanTemplate()
		var AbstractSessionBeanTemplate sbAbsTemplate = new AbstractSessionBeanTemplate()
		
		getNamespacesOfOtherServices(ns, importNs)
		
		// erbe von Basisklasse (Vererbung: 2. Stufe) 
		sbAbsTemplate.setBean(ejb as StatefulSessionBean)
		sbAbsTemplate.setImportNs(importNs)
		sbAbsTemplate.setNsManager(namespaceManager)
		sbAbsTemplate.setInterfaceName(ejb.name)
		sbAbsTemplate.setFileName(ejb.name, 'java')
		sbAbsTemplate.setModule(module)
		sbAbsTemplate.setNamespace(ns)
		
		// erstelle Implementierungsklasse (Vererbung: 3. Stufe) 
		sbTemplate.setBean(ejb as StatefulSessionBean)
		sbTemplate.setImportNs(importNs)
		sbTemplate.setNsManager(namespaceManager)
		sbTemplate.setInterfaceName(ejb.name)
		sbTemplate.setFileName(ejb.name, 'java')
		sbTemplate.setModule(module)
		sbTemplate.setNamespace(ns)
		
		fileGenerator.add(sbAbsTemplate)
		fileGenerator.add(sbTemplate)
	}

	/**
	 * generiert eine Stateless Session Bean eines Moduls
	 */
	def genStatelessSessionBean(EJB ejb, List<Namespace> importNs, EJBModule module, Namespace ns) {
		view.addStatusText("    Stateless Session Bean: " + ejb.name)
		
		var SessionBeanTemplate sbTemplate = new SessionBeanTemplate()
		var AbstractSessionBeanTemplate sbAbsTemplate = new AbstractSessionBeanTemplate()
		
		getNamespacesOfOtherServices(ns, importNs)
		
		// erbe von Basisklasse (Vererbung: 2. Stufe) 
		sbAbsTemplate.setBean(ejb as StatelessSessionBean)
		sbAbsTemplate.setImportNs(importNs)
		sbAbsTemplate.setNsManager(namespaceManager)
		sbAbsTemplate.setInterfaceName(ejb.name)
		sbAbsTemplate.setFileName(ejb.name, 'java')
		sbAbsTemplate.setModule(module)
		sbAbsTemplate.setNamespace(ns)
		
		// erstelle Implementierungsklasse (Vererbung: 3. Stufe) 
		sbTemplate.setBean(ejb as StatelessSessionBean)
		sbTemplate.setImportNs(importNs)
		sbTemplate.setNsManager(namespaceManager)
		sbTemplate.setInterfaceName(ejb.name)
		sbTemplate.setFileName(ejb.name, 'java')
		sbTemplate.setModule(module)
		sbTemplate.setNamespace(ns)
		
		fileGenerator.add(sbAbsTemplate)
		fileGenerator.add(sbTemplate)
	}
	
	/**
	 * generiert Namespaces von verwendeten Services
	 */
	def getNamespacesOfOtherServices(Namespace ns, List<Namespace> importNs) {
		
		if (ns.entitaetsService) {
			importNs.add(baseNamespace.append(Namespace.ENTITAETS_SERVICE_PACKAGE))
		} else if (ns.vorgangsService) {
			if (ns.vorgangsServiceNichtElementar) {
				importNs.add(baseNamespace.append(Namespace.VORGANGS_SERVICE_PACKAGE))
			} else {
				importNs.add(baseNamespace.append(Namespace.ENTITAETS_SERVICE_PACKAGE))
			}
		}
	}
	
	/**
	 * generiert Interfaces aus einem Modul
	 */
	def genInterfaces(List<BusinessInterface> interfaces, EJBModule module, List<EJBModule> moduleList) {
		for (i : interfaces) {
			view.addStatusText("    " + i.name)
			
			var List<Namespace> importNs = namespaceManager.getEntitaetNamespaces(i.methoden).toList
			var ns = baseNamespace.append(i.package)
			var BusinessInterfaceTemplate iface = new BusinessInterfaceTemplate()
			iface.setInterface(i)
			iface.setFileName(i.name, 'java')
			iface.setImportNs(importNs)
			iface.setModule(module)
			iface.setNamespace(ns)
			
			fileGenerator.add(iface)
			
			// Kopiere Interface zum Zugriff in alle Vorgangs-Services
			if (ns.vorgangsServiceNichtElementar || ns.entitaetsService) {
				for (vorgangsServiceModule : moduleList) {
					if (vorgangsServiceModule.entities.size == 0) {
						var interfaceForOtherModule = new BusinessInterfaceTemplate(iface)
						interfaceForOtherModule.setModule(vorgangsServiceModule)
						fileGenerator.add(interfaceForOtherModule)
					}
				}	
			}
		}
	}
}