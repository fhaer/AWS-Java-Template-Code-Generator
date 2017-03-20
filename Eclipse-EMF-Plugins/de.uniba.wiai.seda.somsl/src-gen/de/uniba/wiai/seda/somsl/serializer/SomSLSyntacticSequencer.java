package de.uniba.wiai.seda.somsl.serializer;

import com.google.inject.Inject;
import de.uniba.wiai.seda.somsl.services.SomSLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SomSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SomSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Beziehung_ANNOTATIONTerminalRuleCall_0_q;
	protected AbstractElementAlias match_Interacts_with_Interacts_withKeyword_0_q;
	protected AbstractElementAlias match_Kardinalitaet01_HyphenMinusHyphenMinusKeyword_0_1_or_LeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_0;
	protected AbstractElementAlias match_Kardinalitaet0x_HyphenMinusGreaterThanSignKeyword_0_1_or_LeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_0;
	protected AbstractElementAlias match_Kardinalitaet11_EqualsSignEqualsSignKeyword_0_1_or_LeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_0;
	protected AbstractElementAlias match_Kardinalitaet1x_EqualsSignGreaterThanSignKeyword_0_1_or_LeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_0;
	protected AbstractElementAlias match_Objekttyp_ANNOTATIONTerminalRuleCall_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SomSLGrammarAccess) access;
		match_Beziehung_ANNOTATIONTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getBeziehungAccess().getANNOTATIONTerminalRuleCall_0());
		match_Interacts_with_Interacts_withKeyword_0_q = new TokenAlias(false, true, grammarAccess.getInteracts_withAccess().getInteracts_withKeyword_0());
		match_Kardinalitaet01_HyphenMinusHyphenMinusKeyword_0_1_or_LeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getKardinalitaet01Access().getHyphenMinusHyphenMinusKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getKardinalitaet01Access().getLeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_0()));
		match_Kardinalitaet0x_HyphenMinusGreaterThanSignKeyword_0_1_or_LeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getKardinalitaet0xAccess().getHyphenMinusGreaterThanSignKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getKardinalitaet0xAccess().getLeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_0()));
		match_Kardinalitaet11_EqualsSignEqualsSignKeyword_0_1_or_LeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getKardinalitaet11Access().getEqualsSignEqualsSignKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getKardinalitaet11Access().getLeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_0()));
		match_Kardinalitaet1x_EqualsSignGreaterThanSignKeyword_0_1_or_LeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getKardinalitaet1xAccess().getEqualsSignGreaterThanSignKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getKardinalitaet1xAccess().getLeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_0()));
		match_Objekttyp_ANNOTATIONTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getObjekttypAccess().getANNOTATIONTerminalRuleCall_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getANNOTATIONRule())
			return getANNOTATIONToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ANNOTATION : '@' !('\n'|'\r')* ('\r'? '\n')? ;
	 */
	protected String getANNOTATIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "@";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Beziehung_ANNOTATIONTerminalRuleCall_0_q.equals(syntax))
				emit_Beziehung_ANNOTATIONTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Interacts_with_Interacts_withKeyword_0_q.equals(syntax))
				emit_Interacts_with_Interacts_withKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Kardinalitaet01_HyphenMinusHyphenMinusKeyword_0_1_or_LeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_0.equals(syntax))
				emit_Kardinalitaet01_HyphenMinusHyphenMinusKeyword_0_1_or_LeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Kardinalitaet0x_HyphenMinusGreaterThanSignKeyword_0_1_or_LeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_0.equals(syntax))
				emit_Kardinalitaet0x_HyphenMinusGreaterThanSignKeyword_0_1_or_LeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Kardinalitaet11_EqualsSignEqualsSignKeyword_0_1_or_LeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_0.equals(syntax))
				emit_Kardinalitaet11_EqualsSignEqualsSignKeyword_0_1_or_LeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Kardinalitaet1x_EqualsSignGreaterThanSignKeyword_0_1_or_LeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_0.equals(syntax))
				emit_Kardinalitaet1x_EqualsSignGreaterThanSignKeyword_0_1_or_LeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Objekttyp_ANNOTATIONTerminalRuleCall_0_q.equals(syntax))
				emit_Objekttyp_ANNOTATIONTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ANNOTATION?
	 */
	protected void emit_Beziehung_ANNOTATIONTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'interacts_with:'?
	 */
	protected void emit_Interacts_with_Interacts_withKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '--' | '(0,1)'
	 */
	protected void emit_Kardinalitaet01_HyphenMinusHyphenMinusKeyword_0_1_or_LeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '->' | '(0,*)'
	 */
	protected void emit_Kardinalitaet0x_HyphenMinusGreaterThanSignKeyword_0_1_or_LeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '==' | '(1,1)'
	 */
	protected void emit_Kardinalitaet11_EqualsSignEqualsSignKeyword_0_1_or_LeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '=>' | '(1,*)'
	 */
	protected void emit_Kardinalitaet1x_EqualsSignGreaterThanSignKeyword_0_1_or_LeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ANNOTATION?
	 */
	protected void emit_Objekttyp_ANNOTATIONTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
