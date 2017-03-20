package de.uniba.wiai.seda.somsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uniba.wiai.seda.somsl.services.SomSLGrammarAccess;
import de.uniba.wiai.seda.somsl.somSL.Anweisung;
import de.uniba.wiai.seda.somsl.somSL.Attribut;
import de.uniba.wiai.seda.somsl.somSL.Interacts_with;
import de.uniba.wiai.seda.somsl.somSL.Is_a;
import de.uniba.wiai.seda.somsl.somSL.Is_part_of;
import de.uniba.wiai.seda.somsl.somSL.Kardinalitaet01;
import de.uniba.wiai.seda.somsl.somSL.Kardinalitaet0x;
import de.uniba.wiai.seda.somsl.somSL.Kardinalitaet11;
import de.uniba.wiai.seda.somsl.somSL.Kardinalitaet1x;
import de.uniba.wiai.seda.somsl.somSL.LOT;
import de.uniba.wiai.seda.somsl.somSL.Metamodell;
import de.uniba.wiai.seda.somsl.somSL.OOT;
import de.uniba.wiai.seda.somsl.somSL.Operator;
import de.uniba.wiai.seda.somsl.somSL.SomSLPackage;
import de.uniba.wiai.seda.somsl.somSL.TOT;
import de.uniba.wiai.seda.somsl.somSL.VOT;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class SomSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SomSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SomSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SomSLPackage.ANWEISUNG:
				if(context == grammarAccess.getAnweisungRule()) {
					sequence_Anweisung(context, (Anweisung) semanticObject); 
					return; 
				}
				else break;
			case SomSLPackage.ATTRIBUT:
				if(context == grammarAccess.getAttributRule()) {
					sequence_Attribut(context, (Attribut) semanticObject); 
					return; 
				}
				else break;
			case SomSLPackage.INTERACTS_WITH:
				if(context == grammarAccess.getBeziehungRule() ||
				   context == grammarAccess.getInteracts_withRule()) {
					sequence_Interacts_with(context, (Interacts_with) semanticObject); 
					return; 
				}
				else break;
			case SomSLPackage.IS_A:
				if(context == grammarAccess.getBeziehungRule() ||
				   context == grammarAccess.getIs_aRule()) {
					sequence_Is_a(context, (Is_a) semanticObject); 
					return; 
				}
				else break;
			case SomSLPackage.IS_PART_OF:
				if(context == grammarAccess.getBeziehungRule() ||
				   context == grammarAccess.getIs_part_ofRule()) {
					sequence_Is_part_of(context, (Is_part_of) semanticObject); 
					return; 
				}
				else break;
			case SomSLPackage.KARDINALITAET01:
				if(context == grammarAccess.getKardinalitaetRule() ||
				   context == grammarAccess.getKardinalitaet01Rule()) {
					sequence_Kardinalitaet01(context, (Kardinalitaet01) semanticObject); 
					return; 
				}
				else break;
			case SomSLPackage.KARDINALITAET0X:
				if(context == grammarAccess.getKardinalitaetRule() ||
				   context == grammarAccess.getKardinalitaet0xRule()) {
					sequence_Kardinalitaet0x(context, (Kardinalitaet0x) semanticObject); 
					return; 
				}
				else break;
			case SomSLPackage.KARDINALITAET11:
				if(context == grammarAccess.getKardinalitaetRule() ||
				   context == grammarAccess.getKardinalitaet11Rule()) {
					sequence_Kardinalitaet11(context, (Kardinalitaet11) semanticObject); 
					return; 
				}
				else break;
			case SomSLPackage.KARDINALITAET1X:
				if(context == grammarAccess.getKardinalitaetRule() ||
				   context == grammarAccess.getKardinalitaet1xRule()) {
					sequence_Kardinalitaet1x(context, (Kardinalitaet1x) semanticObject); 
					return; 
				}
				else break;
			case SomSLPackage.LOT:
				if(context == grammarAccess.getKOTRule() ||
				   context == grammarAccess.getLOTRule()) {
					sequence_LOT(context, (LOT) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getObjekttypRule()) {
					sequence_Objekttyp(context, (LOT) semanticObject); 
					return; 
				}
				else break;
			case SomSLPackage.METAMODELL:
				if(context == grammarAccess.getMetamodellRule()) {
					sequence_Metamodell(context, (Metamodell) semanticObject); 
					return; 
				}
				else break;
			case SomSLPackage.OOT:
				if(context == grammarAccess.getKOTRule() ||
				   context == grammarAccess.getOOTRule()) {
					sequence_OOT(context, (OOT) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getObjekttypRule()) {
					sequence_Objekttyp(context, (OOT) semanticObject); 
					return; 
				}
				else break;
			case SomSLPackage.OPERATOR:
				if(context == grammarAccess.getOperatorRule()) {
					sequence_Operator(context, (Operator) semanticObject); 
					return; 
				}
				else break;
			case SomSLPackage.TOT:
				if(context == grammarAccess.getObjekttypRule()) {
					sequence_Objekttyp(context, (TOT) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getKOTRule() ||
				   context == grammarAccess.getTOTRule()) {
					sequence_TOT(context, (TOT) semanticObject); 
					return; 
				}
				else break;
			case SomSLPackage.VOT:
				if(context == grammarAccess.getObjekttypRule()) {
					sequence_Objekttyp(context, (VOT) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getVOTRule()) {
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
	 *     (
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
	 *     (objekttyp1=[Objekttyp|ID] (kardinalitaet=Kardinalitaet01 | kardinalitaet=Kardinalitaet11) objekttyp2=[Objekttyp|ID])
	 */
	protected void sequence_Is_a(EObject context, Is_a semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
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
	 *     {LOT}
	 */
	protected void sequence_LOT(EObject context, LOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID version=ID (objekttyp+=Objekttyp | beziehung+=Beziehung)*)
	 */
	protected void sequence_Metamodell(EObject context, Metamodell semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {OOT}
	 */
	protected void sequence_OOT(EObject context, OOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attribute+=Attribut* operatoren+=Operator*)
	 */
	protected void sequence_Objekttyp(EObject context, LOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attribute+=Attribut* operatoren+=Operator*)
	 */
	protected void sequence_Objekttyp(EObject context, OOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attribute+=Attribut* operatoren+=Operator*)
	 */
	protected void sequence_Objekttyp(EObject context, TOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attribute+=Attribut* operatoren+=Operator*)
	 */
	protected void sequence_Objekttyp(EObject context, VOT semanticObject) {
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
	 *     {TOT}
	 */
	protected void sequence_TOT(EObject context, TOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {VOT}
	 */
	protected void sequence_VOT(EObject context, VOT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
