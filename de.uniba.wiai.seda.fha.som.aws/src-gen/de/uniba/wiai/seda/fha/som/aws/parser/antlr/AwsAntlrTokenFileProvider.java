/*
* generated by Xtext
*/
package de.uniba.wiai.seda.fha.som.aws.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AwsAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.tokens");
	}
}
