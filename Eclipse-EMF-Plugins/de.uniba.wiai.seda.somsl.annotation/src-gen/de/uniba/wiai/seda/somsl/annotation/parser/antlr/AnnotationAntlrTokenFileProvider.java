/*
* generated by Xtext
*/
package de.uniba.wiai.seda.somsl.annotation.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AnnotationAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.tokens");
	}
}