/*
* generated by Xtext
*/
grammar InternalSomSL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package de.uniba.wiai.seda.somsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.uniba.wiai.seda.somsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uniba.wiai.seda.somsl.services.SomSLGrammarAccess;

}

@parser::members {

 	private SomSLGrammarAccess grammarAccess;
 	
    public InternalSomSLParser(TokenStream input, SomSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Metamodell";	
   	}
   	
   	@Override
   	protected SomSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMetamodell
entryRuleMetamodell returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMetamodellRule()); }
	 iv_ruleMetamodell=ruleMetamodell 
	 { $current=$iv_ruleMetamodell.current; } 
	 EOF 
;

// Rule Metamodell
ruleMetamodell returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getMetamodellAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMetamodellRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)(
(
		lv_version_1_0=RULE_ID
		{
			newLeafNode(lv_version_1_0, grammarAccess.getMetamodellAccess().getVersionIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMetamodellRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"version",
        		lv_version_1_0, 
        		"ID");
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getMetamodellAccess().getObjekttypObjekttypParserRuleCall_2_0_0()); 
	    }
		lv_objekttyp_2_0=ruleObjekttyp		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMetamodellRule());
	        }
       		add(
       			$current, 
       			"objekttyp",
        		lv_objekttyp_2_0, 
        		"Objekttyp");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getMetamodellAccess().getBeziehungBeziehungParserRuleCall_2_1_0()); 
	    }
		lv_beziehung_3_0=ruleBeziehung		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMetamodellRule());
	        }
       		add(
       			$current, 
       			"beziehung",
        		lv_beziehung_3_0, 
        		"Beziehung");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleObjekttyp
entryRuleObjekttyp returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getObjekttypRule()); }
	 iv_ruleObjekttyp=ruleObjekttyp 
	 { $current=$iv_ruleObjekttyp.current; } 
	 EOF 
;

// Rule Objekttyp
ruleObjekttyp returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((this_ANNOTATION_0=RULE_ANNOTATION
    { 
    newLeafNode(this_ANNOTATION_0, grammarAccess.getObjekttypAccess().getANNOTATIONTerminalRuleCall_0()); 
    }
)?(
    { 
        newCompositeNode(grammarAccess.getObjekttypAccess().getKOTParserRuleCall_1_0()); 
    }
    this_KOT_1=ruleKOT
    { 
        $current = $this_KOT_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getObjekttypAccess().getVOTParserRuleCall_1_1()); 
    }
    this_VOT_2=ruleVOT
    { 
        $current = $this_VOT_2.current; 
        afterParserOrEnumRuleCall();
    }
)(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getObjekttypAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getObjekttypRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getObjekttypAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getObjekttypAccess().getAttributeAttributParserRuleCall_4_0()); 
	    }
		lv_attribute_5_0=ruleAttribut		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getObjekttypRule());
	        }
       		add(
       			$current, 
       			"attribute",
        		lv_attribute_5_0, 
        		"Attribut");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getObjekttypAccess().getOperatorenOperatorParserRuleCall_5_0()); 
	    }
		lv_operatoren_6_0=ruleOperator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getObjekttypRule());
	        }
       		add(
       			$current, 
       			"operatoren",
        		lv_operatoren_6_0, 
        		"Operator");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getObjekttypAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleAttribut
entryRuleAttribut returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttributRule()); }
	 iv_ruleAttribut=ruleAttribut 
	 { $current=$iv_ruleAttribut.current; } 
	 EOF 
;

// Rule Attribut
ruleAttribut returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getAttributAccess().getObjekttypObjekttypCrossReference_0_0_0()); 
	}

)
)
    |(	otherlv_1='DT' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAttributAccess().getDTKeyword_0_1_0());
    }
(
(
		lv_datentyp_2_0=RULE_ID
		{
			newLeafNode(lv_datentyp_2_0, grammarAccess.getAttributAccess().getDatentypIDTerminalRuleCall_0_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"datentyp",
        		lv_datentyp_2_0, 
        		"ID");
	    }

)
)))(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAttributAccess().getSemicolonKeyword_2());
    }
)
;





// Entry rule entryRuleOperator
entryRuleOperator returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOperatorRule()); }
	 iv_ruleOperator=ruleOperator 
	 { $current=$iv_ruleOperator.current; } 
	 EOF 
;

