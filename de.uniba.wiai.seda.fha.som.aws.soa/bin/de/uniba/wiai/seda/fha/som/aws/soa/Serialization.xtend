package de.uniba.wiai.seda.fha.som.aws.soa

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
import com.google.inject.Guice
import org.eclipse.xtext.serializer.impl.Serializer
import de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS

class Serialization {

	def static void main(String[] args) {
		var Serialization t = new Serialization()
		var SOA_AwS m = t.getModel("SOA-AwS: myname")
		//t.printModel(m)
		t.serializeModel(m)
	}
	
	def serializeModel(SOA_AwS m) {
		var Injector injector = new SoaStandaloneSetup().createInjectorAndDoEMFRegistration()
		//var Injector injector = Guice.createInjector(new SomSLMarkedRuntimeModule());  
		var Serializer serializer = injector.getProvider(typeof(Serializer)).get
		System.out.println(serializer.serialize(m))
	}
	
	def printModel(SOA_AwS m) {
	   var ResourceSet resourceSet = new ResourceSetImpl();
       val URI ecoreUri = URI.createFileURI("src-gen/de/uniba/wiai/seda/fha/som/aws/soa/Soa.ecore");
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

	def SOA_AwS getModel(String content) {
		var Injector injector = new SoaStandaloneSetup().createInjectorAndDoEMFRegistration()
		var XtextResourceSet resourceSet = injector.getProvider(typeof(XtextResourceSet)).get
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE)
        var Resource resource = resourceSet.createResource(URI.createURI("file.soaaws"))
        var InputStream in = new ByteArrayInputStream(content.getBytes())
        resource.load(in, resourceSet.getLoadOptions())
        var SOA_AwS model = resource.getContents().get(0) as SOA_AwS
        return model
	}


}
