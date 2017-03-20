package de.uniba.wiai.seda.fha.swarchitektur.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uniba.wiai.seda.fha.swarchitektur.services.SwarchitekturGrammarAccess;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Architektur;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Attribut;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Aufruf;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.BusinessInterface;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.JPAEntity;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.MessageDrivenBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methode;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Methodensignatur;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SingletonSessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatefulSessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.StatelessSessionBean;
import de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.SwarchitekturPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SwarchitekturSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SwarchitekturGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SwarchitekturPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SwarchitekturPackage.ARCHITEKTUR:
				if(context == grammarAccess.getArchitekturRule()) {
					sequence_Architektur(context, (Architektur) semanticObject); 
					return; 
				}
				else break;
			case SwarchitekturPackage.ATTRIBUT:
				if(context == grammarAccess.getAttributRule()) {
					sequence_Attribut(context, (Attribut) semanticObject); 
					return; 
				}
				else break;
			case SwarchitekturPackage.AUFRUF:
				if(context == grammarAccess.getAufrufRule()) {
					sequence_Aufruf(context, (Aufruf) semanticObject); 
					return; 
				}
				else break;
			case SwarchitekturPackage.BUSINESS_INTERFACE:
				if(context == grammarAccess.getBusinessInterfaceRule() ||
				   context == grammarAccess.getEJBRule()) {
					sequence_BusinessInterface(context, (BusinessInterface) semanticObject); 
					return; 
				}
				else break;
			case SwarchitekturPackage.JPA_ENTITY:
				if(context == grammarAccess.getJPAEntityRule()) {
					sequence_JPAEntity(context, (JPAEntity) semanticObject); 
					return; 
				}
				else break;
			case SwarchitekturPackage.MESSAGE_DRIVEN_BEAN:
				if(context == grammarAccess.getEJBRule() ||
				   context == grammarAccess.getMessageDrivenBeanRule()) {
					sequence_MessageDrivenBean(context, (MessageDrivenBean) semanticObject); 
					return; 
				}
				else break;
			case SwarchitekturPackage.METHODE:
				if(context == grammarAccess.getMethodeRule()) {
					sequence_Methode(context, (Methode) semanticObject); 
					return; 
				}
				else break;
			case SwarchitekturPackage.METHODENSIGNATUR:
				if(context == grammarAccess.getMethodensignaturRule()) {
					sequence_Methodensignatur(context, (Methodensignatur) semanticObject); 
					return; 
				}
				else break;
			case SwarchitekturPackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package) semanticObject); 
					return; 
				}
				else break;
			case SwarchitekturPackage.SINGLETON_SESSION_BEAN:
				if(context == grammarAccess.getEJBRule() ||
				   context == grammarAccess.getSessionBeanRule() ||
				   context == grammarAccess.getSingletonSessionBeanRule()) {
					sequence_SingletonSessionBean(context, (SingletonSessionBean) semanticObject); 
					return; 
				}
				else break;
			case SwarchitekturPackage.STATEFUL_SESSION_BEAN:
				if(context == grammarAccess.getEJBRule() ||
				   context == grammarAccess.getSessionBeanRule() ||
				   context == grammarAccess.getStatefulSessionBeanRule()) {
					sequence_StatefulSessionBean(context, (StatefulSessionBean) semanticObject); 
					return; 
				}
				else break;
			case SwarchitekturPackage.STATELESS_SESSION_BEAN:
				if(context == grammarAccess.getEJBRule() ||
				   context == grammarAccess.getSessionBeanRule() ||
				   context == grammarAccess.getStatelessSessionBeanRule()) {
					sequence_StatelessSessionBean(context, (StatelessSessionBean) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID version=ID? pakete+=Package*)
	 */
	protected void sequence_Architektur(EObject context, Architektur semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typ=ID name=ID)
	 */
	protected void sequence_Attribut(EObject context, Attribut semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SwarchitekturPackage.Literals.ATTRIBUT__TYP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SwarchitekturPackage.Literals.ATTRIBUT__TYP));
			if(transientValues.isValueTransient(semanticObject, SwarchitekturPackage.Literals.ATTRIBUT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SwarchitekturPackage.Literals.ATTRIBUT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributAccess().getTypIDTerminalRuleCall_0_0(), semanticObject.getTyp());
		feeder.accept(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (objekt=ID? methode=Methodensignatur)
	 */
	protected void sequence_Aufruf(EObject context, Aufruf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID methoden+=Methodensignatur*)
	 */
	protected void sequence_BusinessInterface(EObject context, BusinessInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attribute+=Attribut* methode+=Methode*)
	 */
	protected void sequence_JPAEntity(EObject context, JPAEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_MessageDrivenBean(EObject context, MessageDrivenBean semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SwarchitekturPackage.Literals.EJB__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SwarchitekturPackage.Literals.EJB__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMessageDrivenBeanAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID aufruf+=Aufruf*)
	 */
	protected void sequence_Methode(EObject context, Methode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Methodensignatur(EObject context, Methodensignatur semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SwarchitekturPackage.Literals.METHODENSIGNATUR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SwarchitekturPackage.Literals.METHODENSIGNATUR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMethodensignaturAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (komponenten+=EJB | entities+=JPAEntity | pakete+=Package)+)
	 */
	protected void sequence_Package(EObject context, de.uniba.wiai.seda.fha.swarchitektur.swarchitektur.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_SingletonSessionBean(EObject context, SingletonSessionBean semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SwarchitekturPackage.Literals.EJB__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SwarchitekturPackage.Literals.EJB__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingletonSessionBeanAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attribute+=Attribut* methode+=Methode*)
	 */
	protected void sequence_StatefulSessionBean(EObject context, StatefulSessionBean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID methode+=Methode*)
	 */
	protected void sequence_StatelessSessionBean(EObject context, StatelessSessionBean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