// Rule Operator
ruleOperator returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getOperatorAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOperatorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getOperatorRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getOperatorAccess().getParameterObjekttypCrossReference_2_0()); 
	}

)
)*	otherlv_3=') {' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getOperatorAccess().getRightParenthesisSpaceLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOperatorAccess().getAnweisungenAnweisungParserRuleCall_4_0()); 
	    }
		lv_anweisungen_4_0=ruleAnweisung		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperatorRule());
	        }
       		add(
       			$current, 
       			"anweisungen",
        		lv_anweisungen_4_0, 
        		"Anweisung");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getOperatorAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleAnweisung
entryRuleAnweisung returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAnweisungRule()); }
	 iv_ruleAnweisung=ruleAnweisung 
	 { $current=$iv_ruleAnweisung.current; } 
	 EOF 
;

// Rule Anweisung
ruleAnweisung returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		lv_kontrollstruktur_0_0=RULE_ID
		{
			newLeafNode(lv_kontrollstruktur_0_0, grammarAccess.getAnweisungAccess().getKontrollstrukturIDTerminalRuleCall_0_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAnweisungRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"kontrollstruktur",
        		lv_kontrollstruktur_0_0, 
        		"ID");
	    }

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAnweisungAccess().getLeftParenthesisKeyword_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAnweisungAccess().getBedingungAnweisungParserRuleCall_0_2_0()); 
	    }
		lv_bedingung_2_0=ruleAnweisung		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnweisungRule());
	        }
       		set(
       			$current, 
       			"bedingung",
        		lv_bedingung_2_0, 
        		"Anweisung");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=') {' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAnweisungAccess().getRightParenthesisSpaceLeftCurlyBracketKeyword_0_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAnweisungAccess().getBedigteAnweisungenAnweisungParserRuleCall_0_4_0()); 
	    }
		lv_bedigteAnweisungen_4_0=ruleAnweisung		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnweisungRule());
	        }
       		add(
       			$current, 
       			"bedigteAnweisungen",
        		lv_bedigteAnweisungen_4_0, 
        		"Anweisung");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAnweisungAccess().getRightCurlyBracketKeyword_0_5());
    }
)
    |(((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAnweisungRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getAnweisungAccess().getObjektObjekttypCrossReference_1_0_0_0()); 
	}

)
)	otherlv_7='.' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getAnweisungAccess().getFullStopKeyword_1_0_1());
    }
)?(
(
		lv_operator_8_0=RULE_ID
		{
			newLeafNode(lv_operator_8_0, grammarAccess.getAnweisungAccess().getOperatorIDTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAnweisungRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"operator",
        		lv_operator_8_0, 
        		"ID");
	    }

)
)))
;





// Entry rule entryRuleKOT
entryRuleKOT returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getKOTRule()); }
	 iv_ruleKOT=ruleKOT 
	 { $current=$iv_ruleKOT.current; } 
	 EOF 
;

// Rule KOT
ruleKOT returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getKOTAccess().getOOTParserRuleCall_0()); 
    }
    this_OOT_0=ruleOOT
    { 
        $current = $this_OOT_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getKOTAccess().getLOTParserRuleCall_1()); 
    }
    this_LOT_1=ruleLOT
    { 
        $current = $this_LOT_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getKOTAccess().getTOTParserRuleCall_2()); 
    }
    this_TOT_2=ruleTOT
    { 
        $current = $this_TOT_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleVOT
entryRuleVOT returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVOTRule()); }
	 iv_ruleVOT=ruleVOT 
	 { $current=$iv_ruleVOT.current; } 
	 EOF 
;

// Rule VOT
ruleVOT returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='VOT' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getVOTAccess().getVOTKeyword_0());
    }
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getVOTAccess().getVOTAction_1(),
            $current);
    }
))
;





// Entry rule entryRuleOOT
entryRuleOOT returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOOTRule()); }
	 iv_ruleOOT=ruleOOT 
	 { $current=$iv_ruleOOT.current; } 
	 EOF 
;

// Rule OOT
ruleOOT returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='OOT' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getOOTAccess().getOOTKeyword_0());
    }
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getOOTAccess().getOOTAction_1(),
            $current);
    }
))
;





// Entry rule entryRuleLOT
entryRuleLOT returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLOTRule()); }
	 iv_ruleLOT=ruleLOT 
	 { $current=$iv_ruleLOT.current; } 
	 EOF 
;

// Rule LOT
ruleLOT returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='LOT' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getLOTAccess().getLOTKeyword_0());
    }
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getLOTAccess().getLOTAction_1(),
            $current);
    }
))
;





