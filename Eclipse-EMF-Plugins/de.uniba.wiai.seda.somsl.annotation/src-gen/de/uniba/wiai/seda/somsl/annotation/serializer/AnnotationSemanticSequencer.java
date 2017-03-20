package de.uniba.wiai.seda.somsl.annotation.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uniba.wiai.seda.somsl.annotation.annotation.AnnotationPackage;
import de.uniba.wiai.seda.somsl.annotation.annotation.Ignore;
import de.uniba.wiai.seda.somsl.annotation.annotation.Merge;
import de.uniba.wiai.seda.somsl.annotation.annotation.Name;
import de.uniba.wiai.seda.somsl.annotation.services.AnnotationGrammarAccess;
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
public class AnnotationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AnnotationGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AnnotationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AnnotationPackage.IGNORE:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getIgnoreRule()) {
					sequence_Ignore(context, (Ignore) semanticObject); 
					return; 
				}
				else break;
			case AnnotationPackage.MERGE:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getMergeRule()) {
					sequence_Merge(context, (Merge) semanticObject); 
					return; 
				}
				else break;
			case AnnotationPackage.NAME:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getNameRule()) {
					sequence_Name(context, (Name) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     {Ignore}
	 */
	protected void sequence_Ignore(EObject context, Ignore semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Merge(EObject context, Merge semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AnnotationPackage.Literals.MERGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnotationPackage.Literals.MERGE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMergeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Name(EObject context, Name semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AnnotationPackage.Literals.NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnotationPackage.Literals.NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
