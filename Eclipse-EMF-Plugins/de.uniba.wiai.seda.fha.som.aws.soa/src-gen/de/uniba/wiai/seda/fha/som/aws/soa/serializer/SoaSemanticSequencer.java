package de.uniba.wiai.seda.fha.som.aws.soa.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.uniba.wiai.seda.fha.annotation.annotation.AnnotationPackage;
import de.uniba.wiai.seda.fha.annotation.annotation.Ignore;
import de.uniba.wiai.seda.fha.annotation.annotation.Merge;
import de.uniba.wiai.seda.fha.annotation.annotation.Name;
import de.uniba.wiai.seda.fha.annotation.annotation.Version;
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
import de.uniba.wiai.seda.fha.som.aws.serializer.AwsSemanticSequencer;
import de.uniba.wiai.seda.fha.som.aws.soa.services.SoaGrammarAccess;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Bedingung;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.ChoreographieLokal;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Entity;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Entityservice;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Interface;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Orchestrierung;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.SOA_AwS;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.ServiceMethode;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.SoaPackage;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Vorgangsservice;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.VorgangsserviceElementar;
import de.uniba.wiai.seda.fha.som.aws.soa.soa.Workflow;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SoaSemanticSequencer extends AwsSemanticSequencer {

	@Inject
	private SoaGrammarAccess grammarAccess;
	
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
		else if(semanticObject.eClass().getEPackage() == SoaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SoaPackage.BEDINGUNG:
				if(context == grammarAccess.getBedingungRule()) {
					sequence_Bedingung(context, (Bedingung) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.CHOREOGRAPHIE_LOKAL:
				if(context == grammarAccess.getChoreographieLokalRule()) {
					sequence_ChoreographieLokal(context, (ChoreographieLokal) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.ENTITYSERVICE:
				if(context == grammarAccess.getEntityserviceRule() ||
				   context == grammarAccess.getServiceRule()) {
					sequence_Entityservice(context, (Entityservice) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.INTERFACE:
				if(context == grammarAccess.getInterfaceRule()) {
					sequence_Interface(context, (Interface) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.ORCHESTRIERUNG:
				if(context == grammarAccess.getOrchestrierungRule()) {
					sequence_Orchestrierung(context, (Orchestrierung) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.SOA_AW_S:
				if(context == grammarAccess.getSOA_AwSRule()) {
					sequence_SOA_AwS(context, (SOA_AwS) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.SERVICE_METHODE:
				if(context == grammarAccess.getServiceMethodeRule()) {
					sequence_ServiceMethode(context, (ServiceMethode) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.VORGANGSSERVICE:
				if(context == grammarAccess.getServiceRule() ||
				   context == grammarAccess.getVorgangsserviceRule()) {
					sequence_Vorgangsservice(context, (Vorgangsservice) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.VORGANGSSERVICE_ELEMENTAR:
				if(context == grammarAccess.getServiceRule() ||
				   context == grammarAccess.getVorgangsserviceElementarRule()) {
					sequence_VorgangsserviceElementar(context, (VorgangsserviceElementar) semanticObject); 
					return; 
				}
				else break;
			case SoaPackage.WORKFLOW:
				if(context == grammarAccess.getWorkflowRule()) {
					sequence_Workflow(context, (Workflow) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     bedingung=ID
	 */
	protected void sequence_Bedingung(EObject context, Bedingung semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SoaPackage.Literals.BEDINGUNG__BEDINGUNG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SoaPackage.Literals.BEDINGUNG__BEDINGUNG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBedingungAccess().getBedingungIDTerminalRuleCall_0(), semanticObject.getBedingung());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (bedingung=Bedingung? methode1=[ServiceMethode|ID] service2=[Service|ID] methode2=[ServiceMethode|ID])
	 */
	protected void sequence_ChoreographieLokal(EObject context, ChoreographieLokal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID komponentenObjekttyp=[KOT|ID] interface=Interface?)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID interface=Interface entities+=Entity*)
	 */
	protected void sequence_Entityservice(EObject context, Entityservice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Interface' methoden+=ServiceMethode+)
	 */
	protected void sequence_Interface(EObject context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bedingung=Bedingung? methode1=[ServiceMethode|ID] methode2=[ServiceMethode|ID])
	 */
	protected void sequence_Orchestrierung(EObject context, Orchestrierung semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID version=VERSION_NUMBER? vos=VOS kos=KOS (vorgangsservices+=Vorgangsservice | entityservices+=Entityservice)*)
	 */
	protected void sequence_SOA_AwS(EObject context, SOA_AwS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parameter+=ID*)
	 */
	protected void sequence_ServiceMethode(EObject context, ServiceMethode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID komponentenObjekttyp=[VOT|ID] interface=Interface)
	 */
	protected void sequence_VorgangsserviceElementar(EObject context, VorgangsserviceElementar semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SoaPackage.Literals.SERVICE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SoaPackage.Literals.SERVICE__NAME));
			if(transientValues.isValueTransient(semanticObject, SoaPackage.Literals.VORGANGSSERVICE_ELEMENTAR__KOMPONENTEN_OBJEKTTYP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SoaPackage.Literals.VORGANGSSERVICE_ELEMENTAR__KOMPONENTEN_OBJEKTTYP));
			if(transientValues.isValueTransient(semanticObject, SoaPackage.Literals.VORGANGSSERVICE_ELEMENTAR__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SoaPackage.Literals.VORGANGSSERVICE_ELEMENTAR__INTERFACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVorgangsserviceElementarAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVorgangsserviceElementarAccess().getKomponentenObjekttypVOTIDTerminalRuleCall_2_0_1(), semanticObject.getKomponentenObjekttyp());
		feeder.accept(grammarAccess.getVorgangsserviceElementarAccess().getInterfaceInterfaceParserRuleCall_3_0(), semanticObject.getInterface());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID choreographieIF=Interface vorgangsservicesElementar+=VorgangsserviceElementar* workflow=Workflow)
	 */
	protected void sequence_Vorgangsservice(EObject context, Vorgangsservice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (orchestrierung+=Orchestrierung | choreographie+=ChoreographieLokal)+
	 */
	protected void sequence_Workflow(EObject context, Workflow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
