/*
* generated by Xtext
*/
package de.uniba.wiai.seda.fha.swarchitektur.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.uniba.wiai.seda.fha.swarchitektur.services.SwarchitekturGrammarAccess;

public class SwarchitekturParser extends AbstractContentAssistParser {
	
	@Inject
	private SwarchitekturGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.uniba.wiai.seda.fha.swarchitektur.ui.contentassist.antlr.internal.InternalSwarchitekturParser createParser() {
		de.uniba.wiai.seda.fha.swarchitektur.ui.contentassist.antlr.internal.InternalSwarchitekturParser result = new de.uniba.wiai.seda.fha.swarchitektur.ui.contentassist.antlr.internal.InternalSwarchitekturParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPackageAccess().getAlternatives_3(), "rule__Package__Alternatives_3");
					put(grammarAccess.getEJBAccess().getAlternatives(), "rule__EJB__Alternatives");
					put(grammarAccess.getSessionBeanAccess().getAlternatives(), "rule__SessionBean__Alternatives");
					put(grammarAccess.getArchitekturAccess().getGroup(), "rule__Architektur__Group__0");
					put(grammarAccess.getArchitekturAccess().getGroup_2(), "rule__Architektur__Group_2__0");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getBusinessInterfaceAccess().getGroup(), "rule__BusinessInterface__Group__0");
					put(grammarAccess.getMethodensignaturAccess().getGroup(), "rule__Methodensignatur__Group__0");
					put(grammarAccess.getStatefulSessionBeanAccess().getGroup(), "rule__StatefulSessionBean__Group__0");
					put(grammarAccess.getAttributAccess().getGroup(), "rule__Attribut__Group__0");
					put(grammarAccess.getMethodeAccess().getGroup(), "rule__Methode__Group__0");
					put(grammarAccess.getAufrufAccess().getGroup(), "rule__Aufruf__Group__0");
					put(grammarAccess.getAufrufAccess().getGroup_0(), "rule__Aufruf__Group_0__0");
					put(grammarAccess.getStatelessSessionBeanAccess().getGroup(), "rule__StatelessSessionBean__Group__0");
					put(grammarAccess.getJPAEntityAccess().getGroup(), "rule__JPAEntity__Group__0");
					put(grammarAccess.getMessageDrivenBeanAccess().getGroup(), "rule__MessageDrivenBean__Group__0");
					put(grammarAccess.getSingletonSessionBeanAccess().getGroup(), "rule__SingletonSessionBean__Group__0");
					put(grammarAccess.getArchitekturAccess().getNameAssignment_1(), "rule__Architektur__NameAssignment_1");
					put(grammarAccess.getArchitekturAccess().getVersionAssignment_2_1(), "rule__Architektur__VersionAssignment_2_1");
					put(grammarAccess.getArchitekturAccess().getPaketeAssignment_3(), "rule__Architektur__PaketeAssignment_3");
					put(grammarAccess.getPackageAccess().getNameAssignment_1(), "rule__Package__NameAssignment_1");
					put(grammarAccess.getPackageAccess().getKomponentenAssignment_3_0(), "rule__Package__KomponentenAssignment_3_0");
					put(grammarAccess.getPackageAccess().getEntitiesAssignment_3_1(), "rule__Package__EntitiesAssignment_3_1");
					put(grammarAccess.getPackageAccess().getPaketeAssignment_3_2(), "rule__Package__PaketeAssignment_3_2");
					put(grammarAccess.getBusinessInterfaceAccess().getNameAssignment_1(), "rule__BusinessInterface__NameAssignment_1");
					put(grammarAccess.getBusinessInterfaceAccess().getMethodenAssignment_3(), "rule__BusinessInterface__MethodenAssignment_3");
					put(grammarAccess.getMethodensignaturAccess().getNameAssignment_0(), "rule__Methodensignatur__NameAssignment_0");
					put(grammarAccess.getStatefulSessionBeanAccess().getNameAssignment_1(), "rule__StatefulSessionBean__NameAssignment_1");
					put(grammarAccess.getStatefulSessionBeanAccess().getAttributeAssignment_3(), "rule__StatefulSessionBean__AttributeAssignment_3");
					put(grammarAccess.getStatefulSessionBeanAccess().getMethodeAssignment_4(), "rule__StatefulSessionBean__MethodeAssignment_4");
					put(grammarAccess.getAttributAccess().getTypAssignment_0(), "rule__Attribut__TypAssignment_0");
					put(grammarAccess.getAttributAccess().getNameAssignment_1(), "rule__Attribut__NameAssignment_1");
					put(grammarAccess.getMethodeAccess().getNameAssignment_0(), "rule__Methode__NameAssignment_0");
					put(grammarAccess.getMethodeAccess().getAufrufAssignment_3(), "rule__Methode__AufrufAssignment_3");
					put(grammarAccess.getAufrufAccess().getObjektAssignment_0_0(), "rule__Aufruf__ObjektAssignment_0_0");
					put(grammarAccess.getAufrufAccess().getMethodeAssignment_1(), "rule__Aufruf__MethodeAssignment_1");
					put(grammarAccess.getStatelessSessionBeanAccess().getNameAssignment_1(), "rule__StatelessSessionBean__NameAssignment_1");
					put(grammarAccess.getStatelessSessionBeanAccess().getMethodeAssignment_3(), "rule__StatelessSessionBean__MethodeAssignment_3");
					put(grammarAccess.getJPAEntityAccess().getNameAssignment_1(), "rule__JPAEntity__NameAssignment_1");
					put(grammarAccess.getJPAEntityAccess().getAttributeAssignment_3(), "rule__JPAEntity__AttributeAssignment_3");
					put(grammarAccess.getJPAEntityAccess().getMethodeAssignment_4(), "rule__JPAEntity__MethodeAssignment_4");
					put(grammarAccess.getMessageDrivenBeanAccess().getNameAssignment_1(), "rule__MessageDrivenBean__NameAssignment_1");
					put(grammarAccess.getSingletonSessionBeanAccess().getNameAssignment_1(), "rule__SingletonSessionBean__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.uniba.wiai.seda.fha.swarchitektur.ui.contentassist.antlr.internal.InternalSwarchitekturParser typedParser = (de.uniba.wiai.seda.fha.swarchitektur.ui.contentassist.antlr.internal.InternalSwarchitekturParser) parser;
			typedParser.entryRuleArchitektur();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SwarchitekturGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SwarchitekturGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
