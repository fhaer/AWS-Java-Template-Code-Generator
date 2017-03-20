package de.uniba.wiai.seda.somslmarked;

import com.google.inject.Injector;
import com.google.inject.Provider;
import de.uniba.wiai.seda.somslmarked.SomSLMarkedStandaloneSetup;
import de.uniba.wiai.seda.somslmarked.somSLMarked.AwS;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class Serialization {
  public static void main(final String[] args) {
    Serialization _serialization = new Serialization();
    Serialization t = _serialization;
    AwS m = t.getModel("\r\nSOA-AwS: myname v vers\r\n");
    t.serializeModel(m);
  }
  
  public void serializeModel(final AwS m) {
    SomSLMarkedStandaloneSetup _somSLMarkedStandaloneSetup = new SomSLMarkedStandaloneSetup();
    Injector injector = _somSLMarkedStandaloneSetup.createInjectorAndDoEMFRegistration();
    Provider<Serializer> _provider = injector.<Serializer>getProvider(Serializer.class);
    Serializer serializer = _provider.get();
    String _serialize = serializer.serialize(m);
    System.out.println(_serialize);
  }
  
  public void printModel(final AwS m) {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      ResourceSet resourceSet = _resourceSetImpl;
      final URI ecoreUri = URI.createFileURI("src-gen/de/uniba/wiai/seda/somslmarked/SomSLMarked.ecore");
      Resource ddlRes = resourceSet.createResource(ecoreUri);
      Map<Object,Object> _emptyMap = Collections.<Object, Object>emptyMap();
      ddlRes.load(_emptyMap);
      URI _createFileURI = URI.createFileURI("output.ecore");
      Resource outputRes = resourceSet.createResource(_createFileURI);
      EList<EObject> _contents = outputRes.getContents();
      _contents.add(m);
      Map<Object,Object> _emptyMap_1 = Collections.<Object, Object>emptyMap();
      outputRes.save(System.out, _emptyMap_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public AwS getModel(final String content) {
    try {
      SomSLMarkedStandaloneSetup _somSLMarkedStandaloneSetup = new SomSLMarkedStandaloneSetup();
      Injector injector = _somSLMarkedStandaloneSetup.createInjectorAndDoEMFRegistration();
      Provider<XtextResourceSet> _provider = injector.<XtextResourceSet>getProvider(XtextResourceSet.class);
      XtextResourceSet resourceSet = _provider.get();
      resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      URI _createURI = URI.createURI("file.somsl");
      Resource resource = resourceSet.createResource(_createURI);
      byte[] _bytes = content.getBytes();
      ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
      InputStream in = _byteArrayInputStream;
      Map<Object,Object> _loadOptions = resourceSet.getLoadOptions();
      resource.load(in, _loadOptions);
      EList<EObject> _contents = resource.getContents();
      EObject _get = _contents.get(0);
      AwS model = ((AwS) _get);
      return model;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
