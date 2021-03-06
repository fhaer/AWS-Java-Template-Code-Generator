/*
* generated by Xtext
*/
package de.uniba.wiai.seda.somslmarked.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.uniba.wiai.seda.somslmarked.services.SomSLMarkedGrammarAccess;

public class SomSLMarkedParser extends AbstractContentAssistParser {
	
	@Inject
	private SomSLMarkedGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.uniba.wiai.seda.somslmarked.ui.contentassist.antlr.internal.InternalSomSLMarkedParser createParser() {
		de.uniba.wiai.seda.somslmarked.ui.contentassist.antlr.internal.InternalSomSLMarkedParser result = new de.uniba.wiai.seda.somslmarked.ui.contentassist.antlr.internal.InternalSomSLMarkedParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSchemaAccess().getAlternatives(), "rule__Schema__Alternatives");
					put(grammarAccess.getKOSAccess().getAlternatives_0(), "rule__KOS__Alternatives_0");
					put(grammarAccess.getKOSAccess().getAlternatives_2(), "rule__KOS__Alternatives_2");
					put(grammarAccess.getVOSAccess().getAlternatives_0(), "rule__VOS__Alternatives_0");
					put(grammarAccess.getVOSAccess().getAlternatives_2(), "rule__VOS__Alternatives_2");
					put(grammarAccess.getObjekttypAccess().getAlternatives(), "rule__Objekttyp__Alternatives");
					put(grammarAccess.getAttributAccess().getAlternatives_0(), "rule__Attribut__Alternatives_0");
					put(grammarAccess.getAnweisungAccess().getAlternatives(), "rule__Anweisung__Alternatives");
					put(grammarAccess.getKOTAccess().getAlternatives(), "rule__KOT__Alternatives");
					put(grammarAccess.getBeziehungAccess().getAlternatives(), "rule__Beziehung__Alternatives");
					put(grammarAccess.getInteracts_withAccess().getKardinalitaetAlternatives_3_0(), "rule__Interacts_with__KardinalitaetAlternatives_3_0");
					put(grammarAccess.getIs_aAccess().getKardinalitaetAlternatives_3_0(), "rule__Is_a__KardinalitaetAlternatives_3_0");
					put(grammarAccess.getIs_part_ofAccess().getKardinalitaetAlternatives_3_0(), "rule__Is_part_of__KardinalitaetAlternatives_3_0");
					put(grammarAccess.getKardinalitaetAccess().getAlternatives(), "rule__Kardinalitaet__Alternatives");
					put(grammarAccess.getKardinalitaet01Access().getAlternatives_0(), "rule__Kardinalitaet01__Alternatives_0");
					put(grammarAccess.getKardinalitaet0xAccess().getAlternatives_0(), "rule__Kardinalitaet0x__Alternatives_0");
					put(grammarAccess.getKardinalitaet11Access().getAlternatives_0(), "rule__Kardinalitaet11__Alternatives_0");
					put(grammarAccess.getKardinalitaet1xAccess().getAlternatives_0(), "rule__Kardinalitaet1x__Alternatives_0");
					put(grammarAccess.getAnnotationAccess().getAlternatives(), "rule__Annotation__Alternatives");
					put(grammarAccess.getAwSAccess().getGroup(), "rule__AwS__Group__0");
					put(grammarAccess.getAwSAccess().getGroup_2(), "rule__AwS__Group_2__0");
					put(grammarAccess.getKOSAccess().getGroup(), "rule__KOS__Group__0");
					put(grammarAccess.getVOSAccess().getGroup(), "rule__VOS__Group__0");
					put(grammarAccess.getAttributAccess().getGroup(), "rule__Attribut__Group__0");
					put(grammarAccess.getAttributAccess().getGroup_0_1(), "rule__Attribut__Group_0_1__0");
					put(grammarAccess.getOperatorAccess().getGroup(), "rule__Operator__Group__0");
					put(grammarAccess.getAnweisungAccess().getGroup_0(), "rule__Anweisung__Group_0__0");
					put(grammarAccess.getAnweisungAccess().getGroup_1(), "rule__Anweisung__Group_1__0");
					put(grammarAccess.getAnweisungAccess().getGroup_1_0(), "rule__Anweisung__Group_1_0__0");
					put(grammarAccess.getVOTAccess().getGroup(), "rule__VOT__Group__0");
					put(grammarAccess.getOOTAccess().getGroup(), "rule__OOT__Group__0");
					put(grammarAccess.getLOTAccess().getGroup(), "rule__LOT__Group__0");
					put(grammarAccess.getTOTAccess().getGroup(), "rule__TOT__Group__0");
					put(grammarAccess.getInteracts_withAccess().getGroup(), "rule__Interacts_with__Group__0");
					put(grammarAccess.getIs_aAccess().getGroup(), "rule__Is_a__Group__0");
					put(grammarAccess.getIs_part_ofAccess().getGroup(), "rule__Is_part_of__Group__0");
					put(grammarAccess.getKardinalitaet01Access().getGroup(), "rule__Kardinalitaet01__Group__0");
					put(grammarAccess.getKardinalitaet0xAccess().getGroup(), "rule__Kardinalitaet0x__Group__0");
					put(grammarAccess.getKardinalitaet11Access().getGroup(), "rule__Kardinalitaet11__Group__0");
					put(grammarAccess.getKardinalitaet1xAccess().getGroup(), "rule__Kardinalitaet1x__Group__0");
					put(grammarAccess.getNameAccess().getGroup(), "rule__Name__Group__0");
					put(grammarAccess.getMergeAccess().getGroup(), "rule__Merge__Group__0");
					put(grammarAccess.getIgnoreAccess().getGroup(), "rule__Ignore__Group__0");
					put(grammarAccess.getAwSAccess().getNameAssignment_1(), "rule__AwS__NameAssignment_1");
					put(grammarAccess.getAwSAccess().getVersionAssignment_2_1(), "rule__AwS__VersionAssignment_2_1");
					put(grammarAccess.getAwSAccess().getKosAssignment_3_0(), "rule__AwS__KosAssignment_3_0");
					put(grammarAccess.getAwSAccess().getVosAssignment_3_1(), "rule__AwS__VosAssignment_3_1");
					put(grammarAccess.getKOSAccess().getNameAssignment_0_0(), "rule__KOS__NameAssignment_0_0");
					put(grammarAccess.getKOSAccess().getNameAssignment_0_1(), "rule__KOS__NameAssignment_0_1");
					put(grammarAccess.getKOSAccess().getObjekttypenAssignment_2_0(), "rule__KOS__ObjekttypenAssignment_2_0");
					put(grammarAccess.getKOSAccess().getBeziehungenAssignment_2_1(), "rule__KOS__BeziehungenAssignment_2_1");
					put(grammarAccess.getKOSAccess().getGliederungAssignment_2_2(), "rule__KOS__GliederungAssignment_2_2");
					put(grammarAccess.getVOSAccess().getNameAssignment_0_0(), "rule__VOS__NameAssignment_0_0");
					put(grammarAccess.getVOSAccess().getNameAssignment_0_1(), "rule__VOS__NameAssignment_0_1");
					put(grammarAccess.getVOSAccess().getObjekttypenAssignment_2_0(), "rule__VOS__ObjekttypenAssignment_2_0");
					put(grammarAccess.getVOSAccess().getBeziehungenAssignment_2_1(), "rule__VOS__BeziehungenAssignment_2_1");
					put(grammarAccess.getVOSAccess().getGliederungAssignment_2_2(), "rule__VOS__GliederungAssignment_2_2");
					put(grammarAccess.getAttributAccess().getObjekttypAssignment_0_0(), "rule__Attribut__ObjekttypAssignment_0_0");
					put(grammarAccess.getAttributAccess().getDatentypAssignment_0_1_1(), "rule__Attribut__DatentypAssignment_0_1_1");
					put(grammarAccess.getAttributAccess().getNameAssignment_1(), "rule__Attribut__NameAssignment_1");
					put(grammarAccess.getOperatorAccess().getNameAssignment_0(), "rule__Operator__NameAssignment_0");
					put(grammarAccess.getOperatorAccess().getParameterAssignment_2(), "rule__Operator__ParameterAssignment_2");
					put(grammarAccess.getOperatorAccess().getAnweisungenAssignment_4(), "rule__Operator__AnweisungenAssignment_4");
					put(grammarAccess.getAnweisungAccess().getKontrollstrukturAssignment_0_0(), "rule__Anweisung__KontrollstrukturAssignment_0_0");
					put(grammarAccess.getAnweisungAccess().getBedingungAssignment_0_2(), "rule__Anweisung__BedingungAssignment_0_2");
					put(grammarAccess.getAnweisungAccess().getBedigteAnweisungenAssignment_0_4(), "rule__Anweisung__BedigteAnweisungenAssignment_0_4");
					put(grammarAccess.getAnweisungAccess().getObjektAssignment_1_0_0(), "rule__Anweisung__ObjektAssignment_1_0_0");
					put(grammarAccess.getAnweisungAccess().getOperatorAssignment_1_1(), "rule__Anweisung__OperatorAssignment_1_1");
					put(grammarAccess.getVOTAccess().getAnnotationAssignment_0(), "rule__VOT__AnnotationAssignment_0");
					put(grammarAccess.getVOTAccess().getNameAssignment_2(), "rule__VOT__NameAssignment_2");
					put(grammarAccess.getVOTAccess().getAttributeAssignment_4(), "rule__VOT__AttributeAssignment_4");
					put(grammarAccess.getVOTAccess().getOperatorenAssignment_5(), "rule__VOT__OperatorenAssignment_5");
					put(grammarAccess.getOOTAccess().getAnnotationAssignment_0(), "rule__OOT__AnnotationAssignment_0");
					put(grammarAccess.getOOTAccess().getNameAssignment_2(), "rule__OOT__NameAssignment_2");
					put(grammarAccess.getOOTAccess().getAttributeAssignment_4(), "rule__OOT__AttributeAssignment_4");
					put(grammarAccess.getOOTAccess().getOperatorenAssignment_5(), "rule__OOT__OperatorenAssignment_5");
					put(grammarAccess.getLOTAccess().getAnnotationAssignment_0(), "rule__LOT__AnnotationAssignment_0");
					put(grammarAccess.getLOTAccess().getNameAssignment_2(), "rule__LOT__NameAssignment_2");
					put(grammarAccess.getLOTAccess().getAttributeAssignment_4(), "rule__LOT__AttributeAssignment_4");
					put(grammarAccess.getLOTAccess().getOperatorenAssignment_5(), "rule__LOT__OperatorenAssignment_5");
					put(grammarAccess.getTOTAccess().getAnnotationAssignment_0(), "rule__TOT__AnnotationAssignment_0");
					put(grammarAccess.getTOTAccess().getNameAssignment_2(), "rule__TOT__NameAssignment_2");
					put(grammarAccess.getTOTAccess().getAttributeAssignment_4(), "rule__TOT__AttributeAssignment_4");
					put(grammarAccess.getTOTAccess().getOperatorenAssignment_5(), "rule__TOT__OperatorenAssignment_5");
					put(grammarAccess.getInteracts_withAccess().getAnnotationAssignment_0(), "rule__Interacts_with__AnnotationAssignment_0");
					put(grammarAccess.getInteracts_withAccess().getObjekttyp1Assignment_2(), "rule__Interacts_with__Objekttyp1Assignment_2");
					put(grammarAccess.getInteracts_withAccess().getKardinalitaetAssignment_3(), "rule__Interacts_with__KardinalitaetAssignment_3");
					put(grammarAccess.getInteracts_withAccess().getObjekttyp2Assignment_4(), "rule__Interacts_with__Objekttyp2Assignment_4");
					put(grammarAccess.getIs_aAccess().getAnnotationAssignment_0(), "rule__Is_a__AnnotationAssignment_0");
					put(grammarAccess.getIs_aAccess().getObjekttyp1Assignment_2(), "rule__Is_a__Objekttyp1Assignment_2");
					put(grammarAccess.getIs_aAccess().getKardinalitaetAssignment_3(), "rule__Is_a__KardinalitaetAssignment_3");
					put(grammarAccess.getIs_aAccess().getObjekttyp2Assignment_4(), "rule__Is_a__Objekttyp2Assignment_4");
					put(grammarAccess.getIs_part_ofAccess().getAnnotationAssignment_0(), "rule__Is_part_of__AnnotationAssignment_0");
					put(grammarAccess.getIs_part_ofAccess().getObjekttyp1Assignment_2(), "rule__Is_part_of__Objekttyp1Assignment_2");
					put(grammarAccess.getIs_part_ofAccess().getKardinalitaetAssignment_3(), "rule__Is_part_of__KardinalitaetAssignment_3");
					put(grammarAccess.getIs_part_ofAccess().getObjekttyp2Assignment_4(), "rule__Is_part_of__Objekttyp2Assignment_4");
					put(grammarAccess.getNameAccess().getNameAssignment_1(), "rule__Name__NameAssignment_1");
					put(grammarAccess.getMergeAccess().getNameAssignment_1(), "rule__Merge__NameAssignment_1");
					put(grammarAccess.getAwSAccess().getUnorderedGroup_3(), "rule__AwS__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.uniba.wiai.seda.somslmarked.ui.contentassist.antlr.internal.InternalSomSLMarkedParser typedParser = (de.uniba.wiai.seda.somslmarked.ui.contentassist.antlr.internal.InternalSomSLMarkedParser) parser;
			typedParser.entryRuleAwS();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SomSLMarkedGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SomSLMarkedGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
