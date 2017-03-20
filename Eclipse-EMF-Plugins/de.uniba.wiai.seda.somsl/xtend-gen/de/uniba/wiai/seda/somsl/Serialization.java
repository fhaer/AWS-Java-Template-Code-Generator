package de.uniba.wiai.seda.somsl;

import com.google.inject.Injector;
import com.google.inject.Provider;
import de.uniba.wiai.seda.somsl.SomSLStandaloneSetup;
import de.uniba.wiai.seda.somsl.somSL.Metamodell;
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
    Metamodell m = t.getModel("\r\nVOT Res { }\r\nVOT Zimmerzuw { }\r\n// kommentar\r\n@map Tes\r\nOOT Zimmer { }\r\n@map Test\r\nOOT Rechnung { }\r\nOOT Kunde { }\r\nOOT RechPos { }\r\nVOT ResDir { Kunde KundeA; DT String x; Reserviere(Kunde Zimmer) { KundeFreischalten } }\r\nRes -> Zimmerzuw\r\nRes -> ResDir\r\nis_part_of: Rechnung (1,*) RechPos\r\nResDir -> Kunde\r\nOOT Fahrzeug { }\r\nOOT Auto { }\r\nis_a: Fahrzeug == Auto\r\nResDir -> Kunde\r\n@map s\r\nis_part_of: Rechnung (1,*) RechPos\r\nis_part_of: Rechnung (1,*) RechPos\r\n");
    t.serializeModel(m);
  }
  
  public void serializeModel(final Metamodell m) {
    SomSLStandaloneSetup _somSLStandaloneSetup = new SomSLStandaloneSetup();
    Injector injector = _somSLStandaloneSetup.createInjectorAndDoEMFRegistration();
    Provider<Serializer> _provider = injector.<Serializer>getProvider(Serializer.class);
    Serializer serializer = _provider.get();
    String _serialize = serializer.serialize(m);
    System.out.println(_serialize);
  }
  
  public void printModel(final Metamodell m) {
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
  
  public Metamodell getModel(final String content) {
    try {
      SomSLStandaloneSetup _somSLStandaloneSetup = new SomSLStandaloneSetup();
      Injector injector = _somSLStandaloneSetup.createInjectorAndDoEMFRegistration();
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
      Metamodell model = ((Metamodell) _get);
      return model;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
