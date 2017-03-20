package de.uniba.wiai.seda.somslmarked;

import com.google.common.collect.Iterators;
import com.google.inject.Injector;
import com.google.inject.Provider;
import de.uniba.wiai.seda.somsl.annotation.annotation.AnnotationFactory;
import de.uniba.wiai.seda.somsl.annotation.annotation.Merge;
import de.uniba.wiai.seda.somslmarked.SomSLMarkedStandaloneSetup;
import de.uniba.wiai.seda.somslmarked.somSLMarked.AwS;
import de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedFactory;
import de.uniba.wiai.seda.somslmarked.somSLMarked.VOS;
import de.uniba.wiai.seda.somslmarked.somSLMarked.VOT;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
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
public class Transformation {
  private AnnotationFactory annotationFactory = AnnotationFactory.eINSTANCE;
  
  private SomSLMarkedFactory somFactory = SomSLMarkedFactory.eINSTANCE;
  
  public static void main(final String[] args) {
    Transformation _transformation = new Transformation();
    Transformation t = _transformation;
    AwS m = t.getModel("\r\nAwS: test\r\nVOS {\r\n\tRezeption {\r\n\t\tVOT Res { }\r\n\t\tVOT Zimmerzuw { }\r\n\t\tVOT ResDir {\r\n\t\t\tKunde KundeA; \r\n\t\t\tDT String x; \r\n\t\t\tReserviere(Kunde Zimmer) {\r\n\t\t\t\tKunde.test\r\n\t\t\t\twhile (Kunde.istGast) {\r\n\t\t\t\t\tif (Kunde.willFreischaltung) {\r\n\t\t\t\t\t\tKundeFreischalten\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t}\r\n\t\tRes -> Zimmerzuw\r\n\t\t@merge xyz\r\n\t\tRes -> ResDir \r\n\t}\r\n}\r\nKOS {\r\n\tOOT Zimmer { }\r\n\tOOT Kunde {  }\r\n\tOOT Rechnung {  }\r\n\tOOT RechPos {  }\r\n\tis_part_of: Rechnung (1,*) RechPos\r\n}\r\n");
    t.addAnnotation(m);
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
  
  public void addAnnotation(final AwS aws) {
    VOS _vos = aws.getVos();
    TreeIterator<EObject> _eAllContents = _vos.eAllContents();
    final Iterator<VOS> vosIterator = Iterators.<VOS>filter(_eAllContents, VOS.class);
    boolean _hasNext = vosIterator.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      {
        final VOS vosGliederung = vosIterator.next();
        final EList<VOT> VOTs = vosGliederung.getObjekttypen();
        for (final VOT vot : VOTs) {
          {
            Merge merge = this.annotationFactory.createMerge();
            String _name = vosGliederung.getName();
            merge.setName(_name);
            vot.setAnnotation(merge);
          }
        }
      }
      boolean _hasNext_1 = vosIterator.hasNext();
      _while = _hasNext_1;
    }
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
