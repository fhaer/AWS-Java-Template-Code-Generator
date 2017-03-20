package de.uniba.wiai.seda.somslmarked.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uniba.wiai.seda.somsl.annotation.annotation.AnnotationPackage;
import de.uniba.wiai.seda.somsl.annotation.annotation.Ignore;
import de.uniba.wiai.seda.somsl.annotation.annotation.Merge;
import de.uniba.wiai.seda.somsl.annotation.annotation.Name;
import de.uniba.wiai.seda.somsl.annotation.serializer.AnnotationSemanticSequencer;
import de.uniba.wiai.seda.somslmarked.services.SomSLMarkedGrammarAccess;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Anweisung;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Attribut;
import de.uniba.wiai.seda.somslmarked.somSLMarked.AwS;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Interacts_with;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Is_a;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Is_part_of;
import de.uniba.wiai.seda.somslmarked.somSLMarked.KOS;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet01;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet0x;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet11;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Kardinalitaet1x;
import de.uniba.wiai.seda.somslmarked.somSLMarked.LOT;
import de.uniba.wiai.seda.somslmarked.somSLMarked.OOT;
import de.uniba.wiai.seda.somslmarked.somSLMarked.Operator;
import de.uniba.wiai.seda.somslmarked.somSLMarked.SomSLMarkedPackage;
import de.uniba.wiai.seda.somslmarked.somSLMarked.TOT;
import de.uniba.wiai.seda.somslmarked.somSLMarked.VOS;
import de.uniba.wiai.seda.somslmarked.somSLMarked.VOT;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class SomSLMarkedSemanticSequencer extends AnnotationSemanticSequencer {

	@Inject
	private SomSLMarkedGrammarAccess grammarAccess;
	
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
		else if(semanticObject.eClass().getEPackage() == SomSLMarkedPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SomSLMarkedPackage.ANWEISUNG:
				if(context == grammarAccess.getAnweisungRule()) {
					sequence_Anweisung(context, (Anweisung) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.ATTRIBUT:
				if(context == grammarAccess.getAttributRule()) {
					sequence_Attribut(context, (Attribut) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.AW_S:
				if(context == grammarAccess.getAwSRule()) {
					sequence_AwS(context, (AwS) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.INTERACTS_WITH:
				if(context == grammarAccess.getBeziehungRule() ||
				   context == grammarAccess.getInteracts_withRule()) {
					sequence_Interacts_with(context, (Interacts_with) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.IS_A:
				if(context == grammarAccess.getBeziehungRule() ||
				   context == grammarAccess.getIs_aRule()) {
					sequence_Is_a(context, (Is_a) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.IS_PART_OF:
				if(context == grammarAccess.getBeziehungRule() ||
				   context == grammarAccess.getIs_part_ofRule()) {
					sequence_Is_part_of(context, (Is_part_of) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.KOS:
				if(context == grammarAccess.getKOSRule() ||
				   context == grammarAccess.getSchemaRule()) {
					sequence_KOS(context, (KOS) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.KARDINALITAET01:
				if(context == grammarAccess.getKardinalitaetRule() ||
				   context == grammarAccess.getKardinalitaet01Rule()) {
					sequence_Kardinalitaet01(context, (Kardinalitaet01) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.KARDINALITAET0X:
				if(context == grammarAccess.getKardinalitaetRule() ||
				   context == grammarAccess.getKardinalitaet0xRule()) {
					sequence_Kardinalitaet0x(context, (Kardinalitaet0x) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.KARDINALITAET11:
				if(context == grammarAccess.getKardinalitaetRule() ||
				   context == grammarAccess.getKardinalitaet11Rule()) {
					sequence_Kardinalitaet11(context, (Kardinalitaet11) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.KARDINALITAET1X:
				if(context == grammarAccess.getKardinalitaetRule() ||
				   context == grammarAccess.getKardinalitaet1xRule()) {
					sequence_Kardinalitaet1x(context, (Kardinalitaet1x) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.LOT:
				if(context == grammarAccess.getKOTRule() ||
				   context == grammarAccess.getLOTRule() ||
				   context == grammarAccess.getObjekttypRule()) {
					sequence_LOT(context, (LOT) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.OOT:
				if(context == grammarAccess.getKOTRule() ||
				   context == grammarAccess.getOOTRule() ||
				   context == grammarAccess.getObjekttypRule()) {
					sequence_OOT(context, (OOT) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.OPERATOR:
				if(context == grammarAccess.getOperatorRule()) {
					sequence_Operator(context, (Operator) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.TOT:
				if(context == grammarAccess.getKOTRule() ||
				   context == grammarAccess.getObjekttypRule() ||
				   context == grammarAccess.getTOTRule()) {
					sequence_TOT(context, (TOT) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.VOS:
				if(context == grammarAccess.getSchemaRule() ||
				   context == grammarAccess.getVOSRule()) {
					sequence_VOS(context, (VOS) semanticObject); 
					return; 
				}
				else break;
			case SomSLMarkedPackage.VOT:
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
	 *     ((kontrollstruktur=ID bedingung=Anweisung bedigteAnweisungen+=Anweisung*) | (objekt=[Objekttyp|ID]? operator=ID))
	 */
	protected void sequence_Anweisung(EObject context, Anweisung semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((objekttyp=[Objekttyp|ID] | datentyp=ID) name=ID)
	 */
	protected void sequence_Attribut(EObject context, Attribut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID version=VERSION? kos=KOS vos=VOS)
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
	 *     ((name='KOS' | name=ID) (objekttypen+=KOT | beziehungen+=Beziehung | gliederung+=KOS)*)
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
	 *     (annotation=Annotation? name=ID attribute+=Attribut* operatoren+=Operator*)
	 */
	protected void sequence_LOT(EObject context, LOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation=Annotation? name=ID attribute+=Attribut* operatoren+=Operator*)
	 */
	protected void sequence_OOT(EObject context, OOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parameter+=[Objekttyp|ID]* anweisungen+=Anweisung*)
	 */
	protected void sequence_Operator(EObject context, Operator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation=Annotation? name=ID attribute+=Attribut* operatoren+=Operator*)
	 */
	protected void sequence_TOT(EObject context, TOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name='VOS' | name=ID) (objekttypen+=VOT | beziehungen+=Interacts_with | gliederung+=VOS)*)
	 */
	protected void sequence_VOS(EObject context, VOS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation=Annotation? name=ID attribute+=Attribut* operatoren+=Operator*)
	 */
	protected void sequence_VOT(EObject context, VOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
