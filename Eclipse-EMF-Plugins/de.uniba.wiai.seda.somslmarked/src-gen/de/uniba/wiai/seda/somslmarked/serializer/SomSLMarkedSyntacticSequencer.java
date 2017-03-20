package de.uniba.wiai.seda.somslmarked.serializer;

import com.google.inject.Inject;
import de.uniba.wiai.seda.somslmarked.services.SomSLMarkedGrammarAccess;
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
public class SomSLMarkedSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SomSLMarkedGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Interacts_with_Interacts_withKeyword_1_q;
	protected AbstractElementAlias match_Kardinalitaet01_HyphenMinusHyphenMinusKeyword_0_0_or_LeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_1;
	protected AbstractElementAlias match_Kardinalitaet0x_HyphenMinusGreaterThanSignKeyword_0_0_or_LeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_1;
	protected AbstractElementAlias match_Kardinalitaet11_EqualsSignEqualsSignKeyword_0_0_or_LeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_1;
	protected AbstractElementAlias match_Kardinalitaet1x_EqualsSignGreaterThanSignKeyword_0_0_or_LeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SomSLMarkedGrammarAccess) access;
		match_Interacts_with_Interacts_withKeyword_1_q = new TokenAlias(false, true, grammarAccess.getInteracts_withAccess().getInteracts_withKeyword_1());
		match_Kardinalitaet01_HyphenMinusHyphenMinusKeyword_0_0_or_LeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getKardinalitaet01Access().getHyphenMinusHyphenMinusKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getKardinalitaet01Access().getLeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_1()));
		match_Kardinalitaet0x_HyphenMinusGreaterThanSignKeyword_0_0_or_LeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getKardinalitaet0xAccess().getHyphenMinusGreaterThanSignKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getKardinalitaet0xAccess().getLeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_1()));
		match_Kardinalitaet11_EqualsSignEqualsSignKeyword_0_0_or_LeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getKardinalitaet11Access().getEqualsSignEqualsSignKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getKardinalitaet11Access().getLeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_1()));
		match_Kardinalitaet1x_EqualsSignGreaterThanSignKeyword_0_0_or_LeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getKardinalitaet1xAccess().getEqualsSignGreaterThanSignKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getKardinalitaet1xAccess().getLeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Interacts_with_Interacts_withKeyword_1_q.equals(syntax))
				emit_Interacts_with_Interacts_withKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Kardinalitaet01_HyphenMinusHyphenMinusKeyword_0_0_or_LeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_1.equals(syntax))
				emit_Kardinalitaet01_HyphenMinusHyphenMinusKeyword_0_0_or_LeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Kardinalitaet0x_HyphenMinusGreaterThanSignKeyword_0_0_or_LeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_1.equals(syntax))
				emit_Kardinalitaet0x_HyphenMinusGreaterThanSignKeyword_0_0_or_LeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Kardinalitaet11_EqualsSignEqualsSignKeyword_0_0_or_LeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_1.equals(syntax))
				emit_Kardinalitaet11_EqualsSignEqualsSignKeyword_0_0_or_LeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Kardinalitaet1x_EqualsSignGreaterThanSignKeyword_0_0_or_LeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_1.equals(syntax))
				emit_Kardinalitaet1x_EqualsSignGreaterThanSignKeyword_0_0_or_LeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'interacts_with:'?
	 */
	protected void emit_Interacts_with_Interacts_withKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '--' | '(0,1)'
	 */
	protected void emit_Kardinalitaet01_HyphenMinusHyphenMinusKeyword_0_0_or_LeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '->' | '(0,*)'
	 */
	protected void emit_Kardinalitaet0x_HyphenMinusGreaterThanSignKeyword_0_0_or_LeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '==' | '(1,1)'
	 */
	protected void emit_Kardinalitaet11_EqualsSignEqualsSignKeyword_0_0_or_LeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '(1,*)' | '=>'
	 */
	protected void emit_Kardinalitaet1x_EqualsSignGreaterThanSignKeyword_0_0_or_LeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
