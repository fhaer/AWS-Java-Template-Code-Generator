/*
* generated by Xtext
*/
package de.uniba.wiai.seda.fha.swarchitektur.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SwarchitekturGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ArchitekturElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Architektur");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cJavaEEArchitekturKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cVKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cVersionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cVersionIDTerminalRuleCall_2_1_0 = (RuleCall)cVersionAssignment_2_1.eContents().get(0);
		private final Assignment cPaketeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPaketePackageParserRuleCall_3_0 = (RuleCall)cPaketeAssignment_3.eContents().get(0);
		
		//Architektur:
		//
		//	"JavaEEArchitektur:" name=ID ("v" version=ID)? pakete+=Package*;
		public ParserRule getRule() { return rule; }

		//"JavaEEArchitektur:" name=ID ("v" version=ID)? pakete+=Package*
		public Group getGroup() { return cGroup; }

		//"JavaEEArchitektur:"
		public Keyword getJavaEEArchitekturKeyword_0() { return cJavaEEArchitekturKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("v" version=ID)?
		public Group getGroup_2() { return cGroup_2; }

		//"v"
		public Keyword getVKeyword_2_0() { return cVKeyword_2_0; }

		//version=ID
		public Assignment getVersionAssignment_2_1() { return cVersionAssignment_2_1; }

		//ID
		public RuleCall getVersionIDTerminalRuleCall_2_1_0() { return cVersionIDTerminalRuleCall_2_1_0; }

		//pakete+=Package*
		public Assignment getPaketeAssignment_3() { return cPaketeAssignment_3; }

		//Package
		public RuleCall getPaketePackageParserRuleCall_3_0() { return cPaketePackageParserRuleCall_3_0; }
	}

	public class PackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Package");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cKomponentenAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cKomponentenEJBParserRuleCall_3_0_0 = (RuleCall)cKomponentenAssignment_3_0.eContents().get(0);
		private final Assignment cEntitiesAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cEntitiesJPAEntityParserRuleCall_3_1_0 = (RuleCall)cEntitiesAssignment_3_1.eContents().get(0);
		private final Assignment cPaketeAssignment_3_2 = (Assignment)cAlternatives_3.eContents().get(2);
		private final RuleCall cPaketePackageParserRuleCall_3_2_0 = (RuleCall)cPaketeAssignment_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Package:
		//
		//	"package" name=ID "{" (komponenten+=EJB | entities+=JPAEntity | pakete+=Package)+ "}";
		public ParserRule getRule() { return rule; }

		//"package" name=ID "{" (komponenten+=EJB | entities+=JPAEntity | pakete+=Package)+ "}"
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//(komponenten+=EJB | entities+=JPAEntity | pakete+=Package)+
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//komponenten+=EJB
		public Assignment getKomponentenAssignment_3_0() { return cKomponentenAssignment_3_0; }

		//EJB
		public RuleCall getKomponentenEJBParserRuleCall_3_0_0() { return cKomponentenEJBParserRuleCall_3_0_0; }

		//entities+=JPAEntity
		public Assignment getEntitiesAssignment_3_1() { return cEntitiesAssignment_3_1; }

		//JPAEntity
		public RuleCall getEntitiesJPAEntityParserRuleCall_3_1_0() { return cEntitiesJPAEntityParserRuleCall_3_1_0; }

		//pakete+=Package
		public Assignment getPaketeAssignment_3_2() { return cPaketeAssignment_3_2; }

		//Package
		public RuleCall getPaketePackageParserRuleCall_3_2_0() { return cPaketePackageParserRuleCall_3_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class EJBElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EJB");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSessionBeanParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMessageDrivenBeanParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cBusinessInterfaceParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//EJB:
		//
		//	SessionBean | MessageDrivenBean | BusinessInterface;
		public ParserRule getRule() { return rule; }

		//SessionBean | MessageDrivenBean | BusinessInterface
		public Alternatives getAlternatives() { return cAlternatives; }

		//SessionBean
		public RuleCall getSessionBeanParserRuleCall_0() { return cSessionBeanParserRuleCall_0; }

		//MessageDrivenBean
		public RuleCall getMessageDrivenBeanParserRuleCall_1() { return cMessageDrivenBeanParserRuleCall_1; }

		//BusinessInterface
		public RuleCall getBusinessInterfaceParserRuleCall_2() { return cBusinessInterfaceParserRuleCall_2; }
	}

	public class SessionBeanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SessionBean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStatelessSessionBeanParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStatefulSessionBeanParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSingletonSessionBeanParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//SessionBean:
		//
		//	StatelessSessionBean | StatefulSessionBean | SingletonSessionBean;
		public ParserRule getRule() { return rule; }

		//StatelessSessionBean | StatefulSessionBean | SingletonSessionBean
		public Alternatives getAlternatives() { return cAlternatives; }

		//StatelessSessionBean
		public RuleCall getStatelessSessionBeanParserRuleCall_0() { return cStatelessSessionBeanParserRuleCall_0; }

		//StatefulSessionBean
		public RuleCall getStatefulSessionBeanParserRuleCall_1() { return cStatefulSessionBeanParserRuleCall_1; }

		//SingletonSessionBean
		public RuleCall getSingletonSessionBeanParserRuleCall_2() { return cSingletonSessionBeanParserRuleCall_2; }
	}

	public class BusinessInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BusinessInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBusinessInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cMethodenAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMethodenMethodensignaturParserRuleCall_3_0 = (RuleCall)cMethodenAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//BusinessInterface:
		//
		//	"BusinessInterface" name=ID "{" methoden+=Methodensignatur* "}";
		public ParserRule getRule() { return rule; }

		//"BusinessInterface" name=ID "{" methoden+=Methodensignatur* "}"
		public Group getGroup() { return cGroup; }

		//"BusinessInterface"
		public Keyword getBusinessInterfaceKeyword_0() { return cBusinessInterfaceKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//methoden+=Methodensignatur*
		public Assignment getMethodenAssignment_3() { return cMethodenAssignment_3; }

		//Methodensignatur
		public RuleCall getMethodenMethodensignaturParserRuleCall_3_0() { return cMethodenMethodensignaturParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class MethodensignaturElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Methodensignatur");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisRightParenthesisSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Methodensignatur:
		//
		//	name=ID "();";
		public ParserRule getRule() { return rule; }

		//name=ID "();"
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"();"
		public Keyword getLeftParenthesisRightParenthesisSemicolonKeyword_1() { return cLeftParenthesisRightParenthesisSemicolonKeyword_1; }
	}

	public class StatefulSessionBeanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StatefulSessionBean");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStatefulSessionBeanKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributeAttributParserRuleCall_3_0 = (RuleCall)cAttributeAssignment_3.eContents().get(0);
		private final Assignment cMethodeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMethodeMethodeParserRuleCall_4_0 = (RuleCall)cMethodeAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//StatefulSessionBean:
		//
		//	"StatefulSessionBean" name=ID "{" attribute+=Attribut* methode+=Methode* "}";
		public ParserRule getRule() { return rule; }

		//"StatefulSessionBean" name=ID "{" attribute+=Attribut* methode+=Methode* "}"
		public Group getGroup() { return cGroup; }

		//"StatefulSessionBean"
		public Keyword getStatefulSessionBeanKeyword_0() { return cStatefulSessionBeanKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//attribute+=Attribut*
		public Assignment getAttributeAssignment_3() { return cAttributeAssignment_3; }

		//Attribut
		public RuleCall getAttributeAttributParserRuleCall_3_0() { return cAttributeAttributParserRuleCall_3_0; }

		//methode+=Methode*
		public Assignment getMethodeAssignment_4() { return cMethodeAssignment_4; }

		//Methode
		public RuleCall getMethodeMethodeParserRuleCall_4_0() { return cMethodeMethodeParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class AttributElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attribut");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypIDTerminalRuleCall_0_0 = (RuleCall)cTypAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Attribut:
		//
		//	typ=ID name=ID ";";
		public ParserRule getRule() { return rule; }

		//typ=ID name=ID ";"
		public Group getGroup() { return cGroup; }

		//typ=ID
		public Assignment getTypAssignment_0() { return cTypAssignment_0; }

		//ID
		public RuleCall getTypIDTerminalRuleCall_0_0() { return cTypIDTerminalRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class MethodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Methode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisRightParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAufrufAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAufrufAufrufParserRuleCall_3_0 = (RuleCall)cAufrufAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Methode:
		//
		//	name=ID "()" "{" aufruf+=Aufruf* "}";
		public ParserRule getRule() { return rule; }

		//name=ID "()" "{" aufruf+=Aufruf* "}"
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"()"
		public Keyword getLeftParenthesisRightParenthesisKeyword_1() { return cLeftParenthesisRightParenthesisKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//aufruf+=Aufruf*
		public Assignment getAufrufAssignment_3() { return cAufrufAssignment_3; }

		//Aufruf
		public RuleCall getAufrufAufrufParserRuleCall_3_0() { return cAufrufAufrufParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class AufrufElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Aufruf");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cObjektAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cObjektIDTerminalRuleCall_0_0_0 = (RuleCall)cObjektAssignment_0_0.eContents().get(0);
		private final Keyword cFullStopKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cMethodeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMethodeMethodensignaturParserRuleCall_1_0 = (RuleCall)cMethodeAssignment_1.eContents().get(0);
		
		//Aufruf:
		//
		//	(objekt=ID ".")? methode=Methodensignatur;
		public ParserRule getRule() { return rule; }

		//(objekt=ID ".")? methode=Methodensignatur
		public Group getGroup() { return cGroup; }

		//(objekt=ID ".")?
		public Group getGroup_0() { return cGroup_0; }

		//objekt=ID
		public Assignment getObjektAssignment_0_0() { return cObjektAssignment_0_0; }

		//ID
		public RuleCall getObjektIDTerminalRuleCall_0_0_0() { return cObjektIDTerminalRuleCall_0_0_0; }

		//"."
		public Keyword getFullStopKeyword_0_1() { return cFullStopKeyword_0_1; }

		//methode=Methodensignatur
		public Assignment getMethodeAssignment_1() { return cMethodeAssignment_1; }

		//Methodensignatur
		public RuleCall getMethodeMethodensignaturParserRuleCall_1_0() { return cMethodeMethodensignaturParserRuleCall_1_0; }
	}

	public class StatelessSessionBeanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StatelessSessionBean");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStatelessSessionBeanKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cMethodeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMethodeMethodeParserRuleCall_3_0 = (RuleCall)cMethodeAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//StatelessSessionBean:
		//
		//	"StatelessSessionBean" name=ID "{" methode+=Methode* "}";
		public ParserRule getRule() { return rule; }

		//"StatelessSessionBean" name=ID "{" methode+=Methode* "}"
		public Group getGroup() { return cGroup; }

		//"StatelessSessionBean"
		public Keyword getStatelessSessionBeanKeyword_0() { return cStatelessSessionBeanKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//methode+=Methode*
		public Assignment getMethodeAssignment_3() { return cMethodeAssignment_3; }

		//Methode
		public RuleCall getMethodeMethodeParserRuleCall_3_0() { return cMethodeMethodeParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class JPAEntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "JPAEntity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cJPAEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributeAttributParserRuleCall_3_0 = (RuleCall)cAttributeAssignment_3.eContents().get(0);
		private final Assignment cMethodeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMethodeMethodeParserRuleCall_4_0 = (RuleCall)cMethodeAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//JPAEntity:
		//
		//	"JPAEntity" name=ID "{" attribute+=Attribut* methode+=Methode* "}";
		public ParserRule getRule() { return rule; }

		//"JPAEntity" name=ID "{" attribute+=Attribut* methode+=Methode* "}"
		public Group getGroup() { return cGroup; }

		//"JPAEntity"
		public Keyword getJPAEntityKeyword_0() { return cJPAEntityKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//attribute+=Attribut*
		public Assignment getAttributeAssignment_3() { return cAttributeAssignment_3; }

		//Attribut
		public RuleCall getAttributeAttributParserRuleCall_3_0() { return cAttributeAttributParserRuleCall_3_0; }

		//methode+=Methode*
		public Assignment getMethodeAssignment_4() { return cMethodeAssignment_4; }

		//Methode
		public RuleCall getMethodeMethodeParserRuleCall_4_0() { return cMethodeMethodeParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class MessageDrivenBeanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MessageDrivenBean");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMessageDrivenBeanKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//MessageDrivenBean:
		//
		//	"MessageDrivenBean" name=ID "{" "}";
		public ParserRule getRule() { return rule; }

		//"MessageDrivenBean" name=ID "{" "}"
		public Group getGroup() { return cGroup; }

		//"MessageDrivenBean"
		public Keyword getMessageDrivenBeanKeyword_0() { return cMessageDrivenBeanKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class SingletonSessionBeanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SingletonSessionBean");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSingletonSessionBeanKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//SingletonSessionBean:
		//
		//	"SingletonSessionBean" name=ID "{" "}";
		public ParserRule getRule() { return rule; }

		//"SingletonSessionBean" name=ID "{" "}"
		public Group getGroup() { return cGroup; }

		//"SingletonSessionBean"
		public Keyword getSingletonSessionBeanKeyword_0() { return cSingletonSessionBeanKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	
	
	private ArchitekturElements pArchitektur;
	private PackageElements pPackage;
	private EJBElements pEJB;
	private SessionBeanElements pSessionBean;
	private BusinessInterfaceElements pBusinessInterface;
	private MethodensignaturElements pMethodensignatur;
	private StatefulSessionBeanElements pStatefulSessionBean;
	private AttributElements pAttribut;
	private MethodeElements pMethode;
	private AufrufElements pAufruf;
	private StatelessSessionBeanElements pStatelessSessionBean;
	private JPAEntityElements pJPAEntity;
	private MessageDrivenBeanElements pMessageDrivenBean;
	private SingletonSessionBeanElements pSingletonSessionBean;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public SwarchitekturGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.uniba.wiai.seda.fha.swarchitektur.Swarchitektur".equals(grammar.getName())) {
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

	
	//Architektur:
	//
	//	"JavaEEArchitektur:" name=ID ("v" version=ID)? pakete+=Package*;
	public ArchitekturElements getArchitekturAccess() {
		return (pArchitektur != null) ? pArchitektur : (pArchitektur = new ArchitekturElements());
	}
	
	public ParserRule getArchitekturRule() {
		return getArchitekturAccess().getRule();
	}

	//Package:
	//
	//	"package" name=ID "{" (komponenten+=EJB | entities+=JPAEntity | pakete+=Package)+ "}";
	public PackageElements getPackageAccess() {
		return (pPackage != null) ? pPackage : (pPackage = new PackageElements());
	}
	
	public ParserRule getPackageRule() {
		return getPackageAccess().getRule();
	}

	//EJB:
	//
	//	SessionBean | MessageDrivenBean | BusinessInterface;
	public EJBElements getEJBAccess() {
		return (pEJB != null) ? pEJB : (pEJB = new EJBElements());
	}
	
	public ParserRule getEJBRule() {
		return getEJBAccess().getRule();
	}

	//SessionBean:
	//
	//	StatelessSessionBean | StatefulSessionBean | SingletonSessionBean;
	public SessionBeanElements getSessionBeanAccess() {
		return (pSessionBean != null) ? pSessionBean : (pSessionBean = new SessionBeanElements());
	}
	
	public ParserRule getSessionBeanRule() {
		return getSessionBeanAccess().getRule();
	}

	//BusinessInterface:
	//
	//	"BusinessInterface" name=ID "{" methoden+=Methodensignatur* "}";
	public BusinessInterfaceElements getBusinessInterfaceAccess() {
		return (pBusinessInterface != null) ? pBusinessInterface : (pBusinessInterface = new BusinessInterfaceElements());
	}
	
	public ParserRule getBusinessInterfaceRule() {
		return getBusinessInterfaceAccess().getRule();
	}

	//Methodensignatur:
	//
	//	name=ID "();";
	public MethodensignaturElements getMethodensignaturAccess() {
		return (pMethodensignatur != null) ? pMethodensignatur : (pMethodensignatur = new MethodensignaturElements());
	}
	
	public ParserRule getMethodensignaturRule() {
		return getMethodensignaturAccess().getRule();
	}

	//StatefulSessionBean:
	//
	//	"StatefulSessionBean" name=ID "{" attribute+=Attribut* methode+=Methode* "}";
	public StatefulSessionBeanElements getStatefulSessionBeanAccess() {
		return (pStatefulSessionBean != null) ? pStatefulSessionBean : (pStatefulSessionBean = new StatefulSessionBeanElements());
	}
	
	public ParserRule getStatefulSessionBeanRule() {
		return getStatefulSessionBeanAccess().getRule();
	}

	//Attribut:
	//
	//	typ=ID name=ID ";";
	public AttributElements getAttributAccess() {
		return (pAttribut != null) ? pAttribut : (pAttribut = new AttributElements());
	}
	
	public ParserRule getAttributRule() {
		return getAttributAccess().getRule();
	}

	//Methode:
	//
	//	name=ID "()" "{" aufruf+=Aufruf* "}";
	public MethodeElements getMethodeAccess() {
		return (pMethode != null) ? pMethode : (pMethode = new MethodeElements());
	}
	
	public ParserRule getMethodeRule() {
		return getMethodeAccess().getRule();
	}

	//Aufruf:
	//
	//	(objekt=ID ".")? methode=Methodensignatur;
	public AufrufElements getAufrufAccess() {
		return (pAufruf != null) ? pAufruf : (pAufruf = new AufrufElements());
	}
	
	public ParserRule getAufrufRule() {
		return getAufrufAccess().getRule();
	}

	//StatelessSessionBean:
	//
	//	"StatelessSessionBean" name=ID "{" methode+=Methode* "}";
	public StatelessSessionBeanElements getStatelessSessionBeanAccess() {
		return (pStatelessSessionBean != null) ? pStatelessSessionBean : (pStatelessSessionBean = new StatelessSessionBeanElements());
	}
	
	public ParserRule getStatelessSessionBeanRule() {
		return getStatelessSessionBeanAccess().getRule();
	}

	//JPAEntity:
	//
	//	"JPAEntity" name=ID "{" attribute+=Attribut* methode+=Methode* "}";
	public JPAEntityElements getJPAEntityAccess() {
		return (pJPAEntity != null) ? pJPAEntity : (pJPAEntity = new JPAEntityElements());
	}
	
	public ParserRule getJPAEntityRule() {
		return getJPAEntityAccess().getRule();
	}

	//MessageDrivenBean:
	//
	//	"MessageDrivenBean" name=ID "{" "}";
	public MessageDrivenBeanElements getMessageDrivenBeanAccess() {
		return (pMessageDrivenBean != null) ? pMessageDrivenBean : (pMessageDrivenBean = new MessageDrivenBeanElements());
	}
	
	public ParserRule getMessageDrivenBeanRule() {
		return getMessageDrivenBeanAccess().getRule();
	}

	//SingletonSessionBean:
	//
	//	"SingletonSessionBean" name=ID "{" "}";
	public SingletonSessionBeanElements getSingletonSessionBeanAccess() {
		return (pSingletonSessionBean != null) ? pSingletonSessionBean : (pSingletonSessionBean = new SingletonSessionBeanElements());
	}
	
	public ParserRule getSingletonSessionBeanRule() {
		return getSingletonSessionBeanAccess().getRule();
	}

	//terminal ID:
	//
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
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
