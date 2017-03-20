/*
 * generated by Xtext
 */
package de.uniba.wiai.seda.fha.som.aws.formatting

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import com.google.inject.Inject
import de.uniba.wiai.seda.fha.som.aws.services.AwsGrammarAccess

// import com.google.inject.Inject;
// import de.uniba.wiai.seda.fha.som.aws.services.AwsGrammarAccess

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class AwsFormatter extends AbstractDeclarativeFormatter {

	@Inject extension AwsGrammarAccess
	
	override protected void configureFormatting(FormattingConfig c) {
		c.setLinewrap(1, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(1, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(1, 1, 1).after(ML_COMMENTRule)
		c.setLinewrap(1, 1, 1).after(objekttypRule)
		c.setLinewrap(1, 1, 1).before(beziehungRule)
		c.setLinewrap(1, 1, 1).after(beziehungRule)
		c.setLinewrap(1, 1, 1).after(is_part_ofRule)
		c.setLinewrap(1, 1, 1).after(is_aRule)
		c.setLinewrap(1, 1, 1).after(interacts_withRule)
		c.setLinewrap(1, 1, 1).before(attributRule)
		c.setLinewrap(1, 1, 1).after(attributRule)
		c.setLinewrap(1, 1, 1).before(operatorRule)
		c.setLinewrap(1, 1, 1).after(operatorRule)
		
		c.setLinewrap(1, 1, 1).before(annotationRule)
		c.setLinewrap(1, 1, 1).after(annotationRule)
		c.setLinewrap(1, 1, 1).before(nameRule)
		c.setLinewrap(1, 1, 1).after(nameRule)
		c.setLinewrap(1, 1, 1).before(ignoreRule)
		c.setLinewrap(1, 1, 1).after(ignoreRule) 
	}
	
}