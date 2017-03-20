package de.uniba.wiai.seda.fha.swarchitektur.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.uniba.wiai.seda.fha.swarchitektur.services.SwarchitekturGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSwarchitekturParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'JavaEEArchitektur:'", "'v'", "'package'", "'{'", "'}'", "'BusinessInterface'", "'();'", "'StatefulSessionBean'", "';'", "'()'", "'.'", "'StatelessSessionBean'", "'JPAEntity'", "'MessageDrivenBean'", "'SingletonSessionBean'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSwarchitekturParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSwarchitekturParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSwarchitekturParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g"; }


     
     	private SwarchitekturGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SwarchitekturGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleArchitektur"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:60:1: entryRuleArchitektur : ruleArchitektur EOF ;
    public final void entryRuleArchitektur() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:61:1: ( ruleArchitektur EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:62:1: ruleArchitektur EOF
            {
             before(grammarAccess.getArchitekturRule()); 
            pushFollow(FOLLOW_ruleArchitektur_in_entryRuleArchitektur61);
            ruleArchitektur();

            state._fsp--;

             after(grammarAccess.getArchitekturRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitektur68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArchitektur"


    // $ANTLR start "ruleArchitektur"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:69:1: ruleArchitektur : ( ( rule__Architektur__Group__0 ) ) ;
    public final void ruleArchitektur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:73:2: ( ( ( rule__Architektur__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:74:1: ( ( rule__Architektur__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:74:1: ( ( rule__Architektur__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:75:1: ( rule__Architektur__Group__0 )
            {
             before(grammarAccess.getArchitekturAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:76:1: ( rule__Architektur__Group__0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:76:2: rule__Architektur__Group__0
            {
            pushFollow(FOLLOW_rule__Architektur__Group__0_in_ruleArchitektur94);
            rule__Architektur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArchitekturAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchitektur"


    // $ANTLR start "entryRulePackage"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:88:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:89:1: ( rulePackage EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:90:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage121);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:97:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:101:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:102:1: ( ( rule__Package__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:102:1: ( ( rule__Package__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:103:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:104:1: ( rule__Package__Group__0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:104:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage154);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleEJB"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:116:1: entryRuleEJB : ruleEJB EOF ;
    public final void entryRuleEJB() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:117:1: ( ruleEJB EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:118:1: ruleEJB EOF
            {
             before(grammarAccess.getEJBRule()); 
            pushFollow(FOLLOW_ruleEJB_in_entryRuleEJB181);
            ruleEJB();

            state._fsp--;

             after(grammarAccess.getEJBRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEJB188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEJB"


    // $ANTLR start "ruleEJB"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:125:1: ruleEJB : ( ( rule__EJB__Alternatives ) ) ;
    public final void ruleEJB() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:129:2: ( ( ( rule__EJB__Alternatives ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:130:1: ( ( rule__EJB__Alternatives ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:130:1: ( ( rule__EJB__Alternatives ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:131:1: ( rule__EJB__Alternatives )
            {
             before(grammarAccess.getEJBAccess().getAlternatives()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:132:1: ( rule__EJB__Alternatives )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:132:2: rule__EJB__Alternatives
            {
            pushFollow(FOLLOW_rule__EJB__Alternatives_in_ruleEJB214);
            rule__EJB__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEJBAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEJB"


    // $ANTLR start "entryRuleSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:144:1: entryRuleSessionBean : ruleSessionBean EOF ;
    public final void entryRuleSessionBean() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:145:1: ( ruleSessionBean EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:146:1: ruleSessionBean EOF
            {
             before(grammarAccess.getSessionBeanRule()); 
            pushFollow(FOLLOW_ruleSessionBean_in_entryRuleSessionBean241);
            ruleSessionBean();

            state._fsp--;

             after(grammarAccess.getSessionBeanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSessionBean248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSessionBean"


    // $ANTLR start "ruleSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:153:1: ruleSessionBean : ( ( rule__SessionBean__Alternatives ) ) ;
    public final void ruleSessionBean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:157:2: ( ( ( rule__SessionBean__Alternatives ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:158:1: ( ( rule__SessionBean__Alternatives ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:158:1: ( ( rule__SessionBean__Alternatives ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:159:1: ( rule__SessionBean__Alternatives )
            {
             before(grammarAccess.getSessionBeanAccess().getAlternatives()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:160:1: ( rule__SessionBean__Alternatives )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:160:2: rule__SessionBean__Alternatives
            {
            pushFollow(FOLLOW_rule__SessionBean__Alternatives_in_ruleSessionBean274);
            rule__SessionBean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSessionBeanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSessionBean"


    // $ANTLR start "entryRuleBusinessInterface"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:172:1: entryRuleBusinessInterface : ruleBusinessInterface EOF ;
    public final void entryRuleBusinessInterface() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:173:1: ( ruleBusinessInterface EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:174:1: ruleBusinessInterface EOF
            {
             before(grammarAccess.getBusinessInterfaceRule()); 
            pushFollow(FOLLOW_ruleBusinessInterface_in_entryRuleBusinessInterface301);
            ruleBusinessInterface();

            state._fsp--;

             after(grammarAccess.getBusinessInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessInterface308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBusinessInterface"


    // $ANTLR start "ruleBusinessInterface"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:181:1: ruleBusinessInterface : ( ( rule__BusinessInterface__Group__0 ) ) ;
    public final void ruleBusinessInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:185:2: ( ( ( rule__BusinessInterface__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:186:1: ( ( rule__BusinessInterface__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:186:1: ( ( rule__BusinessInterface__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:187:1: ( rule__BusinessInterface__Group__0 )
            {
             before(grammarAccess.getBusinessInterfaceAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:188:1: ( rule__BusinessInterface__Group__0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:188:2: rule__BusinessInterface__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessInterface__Group__0_in_ruleBusinessInterface334);
            rule__BusinessInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBusinessInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBusinessInterface"


    // $ANTLR start "entryRuleMethodensignatur"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:200:1: entryRuleMethodensignatur : ruleMethodensignatur EOF ;
    public final void entryRuleMethodensignatur() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:201:1: ( ruleMethodensignatur EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:202:1: ruleMethodensignatur EOF
            {
             before(grammarAccess.getMethodensignaturRule()); 
            pushFollow(FOLLOW_ruleMethodensignatur_in_entryRuleMethodensignatur361);
            ruleMethodensignatur();

            state._fsp--;

             after(grammarAccess.getMethodensignaturRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodensignatur368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodensignatur"


    // $ANTLR start "ruleMethodensignatur"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:209:1: ruleMethodensignatur : ( ( rule__Methodensignatur__Group__0 ) ) ;
    public final void ruleMethodensignatur() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:213:2: ( ( ( rule__Methodensignatur__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:214:1: ( ( rule__Methodensignatur__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:214:1: ( ( rule__Methodensignatur__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:215:1: ( rule__Methodensignatur__Group__0 )
            {
             before(grammarAccess.getMethodensignaturAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:216:1: ( rule__Methodensignatur__Group__0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:216:2: rule__Methodensignatur__Group__0
            {
            pushFollow(FOLLOW_rule__Methodensignatur__Group__0_in_ruleMethodensignatur394);
            rule__Methodensignatur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodensignaturAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodensignatur"


    // $ANTLR start "entryRuleStatefulSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:228:1: entryRuleStatefulSessionBean : ruleStatefulSessionBean EOF ;
    public final void entryRuleStatefulSessionBean() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:229:1: ( ruleStatefulSessionBean EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:230:1: ruleStatefulSessionBean EOF
            {
             before(grammarAccess.getStatefulSessionBeanRule()); 
            pushFollow(FOLLOW_ruleStatefulSessionBean_in_entryRuleStatefulSessionBean421);
            ruleStatefulSessionBean();

            state._fsp--;

             after(grammarAccess.getStatefulSessionBeanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatefulSessionBean428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatefulSessionBean"


    // $ANTLR start "ruleStatefulSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:237:1: ruleStatefulSessionBean : ( ( rule__StatefulSessionBean__Group__0 ) ) ;
    public final void ruleStatefulSessionBean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:241:2: ( ( ( rule__StatefulSessionBean__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:242:1: ( ( rule__StatefulSessionBean__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:242:1: ( ( rule__StatefulSessionBean__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:243:1: ( rule__StatefulSessionBean__Group__0 )
            {
             before(grammarAccess.getStatefulSessionBeanAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:244:1: ( rule__StatefulSessionBean__Group__0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:244:2: rule__StatefulSessionBean__Group__0
            {
            pushFollow(FOLLOW_rule__StatefulSessionBean__Group__0_in_ruleStatefulSessionBean454);
            rule__StatefulSessionBean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatefulSessionBeanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatefulSessionBean"


    // $ANTLR start "entryRuleAttribut"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:256:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:257:1: ( ruleAttribut EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:258:1: ruleAttribut EOF
            {
             before(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_ruleAttribut_in_entryRuleAttribut481);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getAttributRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribut488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:265:1: ruleAttribut : ( ( rule__Attribut__Group__0 ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:269:2: ( ( ( rule__Attribut__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:270:1: ( ( rule__Attribut__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:270:1: ( ( rule__Attribut__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:271:1: ( rule__Attribut__Group__0 )
            {
             before(grammarAccess.getAttributAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:272:1: ( rule__Attribut__Group__0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:272:2: rule__Attribut__Group__0
            {
            pushFollow(FOLLOW_rule__Attribut__Group__0_in_ruleAttribut514);
            rule__Attribut__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleMethode"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:284:1: entryRuleMethode : ruleMethode EOF ;
    public final void entryRuleMethode() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:285:1: ( ruleMethode EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:286:1: ruleMethode EOF
            {
             before(grammarAccess.getMethodeRule()); 
            pushFollow(FOLLOW_ruleMethode_in_entryRuleMethode541);
            ruleMethode();

            state._fsp--;

             after(grammarAccess.getMethodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethode548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethode"


    // $ANTLR start "ruleMethode"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:293:1: ruleMethode : ( ( rule__Methode__Group__0 ) ) ;
    public final void ruleMethode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:297:2: ( ( ( rule__Methode__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:298:1: ( ( rule__Methode__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:298:1: ( ( rule__Methode__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:299:1: ( rule__Methode__Group__0 )
            {
             before(grammarAccess.getMethodeAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:300:1: ( rule__Methode__Group__0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:300:2: rule__Methode__Group__0
            {
            pushFollow(FOLLOW_rule__Methode__Group__0_in_ruleMethode574);
            rule__Methode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethode"


    // $ANTLR start "entryRuleAufruf"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:312:1: entryRuleAufruf : ruleAufruf EOF ;
    public final void entryRuleAufruf() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:313:1: ( ruleAufruf EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:314:1: ruleAufruf EOF
            {
             before(grammarAccess.getAufrufRule()); 
            pushFollow(FOLLOW_ruleAufruf_in_entryRuleAufruf601);
            ruleAufruf();

            state._fsp--;

             after(grammarAccess.getAufrufRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAufruf608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAufruf"


    // $ANTLR start "ruleAufruf"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:321:1: ruleAufruf : ( ( rule__Aufruf__Group__0 ) ) ;
    public final void ruleAufruf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:325:2: ( ( ( rule__Aufruf__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:326:1: ( ( rule__Aufruf__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:326:1: ( ( rule__Aufruf__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:327:1: ( rule__Aufruf__Group__0 )
            {
             before(grammarAccess.getAufrufAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:328:1: ( rule__Aufruf__Group__0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:328:2: rule__Aufruf__Group__0
            {
            pushFollow(FOLLOW_rule__Aufruf__Group__0_in_ruleAufruf634);
            rule__Aufruf__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAufrufAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAufruf"


    // $ANTLR start "entryRuleStatelessSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:340:1: entryRuleStatelessSessionBean : ruleStatelessSessionBean EOF ;
    public final void entryRuleStatelessSessionBean() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:341:1: ( ruleStatelessSessionBean EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:342:1: ruleStatelessSessionBean EOF
            {
             before(grammarAccess.getStatelessSessionBeanRule()); 
            pushFollow(FOLLOW_ruleStatelessSessionBean_in_entryRuleStatelessSessionBean661);
            ruleStatelessSessionBean();

            state._fsp--;

             after(grammarAccess.getStatelessSessionBeanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatelessSessionBean668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatelessSessionBean"


    // $ANTLR start "ruleStatelessSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:349:1: ruleStatelessSessionBean : ( ( rule__StatelessSessionBean__Group__0 ) ) ;
    public final void ruleStatelessSessionBean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:353:2: ( ( ( rule__StatelessSessionBean__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:354:1: ( ( rule__StatelessSessionBean__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:354:1: ( ( rule__StatelessSessionBean__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:355:1: ( rule__StatelessSessionBean__Group__0 )
            {
             before(grammarAccess.getStatelessSessionBeanAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:356:1: ( rule__StatelessSessionBean__Group__0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:356:2: rule__StatelessSessionBean__Group__0
            {
            pushFollow(FOLLOW_rule__StatelessSessionBean__Group__0_in_ruleStatelessSessionBean694);
            rule__StatelessSessionBean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatelessSessionBeanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatelessSessionBean"


    // $ANTLR start "entryRuleJPAEntity"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:368:1: entryRuleJPAEntity : ruleJPAEntity EOF ;
    public final void entryRuleJPAEntity() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:369:1: ( ruleJPAEntity EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:370:1: ruleJPAEntity EOF
            {
             before(grammarAccess.getJPAEntityRule()); 
            pushFollow(FOLLOW_ruleJPAEntity_in_entryRuleJPAEntity721);
            ruleJPAEntity();

            state._fsp--;

             after(grammarAccess.getJPAEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJPAEntity728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJPAEntity"


    // $ANTLR start "ruleJPAEntity"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:377:1: ruleJPAEntity : ( ( rule__JPAEntity__Group__0 ) ) ;
    public final void ruleJPAEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:381:2: ( ( ( rule__JPAEntity__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:382:1: ( ( rule__JPAEntity__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:382:1: ( ( rule__JPAEntity__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:383:1: ( rule__JPAEntity__Group__0 )
            {
             before(grammarAccess.getJPAEntityAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:384:1: ( rule__JPAEntity__Group__0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:384:2: rule__JPAEntity__Group__0
            {
            pushFollow(FOLLOW_rule__JPAEntity__Group__0_in_ruleJPAEntity754);
            rule__JPAEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJPAEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJPAEntity"


    // $ANTLR start "entryRuleMessageDrivenBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:396:1: entryRuleMessageDrivenBean : ruleMessageDrivenBean EOF ;
    public final void entryRuleMessageDrivenBean() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:397:1: ( ruleMessageDrivenBean EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:398:1: ruleMessageDrivenBean EOF
            {
             before(grammarAccess.getMessageDrivenBeanRule()); 
            pushFollow(FOLLOW_ruleMessageDrivenBean_in_entryRuleMessageDrivenBean781);
            ruleMessageDrivenBean();

            state._fsp--;

             after(grammarAccess.getMessageDrivenBeanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageDrivenBean788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageDrivenBean"


    // $ANTLR start "ruleMessageDrivenBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:405:1: ruleMessageDrivenBean : ( ( rule__MessageDrivenBean__Group__0 ) ) ;
    public final void ruleMessageDrivenBean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:409:2: ( ( ( rule__MessageDrivenBean__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:410:1: ( ( rule__MessageDrivenBean__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:410:1: ( ( rule__MessageDrivenBean__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:411:1: ( rule__MessageDrivenBean__Group__0 )
            {
             before(grammarAccess.getMessageDrivenBeanAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:412:1: ( rule__MessageDrivenBean__Group__0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:412:2: rule__MessageDrivenBean__Group__0
            {
            pushFollow(FOLLOW_rule__MessageDrivenBean__Group__0_in_ruleMessageDrivenBean814);
            rule__MessageDrivenBean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageDrivenBeanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageDrivenBean"


    // $ANTLR start "entryRuleSingletonSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:424:1: entryRuleSingletonSessionBean : ruleSingletonSessionBean EOF ;
    public final void entryRuleSingletonSessionBean() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:425:1: ( ruleSingletonSessionBean EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:426:1: ruleSingletonSessionBean EOF
            {
             before(grammarAccess.getSingletonSessionBeanRule()); 
            pushFollow(FOLLOW_ruleSingletonSessionBean_in_entryRuleSingletonSessionBean841);
            ruleSingletonSessionBean();

            state._fsp--;

             after(grammarAccess.getSingletonSessionBeanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingletonSessionBean848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingletonSessionBean"


    // $ANTLR start "ruleSingletonSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:433:1: ruleSingletonSessionBean : ( ( rule__SingletonSessionBean__Group__0 ) ) ;
    public final void ruleSingletonSessionBean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:437:2: ( ( ( rule__SingletonSessionBean__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:438:1: ( ( rule__SingletonSessionBean__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:438:1: ( ( rule__SingletonSessionBean__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:439:1: ( rule__SingletonSessionBean__Group__0 )
            {
             before(grammarAccess.getSingletonSessionBeanAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:440:1: ( rule__SingletonSessionBean__Group__0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:440:2: rule__SingletonSessionBean__Group__0
            {
            pushFollow(FOLLOW_rule__SingletonSessionBean__Group__0_in_ruleSingletonSessionBean874);
            rule__SingletonSessionBean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingletonSessionBeanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingletonSessionBean"


    // $ANTLR start "rule__Package__Alternatives_3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:452:1: rule__Package__Alternatives_3 : ( ( ( rule__Package__KomponentenAssignment_3_0 ) ) | ( ( rule__Package__EntitiesAssignment_3_1 ) ) | ( ( rule__Package__PaketeAssignment_3_2 ) ) );
    public final void rule__Package__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:456:1: ( ( ( rule__Package__KomponentenAssignment_3_0 ) ) | ( ( rule__Package__EntitiesAssignment_3_1 ) ) | ( ( rule__Package__PaketeAssignment_3_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 16:
            case 18:
            case 22:
            case 24:
            case 25:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:457:1: ( ( rule__Package__KomponentenAssignment_3_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:457:1: ( ( rule__Package__KomponentenAssignment_3_0 ) )
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:458:1: ( rule__Package__KomponentenAssignment_3_0 )
                    {
                     before(grammarAccess.getPackageAccess().getKomponentenAssignment_3_0()); 
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:459:1: ( rule__Package__KomponentenAssignment_3_0 )
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:459:2: rule__Package__KomponentenAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Package__KomponentenAssignment_3_0_in_rule__Package__Alternatives_3910);
                    rule__Package__KomponentenAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackageAccess().getKomponentenAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:463:6: ( ( rule__Package__EntitiesAssignment_3_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:463:6: ( ( rule__Package__EntitiesAssignment_3_1 ) )
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:464:1: ( rule__Package__EntitiesAssignment_3_1 )
                    {
                     before(grammarAccess.getPackageAccess().getEntitiesAssignment_3_1()); 
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:465:1: ( rule__Package__EntitiesAssignment_3_1 )
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:465:2: rule__Package__EntitiesAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Package__EntitiesAssignment_3_1_in_rule__Package__Alternatives_3928);
                    rule__Package__EntitiesAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackageAccess().getEntitiesAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:469:6: ( ( rule__Package__PaketeAssignment_3_2 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:469:6: ( ( rule__Package__PaketeAssignment_3_2 ) )
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:470:1: ( rule__Package__PaketeAssignment_3_2 )
                    {
                     before(grammarAccess.getPackageAccess().getPaketeAssignment_3_2()); 
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:471:1: ( rule__Package__PaketeAssignment_3_2 )
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:471:2: rule__Package__PaketeAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__Package__PaketeAssignment_3_2_in_rule__Package__Alternatives_3946);
                    rule__Package__PaketeAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackageAccess().getPaketeAssignment_3_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Alternatives_3"


    // $ANTLR start "rule__EJB__Alternatives"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:480:1: rule__EJB__Alternatives : ( ( ruleSessionBean ) | ( ruleMessageDrivenBean ) | ( ruleBusinessInterface ) );
    public final void rule__EJB__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:484:1: ( ( ruleSessionBean ) | ( ruleMessageDrivenBean ) | ( ruleBusinessInterface ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 18:
            case 22:
            case 25:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:485:1: ( ruleSessionBean )
                    {
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:485:1: ( ruleSessionBean )
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:486:1: ruleSessionBean
                    {
                     before(grammarAccess.getEJBAccess().getSessionBeanParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSessionBean_in_rule__EJB__Alternatives979);
                    ruleSessionBean();

                    state._fsp--;

                     after(grammarAccess.getEJBAccess().getSessionBeanParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:491:6: ( ruleMessageDrivenBean )
                    {
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:491:6: ( ruleMessageDrivenBean )
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:492:1: ruleMessageDrivenBean
                    {
                     before(grammarAccess.getEJBAccess().getMessageDrivenBeanParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMessageDrivenBean_in_rule__EJB__Alternatives996);
                    ruleMessageDrivenBean();

                    state._fsp--;

                     after(grammarAccess.getEJBAccess().getMessageDrivenBeanParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:497:6: ( ruleBusinessInterface )
                    {
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:497:6: ( ruleBusinessInterface )
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:498:1: ruleBusinessInterface
                    {
                     before(grammarAccess.getEJBAccess().getBusinessInterfaceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBusinessInterface_in_rule__EJB__Alternatives1013);
                    ruleBusinessInterface();

                    state._fsp--;

                     after(grammarAccess.getEJBAccess().getBusinessInterfaceParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EJB__Alternatives"


    // $ANTLR start "rule__SessionBean__Alternatives"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:508:1: rule__SessionBean__Alternatives : ( ( ruleStatelessSessionBean ) | ( ruleStatefulSessionBean ) | ( ruleSingletonSessionBean ) );
    public final void rule__SessionBean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:512:1: ( ( ruleStatelessSessionBean ) | ( ruleStatefulSessionBean ) | ( ruleSingletonSessionBean ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:513:1: ( ruleStatelessSessionBean )
                    {
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:513:1: ( ruleStatelessSessionBean )
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:514:1: ruleStatelessSessionBean
                    {
                     before(grammarAccess.getSessionBeanAccess().getStatelessSessionBeanParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStatelessSessionBean_in_rule__SessionBean__Alternatives1045);
                    ruleStatelessSessionBean();

                    state._fsp--;

                     after(grammarAccess.getSessionBeanAccess().getStatelessSessionBeanParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:519:6: ( ruleStatefulSessionBean )
                    {
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:519:6: ( ruleStatefulSessionBean )
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:520:1: ruleStatefulSessionBean
                    {
                     before(grammarAccess.getSessionBeanAccess().getStatefulSessionBeanParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStatefulSessionBean_in_rule__SessionBean__Alternatives1062);
                    ruleStatefulSessionBean();

                    state._fsp--;

                     after(grammarAccess.getSessionBeanAccess().getStatefulSessionBeanParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:525:6: ( ruleSingletonSessionBean )
                    {
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:525:6: ( ruleSingletonSessionBean )
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:526:1: ruleSingletonSessionBean
                    {
                     before(grammarAccess.getSessionBeanAccess().getSingletonSessionBeanParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSingletonSessionBean_in_rule__SessionBean__Alternatives1079);
                    ruleSingletonSessionBean();

                    state._fsp--;

                     after(grammarAccess.getSessionBeanAccess().getSingletonSessionBeanParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SessionBean__Alternatives"


    // $ANTLR start "rule__Architektur__Group__0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:538:1: rule__Architektur__Group__0 : rule__Architektur__Group__0__Impl rule__Architektur__Group__1 ;
    public final void rule__Architektur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:542:1: ( rule__Architektur__Group__0__Impl rule__Architektur__Group__1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:543:2: rule__Architektur__Group__0__Impl rule__Architektur__Group__1
            {
            pushFollow(FOLLOW_rule__Architektur__Group__0__Impl_in_rule__Architektur__Group__01109);
            rule__Architektur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architektur__Group__1_in_rule__Architektur__Group__01112);
            rule__Architektur__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architektur__Group__0"


    // $ANTLR start "rule__Architektur__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:550:1: rule__Architektur__Group__0__Impl : ( 'JavaEEArchitektur:' ) ;
    public final void rule__Architektur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:554:1: ( ( 'JavaEEArchitektur:' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:555:1: ( 'JavaEEArchitektur:' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:555:1: ( 'JavaEEArchitektur:' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:556:1: 'JavaEEArchitektur:'
            {
             before(grammarAccess.getArchitekturAccess().getJavaEEArchitekturKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Architektur__Group__0__Impl1140); 
             after(grammarAccess.getArchitekturAccess().getJavaEEArchitekturKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architektur__Group__0__Impl"


    // $ANTLR start "rule__Architektur__Group__1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:569:1: rule__Architektur__Group__1 : rule__Architektur__Group__1__Impl rule__Architektur__Group__2 ;
    public final void rule__Architektur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:573:1: ( rule__Architektur__Group__1__Impl rule__Architektur__Group__2 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:574:2: rule__Architektur__Group__1__Impl rule__Architektur__Group__2
            {
            pushFollow(FOLLOW_rule__Architektur__Group__1__Impl_in_rule__Architektur__Group__11171);
            rule__Architektur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architektur__Group__2_in_rule__Architektur__Group__11174);
            rule__Architektur__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architektur__Group__1"


    // $ANTLR start "rule__Architektur__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:581:1: rule__Architektur__Group__1__Impl : ( ( rule__Architektur__NameAssignment_1 ) ) ;
    public final void rule__Architektur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:585:1: ( ( ( rule__Architektur__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:586:1: ( ( rule__Architektur__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:586:1: ( ( rule__Architektur__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:587:1: ( rule__Architektur__NameAssignment_1 )
            {
             before(grammarAccess.getArchitekturAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:588:1: ( rule__Architektur__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:588:2: rule__Architektur__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Architektur__NameAssignment_1_in_rule__Architektur__Group__1__Impl1201);
            rule__Architektur__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArchitekturAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architektur__Group__1__Impl"


    // $ANTLR start "rule__Architektur__Group__2"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:598:1: rule__Architektur__Group__2 : rule__Architektur__Group__2__Impl rule__Architektur__Group__3 ;
    public final void rule__Architektur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:602:1: ( rule__Architektur__Group__2__Impl rule__Architektur__Group__3 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:603:2: rule__Architektur__Group__2__Impl rule__Architektur__Group__3
            {
            pushFollow(FOLLOW_rule__Architektur__Group__2__Impl_in_rule__Architektur__Group__21231);
            rule__Architektur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architektur__Group__3_in_rule__Architektur__Group__21234);
            rule__Architektur__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architektur__Group__2"


    // $ANTLR start "rule__Architektur__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:610:1: rule__Architektur__Group__2__Impl : ( ( rule__Architektur__Group_2__0 )? ) ;
    public final void rule__Architektur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:614:1: ( ( ( rule__Architektur__Group_2__0 )? ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:615:1: ( ( rule__Architektur__Group_2__0 )? )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:615:1: ( ( rule__Architektur__Group_2__0 )? )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:616:1: ( rule__Architektur__Group_2__0 )?
            {
             before(grammarAccess.getArchitekturAccess().getGroup_2()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:617:1: ( rule__Architektur__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:617:2: rule__Architektur__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Architektur__Group_2__0_in_rule__Architektur__Group__2__Impl1261);
                    rule__Architektur__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArchitekturAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architektur__Group__2__Impl"


    // $ANTLR start "rule__Architektur__Group__3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:627:1: rule__Architektur__Group__3 : rule__Architektur__Group__3__Impl ;
    public final void rule__Architektur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:631:1: ( rule__Architektur__Group__3__Impl )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:632:2: rule__Architektur__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Architektur__Group__3__Impl_in_rule__Architektur__Group__31292);
            rule__Architektur__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architektur__Group__3"


    // $ANTLR start "rule__Architektur__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:638:1: rule__Architektur__Group__3__Impl : ( ( rule__Architektur__PaketeAssignment_3 )* ) ;
    public final void rule__Architektur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:642:1: ( ( ( rule__Architektur__PaketeAssignment_3 )* ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:643:1: ( ( rule__Architektur__PaketeAssignment_3 )* )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:643:1: ( ( rule__Architektur__PaketeAssignment_3 )* )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:644:1: ( rule__Architektur__PaketeAssignment_3 )*
            {
             before(grammarAccess.getArchitekturAccess().getPaketeAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:645:1: ( rule__Architektur__PaketeAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:645:2: rule__Architektur__PaketeAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Architektur__PaketeAssignment_3_in_rule__Architektur__Group__3__Impl1319);
            	    rule__Architektur__PaketeAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getArchitekturAccess().getPaketeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architektur__Group__3__Impl"


    // $ANTLR start "rule__Architektur__Group_2__0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:663:1: rule__Architektur__Group_2__0 : rule__Architektur__Group_2__0__Impl rule__Architektur__Group_2__1 ;
    public final void rule__Architektur__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:667:1: ( rule__Architektur__Group_2__0__Impl rule__Architektur__Group_2__1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:668:2: rule__Architektur__Group_2__0__Impl rule__Architektur__Group_2__1
            {
            pushFollow(FOLLOW_rule__Architektur__Group_2__0__Impl_in_rule__Architektur__Group_2__01358);
            rule__Architektur__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Architektur__Group_2__1_in_rule__Architektur__Group_2__01361);
            rule__Architektur__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architektur__Group_2__0"


    // $ANTLR start "rule__Architektur__Group_2__0__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:675:1: rule__Architektur__Group_2__0__Impl : ( 'v' ) ;
    public final void rule__Architektur__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:679:1: ( ( 'v' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:680:1: ( 'v' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:680:1: ( 'v' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:681:1: 'v'
            {
             before(grammarAccess.getArchitekturAccess().getVKeyword_2_0()); 
            match(input,12,FOLLOW_12_in_rule__Architektur__Group_2__0__Impl1389); 
             after(grammarAccess.getArchitekturAccess().getVKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architektur__Group_2__0__Impl"


    // $ANTLR start "rule__Architektur__Group_2__1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:694:1: rule__Architektur__Group_2__1 : rule__Architektur__Group_2__1__Impl ;
    public final void rule__Architektur__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:698:1: ( rule__Architektur__Group_2__1__Impl )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:699:2: rule__Architektur__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Architektur__Group_2__1__Impl_in_rule__Architektur__Group_2__11420);
            rule__Architektur__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architektur__Group_2__1"


    // $ANTLR start "rule__Architektur__Group_2__1__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:705:1: rule__Architektur__Group_2__1__Impl : ( ( rule__Architektur__VersionAssignment_2_1 ) ) ;
    public final void rule__Architektur__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:709:1: ( ( ( rule__Architektur__VersionAssignment_2_1 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:710:1: ( ( rule__Architektur__VersionAssignment_2_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:710:1: ( ( rule__Architektur__VersionAssignment_2_1 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:711:1: ( rule__Architektur__VersionAssignment_2_1 )
            {
             before(grammarAccess.getArchitekturAccess().getVersionAssignment_2_1()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:712:1: ( rule__Architektur__VersionAssignment_2_1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:712:2: rule__Architektur__VersionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Architektur__VersionAssignment_2_1_in_rule__Architektur__Group_2__1__Impl1447);
            rule__Architektur__VersionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArchitekturAccess().getVersionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architektur__Group_2__1__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:726:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:730:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:731:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01481);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01484);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:738:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:742:1: ( ( 'package' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:743:1: ( 'package' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:743:1: ( 'package' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:744:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Package__Group__0__Impl1512); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:757:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:761:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:762:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11543);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11546);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:769:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:773:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:774:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:774:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:775:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:776:1: ( rule__Package__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:776:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl1573);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:786:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:790:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:791:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21603);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21606);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:798:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:802:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:803:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:803:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:804:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Package__Group__2__Impl1634); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:817:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:821:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:822:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31665);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31668);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:829:1: rule__Package__Group__3__Impl : ( ( ( rule__Package__Alternatives_3 ) ) ( ( rule__Package__Alternatives_3 )* ) ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:833:1: ( ( ( ( rule__Package__Alternatives_3 ) ) ( ( rule__Package__Alternatives_3 )* ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:834:1: ( ( ( rule__Package__Alternatives_3 ) ) ( ( rule__Package__Alternatives_3 )* ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:834:1: ( ( ( rule__Package__Alternatives_3 ) ) ( ( rule__Package__Alternatives_3 )* ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:835:1: ( ( rule__Package__Alternatives_3 ) ) ( ( rule__Package__Alternatives_3 )* )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:835:1: ( ( rule__Package__Alternatives_3 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:836:1: ( rule__Package__Alternatives_3 )
            {
             before(grammarAccess.getPackageAccess().getAlternatives_3()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:837:1: ( rule__Package__Alternatives_3 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:837:2: rule__Package__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Package__Alternatives_3_in_rule__Package__Group__3__Impl1697);
            rule__Package__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getAlternatives_3()); 

            }

            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:840:1: ( ( rule__Package__Alternatives_3 )* )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:841:1: ( rule__Package__Alternatives_3 )*
            {
             before(grammarAccess.getPackageAccess().getAlternatives_3()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:842:1: ( rule__Package__Alternatives_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13||LA6_0==16||LA6_0==18||(LA6_0>=22 && LA6_0<=25)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:842:2: rule__Package__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__Package__Alternatives_3_in_rule__Package__Group__3__Impl1709);
            	    rule__Package__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getAlternatives_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:853:1: rule__Package__Group__4 : rule__Package__Group__4__Impl ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:857:1: ( rule__Package__Group__4__Impl )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:858:2: rule__Package__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41742);
            rule__Package__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:864:1: rule__Package__Group__4__Impl : ( '}' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:868:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:869:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:869:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:870:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Package__Group__4__Impl1770); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__BusinessInterface__Group__0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:893:1: rule__BusinessInterface__Group__0 : rule__BusinessInterface__Group__0__Impl rule__BusinessInterface__Group__1 ;
    public final void rule__BusinessInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:897:1: ( rule__BusinessInterface__Group__0__Impl rule__BusinessInterface__Group__1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:898:2: rule__BusinessInterface__Group__0__Impl rule__BusinessInterface__Group__1
            {
            pushFollow(FOLLOW_rule__BusinessInterface__Group__0__Impl_in_rule__BusinessInterface__Group__01811);
            rule__BusinessInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessInterface__Group__1_in_rule__BusinessInterface__Group__01814);
            rule__BusinessInterface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessInterface__Group__0"


    // $ANTLR start "rule__BusinessInterface__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:905:1: rule__BusinessInterface__Group__0__Impl : ( 'BusinessInterface' ) ;
    public final void rule__BusinessInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:909:1: ( ( 'BusinessInterface' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:910:1: ( 'BusinessInterface' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:910:1: ( 'BusinessInterface' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:911:1: 'BusinessInterface'
            {
             before(grammarAccess.getBusinessInterfaceAccess().getBusinessInterfaceKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__BusinessInterface__Group__0__Impl1842); 
             after(grammarAccess.getBusinessInterfaceAccess().getBusinessInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessInterface__Group__0__Impl"


    // $ANTLR start "rule__BusinessInterface__Group__1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:924:1: rule__BusinessInterface__Group__1 : rule__BusinessInterface__Group__1__Impl rule__BusinessInterface__Group__2 ;
    public final void rule__BusinessInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:928:1: ( rule__BusinessInterface__Group__1__Impl rule__BusinessInterface__Group__2 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:929:2: rule__BusinessInterface__Group__1__Impl rule__BusinessInterface__Group__2
            {
            pushFollow(FOLLOW_rule__BusinessInterface__Group__1__Impl_in_rule__BusinessInterface__Group__11873);
            rule__BusinessInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessInterface__Group__2_in_rule__BusinessInterface__Group__11876);
            rule__BusinessInterface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessInterface__Group__1"


    // $ANTLR start "rule__BusinessInterface__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:936:1: rule__BusinessInterface__Group__1__Impl : ( ( rule__BusinessInterface__NameAssignment_1 ) ) ;
    public final void rule__BusinessInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:940:1: ( ( ( rule__BusinessInterface__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:941:1: ( ( rule__BusinessInterface__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:941:1: ( ( rule__BusinessInterface__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:942:1: ( rule__BusinessInterface__NameAssignment_1 )
            {
             before(grammarAccess.getBusinessInterfaceAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:943:1: ( rule__BusinessInterface__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:943:2: rule__BusinessInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BusinessInterface__NameAssignment_1_in_rule__BusinessInterface__Group__1__Impl1903);
            rule__BusinessInterface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBusinessInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessInterface__Group__1__Impl"


    // $ANTLR start "rule__BusinessInterface__Group__2"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:953:1: rule__BusinessInterface__Group__2 : rule__BusinessInterface__Group__2__Impl rule__BusinessInterface__Group__3 ;
    public final void rule__BusinessInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:957:1: ( rule__BusinessInterface__Group__2__Impl rule__BusinessInterface__Group__3 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:958:2: rule__BusinessInterface__Group__2__Impl rule__BusinessInterface__Group__3
            {
            pushFollow(FOLLOW_rule__BusinessInterface__Group__2__Impl_in_rule__BusinessInterface__Group__21933);
            rule__BusinessInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessInterface__Group__3_in_rule__BusinessInterface__Group__21936);
            rule__BusinessInterface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessInterface__Group__2"


    // $ANTLR start "rule__BusinessInterface__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:965:1: rule__BusinessInterface__Group__2__Impl : ( '{' ) ;
    public final void rule__BusinessInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:969:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:970:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:970:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:971:1: '{'
            {
             before(grammarAccess.getBusinessInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__BusinessInterface__Group__2__Impl1964); 
             after(grammarAccess.getBusinessInterfaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessInterface__Group__2__Impl"


    // $ANTLR start "rule__BusinessInterface__Group__3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:984:1: rule__BusinessInterface__Group__3 : rule__BusinessInterface__Group__3__Impl rule__BusinessInterface__Group__4 ;
    public final void rule__BusinessInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:988:1: ( rule__BusinessInterface__Group__3__Impl rule__BusinessInterface__Group__4 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:989:2: rule__BusinessInterface__Group__3__Impl rule__BusinessInterface__Group__4
            {
            pushFollow(FOLLOW_rule__BusinessInterface__Group__3__Impl_in_rule__BusinessInterface__Group__31995);
            rule__BusinessInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessInterface__Group__4_in_rule__BusinessInterface__Group__31998);
            rule__BusinessInterface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessInterface__Group__3"


    // $ANTLR start "rule__BusinessInterface__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:996:1: rule__BusinessInterface__Group__3__Impl : ( ( rule__BusinessInterface__MethodenAssignment_3 )* ) ;
    public final void rule__BusinessInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1000:1: ( ( ( rule__BusinessInterface__MethodenAssignment_3 )* ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1001:1: ( ( rule__BusinessInterface__MethodenAssignment_3 )* )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1001:1: ( ( rule__BusinessInterface__MethodenAssignment_3 )* )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1002:1: ( rule__BusinessInterface__MethodenAssignment_3 )*
            {
             before(grammarAccess.getBusinessInterfaceAccess().getMethodenAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1003:1: ( rule__BusinessInterface__MethodenAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1003:2: rule__BusinessInterface__MethodenAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__BusinessInterface__MethodenAssignment_3_in_rule__BusinessInterface__Group__3__Impl2025);
            	    rule__BusinessInterface__MethodenAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBusinessInterfaceAccess().getMethodenAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessInterface__Group__3__Impl"


    // $ANTLR start "rule__BusinessInterface__Group__4"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1013:1: rule__BusinessInterface__Group__4 : rule__BusinessInterface__Group__4__Impl ;
    public final void rule__BusinessInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1017:1: ( rule__BusinessInterface__Group__4__Impl )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1018:2: rule__BusinessInterface__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BusinessInterface__Group__4__Impl_in_rule__BusinessInterface__Group__42056);
            rule__BusinessInterface__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessInterface__Group__4"


    // $ANTLR start "rule__BusinessInterface__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1024:1: rule__BusinessInterface__Group__4__Impl : ( '}' ) ;
    public final void rule__BusinessInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1028:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1029:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1029:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1030:1: '}'
            {
             before(grammarAccess.getBusinessInterfaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__BusinessInterface__Group__4__Impl2084); 
             after(grammarAccess.getBusinessInterfaceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessInterface__Group__4__Impl"


    // $ANTLR start "rule__Methodensignatur__Group__0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1053:1: rule__Methodensignatur__Group__0 : rule__Methodensignatur__Group__0__Impl rule__Methodensignatur__Group__1 ;
    public final void rule__Methodensignatur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1057:1: ( rule__Methodensignatur__Group__0__Impl rule__Methodensignatur__Group__1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1058:2: rule__Methodensignatur__Group__0__Impl rule__Methodensignatur__Group__1
            {
            pushFollow(FOLLOW_rule__Methodensignatur__Group__0__Impl_in_rule__Methodensignatur__Group__02125);
            rule__Methodensignatur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methodensignatur__Group__1_in_rule__Methodensignatur__Group__02128);
            rule__Methodensignatur__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methodensignatur__Group__0"


    // $ANTLR start "rule__Methodensignatur__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1065:1: rule__Methodensignatur__Group__0__Impl : ( ( rule__Methodensignatur__NameAssignment_0 ) ) ;
    public final void rule__Methodensignatur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1069:1: ( ( ( rule__Methodensignatur__NameAssignment_0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1070:1: ( ( rule__Methodensignatur__NameAssignment_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1070:1: ( ( rule__Methodensignatur__NameAssignment_0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1071:1: ( rule__Methodensignatur__NameAssignment_0 )
            {
             before(grammarAccess.getMethodensignaturAccess().getNameAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1072:1: ( rule__Methodensignatur__NameAssignment_0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1072:2: rule__Methodensignatur__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Methodensignatur__NameAssignment_0_in_rule__Methodensignatur__Group__0__Impl2155);
            rule__Methodensignatur__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodensignaturAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methodensignatur__Group__0__Impl"


    // $ANTLR start "rule__Methodensignatur__Group__1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1082:1: rule__Methodensignatur__Group__1 : rule__Methodensignatur__Group__1__Impl ;
    public final void rule__Methodensignatur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1086:1: ( rule__Methodensignatur__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1087:2: rule__Methodensignatur__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Methodensignatur__Group__1__Impl_in_rule__Methodensignatur__Group__12185);
            rule__Methodensignatur__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methodensignatur__Group__1"


    // $ANTLR start "rule__Methodensignatur__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1093:1: rule__Methodensignatur__Group__1__Impl : ( '();' ) ;
    public final void rule__Methodensignatur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1097:1: ( ( '();' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1098:1: ( '();' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1098:1: ( '();' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1099:1: '();'
            {
             before(grammarAccess.getMethodensignaturAccess().getLeftParenthesisRightParenthesisSemicolonKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Methodensignatur__Group__1__Impl2213); 
             after(grammarAccess.getMethodensignaturAccess().getLeftParenthesisRightParenthesisSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methodensignatur__Group__1__Impl"


    // $ANTLR start "rule__StatefulSessionBean__Group__0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1116:1: rule__StatefulSessionBean__Group__0 : rule__StatefulSessionBean__Group__0__Impl rule__StatefulSessionBean__Group__1 ;
    public final void rule__StatefulSessionBean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1120:1: ( rule__StatefulSessionBean__Group__0__Impl rule__StatefulSessionBean__Group__1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1121:2: rule__StatefulSessionBean__Group__0__Impl rule__StatefulSessionBean__Group__1
            {
            pushFollow(FOLLOW_rule__StatefulSessionBean__Group__0__Impl_in_rule__StatefulSessionBean__Group__02248);
            rule__StatefulSessionBean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatefulSessionBean__Group__1_in_rule__StatefulSessionBean__Group__02251);
            rule__StatefulSessionBean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatefulSessionBean__Group__0"


    // $ANTLR start "rule__StatefulSessionBean__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1128:1: rule__StatefulSessionBean__Group__0__Impl : ( 'StatefulSessionBean' ) ;
    public final void rule__StatefulSessionBean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1132:1: ( ( 'StatefulSessionBean' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1133:1: ( 'StatefulSessionBean' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1133:1: ( 'StatefulSessionBean' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1134:1: 'StatefulSessionBean'
            {
             before(grammarAccess.getStatefulSessionBeanAccess().getStatefulSessionBeanKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__StatefulSessionBean__Group__0__Impl2279); 
             after(grammarAccess.getStatefulSessionBeanAccess().getStatefulSessionBeanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatefulSessionBean__Group__0__Impl"


    // $ANTLR start "rule__StatefulSessionBean__Group__1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1147:1: rule__StatefulSessionBean__Group__1 : rule__StatefulSessionBean__Group__1__Impl rule__StatefulSessionBean__Group__2 ;
    public final void rule__StatefulSessionBean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1151:1: ( rule__StatefulSessionBean__Group__1__Impl rule__StatefulSessionBean__Group__2 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1152:2: rule__StatefulSessionBean__Group__1__Impl rule__StatefulSessionBean__Group__2
            {
            pushFollow(FOLLOW_rule__StatefulSessionBean__Group__1__Impl_in_rule__StatefulSessionBean__Group__12310);
            rule__StatefulSessionBean__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatefulSessionBean__Group__2_in_rule__StatefulSessionBean__Group__12313);
            rule__StatefulSessionBean__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatefulSessionBean__Group__1"


    // $ANTLR start "rule__StatefulSessionBean__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1159:1: rule__StatefulSessionBean__Group__1__Impl : ( ( rule__StatefulSessionBean__NameAssignment_1 ) ) ;
    public final void rule__StatefulSessionBean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1163:1: ( ( ( rule__StatefulSessionBean__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1164:1: ( ( rule__StatefulSessionBean__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1164:1: ( ( rule__StatefulSessionBean__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1165:1: ( rule__StatefulSessionBean__NameAssignment_1 )
            {
             before(grammarAccess.getStatefulSessionBeanAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1166:1: ( rule__StatefulSessionBean__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1166:2: rule__StatefulSessionBean__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StatefulSessionBean__NameAssignment_1_in_rule__StatefulSessionBean__Group__1__Impl2340);
            rule__StatefulSessionBean__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatefulSessionBeanAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatefulSessionBean__Group__1__Impl"


    // $ANTLR start "rule__StatefulSessionBean__Group__2"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1176:1: rule__StatefulSessionBean__Group__2 : rule__StatefulSessionBean__Group__2__Impl rule__StatefulSessionBean__Group__3 ;
    public final void rule__StatefulSessionBean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1180:1: ( rule__StatefulSessionBean__Group__2__Impl rule__StatefulSessionBean__Group__3 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1181:2: rule__StatefulSessionBean__Group__2__Impl rule__StatefulSessionBean__Group__3
            {
            pushFollow(FOLLOW_rule__StatefulSessionBean__Group__2__Impl_in_rule__StatefulSessionBean__Group__22370);
            rule__StatefulSessionBean__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatefulSessionBean__Group__3_in_rule__StatefulSessionBean__Group__22373);
            rule__StatefulSessionBean__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatefulSessionBean__Group__2"


    // $ANTLR start "rule__StatefulSessionBean__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1188:1: rule__StatefulSessionBean__Group__2__Impl : ( '{' ) ;
    public final void rule__StatefulSessionBean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1192:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1193:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1193:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1194:1: '{'
            {
             before(grammarAccess.getStatefulSessionBeanAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__StatefulSessionBean__Group__2__Impl2401); 
             after(grammarAccess.getStatefulSessionBeanAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatefulSessionBean__Group__2__Impl"


    // $ANTLR start "rule__StatefulSessionBean__Group__3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1207:1: rule__StatefulSessionBean__Group__3 : rule__StatefulSessionBean__Group__3__Impl rule__StatefulSessionBean__Group__4 ;
    public final void rule__StatefulSessionBean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1211:1: ( rule__StatefulSessionBean__Group__3__Impl rule__StatefulSessionBean__Group__4 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1212:2: rule__StatefulSessionBean__Group__3__Impl rule__StatefulSessionBean__Group__4
            {
            pushFollow(FOLLOW_rule__StatefulSessionBean__Group__3__Impl_in_rule__StatefulSessionBean__Group__32432);
            rule__StatefulSessionBean__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatefulSessionBean__Group__4_in_rule__StatefulSessionBean__Group__32435);
            rule__StatefulSessionBean__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatefulSessionBean__Group__3"


    // $ANTLR start "rule__StatefulSessionBean__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1219:1: rule__StatefulSessionBean__Group__3__Impl : ( ( rule__StatefulSessionBean__AttributeAssignment_3 )* ) ;
    public final void rule__StatefulSessionBean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1223:1: ( ( ( rule__StatefulSessionBean__AttributeAssignment_3 )* ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1224:1: ( ( rule__StatefulSessionBean__AttributeAssignment_3 )* )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1224:1: ( ( rule__StatefulSessionBean__AttributeAssignment_3 )* )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1225:1: ( rule__StatefulSessionBean__AttributeAssignment_3 )*
            {
             before(grammarAccess.getStatefulSessionBeanAccess().getAttributeAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1226:1: ( rule__StatefulSessionBean__AttributeAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1226:2: rule__StatefulSessionBean__AttributeAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__StatefulSessionBean__AttributeAssignment_3_in_rule__StatefulSessionBean__Group__3__Impl2462);
            	    rule__StatefulSessionBean__AttributeAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStatefulSessionBeanAccess().getAttributeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatefulSessionBean__Group__3__Impl"


    // $ANTLR start "rule__StatefulSessionBean__Group__4"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1236:1: rule__StatefulSessionBean__Group__4 : rule__StatefulSessionBean__Group__4__Impl rule__StatefulSessionBean__Group__5 ;
    public final void rule__StatefulSessionBean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1240:1: ( rule__StatefulSessionBean__Group__4__Impl rule__StatefulSessionBean__Group__5 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1241:2: rule__StatefulSessionBean__Group__4__Impl rule__StatefulSessionBean__Group__5
            {
            pushFollow(FOLLOW_rule__StatefulSessionBean__Group__4__Impl_in_rule__StatefulSessionBean__Group__42493);
            rule__StatefulSessionBean__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatefulSessionBean__Group__5_in_rule__StatefulSessionBean__Group__42496);
            rule__StatefulSessionBean__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatefulSessionBean__Group__4"


    // $ANTLR start "rule__StatefulSessionBean__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1248:1: rule__StatefulSessionBean__Group__4__Impl : ( ( rule__StatefulSessionBean__MethodeAssignment_4 )* ) ;
    public final void rule__StatefulSessionBean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1252:1: ( ( ( rule__StatefulSessionBean__MethodeAssignment_4 )* ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1253:1: ( ( rule__StatefulSessionBean__MethodeAssignment_4 )* )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1253:1: ( ( rule__StatefulSessionBean__MethodeAssignment_4 )* )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1254:1: ( rule__StatefulSessionBean__MethodeAssignment_4 )*
            {
             before(grammarAccess.getStatefulSessionBeanAccess().getMethodeAssignment_4()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1255:1: ( rule__StatefulSessionBean__MethodeAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1255:2: rule__StatefulSessionBean__MethodeAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__StatefulSessionBean__MethodeAssignment_4_in_rule__StatefulSessionBean__Group__4__Impl2523);
            	    rule__StatefulSessionBean__MethodeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getStatefulSessionBeanAccess().getMethodeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatefulSessionBean__Group__4__Impl"


    // $ANTLR start "rule__StatefulSessionBean__Group__5"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1265:1: rule__StatefulSessionBean__Group__5 : rule__StatefulSessionBean__Group__5__Impl ;
    public final void rule__StatefulSessionBean__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1269:1: ( rule__StatefulSessionBean__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1270:2: rule__StatefulSessionBean__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StatefulSessionBean__Group__5__Impl_in_rule__StatefulSessionBean__Group__52554);
            rule__StatefulSessionBean__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatefulSessionBean__Group__5"


    // $ANTLR start "rule__StatefulSessionBean__Group__5__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1276:1: rule__StatefulSessionBean__Group__5__Impl : ( '}' ) ;
    public final void rule__StatefulSessionBean__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1280:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1281:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1281:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1282:1: '}'
            {
             before(grammarAccess.getStatefulSessionBeanAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__StatefulSessionBean__Group__5__Impl2582); 
             after(grammarAccess.getStatefulSessionBeanAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatefulSessionBean__Group__5__Impl"


    // $ANTLR start "rule__Attribut__Group__0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1307:1: rule__Attribut__Group__0 : rule__Attribut__Group__0__Impl rule__Attribut__Group__1 ;
    public final void rule__Attribut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1311:1: ( rule__Attribut__Group__0__Impl rule__Attribut__Group__1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1312:2: rule__Attribut__Group__0__Impl rule__Attribut__Group__1
            {
            pushFollow(FOLLOW_rule__Attribut__Group__0__Impl_in_rule__Attribut__Group__02625);
            rule__Attribut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribut__Group__1_in_rule__Attribut__Group__02628);
            rule__Attribut__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__0"


    // $ANTLR start "rule__Attribut__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1319:1: rule__Attribut__Group__0__Impl : ( ( rule__Attribut__TypAssignment_0 ) ) ;
    public final void rule__Attribut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1323:1: ( ( ( rule__Attribut__TypAssignment_0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1324:1: ( ( rule__Attribut__TypAssignment_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1324:1: ( ( rule__Attribut__TypAssignment_0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1325:1: ( rule__Attribut__TypAssignment_0 )
            {
             before(grammarAccess.getAttributAccess().getTypAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1326:1: ( rule__Attribut__TypAssignment_0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1326:2: rule__Attribut__TypAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribut__TypAssignment_0_in_rule__Attribut__Group__0__Impl2655);
            rule__Attribut__TypAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getTypAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__0__Impl"


    // $ANTLR start "rule__Attribut__Group__1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1336:1: rule__Attribut__Group__1 : rule__Attribut__Group__1__Impl rule__Attribut__Group__2 ;
    public final void rule__Attribut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1340:1: ( rule__Attribut__Group__1__Impl rule__Attribut__Group__2 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1341:2: rule__Attribut__Group__1__Impl rule__Attribut__Group__2
            {
            pushFollow(FOLLOW_rule__Attribut__Group__1__Impl_in_rule__Attribut__Group__12685);
            rule__Attribut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribut__Group__2_in_rule__Attribut__Group__12688);
            rule__Attribut__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__1"


    // $ANTLR start "rule__Attribut__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1348:1: rule__Attribut__Group__1__Impl : ( ( rule__Attribut__NameAssignment_1 ) ) ;
    public final void rule__Attribut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1352:1: ( ( ( rule__Attribut__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1353:1: ( ( rule__Attribut__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1353:1: ( ( rule__Attribut__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1354:1: ( rule__Attribut__NameAssignment_1 )
            {
             before(grammarAccess.getAttributAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1355:1: ( rule__Attribut__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1355:2: rule__Attribut__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribut__NameAssignment_1_in_rule__Attribut__Group__1__Impl2715);
            rule__Attribut__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__1__Impl"


    // $ANTLR start "rule__Attribut__Group__2"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1365:1: rule__Attribut__Group__2 : rule__Attribut__Group__2__Impl ;
    public final void rule__Attribut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1369:1: ( rule__Attribut__Group__2__Impl )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1370:2: rule__Attribut__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribut__Group__2__Impl_in_rule__Attribut__Group__22745);
            rule__Attribut__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__2"


    // $ANTLR start "rule__Attribut__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1376:1: rule__Attribut__Group__2__Impl : ( ';' ) ;
    public final void rule__Attribut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1380:1: ( ( ';' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1381:1: ( ';' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1381:1: ( ';' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1382:1: ';'
            {
             before(grammarAccess.getAttributAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Attribut__Group__2__Impl2773); 
             after(grammarAccess.getAttributAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__2__Impl"


    // $ANTLR start "rule__Methode__Group__0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1401:1: rule__Methode__Group__0 : rule__Methode__Group__0__Impl rule__Methode__Group__1 ;
    public final void rule__Methode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1405:1: ( rule__Methode__Group__0__Impl rule__Methode__Group__1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1406:2: rule__Methode__Group__0__Impl rule__Methode__Group__1
            {
            pushFollow(FOLLOW_rule__Methode__Group__0__Impl_in_rule__Methode__Group__02810);
            rule__Methode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__1_in_rule__Methode__Group__02813);
            rule__Methode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__0"


    // $ANTLR start "rule__Methode__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1413:1: rule__Methode__Group__0__Impl : ( ( rule__Methode__NameAssignment_0 ) ) ;
    public final void rule__Methode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1417:1: ( ( ( rule__Methode__NameAssignment_0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1418:1: ( ( rule__Methode__NameAssignment_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1418:1: ( ( rule__Methode__NameAssignment_0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1419:1: ( rule__Methode__NameAssignment_0 )
            {
             before(grammarAccess.getMethodeAccess().getNameAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1420:1: ( rule__Methode__NameAssignment_0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1420:2: rule__Methode__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Methode__NameAssignment_0_in_rule__Methode__Group__0__Impl2840);
            rule__Methode__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__0__Impl"


    // $ANTLR start "rule__Methode__Group__1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1430:1: rule__Methode__Group__1 : rule__Methode__Group__1__Impl rule__Methode__Group__2 ;
    public final void rule__Methode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1434:1: ( rule__Methode__Group__1__Impl rule__Methode__Group__2 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1435:2: rule__Methode__Group__1__Impl rule__Methode__Group__2
            {
            pushFollow(FOLLOW_rule__Methode__Group__1__Impl_in_rule__Methode__Group__12870);
            rule__Methode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__2_in_rule__Methode__Group__12873);
            rule__Methode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__1"


    // $ANTLR start "rule__Methode__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1442:1: rule__Methode__Group__1__Impl : ( '()' ) ;
    public final void rule__Methode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1446:1: ( ( '()' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1447:1: ( '()' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1447:1: ( '()' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1448:1: '()'
            {
             before(grammarAccess.getMethodeAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Methode__Group__1__Impl2901); 
             after(grammarAccess.getMethodeAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__1__Impl"


    // $ANTLR start "rule__Methode__Group__2"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1461:1: rule__Methode__Group__2 : rule__Methode__Group__2__Impl rule__Methode__Group__3 ;
    public final void rule__Methode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1465:1: ( rule__Methode__Group__2__Impl rule__Methode__Group__3 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1466:2: rule__Methode__Group__2__Impl rule__Methode__Group__3
            {
            pushFollow(FOLLOW_rule__Methode__Group__2__Impl_in_rule__Methode__Group__22932);
            rule__Methode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__3_in_rule__Methode__Group__22935);
            rule__Methode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__2"


    // $ANTLR start "rule__Methode__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1473:1: rule__Methode__Group__2__Impl : ( '{' ) ;
    public final void rule__Methode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1477:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1478:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1478:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1479:1: '{'
            {
             before(grammarAccess.getMethodeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Methode__Group__2__Impl2963); 
             after(grammarAccess.getMethodeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__2__Impl"


    // $ANTLR start "rule__Methode__Group__3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1492:1: rule__Methode__Group__3 : rule__Methode__Group__3__Impl rule__Methode__Group__4 ;
    public final void rule__Methode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1496:1: ( rule__Methode__Group__3__Impl rule__Methode__Group__4 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1497:2: rule__Methode__Group__3__Impl rule__Methode__Group__4
            {
            pushFollow(FOLLOW_rule__Methode__Group__3__Impl_in_rule__Methode__Group__32994);
            rule__Methode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Methode__Group__4_in_rule__Methode__Group__32997);
            rule__Methode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__3"


    // $ANTLR start "rule__Methode__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1504:1: rule__Methode__Group__3__Impl : ( ( rule__Methode__AufrufAssignment_3 )* ) ;
    public final void rule__Methode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1508:1: ( ( ( rule__Methode__AufrufAssignment_3 )* ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1509:1: ( ( rule__Methode__AufrufAssignment_3 )* )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1509:1: ( ( rule__Methode__AufrufAssignment_3 )* )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1510:1: ( rule__Methode__AufrufAssignment_3 )*
            {
             before(grammarAccess.getMethodeAccess().getAufrufAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1511:1: ( rule__Methode__AufrufAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1511:2: rule__Methode__AufrufAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Methode__AufrufAssignment_3_in_rule__Methode__Group__3__Impl3024);
            	    rule__Methode__AufrufAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMethodeAccess().getAufrufAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__3__Impl"


    // $ANTLR start "rule__Methode__Group__4"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1521:1: rule__Methode__Group__4 : rule__Methode__Group__4__Impl ;
    public final void rule__Methode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1525:1: ( rule__Methode__Group__4__Impl )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1526:2: rule__Methode__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Methode__Group__4__Impl_in_rule__Methode__Group__43055);
            rule__Methode__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__4"


    // $ANTLR start "rule__Methode__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1532:1: rule__Methode__Group__4__Impl : ( '}' ) ;
    public final void rule__Methode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1536:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1537:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1537:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1538:1: '}'
            {
             before(grammarAccess.getMethodeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Methode__Group__4__Impl3083); 
             after(grammarAccess.getMethodeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__4__Impl"


    // $ANTLR start "rule__Aufruf__Group__0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1561:1: rule__Aufruf__Group__0 : rule__Aufruf__Group__0__Impl rule__Aufruf__Group__1 ;
    public final void rule__Aufruf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1565:1: ( rule__Aufruf__Group__0__Impl rule__Aufruf__Group__1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1566:2: rule__Aufruf__Group__0__Impl rule__Aufruf__Group__1
            {
            pushFollow(FOLLOW_rule__Aufruf__Group__0__Impl_in_rule__Aufruf__Group__03124);
            rule__Aufruf__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aufruf__Group__1_in_rule__Aufruf__Group__03127);
            rule__Aufruf__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aufruf__Group__0"


    // $ANTLR start "rule__Aufruf__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1573:1: rule__Aufruf__Group__0__Impl : ( ( rule__Aufruf__Group_0__0 )? ) ;
    public final void rule__Aufruf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1577:1: ( ( ( rule__Aufruf__Group_0__0 )? ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1578:1: ( ( rule__Aufruf__Group_0__0 )? )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1578:1: ( ( rule__Aufruf__Group_0__0 )? )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1579:1: ( rule__Aufruf__Group_0__0 )?
            {
             before(grammarAccess.getAufrufAccess().getGroup_0()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1580:1: ( rule__Aufruf__Group_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==21) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1580:2: rule__Aufruf__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Aufruf__Group_0__0_in_rule__Aufruf__Group__0__Impl3154);
                    rule__Aufruf__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAufrufAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aufruf__Group__0__Impl"


    // $ANTLR start "rule__Aufruf__Group__1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1590:1: rule__Aufruf__Group__1 : rule__Aufruf__Group__1__Impl ;
    public final void rule__Aufruf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1594:1: ( rule__Aufruf__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1595:2: rule__Aufruf__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Aufruf__Group__1__Impl_in_rule__Aufruf__Group__13185);
            rule__Aufruf__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aufruf__Group__1"


    // $ANTLR start "rule__Aufruf__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1601:1: rule__Aufruf__Group__1__Impl : ( ( rule__Aufruf__MethodeAssignment_1 ) ) ;
    public final void rule__Aufruf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1605:1: ( ( ( rule__Aufruf__MethodeAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1606:1: ( ( rule__Aufruf__MethodeAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1606:1: ( ( rule__Aufruf__MethodeAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1607:1: ( rule__Aufruf__MethodeAssignment_1 )
            {
             before(grammarAccess.getAufrufAccess().getMethodeAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1608:1: ( rule__Aufruf__MethodeAssignment_1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1608:2: rule__Aufruf__MethodeAssignment_1
            {
            pushFollow(FOLLOW_rule__Aufruf__MethodeAssignment_1_in_rule__Aufruf__Group__1__Impl3212);
            rule__Aufruf__MethodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAufrufAccess().getMethodeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aufruf__Group__1__Impl"


    // $ANTLR start "rule__Aufruf__Group_0__0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1622:1: rule__Aufruf__Group_0__0 : rule__Aufruf__Group_0__0__Impl rule__Aufruf__Group_0__1 ;
    public final void rule__Aufruf__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1626:1: ( rule__Aufruf__Group_0__0__Impl rule__Aufruf__Group_0__1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1627:2: rule__Aufruf__Group_0__0__Impl rule__Aufruf__Group_0__1
            {
            pushFollow(FOLLOW_rule__Aufruf__Group_0__0__Impl_in_rule__Aufruf__Group_0__03246);
            rule__Aufruf__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aufruf__Group_0__1_in_rule__Aufruf__Group_0__03249);
            rule__Aufruf__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aufruf__Group_0__0"


    // $ANTLR start "rule__Aufruf__Group_0__0__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1634:1: rule__Aufruf__Group_0__0__Impl : ( ( rule__Aufruf__ObjektAssignment_0_0 ) ) ;
    public final void rule__Aufruf__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1638:1: ( ( ( rule__Aufruf__ObjektAssignment_0_0 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1639:1: ( ( rule__Aufruf__ObjektAssignment_0_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1639:1: ( ( rule__Aufruf__ObjektAssignment_0_0 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1640:1: ( rule__Aufruf__ObjektAssignment_0_0 )
            {
             before(grammarAccess.getAufrufAccess().getObjektAssignment_0_0()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1641:1: ( rule__Aufruf__ObjektAssignment_0_0 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1641:2: rule__Aufruf__ObjektAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Aufruf__ObjektAssignment_0_0_in_rule__Aufruf__Group_0__0__Impl3276);
            rule__Aufruf__ObjektAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAufrufAccess().getObjektAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aufruf__Group_0__0__Impl"


    // $ANTLR start "rule__Aufruf__Group_0__1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1651:1: rule__Aufruf__Group_0__1 : rule__Aufruf__Group_0__1__Impl ;
    public final void rule__Aufruf__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1655:1: ( rule__Aufruf__Group_0__1__Impl )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1656:2: rule__Aufruf__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Aufruf__Group_0__1__Impl_in_rule__Aufruf__Group_0__13306);
            rule__Aufruf__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aufruf__Group_0__1"


    // $ANTLR start "rule__Aufruf__Group_0__1__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1662:1: rule__Aufruf__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Aufruf__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1666:1: ( ( '.' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1667:1: ( '.' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1667:1: ( '.' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1668:1: '.'
            {
             before(grammarAccess.getAufrufAccess().getFullStopKeyword_0_1()); 
            match(input,21,FOLLOW_21_in_rule__Aufruf__Group_0__1__Impl3334); 
             after(grammarAccess.getAufrufAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aufruf__Group_0__1__Impl"


    // $ANTLR start "rule__StatelessSessionBean__Group__0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1685:1: rule__StatelessSessionBean__Group__0 : rule__StatelessSessionBean__Group__0__Impl rule__StatelessSessionBean__Group__1 ;
    public final void rule__StatelessSessionBean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1689:1: ( rule__StatelessSessionBean__Group__0__Impl rule__StatelessSessionBean__Group__1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1690:2: rule__StatelessSessionBean__Group__0__Impl rule__StatelessSessionBean__Group__1
            {
            pushFollow(FOLLOW_rule__StatelessSessionBean__Group__0__Impl_in_rule__StatelessSessionBean__Group__03369);
            rule__StatelessSessionBean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatelessSessionBean__Group__1_in_rule__StatelessSessionBean__Group__03372);
            rule__StatelessSessionBean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatelessSessionBean__Group__0"


    // $ANTLR start "rule__StatelessSessionBean__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1697:1: rule__StatelessSessionBean__Group__0__Impl : ( 'StatelessSessionBean' ) ;
    public final void rule__StatelessSessionBean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1701:1: ( ( 'StatelessSessionBean' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1702:1: ( 'StatelessSessionBean' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1702:1: ( 'StatelessSessionBean' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1703:1: 'StatelessSessionBean'
            {
             before(grammarAccess.getStatelessSessionBeanAccess().getStatelessSessionBeanKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__StatelessSessionBean__Group__0__Impl3400); 
             after(grammarAccess.getStatelessSessionBeanAccess().getStatelessSessionBeanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatelessSessionBean__Group__0__Impl"


    // $ANTLR start "rule__StatelessSessionBean__Group__1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1716:1: rule__StatelessSessionBean__Group__1 : rule__StatelessSessionBean__Group__1__Impl rule__StatelessSessionBean__Group__2 ;
    public final void rule__StatelessSessionBean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1720:1: ( rule__StatelessSessionBean__Group__1__Impl rule__StatelessSessionBean__Group__2 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1721:2: rule__StatelessSessionBean__Group__1__Impl rule__StatelessSessionBean__Group__2
            {
            pushFollow(FOLLOW_rule__StatelessSessionBean__Group__1__Impl_in_rule__StatelessSessionBean__Group__13431);
            rule__StatelessSessionBean__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatelessSessionBean__Group__2_in_rule__StatelessSessionBean__Group__13434);
            rule__StatelessSessionBean__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatelessSessionBean__Group__1"


    // $ANTLR start "rule__StatelessSessionBean__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1728:1: rule__StatelessSessionBean__Group__1__Impl : ( ( rule__StatelessSessionBean__NameAssignment_1 ) ) ;
    public final void rule__StatelessSessionBean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1732:1: ( ( ( rule__StatelessSessionBean__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1733:1: ( ( rule__StatelessSessionBean__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1733:1: ( ( rule__StatelessSessionBean__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1734:1: ( rule__StatelessSessionBean__NameAssignment_1 )
            {
             before(grammarAccess.getStatelessSessionBeanAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1735:1: ( rule__StatelessSessionBean__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1735:2: rule__StatelessSessionBean__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StatelessSessionBean__NameAssignment_1_in_rule__StatelessSessionBean__Group__1__Impl3461);
            rule__StatelessSessionBean__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatelessSessionBeanAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatelessSessionBean__Group__1__Impl"


    // $ANTLR start "rule__StatelessSessionBean__Group__2"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1745:1: rule__StatelessSessionBean__Group__2 : rule__StatelessSessionBean__Group__2__Impl rule__StatelessSessionBean__Group__3 ;
    public final void rule__StatelessSessionBean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1749:1: ( rule__StatelessSessionBean__Group__2__Impl rule__StatelessSessionBean__Group__3 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1750:2: rule__StatelessSessionBean__Group__2__Impl rule__StatelessSessionBean__Group__3
            {
            pushFollow(FOLLOW_rule__StatelessSessionBean__Group__2__Impl_in_rule__StatelessSessionBean__Group__23491);
            rule__StatelessSessionBean__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatelessSessionBean__Group__3_in_rule__StatelessSessionBean__Group__23494);
            rule__StatelessSessionBean__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatelessSessionBean__Group__2"


    // $ANTLR start "rule__StatelessSessionBean__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1757:1: rule__StatelessSessionBean__Group__2__Impl : ( '{' ) ;
    public final void rule__StatelessSessionBean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1761:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1762:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1762:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1763:1: '{'
            {
             before(grammarAccess.getStatelessSessionBeanAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__StatelessSessionBean__Group__2__Impl3522); 
             after(grammarAccess.getStatelessSessionBeanAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatelessSessionBean__Group__2__Impl"


    // $ANTLR start "rule__StatelessSessionBean__Group__3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1776:1: rule__StatelessSessionBean__Group__3 : rule__StatelessSessionBean__Group__3__Impl rule__StatelessSessionBean__Group__4 ;
    public final void rule__StatelessSessionBean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1780:1: ( rule__StatelessSessionBean__Group__3__Impl rule__StatelessSessionBean__Group__4 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1781:2: rule__StatelessSessionBean__Group__3__Impl rule__StatelessSessionBean__Group__4
            {
            pushFollow(FOLLOW_rule__StatelessSessionBean__Group__3__Impl_in_rule__StatelessSessionBean__Group__33553);
            rule__StatelessSessionBean__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatelessSessionBean__Group__4_in_rule__StatelessSessionBean__Group__33556);
            rule__StatelessSessionBean__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatelessSessionBean__Group__3"


    // $ANTLR start "rule__StatelessSessionBean__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1788:1: rule__StatelessSessionBean__Group__3__Impl : ( ( rule__StatelessSessionBean__MethodeAssignment_3 )* ) ;
    public final void rule__StatelessSessionBean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1792:1: ( ( ( rule__StatelessSessionBean__MethodeAssignment_3 )* ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1793:1: ( ( rule__StatelessSessionBean__MethodeAssignment_3 )* )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1793:1: ( ( rule__StatelessSessionBean__MethodeAssignment_3 )* )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1794:1: ( rule__StatelessSessionBean__MethodeAssignment_3 )*
            {
             before(grammarAccess.getStatelessSessionBeanAccess().getMethodeAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1795:1: ( rule__StatelessSessionBean__MethodeAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1795:2: rule__StatelessSessionBean__MethodeAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__StatelessSessionBean__MethodeAssignment_3_in_rule__StatelessSessionBean__Group__3__Impl3583);
            	    rule__StatelessSessionBean__MethodeAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getStatelessSessionBeanAccess().getMethodeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatelessSessionBean__Group__3__Impl"


    // $ANTLR start "rule__StatelessSessionBean__Group__4"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1805:1: rule__StatelessSessionBean__Group__4 : rule__StatelessSessionBean__Group__4__Impl ;
    public final void rule__StatelessSessionBean__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1809:1: ( rule__StatelessSessionBean__Group__4__Impl )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1810:2: rule__StatelessSessionBean__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StatelessSessionBean__Group__4__Impl_in_rule__StatelessSessionBean__Group__43614);
            rule__StatelessSessionBean__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatelessSessionBean__Group__4"


    // $ANTLR start "rule__StatelessSessionBean__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1816:1: rule__StatelessSessionBean__Group__4__Impl : ( '}' ) ;
    public final void rule__StatelessSessionBean__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1820:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1821:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1821:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1822:1: '}'
            {
             before(grammarAccess.getStatelessSessionBeanAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__StatelessSessionBean__Group__4__Impl3642); 
             after(grammarAccess.getStatelessSessionBeanAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatelessSessionBean__Group__4__Impl"


    // $ANTLR start "rule__JPAEntity__Group__0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1845:1: rule__JPAEntity__Group__0 : rule__JPAEntity__Group__0__Impl rule__JPAEntity__Group__1 ;
    public final void rule__JPAEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1849:1: ( rule__JPAEntity__Group__0__Impl rule__JPAEntity__Group__1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1850:2: rule__JPAEntity__Group__0__Impl rule__JPAEntity__Group__1
            {
            pushFollow(FOLLOW_rule__JPAEntity__Group__0__Impl_in_rule__JPAEntity__Group__03683);
            rule__JPAEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JPAEntity__Group__1_in_rule__JPAEntity__Group__03686);
            rule__JPAEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JPAEntity__Group__0"


    // $ANTLR start "rule__JPAEntity__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1857:1: rule__JPAEntity__Group__0__Impl : ( 'JPAEntity' ) ;
    public final void rule__JPAEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1861:1: ( ( 'JPAEntity' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1862:1: ( 'JPAEntity' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1862:1: ( 'JPAEntity' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1863:1: 'JPAEntity'
            {
             before(grammarAccess.getJPAEntityAccess().getJPAEntityKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__JPAEntity__Group__0__Impl3714); 
             after(grammarAccess.getJPAEntityAccess().getJPAEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JPAEntity__Group__0__Impl"


    // $ANTLR start "rule__JPAEntity__Group__1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1876:1: rule__JPAEntity__Group__1 : rule__JPAEntity__Group__1__Impl rule__JPAEntity__Group__2 ;
    public final void rule__JPAEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1880:1: ( rule__JPAEntity__Group__1__Impl rule__JPAEntity__Group__2 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1881:2: rule__JPAEntity__Group__1__Impl rule__JPAEntity__Group__2
            {
            pushFollow(FOLLOW_rule__JPAEntity__Group__1__Impl_in_rule__JPAEntity__Group__13745);
            rule__JPAEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JPAEntity__Group__2_in_rule__JPAEntity__Group__13748);
            rule__JPAEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JPAEntity__Group__1"


    // $ANTLR start "rule__JPAEntity__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1888:1: rule__JPAEntity__Group__1__Impl : ( ( rule__JPAEntity__NameAssignment_1 ) ) ;
    public final void rule__JPAEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1892:1: ( ( ( rule__JPAEntity__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1893:1: ( ( rule__JPAEntity__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1893:1: ( ( rule__JPAEntity__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1894:1: ( rule__JPAEntity__NameAssignment_1 )
            {
             before(grammarAccess.getJPAEntityAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1895:1: ( rule__JPAEntity__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1895:2: rule__JPAEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__JPAEntity__NameAssignment_1_in_rule__JPAEntity__Group__1__Impl3775);
            rule__JPAEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJPAEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JPAEntity__Group__1__Impl"


    // $ANTLR start "rule__JPAEntity__Group__2"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1905:1: rule__JPAEntity__Group__2 : rule__JPAEntity__Group__2__Impl rule__JPAEntity__Group__3 ;
    public final void rule__JPAEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1909:1: ( rule__JPAEntity__Group__2__Impl rule__JPAEntity__Group__3 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1910:2: rule__JPAEntity__Group__2__Impl rule__JPAEntity__Group__3
            {
            pushFollow(FOLLOW_rule__JPAEntity__Group__2__Impl_in_rule__JPAEntity__Group__23805);
            rule__JPAEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JPAEntity__Group__3_in_rule__JPAEntity__Group__23808);
            rule__JPAEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JPAEntity__Group__2"


    // $ANTLR start "rule__JPAEntity__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1917:1: rule__JPAEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__JPAEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1921:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1922:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1922:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1923:1: '{'
            {
             before(grammarAccess.getJPAEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__JPAEntity__Group__2__Impl3836); 
             after(grammarAccess.getJPAEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JPAEntity__Group__2__Impl"


    // $ANTLR start "rule__JPAEntity__Group__3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1936:1: rule__JPAEntity__Group__3 : rule__JPAEntity__Group__3__Impl rule__JPAEntity__Group__4 ;
    public final void rule__JPAEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1940:1: ( rule__JPAEntity__Group__3__Impl rule__JPAEntity__Group__4 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1941:2: rule__JPAEntity__Group__3__Impl rule__JPAEntity__Group__4
            {
            pushFollow(FOLLOW_rule__JPAEntity__Group__3__Impl_in_rule__JPAEntity__Group__33867);
            rule__JPAEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JPAEntity__Group__4_in_rule__JPAEntity__Group__33870);
            rule__JPAEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JPAEntity__Group__3"


    // $ANTLR start "rule__JPAEntity__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1948:1: rule__JPAEntity__Group__3__Impl : ( ( rule__JPAEntity__AttributeAssignment_3 )* ) ;
    public final void rule__JPAEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1952:1: ( ( ( rule__JPAEntity__AttributeAssignment_3 )* ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1953:1: ( ( rule__JPAEntity__AttributeAssignment_3 )* )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1953:1: ( ( rule__JPAEntity__AttributeAssignment_3 )* )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1954:1: ( rule__JPAEntity__AttributeAssignment_3 )*
            {
             before(grammarAccess.getJPAEntityAccess().getAttributeAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1955:1: ( rule__JPAEntity__AttributeAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==RULE_ID) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1955:2: rule__JPAEntity__AttributeAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__JPAEntity__AttributeAssignment_3_in_rule__JPAEntity__Group__3__Impl3897);
            	    rule__JPAEntity__AttributeAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getJPAEntityAccess().getAttributeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JPAEntity__Group__3__Impl"


    // $ANTLR start "rule__JPAEntity__Group__4"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1965:1: rule__JPAEntity__Group__4 : rule__JPAEntity__Group__4__Impl rule__JPAEntity__Group__5 ;
    public final void rule__JPAEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1969:1: ( rule__JPAEntity__Group__4__Impl rule__JPAEntity__Group__5 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1970:2: rule__JPAEntity__Group__4__Impl rule__JPAEntity__Group__5
            {
            pushFollow(FOLLOW_rule__JPAEntity__Group__4__Impl_in_rule__JPAEntity__Group__43928);
            rule__JPAEntity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JPAEntity__Group__5_in_rule__JPAEntity__Group__43931);
            rule__JPAEntity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JPAEntity__Group__4"


    // $ANTLR start "rule__JPAEntity__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1977:1: rule__JPAEntity__Group__4__Impl : ( ( rule__JPAEntity__MethodeAssignment_4 )* ) ;
    public final void rule__JPAEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1981:1: ( ( ( rule__JPAEntity__MethodeAssignment_4 )* ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1982:1: ( ( rule__JPAEntity__MethodeAssignment_4 )* )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1982:1: ( ( rule__JPAEntity__MethodeAssignment_4 )* )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1983:1: ( rule__JPAEntity__MethodeAssignment_4 )*
            {
             before(grammarAccess.getJPAEntityAccess().getMethodeAssignment_4()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1984:1: ( rule__JPAEntity__MethodeAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1984:2: rule__JPAEntity__MethodeAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__JPAEntity__MethodeAssignment_4_in_rule__JPAEntity__Group__4__Impl3958);
            	    rule__JPAEntity__MethodeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getJPAEntityAccess().getMethodeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JPAEntity__Group__4__Impl"


    // $ANTLR start "rule__JPAEntity__Group__5"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1994:1: rule__JPAEntity__Group__5 : rule__JPAEntity__Group__5__Impl ;
    public final void rule__JPAEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1998:1: ( rule__JPAEntity__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:1999:2: rule__JPAEntity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__JPAEntity__Group__5__Impl_in_rule__JPAEntity__Group__53989);
            rule__JPAEntity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JPAEntity__Group__5"


    // $ANTLR start "rule__JPAEntity__Group__5__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2005:1: rule__JPAEntity__Group__5__Impl : ( '}' ) ;
    public final void rule__JPAEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2009:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2010:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2010:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2011:1: '}'
            {
             before(grammarAccess.getJPAEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__JPAEntity__Group__5__Impl4017); 
             after(grammarAccess.getJPAEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JPAEntity__Group__5__Impl"


    // $ANTLR start "rule__MessageDrivenBean__Group__0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2036:1: rule__MessageDrivenBean__Group__0 : rule__MessageDrivenBean__Group__0__Impl rule__MessageDrivenBean__Group__1 ;
    public final void rule__MessageDrivenBean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2040:1: ( rule__MessageDrivenBean__Group__0__Impl rule__MessageDrivenBean__Group__1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2041:2: rule__MessageDrivenBean__Group__0__Impl rule__MessageDrivenBean__Group__1
            {
            pushFollow(FOLLOW_rule__MessageDrivenBean__Group__0__Impl_in_rule__MessageDrivenBean__Group__04060);
            rule__MessageDrivenBean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageDrivenBean__Group__1_in_rule__MessageDrivenBean__Group__04063);
            rule__MessageDrivenBean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDrivenBean__Group__0"


    // $ANTLR start "rule__MessageDrivenBean__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2048:1: rule__MessageDrivenBean__Group__0__Impl : ( 'MessageDrivenBean' ) ;
    public final void rule__MessageDrivenBean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2052:1: ( ( 'MessageDrivenBean' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2053:1: ( 'MessageDrivenBean' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2053:1: ( 'MessageDrivenBean' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2054:1: 'MessageDrivenBean'
            {
             before(grammarAccess.getMessageDrivenBeanAccess().getMessageDrivenBeanKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__MessageDrivenBean__Group__0__Impl4091); 
             after(grammarAccess.getMessageDrivenBeanAccess().getMessageDrivenBeanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDrivenBean__Group__0__Impl"


    // $ANTLR start "rule__MessageDrivenBean__Group__1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2067:1: rule__MessageDrivenBean__Group__1 : rule__MessageDrivenBean__Group__1__Impl rule__MessageDrivenBean__Group__2 ;
    public final void rule__MessageDrivenBean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2071:1: ( rule__MessageDrivenBean__Group__1__Impl rule__MessageDrivenBean__Group__2 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2072:2: rule__MessageDrivenBean__Group__1__Impl rule__MessageDrivenBean__Group__2
            {
            pushFollow(FOLLOW_rule__MessageDrivenBean__Group__1__Impl_in_rule__MessageDrivenBean__Group__14122);
            rule__MessageDrivenBean__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageDrivenBean__Group__2_in_rule__MessageDrivenBean__Group__14125);
            rule__MessageDrivenBean__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDrivenBean__Group__1"


    // $ANTLR start "rule__MessageDrivenBean__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2079:1: rule__MessageDrivenBean__Group__1__Impl : ( ( rule__MessageDrivenBean__NameAssignment_1 ) ) ;
    public final void rule__MessageDrivenBean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2083:1: ( ( ( rule__MessageDrivenBean__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2084:1: ( ( rule__MessageDrivenBean__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2084:1: ( ( rule__MessageDrivenBean__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2085:1: ( rule__MessageDrivenBean__NameAssignment_1 )
            {
             before(grammarAccess.getMessageDrivenBeanAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2086:1: ( rule__MessageDrivenBean__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2086:2: rule__MessageDrivenBean__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MessageDrivenBean__NameAssignment_1_in_rule__MessageDrivenBean__Group__1__Impl4152);
            rule__MessageDrivenBean__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageDrivenBeanAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDrivenBean__Group__1__Impl"


    // $ANTLR start "rule__MessageDrivenBean__Group__2"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2096:1: rule__MessageDrivenBean__Group__2 : rule__MessageDrivenBean__Group__2__Impl rule__MessageDrivenBean__Group__3 ;
    public final void rule__MessageDrivenBean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2100:1: ( rule__MessageDrivenBean__Group__2__Impl rule__MessageDrivenBean__Group__3 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2101:2: rule__MessageDrivenBean__Group__2__Impl rule__MessageDrivenBean__Group__3
            {
            pushFollow(FOLLOW_rule__MessageDrivenBean__Group__2__Impl_in_rule__MessageDrivenBean__Group__24182);
            rule__MessageDrivenBean__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageDrivenBean__Group__3_in_rule__MessageDrivenBean__Group__24185);
            rule__MessageDrivenBean__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDrivenBean__Group__2"


    // $ANTLR start "rule__MessageDrivenBean__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2108:1: rule__MessageDrivenBean__Group__2__Impl : ( '{' ) ;
    public final void rule__MessageDrivenBean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2112:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2113:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2113:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2114:1: '{'
            {
             before(grammarAccess.getMessageDrivenBeanAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__MessageDrivenBean__Group__2__Impl4213); 
             after(grammarAccess.getMessageDrivenBeanAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDrivenBean__Group__2__Impl"


    // $ANTLR start "rule__MessageDrivenBean__Group__3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2127:1: rule__MessageDrivenBean__Group__3 : rule__MessageDrivenBean__Group__3__Impl ;
    public final void rule__MessageDrivenBean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2131:1: ( rule__MessageDrivenBean__Group__3__Impl )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2132:2: rule__MessageDrivenBean__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MessageDrivenBean__Group__3__Impl_in_rule__MessageDrivenBean__Group__34244);
            rule__MessageDrivenBean__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDrivenBean__Group__3"


    // $ANTLR start "rule__MessageDrivenBean__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2138:1: rule__MessageDrivenBean__Group__3__Impl : ( '}' ) ;
    public final void rule__MessageDrivenBean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2142:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2143:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2143:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2144:1: '}'
            {
             before(grammarAccess.getMessageDrivenBeanAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__MessageDrivenBean__Group__3__Impl4272); 
             after(grammarAccess.getMessageDrivenBeanAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDrivenBean__Group__3__Impl"


    // $ANTLR start "rule__SingletonSessionBean__Group__0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2165:1: rule__SingletonSessionBean__Group__0 : rule__SingletonSessionBean__Group__0__Impl rule__SingletonSessionBean__Group__1 ;
    public final void rule__SingletonSessionBean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2169:1: ( rule__SingletonSessionBean__Group__0__Impl rule__SingletonSessionBean__Group__1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2170:2: rule__SingletonSessionBean__Group__0__Impl rule__SingletonSessionBean__Group__1
            {
            pushFollow(FOLLOW_rule__SingletonSessionBean__Group__0__Impl_in_rule__SingletonSessionBean__Group__04311);
            rule__SingletonSessionBean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingletonSessionBean__Group__1_in_rule__SingletonSessionBean__Group__04314);
            rule__SingletonSessionBean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingletonSessionBean__Group__0"


    // $ANTLR start "rule__SingletonSessionBean__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2177:1: rule__SingletonSessionBean__Group__0__Impl : ( 'SingletonSessionBean' ) ;
    public final void rule__SingletonSessionBean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2181:1: ( ( 'SingletonSessionBean' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2182:1: ( 'SingletonSessionBean' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2182:1: ( 'SingletonSessionBean' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2183:1: 'SingletonSessionBean'
            {
             before(grammarAccess.getSingletonSessionBeanAccess().getSingletonSessionBeanKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__SingletonSessionBean__Group__0__Impl4342); 
             after(grammarAccess.getSingletonSessionBeanAccess().getSingletonSessionBeanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingletonSessionBean__Group__0__Impl"


    // $ANTLR start "rule__SingletonSessionBean__Group__1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2196:1: rule__SingletonSessionBean__Group__1 : rule__SingletonSessionBean__Group__1__Impl rule__SingletonSessionBean__Group__2 ;
    public final void rule__SingletonSessionBean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2200:1: ( rule__SingletonSessionBean__Group__1__Impl rule__SingletonSessionBean__Group__2 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2201:2: rule__SingletonSessionBean__Group__1__Impl rule__SingletonSessionBean__Group__2
            {
            pushFollow(FOLLOW_rule__SingletonSessionBean__Group__1__Impl_in_rule__SingletonSessionBean__Group__14373);
            rule__SingletonSessionBean__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingletonSessionBean__Group__2_in_rule__SingletonSessionBean__Group__14376);
            rule__SingletonSessionBean__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingletonSessionBean__Group__1"


    // $ANTLR start "rule__SingletonSessionBean__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2208:1: rule__SingletonSessionBean__Group__1__Impl : ( ( rule__SingletonSessionBean__NameAssignment_1 ) ) ;
    public final void rule__SingletonSessionBean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2212:1: ( ( ( rule__SingletonSessionBean__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2213:1: ( ( rule__SingletonSessionBean__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2213:1: ( ( rule__SingletonSessionBean__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2214:1: ( rule__SingletonSessionBean__NameAssignment_1 )
            {
             before(grammarAccess.getSingletonSessionBeanAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2215:1: ( rule__SingletonSessionBean__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2215:2: rule__SingletonSessionBean__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SingletonSessionBean__NameAssignment_1_in_rule__SingletonSessionBean__Group__1__Impl4403);
            rule__SingletonSessionBean__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingletonSessionBeanAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingletonSessionBean__Group__1__Impl"


    // $ANTLR start "rule__SingletonSessionBean__Group__2"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2225:1: rule__SingletonSessionBean__Group__2 : rule__SingletonSessionBean__Group__2__Impl rule__SingletonSessionBean__Group__3 ;
    public final void rule__SingletonSessionBean__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2229:1: ( rule__SingletonSessionBean__Group__2__Impl rule__SingletonSessionBean__Group__3 )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2230:2: rule__SingletonSessionBean__Group__2__Impl rule__SingletonSessionBean__Group__3
            {
            pushFollow(FOLLOW_rule__SingletonSessionBean__Group__2__Impl_in_rule__SingletonSessionBean__Group__24433);
            rule__SingletonSessionBean__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingletonSessionBean__Group__3_in_rule__SingletonSessionBean__Group__24436);
            rule__SingletonSessionBean__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingletonSessionBean__Group__2"


    // $ANTLR start "rule__SingletonSessionBean__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2237:1: rule__SingletonSessionBean__Group__2__Impl : ( '{' ) ;
    public final void rule__SingletonSessionBean__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2241:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2242:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2242:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2243:1: '{'
            {
             before(grammarAccess.getSingletonSessionBeanAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__SingletonSessionBean__Group__2__Impl4464); 
             after(grammarAccess.getSingletonSessionBeanAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingletonSessionBean__Group__2__Impl"


    // $ANTLR start "rule__SingletonSessionBean__Group__3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2256:1: rule__SingletonSessionBean__Group__3 : rule__SingletonSessionBean__Group__3__Impl ;
    public final void rule__SingletonSessionBean__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2260:1: ( rule__SingletonSessionBean__Group__3__Impl )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2261:2: rule__SingletonSessionBean__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SingletonSessionBean__Group__3__Impl_in_rule__SingletonSessionBean__Group__34495);
            rule__SingletonSessionBean__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingletonSessionBean__Group__3"


    // $ANTLR start "rule__SingletonSessionBean__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2267:1: rule__SingletonSessionBean__Group__3__Impl : ( '}' ) ;
    public final void rule__SingletonSessionBean__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2271:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2272:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2272:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2273:1: '}'
            {
             before(grammarAccess.getSingletonSessionBeanAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__SingletonSessionBean__Group__3__Impl4523); 
             after(grammarAccess.getSingletonSessionBeanAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingletonSessionBean__Group__3__Impl"


    // $ANTLR start "rule__Architektur__NameAssignment_1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2295:1: rule__Architektur__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Architektur__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2299:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2300:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2300:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2301:1: RULE_ID
            {
             before(grammarAccess.getArchitekturAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Architektur__NameAssignment_14567); 
             after(grammarAccess.getArchitekturAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architektur__NameAssignment_1"


    // $ANTLR start "rule__Architektur__VersionAssignment_2_1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2310:1: rule__Architektur__VersionAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Architektur__VersionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2314:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2315:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2315:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2316:1: RULE_ID
            {
             before(grammarAccess.getArchitekturAccess().getVersionIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Architektur__VersionAssignment_2_14598); 
             after(grammarAccess.getArchitekturAccess().getVersionIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architektur__VersionAssignment_2_1"


    // $ANTLR start "rule__Architektur__PaketeAssignment_3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2325:1: rule__Architektur__PaketeAssignment_3 : ( rulePackage ) ;
    public final void rule__Architektur__PaketeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2329:1: ( ( rulePackage ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2330:1: ( rulePackage )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2330:1: ( rulePackage )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2331:1: rulePackage
            {
             before(grammarAccess.getArchitekturAccess().getPaketePackageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Architektur__PaketeAssignment_34629);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getArchitekturAccess().getPaketePackageParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architektur__PaketeAssignment_3"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2340:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2344:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2345:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2345:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2346:1: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_14660); 
             after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Package__KomponentenAssignment_3_0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2355:1: rule__Package__KomponentenAssignment_3_0 : ( ruleEJB ) ;
    public final void rule__Package__KomponentenAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2359:1: ( ( ruleEJB ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2360:1: ( ruleEJB )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2360:1: ( ruleEJB )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2361:1: ruleEJB
            {
             before(grammarAccess.getPackageAccess().getKomponentenEJBParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleEJB_in_rule__Package__KomponentenAssignment_3_04691);
            ruleEJB();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getKomponentenEJBParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__KomponentenAssignment_3_0"


    // $ANTLR start "rule__Package__EntitiesAssignment_3_1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2370:1: rule__Package__EntitiesAssignment_3_1 : ( ruleJPAEntity ) ;
    public final void rule__Package__EntitiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2374:1: ( ( ruleJPAEntity ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2375:1: ( ruleJPAEntity )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2375:1: ( ruleJPAEntity )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2376:1: ruleJPAEntity
            {
             before(grammarAccess.getPackageAccess().getEntitiesJPAEntityParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleJPAEntity_in_rule__Package__EntitiesAssignment_3_14722);
            ruleJPAEntity();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getEntitiesJPAEntityParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__EntitiesAssignment_3_1"


    // $ANTLR start "rule__Package__PaketeAssignment_3_2"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2385:1: rule__Package__PaketeAssignment_3_2 : ( rulePackage ) ;
    public final void rule__Package__PaketeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2389:1: ( ( rulePackage ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2390:1: ( rulePackage )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2390:1: ( rulePackage )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2391:1: rulePackage
            {
             before(grammarAccess.getPackageAccess().getPaketePackageParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Package__PaketeAssignment_3_24753);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getPaketePackageParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__PaketeAssignment_3_2"


    // $ANTLR start "rule__BusinessInterface__NameAssignment_1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2400:1: rule__BusinessInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BusinessInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2404:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2405:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2405:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2406:1: RULE_ID
            {
             before(grammarAccess.getBusinessInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessInterface__NameAssignment_14784); 
             after(grammarAccess.getBusinessInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessInterface__NameAssignment_1"


    // $ANTLR start "rule__BusinessInterface__MethodenAssignment_3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2415:1: rule__BusinessInterface__MethodenAssignment_3 : ( ruleMethodensignatur ) ;
    public final void rule__BusinessInterface__MethodenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2419:1: ( ( ruleMethodensignatur ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2420:1: ( ruleMethodensignatur )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2420:1: ( ruleMethodensignatur )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2421:1: ruleMethodensignatur
            {
             before(grammarAccess.getBusinessInterfaceAccess().getMethodenMethodensignaturParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMethodensignatur_in_rule__BusinessInterface__MethodenAssignment_34815);
            ruleMethodensignatur();

            state._fsp--;

             after(grammarAccess.getBusinessInterfaceAccess().getMethodenMethodensignaturParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BusinessInterface__MethodenAssignment_3"


    // $ANTLR start "rule__Methodensignatur__NameAssignment_0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2430:1: rule__Methodensignatur__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Methodensignatur__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2434:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2435:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2435:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2436:1: RULE_ID
            {
             before(grammarAccess.getMethodensignaturAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Methodensignatur__NameAssignment_04846); 
             after(grammarAccess.getMethodensignaturAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methodensignatur__NameAssignment_0"


    // $ANTLR start "rule__StatefulSessionBean__NameAssignment_1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2445:1: rule__StatefulSessionBean__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StatefulSessionBean__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2449:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2450:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2450:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2451:1: RULE_ID
            {
             before(grammarAccess.getStatefulSessionBeanAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StatefulSessionBean__NameAssignment_14877); 
             after(grammarAccess.getStatefulSessionBeanAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatefulSessionBean__NameAssignment_1"


    // $ANTLR start "rule__StatefulSessionBean__AttributeAssignment_3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2460:1: rule__StatefulSessionBean__AttributeAssignment_3 : ( ruleAttribut ) ;
    public final void rule__StatefulSessionBean__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2464:1: ( ( ruleAttribut ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2465:1: ( ruleAttribut )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2465:1: ( ruleAttribut )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2466:1: ruleAttribut
            {
             before(grammarAccess.getStatefulSessionBeanAccess().getAttributeAttributParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttribut_in_rule__StatefulSessionBean__AttributeAssignment_34908);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getStatefulSessionBeanAccess().getAttributeAttributParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatefulSessionBean__AttributeAssignment_3"


    // $ANTLR start "rule__StatefulSessionBean__MethodeAssignment_4"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2475:1: rule__StatefulSessionBean__MethodeAssignment_4 : ( ruleMethode ) ;
    public final void rule__StatefulSessionBean__MethodeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2479:1: ( ( ruleMethode ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2480:1: ( ruleMethode )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2480:1: ( ruleMethode )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2481:1: ruleMethode
            {
             before(grammarAccess.getStatefulSessionBeanAccess().getMethodeMethodeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMethode_in_rule__StatefulSessionBean__MethodeAssignment_44939);
            ruleMethode();

            state._fsp--;

             after(grammarAccess.getStatefulSessionBeanAccess().getMethodeMethodeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatefulSessionBean__MethodeAssignment_4"


    // $ANTLR start "rule__Attribut__TypAssignment_0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2490:1: rule__Attribut__TypAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribut__TypAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2494:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2495:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2495:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2496:1: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getTypIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribut__TypAssignment_04970); 
             after(grammarAccess.getAttributAccess().getTypIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__TypAssignment_0"


    // $ANTLR start "rule__Attribut__NameAssignment_1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2505:1: rule__Attribut__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2509:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2510:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2510:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2511:1: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribut__NameAssignment_15001); 
             after(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__NameAssignment_1"


    // $ANTLR start "rule__Methode__NameAssignment_0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2520:1: rule__Methode__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Methode__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2524:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2525:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2525:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2526:1: RULE_ID
            {
             before(grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Methode__NameAssignment_05032); 
             after(grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__NameAssignment_0"


    // $ANTLR start "rule__Methode__AufrufAssignment_3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2535:1: rule__Methode__AufrufAssignment_3 : ( ruleAufruf ) ;
    public final void rule__Methode__AufrufAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2539:1: ( ( ruleAufruf ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2540:1: ( ruleAufruf )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2540:1: ( ruleAufruf )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2541:1: ruleAufruf
            {
             before(grammarAccess.getMethodeAccess().getAufrufAufrufParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAufruf_in_rule__Methode__AufrufAssignment_35063);
            ruleAufruf();

            state._fsp--;

             after(grammarAccess.getMethodeAccess().getAufrufAufrufParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__AufrufAssignment_3"


    // $ANTLR start "rule__Aufruf__ObjektAssignment_0_0"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2550:1: rule__Aufruf__ObjektAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Aufruf__ObjektAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2554:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2555:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2555:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2556:1: RULE_ID
            {
             before(grammarAccess.getAufrufAccess().getObjektIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Aufruf__ObjektAssignment_0_05094); 
             after(grammarAccess.getAufrufAccess().getObjektIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aufruf__ObjektAssignment_0_0"


    // $ANTLR start "rule__Aufruf__MethodeAssignment_1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2565:1: rule__Aufruf__MethodeAssignment_1 : ( ruleMethodensignatur ) ;
    public final void rule__Aufruf__MethodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2569:1: ( ( ruleMethodensignatur ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2570:1: ( ruleMethodensignatur )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2570:1: ( ruleMethodensignatur )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2571:1: ruleMethodensignatur
            {
             before(grammarAccess.getAufrufAccess().getMethodeMethodensignaturParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMethodensignatur_in_rule__Aufruf__MethodeAssignment_15125);
            ruleMethodensignatur();

            state._fsp--;

             after(grammarAccess.getAufrufAccess().getMethodeMethodensignaturParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aufruf__MethodeAssignment_1"


    // $ANTLR start "rule__StatelessSessionBean__NameAssignment_1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2580:1: rule__StatelessSessionBean__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StatelessSessionBean__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2584:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2585:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2585:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2586:1: RULE_ID
            {
             before(grammarAccess.getStatelessSessionBeanAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StatelessSessionBean__NameAssignment_15156); 
             after(grammarAccess.getStatelessSessionBeanAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatelessSessionBean__NameAssignment_1"


    // $ANTLR start "rule__StatelessSessionBean__MethodeAssignment_3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2595:1: rule__StatelessSessionBean__MethodeAssignment_3 : ( ruleMethode ) ;
    public final void rule__StatelessSessionBean__MethodeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2599:1: ( ( ruleMethode ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2600:1: ( ruleMethode )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2600:1: ( ruleMethode )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2601:1: ruleMethode
            {
             before(grammarAccess.getStatelessSessionBeanAccess().getMethodeMethodeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMethode_in_rule__StatelessSessionBean__MethodeAssignment_35187);
            ruleMethode();

            state._fsp--;

             after(grammarAccess.getStatelessSessionBeanAccess().getMethodeMethodeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatelessSessionBean__MethodeAssignment_3"


    // $ANTLR start "rule__JPAEntity__NameAssignment_1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2610:1: rule__JPAEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__JPAEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2614:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2615:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2615:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2616:1: RULE_ID
            {
             before(grammarAccess.getJPAEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JPAEntity__NameAssignment_15218); 
             after(grammarAccess.getJPAEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JPAEntity__NameAssignment_1"


    // $ANTLR start "rule__JPAEntity__AttributeAssignment_3"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2625:1: rule__JPAEntity__AttributeAssignment_3 : ( ruleAttribut ) ;
    public final void rule__JPAEntity__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2629:1: ( ( ruleAttribut ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2630:1: ( ruleAttribut )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2630:1: ( ruleAttribut )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2631:1: ruleAttribut
            {
             before(grammarAccess.getJPAEntityAccess().getAttributeAttributParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttribut_in_rule__JPAEntity__AttributeAssignment_35249);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getJPAEntityAccess().getAttributeAttributParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JPAEntity__AttributeAssignment_3"


    // $ANTLR start "rule__JPAEntity__MethodeAssignment_4"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2640:1: rule__JPAEntity__MethodeAssignment_4 : ( ruleMethode ) ;
    public final void rule__JPAEntity__MethodeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2644:1: ( ( ruleMethode ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2645:1: ( ruleMethode )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2645:1: ( ruleMethode )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2646:1: ruleMethode
            {
             before(grammarAccess.getJPAEntityAccess().getMethodeMethodeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMethode_in_rule__JPAEntity__MethodeAssignment_45280);
            ruleMethode();

            state._fsp--;

             after(grammarAccess.getJPAEntityAccess().getMethodeMethodeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JPAEntity__MethodeAssignment_4"


    // $ANTLR start "rule__MessageDrivenBean__NameAssignment_1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2655:1: rule__MessageDrivenBean__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MessageDrivenBean__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2659:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2660:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2660:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2661:1: RULE_ID
            {
             before(grammarAccess.getMessageDrivenBeanAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageDrivenBean__NameAssignment_15311); 
             after(grammarAccess.getMessageDrivenBeanAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDrivenBean__NameAssignment_1"


    // $ANTLR start "rule__SingletonSessionBean__NameAssignment_1"
    // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2670:1: rule__SingletonSessionBean__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SingletonSessionBean__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2674:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2675:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2675:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur.ui/src-gen/de/uniba/wiai/seda/fha/swarchitektur/ui/contentassist/antlr/internal/InternalSwarchitektur.g:2676:1: RULE_ID
            {
             before(grammarAccess.getSingletonSessionBeanAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SingletonSessionBean__NameAssignment_15342); 
             after(grammarAccess.getSingletonSessionBeanAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingletonSessionBean__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleArchitektur_in_entryRuleArchitektur61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitektur68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architektur__Group__0_in_ruleArchitektur94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEJB_in_entryRuleEJB181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEJB188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EJB__Alternatives_in_ruleEJB214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSessionBean_in_entryRuleSessionBean241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSessionBean248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SessionBean__Alternatives_in_ruleSessionBean274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessInterface_in_entryRuleBusinessInterface301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessInterface308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessInterface__Group__0_in_ruleBusinessInterface334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodensignatur_in_entryRuleMethodensignatur361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodensignatur368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methodensignatur__Group__0_in_ruleMethodensignatur394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatefulSessionBean_in_entryRuleStatefulSessionBean421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatefulSessionBean428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatefulSessionBean__Group__0_in_ruleStatefulSessionBean454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_entryRuleAttribut481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribut488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__0_in_ruleAttribut514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethode_in_entryRuleMethode541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethode548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__0_in_ruleMethode574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAufruf_in_entryRuleAufruf601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAufruf608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aufruf__Group__0_in_ruleAufruf634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatelessSessionBean_in_entryRuleStatelessSessionBean661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatelessSessionBean668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatelessSessionBean__Group__0_in_ruleStatelessSessionBean694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJPAEntity_in_entryRuleJPAEntity721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJPAEntity728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JPAEntity__Group__0_in_ruleJPAEntity754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageDrivenBean_in_entryRuleMessageDrivenBean781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageDrivenBean788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDrivenBean__Group__0_in_ruleMessageDrivenBean814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingletonSessionBean_in_entryRuleSingletonSessionBean841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingletonSessionBean848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingletonSessionBean__Group__0_in_ruleSingletonSessionBean874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__KomponentenAssignment_3_0_in_rule__Package__Alternatives_3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__EntitiesAssignment_3_1_in_rule__Package__Alternatives_3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__PaketeAssignment_3_2_in_rule__Package__Alternatives_3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSessionBean_in_rule__EJB__Alternatives979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageDrivenBean_in_rule__EJB__Alternatives996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessInterface_in_rule__EJB__Alternatives1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatelessSessionBean_in_rule__SessionBean__Alternatives1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatefulSessionBean_in_rule__SessionBean__Alternatives1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingletonSessionBean_in_rule__SessionBean__Alternatives1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architektur__Group__0__Impl_in_rule__Architektur__Group__01109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Architektur__Group__1_in_rule__Architektur__Group__01112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Architektur__Group__0__Impl1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architektur__Group__1__Impl_in_rule__Architektur__Group__11171 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Architektur__Group__2_in_rule__Architektur__Group__11174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architektur__NameAssignment_1_in_rule__Architektur__Group__1__Impl1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architektur__Group__2__Impl_in_rule__Architektur__Group__21231 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Architektur__Group__3_in_rule__Architektur__Group__21234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architektur__Group_2__0_in_rule__Architektur__Group__2__Impl1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architektur__Group__3__Impl_in_rule__Architektur__Group__31292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architektur__PaketeAssignment_3_in_rule__Architektur__Group__3__Impl1319 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Architektur__Group_2__0__Impl_in_rule__Architektur__Group_2__01358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Architektur__Group_2__1_in_rule__Architektur__Group_2__01361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Architektur__Group_2__0__Impl1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architektur__Group_2__1__Impl_in_rule__Architektur__Group_2__11420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Architektur__VersionAssignment_2_1_in_rule__Architektur__Group_2__1__Impl1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Package__Group__0__Impl1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11543 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21603 = new BitSet(new long[]{0x0000000003C52000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Package__Group__2__Impl1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31665 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Alternatives_3_in_rule__Package__Group__3__Impl1697 = new BitSet(new long[]{0x0000000003C52002L});
    public static final BitSet FOLLOW_rule__Package__Alternatives_3_in_rule__Package__Group__3__Impl1709 = new BitSet(new long[]{0x0000000003C52002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Package__Group__4__Impl1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessInterface__Group__0__Impl_in_rule__BusinessInterface__Group__01811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BusinessInterface__Group__1_in_rule__BusinessInterface__Group__01814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BusinessInterface__Group__0__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessInterface__Group__1__Impl_in_rule__BusinessInterface__Group__11873 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__BusinessInterface__Group__2_in_rule__BusinessInterface__Group__11876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessInterface__NameAssignment_1_in_rule__BusinessInterface__Group__1__Impl1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessInterface__Group__2__Impl_in_rule__BusinessInterface__Group__21933 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__BusinessInterface__Group__3_in_rule__BusinessInterface__Group__21936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BusinessInterface__Group__2__Impl1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessInterface__Group__3__Impl_in_rule__BusinessInterface__Group__31995 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__BusinessInterface__Group__4_in_rule__BusinessInterface__Group__31998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessInterface__MethodenAssignment_3_in_rule__BusinessInterface__Group__3__Impl2025 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__BusinessInterface__Group__4__Impl_in_rule__BusinessInterface__Group__42056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BusinessInterface__Group__4__Impl2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methodensignatur__Group__0__Impl_in_rule__Methodensignatur__Group__02125 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Methodensignatur__Group__1_in_rule__Methodensignatur__Group__02128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methodensignatur__NameAssignment_0_in_rule__Methodensignatur__Group__0__Impl2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methodensignatur__Group__1__Impl_in_rule__Methodensignatur__Group__12185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Methodensignatur__Group__1__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatefulSessionBean__Group__0__Impl_in_rule__StatefulSessionBean__Group__02248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StatefulSessionBean__Group__1_in_rule__StatefulSessionBean__Group__02251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StatefulSessionBean__Group__0__Impl2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatefulSessionBean__Group__1__Impl_in_rule__StatefulSessionBean__Group__12310 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__StatefulSessionBean__Group__2_in_rule__StatefulSessionBean__Group__12313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatefulSessionBean__NameAssignment_1_in_rule__StatefulSessionBean__Group__1__Impl2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatefulSessionBean__Group__2__Impl_in_rule__StatefulSessionBean__Group__22370 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__StatefulSessionBean__Group__3_in_rule__StatefulSessionBean__Group__22373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StatefulSessionBean__Group__2__Impl2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatefulSessionBean__Group__3__Impl_in_rule__StatefulSessionBean__Group__32432 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__StatefulSessionBean__Group__4_in_rule__StatefulSessionBean__Group__32435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatefulSessionBean__AttributeAssignment_3_in_rule__StatefulSessionBean__Group__3__Impl2462 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__StatefulSessionBean__Group__4__Impl_in_rule__StatefulSessionBean__Group__42493 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__StatefulSessionBean__Group__5_in_rule__StatefulSessionBean__Group__42496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatefulSessionBean__MethodeAssignment_4_in_rule__StatefulSessionBean__Group__4__Impl2523 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__StatefulSessionBean__Group__5__Impl_in_rule__StatefulSessionBean__Group__52554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__StatefulSessionBean__Group__5__Impl2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__0__Impl_in_rule__Attribut__Group__02625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribut__Group__1_in_rule__Attribut__Group__02628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__TypAssignment_0_in_rule__Attribut__Group__0__Impl2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__1__Impl_in_rule__Attribut__Group__12685 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Attribut__Group__2_in_rule__Attribut__Group__12688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__NameAssignment_1_in_rule__Attribut__Group__1__Impl2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__2__Impl_in_rule__Attribut__Group__22745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Attribut__Group__2__Impl2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__0__Impl_in_rule__Methode__Group__02810 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Methode__Group__1_in_rule__Methode__Group__02813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__NameAssignment_0_in_rule__Methode__Group__0__Impl2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__1__Impl_in_rule__Methode__Group__12870 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Methode__Group__2_in_rule__Methode__Group__12873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Methode__Group__1__Impl2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__2__Impl_in_rule__Methode__Group__22932 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Methode__Group__3_in_rule__Methode__Group__22935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Methode__Group__2__Impl2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__Group__3__Impl_in_rule__Methode__Group__32994 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Methode__Group__4_in_rule__Methode__Group__32997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Methode__AufrufAssignment_3_in_rule__Methode__Group__3__Impl3024 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Methode__Group__4__Impl_in_rule__Methode__Group__43055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Methode__Group__4__Impl3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aufruf__Group__0__Impl_in_rule__Aufruf__Group__03124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Aufruf__Group__1_in_rule__Aufruf__Group__03127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aufruf__Group_0__0_in_rule__Aufruf__Group__0__Impl3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aufruf__Group__1__Impl_in_rule__Aufruf__Group__13185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aufruf__MethodeAssignment_1_in_rule__Aufruf__Group__1__Impl3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aufruf__Group_0__0__Impl_in_rule__Aufruf__Group_0__03246 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Aufruf__Group_0__1_in_rule__Aufruf__Group_0__03249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aufruf__ObjektAssignment_0_0_in_rule__Aufruf__Group_0__0__Impl3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aufruf__Group_0__1__Impl_in_rule__Aufruf__Group_0__13306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Aufruf__Group_0__1__Impl3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatelessSessionBean__Group__0__Impl_in_rule__StatelessSessionBean__Group__03369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StatelessSessionBean__Group__1_in_rule__StatelessSessionBean__Group__03372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StatelessSessionBean__Group__0__Impl3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatelessSessionBean__Group__1__Impl_in_rule__StatelessSessionBean__Group__13431 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__StatelessSessionBean__Group__2_in_rule__StatelessSessionBean__Group__13434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatelessSessionBean__NameAssignment_1_in_rule__StatelessSessionBean__Group__1__Impl3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatelessSessionBean__Group__2__Impl_in_rule__StatelessSessionBean__Group__23491 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__StatelessSessionBean__Group__3_in_rule__StatelessSessionBean__Group__23494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StatelessSessionBean__Group__2__Impl3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatelessSessionBean__Group__3__Impl_in_rule__StatelessSessionBean__Group__33553 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__StatelessSessionBean__Group__4_in_rule__StatelessSessionBean__Group__33556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatelessSessionBean__MethodeAssignment_3_in_rule__StatelessSessionBean__Group__3__Impl3583 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__StatelessSessionBean__Group__4__Impl_in_rule__StatelessSessionBean__Group__43614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__StatelessSessionBean__Group__4__Impl3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JPAEntity__Group__0__Impl_in_rule__JPAEntity__Group__03683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JPAEntity__Group__1_in_rule__JPAEntity__Group__03686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__JPAEntity__Group__0__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JPAEntity__Group__1__Impl_in_rule__JPAEntity__Group__13745 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__JPAEntity__Group__2_in_rule__JPAEntity__Group__13748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JPAEntity__NameAssignment_1_in_rule__JPAEntity__Group__1__Impl3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JPAEntity__Group__2__Impl_in_rule__JPAEntity__Group__23805 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__JPAEntity__Group__3_in_rule__JPAEntity__Group__23808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__JPAEntity__Group__2__Impl3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JPAEntity__Group__3__Impl_in_rule__JPAEntity__Group__33867 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__JPAEntity__Group__4_in_rule__JPAEntity__Group__33870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JPAEntity__AttributeAssignment_3_in_rule__JPAEntity__Group__3__Impl3897 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__JPAEntity__Group__4__Impl_in_rule__JPAEntity__Group__43928 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__JPAEntity__Group__5_in_rule__JPAEntity__Group__43931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JPAEntity__MethodeAssignment_4_in_rule__JPAEntity__Group__4__Impl3958 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__JPAEntity__Group__5__Impl_in_rule__JPAEntity__Group__53989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__JPAEntity__Group__5__Impl4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDrivenBean__Group__0__Impl_in_rule__MessageDrivenBean__Group__04060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageDrivenBean__Group__1_in_rule__MessageDrivenBean__Group__04063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MessageDrivenBean__Group__0__Impl4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDrivenBean__Group__1__Impl_in_rule__MessageDrivenBean__Group__14122 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MessageDrivenBean__Group__2_in_rule__MessageDrivenBean__Group__14125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDrivenBean__NameAssignment_1_in_rule__MessageDrivenBean__Group__1__Impl4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDrivenBean__Group__2__Impl_in_rule__MessageDrivenBean__Group__24182 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__MessageDrivenBean__Group__3_in_rule__MessageDrivenBean__Group__24185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MessageDrivenBean__Group__2__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageDrivenBean__Group__3__Impl_in_rule__MessageDrivenBean__Group__34244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MessageDrivenBean__Group__3__Impl4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingletonSessionBean__Group__0__Impl_in_rule__SingletonSessionBean__Group__04311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SingletonSessionBean__Group__1_in_rule__SingletonSessionBean__Group__04314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SingletonSessionBean__Group__0__Impl4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingletonSessionBean__Group__1__Impl_in_rule__SingletonSessionBean__Group__14373 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SingletonSessionBean__Group__2_in_rule__SingletonSessionBean__Group__14376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingletonSessionBean__NameAssignment_1_in_rule__SingletonSessionBean__Group__1__Impl4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingletonSessionBean__Group__2__Impl_in_rule__SingletonSessionBean__Group__24433 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SingletonSessionBean__Group__3_in_rule__SingletonSessionBean__Group__24436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SingletonSessionBean__Group__2__Impl4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingletonSessionBean__Group__3__Impl_in_rule__SingletonSessionBean__Group__34495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SingletonSessionBean__Group__3__Impl4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Architektur__NameAssignment_14567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Architektur__VersionAssignment_2_14598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Architektur__PaketeAssignment_34629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_14660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEJB_in_rule__Package__KomponentenAssignment_3_04691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJPAEntity_in_rule__Package__EntitiesAssignment_3_14722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Package__PaketeAssignment_3_24753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessInterface__NameAssignment_14784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodensignatur_in_rule__BusinessInterface__MethodenAssignment_34815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Methodensignatur__NameAssignment_04846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StatefulSessionBean__NameAssignment_14877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_rule__StatefulSessionBean__AttributeAssignment_34908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethode_in_rule__StatefulSessionBean__MethodeAssignment_44939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribut__TypAssignment_04970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribut__NameAssignment_15001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Methode__NameAssignment_05032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAufruf_in_rule__Methode__AufrufAssignment_35063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Aufruf__ObjektAssignment_0_05094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodensignatur_in_rule__Aufruf__MethodeAssignment_15125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StatelessSessionBean__NameAssignment_15156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethode_in_rule__StatelessSessionBean__MethodeAssignment_35187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JPAEntity__NameAssignment_15218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_rule__JPAEntity__AttributeAssignment_35249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethode_in_rule__JPAEntity__MethodeAssignment_45280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageDrivenBean__NameAssignment_15311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SingletonSessionBean__NameAssignment_15342 = new BitSet(new long[]{0x0000000000000002L});

}