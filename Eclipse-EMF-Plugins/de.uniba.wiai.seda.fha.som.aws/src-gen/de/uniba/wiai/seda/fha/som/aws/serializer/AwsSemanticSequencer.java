package de.uniba.wiai.seda.fha.som.aws.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uniba.wiai.seda.fha.annotation.annotation.AnnotationPackage;
import de.uniba.wiai.seda.fha.annotation.annotation.Ignore;
import de.uniba.wiai.seda.fha.annotation.annotation.Merge;
import de.uniba.wiai.seda.fha.annotation.annotation.Name;
import de.uniba.wiai.seda.fha.annotation.annotation.Version;
import de.uniba.wiai.seda.fha.annotation.serializer.AnnotationSemanticSequencer;
import de.uniba.wiai.seda.fha.som.aws.aws.Attribut;
import de.uniba.wiai.seda.fha.som.aws.aws.AwS;
import de.uniba.wiai.seda.fha.som.aws.aws.AwsPackage;
import de.uniba.wiai.seda.fha.som.aws.aws.Interacts_with;
import de.uniba.wiai.seda.fha.som.aws.aws.Is_a;
import de.uniba.wiai.seda.fha.som.aws.aws.Is_part_of;
import de.uniba.wiai.seda.fha.som.aws.aws.KOS;
import de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet01;
import de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet0x;
import de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet11;
import de.uniba.wiai.seda.fha.som.aws.aws.Kardinalitaet1x;
import de.uniba.wiai.seda.fha.som.aws.aws.LOT;
import de.uniba.wiai.seda.fha.som.aws.aws.OOT;
import de.uniba.wiai.seda.fha.som.aws.aws.Operator;
import de.uniba.wiai.seda.fha.som.aws.aws.TOT;
import de.uniba.wiai.seda.fha.som.aws.aws.VOS;
import de.uniba.wiai.seda.fha.som.aws.aws.VOT;
import de.uniba.wiai.seda.fha.som.aws.services.AwsGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class AwsSemanticSequencer extends AnnotationSemanticSequencer {

	@Inject
	private AwsGrammarAccess grammarAccess;
	
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
			case AnnotationPackage.VERSION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getVersionRule()) {
					sequence_Version(context, (Version) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == AwsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AwsPackage.ATTRIBUT:
				if(context == grammarAccess.getAttributRule()) {
					sequence_Attribut(context, (Attribut) semanticObject); 
					return; 
				}
				else break;
			case AwsPackage.AW_S:
				if(context == grammarAccess.getAwSRule()) {
					sequence_AwS(context, (AwS) semanticObject); 
					return; 
				}
				else break;
			case AwsPackage.INTERACTS_WITH:
				if(context == grammarAccess.getBeziehungRule() ||
				   context == grammarAccess.getInteracts_withRule()) {
					sequence_Interacts_with(context, (Interacts_with) semanticObject); 
					return; 
				}
				else break;
			case AwsPackage.IS_A:
				if(context == grammarAccess.getBeziehungRule() ||
				   context == grammarAccess.getIs_aRule()) {
					sequence_Is_a(context, (Is_a) semanticObject); 
					return; 
				}
				else break;
			case AwsPackage.IS_PART_OF:
				if(context == grammarAccess.getBeziehungRule() ||
				   context == grammarAccess.getIs_part_ofRule()) {
					sequence_Is_part_of(context, (Is_part_of) semanticObject); 
					return; 
				}
				else break;
			case AwsPackage.KOS:
				if(context == grammarAccess.getKOSRule() ||
				   context == grammarAccess.getSchemaRule()) {
					sequence_KOS(context, (KOS) semanticObject); 
					return; 
				}
				else break;
			case AwsPackage.KARDINALITAET01:
				if(context == grammarAccess.getKardinalitaetRule() ||
				   context == grammarAccess.getKardinalitaet01Rule()) {
					sequence_Kardinalitaet01(context, (Kardinalitaet01) semanticObject); 
					return; 
				}
				else break;
			case AwsPackage.KARDINALITAET0X:
				if(context == grammarAccess.getKardinalitaetRule() ||
				   context == grammarAccess.getKardinalitaet0xRule()) {
					sequence_Kardinalitaet0x(context, (Kardinalitaet0x) semanticObject); 
					return; 
				}
				else break;
			case AwsPackage.KARDINALITAET11:
				if(context == grammarAccess.getKardinalitaetRule() ||
				   context == grammarAccess.getKardinalitaet11Rule()) {
					sequence_Kardinalitaet11(context, (Kardinalitaet11) semanticObject); 
					return; 
				}
				else break;
			case AwsPackage.KARDINALITAET1X:
				if(context == grammarAccess.getKardinalitaetRule() ||
				   context == grammarAccess.getKardinalitaet1xRule()) {
					sequence_Kardinalitaet1x(context, (Kardinalitaet1x) semanticObject); 
					return; 
				}
				else break;
			case AwsPackage.LOT:
				if(context == grammarAccess.getKOTRule() ||
				   context == grammarAccess.getLOTRule() ||
				   context == grammarAccess.getObjekttypRule()) {
					sequence_LOT(context, (LOT) semanticObject); 
					return; 
				}
				else break;
			case AwsPackage.OOT:
				if(context == grammarAccess.getKOTRule() ||
				   context == grammarAccess.getOOTRule() ||
				   context == grammarAccess.getObjekttypRule()) {
					sequence_OOT(context, (OOT) semanticObject); 
					return; 
				}
				else break;
			case AwsPackage.OPERATOR:
				if(context == grammarAccess.getOperatorRule()) {
					sequence_Operator(context, (Operator) semanticObject); 
					return; 
				}
				else break;
			case AwsPackage.TOT:
				if(context == grammarAccess.getKOTRule() ||
				   context == grammarAccess.getObjekttypRule() ||
				   context == grammarAccess.getTOTRule()) {
					sequence_TOT(context, (TOT) semanticObject); 
					return; 
				}
				else break;
			case AwsPackage.VOS:
				if(context == grammarAccess.getSchemaRule() ||
				   context == grammarAccess.getVOSRule()) {
					sequence_VOS(context, (VOS) semanticObject); 
					return; 
				}
				else break;
			case AwsPackage.VOT:
				if(context == grammarAccess.getObjekttypRule() ||
				   context == grammarAccess.getVOTRule()) {
					sequence_VOT(context, (VOT) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (typ=[Objekttyp|ID]? name=ID)
	 */
	protected void sequence_Attribut(EObject context, Attribut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID version=VERSION_NUMBER? kos=KOS vos=VOS)
	 */
	protected void sequence_AwS(EObject context, AwS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotation=Annotation? 
	 *         objekttyp1=[Objekttyp|ID] 
	 *         (kardinalitaet=Kardinalitaet01 | kardinalitaet=Kardinalitaet0x | kardinalitaet=Kardinalitaet1x) 
	 *         objekttyp2=[Objekttyp|ID]
	 *     )
	 */
	protected void sequence_Interacts_with(EObject context, Interacts_with semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation=Annotation? objekttyp1=[Objekttyp|ID] (kardinalitaet=Kardinalitaet01 | kardinalitaet=Kardinalitaet11) objekttyp2=[Objekttyp|ID])
	 */
	protected void sequence_Is_a(EObject context, Is_a semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotation=Annotation? 
	 *         objekttyp1=[Objekttyp|ID] 
	 *         (kardinalitaet=Kardinalitaet01 | kardinalitaet=Kardinalitaet0x | kardinalitaet=Kardinalitaet1x) 
	 *         objekttyp2=[Objekttyp|ID]
	 *     )
	 */
	protected void sequence_Is_part_of(EObject context, Is_part_of semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name='KOS' | name=ID) (objekttypen+=KOT | beziehungen+=Beziehung | gliederung+=KOS)+)
	 */
	protected void sequence_KOS(EObject context, KOS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Kardinalitaet01}
	 */
	protected void sequence_Kardinalitaet01(EObject context, Kardinalitaet01 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Kardinalitaet0x}
	 */
	protected void sequence_Kardinalitaet0x(EObject context, Kardinalitaet0x semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Kardinalitaet11}
	 */
	protected void sequence_Kardinalitaet11(EObject context, Kardinalitaet11 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Kardinalitaet1x}
	 */
	protected void sequence_Kardinalitaet1x(EObject context, Kardinalitaet1x semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation=Annotation? name=ID (attribute+=Attribut | operatoren+=Operator)*)
	 */
	protected void sequence_LOT(EObject context, LOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation=Annotation? name=ID (attribute+=Attribut | operatoren+=Operator)*)
	 */
	protected void sequence_OOT(EObject context, OOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parameter+=[Objekttyp|ID]*)
	 */
	protected void sequence_Operator(EObject context, Operator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation=Annotation? name=ID (attribute+=Attribut | operatoren+=Operator)*)
	 */
	protected void sequence_TOT(EObject context, TOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name='VOS' | name=ID) (objekttypen+=VOT | beziehungen+=Interacts_with | gliederung+=VOS)+)
	 */
	protected void sequence_VOS(EObject context, VOS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation=Annotation? name=ID (attribute+=Attribut | operatoren+=Operator)*)
	 */
	protected void sequence_VOT(EObject context, VOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
