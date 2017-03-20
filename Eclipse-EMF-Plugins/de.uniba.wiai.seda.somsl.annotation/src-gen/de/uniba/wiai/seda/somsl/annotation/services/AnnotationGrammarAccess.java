/*
* generated by Xtext
*/
package de.uniba.wiai.seda.somsl.annotation.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class AnnotationGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class AnnotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Annotation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNameParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIgnoreParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMergeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Annotation:
		//
		//	Name | Ignore | Merge;
		public ParserRule getRule() { return rule; }

		//Name | Ignore | Merge
		public Alternatives getAlternatives() { return cAlternatives; }

		//Name
		public RuleCall getNameParserRuleCall_0() { return cNameParserRuleCall_0; }

		//Ignore
		public RuleCall getIgnoreParserRuleCall_1() { return cIgnoreParserRuleCall_1; }

		//Merge
		public RuleCall getMergeParserRuleCall_2() { return cMergeParserRuleCall_2; }
	}

	public class NameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Name");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNameKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Name:
		//
		//	"@name" name=ID;
		public ParserRule getRule() { return rule; }

		//"@name" name=ID
		public Group getGroup() { return cGroup; }

		//"@name"
		public Keyword getNameKeyword_0() { return cNameKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class MergeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Merge");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMergeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//// Alternativen: @vservice, @service
		//
		//Merge:
		//
		//	"@merge" name=ID;
		public ParserRule getRule() { return rule; }

		//"@merge" name=ID
		public Group getGroup() { return cGroup; }

		//"@merge"
		public Keyword getMergeKeyword_0() { return cMergeKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class IgnoreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Ignore");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIgnoreKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cIgnoreAction_1 = (Action)cGroup.eContents().get(1);
		
		//Ignore:
		//
		//	"@ignore" {Ignore};
		public ParserRule getRule() { return rule; }

		//"@ignore" {Ignore}
		public Group getGroup() { return cGroup; }

		//"@ignore"
		public Keyword getIgnoreKeyword_0() { return cIgnoreKeyword_0; }

		//{Ignore}
		public Action getIgnoreAction_1() { return cIgnoreAction_1; }
	}
	
	
	private AnnotationElements pAnnotation;
	private NameElements pName;
	private MergeElements pMerge;
	private IgnoreElements pIgnore;
	private TerminalRule tID;
	private TerminalRule tVERSION;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public AnnotationGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.uniba.wiai.seda.somsl.annotation.Annotation".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Annotation:
	//
	//	Name | Ignore | Merge;
	public AnnotationElements getAnnotationAccess() {
		return (pAnnotation != null) ? pAnnotation : (pAnnotation = new AnnotationElements());
	}
	
	public ParserRule getAnnotationRule() {
		return getAnnotationAccess().getRule();
	}

	//Name:
	//
	//	"@name" name=ID;
	public NameElements getNameAccess() {
		return (pName != null) ? pName : (pName = new NameElements());
	}
	
	public ParserRule getNameRule() {
		return getNameAccess().getRule();
	}

	//// Alternativen: @vservice, @service
	//
	//Merge:
	//
	//	"@merge" name=ID;
	public MergeElements getMergeAccess() {
		return (pMerge != null) ? pMerge : (pMerge = new MergeElements());
	}
	
	public ParserRule getMergeRule() {
		return getMergeAccess().getRule();
	}

	//Ignore:
	//
	//	"@ignore" {Ignore};
	public IgnoreElements getIgnoreAccess() {
		return (pIgnore != null) ? pIgnore : (pIgnore = new IgnoreElements());
	}
	
	public ParserRule getIgnoreRule() {
		return getIgnoreAccess().getRule();
	}

	//terminal ID:
	//
	//	"^"? ("a".."z" | "A".."Z" | "_" | "<" | ">") ("a".."z" | "A".."Z" | "_" | "0".."9" | "<" | ">")*;
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//terminal VERSION:
	//
	//	"0".."9"+ "." "0".."9"+;
	public TerminalRule getVERSIONRule() {
		return (tVERSION != null) ? tVERSION : (tVERSION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "VERSION"));
	} 

	//terminal INT returns ecore::EInt:
	//
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