// Entry rule entryRuleTOT
entryRuleTOT returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTOTRule()); }
	 iv_ruleTOT=ruleTOT 
	 { $current=$iv_ruleTOT.current; } 
	 EOF 
;

// Rule TOT
ruleTOT returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='TOT' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTOTAccess().getTOTKeyword_0());
    }
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getTOTAccess().getTOTAction_1(),
            $current);
    }
))
;





// Entry rule entryRuleBeziehung
entryRuleBeziehung returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBeziehungRule()); }
	 iv_ruleBeziehung=ruleBeziehung 
	 { $current=$iv_ruleBeziehung.current; } 
	 EOF 
;

// Rule Beziehung
ruleBeziehung returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((this_ANNOTATION_0=RULE_ANNOTATION
    { 
    newLeafNode(this_ANNOTATION_0, grammarAccess.getBeziehungAccess().getANNOTATIONTerminalRuleCall_0()); 
    }
)?(
    { 
        newCompositeNode(grammarAccess.getBeziehungAccess().getIs_aParserRuleCall_1_0()); 
    }
    this_Is_a_1=ruleIs_a
    { 
        $current = $this_Is_a_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBeziehungAccess().getInteracts_withParserRuleCall_1_1()); 
    }
    this_Interacts_with_2=ruleInteracts_with
    { 
        $current = $this_Interacts_with_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getBeziehungAccess().getIs_part_ofParserRuleCall_1_2()); 
    }
    this_Is_part_of_3=ruleIs_part_of
    { 
        $current = $this_Is_part_of_3.current; 
        afterParserOrEnumRuleCall();
    }
))
;





// Entry rule entryRuleInteracts_with
entryRuleInteracts_with returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInteracts_withRule()); }
	 iv_ruleInteracts_with=ruleInteracts_with 
	 { $current=$iv_ruleInteracts_with.current; } 
	 EOF 
;

// Rule Interacts_with
ruleInteracts_with returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='interacts_with:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getInteracts_withAccess().getInteracts_withKeyword_0());
    }
)?(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getInteracts_withRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypCrossReference_1_0()); 
	}

)
)(
(
(
		{ 
	        newCompositeNode(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet01ParserRuleCall_2_0_0()); 
	    }
		lv_kardinalitaet_2_1=ruleKardinalitaet01		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInteracts_withRule());
	        }
       		set(
       			$current, 
       			"kardinalitaet",
        		lv_kardinalitaet_2_1, 
        		"Kardinalitaet01");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet0xParserRuleCall_2_0_1()); 
	    }
		lv_kardinalitaet_2_2=ruleKardinalitaet0x		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInteracts_withRule());
	        }
       		set(
       			$current, 
       			"kardinalitaet",
        		lv_kardinalitaet_2_2, 
        		"Kardinalitaet0x");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet1xParserRuleCall_2_0_2()); 
	    }
		lv_kardinalitaet_2_3=ruleKardinalitaet1x		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInteracts_withRule());
	        }
       		set(
       			$current, 
       			"kardinalitaet",
        		lv_kardinalitaet_2_3, 
        		"Kardinalitaet1x");
	        afterParserOrEnumRuleCall();
	    }

)

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getInteracts_withRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypCrossReference_3_0()); 
	}

)
))
;





// Entry rule entryRuleIs_a
entryRuleIs_a returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIs_aRule()); }
	 iv_ruleIs_a=ruleIs_a 
	 { $current=$iv_ruleIs_a.current; } 
	 EOF 
;

// Rule Is_a
ruleIs_a returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='is_a:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIs_aAccess().getIs_aKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getIs_aRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypCrossReference_1_0()); 
	}

)
)(
(
(
		{ 
	        newCompositeNode(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet01ParserRuleCall_2_0_0()); 
	    }
		lv_kardinalitaet_2_1=ruleKardinalitaet01		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIs_aRule());
	        }
       		set(
       			$current, 
       			"kardinalitaet",
        		lv_kardinalitaet_2_1, 
        		"Kardinalitaet01");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet11ParserRuleCall_2_0_1()); 
	    }
		lv_kardinalitaet_2_2=ruleKardinalitaet11		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIs_aRule());
	        }
       		set(
       			$current, 
       			"kardinalitaet",
        		lv_kardinalitaet_2_2, 
        		"Kardinalitaet11");
	        afterParserOrEnumRuleCall();
	    }

)

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getIs_aRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypCrossReference_3_0()); 
	}

)
))
;





