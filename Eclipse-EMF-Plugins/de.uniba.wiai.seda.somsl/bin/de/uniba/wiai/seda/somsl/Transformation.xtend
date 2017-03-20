package de.uniba.wiai.seda.somsl

import org.eclipse.emf.ecore.resource.Resource
import com.google.inject.Injector
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.emf.common.util.URI
import java.io.InputStream
import java.io.ByteArrayInputStream
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.ResourceSet
import java.util.Collections
import de.uniba.wiai.seda.somsl.somSL.Metamodell

class Transformation {

	def static void main(String[] args) {
		var Transformation t = new Transformation()
		var Metamodell m = t.getModel("
VOT Res {}
VOT Zimmerzuw {}
OOT Kunde {  }
@map asd
OOT Zimmer { }
VOT ResDir { 
	Kunde KundeA; 
	DT String x; 
	Reserviere(Kunde Zimmer) {
		Kunde.test
		while (Kunde.istGast) {
			if (Kunde.willFreischaltung) {
				KundeFreischalten
			}
		}
	}
}
//VOS Rezeption { 
	Res -> Zimmerzuw
	Res -> ResDir 
	ResDir -> Kunde
	is_part_of: Rechnung (1,*) RechPos
//}

")
		t.printModel(m)
	}
	
	def printModel(Metamodell m) {
	   var ResourceSet resourceSet = new ResourceSetImpl();
       val URI ecoreUri = URI.createFileURI("src-gen/de/uniba/wiai/seda/somsl/SomSL.ecore");
       var Resource ddlRes = resourceSet.createResource(ecoreUri);
       ddlRes.load(Collections.emptyMap());
       // of course, in production code we would fail here if there were no
       // contents or they weren't of type EPackage.
       //val EPackage ddlPackage = ddlRes.getContents().get(0) as EPackage;
       // now create a new resource to serialize the ecore model
       var Resource outputRes = resourceSet.createResource(URI.createFileURI("output.ecore"));
       // add our new package to resource contents
       outputRes.getContents().add(m);
       // and at last, we save to standard out.  Remove the first argument to save to file specified in pathToOutputFile
       outputRes.save(System.out, Collections.emptyMap());
	}

	def Metamodell getModel(String content) {
		var Injector injector = new SomSLStandaloneSetup().createInjectorAndDoEMFRegistration()
		var XtextResourceSet resourceSet = injector.getProvider(typeof(XtextResourceSet)).get
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE)
        var Resource resource = resourceSet.createResource(URI.createURI("file.somsl"))
        var InputStream in = new ByteArrayInputStream(content.getBytes())
        resource.load(in, resourceSet.getLoadOptions())
        var Metamodell model = resource.getContents().get(0) as Metamodell
        return model
	}


}
