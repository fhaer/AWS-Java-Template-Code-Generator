/*
* generated by Xtext
*/
package de.uniba.wiai.seda.somsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import de.uniba.wiai.seda.somsl.services.SomSLGrammarAccess;

public class SomSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SomSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected de.uniba.wiai.seda.somsl.parser.antlr.internal.InternalSomSLParser createParser(XtextTokenStream stream) {
		return new de.uniba.wiai.seda.somsl.parser.antlr.internal.InternalSomSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Metamodell";
	}
	
	public SomSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SomSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