// Entry rule entryRuleIs_part_of
entryRuleIs_part_of returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIs_part_ofRule()); }
	 iv_ruleIs_part_of=ruleIs_part_of 
	 { $current=$iv_ruleIs_part_of.current; } 
	 EOF 
;

// Rule Is_part_of
ruleIs_part_of returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='is_part_of:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIs_part_ofAccess().getIs_part_ofKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getIs_part_ofRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypCrossReference_1_0()); 
	}

)
)(
(
(
		{ 
	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet01ParserRuleCall_2_0_0()); 
	    }
		lv_kardinalitaet_2_1=ruleKardinalitaet01		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIs_part_ofRule());
	        }
       		set(
       			$current, 
       			"kardinalitaet",
        		lv_kardinalitaet_2_1, 
        		"Kardinalitaet01");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet0xParserRuleCall_2_0_1()); 
	    }
		lv_kardinalitaet_2_2=ruleKardinalitaet0x		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIs_part_ofRule());
	        }
       		set(
       			$current, 
       			"kardinalitaet",
        		lv_kardinalitaet_2_2, 
        		"Kardinalitaet0x");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet1xParserRuleCall_2_0_2()); 
	    }
		lv_kardinalitaet_2_3=ruleKardinalitaet1x		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIs_part_ofRule());
	        }
       		set(
       			$current, 
       			"kardinalitaet",
        		lv_kardinalitaet_2_3, 
        		"Kardinalitaet1x");
	        afterParserOrEnumRuleCall();
	    }

)

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getIs_part_ofRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypCrossReference_3_0()); 
	}

)
))
;







// Entry rule entryRuleKardinalitaet01
entryRuleKardinalitaet01 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getKardinalitaet01Rule()); }
	 iv_ruleKardinalitaet01=ruleKardinalitaet01 
	 { $current=$iv_ruleKardinalitaet01.current; } 
	 EOF 
;

// Rule Kardinalitaet01
ruleKardinalitaet01 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='(0,1)' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet01Access().getLeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_0());
    }

    |	otherlv_1='--' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet01Access().getHyphenMinusHyphenMinusKeyword_0_1());
    }
)(
    {
        $current = forceCreateModelElement(
            grammarAccess.getKardinalitaet01Access().getKardinalitaet01Action_1(),
            $current);
    }
))
;





// Entry rule entryRuleKardinalitaet0x
entryRuleKardinalitaet0x returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getKardinalitaet0xRule()); }
	 iv_ruleKardinalitaet0x=ruleKardinalitaet0x 
	 { $current=$iv_ruleKardinalitaet0x.current; } 
	 EOF 
;

// Rule Kardinalitaet0x
ruleKardinalitaet0x returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='(0,*)' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet0xAccess().getLeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_0());
    }

    |	otherlv_1='->' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet0xAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
    }
)(
    {
        $current = forceCreateModelElement(
            grammarAccess.getKardinalitaet0xAccess().getKardinalitaet0xAction_1(),
            $current);
    }
))
;





// Entry rule entryRuleKardinalitaet11
entryRuleKardinalitaet11 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getKardinalitaet11Rule()); }
	 iv_ruleKardinalitaet11=ruleKardinalitaet11 
	 { $current=$iv_ruleKardinalitaet11.current; } 
	 EOF 
;

// Rule Kardinalitaet11
ruleKardinalitaet11 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='(1,1)' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet11Access().getLeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_0());
    }

    |	otherlv_1='==' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet11Access().getEqualsSignEqualsSignKeyword_0_1());
    }
)(
    {
        $current = forceCreateModelElement(
            grammarAccess.getKardinalitaet11Access().getKardinalitaet11Action_1(),
            $current);
    }
))
;





// Entry rule entryRuleKardinalitaet1x
entryRuleKardinalitaet1x returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getKardinalitaet1xRule()); }
	 iv_ruleKardinalitaet1x=ruleKardinalitaet1x 
	 { $current=$iv_ruleKardinalitaet1x.current; } 
	 EOF 
;

// Rule Kardinalitaet1x
ruleKardinalitaet1x returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='(1,*)' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet1xAccess().getLeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_0());
    }

    |	otherlv_1='=>' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet1xAccess().getEqualsSignGreaterThanSignKeyword_0_1());
    }
)(
    {
        $current = forceCreateModelElement(
            grammarAccess.getKardinalitaet1xAccess().getKardinalitaet1xAction_1(),
            $current);
    }
))
;





RULE_ANNOTATION : '@' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

