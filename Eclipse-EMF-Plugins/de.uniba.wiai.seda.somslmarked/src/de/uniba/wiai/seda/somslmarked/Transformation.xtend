package de.uniba.wiai.seda.somslmarked

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
import de.uniba.wiai.seda.somslmarked.somSLMarked.AwS
import de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedFactory
import de.uniba.wiai.seda.somsl.annotation.annotation.Annotation
import de.uniba.wiai.seda.somsl.annotation.annotation.AnnotationFactory
import de.uniba.wiai.seda.somsl.annotation.annotation.Name
import org.eclipse.xtext.serializer.impl.Serializer
import de.uniba.wiai.seda.somslmarked.somSLMarked.Objekttyp
import de.uniba.wiai.seda.somslmarked.somSLMarked.Beziehung
import de.uniba.wiai.seda.somslmarked.somSLMarked.VOS
import de.uniba.wiai.seda.somsl.annotation.annotation.Merge

class Transformation {
	
	AnnotationFactory annotationFactory = AnnotationFactory::eINSTANCE
	SomSLMarkedFactory somFactory = SomSLMarkedFactory::eINSTANCE

	def static void main(String[] args) {
		var Transformation t = new Transformation()
		var AwS m = t.getModel("
AwS: test
VOS {
	Rezeption {
		VOT Res { }
		VOT Zimmerzuw { }
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
		Res -> Zimmerzuw
		@merge xyz
		Res -> ResDir 
	}
}
KOS {
	OOT Zimmer { }
	OOT Kunde {  }
	OOT Rechnung {  }
	OOT RechPos {  }
	is_part_of: Rechnung (1,*) RechPos
}
")
		t.addAnnotation(m)
		t.serializeModel(m)
		//t.printModel(m)
	}
	
	def serializeModel(AwS m) {
		var Injector injector = new SomSLMarkedStandaloneSetup().createInjectorAndDoEMFRegistration()
		//var Injector injector = Guice.createInjector(new SomSLMarkedRuntimeModule());  
		var Serializer serializer = injector.getProvider(typeof(Serializer)).get
		System.out.println(serializer.serialize(m))
	}
	
	def addAnnotation(AwS aws) {
		val vosIterator = aws.vos.eAllContents.filter(VOS);
		while (vosIterator.hasNext) {
			val vosGliederung = vosIterator.next
			val VOTs = vosGliederung.objekttypen;
			for (vot : VOTs) {
				var Merge merge = annotationFactory.createMerge
				merge.name = vosGliederung.name 
				vot.annotation = merge
			}
		}
	}

	def printModel(AwS m) {
	   var ResourceSet resourceSet = new ResourceSetImpl();
       val URI ecoreUri = URI.createFileURI("src-gen/de/uniba/wiai/seda/somslmarked/SomSLMarked.ecore");
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

	def AwS getModel(String content) {
		var Injector injector = new SomSLMarkedStandaloneSetup().createInjectorAndDoEMFRegistration()
		var XtextResourceSet resourceSet = injector.getProvider(typeof(XtextResourceSet)).get
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE)
        var Resource resource = resourceSet.createResource(URI.createURI("file.somsl"))
        var InputStream in = new ByteArrayInputStream(content.getBytes())
        resource.load(in, resourceSet.getLoadOptions())
        var AwS model = resource.getContents().get(0) as AwS
        return model
	}


}
