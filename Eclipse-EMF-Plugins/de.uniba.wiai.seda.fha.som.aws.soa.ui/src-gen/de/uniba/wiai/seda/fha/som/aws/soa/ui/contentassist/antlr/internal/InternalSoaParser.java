package de.uniba.wiai.seda.fha.som.aws.soa.ui.contentassist.antlr.internal; 

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
import de.uniba.wiai.seda.fha.som.aws.soa.services.SoaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSoaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VERSION_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'--'", "'(0,1)'", "'->'", "'(0,*)'", "'=='", "'(1,1)'", "'=>'", "'(1,*)'", "'SOA-AwS:'", "'v'", "'Vorgangsservice'", "'{'", "'}'", "'VOT'", "'('", "');'", "'Workflow'", "';'", "')'", "'.'", "'Entityservice'", "'KOT'", "'OOT'", "'LOT'", "'TOT'", "'interacts_with:'", "'is_a:'", "'is_part_of:'", "'@name'", "'@merge'", "'@ignore'", "'@version'", "'Interface'", "'VOS'", "'KOS'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_VERSION_NUMBER=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalSoaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSoaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSoaParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g"; }


     
     	private SoaGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SoaGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSOA_AwS"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:60:1: entryRuleSOA_AwS : ruleSOA_AwS EOF ;
    public final void entryRuleSOA_AwS() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:61:1: ( ruleSOA_AwS EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:62:1: ruleSOA_AwS EOF
            {
             before(grammarAccess.getSOA_AwSRule()); 
            pushFollow(FOLLOW_ruleSOA_AwS_in_entryRuleSOA_AwS61);
            ruleSOA_AwS();

            state._fsp--;

             after(grammarAccess.getSOA_AwSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSOA_AwS68); 

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
    // $ANTLR end "entryRuleSOA_AwS"


    // $ANTLR start "ruleSOA_AwS"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:69:1: ruleSOA_AwS : ( ( rule__SOA_AwS__Group__0 ) ) ;
    public final void ruleSOA_AwS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:73:2: ( ( ( rule__SOA_AwS__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:74:1: ( ( rule__SOA_AwS__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:74:1: ( ( rule__SOA_AwS__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:75:1: ( rule__SOA_AwS__Group__0 )
            {
             before(grammarAccess.getSOA_AwSAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:76:1: ( rule__SOA_AwS__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:76:2: rule__SOA_AwS__Group__0
            {
            pushFollow(FOLLOW_rule__SOA_AwS__Group__0_in_ruleSOA_AwS94);
            rule__SOA_AwS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSOA_AwSAccess().getGroup()); 

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
    // $ANTLR end "ruleSOA_AwS"


    // $ANTLR start "entryRuleVorgangsservice"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:90:1: entryRuleVorgangsservice : ruleVorgangsservice EOF ;
    public final void entryRuleVorgangsservice() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:91:1: ( ruleVorgangsservice EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:92:1: ruleVorgangsservice EOF
            {
             before(grammarAccess.getVorgangsserviceRule()); 
            pushFollow(FOLLOW_ruleVorgangsservice_in_entryRuleVorgangsservice123);
            ruleVorgangsservice();

            state._fsp--;

             after(grammarAccess.getVorgangsserviceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVorgangsservice130); 

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
    // $ANTLR end "entryRuleVorgangsservice"


    // $ANTLR start "ruleVorgangsservice"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:99:1: ruleVorgangsservice : ( ( rule__Vorgangsservice__Group__0 ) ) ;
    public final void ruleVorgangsservice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:103:2: ( ( ( rule__Vorgangsservice__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:104:1: ( ( rule__Vorgangsservice__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:104:1: ( ( rule__Vorgangsservice__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:105:1: ( rule__Vorgangsservice__Group__0 )
            {
             before(grammarAccess.getVorgangsserviceAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:106:1: ( rule__Vorgangsservice__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:106:2: rule__Vorgangsservice__Group__0
            {
            pushFollow(FOLLOW_rule__Vorgangsservice__Group__0_in_ruleVorgangsservice156);
            rule__Vorgangsservice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVorgangsserviceAccess().getGroup()); 

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
    // $ANTLR end "ruleVorgangsservice"


    // $ANTLR start "entryRuleVorgangsserviceElementar"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:118:1: entryRuleVorgangsserviceElementar : ruleVorgangsserviceElementar EOF ;
    public final void entryRuleVorgangsserviceElementar() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:119:1: ( ruleVorgangsserviceElementar EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:120:1: ruleVorgangsserviceElementar EOF
            {
             before(grammarAccess.getVorgangsserviceElementarRule()); 
            pushFollow(FOLLOW_ruleVorgangsserviceElementar_in_entryRuleVorgangsserviceElementar183);
            ruleVorgangsserviceElementar();

            state._fsp--;

             after(grammarAccess.getVorgangsserviceElementarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVorgangsserviceElementar190); 

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
    // $ANTLR end "entryRuleVorgangsserviceElementar"


    // $ANTLR start "ruleVorgangsserviceElementar"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:127:1: ruleVorgangsserviceElementar : ( ( rule__VorgangsserviceElementar__Group__0 ) ) ;
    public final void ruleVorgangsserviceElementar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:131:2: ( ( ( rule__VorgangsserviceElementar__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:132:1: ( ( rule__VorgangsserviceElementar__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:132:1: ( ( rule__VorgangsserviceElementar__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:133:1: ( rule__VorgangsserviceElementar__Group__0 )
            {
             before(grammarAccess.getVorgangsserviceElementarAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:134:1: ( rule__VorgangsserviceElementar__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:134:2: rule__VorgangsserviceElementar__Group__0
            {
            pushFollow(FOLLOW_rule__VorgangsserviceElementar__Group__0_in_ruleVorgangsserviceElementar216);
            rule__VorgangsserviceElementar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVorgangsserviceElementarAccess().getGroup()); 

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
    // $ANTLR end "ruleVorgangsserviceElementar"


    // $ANTLR start "entryRuleInterface"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:146:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:147:1: ( ruleInterface EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:148:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface243);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface250); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:155:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:159:2: ( ( ( rule__Interface__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:160:1: ( ( rule__Interface__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:160:1: ( ( rule__Interface__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:161:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:162:1: ( rule__Interface__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:162:2: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_rule__Interface__Group__0_in_ruleInterface276);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleServiceMethode"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:174:1: entryRuleServiceMethode : ruleServiceMethode EOF ;
    public final void entryRuleServiceMethode() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:175:1: ( ruleServiceMethode EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:176:1: ruleServiceMethode EOF
            {
             before(grammarAccess.getServiceMethodeRule()); 
            pushFollow(FOLLOW_ruleServiceMethode_in_entryRuleServiceMethode303);
            ruleServiceMethode();

            state._fsp--;

             after(grammarAccess.getServiceMethodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceMethode310); 

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
    // $ANTLR end "entryRuleServiceMethode"


    // $ANTLR start "ruleServiceMethode"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:183:1: ruleServiceMethode : ( ( rule__ServiceMethode__Group__0 ) ) ;
    public final void ruleServiceMethode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:187:2: ( ( ( rule__ServiceMethode__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:188:1: ( ( rule__ServiceMethode__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:188:1: ( ( rule__ServiceMethode__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:189:1: ( rule__ServiceMethode__Group__0 )
            {
             before(grammarAccess.getServiceMethodeAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:190:1: ( rule__ServiceMethode__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:190:2: rule__ServiceMethode__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceMethode__Group__0_in_ruleServiceMethode336);
            rule__ServiceMethode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceMethodeAccess().getGroup()); 

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
    // $ANTLR end "ruleServiceMethode"


    // $ANTLR start "entryRuleWorkflow"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:202:1: entryRuleWorkflow : ruleWorkflow EOF ;
    public final void entryRuleWorkflow() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:203:1: ( ruleWorkflow EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:204:1: ruleWorkflow EOF
            {
             before(grammarAccess.getWorkflowRule()); 
            pushFollow(FOLLOW_ruleWorkflow_in_entryRuleWorkflow363);
            ruleWorkflow();

            state._fsp--;

             after(grammarAccess.getWorkflowRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflow370); 

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
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:211:1: ruleWorkflow : ( ( rule__Workflow__Group__0 ) ) ;
    public final void ruleWorkflow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:215:2: ( ( ( rule__Workflow__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:216:1: ( ( rule__Workflow__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:216:1: ( ( rule__Workflow__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:217:1: ( rule__Workflow__Group__0 )
            {
             before(grammarAccess.getWorkflowAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:218:1: ( rule__Workflow__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:218:2: rule__Workflow__Group__0
            {
            pushFollow(FOLLOW_rule__Workflow__Group__0_in_ruleWorkflow396);
            rule__Workflow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleOrchestrierung"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:230:1: entryRuleOrchestrierung : ruleOrchestrierung EOF ;
    public final void entryRuleOrchestrierung() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:231:1: ( ruleOrchestrierung EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:232:1: ruleOrchestrierung EOF
            {
             before(grammarAccess.getOrchestrierungRule()); 
            pushFollow(FOLLOW_ruleOrchestrierung_in_entryRuleOrchestrierung423);
            ruleOrchestrierung();

            state._fsp--;

             after(grammarAccess.getOrchestrierungRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrchestrierung430); 

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
    // $ANTLR end "entryRuleOrchestrierung"


    // $ANTLR start "ruleOrchestrierung"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:239:1: ruleOrchestrierung : ( ( rule__Orchestrierung__Group__0 ) ) ;
    public final void ruleOrchestrierung() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:243:2: ( ( ( rule__Orchestrierung__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:244:1: ( ( rule__Orchestrierung__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:244:1: ( ( rule__Orchestrierung__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:245:1: ( rule__Orchestrierung__Group__0 )
            {
             before(grammarAccess.getOrchestrierungAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:246:1: ( rule__Orchestrierung__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:246:2: rule__Orchestrierung__Group__0
            {
            pushFollow(FOLLOW_rule__Orchestrierung__Group__0_in_ruleOrchestrierung456);
            rule__Orchestrierung__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrchestrierungAccess().getGroup()); 

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
    // $ANTLR end "ruleOrchestrierung"


    // $ANTLR start "entryRuleChoreographieLokal"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:258:1: entryRuleChoreographieLokal : ruleChoreographieLokal EOF ;
    public final void entryRuleChoreographieLokal() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:259:1: ( ruleChoreographieLokal EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:260:1: ruleChoreographieLokal EOF
            {
             before(grammarAccess.getChoreographieLokalRule()); 
            pushFollow(FOLLOW_ruleChoreographieLokal_in_entryRuleChoreographieLokal483);
            ruleChoreographieLokal();

            state._fsp--;

             after(grammarAccess.getChoreographieLokalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoreographieLokal490); 

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
    // $ANTLR end "entryRuleChoreographieLokal"


    // $ANTLR start "ruleChoreographieLokal"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:267:1: ruleChoreographieLokal : ( ( rule__ChoreographieLokal__Group__0 ) ) ;
    public final void ruleChoreographieLokal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:271:2: ( ( ( rule__ChoreographieLokal__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:272:1: ( ( rule__ChoreographieLokal__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:272:1: ( ( rule__ChoreographieLokal__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:273:1: ( rule__ChoreographieLokal__Group__0 )
            {
             before(grammarAccess.getChoreographieLokalAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:274:1: ( rule__ChoreographieLokal__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:274:2: rule__ChoreographieLokal__Group__0
            {
            pushFollow(FOLLOW_rule__ChoreographieLokal__Group__0_in_ruleChoreographieLokal516);
            rule__ChoreographieLokal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoreographieLokalAccess().getGroup()); 

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
    // $ANTLR end "ruleChoreographieLokal"


    // $ANTLR start "entryRuleBedingung"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:286:1: entryRuleBedingung : ruleBedingung EOF ;
    public final void entryRuleBedingung() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:287:1: ( ruleBedingung EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:288:1: ruleBedingung EOF
            {
             before(grammarAccess.getBedingungRule()); 
            pushFollow(FOLLOW_ruleBedingung_in_entryRuleBedingung543);
            ruleBedingung();

            state._fsp--;

             after(grammarAccess.getBedingungRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBedingung550); 

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
    // $ANTLR end "entryRuleBedingung"


    // $ANTLR start "ruleBedingung"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:295:1: ruleBedingung : ( ( rule__Bedingung__BedingungAssignment ) ) ;
    public final void ruleBedingung() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:299:2: ( ( ( rule__Bedingung__BedingungAssignment ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:300:1: ( ( rule__Bedingung__BedingungAssignment ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:300:1: ( ( rule__Bedingung__BedingungAssignment ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:301:1: ( rule__Bedingung__BedingungAssignment )
            {
             before(grammarAccess.getBedingungAccess().getBedingungAssignment()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:302:1: ( rule__Bedingung__BedingungAssignment )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:302:2: rule__Bedingung__BedingungAssignment
            {
            pushFollow(FOLLOW_rule__Bedingung__BedingungAssignment_in_ruleBedingung576);
            rule__Bedingung__BedingungAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBedingungAccess().getBedingungAssignment()); 

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
    // $ANTLR end "ruleBedingung"


    // $ANTLR start "entryRuleEntityservice"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:314:1: entryRuleEntityservice : ruleEntityservice EOF ;
    public final void entryRuleEntityservice() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:315:1: ( ruleEntityservice EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:316:1: ruleEntityservice EOF
            {
             before(grammarAccess.getEntityserviceRule()); 
            pushFollow(FOLLOW_ruleEntityservice_in_entryRuleEntityservice603);
            ruleEntityservice();

            state._fsp--;

             after(grammarAccess.getEntityserviceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityservice610); 

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
    // $ANTLR end "entryRuleEntityservice"


    // $ANTLR start "ruleEntityservice"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:323:1: ruleEntityservice : ( ( rule__Entityservice__Group__0 ) ) ;
    public final void ruleEntityservice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:327:2: ( ( ( rule__Entityservice__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:328:1: ( ( rule__Entityservice__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:328:1: ( ( rule__Entityservice__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:329:1: ( rule__Entityservice__Group__0 )
            {
             before(grammarAccess.getEntityserviceAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:330:1: ( rule__Entityservice__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:330:2: rule__Entityservice__Group__0
            {
            pushFollow(FOLLOW_rule__Entityservice__Group__0_in_ruleEntityservice636);
            rule__Entityservice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityserviceAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityservice"


    // $ANTLR start "entryRuleEntity"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:342:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:343:1: ( ruleEntity EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:344:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity663);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity670); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:351:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:355:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:356:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:356:1: ( ( rule__Entity__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:357:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:358:1: ( rule__Entity__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:358:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity696);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleVOS"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:374:1: entryRuleVOS : ruleVOS EOF ;
    public final void entryRuleVOS() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:375:1: ( ruleVOS EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:376:1: ruleVOS EOF
            {
             before(grammarAccess.getVOSRule()); 
            pushFollow(FOLLOW_ruleVOS_in_entryRuleVOS727);
            ruleVOS();

            state._fsp--;

             after(grammarAccess.getVOSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVOS734); 

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
    // $ANTLR end "entryRuleVOS"


    // $ANTLR start "ruleVOS"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:383:1: ruleVOS : ( ( rule__VOS__Group__0 ) ) ;
    public final void ruleVOS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:387:2: ( ( ( rule__VOS__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:388:1: ( ( rule__VOS__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:388:1: ( ( rule__VOS__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:389:1: ( rule__VOS__Group__0 )
            {
             before(grammarAccess.getVOSAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:390:1: ( rule__VOS__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:390:2: rule__VOS__Group__0
            {
            pushFollow(FOLLOW_rule__VOS__Group__0_in_ruleVOS760);
            rule__VOS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVOSAccess().getGroup()); 

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
    // $ANTLR end "ruleVOS"


    // $ANTLR start "entryRuleKOS"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:402:1: entryRuleKOS : ruleKOS EOF ;
    public final void entryRuleKOS() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:403:1: ( ruleKOS EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:404:1: ruleKOS EOF
            {
             before(grammarAccess.getKOSRule()); 
            pushFollow(FOLLOW_ruleKOS_in_entryRuleKOS787);
            ruleKOS();

            state._fsp--;

             after(grammarAccess.getKOSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKOS794); 

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
    // $ANTLR end "entryRuleKOS"


    // $ANTLR start "ruleKOS"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:411:1: ruleKOS : ( ( rule__KOS__Group__0 ) ) ;
    public final void ruleKOS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:415:2: ( ( ( rule__KOS__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:416:1: ( ( rule__KOS__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:416:1: ( ( rule__KOS__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:417:1: ( rule__KOS__Group__0 )
            {
             before(grammarAccess.getKOSAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:418:1: ( rule__KOS__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:418:2: rule__KOS__Group__0
            {
            pushFollow(FOLLOW_rule__KOS__Group__0_in_ruleKOS820);
            rule__KOS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKOSAccess().getGroup()); 

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
    // $ANTLR end "ruleKOS"


    // $ANTLR start "entryRuleVOT"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:432:1: entryRuleVOT : ruleVOT EOF ;
    public final void entryRuleVOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:433:1: ( ruleVOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:434:1: ruleVOT EOF
            {
             before(grammarAccess.getVOTRule()); 
            pushFollow(FOLLOW_ruleVOT_in_entryRuleVOT849);
            ruleVOT();

            state._fsp--;

             after(grammarAccess.getVOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVOT856); 

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
    // $ANTLR end "entryRuleVOT"


    // $ANTLR start "ruleVOT"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:441:1: ruleVOT : ( ( rule__VOT__Group__0 ) ) ;
    public final void ruleVOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:445:2: ( ( ( rule__VOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:446:1: ( ( rule__VOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:446:1: ( ( rule__VOT__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:447:1: ( rule__VOT__Group__0 )
            {
             before(grammarAccess.getVOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:448:1: ( rule__VOT__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:448:2: rule__VOT__Group__0
            {
            pushFollow(FOLLOW_rule__VOT__Group__0_in_ruleVOT882);
            rule__VOT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVOTAccess().getGroup()); 

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
    // $ANTLR end "ruleVOT"


    // $ANTLR start "entryRuleKOT"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:460:1: entryRuleKOT : ruleKOT EOF ;
    public final void entryRuleKOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:461:1: ( ruleKOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:462:1: ruleKOT EOF
            {
             before(grammarAccess.getKOTRule()); 
            pushFollow(FOLLOW_ruleKOT_in_entryRuleKOT909);
            ruleKOT();

            state._fsp--;

             after(grammarAccess.getKOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKOT916); 

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
    // $ANTLR end "entryRuleKOT"


    // $ANTLR start "ruleKOT"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:469:1: ruleKOT : ( ( rule__KOT__Alternatives ) ) ;
    public final void ruleKOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:473:2: ( ( ( rule__KOT__Alternatives ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:474:1: ( ( rule__KOT__Alternatives ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:474:1: ( ( rule__KOT__Alternatives ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:475:1: ( rule__KOT__Alternatives )
            {
             before(grammarAccess.getKOTAccess().getAlternatives()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:476:1: ( rule__KOT__Alternatives )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:476:2: rule__KOT__Alternatives
            {
            pushFollow(FOLLOW_rule__KOT__Alternatives_in_ruleKOT942);
            rule__KOT__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKOTAccess().getAlternatives()); 

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
    // $ANTLR end "ruleKOT"


    // $ANTLR start "entryRuleOOT"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:488:1: entryRuleOOT : ruleOOT EOF ;
    public final void entryRuleOOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:489:1: ( ruleOOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:490:1: ruleOOT EOF
            {
             before(grammarAccess.getOOTRule()); 
            pushFollow(FOLLOW_ruleOOT_in_entryRuleOOT969);
            ruleOOT();

            state._fsp--;

             after(grammarAccess.getOOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOOT976); 

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
    // $ANTLR end "entryRuleOOT"


    // $ANTLR start "ruleOOT"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:497:1: ruleOOT : ( ( rule__OOT__Group__0 ) ) ;
    public final void ruleOOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:501:2: ( ( ( rule__OOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:502:1: ( ( rule__OOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:502:1: ( ( rule__OOT__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:503:1: ( rule__OOT__Group__0 )
            {
             before(grammarAccess.getOOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:504:1: ( rule__OOT__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:504:2: rule__OOT__Group__0
            {
            pushFollow(FOLLOW_rule__OOT__Group__0_in_ruleOOT1002);
            rule__OOT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOOTAccess().getGroup()); 

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
    // $ANTLR end "ruleOOT"


    // $ANTLR start "entryRuleLOT"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:516:1: entryRuleLOT : ruleLOT EOF ;
    public final void entryRuleLOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:517:1: ( ruleLOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:518:1: ruleLOT EOF
            {
             before(grammarAccess.getLOTRule()); 
            pushFollow(FOLLOW_ruleLOT_in_entryRuleLOT1029);
            ruleLOT();

            state._fsp--;

             after(grammarAccess.getLOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOT1036); 

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
    // $ANTLR end "entryRuleLOT"


    // $ANTLR start "ruleLOT"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:525:1: ruleLOT : ( ( rule__LOT__Group__0 ) ) ;
    public final void ruleLOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:529:2: ( ( ( rule__LOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:530:1: ( ( rule__LOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:530:1: ( ( rule__LOT__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:531:1: ( rule__LOT__Group__0 )
            {
             before(grammarAccess.getLOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:532:1: ( rule__LOT__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:532:2: rule__LOT__Group__0
            {
            pushFollow(FOLLOW_rule__LOT__Group__0_in_ruleLOT1062);
            rule__LOT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLOTAccess().getGroup()); 

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
    // $ANTLR end "ruleLOT"


    // $ANTLR start "entryRuleTOT"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:544:1: entryRuleTOT : ruleTOT EOF ;
    public final void entryRuleTOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:545:1: ( ruleTOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:546:1: ruleTOT EOF
            {
             before(grammarAccess.getTOTRule()); 
            pushFollow(FOLLOW_ruleTOT_in_entryRuleTOT1089);
            ruleTOT();

            state._fsp--;

             after(grammarAccess.getTOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTOT1096); 

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
    // $ANTLR end "entryRuleTOT"


    // $ANTLR start "ruleTOT"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:553:1: ruleTOT : ( ( rule__TOT__Group__0 ) ) ;
    public final void ruleTOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:557:2: ( ( ( rule__TOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:558:1: ( ( rule__TOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:558:1: ( ( rule__TOT__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:559:1: ( rule__TOT__Group__0 )
            {
             before(grammarAccess.getTOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:560:1: ( rule__TOT__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:560:2: rule__TOT__Group__0
            {
            pushFollow(FOLLOW_rule__TOT__Group__0_in_ruleTOT1122);
            rule__TOT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTOTAccess().getGroup()); 

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
    // $ANTLR end "ruleTOT"


    // $ANTLR start "entryRuleAttribut"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:572:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:573:1: ( ruleAttribut EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:574:1: ruleAttribut EOF
            {
             before(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_ruleAttribut_in_entryRuleAttribut1149);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getAttributRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribut1156); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:581:1: ruleAttribut : ( ( rule__Attribut__Group__0 ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:585:2: ( ( ( rule__Attribut__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:586:1: ( ( rule__Attribut__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:586:1: ( ( rule__Attribut__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:587:1: ( rule__Attribut__Group__0 )
            {
             before(grammarAccess.getAttributAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:588:1: ( rule__Attribut__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:588:2: rule__Attribut__Group__0
            {
            pushFollow(FOLLOW_rule__Attribut__Group__0_in_ruleAttribut1182);
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


    // $ANTLR start "entryRuleOperator"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:600:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:601:1: ( ruleOperator EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:602:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator1209);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator1216); 

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:609:1: ruleOperator : ( ( rule__Operator__Group__0 ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:613:2: ( ( ( rule__Operator__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:614:1: ( ( rule__Operator__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:614:1: ( ( rule__Operator__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:615:1: ( rule__Operator__Group__0 )
            {
             before(grammarAccess.getOperatorAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:616:1: ( rule__Operator__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:616:2: rule__Operator__Group__0
            {
            pushFollow(FOLLOW_rule__Operator__Group__0_in_ruleOperator1242);
            rule__Operator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getGroup()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleBeziehung"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:628:1: entryRuleBeziehung : ruleBeziehung EOF ;
    public final void entryRuleBeziehung() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:629:1: ( ruleBeziehung EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:630:1: ruleBeziehung EOF
            {
             before(grammarAccess.getBeziehungRule()); 
            pushFollow(FOLLOW_ruleBeziehung_in_entryRuleBeziehung1269);
            ruleBeziehung();

            state._fsp--;

             after(grammarAccess.getBeziehungRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeziehung1276); 

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
    // $ANTLR end "entryRuleBeziehung"


    // $ANTLR start "ruleBeziehung"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:637:1: ruleBeziehung : ( ( rule__Beziehung__Alternatives ) ) ;
    public final void ruleBeziehung() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:641:2: ( ( ( rule__Beziehung__Alternatives ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:642:1: ( ( rule__Beziehung__Alternatives ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:642:1: ( ( rule__Beziehung__Alternatives ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:643:1: ( rule__Beziehung__Alternatives )
            {
             before(grammarAccess.getBeziehungAccess().getAlternatives()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:644:1: ( rule__Beziehung__Alternatives )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:644:2: rule__Beziehung__Alternatives
            {
            pushFollow(FOLLOW_rule__Beziehung__Alternatives_in_ruleBeziehung1302);
            rule__Beziehung__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBeziehungAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBeziehung"


    // $ANTLR start "entryRuleInteracts_with"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:656:1: entryRuleInteracts_with : ruleInteracts_with EOF ;
    public final void entryRuleInteracts_with() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:657:1: ( ruleInteracts_with EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:658:1: ruleInteracts_with EOF
            {
             before(grammarAccess.getInteracts_withRule()); 
            pushFollow(FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with1329);
            ruleInteracts_with();

            state._fsp--;

             after(grammarAccess.getInteracts_withRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteracts_with1336); 

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
    // $ANTLR end "entryRuleInteracts_with"


    // $ANTLR start "ruleInteracts_with"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:665:1: ruleInteracts_with : ( ( rule__Interacts_with__Group__0 ) ) ;
    public final void ruleInteracts_with() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:669:2: ( ( ( rule__Interacts_with__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:670:1: ( ( rule__Interacts_with__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:670:1: ( ( rule__Interacts_with__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:671:1: ( rule__Interacts_with__Group__0 )
            {
             before(grammarAccess.getInteracts_withAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:672:1: ( rule__Interacts_with__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:672:2: rule__Interacts_with__Group__0
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__0_in_ruleInteracts_with1362);
            rule__Interacts_with__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInteracts_withAccess().getGroup()); 

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
    // $ANTLR end "ruleInteracts_with"


    // $ANTLR start "entryRuleIs_a"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:684:1: entryRuleIs_a : ruleIs_a EOF ;
    public final void entryRuleIs_a() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:685:1: ( ruleIs_a EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:686:1: ruleIs_a EOF
            {
             before(grammarAccess.getIs_aRule()); 
            pushFollow(FOLLOW_ruleIs_a_in_entryRuleIs_a1389);
            ruleIs_a();

            state._fsp--;

             after(grammarAccess.getIs_aRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_a1396); 

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
    // $ANTLR end "entryRuleIs_a"


    // $ANTLR start "ruleIs_a"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:693:1: ruleIs_a : ( ( rule__Is_a__Group__0 ) ) ;
    public final void ruleIs_a() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:697:2: ( ( ( rule__Is_a__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:698:1: ( ( rule__Is_a__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:698:1: ( ( rule__Is_a__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:699:1: ( rule__Is_a__Group__0 )
            {
             before(grammarAccess.getIs_aAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:700:1: ( rule__Is_a__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:700:2: rule__Is_a__Group__0
            {
            pushFollow(FOLLOW_rule__Is_a__Group__0_in_ruleIs_a1422);
            rule__Is_a__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIs_aAccess().getGroup()); 

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
    // $ANTLR end "ruleIs_a"


    // $ANTLR start "entryRuleIs_part_of"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:712:1: entryRuleIs_part_of : ruleIs_part_of EOF ;
    public final void entryRuleIs_part_of() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:713:1: ( ruleIs_part_of EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:714:1: ruleIs_part_of EOF
            {
             before(grammarAccess.getIs_part_ofRule()); 
            pushFollow(FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of1449);
            ruleIs_part_of();

            state._fsp--;

             after(grammarAccess.getIs_part_ofRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_part_of1456); 

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
    // $ANTLR end "entryRuleIs_part_of"


    // $ANTLR start "ruleIs_part_of"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:721:1: ruleIs_part_of : ( ( rule__Is_part_of__Group__0 ) ) ;
    public final void ruleIs_part_of() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:725:2: ( ( ( rule__Is_part_of__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:726:1: ( ( rule__Is_part_of__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:726:1: ( ( rule__Is_part_of__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:727:1: ( rule__Is_part_of__Group__0 )
            {
             before(grammarAccess.getIs_part_ofAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:728:1: ( rule__Is_part_of__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:728:2: rule__Is_part_of__Group__0
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__0_in_ruleIs_part_of1482);
            rule__Is_part_of__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIs_part_ofAccess().getGroup()); 

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
    // $ANTLR end "ruleIs_part_of"


    // $ANTLR start "entryRuleKardinalitaet01"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:742:1: entryRuleKardinalitaet01 : ruleKardinalitaet01 EOF ;
    public final void entryRuleKardinalitaet01() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:743:1: ( ruleKardinalitaet01 EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:744:1: ruleKardinalitaet01 EOF
            {
             before(grammarAccess.getKardinalitaet01Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet011511);
            ruleKardinalitaet01();

            state._fsp--;

             after(grammarAccess.getKardinalitaet01Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet011518); 

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
    // $ANTLR end "entryRuleKardinalitaet01"


    // $ANTLR start "ruleKardinalitaet01"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:751:1: ruleKardinalitaet01 : ( ( rule__Kardinalitaet01__Group__0 ) ) ;
    public final void ruleKardinalitaet01() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:755:2: ( ( ( rule__Kardinalitaet01__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:756:1: ( ( rule__Kardinalitaet01__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:756:1: ( ( rule__Kardinalitaet01__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:757:1: ( rule__Kardinalitaet01__Group__0 )
            {
             before(grammarAccess.getKardinalitaet01Access().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:758:1: ( rule__Kardinalitaet01__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:758:2: rule__Kardinalitaet01__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__0_in_ruleKardinalitaet011544);
            rule__Kardinalitaet01__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKardinalitaet01Access().getGroup()); 

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
    // $ANTLR end "ruleKardinalitaet01"


    // $ANTLR start "entryRuleKardinalitaet0x"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:770:1: entryRuleKardinalitaet0x : ruleKardinalitaet0x EOF ;
    public final void entryRuleKardinalitaet0x() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:771:1: ( ruleKardinalitaet0x EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:772:1: ruleKardinalitaet0x EOF
            {
             before(grammarAccess.getKardinalitaet0xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x1571);
            ruleKardinalitaet0x();

            state._fsp--;

             after(grammarAccess.getKardinalitaet0xRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet0x1578); 

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
    // $ANTLR end "entryRuleKardinalitaet0x"


    // $ANTLR start "ruleKardinalitaet0x"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:779:1: ruleKardinalitaet0x : ( ( rule__Kardinalitaet0x__Group__0 ) ) ;
    public final void ruleKardinalitaet0x() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:783:2: ( ( ( rule__Kardinalitaet0x__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:784:1: ( ( rule__Kardinalitaet0x__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:784:1: ( ( rule__Kardinalitaet0x__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:785:1: ( rule__Kardinalitaet0x__Group__0 )
            {
             before(grammarAccess.getKardinalitaet0xAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:786:1: ( rule__Kardinalitaet0x__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:786:2: rule__Kardinalitaet0x__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__0_in_ruleKardinalitaet0x1604);
            rule__Kardinalitaet0x__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKardinalitaet0xAccess().getGroup()); 

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
    // $ANTLR end "ruleKardinalitaet0x"


    // $ANTLR start "entryRuleKardinalitaet11"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:798:1: entryRuleKardinalitaet11 : ruleKardinalitaet11 EOF ;
    public final void entryRuleKardinalitaet11() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:799:1: ( ruleKardinalitaet11 EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:800:1: ruleKardinalitaet11 EOF
            {
             before(grammarAccess.getKardinalitaet11Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet111631);
            ruleKardinalitaet11();

            state._fsp--;

             after(grammarAccess.getKardinalitaet11Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet111638); 

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
    // $ANTLR end "entryRuleKardinalitaet11"


    // $ANTLR start "ruleKardinalitaet11"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:807:1: ruleKardinalitaet11 : ( ( rule__Kardinalitaet11__Group__0 ) ) ;
    public final void ruleKardinalitaet11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:811:2: ( ( ( rule__Kardinalitaet11__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:812:1: ( ( rule__Kardinalitaet11__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:812:1: ( ( rule__Kardinalitaet11__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:813:1: ( rule__Kardinalitaet11__Group__0 )
            {
             before(grammarAccess.getKardinalitaet11Access().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:814:1: ( rule__Kardinalitaet11__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:814:2: rule__Kardinalitaet11__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__0_in_ruleKardinalitaet111664);
            rule__Kardinalitaet11__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKardinalitaet11Access().getGroup()); 

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
    // $ANTLR end "ruleKardinalitaet11"


    // $ANTLR start "entryRuleKardinalitaet1x"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:826:1: entryRuleKardinalitaet1x : ruleKardinalitaet1x EOF ;
    public final void entryRuleKardinalitaet1x() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:827:1: ( ruleKardinalitaet1x EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:828:1: ruleKardinalitaet1x EOF
            {
             before(grammarAccess.getKardinalitaet1xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x1691);
            ruleKardinalitaet1x();

            state._fsp--;

             after(grammarAccess.getKardinalitaet1xRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet1x1698); 

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
    // $ANTLR end "entryRuleKardinalitaet1x"


    // $ANTLR start "ruleKardinalitaet1x"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:835:1: ruleKardinalitaet1x : ( ( rule__Kardinalitaet1x__Group__0 ) ) ;
    public final void ruleKardinalitaet1x() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:839:2: ( ( ( rule__Kardinalitaet1x__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:840:1: ( ( rule__Kardinalitaet1x__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:840:1: ( ( rule__Kardinalitaet1x__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:841:1: ( rule__Kardinalitaet1x__Group__0 )
            {
             before(grammarAccess.getKardinalitaet1xAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:842:1: ( rule__Kardinalitaet1x__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:842:2: rule__Kardinalitaet1x__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__0_in_ruleKardinalitaet1x1724);
            rule__Kardinalitaet1x__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKardinalitaet1xAccess().getGroup()); 

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
    // $ANTLR end "ruleKardinalitaet1x"


    // $ANTLR start "entryRuleAnnotation"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:854:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:855:1: ( ruleAnnotation EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:856:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1751);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1758); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:863:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:867:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:868:1: ( ( rule__Annotation__Alternatives ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:868:1: ( ( rule__Annotation__Alternatives ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:869:1: ( rule__Annotation__Alternatives )
            {
             before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:870:1: ( rule__Annotation__Alternatives )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:870:2: rule__Annotation__Alternatives
            {
            pushFollow(FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1784);
            rule__Annotation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleName"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:882:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:883:1: ( ruleName EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:884:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName1811);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName1818); 

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:891:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:895:2: ( ( ( rule__Name__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:896:1: ( ( rule__Name__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:896:1: ( ( rule__Name__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:897:1: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:898:1: ( rule__Name__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:898:2: rule__Name__Group__0
            {
            pushFollow(FOLLOW_rule__Name__Group__0_in_ruleName1844);
            rule__Name__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getGroup()); 

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleMerge"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:910:1: entryRuleMerge : ruleMerge EOF ;
    public final void entryRuleMerge() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:911:1: ( ruleMerge EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:912:1: ruleMerge EOF
            {
             before(grammarAccess.getMergeRule()); 
            pushFollow(FOLLOW_ruleMerge_in_entryRuleMerge1871);
            ruleMerge();

            state._fsp--;

             after(grammarAccess.getMergeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMerge1878); 

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
    // $ANTLR end "entryRuleMerge"


    // $ANTLR start "ruleMerge"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:919:1: ruleMerge : ( ( rule__Merge__Group__0 ) ) ;
    public final void ruleMerge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:923:2: ( ( ( rule__Merge__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:924:1: ( ( rule__Merge__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:924:1: ( ( rule__Merge__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:925:1: ( rule__Merge__Group__0 )
            {
             before(grammarAccess.getMergeAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:926:1: ( rule__Merge__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:926:2: rule__Merge__Group__0
            {
            pushFollow(FOLLOW_rule__Merge__Group__0_in_ruleMerge1904);
            rule__Merge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMergeAccess().getGroup()); 

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
    // $ANTLR end "ruleMerge"


    // $ANTLR start "entryRuleIgnore"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:938:1: entryRuleIgnore : ruleIgnore EOF ;
    public final void entryRuleIgnore() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:939:1: ( ruleIgnore EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:940:1: ruleIgnore EOF
            {
             before(grammarAccess.getIgnoreRule()); 
            pushFollow(FOLLOW_ruleIgnore_in_entryRuleIgnore1931);
            ruleIgnore();

            state._fsp--;

             after(grammarAccess.getIgnoreRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIgnore1938); 

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
    // $ANTLR end "entryRuleIgnore"


    // $ANTLR start "ruleIgnore"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:947:1: ruleIgnore : ( ( rule__Ignore__Group__0 ) ) ;
    public final void ruleIgnore() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:951:2: ( ( ( rule__Ignore__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:952:1: ( ( rule__Ignore__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:952:1: ( ( rule__Ignore__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:953:1: ( rule__Ignore__Group__0 )
            {
             before(grammarAccess.getIgnoreAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:954:1: ( rule__Ignore__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:954:2: rule__Ignore__Group__0
            {
            pushFollow(FOLLOW_rule__Ignore__Group__0_in_ruleIgnore1964);
            rule__Ignore__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIgnoreAccess().getGroup()); 

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
    // $ANTLR end "ruleIgnore"


    // $ANTLR start "entryRuleVersion"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:966:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:967:1: ( ruleVersion EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:968:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion1991);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion1998); 

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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:975:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:979:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:980:1: ( ( rule__Version__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:980:1: ( ( rule__Version__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:981:1: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:982:1: ( rule__Version__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:982:2: rule__Version__Group__0
            {
            pushFollow(FOLLOW_rule__Version__Group__0_in_ruleVersion2024);
            rule__Version__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "rule__SOA_AwS__Alternatives_4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:994:1: rule__SOA_AwS__Alternatives_4 : ( ( ( rule__SOA_AwS__VorgangsservicesAssignment_4_0 ) ) | ( ( rule__SOA_AwS__EntityservicesAssignment_4_1 ) ) );
    public final void rule__SOA_AwS__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:998:1: ( ( ( rule__SOA_AwS__VorgangsservicesAssignment_4_0 ) ) | ( ( rule__SOA_AwS__EntityservicesAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==32) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:999:1: ( ( rule__SOA_AwS__VorgangsservicesAssignment_4_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:999:1: ( ( rule__SOA_AwS__VorgangsservicesAssignment_4_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1000:1: ( rule__SOA_AwS__VorgangsservicesAssignment_4_0 )
                    {
                     before(grammarAccess.getSOA_AwSAccess().getVorgangsservicesAssignment_4_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1001:1: ( rule__SOA_AwS__VorgangsservicesAssignment_4_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1001:2: rule__SOA_AwS__VorgangsservicesAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__SOA_AwS__VorgangsservicesAssignment_4_0_in_rule__SOA_AwS__Alternatives_42060);
                    rule__SOA_AwS__VorgangsservicesAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSOA_AwSAccess().getVorgangsservicesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1005:6: ( ( rule__SOA_AwS__EntityservicesAssignment_4_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1005:6: ( ( rule__SOA_AwS__EntityservicesAssignment_4_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1006:1: ( rule__SOA_AwS__EntityservicesAssignment_4_1 )
                    {
                     before(grammarAccess.getSOA_AwSAccess().getEntityservicesAssignment_4_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1007:1: ( rule__SOA_AwS__EntityservicesAssignment_4_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1007:2: rule__SOA_AwS__EntityservicesAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__SOA_AwS__EntityservicesAssignment_4_1_in_rule__SOA_AwS__Alternatives_42078);
                    rule__SOA_AwS__EntityservicesAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSOA_AwSAccess().getEntityservicesAssignment_4_1()); 

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
    // $ANTLR end "rule__SOA_AwS__Alternatives_4"


    // $ANTLR start "rule__Workflow__Alternatives_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1017:1: rule__Workflow__Alternatives_2 : ( ( ( rule__Workflow__OrchestrierungAssignment_2_0 ) ) | ( ( rule__Workflow__ChoreographieAssignment_2_1 ) ) );
    public final void rule__Workflow__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1021:1: ( ( ( rule__Workflow__OrchestrierungAssignment_2_0 ) ) | ( ( rule__Workflow__ChoreographieAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==30) ) {
                        int LA2_5 = input.LA(4);

                        if ( (LA2_5==RULE_ID) ) {
                            int LA2_2 = input.LA(5);

                            if ( (LA2_2==14) ) {
                                int LA2_4 = input.LA(6);

                                if ( (LA2_4==RULE_ID) ) {
                                    int LA2_6 = input.LA(7);

                                    if ( (LA2_6==29) ) {
                                        alt2=1;
                                    }
                                    else if ( (LA2_6==31) ) {
                                        alt2=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 2, 6, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 2, 4, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 2, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==14) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==RULE_ID) ) {
                        int LA2_6 = input.LA(4);

                        if ( (LA2_6==29) ) {
                            alt2=1;
                        }
                        else if ( (LA2_6==31) ) {
                            alt2=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1022:1: ( ( rule__Workflow__OrchestrierungAssignment_2_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1022:1: ( ( rule__Workflow__OrchestrierungAssignment_2_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1023:1: ( rule__Workflow__OrchestrierungAssignment_2_0 )
                    {
                     before(grammarAccess.getWorkflowAccess().getOrchestrierungAssignment_2_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1024:1: ( rule__Workflow__OrchestrierungAssignment_2_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1024:2: rule__Workflow__OrchestrierungAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Workflow__OrchestrierungAssignment_2_0_in_rule__Workflow__Alternatives_22112);
                    rule__Workflow__OrchestrierungAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWorkflowAccess().getOrchestrierungAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1028:6: ( ( rule__Workflow__ChoreographieAssignment_2_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1028:6: ( ( rule__Workflow__ChoreographieAssignment_2_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1029:1: ( rule__Workflow__ChoreographieAssignment_2_1 )
                    {
                     before(grammarAccess.getWorkflowAccess().getChoreographieAssignment_2_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1030:1: ( rule__Workflow__ChoreographieAssignment_2_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1030:2: rule__Workflow__ChoreographieAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Workflow__ChoreographieAssignment_2_1_in_rule__Workflow__Alternatives_22130);
                    rule__Workflow__ChoreographieAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWorkflowAccess().getChoreographieAssignment_2_1()); 

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
    // $ANTLR end "rule__Workflow__Alternatives_2"


    // $ANTLR start "rule__VOS__Alternatives_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1040:1: rule__VOS__Alternatives_0 : ( ( ( rule__VOS__NameAssignment_0_0 ) ) | ( ( rule__VOS__NameAssignment_0_1 ) ) );
    public final void rule__VOS__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1044:1: ( ( ( rule__VOS__NameAssignment_0_0 ) ) | ( ( rule__VOS__NameAssignment_0_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==45) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1045:1: ( ( rule__VOS__NameAssignment_0_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1045:1: ( ( rule__VOS__NameAssignment_0_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1046:1: ( rule__VOS__NameAssignment_0_0 )
                    {
                     before(grammarAccess.getVOSAccess().getNameAssignment_0_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1047:1: ( rule__VOS__NameAssignment_0_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1047:2: rule__VOS__NameAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__VOS__NameAssignment_0_0_in_rule__VOS__Alternatives_02164);
                    rule__VOS__NameAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVOSAccess().getNameAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1051:6: ( ( rule__VOS__NameAssignment_0_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1051:6: ( ( rule__VOS__NameAssignment_0_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1052:1: ( rule__VOS__NameAssignment_0_1 )
                    {
                     before(grammarAccess.getVOSAccess().getNameAssignment_0_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1053:1: ( rule__VOS__NameAssignment_0_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1053:2: rule__VOS__NameAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__VOS__NameAssignment_0_1_in_rule__VOS__Alternatives_02182);
                    rule__VOS__NameAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVOSAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__VOS__Alternatives_0"


    // $ANTLR start "rule__VOS__Alternatives_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1062:1: rule__VOS__Alternatives_2 : ( ( ( rule__VOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__VOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__VOS__GliederungAssignment_2_2 ) ) );
    public final void rule__VOS__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1066:1: ( ( ( rule__VOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__VOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__VOS__GliederungAssignment_2_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1067:1: ( ( rule__VOS__ObjekttypenAssignment_2_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1067:1: ( ( rule__VOS__ObjekttypenAssignment_2_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1068:1: ( rule__VOS__ObjekttypenAssignment_2_0 )
                    {
                     before(grammarAccess.getVOSAccess().getObjekttypenAssignment_2_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1069:1: ( rule__VOS__ObjekttypenAssignment_2_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1069:2: rule__VOS__ObjekttypenAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__VOS__ObjekttypenAssignment_2_0_in_rule__VOS__Alternatives_22215);
                    rule__VOS__ObjekttypenAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVOSAccess().getObjekttypenAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1073:6: ( ( rule__VOS__BeziehungenAssignment_2_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1073:6: ( ( rule__VOS__BeziehungenAssignment_2_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1074:1: ( rule__VOS__BeziehungenAssignment_2_1 )
                    {
                     before(grammarAccess.getVOSAccess().getBeziehungenAssignment_2_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1075:1: ( rule__VOS__BeziehungenAssignment_2_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1075:2: rule__VOS__BeziehungenAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__VOS__BeziehungenAssignment_2_1_in_rule__VOS__Alternatives_22233);
                    rule__VOS__BeziehungenAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVOSAccess().getBeziehungenAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1079:6: ( ( rule__VOS__GliederungAssignment_2_2 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1079:6: ( ( rule__VOS__GliederungAssignment_2_2 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1080:1: ( rule__VOS__GliederungAssignment_2_2 )
                    {
                     before(grammarAccess.getVOSAccess().getGliederungAssignment_2_2()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1081:1: ( rule__VOS__GliederungAssignment_2_2 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1081:2: rule__VOS__GliederungAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__VOS__GliederungAssignment_2_2_in_rule__VOS__Alternatives_22251);
                    rule__VOS__GliederungAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getVOSAccess().getGliederungAssignment_2_2()); 

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
    // $ANTLR end "rule__VOS__Alternatives_2"


    // $ANTLR start "rule__KOS__Alternatives_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1090:1: rule__KOS__Alternatives_0 : ( ( ( rule__KOS__NameAssignment_0_0 ) ) | ( ( rule__KOS__NameAssignment_0_1 ) ) );
    public final void rule__KOS__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1094:1: ( ( ( rule__KOS__NameAssignment_0_0 ) ) | ( ( rule__KOS__NameAssignment_0_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==46) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1095:1: ( ( rule__KOS__NameAssignment_0_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1095:1: ( ( rule__KOS__NameAssignment_0_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1096:1: ( rule__KOS__NameAssignment_0_0 )
                    {
                     before(grammarAccess.getKOSAccess().getNameAssignment_0_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1097:1: ( rule__KOS__NameAssignment_0_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1097:2: rule__KOS__NameAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__KOS__NameAssignment_0_0_in_rule__KOS__Alternatives_02284);
                    rule__KOS__NameAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKOSAccess().getNameAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1101:6: ( ( rule__KOS__NameAssignment_0_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1101:6: ( ( rule__KOS__NameAssignment_0_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1102:1: ( rule__KOS__NameAssignment_0_1 )
                    {
                     before(grammarAccess.getKOSAccess().getNameAssignment_0_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1103:1: ( rule__KOS__NameAssignment_0_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1103:2: rule__KOS__NameAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__KOS__NameAssignment_0_1_in_rule__KOS__Alternatives_02302);
                    rule__KOS__NameAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getKOSAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__KOS__Alternatives_0"


    // $ANTLR start "rule__KOS__Alternatives_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1112:1: rule__KOS__Alternatives_2 : ( ( ( rule__KOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__KOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__KOS__GliederungAssignment_2_2 ) ) );
    public final void rule__KOS__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1116:1: ( ( ( rule__KOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__KOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__KOS__GliederungAssignment_2_2 ) ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1117:1: ( ( rule__KOS__ObjekttypenAssignment_2_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1117:1: ( ( rule__KOS__ObjekttypenAssignment_2_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1118:1: ( rule__KOS__ObjekttypenAssignment_2_0 )
                    {
                     before(grammarAccess.getKOSAccess().getObjekttypenAssignment_2_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1119:1: ( rule__KOS__ObjekttypenAssignment_2_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1119:2: rule__KOS__ObjekttypenAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__KOS__ObjekttypenAssignment_2_0_in_rule__KOS__Alternatives_22335);
                    rule__KOS__ObjekttypenAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKOSAccess().getObjekttypenAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1123:6: ( ( rule__KOS__BeziehungenAssignment_2_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1123:6: ( ( rule__KOS__BeziehungenAssignment_2_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1124:1: ( rule__KOS__BeziehungenAssignment_2_1 )
                    {
                     before(grammarAccess.getKOSAccess().getBeziehungenAssignment_2_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1125:1: ( rule__KOS__BeziehungenAssignment_2_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1125:2: rule__KOS__BeziehungenAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__KOS__BeziehungenAssignment_2_1_in_rule__KOS__Alternatives_22353);
                    rule__KOS__BeziehungenAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getKOSAccess().getBeziehungenAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1129:6: ( ( rule__KOS__GliederungAssignment_2_2 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1129:6: ( ( rule__KOS__GliederungAssignment_2_2 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1130:1: ( rule__KOS__GliederungAssignment_2_2 )
                    {
                     before(grammarAccess.getKOSAccess().getGliederungAssignment_2_2()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1131:1: ( rule__KOS__GliederungAssignment_2_2 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1131:2: rule__KOS__GliederungAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__KOS__GliederungAssignment_2_2_in_rule__KOS__Alternatives_22371);
                    rule__KOS__GliederungAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getKOSAccess().getGliederungAssignment_2_2()); 

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
    // $ANTLR end "rule__KOS__Alternatives_2"


    // $ANTLR start "rule__VOT__Alternatives_4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1141:1: rule__VOT__Alternatives_4 : ( ( ( rule__VOT__AttributeAssignment_4_0 ) ) | ( ( rule__VOT__OperatorenAssignment_4_1 ) ) );
    public final void rule__VOT__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1145:1: ( ( ( rule__VOT__AttributeAssignment_4_0 ) ) | ( ( rule__VOT__OperatorenAssignment_4_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==26) ) {
                    alt7=2;
                }
                else if ( (LA7_1==RULE_ID||LA7_1==29) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1146:1: ( ( rule__VOT__AttributeAssignment_4_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1146:1: ( ( rule__VOT__AttributeAssignment_4_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1147:1: ( rule__VOT__AttributeAssignment_4_0 )
                    {
                     before(grammarAccess.getVOTAccess().getAttributeAssignment_4_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1148:1: ( rule__VOT__AttributeAssignment_4_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1148:2: rule__VOT__AttributeAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__VOT__AttributeAssignment_4_0_in_rule__VOT__Alternatives_42405);
                    rule__VOT__AttributeAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVOTAccess().getAttributeAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1152:6: ( ( rule__VOT__OperatorenAssignment_4_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1152:6: ( ( rule__VOT__OperatorenAssignment_4_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1153:1: ( rule__VOT__OperatorenAssignment_4_1 )
                    {
                     before(grammarAccess.getVOTAccess().getOperatorenAssignment_4_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1154:1: ( rule__VOT__OperatorenAssignment_4_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1154:2: rule__VOT__OperatorenAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__VOT__OperatorenAssignment_4_1_in_rule__VOT__Alternatives_42423);
                    rule__VOT__OperatorenAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVOTAccess().getOperatorenAssignment_4_1()); 

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
    // $ANTLR end "rule__VOT__Alternatives_4"


    // $ANTLR start "rule__KOT__Alternatives"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1163:1: rule__KOT__Alternatives : ( ( ruleOOT ) | ( ruleLOT ) | ( ruleTOT ) );
    public final void rule__KOT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1167:1: ( ( ruleOOT ) | ( ruleLOT ) | ( ruleTOT ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1168:1: ( ruleOOT )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1168:1: ( ruleOOT )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1169:1: ruleOOT
                    {
                     before(grammarAccess.getKOTAccess().getOOTParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOOT_in_rule__KOT__Alternatives2456);
                    ruleOOT();

                    state._fsp--;

                     after(grammarAccess.getKOTAccess().getOOTParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1174:6: ( ruleLOT )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1174:6: ( ruleLOT )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1175:1: ruleLOT
                    {
                     before(grammarAccess.getKOTAccess().getLOTParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLOT_in_rule__KOT__Alternatives2473);
                    ruleLOT();

                    state._fsp--;

                     after(grammarAccess.getKOTAccess().getLOTParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1180:6: ( ruleTOT )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1180:6: ( ruleTOT )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1181:1: ruleTOT
                    {
                     before(grammarAccess.getKOTAccess().getTOTParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTOT_in_rule__KOT__Alternatives2490);
                    ruleTOT();

                    state._fsp--;

                     after(grammarAccess.getKOTAccess().getTOTParserRuleCall_2()); 

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
    // $ANTLR end "rule__KOT__Alternatives"


    // $ANTLR start "rule__OOT__Alternatives_4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1191:1: rule__OOT__Alternatives_4 : ( ( ( rule__OOT__AttributeAssignment_4_0 ) ) | ( ( rule__OOT__OperatorenAssignment_4_1 ) ) );
    public final void rule__OOT__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1195:1: ( ( ( rule__OOT__AttributeAssignment_4_0 ) ) | ( ( rule__OOT__OperatorenAssignment_4_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==26) ) {
                    alt9=2;
                }
                else if ( (LA9_1==RULE_ID||LA9_1==29) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1196:1: ( ( rule__OOT__AttributeAssignment_4_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1196:1: ( ( rule__OOT__AttributeAssignment_4_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1197:1: ( rule__OOT__AttributeAssignment_4_0 )
                    {
                     before(grammarAccess.getOOTAccess().getAttributeAssignment_4_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1198:1: ( rule__OOT__AttributeAssignment_4_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1198:2: rule__OOT__AttributeAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__OOT__AttributeAssignment_4_0_in_rule__OOT__Alternatives_42522);
                    rule__OOT__AttributeAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOOTAccess().getAttributeAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1202:6: ( ( rule__OOT__OperatorenAssignment_4_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1202:6: ( ( rule__OOT__OperatorenAssignment_4_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1203:1: ( rule__OOT__OperatorenAssignment_4_1 )
                    {
                     before(grammarAccess.getOOTAccess().getOperatorenAssignment_4_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1204:1: ( rule__OOT__OperatorenAssignment_4_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1204:2: rule__OOT__OperatorenAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__OOT__OperatorenAssignment_4_1_in_rule__OOT__Alternatives_42540);
                    rule__OOT__OperatorenAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOOTAccess().getOperatorenAssignment_4_1()); 

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
    // $ANTLR end "rule__OOT__Alternatives_4"


    // $ANTLR start "rule__LOT__Alternatives_4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1213:1: rule__LOT__Alternatives_4 : ( ( ( rule__LOT__AttributeAssignment_4_0 ) ) | ( ( rule__LOT__OperatorenAssignment_4_1 ) ) );
    public final void rule__LOT__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1217:1: ( ( ( rule__LOT__AttributeAssignment_4_0 ) ) | ( ( rule__LOT__OperatorenAssignment_4_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==26) ) {
                    alt10=2;
                }
                else if ( (LA10_1==RULE_ID||LA10_1==29) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1218:1: ( ( rule__LOT__AttributeAssignment_4_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1218:1: ( ( rule__LOT__AttributeAssignment_4_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1219:1: ( rule__LOT__AttributeAssignment_4_0 )
                    {
                     before(grammarAccess.getLOTAccess().getAttributeAssignment_4_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1220:1: ( rule__LOT__AttributeAssignment_4_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1220:2: rule__LOT__AttributeAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__LOT__AttributeAssignment_4_0_in_rule__LOT__Alternatives_42573);
                    rule__LOT__AttributeAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLOTAccess().getAttributeAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1224:6: ( ( rule__LOT__OperatorenAssignment_4_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1224:6: ( ( rule__LOT__OperatorenAssignment_4_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1225:1: ( rule__LOT__OperatorenAssignment_4_1 )
                    {
                     before(grammarAccess.getLOTAccess().getOperatorenAssignment_4_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1226:1: ( rule__LOT__OperatorenAssignment_4_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1226:2: rule__LOT__OperatorenAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__LOT__OperatorenAssignment_4_1_in_rule__LOT__Alternatives_42591);
                    rule__LOT__OperatorenAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLOTAccess().getOperatorenAssignment_4_1()); 

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
    // $ANTLR end "rule__LOT__Alternatives_4"


    // $ANTLR start "rule__TOT__Alternatives_4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1235:1: rule__TOT__Alternatives_4 : ( ( ( rule__TOT__AttributeAssignment_4_0 ) ) | ( ( rule__TOT__OperatorenAssignment_4_1 ) ) );
    public final void rule__TOT__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1239:1: ( ( ( rule__TOT__AttributeAssignment_4_0 ) ) | ( ( rule__TOT__OperatorenAssignment_4_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==26) ) {
                    alt11=2;
                }
                else if ( (LA11_1==RULE_ID||LA11_1==29) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1240:1: ( ( rule__TOT__AttributeAssignment_4_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1240:1: ( ( rule__TOT__AttributeAssignment_4_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1241:1: ( rule__TOT__AttributeAssignment_4_0 )
                    {
                     before(grammarAccess.getTOTAccess().getAttributeAssignment_4_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1242:1: ( rule__TOT__AttributeAssignment_4_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1242:2: rule__TOT__AttributeAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__TOT__AttributeAssignment_4_0_in_rule__TOT__Alternatives_42624);
                    rule__TOT__AttributeAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTOTAccess().getAttributeAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1246:6: ( ( rule__TOT__OperatorenAssignment_4_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1246:6: ( ( rule__TOT__OperatorenAssignment_4_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1247:1: ( rule__TOT__OperatorenAssignment_4_1 )
                    {
                     before(grammarAccess.getTOTAccess().getOperatorenAssignment_4_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1248:1: ( rule__TOT__OperatorenAssignment_4_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1248:2: rule__TOT__OperatorenAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__TOT__OperatorenAssignment_4_1_in_rule__TOT__Alternatives_42642);
                    rule__TOT__OperatorenAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTOTAccess().getOperatorenAssignment_4_1()); 

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
    // $ANTLR end "rule__TOT__Alternatives_4"


    // $ANTLR start "rule__Beziehung__Alternatives"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1257:1: rule__Beziehung__Alternatives : ( ( ruleInteracts_with ) | ( ruleIs_a ) | ( ruleIs_part_of ) );
    public final void rule__Beziehung__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1261:1: ( ( ruleInteracts_with ) | ( ruleIs_a ) | ( ruleIs_part_of ) )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1262:1: ( ruleInteracts_with )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1262:1: ( ruleInteracts_with )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1263:1: ruleInteracts_with
                    {
                     before(grammarAccess.getBeziehungAccess().getInteracts_withParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInteracts_with_in_rule__Beziehung__Alternatives2675);
                    ruleInteracts_with();

                    state._fsp--;

                     after(grammarAccess.getBeziehungAccess().getInteracts_withParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1268:6: ( ruleIs_a )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1268:6: ( ruleIs_a )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1269:1: ruleIs_a
                    {
                     before(grammarAccess.getBeziehungAccess().getIs_aParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIs_a_in_rule__Beziehung__Alternatives2692);
                    ruleIs_a();

                    state._fsp--;

                     after(grammarAccess.getBeziehungAccess().getIs_aParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1274:6: ( ruleIs_part_of )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1274:6: ( ruleIs_part_of )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1275:1: ruleIs_part_of
                    {
                     before(grammarAccess.getBeziehungAccess().getIs_part_ofParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIs_part_of_in_rule__Beziehung__Alternatives2709);
                    ruleIs_part_of();

                    state._fsp--;

                     after(grammarAccess.getBeziehungAccess().getIs_part_ofParserRuleCall_2()); 

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
    // $ANTLR end "rule__Beziehung__Alternatives"


    // $ANTLR start "rule__Interacts_with__KardinalitaetAlternatives_3_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1285:1: rule__Interacts_with__KardinalitaetAlternatives_3_0 : ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) );
    public final void rule__Interacts_with__KardinalitaetAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1289:1: ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt13=1;
                }
                break;
            case 14:
            case 15:
                {
                alt13=2;
                }
                break;
            case 18:
            case 19:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1290:1: ( ruleKardinalitaet01 )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1290:1: ( ruleKardinalitaet01 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1291:1: ruleKardinalitaet01
                    {
                     before(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_rule__Interacts_with__KardinalitaetAlternatives_3_02741);
                    ruleKardinalitaet01();

                    state._fsp--;

                     after(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1296:6: ( ruleKardinalitaet0x )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1296:6: ( ruleKardinalitaet0x )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1297:1: ruleKardinalitaet0x
                    {
                     before(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_rule__Interacts_with__KardinalitaetAlternatives_3_02758);
                    ruleKardinalitaet0x();

                    state._fsp--;

                     after(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1302:6: ( ruleKardinalitaet1x )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1302:6: ( ruleKardinalitaet1x )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1303:1: ruleKardinalitaet1x
                    {
                     before(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet1xParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_rule__Interacts_with__KardinalitaetAlternatives_3_02775);
                    ruleKardinalitaet1x();

                    state._fsp--;

                     after(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet1xParserRuleCall_3_0_2()); 

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
    // $ANTLR end "rule__Interacts_with__KardinalitaetAlternatives_3_0"


    // $ANTLR start "rule__Is_a__KardinalitaetAlternatives_3_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1313:1: rule__Is_a__KardinalitaetAlternatives_3_0 : ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet11 ) );
    public final void rule__Is_a__KardinalitaetAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1317:1: ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet11 ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=12 && LA14_0<=13)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=16 && LA14_0<=17)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1318:1: ( ruleKardinalitaet01 )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1318:1: ( ruleKardinalitaet01 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1319:1: ruleKardinalitaet01
                    {
                     before(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_rule__Is_a__KardinalitaetAlternatives_3_02807);
                    ruleKardinalitaet01();

                    state._fsp--;

                     after(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1324:6: ( ruleKardinalitaet11 )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1324:6: ( ruleKardinalitaet11 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1325:1: ruleKardinalitaet11
                    {
                     before(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet11ParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleKardinalitaet11_in_rule__Is_a__KardinalitaetAlternatives_3_02824);
                    ruleKardinalitaet11();

                    state._fsp--;

                     after(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet11ParserRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__Is_a__KardinalitaetAlternatives_3_0"


    // $ANTLR start "rule__Is_part_of__KardinalitaetAlternatives_3_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1335:1: rule__Is_part_of__KardinalitaetAlternatives_3_0 : ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) );
    public final void rule__Is_part_of__KardinalitaetAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1339:1: ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt15=1;
                }
                break;
            case 14:
            case 15:
                {
                alt15=2;
                }
                break;
            case 18:
            case 19:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1340:1: ( ruleKardinalitaet01 )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1340:1: ( ruleKardinalitaet01 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1341:1: ruleKardinalitaet01
                    {
                     before(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_rule__Is_part_of__KardinalitaetAlternatives_3_02856);
                    ruleKardinalitaet01();

                    state._fsp--;

                     after(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1346:6: ( ruleKardinalitaet0x )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1346:6: ( ruleKardinalitaet0x )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1347:1: ruleKardinalitaet0x
                    {
                     before(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_rule__Is_part_of__KardinalitaetAlternatives_3_02873);
                    ruleKardinalitaet0x();

                    state._fsp--;

                     after(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1352:6: ( ruleKardinalitaet1x )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1352:6: ( ruleKardinalitaet1x )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1353:1: ruleKardinalitaet1x
                    {
                     before(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet1xParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_rule__Is_part_of__KardinalitaetAlternatives_3_02890);
                    ruleKardinalitaet1x();

                    state._fsp--;

                     after(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet1xParserRuleCall_3_0_2()); 

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
    // $ANTLR end "rule__Is_part_of__KardinalitaetAlternatives_3_0"


    // $ANTLR start "rule__Kardinalitaet01__Alternatives_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1364:1: rule__Kardinalitaet01__Alternatives_0 : ( ( '--' ) | ( '(0,1)' ) );
    public final void rule__Kardinalitaet01__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1368:1: ( ( '--' ) | ( '(0,1)' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            else if ( (LA16_0==13) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1369:1: ( '--' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1369:1: ( '--' )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1370:1: '--'
                    {
                     before(grammarAccess.getKardinalitaet01Access().getHyphenMinusHyphenMinusKeyword_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Kardinalitaet01__Alternatives_02924); 
                     after(grammarAccess.getKardinalitaet01Access().getHyphenMinusHyphenMinusKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1377:6: ( '(0,1)' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1377:6: ( '(0,1)' )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1378:1: '(0,1)'
                    {
                     before(grammarAccess.getKardinalitaet01Access().getLeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Kardinalitaet01__Alternatives_02944); 
                     after(grammarAccess.getKardinalitaet01Access().getLeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_1()); 

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
    // $ANTLR end "rule__Kardinalitaet01__Alternatives_0"


    // $ANTLR start "rule__Kardinalitaet0x__Alternatives_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1390:1: rule__Kardinalitaet0x__Alternatives_0 : ( ( '->' ) | ( '(0,*)' ) );
    public final void rule__Kardinalitaet0x__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1394:1: ( ( '->' ) | ( '(0,*)' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            else if ( (LA17_0==15) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1395:1: ( '->' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1395:1: ( '->' )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1396:1: '->'
                    {
                     before(grammarAccess.getKardinalitaet0xAccess().getHyphenMinusGreaterThanSignKeyword_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Kardinalitaet0x__Alternatives_02979); 
                     after(grammarAccess.getKardinalitaet0xAccess().getHyphenMinusGreaterThanSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1403:6: ( '(0,*)' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1403:6: ( '(0,*)' )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1404:1: '(0,*)'
                    {
                     before(grammarAccess.getKardinalitaet0xAccess().getLeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Kardinalitaet0x__Alternatives_02999); 
                     after(grammarAccess.getKardinalitaet0xAccess().getLeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_1()); 

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
    // $ANTLR end "rule__Kardinalitaet0x__Alternatives_0"


    // $ANTLR start "rule__Kardinalitaet11__Alternatives_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1416:1: rule__Kardinalitaet11__Alternatives_0 : ( ( '==' ) | ( '(1,1)' ) );
    public final void rule__Kardinalitaet11__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1420:1: ( ( '==' ) | ( '(1,1)' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            else if ( (LA18_0==17) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1421:1: ( '==' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1421:1: ( '==' )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1422:1: '=='
                    {
                     before(grammarAccess.getKardinalitaet11Access().getEqualsSignEqualsSignKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Kardinalitaet11__Alternatives_03034); 
                     after(grammarAccess.getKardinalitaet11Access().getEqualsSignEqualsSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1429:6: ( '(1,1)' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1429:6: ( '(1,1)' )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1430:1: '(1,1)'
                    {
                     before(grammarAccess.getKardinalitaet11Access().getLeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Kardinalitaet11__Alternatives_03054); 
                     after(grammarAccess.getKardinalitaet11Access().getLeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_1()); 

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
    // $ANTLR end "rule__Kardinalitaet11__Alternatives_0"


    // $ANTLR start "rule__Kardinalitaet1x__Alternatives_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1442:1: rule__Kardinalitaet1x__Alternatives_0 : ( ( '=>' ) | ( '(1,*)' ) );
    public final void rule__Kardinalitaet1x__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1446:1: ( ( '=>' ) | ( '(1,*)' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            else if ( (LA19_0==19) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1447:1: ( '=>' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1447:1: ( '=>' )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1448:1: '=>'
                    {
                     before(grammarAccess.getKardinalitaet1xAccess().getEqualsSignGreaterThanSignKeyword_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__Kardinalitaet1x__Alternatives_03089); 
                     after(grammarAccess.getKardinalitaet1xAccess().getEqualsSignGreaterThanSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1455:6: ( '(1,*)' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1455:6: ( '(1,*)' )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1456:1: '(1,*)'
                    {
                     before(grammarAccess.getKardinalitaet1xAccess().getLeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__Kardinalitaet1x__Alternatives_03109); 
                     after(grammarAccess.getKardinalitaet1xAccess().getLeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_1()); 

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
    // $ANTLR end "rule__Kardinalitaet1x__Alternatives_0"


    // $ANTLR start "rule__Annotation__Alternatives"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1468:1: rule__Annotation__Alternatives : ( ( ruleName ) | ( ruleIgnore ) | ( ruleMerge ) | ( ruleVersion ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1472:1: ( ( ruleName ) | ( ruleIgnore ) | ( ruleMerge ) | ( ruleVersion ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt20=1;
                }
                break;
            case 42:
                {
                alt20=2;
                }
                break;
            case 41:
                {
                alt20=3;
                }
                break;
            case 43:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1473:1: ( ruleName )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1473:1: ( ruleName )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1474:1: ruleName
                    {
                     before(grammarAccess.getAnnotationAccess().getNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleName_in_rule__Annotation__Alternatives3143);
                    ruleName();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1479:6: ( ruleIgnore )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1479:6: ( ruleIgnore )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1480:1: ruleIgnore
                    {
                     before(grammarAccess.getAnnotationAccess().getIgnoreParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIgnore_in_rule__Annotation__Alternatives3160);
                    ruleIgnore();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getIgnoreParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1485:6: ( ruleMerge )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1485:6: ( ruleMerge )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1486:1: ruleMerge
                    {
                     before(grammarAccess.getAnnotationAccess().getMergeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMerge_in_rule__Annotation__Alternatives3177);
                    ruleMerge();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getMergeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1491:6: ( ruleVersion )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1491:6: ( ruleVersion )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1492:1: ruleVersion
                    {
                     before(grammarAccess.getAnnotationAccess().getVersionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleVersion_in_rule__Annotation__Alternatives3194);
                    ruleVersion();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getVersionParserRuleCall_3()); 

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
    // $ANTLR end "rule__Annotation__Alternatives"


    // $ANTLR start "rule__SOA_AwS__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1504:1: rule__SOA_AwS__Group__0 : rule__SOA_AwS__Group__0__Impl rule__SOA_AwS__Group__1 ;
    public final void rule__SOA_AwS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1508:1: ( rule__SOA_AwS__Group__0__Impl rule__SOA_AwS__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1509:2: rule__SOA_AwS__Group__0__Impl rule__SOA_AwS__Group__1
            {
            pushFollow(FOLLOW_rule__SOA_AwS__Group__0__Impl_in_rule__SOA_AwS__Group__03224);
            rule__SOA_AwS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOA_AwS__Group__1_in_rule__SOA_AwS__Group__03227);
            rule__SOA_AwS__Group__1();

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
    // $ANTLR end "rule__SOA_AwS__Group__0"


    // $ANTLR start "rule__SOA_AwS__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1516:1: rule__SOA_AwS__Group__0__Impl : ( 'SOA-AwS:' ) ;
    public final void rule__SOA_AwS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1520:1: ( ( 'SOA-AwS:' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1521:1: ( 'SOA-AwS:' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1521:1: ( 'SOA-AwS:' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1522:1: 'SOA-AwS:'
            {
             before(grammarAccess.getSOA_AwSAccess().getSOAAwSKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__SOA_AwS__Group__0__Impl3255); 
             after(grammarAccess.getSOA_AwSAccess().getSOAAwSKeyword_0()); 

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
    // $ANTLR end "rule__SOA_AwS__Group__0__Impl"


    // $ANTLR start "rule__SOA_AwS__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1535:1: rule__SOA_AwS__Group__1 : rule__SOA_AwS__Group__1__Impl rule__SOA_AwS__Group__2 ;
    public final void rule__SOA_AwS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1539:1: ( rule__SOA_AwS__Group__1__Impl rule__SOA_AwS__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1540:2: rule__SOA_AwS__Group__1__Impl rule__SOA_AwS__Group__2
            {
            pushFollow(FOLLOW_rule__SOA_AwS__Group__1__Impl_in_rule__SOA_AwS__Group__13286);
            rule__SOA_AwS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOA_AwS__Group__2_in_rule__SOA_AwS__Group__13289);
            rule__SOA_AwS__Group__2();

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
    // $ANTLR end "rule__SOA_AwS__Group__1"


    // $ANTLR start "rule__SOA_AwS__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1547:1: rule__SOA_AwS__Group__1__Impl : ( ( rule__SOA_AwS__NameAssignment_1 ) ) ;
    public final void rule__SOA_AwS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1551:1: ( ( ( rule__SOA_AwS__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1552:1: ( ( rule__SOA_AwS__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1552:1: ( ( rule__SOA_AwS__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1553:1: ( rule__SOA_AwS__NameAssignment_1 )
            {
             before(grammarAccess.getSOA_AwSAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1554:1: ( rule__SOA_AwS__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1554:2: rule__SOA_AwS__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SOA_AwS__NameAssignment_1_in_rule__SOA_AwS__Group__1__Impl3316);
            rule__SOA_AwS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSOA_AwSAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SOA_AwS__Group__1__Impl"


    // $ANTLR start "rule__SOA_AwS__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1564:1: rule__SOA_AwS__Group__2 : rule__SOA_AwS__Group__2__Impl rule__SOA_AwS__Group__3 ;
    public final void rule__SOA_AwS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1568:1: ( rule__SOA_AwS__Group__2__Impl rule__SOA_AwS__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1569:2: rule__SOA_AwS__Group__2__Impl rule__SOA_AwS__Group__3
            {
            pushFollow(FOLLOW_rule__SOA_AwS__Group__2__Impl_in_rule__SOA_AwS__Group__23346);
            rule__SOA_AwS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOA_AwS__Group__3_in_rule__SOA_AwS__Group__23349);
            rule__SOA_AwS__Group__3();

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
    // $ANTLR end "rule__SOA_AwS__Group__2"


    // $ANTLR start "rule__SOA_AwS__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1576:1: rule__SOA_AwS__Group__2__Impl : ( ( rule__SOA_AwS__Group_2__0 )? ) ;
    public final void rule__SOA_AwS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1580:1: ( ( ( rule__SOA_AwS__Group_2__0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1581:1: ( ( rule__SOA_AwS__Group_2__0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1581:1: ( ( rule__SOA_AwS__Group_2__0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1582:1: ( rule__SOA_AwS__Group_2__0 )?
            {
             before(grammarAccess.getSOA_AwSAccess().getGroup_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1583:1: ( rule__SOA_AwS__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1583:2: rule__SOA_AwS__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SOA_AwS__Group_2__0_in_rule__SOA_AwS__Group__2__Impl3376);
                    rule__SOA_AwS__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSOA_AwSAccess().getGroup_2()); 

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
    // $ANTLR end "rule__SOA_AwS__Group__2__Impl"


    // $ANTLR start "rule__SOA_AwS__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1593:1: rule__SOA_AwS__Group__3 : rule__SOA_AwS__Group__3__Impl rule__SOA_AwS__Group__4 ;
    public final void rule__SOA_AwS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1597:1: ( rule__SOA_AwS__Group__3__Impl rule__SOA_AwS__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1598:2: rule__SOA_AwS__Group__3__Impl rule__SOA_AwS__Group__4
            {
            pushFollow(FOLLOW_rule__SOA_AwS__Group__3__Impl_in_rule__SOA_AwS__Group__33407);
            rule__SOA_AwS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOA_AwS__Group__4_in_rule__SOA_AwS__Group__33410);
            rule__SOA_AwS__Group__4();

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
    // $ANTLR end "rule__SOA_AwS__Group__3"


    // $ANTLR start "rule__SOA_AwS__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1605:1: rule__SOA_AwS__Group__3__Impl : ( ( rule__SOA_AwS__UnorderedGroup_3 ) ) ;
    public final void rule__SOA_AwS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1609:1: ( ( ( rule__SOA_AwS__UnorderedGroup_3 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1610:1: ( ( rule__SOA_AwS__UnorderedGroup_3 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1610:1: ( ( rule__SOA_AwS__UnorderedGroup_3 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1611:1: ( rule__SOA_AwS__UnorderedGroup_3 )
            {
             before(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1612:1: ( rule__SOA_AwS__UnorderedGroup_3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1612:2: rule__SOA_AwS__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__SOA_AwS__UnorderedGroup_3_in_rule__SOA_AwS__Group__3__Impl3437);
            rule__SOA_AwS__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3()); 

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
    // $ANTLR end "rule__SOA_AwS__Group__3__Impl"


    // $ANTLR start "rule__SOA_AwS__Group__4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1622:1: rule__SOA_AwS__Group__4 : rule__SOA_AwS__Group__4__Impl ;
    public final void rule__SOA_AwS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1626:1: ( rule__SOA_AwS__Group__4__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1627:2: rule__SOA_AwS__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SOA_AwS__Group__4__Impl_in_rule__SOA_AwS__Group__43467);
            rule__SOA_AwS__Group__4__Impl();

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
    // $ANTLR end "rule__SOA_AwS__Group__4"


    // $ANTLR start "rule__SOA_AwS__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1633:1: rule__SOA_AwS__Group__4__Impl : ( ( rule__SOA_AwS__Alternatives_4 )* ) ;
    public final void rule__SOA_AwS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1637:1: ( ( ( rule__SOA_AwS__Alternatives_4 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1638:1: ( ( rule__SOA_AwS__Alternatives_4 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1638:1: ( ( rule__SOA_AwS__Alternatives_4 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1639:1: ( rule__SOA_AwS__Alternatives_4 )*
            {
             before(grammarAccess.getSOA_AwSAccess().getAlternatives_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1640:1: ( rule__SOA_AwS__Alternatives_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22||LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1640:2: rule__SOA_AwS__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__SOA_AwS__Alternatives_4_in_rule__SOA_AwS__Group__4__Impl3494);
            	    rule__SOA_AwS__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSOA_AwSAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__SOA_AwS__Group__4__Impl"


    // $ANTLR start "rule__SOA_AwS__Group_2__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1660:1: rule__SOA_AwS__Group_2__0 : rule__SOA_AwS__Group_2__0__Impl rule__SOA_AwS__Group_2__1 ;
    public final void rule__SOA_AwS__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1664:1: ( rule__SOA_AwS__Group_2__0__Impl rule__SOA_AwS__Group_2__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1665:2: rule__SOA_AwS__Group_2__0__Impl rule__SOA_AwS__Group_2__1
            {
            pushFollow(FOLLOW_rule__SOA_AwS__Group_2__0__Impl_in_rule__SOA_AwS__Group_2__03535);
            rule__SOA_AwS__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOA_AwS__Group_2__1_in_rule__SOA_AwS__Group_2__03538);
            rule__SOA_AwS__Group_2__1();

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
    // $ANTLR end "rule__SOA_AwS__Group_2__0"


    // $ANTLR start "rule__SOA_AwS__Group_2__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1672:1: rule__SOA_AwS__Group_2__0__Impl : ( 'v' ) ;
    public final void rule__SOA_AwS__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1676:1: ( ( 'v' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1677:1: ( 'v' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1677:1: ( 'v' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1678:1: 'v'
            {
             before(grammarAccess.getSOA_AwSAccess().getVKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__SOA_AwS__Group_2__0__Impl3566); 
             after(grammarAccess.getSOA_AwSAccess().getVKeyword_2_0()); 

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
    // $ANTLR end "rule__SOA_AwS__Group_2__0__Impl"


    // $ANTLR start "rule__SOA_AwS__Group_2__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1691:1: rule__SOA_AwS__Group_2__1 : rule__SOA_AwS__Group_2__1__Impl ;
    public final void rule__SOA_AwS__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1695:1: ( rule__SOA_AwS__Group_2__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1696:2: rule__SOA_AwS__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SOA_AwS__Group_2__1__Impl_in_rule__SOA_AwS__Group_2__13597);
            rule__SOA_AwS__Group_2__1__Impl();

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
    // $ANTLR end "rule__SOA_AwS__Group_2__1"


    // $ANTLR start "rule__SOA_AwS__Group_2__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1702:1: rule__SOA_AwS__Group_2__1__Impl : ( ( rule__SOA_AwS__VersionAssignment_2_1 ) ) ;
    public final void rule__SOA_AwS__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1706:1: ( ( ( rule__SOA_AwS__VersionAssignment_2_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1707:1: ( ( rule__SOA_AwS__VersionAssignment_2_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1707:1: ( ( rule__SOA_AwS__VersionAssignment_2_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1708:1: ( rule__SOA_AwS__VersionAssignment_2_1 )
            {
             before(grammarAccess.getSOA_AwSAccess().getVersionAssignment_2_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1709:1: ( rule__SOA_AwS__VersionAssignment_2_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1709:2: rule__SOA_AwS__VersionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SOA_AwS__VersionAssignment_2_1_in_rule__SOA_AwS__Group_2__1__Impl3624);
            rule__SOA_AwS__VersionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSOA_AwSAccess().getVersionAssignment_2_1()); 

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
    // $ANTLR end "rule__SOA_AwS__Group_2__1__Impl"


    // $ANTLR start "rule__Vorgangsservice__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1723:1: rule__Vorgangsservice__Group__0 : rule__Vorgangsservice__Group__0__Impl rule__Vorgangsservice__Group__1 ;
    public final void rule__Vorgangsservice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1727:1: ( rule__Vorgangsservice__Group__0__Impl rule__Vorgangsservice__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1728:2: rule__Vorgangsservice__Group__0__Impl rule__Vorgangsservice__Group__1
            {
            pushFollow(FOLLOW_rule__Vorgangsservice__Group__0__Impl_in_rule__Vorgangsservice__Group__03658);
            rule__Vorgangsservice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorgangsservice__Group__1_in_rule__Vorgangsservice__Group__03661);
            rule__Vorgangsservice__Group__1();

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
    // $ANTLR end "rule__Vorgangsservice__Group__0"


    // $ANTLR start "rule__Vorgangsservice__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1735:1: rule__Vorgangsservice__Group__0__Impl : ( 'Vorgangsservice' ) ;
    public final void rule__Vorgangsservice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1739:1: ( ( 'Vorgangsservice' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1740:1: ( 'Vorgangsservice' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1740:1: ( 'Vorgangsservice' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1741:1: 'Vorgangsservice'
            {
             before(grammarAccess.getVorgangsserviceAccess().getVorgangsserviceKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Vorgangsservice__Group__0__Impl3689); 
             after(grammarAccess.getVorgangsserviceAccess().getVorgangsserviceKeyword_0()); 

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
    // $ANTLR end "rule__Vorgangsservice__Group__0__Impl"


    // $ANTLR start "rule__Vorgangsservice__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1754:1: rule__Vorgangsservice__Group__1 : rule__Vorgangsservice__Group__1__Impl rule__Vorgangsservice__Group__2 ;
    public final void rule__Vorgangsservice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1758:1: ( rule__Vorgangsservice__Group__1__Impl rule__Vorgangsservice__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1759:2: rule__Vorgangsservice__Group__1__Impl rule__Vorgangsservice__Group__2
            {
            pushFollow(FOLLOW_rule__Vorgangsservice__Group__1__Impl_in_rule__Vorgangsservice__Group__13720);
            rule__Vorgangsservice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorgangsservice__Group__2_in_rule__Vorgangsservice__Group__13723);
            rule__Vorgangsservice__Group__2();

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
    // $ANTLR end "rule__Vorgangsservice__Group__1"


    // $ANTLR start "rule__Vorgangsservice__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1766:1: rule__Vorgangsservice__Group__1__Impl : ( ( rule__Vorgangsservice__NameAssignment_1 ) ) ;
    public final void rule__Vorgangsservice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1770:1: ( ( ( rule__Vorgangsservice__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1771:1: ( ( rule__Vorgangsservice__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1771:1: ( ( rule__Vorgangsservice__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1772:1: ( rule__Vorgangsservice__NameAssignment_1 )
            {
             before(grammarAccess.getVorgangsserviceAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1773:1: ( rule__Vorgangsservice__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1773:2: rule__Vorgangsservice__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Vorgangsservice__NameAssignment_1_in_rule__Vorgangsservice__Group__1__Impl3750);
            rule__Vorgangsservice__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVorgangsserviceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Vorgangsservice__Group__1__Impl"


    // $ANTLR start "rule__Vorgangsservice__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1783:1: rule__Vorgangsservice__Group__2 : rule__Vorgangsservice__Group__2__Impl rule__Vorgangsservice__Group__3 ;
    public final void rule__Vorgangsservice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1787:1: ( rule__Vorgangsservice__Group__2__Impl rule__Vorgangsservice__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1788:2: rule__Vorgangsservice__Group__2__Impl rule__Vorgangsservice__Group__3
            {
            pushFollow(FOLLOW_rule__Vorgangsservice__Group__2__Impl_in_rule__Vorgangsservice__Group__23780);
            rule__Vorgangsservice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorgangsservice__Group__3_in_rule__Vorgangsservice__Group__23783);
            rule__Vorgangsservice__Group__3();

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
    // $ANTLR end "rule__Vorgangsservice__Group__2"


    // $ANTLR start "rule__Vorgangsservice__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1795:1: rule__Vorgangsservice__Group__2__Impl : ( '{' ) ;
    public final void rule__Vorgangsservice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1799:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1800:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1800:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1801:1: '{'
            {
             before(grammarAccess.getVorgangsserviceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Vorgangsservice__Group__2__Impl3811); 
             after(grammarAccess.getVorgangsserviceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Vorgangsservice__Group__2__Impl"


    // $ANTLR start "rule__Vorgangsservice__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1814:1: rule__Vorgangsservice__Group__3 : rule__Vorgangsservice__Group__3__Impl rule__Vorgangsservice__Group__4 ;
    public final void rule__Vorgangsservice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1818:1: ( rule__Vorgangsservice__Group__3__Impl rule__Vorgangsservice__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1819:2: rule__Vorgangsservice__Group__3__Impl rule__Vorgangsservice__Group__4
            {
            pushFollow(FOLLOW_rule__Vorgangsservice__Group__3__Impl_in_rule__Vorgangsservice__Group__33842);
            rule__Vorgangsservice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorgangsservice__Group__4_in_rule__Vorgangsservice__Group__33845);
            rule__Vorgangsservice__Group__4();

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
    // $ANTLR end "rule__Vorgangsservice__Group__3"


    // $ANTLR start "rule__Vorgangsservice__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1826:1: rule__Vorgangsservice__Group__3__Impl : ( ( rule__Vorgangsservice__ChoreographieIFAssignment_3 ) ) ;
    public final void rule__Vorgangsservice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1830:1: ( ( ( rule__Vorgangsservice__ChoreographieIFAssignment_3 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1831:1: ( ( rule__Vorgangsservice__ChoreographieIFAssignment_3 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1831:1: ( ( rule__Vorgangsservice__ChoreographieIFAssignment_3 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1832:1: ( rule__Vorgangsservice__ChoreographieIFAssignment_3 )
            {
             before(grammarAccess.getVorgangsserviceAccess().getChoreographieIFAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1833:1: ( rule__Vorgangsservice__ChoreographieIFAssignment_3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1833:2: rule__Vorgangsservice__ChoreographieIFAssignment_3
            {
            pushFollow(FOLLOW_rule__Vorgangsservice__ChoreographieIFAssignment_3_in_rule__Vorgangsservice__Group__3__Impl3872);
            rule__Vorgangsservice__ChoreographieIFAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVorgangsserviceAccess().getChoreographieIFAssignment_3()); 

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
    // $ANTLR end "rule__Vorgangsservice__Group__3__Impl"


    // $ANTLR start "rule__Vorgangsservice__Group__4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1843:1: rule__Vorgangsservice__Group__4 : rule__Vorgangsservice__Group__4__Impl rule__Vorgangsservice__Group__5 ;
    public final void rule__Vorgangsservice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1847:1: ( rule__Vorgangsservice__Group__4__Impl rule__Vorgangsservice__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1848:2: rule__Vorgangsservice__Group__4__Impl rule__Vorgangsservice__Group__5
            {
            pushFollow(FOLLOW_rule__Vorgangsservice__Group__4__Impl_in_rule__Vorgangsservice__Group__43902);
            rule__Vorgangsservice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorgangsservice__Group__5_in_rule__Vorgangsservice__Group__43905);
            rule__Vorgangsservice__Group__5();

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
    // $ANTLR end "rule__Vorgangsservice__Group__4"


    // $ANTLR start "rule__Vorgangsservice__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1855:1: rule__Vorgangsservice__Group__4__Impl : ( ( rule__Vorgangsservice__VorgangsservicesElementarAssignment_4 )* ) ;
    public final void rule__Vorgangsservice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1859:1: ( ( ( rule__Vorgangsservice__VorgangsservicesElementarAssignment_4 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1860:1: ( ( rule__Vorgangsservice__VorgangsservicesElementarAssignment_4 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1860:1: ( ( rule__Vorgangsservice__VorgangsservicesElementarAssignment_4 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1861:1: ( rule__Vorgangsservice__VorgangsservicesElementarAssignment_4 )*
            {
             before(grammarAccess.getVorgangsserviceAccess().getVorgangsservicesElementarAssignment_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1862:1: ( rule__Vorgangsservice__VorgangsservicesElementarAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1862:2: rule__Vorgangsservice__VorgangsservicesElementarAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Vorgangsservice__VorgangsservicesElementarAssignment_4_in_rule__Vorgangsservice__Group__4__Impl3932);
            	    rule__Vorgangsservice__VorgangsservicesElementarAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getVorgangsserviceAccess().getVorgangsservicesElementarAssignment_4()); 

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
    // $ANTLR end "rule__Vorgangsservice__Group__4__Impl"


    // $ANTLR start "rule__Vorgangsservice__Group__5"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1872:1: rule__Vorgangsservice__Group__5 : rule__Vorgangsservice__Group__5__Impl rule__Vorgangsservice__Group__6 ;
    public final void rule__Vorgangsservice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1876:1: ( rule__Vorgangsservice__Group__5__Impl rule__Vorgangsservice__Group__6 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1877:2: rule__Vorgangsservice__Group__5__Impl rule__Vorgangsservice__Group__6
            {
            pushFollow(FOLLOW_rule__Vorgangsservice__Group__5__Impl_in_rule__Vorgangsservice__Group__53963);
            rule__Vorgangsservice__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vorgangsservice__Group__6_in_rule__Vorgangsservice__Group__53966);
            rule__Vorgangsservice__Group__6();

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
    // $ANTLR end "rule__Vorgangsservice__Group__5"


    // $ANTLR start "rule__Vorgangsservice__Group__5__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1884:1: rule__Vorgangsservice__Group__5__Impl : ( ( rule__Vorgangsservice__WorkflowAssignment_5 ) ) ;
    public final void rule__Vorgangsservice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1888:1: ( ( ( rule__Vorgangsservice__WorkflowAssignment_5 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1889:1: ( ( rule__Vorgangsservice__WorkflowAssignment_5 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1889:1: ( ( rule__Vorgangsservice__WorkflowAssignment_5 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1890:1: ( rule__Vorgangsservice__WorkflowAssignment_5 )
            {
             before(grammarAccess.getVorgangsserviceAccess().getWorkflowAssignment_5()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1891:1: ( rule__Vorgangsservice__WorkflowAssignment_5 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1891:2: rule__Vorgangsservice__WorkflowAssignment_5
            {
            pushFollow(FOLLOW_rule__Vorgangsservice__WorkflowAssignment_5_in_rule__Vorgangsservice__Group__5__Impl3993);
            rule__Vorgangsservice__WorkflowAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVorgangsserviceAccess().getWorkflowAssignment_5()); 

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
    // $ANTLR end "rule__Vorgangsservice__Group__5__Impl"


    // $ANTLR start "rule__Vorgangsservice__Group__6"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1901:1: rule__Vorgangsservice__Group__6 : rule__Vorgangsservice__Group__6__Impl ;
    public final void rule__Vorgangsservice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1905:1: ( rule__Vorgangsservice__Group__6__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1906:2: rule__Vorgangsservice__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Vorgangsservice__Group__6__Impl_in_rule__Vorgangsservice__Group__64023);
            rule__Vorgangsservice__Group__6__Impl();

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
    // $ANTLR end "rule__Vorgangsservice__Group__6"


    // $ANTLR start "rule__Vorgangsservice__Group__6__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1912:1: rule__Vorgangsservice__Group__6__Impl : ( '}' ) ;
    public final void rule__Vorgangsservice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1916:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1917:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1917:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1918:1: '}'
            {
             before(grammarAccess.getVorgangsserviceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__Vorgangsservice__Group__6__Impl4051); 
             after(grammarAccess.getVorgangsserviceAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Vorgangsservice__Group__6__Impl"


    // $ANTLR start "rule__VorgangsserviceElementar__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1945:1: rule__VorgangsserviceElementar__Group__0 : rule__VorgangsserviceElementar__Group__0__Impl rule__VorgangsserviceElementar__Group__1 ;
    public final void rule__VorgangsserviceElementar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1949:1: ( rule__VorgangsserviceElementar__Group__0__Impl rule__VorgangsserviceElementar__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1950:2: rule__VorgangsserviceElementar__Group__0__Impl rule__VorgangsserviceElementar__Group__1
            {
            pushFollow(FOLLOW_rule__VorgangsserviceElementar__Group__0__Impl_in_rule__VorgangsserviceElementar__Group__04096);
            rule__VorgangsserviceElementar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VorgangsserviceElementar__Group__1_in_rule__VorgangsserviceElementar__Group__04099);
            rule__VorgangsserviceElementar__Group__1();

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
    // $ANTLR end "rule__VorgangsserviceElementar__Group__0"


    // $ANTLR start "rule__VorgangsserviceElementar__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1957:1: rule__VorgangsserviceElementar__Group__0__Impl : ( ( rule__VorgangsserviceElementar__NameAssignment_0 ) ) ;
    public final void rule__VorgangsserviceElementar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1961:1: ( ( ( rule__VorgangsserviceElementar__NameAssignment_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1962:1: ( ( rule__VorgangsserviceElementar__NameAssignment_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1962:1: ( ( rule__VorgangsserviceElementar__NameAssignment_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1963:1: ( rule__VorgangsserviceElementar__NameAssignment_0 )
            {
             before(grammarAccess.getVorgangsserviceElementarAccess().getNameAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1964:1: ( rule__VorgangsserviceElementar__NameAssignment_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1964:2: rule__VorgangsserviceElementar__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__VorgangsserviceElementar__NameAssignment_0_in_rule__VorgangsserviceElementar__Group__0__Impl4126);
            rule__VorgangsserviceElementar__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVorgangsserviceElementarAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__VorgangsserviceElementar__Group__0__Impl"


    // $ANTLR start "rule__VorgangsserviceElementar__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1974:1: rule__VorgangsserviceElementar__Group__1 : rule__VorgangsserviceElementar__Group__1__Impl rule__VorgangsserviceElementar__Group__2 ;
    public final void rule__VorgangsserviceElementar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1978:1: ( rule__VorgangsserviceElementar__Group__1__Impl rule__VorgangsserviceElementar__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1979:2: rule__VorgangsserviceElementar__Group__1__Impl rule__VorgangsserviceElementar__Group__2
            {
            pushFollow(FOLLOW_rule__VorgangsserviceElementar__Group__1__Impl_in_rule__VorgangsserviceElementar__Group__14156);
            rule__VorgangsserviceElementar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VorgangsserviceElementar__Group__2_in_rule__VorgangsserviceElementar__Group__14159);
            rule__VorgangsserviceElementar__Group__2();

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
    // $ANTLR end "rule__VorgangsserviceElementar__Group__1"


    // $ANTLR start "rule__VorgangsserviceElementar__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1986:1: rule__VorgangsserviceElementar__Group__1__Impl : ( 'VOT' ) ;
    public final void rule__VorgangsserviceElementar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1990:1: ( ( 'VOT' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1991:1: ( 'VOT' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1991:1: ( 'VOT' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:1992:1: 'VOT'
            {
             before(grammarAccess.getVorgangsserviceElementarAccess().getVOTKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__VorgangsserviceElementar__Group__1__Impl4187); 
             after(grammarAccess.getVorgangsserviceElementarAccess().getVOTKeyword_1()); 

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
    // $ANTLR end "rule__VorgangsserviceElementar__Group__1__Impl"


    // $ANTLR start "rule__VorgangsserviceElementar__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2005:1: rule__VorgangsserviceElementar__Group__2 : rule__VorgangsserviceElementar__Group__2__Impl rule__VorgangsserviceElementar__Group__3 ;
    public final void rule__VorgangsserviceElementar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2009:1: ( rule__VorgangsserviceElementar__Group__2__Impl rule__VorgangsserviceElementar__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2010:2: rule__VorgangsserviceElementar__Group__2__Impl rule__VorgangsserviceElementar__Group__3
            {
            pushFollow(FOLLOW_rule__VorgangsserviceElementar__Group__2__Impl_in_rule__VorgangsserviceElementar__Group__24218);
            rule__VorgangsserviceElementar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VorgangsserviceElementar__Group__3_in_rule__VorgangsserviceElementar__Group__24221);
            rule__VorgangsserviceElementar__Group__3();

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
    // $ANTLR end "rule__VorgangsserviceElementar__Group__2"


    // $ANTLR start "rule__VorgangsserviceElementar__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2017:1: rule__VorgangsserviceElementar__Group__2__Impl : ( ( rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_2 ) ) ;
    public final void rule__VorgangsserviceElementar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2021:1: ( ( ( rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2022:1: ( ( rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2022:1: ( ( rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2023:1: ( rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_2 )
            {
             before(grammarAccess.getVorgangsserviceElementarAccess().getKomponentenObjekttypAssignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2024:1: ( rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2024:2: rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_2
            {
            pushFollow(FOLLOW_rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_2_in_rule__VorgangsserviceElementar__Group__2__Impl4248);
            rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVorgangsserviceElementarAccess().getKomponentenObjekttypAssignment_2()); 

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
    // $ANTLR end "rule__VorgangsserviceElementar__Group__2__Impl"


    // $ANTLR start "rule__VorgangsserviceElementar__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2034:1: rule__VorgangsserviceElementar__Group__3 : rule__VorgangsserviceElementar__Group__3__Impl ;
    public final void rule__VorgangsserviceElementar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2038:1: ( rule__VorgangsserviceElementar__Group__3__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2039:2: rule__VorgangsserviceElementar__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VorgangsserviceElementar__Group__3__Impl_in_rule__VorgangsserviceElementar__Group__34278);
            rule__VorgangsserviceElementar__Group__3__Impl();

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
    // $ANTLR end "rule__VorgangsserviceElementar__Group__3"


    // $ANTLR start "rule__VorgangsserviceElementar__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2045:1: rule__VorgangsserviceElementar__Group__3__Impl : ( ( rule__VorgangsserviceElementar__InterfaceAssignment_3 ) ) ;
    public final void rule__VorgangsserviceElementar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2049:1: ( ( ( rule__VorgangsserviceElementar__InterfaceAssignment_3 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2050:1: ( ( rule__VorgangsserviceElementar__InterfaceAssignment_3 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2050:1: ( ( rule__VorgangsserviceElementar__InterfaceAssignment_3 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2051:1: ( rule__VorgangsserviceElementar__InterfaceAssignment_3 )
            {
             before(grammarAccess.getVorgangsserviceElementarAccess().getInterfaceAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2052:1: ( rule__VorgangsserviceElementar__InterfaceAssignment_3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2052:2: rule__VorgangsserviceElementar__InterfaceAssignment_3
            {
            pushFollow(FOLLOW_rule__VorgangsserviceElementar__InterfaceAssignment_3_in_rule__VorgangsserviceElementar__Group__3__Impl4305);
            rule__VorgangsserviceElementar__InterfaceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVorgangsserviceElementarAccess().getInterfaceAssignment_3()); 

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
    // $ANTLR end "rule__VorgangsserviceElementar__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2070:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2074:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2075:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__04343);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__04346);
            rule__Interface__Group__1();

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
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2082:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__NameAssignment_0 ) ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2086:1: ( ( ( rule__Interface__NameAssignment_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2087:1: ( ( rule__Interface__NameAssignment_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2087:1: ( ( rule__Interface__NameAssignment_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2088:1: ( rule__Interface__NameAssignment_0 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2089:1: ( rule__Interface__NameAssignment_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2089:2: rule__Interface__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_0_in_rule__Interface__Group__0__Impl4373);
            rule__Interface__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2099:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2103:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2104:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__14403);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__14406);
            rule__Interface__Group__2();

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
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2111:1: rule__Interface__Group__1__Impl : ( '{' ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2115:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2116:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2116:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2117:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Interface__Group__1__Impl4434); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2130:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2134:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2135:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__24465);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__24468);
            rule__Interface__Group__3();

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
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2142:1: rule__Interface__Group__2__Impl : ( ( ( rule__Interface__MethodenAssignment_2 ) ) ( ( rule__Interface__MethodenAssignment_2 )* ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2146:1: ( ( ( ( rule__Interface__MethodenAssignment_2 ) ) ( ( rule__Interface__MethodenAssignment_2 )* ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2147:1: ( ( ( rule__Interface__MethodenAssignment_2 ) ) ( ( rule__Interface__MethodenAssignment_2 )* ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2147:1: ( ( ( rule__Interface__MethodenAssignment_2 ) ) ( ( rule__Interface__MethodenAssignment_2 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2148:1: ( ( rule__Interface__MethodenAssignment_2 ) ) ( ( rule__Interface__MethodenAssignment_2 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2148:1: ( ( rule__Interface__MethodenAssignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2149:1: ( rule__Interface__MethodenAssignment_2 )
            {
             before(grammarAccess.getInterfaceAccess().getMethodenAssignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2150:1: ( rule__Interface__MethodenAssignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2150:2: rule__Interface__MethodenAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface__MethodenAssignment_2_in_rule__Interface__Group__2__Impl4497);
            rule__Interface__MethodenAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getMethodenAssignment_2()); 

            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2153:1: ( ( rule__Interface__MethodenAssignment_2 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2154:1: ( rule__Interface__MethodenAssignment_2 )*
            {
             before(grammarAccess.getInterfaceAccess().getMethodenAssignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2155:1: ( rule__Interface__MethodenAssignment_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2155:2: rule__Interface__MethodenAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Interface__MethodenAssignment_2_in_rule__Interface__Group__2__Impl4509);
            	    rule__Interface__MethodenAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getMethodenAssignment_2()); 

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
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2166:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2170:1: ( rule__Interface__Group__3__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2171:2: rule__Interface__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__34542);
            rule__Interface__Group__3__Impl();

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
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2177:1: rule__Interface__Group__3__Impl : ( '}' ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2181:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2182:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2182:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2183:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Interface__Group__3__Impl4570); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__ServiceMethode__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2204:1: rule__ServiceMethode__Group__0 : rule__ServiceMethode__Group__0__Impl rule__ServiceMethode__Group__1 ;
    public final void rule__ServiceMethode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2208:1: ( rule__ServiceMethode__Group__0__Impl rule__ServiceMethode__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2209:2: rule__ServiceMethode__Group__0__Impl rule__ServiceMethode__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceMethode__Group__0__Impl_in_rule__ServiceMethode__Group__04609);
            rule__ServiceMethode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceMethode__Group__1_in_rule__ServiceMethode__Group__04612);
            rule__ServiceMethode__Group__1();

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
    // $ANTLR end "rule__ServiceMethode__Group__0"


    // $ANTLR start "rule__ServiceMethode__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2216:1: rule__ServiceMethode__Group__0__Impl : ( ( rule__ServiceMethode__NameAssignment_0 ) ) ;
    public final void rule__ServiceMethode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2220:1: ( ( ( rule__ServiceMethode__NameAssignment_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2221:1: ( ( rule__ServiceMethode__NameAssignment_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2221:1: ( ( rule__ServiceMethode__NameAssignment_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2222:1: ( rule__ServiceMethode__NameAssignment_0 )
            {
             before(grammarAccess.getServiceMethodeAccess().getNameAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2223:1: ( rule__ServiceMethode__NameAssignment_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2223:2: rule__ServiceMethode__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ServiceMethode__NameAssignment_0_in_rule__ServiceMethode__Group__0__Impl4639);
            rule__ServiceMethode__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getServiceMethodeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ServiceMethode__Group__0__Impl"


    // $ANTLR start "rule__ServiceMethode__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2233:1: rule__ServiceMethode__Group__1 : rule__ServiceMethode__Group__1__Impl rule__ServiceMethode__Group__2 ;
    public final void rule__ServiceMethode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2237:1: ( rule__ServiceMethode__Group__1__Impl rule__ServiceMethode__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2238:2: rule__ServiceMethode__Group__1__Impl rule__ServiceMethode__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceMethode__Group__1__Impl_in_rule__ServiceMethode__Group__14669);
            rule__ServiceMethode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceMethode__Group__2_in_rule__ServiceMethode__Group__14672);
            rule__ServiceMethode__Group__2();

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
    // $ANTLR end "rule__ServiceMethode__Group__1"


    // $ANTLR start "rule__ServiceMethode__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2245:1: rule__ServiceMethode__Group__1__Impl : ( '(' ) ;
    public final void rule__ServiceMethode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2249:1: ( ( '(' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2250:1: ( '(' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2250:1: ( '(' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2251:1: '('
            {
             before(grammarAccess.getServiceMethodeAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__ServiceMethode__Group__1__Impl4700); 
             after(grammarAccess.getServiceMethodeAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ServiceMethode__Group__1__Impl"


    // $ANTLR start "rule__ServiceMethode__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2264:1: rule__ServiceMethode__Group__2 : rule__ServiceMethode__Group__2__Impl rule__ServiceMethode__Group__3 ;
    public final void rule__ServiceMethode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2268:1: ( rule__ServiceMethode__Group__2__Impl rule__ServiceMethode__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2269:2: rule__ServiceMethode__Group__2__Impl rule__ServiceMethode__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceMethode__Group__2__Impl_in_rule__ServiceMethode__Group__24731);
            rule__ServiceMethode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceMethode__Group__3_in_rule__ServiceMethode__Group__24734);
            rule__ServiceMethode__Group__3();

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
    // $ANTLR end "rule__ServiceMethode__Group__2"


    // $ANTLR start "rule__ServiceMethode__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2276:1: rule__ServiceMethode__Group__2__Impl : ( ( rule__ServiceMethode__ParameterAssignment_2 )* ) ;
    public final void rule__ServiceMethode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2280:1: ( ( ( rule__ServiceMethode__ParameterAssignment_2 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2281:1: ( ( rule__ServiceMethode__ParameterAssignment_2 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2281:1: ( ( rule__ServiceMethode__ParameterAssignment_2 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2282:1: ( rule__ServiceMethode__ParameterAssignment_2 )*
            {
             before(grammarAccess.getServiceMethodeAccess().getParameterAssignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2283:1: ( rule__ServiceMethode__ParameterAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2283:2: rule__ServiceMethode__ParameterAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ServiceMethode__ParameterAssignment_2_in_rule__ServiceMethode__Group__2__Impl4761);
            	    rule__ServiceMethode__ParameterAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getServiceMethodeAccess().getParameterAssignment_2()); 

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
    // $ANTLR end "rule__ServiceMethode__Group__2__Impl"


    // $ANTLR start "rule__ServiceMethode__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2293:1: rule__ServiceMethode__Group__3 : rule__ServiceMethode__Group__3__Impl ;
    public final void rule__ServiceMethode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2297:1: ( rule__ServiceMethode__Group__3__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2298:2: rule__ServiceMethode__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ServiceMethode__Group__3__Impl_in_rule__ServiceMethode__Group__34792);
            rule__ServiceMethode__Group__3__Impl();

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
    // $ANTLR end "rule__ServiceMethode__Group__3"


    // $ANTLR start "rule__ServiceMethode__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2304:1: rule__ServiceMethode__Group__3__Impl : ( ');' ) ;
    public final void rule__ServiceMethode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2308:1: ( ( ');' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2309:1: ( ');' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2309:1: ( ');' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2310:1: ');'
            {
             before(grammarAccess.getServiceMethodeAccess().getRightParenthesisSemicolonKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__ServiceMethode__Group__3__Impl4820); 
             after(grammarAccess.getServiceMethodeAccess().getRightParenthesisSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__ServiceMethode__Group__3__Impl"


    // $ANTLR start "rule__Workflow__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2331:1: rule__Workflow__Group__0 : rule__Workflow__Group__0__Impl rule__Workflow__Group__1 ;
    public final void rule__Workflow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2335:1: ( rule__Workflow__Group__0__Impl rule__Workflow__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2336:2: rule__Workflow__Group__0__Impl rule__Workflow__Group__1
            {
            pushFollow(FOLLOW_rule__Workflow__Group__0__Impl_in_rule__Workflow__Group__04859);
            rule__Workflow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Workflow__Group__1_in_rule__Workflow__Group__04862);
            rule__Workflow__Group__1();

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
    // $ANTLR end "rule__Workflow__Group__0"


    // $ANTLR start "rule__Workflow__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2343:1: rule__Workflow__Group__0__Impl : ( 'Workflow' ) ;
    public final void rule__Workflow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2347:1: ( ( 'Workflow' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2348:1: ( 'Workflow' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2348:1: ( 'Workflow' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2349:1: 'Workflow'
            {
             before(grammarAccess.getWorkflowAccess().getWorkflowKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Workflow__Group__0__Impl4890); 
             after(grammarAccess.getWorkflowAccess().getWorkflowKeyword_0()); 

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
    // $ANTLR end "rule__Workflow__Group__0__Impl"


    // $ANTLR start "rule__Workflow__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2362:1: rule__Workflow__Group__1 : rule__Workflow__Group__1__Impl rule__Workflow__Group__2 ;
    public final void rule__Workflow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2366:1: ( rule__Workflow__Group__1__Impl rule__Workflow__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2367:2: rule__Workflow__Group__1__Impl rule__Workflow__Group__2
            {
            pushFollow(FOLLOW_rule__Workflow__Group__1__Impl_in_rule__Workflow__Group__14921);
            rule__Workflow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Workflow__Group__2_in_rule__Workflow__Group__14924);
            rule__Workflow__Group__2();

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
    // $ANTLR end "rule__Workflow__Group__1"


    // $ANTLR start "rule__Workflow__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2374:1: rule__Workflow__Group__1__Impl : ( '{' ) ;
    public final void rule__Workflow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2378:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2379:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2379:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2380:1: '{'
            {
             before(grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Workflow__Group__1__Impl4952); 
             after(grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Workflow__Group__1__Impl"


    // $ANTLR start "rule__Workflow__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2393:1: rule__Workflow__Group__2 : rule__Workflow__Group__2__Impl rule__Workflow__Group__3 ;
    public final void rule__Workflow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2397:1: ( rule__Workflow__Group__2__Impl rule__Workflow__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2398:2: rule__Workflow__Group__2__Impl rule__Workflow__Group__3
            {
            pushFollow(FOLLOW_rule__Workflow__Group__2__Impl_in_rule__Workflow__Group__24983);
            rule__Workflow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Workflow__Group__3_in_rule__Workflow__Group__24986);
            rule__Workflow__Group__3();

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
    // $ANTLR end "rule__Workflow__Group__2"


    // $ANTLR start "rule__Workflow__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2405:1: rule__Workflow__Group__2__Impl : ( ( ( rule__Workflow__Alternatives_2 ) ) ( ( rule__Workflow__Alternatives_2 )* ) ) ;
    public final void rule__Workflow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2409:1: ( ( ( ( rule__Workflow__Alternatives_2 ) ) ( ( rule__Workflow__Alternatives_2 )* ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2410:1: ( ( ( rule__Workflow__Alternatives_2 ) ) ( ( rule__Workflow__Alternatives_2 )* ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2410:1: ( ( ( rule__Workflow__Alternatives_2 ) ) ( ( rule__Workflow__Alternatives_2 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2411:1: ( ( rule__Workflow__Alternatives_2 ) ) ( ( rule__Workflow__Alternatives_2 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2411:1: ( ( rule__Workflow__Alternatives_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2412:1: ( rule__Workflow__Alternatives_2 )
            {
             before(grammarAccess.getWorkflowAccess().getAlternatives_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2413:1: ( rule__Workflow__Alternatives_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2413:2: rule__Workflow__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Workflow__Alternatives_2_in_rule__Workflow__Group__2__Impl5015);
            rule__Workflow__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getAlternatives_2()); 

            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2416:1: ( ( rule__Workflow__Alternatives_2 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2417:1: ( rule__Workflow__Alternatives_2 )*
            {
             before(grammarAccess.getWorkflowAccess().getAlternatives_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2418:1: ( rule__Workflow__Alternatives_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2418:2: rule__Workflow__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Workflow__Alternatives_2_in_rule__Workflow__Group__2__Impl5027);
            	    rule__Workflow__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getWorkflowAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Workflow__Group__2__Impl"


    // $ANTLR start "rule__Workflow__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2429:1: rule__Workflow__Group__3 : rule__Workflow__Group__3__Impl ;
    public final void rule__Workflow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2433:1: ( rule__Workflow__Group__3__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2434:2: rule__Workflow__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Workflow__Group__3__Impl_in_rule__Workflow__Group__35060);
            rule__Workflow__Group__3__Impl();

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
    // $ANTLR end "rule__Workflow__Group__3"


    // $ANTLR start "rule__Workflow__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2440:1: rule__Workflow__Group__3__Impl : ( '}' ) ;
    public final void rule__Workflow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2444:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2445:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2445:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2446:1: '}'
            {
             before(grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Workflow__Group__3__Impl5088); 
             after(grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Workflow__Group__3__Impl"


    // $ANTLR start "rule__Orchestrierung__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2467:1: rule__Orchestrierung__Group__0 : rule__Orchestrierung__Group__0__Impl rule__Orchestrierung__Group__1 ;
    public final void rule__Orchestrierung__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2471:1: ( rule__Orchestrierung__Group__0__Impl rule__Orchestrierung__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2472:2: rule__Orchestrierung__Group__0__Impl rule__Orchestrierung__Group__1
            {
            pushFollow(FOLLOW_rule__Orchestrierung__Group__0__Impl_in_rule__Orchestrierung__Group__05127);
            rule__Orchestrierung__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Orchestrierung__Group__1_in_rule__Orchestrierung__Group__05130);
            rule__Orchestrierung__Group__1();

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
    // $ANTLR end "rule__Orchestrierung__Group__0"


    // $ANTLR start "rule__Orchestrierung__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2479:1: rule__Orchestrierung__Group__0__Impl : ( ( rule__Orchestrierung__Group_0__0 )? ) ;
    public final void rule__Orchestrierung__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2483:1: ( ( ( rule__Orchestrierung__Group_0__0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2484:1: ( ( rule__Orchestrierung__Group_0__0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2484:1: ( ( rule__Orchestrierung__Group_0__0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2485:1: ( rule__Orchestrierung__Group_0__0 )?
            {
             before(grammarAccess.getOrchestrierungAccess().getGroup_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2486:1: ( rule__Orchestrierung__Group_0__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2486:2: rule__Orchestrierung__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Orchestrierung__Group_0__0_in_rule__Orchestrierung__Group__0__Impl5157);
                    rule__Orchestrierung__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrchestrierungAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Orchestrierung__Group__0__Impl"


    // $ANTLR start "rule__Orchestrierung__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2496:1: rule__Orchestrierung__Group__1 : rule__Orchestrierung__Group__1__Impl rule__Orchestrierung__Group__2 ;
    public final void rule__Orchestrierung__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2500:1: ( rule__Orchestrierung__Group__1__Impl rule__Orchestrierung__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2501:2: rule__Orchestrierung__Group__1__Impl rule__Orchestrierung__Group__2
            {
            pushFollow(FOLLOW_rule__Orchestrierung__Group__1__Impl_in_rule__Orchestrierung__Group__15188);
            rule__Orchestrierung__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Orchestrierung__Group__2_in_rule__Orchestrierung__Group__15191);
            rule__Orchestrierung__Group__2();

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
    // $ANTLR end "rule__Orchestrierung__Group__1"


    // $ANTLR start "rule__Orchestrierung__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2508:1: rule__Orchestrierung__Group__1__Impl : ( ( rule__Orchestrierung__Methode1Assignment_1 ) ) ;
    public final void rule__Orchestrierung__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2512:1: ( ( ( rule__Orchestrierung__Methode1Assignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2513:1: ( ( rule__Orchestrierung__Methode1Assignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2513:1: ( ( rule__Orchestrierung__Methode1Assignment_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2514:1: ( rule__Orchestrierung__Methode1Assignment_1 )
            {
             before(grammarAccess.getOrchestrierungAccess().getMethode1Assignment_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2515:1: ( rule__Orchestrierung__Methode1Assignment_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2515:2: rule__Orchestrierung__Methode1Assignment_1
            {
            pushFollow(FOLLOW_rule__Orchestrierung__Methode1Assignment_1_in_rule__Orchestrierung__Group__1__Impl5218);
            rule__Orchestrierung__Methode1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrchestrierungAccess().getMethode1Assignment_1()); 

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
    // $ANTLR end "rule__Orchestrierung__Group__1__Impl"


    // $ANTLR start "rule__Orchestrierung__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2525:1: rule__Orchestrierung__Group__2 : rule__Orchestrierung__Group__2__Impl rule__Orchestrierung__Group__3 ;
    public final void rule__Orchestrierung__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2529:1: ( rule__Orchestrierung__Group__2__Impl rule__Orchestrierung__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2530:2: rule__Orchestrierung__Group__2__Impl rule__Orchestrierung__Group__3
            {
            pushFollow(FOLLOW_rule__Orchestrierung__Group__2__Impl_in_rule__Orchestrierung__Group__25248);
            rule__Orchestrierung__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Orchestrierung__Group__3_in_rule__Orchestrierung__Group__25251);
            rule__Orchestrierung__Group__3();

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
    // $ANTLR end "rule__Orchestrierung__Group__2"


    // $ANTLR start "rule__Orchestrierung__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2537:1: rule__Orchestrierung__Group__2__Impl : ( '->' ) ;
    public final void rule__Orchestrierung__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2541:1: ( ( '->' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2542:1: ( '->' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2542:1: ( '->' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2543:1: '->'
            {
             before(grammarAccess.getOrchestrierungAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Orchestrierung__Group__2__Impl5279); 
             after(grammarAccess.getOrchestrierungAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__Orchestrierung__Group__2__Impl"


    // $ANTLR start "rule__Orchestrierung__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2556:1: rule__Orchestrierung__Group__3 : rule__Orchestrierung__Group__3__Impl rule__Orchestrierung__Group__4 ;
    public final void rule__Orchestrierung__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2560:1: ( rule__Orchestrierung__Group__3__Impl rule__Orchestrierung__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2561:2: rule__Orchestrierung__Group__3__Impl rule__Orchestrierung__Group__4
            {
            pushFollow(FOLLOW_rule__Orchestrierung__Group__3__Impl_in_rule__Orchestrierung__Group__35310);
            rule__Orchestrierung__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Orchestrierung__Group__4_in_rule__Orchestrierung__Group__35313);
            rule__Orchestrierung__Group__4();

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
    // $ANTLR end "rule__Orchestrierung__Group__3"


    // $ANTLR start "rule__Orchestrierung__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2568:1: rule__Orchestrierung__Group__3__Impl : ( ( rule__Orchestrierung__Methode2Assignment_3 ) ) ;
    public final void rule__Orchestrierung__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2572:1: ( ( ( rule__Orchestrierung__Methode2Assignment_3 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2573:1: ( ( rule__Orchestrierung__Methode2Assignment_3 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2573:1: ( ( rule__Orchestrierung__Methode2Assignment_3 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2574:1: ( rule__Orchestrierung__Methode2Assignment_3 )
            {
             before(grammarAccess.getOrchestrierungAccess().getMethode2Assignment_3()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2575:1: ( rule__Orchestrierung__Methode2Assignment_3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2575:2: rule__Orchestrierung__Methode2Assignment_3
            {
            pushFollow(FOLLOW_rule__Orchestrierung__Methode2Assignment_3_in_rule__Orchestrierung__Group__3__Impl5340);
            rule__Orchestrierung__Methode2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOrchestrierungAccess().getMethode2Assignment_3()); 

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
    // $ANTLR end "rule__Orchestrierung__Group__3__Impl"


    // $ANTLR start "rule__Orchestrierung__Group__4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2585:1: rule__Orchestrierung__Group__4 : rule__Orchestrierung__Group__4__Impl ;
    public final void rule__Orchestrierung__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2589:1: ( rule__Orchestrierung__Group__4__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2590:2: rule__Orchestrierung__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Orchestrierung__Group__4__Impl_in_rule__Orchestrierung__Group__45370);
            rule__Orchestrierung__Group__4__Impl();

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
    // $ANTLR end "rule__Orchestrierung__Group__4"


    // $ANTLR start "rule__Orchestrierung__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2596:1: rule__Orchestrierung__Group__4__Impl : ( ';' ) ;
    public final void rule__Orchestrierung__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2600:1: ( ( ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2601:1: ( ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2601:1: ( ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2602:1: ';'
            {
             before(grammarAccess.getOrchestrierungAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Orchestrierung__Group__4__Impl5398); 
             after(grammarAccess.getOrchestrierungAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Orchestrierung__Group__4__Impl"


    // $ANTLR start "rule__Orchestrierung__Group_0__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2625:1: rule__Orchestrierung__Group_0__0 : rule__Orchestrierung__Group_0__0__Impl rule__Orchestrierung__Group_0__1 ;
    public final void rule__Orchestrierung__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2629:1: ( rule__Orchestrierung__Group_0__0__Impl rule__Orchestrierung__Group_0__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2630:2: rule__Orchestrierung__Group_0__0__Impl rule__Orchestrierung__Group_0__1
            {
            pushFollow(FOLLOW_rule__Orchestrierung__Group_0__0__Impl_in_rule__Orchestrierung__Group_0__05439);
            rule__Orchestrierung__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Orchestrierung__Group_0__1_in_rule__Orchestrierung__Group_0__05442);
            rule__Orchestrierung__Group_0__1();

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
    // $ANTLR end "rule__Orchestrierung__Group_0__0"


    // $ANTLR start "rule__Orchestrierung__Group_0__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2637:1: rule__Orchestrierung__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Orchestrierung__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2641:1: ( ( '(' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2642:1: ( '(' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2642:1: ( '(' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2643:1: '('
            {
             before(grammarAccess.getOrchestrierungAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__Orchestrierung__Group_0__0__Impl5470); 
             after(grammarAccess.getOrchestrierungAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__Orchestrierung__Group_0__0__Impl"


    // $ANTLR start "rule__Orchestrierung__Group_0__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2656:1: rule__Orchestrierung__Group_0__1 : rule__Orchestrierung__Group_0__1__Impl rule__Orchestrierung__Group_0__2 ;
    public final void rule__Orchestrierung__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2660:1: ( rule__Orchestrierung__Group_0__1__Impl rule__Orchestrierung__Group_0__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2661:2: rule__Orchestrierung__Group_0__1__Impl rule__Orchestrierung__Group_0__2
            {
            pushFollow(FOLLOW_rule__Orchestrierung__Group_0__1__Impl_in_rule__Orchestrierung__Group_0__15501);
            rule__Orchestrierung__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Orchestrierung__Group_0__2_in_rule__Orchestrierung__Group_0__15504);
            rule__Orchestrierung__Group_0__2();

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
    // $ANTLR end "rule__Orchestrierung__Group_0__1"


    // $ANTLR start "rule__Orchestrierung__Group_0__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2668:1: rule__Orchestrierung__Group_0__1__Impl : ( ( rule__Orchestrierung__BedingungAssignment_0_1 ) ) ;
    public final void rule__Orchestrierung__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2672:1: ( ( ( rule__Orchestrierung__BedingungAssignment_0_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2673:1: ( ( rule__Orchestrierung__BedingungAssignment_0_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2673:1: ( ( rule__Orchestrierung__BedingungAssignment_0_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2674:1: ( rule__Orchestrierung__BedingungAssignment_0_1 )
            {
             before(grammarAccess.getOrchestrierungAccess().getBedingungAssignment_0_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2675:1: ( rule__Orchestrierung__BedingungAssignment_0_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2675:2: rule__Orchestrierung__BedingungAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Orchestrierung__BedingungAssignment_0_1_in_rule__Orchestrierung__Group_0__1__Impl5531);
            rule__Orchestrierung__BedingungAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getOrchestrierungAccess().getBedingungAssignment_0_1()); 

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
    // $ANTLR end "rule__Orchestrierung__Group_0__1__Impl"


    // $ANTLR start "rule__Orchestrierung__Group_0__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2685:1: rule__Orchestrierung__Group_0__2 : rule__Orchestrierung__Group_0__2__Impl ;
    public final void rule__Orchestrierung__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2689:1: ( rule__Orchestrierung__Group_0__2__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2690:2: rule__Orchestrierung__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Orchestrierung__Group_0__2__Impl_in_rule__Orchestrierung__Group_0__25561);
            rule__Orchestrierung__Group_0__2__Impl();

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
    // $ANTLR end "rule__Orchestrierung__Group_0__2"


    // $ANTLR start "rule__Orchestrierung__Group_0__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2696:1: rule__Orchestrierung__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Orchestrierung__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2700:1: ( ( ')' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2701:1: ( ')' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2701:1: ( ')' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2702:1: ')'
            {
             before(grammarAccess.getOrchestrierungAccess().getRightParenthesisKeyword_0_2()); 
            match(input,30,FOLLOW_30_in_rule__Orchestrierung__Group_0__2__Impl5589); 
             after(grammarAccess.getOrchestrierungAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__Orchestrierung__Group_0__2__Impl"


    // $ANTLR start "rule__ChoreographieLokal__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2721:1: rule__ChoreographieLokal__Group__0 : rule__ChoreographieLokal__Group__0__Impl rule__ChoreographieLokal__Group__1 ;
    public final void rule__ChoreographieLokal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2725:1: ( rule__ChoreographieLokal__Group__0__Impl rule__ChoreographieLokal__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2726:2: rule__ChoreographieLokal__Group__0__Impl rule__ChoreographieLokal__Group__1
            {
            pushFollow(FOLLOW_rule__ChoreographieLokal__Group__0__Impl_in_rule__ChoreographieLokal__Group__05626);
            rule__ChoreographieLokal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoreographieLokal__Group__1_in_rule__ChoreographieLokal__Group__05629);
            rule__ChoreographieLokal__Group__1();

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
    // $ANTLR end "rule__ChoreographieLokal__Group__0"


    // $ANTLR start "rule__ChoreographieLokal__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2733:1: rule__ChoreographieLokal__Group__0__Impl : ( ( rule__ChoreographieLokal__Group_0__0 )? ) ;
    public final void rule__ChoreographieLokal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2737:1: ( ( ( rule__ChoreographieLokal__Group_0__0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2738:1: ( ( rule__ChoreographieLokal__Group_0__0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2738:1: ( ( rule__ChoreographieLokal__Group_0__0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2739:1: ( rule__ChoreographieLokal__Group_0__0 )?
            {
             before(grammarAccess.getChoreographieLokalAccess().getGroup_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2740:1: ( rule__ChoreographieLokal__Group_0__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2740:2: rule__ChoreographieLokal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ChoreographieLokal__Group_0__0_in_rule__ChoreographieLokal__Group__0__Impl5656);
                    rule__ChoreographieLokal__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoreographieLokalAccess().getGroup_0()); 

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
    // $ANTLR end "rule__ChoreographieLokal__Group__0__Impl"


    // $ANTLR start "rule__ChoreographieLokal__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2750:1: rule__ChoreographieLokal__Group__1 : rule__ChoreographieLokal__Group__1__Impl rule__ChoreographieLokal__Group__2 ;
    public final void rule__ChoreographieLokal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2754:1: ( rule__ChoreographieLokal__Group__1__Impl rule__ChoreographieLokal__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2755:2: rule__ChoreographieLokal__Group__1__Impl rule__ChoreographieLokal__Group__2
            {
            pushFollow(FOLLOW_rule__ChoreographieLokal__Group__1__Impl_in_rule__ChoreographieLokal__Group__15687);
            rule__ChoreographieLokal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoreographieLokal__Group__2_in_rule__ChoreographieLokal__Group__15690);
            rule__ChoreographieLokal__Group__2();

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
    // $ANTLR end "rule__ChoreographieLokal__Group__1"


    // $ANTLR start "rule__ChoreographieLokal__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2762:1: rule__ChoreographieLokal__Group__1__Impl : ( ( rule__ChoreographieLokal__Methode1Assignment_1 ) ) ;
    public final void rule__ChoreographieLokal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2766:1: ( ( ( rule__ChoreographieLokal__Methode1Assignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2767:1: ( ( rule__ChoreographieLokal__Methode1Assignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2767:1: ( ( rule__ChoreographieLokal__Methode1Assignment_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2768:1: ( rule__ChoreographieLokal__Methode1Assignment_1 )
            {
             before(grammarAccess.getChoreographieLokalAccess().getMethode1Assignment_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2769:1: ( rule__ChoreographieLokal__Methode1Assignment_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2769:2: rule__ChoreographieLokal__Methode1Assignment_1
            {
            pushFollow(FOLLOW_rule__ChoreographieLokal__Methode1Assignment_1_in_rule__ChoreographieLokal__Group__1__Impl5717);
            rule__ChoreographieLokal__Methode1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChoreographieLokalAccess().getMethode1Assignment_1()); 

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
    // $ANTLR end "rule__ChoreographieLokal__Group__1__Impl"


    // $ANTLR start "rule__ChoreographieLokal__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2779:1: rule__ChoreographieLokal__Group__2 : rule__ChoreographieLokal__Group__2__Impl rule__ChoreographieLokal__Group__3 ;
    public final void rule__ChoreographieLokal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2783:1: ( rule__ChoreographieLokal__Group__2__Impl rule__ChoreographieLokal__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2784:2: rule__ChoreographieLokal__Group__2__Impl rule__ChoreographieLokal__Group__3
            {
            pushFollow(FOLLOW_rule__ChoreographieLokal__Group__2__Impl_in_rule__ChoreographieLokal__Group__25747);
            rule__ChoreographieLokal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoreographieLokal__Group__3_in_rule__ChoreographieLokal__Group__25750);
            rule__ChoreographieLokal__Group__3();

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
    // $ANTLR end "rule__ChoreographieLokal__Group__2"


    // $ANTLR start "rule__ChoreographieLokal__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2791:1: rule__ChoreographieLokal__Group__2__Impl : ( '->' ) ;
    public final void rule__ChoreographieLokal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2795:1: ( ( '->' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2796:1: ( '->' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2796:1: ( '->' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2797:1: '->'
            {
             before(grammarAccess.getChoreographieLokalAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__ChoreographieLokal__Group__2__Impl5778); 
             after(grammarAccess.getChoreographieLokalAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__ChoreographieLokal__Group__2__Impl"


    // $ANTLR start "rule__ChoreographieLokal__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2810:1: rule__ChoreographieLokal__Group__3 : rule__ChoreographieLokal__Group__3__Impl rule__ChoreographieLokal__Group__4 ;
    public final void rule__ChoreographieLokal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2814:1: ( rule__ChoreographieLokal__Group__3__Impl rule__ChoreographieLokal__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2815:2: rule__ChoreographieLokal__Group__3__Impl rule__ChoreographieLokal__Group__4
            {
            pushFollow(FOLLOW_rule__ChoreographieLokal__Group__3__Impl_in_rule__ChoreographieLokal__Group__35809);
            rule__ChoreographieLokal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoreographieLokal__Group__4_in_rule__ChoreographieLokal__Group__35812);
            rule__ChoreographieLokal__Group__4();

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
    // $ANTLR end "rule__ChoreographieLokal__Group__3"


    // $ANTLR start "rule__ChoreographieLokal__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2822:1: rule__ChoreographieLokal__Group__3__Impl : ( ( rule__ChoreographieLokal__Service2Assignment_3 ) ) ;
    public final void rule__ChoreographieLokal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2826:1: ( ( ( rule__ChoreographieLokal__Service2Assignment_3 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2827:1: ( ( rule__ChoreographieLokal__Service2Assignment_3 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2827:1: ( ( rule__ChoreographieLokal__Service2Assignment_3 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2828:1: ( rule__ChoreographieLokal__Service2Assignment_3 )
            {
             before(grammarAccess.getChoreographieLokalAccess().getService2Assignment_3()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2829:1: ( rule__ChoreographieLokal__Service2Assignment_3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2829:2: rule__ChoreographieLokal__Service2Assignment_3
            {
            pushFollow(FOLLOW_rule__ChoreographieLokal__Service2Assignment_3_in_rule__ChoreographieLokal__Group__3__Impl5839);
            rule__ChoreographieLokal__Service2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChoreographieLokalAccess().getService2Assignment_3()); 

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
    // $ANTLR end "rule__ChoreographieLokal__Group__3__Impl"


    // $ANTLR start "rule__ChoreographieLokal__Group__4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2839:1: rule__ChoreographieLokal__Group__4 : rule__ChoreographieLokal__Group__4__Impl rule__ChoreographieLokal__Group__5 ;
    public final void rule__ChoreographieLokal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2843:1: ( rule__ChoreographieLokal__Group__4__Impl rule__ChoreographieLokal__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2844:2: rule__ChoreographieLokal__Group__4__Impl rule__ChoreographieLokal__Group__5
            {
            pushFollow(FOLLOW_rule__ChoreographieLokal__Group__4__Impl_in_rule__ChoreographieLokal__Group__45869);
            rule__ChoreographieLokal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoreographieLokal__Group__5_in_rule__ChoreographieLokal__Group__45872);
            rule__ChoreographieLokal__Group__5();

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
    // $ANTLR end "rule__ChoreographieLokal__Group__4"


    // $ANTLR start "rule__ChoreographieLokal__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2851:1: rule__ChoreographieLokal__Group__4__Impl : ( '.' ) ;
    public final void rule__ChoreographieLokal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2855:1: ( ( '.' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2856:1: ( '.' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2856:1: ( '.' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2857:1: '.'
            {
             before(grammarAccess.getChoreographieLokalAccess().getFullStopKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__ChoreographieLokal__Group__4__Impl5900); 
             after(grammarAccess.getChoreographieLokalAccess().getFullStopKeyword_4()); 

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
    // $ANTLR end "rule__ChoreographieLokal__Group__4__Impl"


    // $ANTLR start "rule__ChoreographieLokal__Group__5"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2870:1: rule__ChoreographieLokal__Group__5 : rule__ChoreographieLokal__Group__5__Impl rule__ChoreographieLokal__Group__6 ;
    public final void rule__ChoreographieLokal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2874:1: ( rule__ChoreographieLokal__Group__5__Impl rule__ChoreographieLokal__Group__6 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2875:2: rule__ChoreographieLokal__Group__5__Impl rule__ChoreographieLokal__Group__6
            {
            pushFollow(FOLLOW_rule__ChoreographieLokal__Group__5__Impl_in_rule__ChoreographieLokal__Group__55931);
            rule__ChoreographieLokal__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoreographieLokal__Group__6_in_rule__ChoreographieLokal__Group__55934);
            rule__ChoreographieLokal__Group__6();

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
    // $ANTLR end "rule__ChoreographieLokal__Group__5"


    // $ANTLR start "rule__ChoreographieLokal__Group__5__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2882:1: rule__ChoreographieLokal__Group__5__Impl : ( ( rule__ChoreographieLokal__Methode2Assignment_5 ) ) ;
    public final void rule__ChoreographieLokal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2886:1: ( ( ( rule__ChoreographieLokal__Methode2Assignment_5 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2887:1: ( ( rule__ChoreographieLokal__Methode2Assignment_5 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2887:1: ( ( rule__ChoreographieLokal__Methode2Assignment_5 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2888:1: ( rule__ChoreographieLokal__Methode2Assignment_5 )
            {
             before(grammarAccess.getChoreographieLokalAccess().getMethode2Assignment_5()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2889:1: ( rule__ChoreographieLokal__Methode2Assignment_5 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2889:2: rule__ChoreographieLokal__Methode2Assignment_5
            {
            pushFollow(FOLLOW_rule__ChoreographieLokal__Methode2Assignment_5_in_rule__ChoreographieLokal__Group__5__Impl5961);
            rule__ChoreographieLokal__Methode2Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getChoreographieLokalAccess().getMethode2Assignment_5()); 

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
    // $ANTLR end "rule__ChoreographieLokal__Group__5__Impl"


    // $ANTLR start "rule__ChoreographieLokal__Group__6"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2899:1: rule__ChoreographieLokal__Group__6 : rule__ChoreographieLokal__Group__6__Impl ;
    public final void rule__ChoreographieLokal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2903:1: ( rule__ChoreographieLokal__Group__6__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2904:2: rule__ChoreographieLokal__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ChoreographieLokal__Group__6__Impl_in_rule__ChoreographieLokal__Group__65991);
            rule__ChoreographieLokal__Group__6__Impl();

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
    // $ANTLR end "rule__ChoreographieLokal__Group__6"


    // $ANTLR start "rule__ChoreographieLokal__Group__6__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2910:1: rule__ChoreographieLokal__Group__6__Impl : ( ';' ) ;
    public final void rule__ChoreographieLokal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2914:1: ( ( ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2915:1: ( ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2915:1: ( ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2916:1: ';'
            {
             before(grammarAccess.getChoreographieLokalAccess().getSemicolonKeyword_6()); 
            match(input,29,FOLLOW_29_in_rule__ChoreographieLokal__Group__6__Impl6019); 
             after(grammarAccess.getChoreographieLokalAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__ChoreographieLokal__Group__6__Impl"


    // $ANTLR start "rule__ChoreographieLokal__Group_0__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2943:1: rule__ChoreographieLokal__Group_0__0 : rule__ChoreographieLokal__Group_0__0__Impl rule__ChoreographieLokal__Group_0__1 ;
    public final void rule__ChoreographieLokal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2947:1: ( rule__ChoreographieLokal__Group_0__0__Impl rule__ChoreographieLokal__Group_0__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2948:2: rule__ChoreographieLokal__Group_0__0__Impl rule__ChoreographieLokal__Group_0__1
            {
            pushFollow(FOLLOW_rule__ChoreographieLokal__Group_0__0__Impl_in_rule__ChoreographieLokal__Group_0__06064);
            rule__ChoreographieLokal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoreographieLokal__Group_0__1_in_rule__ChoreographieLokal__Group_0__06067);
            rule__ChoreographieLokal__Group_0__1();

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
    // $ANTLR end "rule__ChoreographieLokal__Group_0__0"


    // $ANTLR start "rule__ChoreographieLokal__Group_0__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2955:1: rule__ChoreographieLokal__Group_0__0__Impl : ( '(' ) ;
    public final void rule__ChoreographieLokal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2959:1: ( ( '(' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2960:1: ( '(' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2960:1: ( '(' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2961:1: '('
            {
             before(grammarAccess.getChoreographieLokalAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__ChoreographieLokal__Group_0__0__Impl6095); 
             after(grammarAccess.getChoreographieLokalAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__ChoreographieLokal__Group_0__0__Impl"


    // $ANTLR start "rule__ChoreographieLokal__Group_0__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2974:1: rule__ChoreographieLokal__Group_0__1 : rule__ChoreographieLokal__Group_0__1__Impl rule__ChoreographieLokal__Group_0__2 ;
    public final void rule__ChoreographieLokal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2978:1: ( rule__ChoreographieLokal__Group_0__1__Impl rule__ChoreographieLokal__Group_0__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2979:2: rule__ChoreographieLokal__Group_0__1__Impl rule__ChoreographieLokal__Group_0__2
            {
            pushFollow(FOLLOW_rule__ChoreographieLokal__Group_0__1__Impl_in_rule__ChoreographieLokal__Group_0__16126);
            rule__ChoreographieLokal__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoreographieLokal__Group_0__2_in_rule__ChoreographieLokal__Group_0__16129);
            rule__ChoreographieLokal__Group_0__2();

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
    // $ANTLR end "rule__ChoreographieLokal__Group_0__1"


    // $ANTLR start "rule__ChoreographieLokal__Group_0__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2986:1: rule__ChoreographieLokal__Group_0__1__Impl : ( ( rule__ChoreographieLokal__BedingungAssignment_0_1 ) ) ;
    public final void rule__ChoreographieLokal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2990:1: ( ( ( rule__ChoreographieLokal__BedingungAssignment_0_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2991:1: ( ( rule__ChoreographieLokal__BedingungAssignment_0_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2991:1: ( ( rule__ChoreographieLokal__BedingungAssignment_0_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2992:1: ( rule__ChoreographieLokal__BedingungAssignment_0_1 )
            {
             before(grammarAccess.getChoreographieLokalAccess().getBedingungAssignment_0_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2993:1: ( rule__ChoreographieLokal__BedingungAssignment_0_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:2993:2: rule__ChoreographieLokal__BedingungAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ChoreographieLokal__BedingungAssignment_0_1_in_rule__ChoreographieLokal__Group_0__1__Impl6156);
            rule__ChoreographieLokal__BedingungAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getChoreographieLokalAccess().getBedingungAssignment_0_1()); 

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
    // $ANTLR end "rule__ChoreographieLokal__Group_0__1__Impl"


    // $ANTLR start "rule__ChoreographieLokal__Group_0__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3003:1: rule__ChoreographieLokal__Group_0__2 : rule__ChoreographieLokal__Group_0__2__Impl ;
    public final void rule__ChoreographieLokal__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3007:1: ( rule__ChoreographieLokal__Group_0__2__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3008:2: rule__ChoreographieLokal__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ChoreographieLokal__Group_0__2__Impl_in_rule__ChoreographieLokal__Group_0__26186);
            rule__ChoreographieLokal__Group_0__2__Impl();

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
    // $ANTLR end "rule__ChoreographieLokal__Group_0__2"


    // $ANTLR start "rule__ChoreographieLokal__Group_0__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3014:1: rule__ChoreographieLokal__Group_0__2__Impl : ( ')' ) ;
    public final void rule__ChoreographieLokal__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3018:1: ( ( ')' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3019:1: ( ')' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3019:1: ( ')' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3020:1: ')'
            {
             before(grammarAccess.getChoreographieLokalAccess().getRightParenthesisKeyword_0_2()); 
            match(input,30,FOLLOW_30_in_rule__ChoreographieLokal__Group_0__2__Impl6214); 
             after(grammarAccess.getChoreographieLokalAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__ChoreographieLokal__Group_0__2__Impl"


    // $ANTLR start "rule__Entityservice__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3039:1: rule__Entityservice__Group__0 : rule__Entityservice__Group__0__Impl rule__Entityservice__Group__1 ;
    public final void rule__Entityservice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3043:1: ( rule__Entityservice__Group__0__Impl rule__Entityservice__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3044:2: rule__Entityservice__Group__0__Impl rule__Entityservice__Group__1
            {
            pushFollow(FOLLOW_rule__Entityservice__Group__0__Impl_in_rule__Entityservice__Group__06251);
            rule__Entityservice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entityservice__Group__1_in_rule__Entityservice__Group__06254);
            rule__Entityservice__Group__1();

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
    // $ANTLR end "rule__Entityservice__Group__0"


    // $ANTLR start "rule__Entityservice__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3051:1: rule__Entityservice__Group__0__Impl : ( 'Entityservice' ) ;
    public final void rule__Entityservice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3055:1: ( ( 'Entityservice' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3056:1: ( 'Entityservice' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3056:1: ( 'Entityservice' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3057:1: 'Entityservice'
            {
             before(grammarAccess.getEntityserviceAccess().getEntityserviceKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Entityservice__Group__0__Impl6282); 
             after(grammarAccess.getEntityserviceAccess().getEntityserviceKeyword_0()); 

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
    // $ANTLR end "rule__Entityservice__Group__0__Impl"


    // $ANTLR start "rule__Entityservice__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3070:1: rule__Entityservice__Group__1 : rule__Entityservice__Group__1__Impl rule__Entityservice__Group__2 ;
    public final void rule__Entityservice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3074:1: ( rule__Entityservice__Group__1__Impl rule__Entityservice__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3075:2: rule__Entityservice__Group__1__Impl rule__Entityservice__Group__2
            {
            pushFollow(FOLLOW_rule__Entityservice__Group__1__Impl_in_rule__Entityservice__Group__16313);
            rule__Entityservice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entityservice__Group__2_in_rule__Entityservice__Group__16316);
            rule__Entityservice__Group__2();

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
    // $ANTLR end "rule__Entityservice__Group__1"


    // $ANTLR start "rule__Entityservice__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3082:1: rule__Entityservice__Group__1__Impl : ( ( rule__Entityservice__NameAssignment_1 ) ) ;
    public final void rule__Entityservice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3086:1: ( ( ( rule__Entityservice__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3087:1: ( ( rule__Entityservice__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3087:1: ( ( rule__Entityservice__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3088:1: ( rule__Entityservice__NameAssignment_1 )
            {
             before(grammarAccess.getEntityserviceAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3089:1: ( rule__Entityservice__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3089:2: rule__Entityservice__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entityservice__NameAssignment_1_in_rule__Entityservice__Group__1__Impl6343);
            rule__Entityservice__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityserviceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entityservice__Group__1__Impl"


    // $ANTLR start "rule__Entityservice__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3099:1: rule__Entityservice__Group__2 : rule__Entityservice__Group__2__Impl rule__Entityservice__Group__3 ;
    public final void rule__Entityservice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3103:1: ( rule__Entityservice__Group__2__Impl rule__Entityservice__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3104:2: rule__Entityservice__Group__2__Impl rule__Entityservice__Group__3
            {
            pushFollow(FOLLOW_rule__Entityservice__Group__2__Impl_in_rule__Entityservice__Group__26373);
            rule__Entityservice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entityservice__Group__3_in_rule__Entityservice__Group__26376);
            rule__Entityservice__Group__3();

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
    // $ANTLR end "rule__Entityservice__Group__2"


    // $ANTLR start "rule__Entityservice__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3111:1: rule__Entityservice__Group__2__Impl : ( '{' ) ;
    public final void rule__Entityservice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3115:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3116:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3116:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3117:1: '{'
            {
             before(grammarAccess.getEntityserviceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Entityservice__Group__2__Impl6404); 
             after(grammarAccess.getEntityserviceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Entityservice__Group__2__Impl"


    // $ANTLR start "rule__Entityservice__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3130:1: rule__Entityservice__Group__3 : rule__Entityservice__Group__3__Impl rule__Entityservice__Group__4 ;
    public final void rule__Entityservice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3134:1: ( rule__Entityservice__Group__3__Impl rule__Entityservice__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3135:2: rule__Entityservice__Group__3__Impl rule__Entityservice__Group__4
            {
            pushFollow(FOLLOW_rule__Entityservice__Group__3__Impl_in_rule__Entityservice__Group__36435);
            rule__Entityservice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entityservice__Group__4_in_rule__Entityservice__Group__36438);
            rule__Entityservice__Group__4();

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
    // $ANTLR end "rule__Entityservice__Group__3"


    // $ANTLR start "rule__Entityservice__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3142:1: rule__Entityservice__Group__3__Impl : ( ( rule__Entityservice__InterfaceAssignment_3 ) ) ;
    public final void rule__Entityservice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3146:1: ( ( ( rule__Entityservice__InterfaceAssignment_3 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3147:1: ( ( rule__Entityservice__InterfaceAssignment_3 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3147:1: ( ( rule__Entityservice__InterfaceAssignment_3 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3148:1: ( rule__Entityservice__InterfaceAssignment_3 )
            {
             before(grammarAccess.getEntityserviceAccess().getInterfaceAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3149:1: ( rule__Entityservice__InterfaceAssignment_3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3149:2: rule__Entityservice__InterfaceAssignment_3
            {
            pushFollow(FOLLOW_rule__Entityservice__InterfaceAssignment_3_in_rule__Entityservice__Group__3__Impl6465);
            rule__Entityservice__InterfaceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityserviceAccess().getInterfaceAssignment_3()); 

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
    // $ANTLR end "rule__Entityservice__Group__3__Impl"


    // $ANTLR start "rule__Entityservice__Group__4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3159:1: rule__Entityservice__Group__4 : rule__Entityservice__Group__4__Impl rule__Entityservice__Group__5 ;
    public final void rule__Entityservice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3163:1: ( rule__Entityservice__Group__4__Impl rule__Entityservice__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3164:2: rule__Entityservice__Group__4__Impl rule__Entityservice__Group__5
            {
            pushFollow(FOLLOW_rule__Entityservice__Group__4__Impl_in_rule__Entityservice__Group__46495);
            rule__Entityservice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entityservice__Group__5_in_rule__Entityservice__Group__46498);
            rule__Entityservice__Group__5();

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
    // $ANTLR end "rule__Entityservice__Group__4"


    // $ANTLR start "rule__Entityservice__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3171:1: rule__Entityservice__Group__4__Impl : ( ( rule__Entityservice__EntitiesAssignment_4 )* ) ;
    public final void rule__Entityservice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3175:1: ( ( ( rule__Entityservice__EntitiesAssignment_4 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3176:1: ( ( rule__Entityservice__EntitiesAssignment_4 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3176:1: ( ( rule__Entityservice__EntitiesAssignment_4 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3177:1: ( rule__Entityservice__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getEntityserviceAccess().getEntitiesAssignment_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3178:1: ( rule__Entityservice__EntitiesAssignment_4 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3178:2: rule__Entityservice__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entityservice__EntitiesAssignment_4_in_rule__Entityservice__Group__4__Impl6525);
            	    rule__Entityservice__EntitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getEntityserviceAccess().getEntitiesAssignment_4()); 

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
    // $ANTLR end "rule__Entityservice__Group__4__Impl"


    // $ANTLR start "rule__Entityservice__Group__5"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3188:1: rule__Entityservice__Group__5 : rule__Entityservice__Group__5__Impl ;
    public final void rule__Entityservice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3192:1: ( rule__Entityservice__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3193:2: rule__Entityservice__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entityservice__Group__5__Impl_in_rule__Entityservice__Group__56556);
            rule__Entityservice__Group__5__Impl();

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
    // $ANTLR end "rule__Entityservice__Group__5"


    // $ANTLR start "rule__Entityservice__Group__5__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3199:1: rule__Entityservice__Group__5__Impl : ( '}' ) ;
    public final void rule__Entityservice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3203:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3204:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3204:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3205:1: '}'
            {
             before(grammarAccess.getEntityserviceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Entityservice__Group__5__Impl6584); 
             after(grammarAccess.getEntityserviceAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Entityservice__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3230:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3234:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3235:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__06627);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__06630);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3242:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3246:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3247:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3247:1: ( ( rule__Entity__NameAssignment_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3248:1: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3249:1: ( rule__Entity__NameAssignment_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3249:2: rule__Entity__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_0_in_rule__Entity__Group__0__Impl6657);
            rule__Entity__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3259:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3263:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3264:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__16687);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__16690);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3271:1: rule__Entity__Group__1__Impl : ( 'KOT' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3275:1: ( ( 'KOT' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3276:1: ( 'KOT' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3276:1: ( 'KOT' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3277:1: 'KOT'
            {
             before(grammarAccess.getEntityAccess().getKOTKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Entity__Group__1__Impl6718); 
             after(grammarAccess.getEntityAccess().getKOTKeyword_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3290:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3294:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3295:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__26749);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__26752);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3302:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__KomponentenObjekttypAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3306:1: ( ( ( rule__Entity__KomponentenObjekttypAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3307:1: ( ( rule__Entity__KomponentenObjekttypAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3307:1: ( ( rule__Entity__KomponentenObjekttypAssignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3308:1: ( rule__Entity__KomponentenObjekttypAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getKomponentenObjekttypAssignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3309:1: ( rule__Entity__KomponentenObjekttypAssignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3309:2: rule__Entity__KomponentenObjekttypAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__KomponentenObjekttypAssignment_2_in_rule__Entity__Group__2__Impl6779);
            rule__Entity__KomponentenObjekttypAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getKomponentenObjekttypAssignment_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3319:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3323:1: ( rule__Entity__Group__3__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3324:2: rule__Entity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__36809);
            rule__Entity__Group__3__Impl();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3330:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__InterfaceAssignment_3 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3334:1: ( ( ( rule__Entity__InterfaceAssignment_3 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3335:1: ( ( rule__Entity__InterfaceAssignment_3 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3335:1: ( ( rule__Entity__InterfaceAssignment_3 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3336:1: ( rule__Entity__InterfaceAssignment_3 )?
            {
             before(grammarAccess.getEntityAccess().getInterfaceAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3337:1: ( rule__Entity__InterfaceAssignment_3 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3337:2: rule__Entity__InterfaceAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Entity__InterfaceAssignment_3_in_rule__Entity__Group__3__Impl6836);
                    rule__Entity__InterfaceAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getInterfaceAssignment_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__VOS__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3357:1: rule__VOS__Group__0 : rule__VOS__Group__0__Impl rule__VOS__Group__1 ;
    public final void rule__VOS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3361:1: ( rule__VOS__Group__0__Impl rule__VOS__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3362:2: rule__VOS__Group__0__Impl rule__VOS__Group__1
            {
            pushFollow(FOLLOW_rule__VOS__Group__0__Impl_in_rule__VOS__Group__06877);
            rule__VOS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOS__Group__1_in_rule__VOS__Group__06880);
            rule__VOS__Group__1();

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
    // $ANTLR end "rule__VOS__Group__0"


    // $ANTLR start "rule__VOS__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3369:1: rule__VOS__Group__0__Impl : ( ( rule__VOS__Alternatives_0 ) ) ;
    public final void rule__VOS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3373:1: ( ( ( rule__VOS__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3374:1: ( ( rule__VOS__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3374:1: ( ( rule__VOS__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3375:1: ( rule__VOS__Alternatives_0 )
            {
             before(grammarAccess.getVOSAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3376:1: ( rule__VOS__Alternatives_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3376:2: rule__VOS__Alternatives_0
            {
            pushFollow(FOLLOW_rule__VOS__Alternatives_0_in_rule__VOS__Group__0__Impl6907);
            rule__VOS__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getVOSAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__VOS__Group__0__Impl"


    // $ANTLR start "rule__VOS__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3386:1: rule__VOS__Group__1 : rule__VOS__Group__1__Impl rule__VOS__Group__2 ;
    public final void rule__VOS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3390:1: ( rule__VOS__Group__1__Impl rule__VOS__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3391:2: rule__VOS__Group__1__Impl rule__VOS__Group__2
            {
            pushFollow(FOLLOW_rule__VOS__Group__1__Impl_in_rule__VOS__Group__16937);
            rule__VOS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOS__Group__2_in_rule__VOS__Group__16940);
            rule__VOS__Group__2();

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
    // $ANTLR end "rule__VOS__Group__1"


    // $ANTLR start "rule__VOS__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3398:1: rule__VOS__Group__1__Impl : ( '{' ) ;
    public final void rule__VOS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3402:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3403:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3403:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3404:1: '{'
            {
             before(grammarAccess.getVOSAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__VOS__Group__1__Impl6968); 
             after(grammarAccess.getVOSAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__VOS__Group__1__Impl"


    // $ANTLR start "rule__VOS__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3417:1: rule__VOS__Group__2 : rule__VOS__Group__2__Impl rule__VOS__Group__3 ;
    public final void rule__VOS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3421:1: ( rule__VOS__Group__2__Impl rule__VOS__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3422:2: rule__VOS__Group__2__Impl rule__VOS__Group__3
            {
            pushFollow(FOLLOW_rule__VOS__Group__2__Impl_in_rule__VOS__Group__26999);
            rule__VOS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOS__Group__3_in_rule__VOS__Group__27002);
            rule__VOS__Group__3();

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
    // $ANTLR end "rule__VOS__Group__2"


    // $ANTLR start "rule__VOS__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3429:1: rule__VOS__Group__2__Impl : ( ( ( rule__VOS__Alternatives_2 ) ) ( ( rule__VOS__Alternatives_2 )* ) ) ;
    public final void rule__VOS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3433:1: ( ( ( ( rule__VOS__Alternatives_2 ) ) ( ( rule__VOS__Alternatives_2 )* ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3434:1: ( ( ( rule__VOS__Alternatives_2 ) ) ( ( rule__VOS__Alternatives_2 )* ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3434:1: ( ( ( rule__VOS__Alternatives_2 ) ) ( ( rule__VOS__Alternatives_2 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3435:1: ( ( rule__VOS__Alternatives_2 ) ) ( ( rule__VOS__Alternatives_2 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3435:1: ( ( rule__VOS__Alternatives_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3436:1: ( rule__VOS__Alternatives_2 )
            {
             before(grammarAccess.getVOSAccess().getAlternatives_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3437:1: ( rule__VOS__Alternatives_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3437:2: rule__VOS__Alternatives_2
            {
            pushFollow(FOLLOW_rule__VOS__Alternatives_2_in_rule__VOS__Group__2__Impl7031);
            rule__VOS__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getVOSAccess().getAlternatives_2()); 

            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3440:1: ( ( rule__VOS__Alternatives_2 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3441:1: ( rule__VOS__Alternatives_2 )*
            {
             before(grammarAccess.getVOSAccess().getAlternatives_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3442:1: ( rule__VOS__Alternatives_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==25||LA31_0==37||(LA31_0>=40 && LA31_0<=43)||LA31_0==45) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3442:2: rule__VOS__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__VOS__Alternatives_2_in_rule__VOS__Group__2__Impl7043);
            	    rule__VOS__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getVOSAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__VOS__Group__2__Impl"


    // $ANTLR start "rule__VOS__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3453:1: rule__VOS__Group__3 : rule__VOS__Group__3__Impl ;
    public final void rule__VOS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3457:1: ( rule__VOS__Group__3__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3458:2: rule__VOS__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VOS__Group__3__Impl_in_rule__VOS__Group__37076);
            rule__VOS__Group__3__Impl();

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
    // $ANTLR end "rule__VOS__Group__3"


    // $ANTLR start "rule__VOS__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3464:1: rule__VOS__Group__3__Impl : ( '}' ) ;
    public final void rule__VOS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3468:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3469:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3469:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3470:1: '}'
            {
             before(grammarAccess.getVOSAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__VOS__Group__3__Impl7104); 
             after(grammarAccess.getVOSAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__VOS__Group__3__Impl"


    // $ANTLR start "rule__KOS__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3491:1: rule__KOS__Group__0 : rule__KOS__Group__0__Impl rule__KOS__Group__1 ;
    public final void rule__KOS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3495:1: ( rule__KOS__Group__0__Impl rule__KOS__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3496:2: rule__KOS__Group__0__Impl rule__KOS__Group__1
            {
            pushFollow(FOLLOW_rule__KOS__Group__0__Impl_in_rule__KOS__Group__07143);
            rule__KOS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KOS__Group__1_in_rule__KOS__Group__07146);
            rule__KOS__Group__1();

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
    // $ANTLR end "rule__KOS__Group__0"


    // $ANTLR start "rule__KOS__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3503:1: rule__KOS__Group__0__Impl : ( ( rule__KOS__Alternatives_0 ) ) ;
    public final void rule__KOS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3507:1: ( ( ( rule__KOS__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3508:1: ( ( rule__KOS__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3508:1: ( ( rule__KOS__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3509:1: ( rule__KOS__Alternatives_0 )
            {
             before(grammarAccess.getKOSAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3510:1: ( rule__KOS__Alternatives_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3510:2: rule__KOS__Alternatives_0
            {
            pushFollow(FOLLOW_rule__KOS__Alternatives_0_in_rule__KOS__Group__0__Impl7173);
            rule__KOS__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getKOSAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__KOS__Group__0__Impl"


    // $ANTLR start "rule__KOS__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3520:1: rule__KOS__Group__1 : rule__KOS__Group__1__Impl rule__KOS__Group__2 ;
    public final void rule__KOS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3524:1: ( rule__KOS__Group__1__Impl rule__KOS__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3525:2: rule__KOS__Group__1__Impl rule__KOS__Group__2
            {
            pushFollow(FOLLOW_rule__KOS__Group__1__Impl_in_rule__KOS__Group__17203);
            rule__KOS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KOS__Group__2_in_rule__KOS__Group__17206);
            rule__KOS__Group__2();

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
    // $ANTLR end "rule__KOS__Group__1"


    // $ANTLR start "rule__KOS__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3532:1: rule__KOS__Group__1__Impl : ( '{' ) ;
    public final void rule__KOS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3536:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3537:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3537:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3538:1: '{'
            {
             before(grammarAccess.getKOSAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__KOS__Group__1__Impl7234); 
             after(grammarAccess.getKOSAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__KOS__Group__1__Impl"


    // $ANTLR start "rule__KOS__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3551:1: rule__KOS__Group__2 : rule__KOS__Group__2__Impl rule__KOS__Group__3 ;
    public final void rule__KOS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3555:1: ( rule__KOS__Group__2__Impl rule__KOS__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3556:2: rule__KOS__Group__2__Impl rule__KOS__Group__3
            {
            pushFollow(FOLLOW_rule__KOS__Group__2__Impl_in_rule__KOS__Group__27265);
            rule__KOS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KOS__Group__3_in_rule__KOS__Group__27268);
            rule__KOS__Group__3();

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
    // $ANTLR end "rule__KOS__Group__2"


    // $ANTLR start "rule__KOS__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3563:1: rule__KOS__Group__2__Impl : ( ( ( rule__KOS__Alternatives_2 ) ) ( ( rule__KOS__Alternatives_2 )* ) ) ;
    public final void rule__KOS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3567:1: ( ( ( ( rule__KOS__Alternatives_2 ) ) ( ( rule__KOS__Alternatives_2 )* ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3568:1: ( ( ( rule__KOS__Alternatives_2 ) ) ( ( rule__KOS__Alternatives_2 )* ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3568:1: ( ( ( rule__KOS__Alternatives_2 ) ) ( ( rule__KOS__Alternatives_2 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3569:1: ( ( rule__KOS__Alternatives_2 ) ) ( ( rule__KOS__Alternatives_2 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3569:1: ( ( rule__KOS__Alternatives_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3570:1: ( rule__KOS__Alternatives_2 )
            {
             before(grammarAccess.getKOSAccess().getAlternatives_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3571:1: ( rule__KOS__Alternatives_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3571:2: rule__KOS__Alternatives_2
            {
            pushFollow(FOLLOW_rule__KOS__Alternatives_2_in_rule__KOS__Group__2__Impl7297);
            rule__KOS__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getKOSAccess().getAlternatives_2()); 

            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3574:1: ( ( rule__KOS__Alternatives_2 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3575:1: ( rule__KOS__Alternatives_2 )*
            {
             before(grammarAccess.getKOSAccess().getAlternatives_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3576:1: ( rule__KOS__Alternatives_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||(LA32_0>=34 && LA32_0<=43)||LA32_0==46) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3576:2: rule__KOS__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__KOS__Alternatives_2_in_rule__KOS__Group__2__Impl7309);
            	    rule__KOS__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getKOSAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__KOS__Group__2__Impl"


    // $ANTLR start "rule__KOS__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3587:1: rule__KOS__Group__3 : rule__KOS__Group__3__Impl ;
    public final void rule__KOS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3591:1: ( rule__KOS__Group__3__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3592:2: rule__KOS__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KOS__Group__3__Impl_in_rule__KOS__Group__37342);
            rule__KOS__Group__3__Impl();

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
    // $ANTLR end "rule__KOS__Group__3"


    // $ANTLR start "rule__KOS__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3598:1: rule__KOS__Group__3__Impl : ( '}' ) ;
    public final void rule__KOS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3602:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3603:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3603:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3604:1: '}'
            {
             before(grammarAccess.getKOSAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__KOS__Group__3__Impl7370); 
             after(grammarAccess.getKOSAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__KOS__Group__3__Impl"


    // $ANTLR start "rule__VOT__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3625:1: rule__VOT__Group__0 : rule__VOT__Group__0__Impl rule__VOT__Group__1 ;
    public final void rule__VOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3629:1: ( rule__VOT__Group__0__Impl rule__VOT__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3630:2: rule__VOT__Group__0__Impl rule__VOT__Group__1
            {
            pushFollow(FOLLOW_rule__VOT__Group__0__Impl_in_rule__VOT__Group__07409);
            rule__VOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__1_in_rule__VOT__Group__07412);
            rule__VOT__Group__1();

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
    // $ANTLR end "rule__VOT__Group__0"


    // $ANTLR start "rule__VOT__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3637:1: rule__VOT__Group__0__Impl : ( ( rule__VOT__AnnotationAssignment_0 )? ) ;
    public final void rule__VOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3641:1: ( ( ( rule__VOT__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3642:1: ( ( rule__VOT__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3642:1: ( ( rule__VOT__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3643:1: ( rule__VOT__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getVOTAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3644:1: ( rule__VOT__AnnotationAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=40 && LA33_0<=43)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3644:2: rule__VOT__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__VOT__AnnotationAssignment_0_in_rule__VOT__Group__0__Impl7439);
                    rule__VOT__AnnotationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVOTAccess().getAnnotationAssignment_0()); 

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
    // $ANTLR end "rule__VOT__Group__0__Impl"


    // $ANTLR start "rule__VOT__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3654:1: rule__VOT__Group__1 : rule__VOT__Group__1__Impl rule__VOT__Group__2 ;
    public final void rule__VOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3658:1: ( rule__VOT__Group__1__Impl rule__VOT__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3659:2: rule__VOT__Group__1__Impl rule__VOT__Group__2
            {
            pushFollow(FOLLOW_rule__VOT__Group__1__Impl_in_rule__VOT__Group__17470);
            rule__VOT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__2_in_rule__VOT__Group__17473);
            rule__VOT__Group__2();

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
    // $ANTLR end "rule__VOT__Group__1"


    // $ANTLR start "rule__VOT__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3666:1: rule__VOT__Group__1__Impl : ( 'VOT' ) ;
    public final void rule__VOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3670:1: ( ( 'VOT' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3671:1: ( 'VOT' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3671:1: ( 'VOT' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3672:1: 'VOT'
            {
             before(grammarAccess.getVOTAccess().getVOTKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__VOT__Group__1__Impl7501); 
             after(grammarAccess.getVOTAccess().getVOTKeyword_1()); 

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
    // $ANTLR end "rule__VOT__Group__1__Impl"


    // $ANTLR start "rule__VOT__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3685:1: rule__VOT__Group__2 : rule__VOT__Group__2__Impl rule__VOT__Group__3 ;
    public final void rule__VOT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3689:1: ( rule__VOT__Group__2__Impl rule__VOT__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3690:2: rule__VOT__Group__2__Impl rule__VOT__Group__3
            {
            pushFollow(FOLLOW_rule__VOT__Group__2__Impl_in_rule__VOT__Group__27532);
            rule__VOT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__3_in_rule__VOT__Group__27535);
            rule__VOT__Group__3();

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
    // $ANTLR end "rule__VOT__Group__2"


    // $ANTLR start "rule__VOT__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3697:1: rule__VOT__Group__2__Impl : ( ( rule__VOT__NameAssignment_2 ) ) ;
    public final void rule__VOT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3701:1: ( ( ( rule__VOT__NameAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3702:1: ( ( rule__VOT__NameAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3702:1: ( ( rule__VOT__NameAssignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3703:1: ( rule__VOT__NameAssignment_2 )
            {
             before(grammarAccess.getVOTAccess().getNameAssignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3704:1: ( rule__VOT__NameAssignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3704:2: rule__VOT__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__VOT__NameAssignment_2_in_rule__VOT__Group__2__Impl7562);
            rule__VOT__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVOTAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__VOT__Group__2__Impl"


    // $ANTLR start "rule__VOT__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3714:1: rule__VOT__Group__3 : rule__VOT__Group__3__Impl rule__VOT__Group__4 ;
    public final void rule__VOT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3718:1: ( rule__VOT__Group__3__Impl rule__VOT__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3719:2: rule__VOT__Group__3__Impl rule__VOT__Group__4
            {
            pushFollow(FOLLOW_rule__VOT__Group__3__Impl_in_rule__VOT__Group__37592);
            rule__VOT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__4_in_rule__VOT__Group__37595);
            rule__VOT__Group__4();

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
    // $ANTLR end "rule__VOT__Group__3"


    // $ANTLR start "rule__VOT__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3726:1: rule__VOT__Group__3__Impl : ( '{' ) ;
    public final void rule__VOT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3730:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3731:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3731:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3732:1: '{'
            {
             before(grammarAccess.getVOTAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__VOT__Group__3__Impl7623); 
             after(grammarAccess.getVOTAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__VOT__Group__3__Impl"


    // $ANTLR start "rule__VOT__Group__4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3745:1: rule__VOT__Group__4 : rule__VOT__Group__4__Impl rule__VOT__Group__5 ;
    public final void rule__VOT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3749:1: ( rule__VOT__Group__4__Impl rule__VOT__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3750:2: rule__VOT__Group__4__Impl rule__VOT__Group__5
            {
            pushFollow(FOLLOW_rule__VOT__Group__4__Impl_in_rule__VOT__Group__47654);
            rule__VOT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__5_in_rule__VOT__Group__47657);
            rule__VOT__Group__5();

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
    // $ANTLR end "rule__VOT__Group__4"


    // $ANTLR start "rule__VOT__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3757:1: rule__VOT__Group__4__Impl : ( ( rule__VOT__Alternatives_4 )* ) ;
    public final void rule__VOT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3761:1: ( ( ( rule__VOT__Alternatives_4 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3762:1: ( ( rule__VOT__Alternatives_4 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3762:1: ( ( rule__VOT__Alternatives_4 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3763:1: ( rule__VOT__Alternatives_4 )*
            {
             before(grammarAccess.getVOTAccess().getAlternatives_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3764:1: ( rule__VOT__Alternatives_4 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3764:2: rule__VOT__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__VOT__Alternatives_4_in_rule__VOT__Group__4__Impl7684);
            	    rule__VOT__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getVOTAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__VOT__Group__4__Impl"


    // $ANTLR start "rule__VOT__Group__5"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3774:1: rule__VOT__Group__5 : rule__VOT__Group__5__Impl ;
    public final void rule__VOT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3778:1: ( rule__VOT__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3779:2: rule__VOT__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__VOT__Group__5__Impl_in_rule__VOT__Group__57715);
            rule__VOT__Group__5__Impl();

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
    // $ANTLR end "rule__VOT__Group__5"


    // $ANTLR start "rule__VOT__Group__5__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3785:1: rule__VOT__Group__5__Impl : ( '}' ) ;
    public final void rule__VOT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3789:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3790:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3790:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3791:1: '}'
            {
             before(grammarAccess.getVOTAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__VOT__Group__5__Impl7743); 
             after(grammarAccess.getVOTAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__VOT__Group__5__Impl"


    // $ANTLR start "rule__OOT__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3816:1: rule__OOT__Group__0 : rule__OOT__Group__0__Impl rule__OOT__Group__1 ;
    public final void rule__OOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3820:1: ( rule__OOT__Group__0__Impl rule__OOT__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3821:2: rule__OOT__Group__0__Impl rule__OOT__Group__1
            {
            pushFollow(FOLLOW_rule__OOT__Group__0__Impl_in_rule__OOT__Group__07786);
            rule__OOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__1_in_rule__OOT__Group__07789);
            rule__OOT__Group__1();

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
    // $ANTLR end "rule__OOT__Group__0"


    // $ANTLR start "rule__OOT__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3828:1: rule__OOT__Group__0__Impl : ( ( rule__OOT__AnnotationAssignment_0 )? ) ;
    public final void rule__OOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3832:1: ( ( ( rule__OOT__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3833:1: ( ( rule__OOT__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3833:1: ( ( rule__OOT__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3834:1: ( rule__OOT__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getOOTAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3835:1: ( rule__OOT__AnnotationAssignment_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=40 && LA35_0<=43)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3835:2: rule__OOT__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__OOT__AnnotationAssignment_0_in_rule__OOT__Group__0__Impl7816);
                    rule__OOT__AnnotationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOOTAccess().getAnnotationAssignment_0()); 

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
    // $ANTLR end "rule__OOT__Group__0__Impl"


    // $ANTLR start "rule__OOT__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3845:1: rule__OOT__Group__1 : rule__OOT__Group__1__Impl rule__OOT__Group__2 ;
    public final void rule__OOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3849:1: ( rule__OOT__Group__1__Impl rule__OOT__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3850:2: rule__OOT__Group__1__Impl rule__OOT__Group__2
            {
            pushFollow(FOLLOW_rule__OOT__Group__1__Impl_in_rule__OOT__Group__17847);
            rule__OOT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__2_in_rule__OOT__Group__17850);
            rule__OOT__Group__2();

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
    // $ANTLR end "rule__OOT__Group__1"


    // $ANTLR start "rule__OOT__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3857:1: rule__OOT__Group__1__Impl : ( 'OOT' ) ;
    public final void rule__OOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3861:1: ( ( 'OOT' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3862:1: ( 'OOT' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3862:1: ( 'OOT' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3863:1: 'OOT'
            {
             before(grammarAccess.getOOTAccess().getOOTKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__OOT__Group__1__Impl7878); 
             after(grammarAccess.getOOTAccess().getOOTKeyword_1()); 

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
    // $ANTLR end "rule__OOT__Group__1__Impl"


    // $ANTLR start "rule__OOT__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3876:1: rule__OOT__Group__2 : rule__OOT__Group__2__Impl rule__OOT__Group__3 ;
    public final void rule__OOT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3880:1: ( rule__OOT__Group__2__Impl rule__OOT__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3881:2: rule__OOT__Group__2__Impl rule__OOT__Group__3
            {
            pushFollow(FOLLOW_rule__OOT__Group__2__Impl_in_rule__OOT__Group__27909);
            rule__OOT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__3_in_rule__OOT__Group__27912);
            rule__OOT__Group__3();

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
    // $ANTLR end "rule__OOT__Group__2"


    // $ANTLR start "rule__OOT__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3888:1: rule__OOT__Group__2__Impl : ( ( rule__OOT__NameAssignment_2 ) ) ;
    public final void rule__OOT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3892:1: ( ( ( rule__OOT__NameAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3893:1: ( ( rule__OOT__NameAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3893:1: ( ( rule__OOT__NameAssignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3894:1: ( rule__OOT__NameAssignment_2 )
            {
             before(grammarAccess.getOOTAccess().getNameAssignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3895:1: ( rule__OOT__NameAssignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3895:2: rule__OOT__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__OOT__NameAssignment_2_in_rule__OOT__Group__2__Impl7939);
            rule__OOT__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOOTAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__OOT__Group__2__Impl"


    // $ANTLR start "rule__OOT__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3905:1: rule__OOT__Group__3 : rule__OOT__Group__3__Impl rule__OOT__Group__4 ;
    public final void rule__OOT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3909:1: ( rule__OOT__Group__3__Impl rule__OOT__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3910:2: rule__OOT__Group__3__Impl rule__OOT__Group__4
            {
            pushFollow(FOLLOW_rule__OOT__Group__3__Impl_in_rule__OOT__Group__37969);
            rule__OOT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__4_in_rule__OOT__Group__37972);
            rule__OOT__Group__4();

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
    // $ANTLR end "rule__OOT__Group__3"


    // $ANTLR start "rule__OOT__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3917:1: rule__OOT__Group__3__Impl : ( '{' ) ;
    public final void rule__OOT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3921:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3922:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3922:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3923:1: '{'
            {
             before(grammarAccess.getOOTAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__OOT__Group__3__Impl8000); 
             after(grammarAccess.getOOTAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__OOT__Group__3__Impl"


    // $ANTLR start "rule__OOT__Group__4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3936:1: rule__OOT__Group__4 : rule__OOT__Group__4__Impl rule__OOT__Group__5 ;
    public final void rule__OOT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3940:1: ( rule__OOT__Group__4__Impl rule__OOT__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3941:2: rule__OOT__Group__4__Impl rule__OOT__Group__5
            {
            pushFollow(FOLLOW_rule__OOT__Group__4__Impl_in_rule__OOT__Group__48031);
            rule__OOT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__5_in_rule__OOT__Group__48034);
            rule__OOT__Group__5();

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
    // $ANTLR end "rule__OOT__Group__4"


    // $ANTLR start "rule__OOT__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3948:1: rule__OOT__Group__4__Impl : ( ( rule__OOT__Alternatives_4 )* ) ;
    public final void rule__OOT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3952:1: ( ( ( rule__OOT__Alternatives_4 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3953:1: ( ( rule__OOT__Alternatives_4 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3953:1: ( ( rule__OOT__Alternatives_4 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3954:1: ( rule__OOT__Alternatives_4 )*
            {
             before(grammarAccess.getOOTAccess().getAlternatives_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3955:1: ( rule__OOT__Alternatives_4 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3955:2: rule__OOT__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__OOT__Alternatives_4_in_rule__OOT__Group__4__Impl8061);
            	    rule__OOT__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getOOTAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__OOT__Group__4__Impl"


    // $ANTLR start "rule__OOT__Group__5"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3965:1: rule__OOT__Group__5 : rule__OOT__Group__5__Impl ;
    public final void rule__OOT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3969:1: ( rule__OOT__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3970:2: rule__OOT__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__OOT__Group__5__Impl_in_rule__OOT__Group__58092);
            rule__OOT__Group__5__Impl();

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
    // $ANTLR end "rule__OOT__Group__5"


    // $ANTLR start "rule__OOT__Group__5__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3976:1: rule__OOT__Group__5__Impl : ( '}' ) ;
    public final void rule__OOT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3980:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3981:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3981:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:3982:1: '}'
            {
             before(grammarAccess.getOOTAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__OOT__Group__5__Impl8120); 
             after(grammarAccess.getOOTAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__OOT__Group__5__Impl"


    // $ANTLR start "rule__LOT__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4007:1: rule__LOT__Group__0 : rule__LOT__Group__0__Impl rule__LOT__Group__1 ;
    public final void rule__LOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4011:1: ( rule__LOT__Group__0__Impl rule__LOT__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4012:2: rule__LOT__Group__0__Impl rule__LOT__Group__1
            {
            pushFollow(FOLLOW_rule__LOT__Group__0__Impl_in_rule__LOT__Group__08163);
            rule__LOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__1_in_rule__LOT__Group__08166);
            rule__LOT__Group__1();

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
    // $ANTLR end "rule__LOT__Group__0"


    // $ANTLR start "rule__LOT__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4019:1: rule__LOT__Group__0__Impl : ( ( rule__LOT__AnnotationAssignment_0 )? ) ;
    public final void rule__LOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4023:1: ( ( ( rule__LOT__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4024:1: ( ( rule__LOT__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4024:1: ( ( rule__LOT__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4025:1: ( rule__LOT__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getLOTAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4026:1: ( rule__LOT__AnnotationAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=40 && LA37_0<=43)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4026:2: rule__LOT__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__LOT__AnnotationAssignment_0_in_rule__LOT__Group__0__Impl8193);
                    rule__LOT__AnnotationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLOTAccess().getAnnotationAssignment_0()); 

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
    // $ANTLR end "rule__LOT__Group__0__Impl"


    // $ANTLR start "rule__LOT__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4036:1: rule__LOT__Group__1 : rule__LOT__Group__1__Impl rule__LOT__Group__2 ;
    public final void rule__LOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4040:1: ( rule__LOT__Group__1__Impl rule__LOT__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4041:2: rule__LOT__Group__1__Impl rule__LOT__Group__2
            {
            pushFollow(FOLLOW_rule__LOT__Group__1__Impl_in_rule__LOT__Group__18224);
            rule__LOT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__2_in_rule__LOT__Group__18227);
            rule__LOT__Group__2();

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
    // $ANTLR end "rule__LOT__Group__1"


    // $ANTLR start "rule__LOT__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4048:1: rule__LOT__Group__1__Impl : ( 'LOT' ) ;
    public final void rule__LOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4052:1: ( ( 'LOT' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4053:1: ( 'LOT' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4053:1: ( 'LOT' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4054:1: 'LOT'
            {
             before(grammarAccess.getLOTAccess().getLOTKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__LOT__Group__1__Impl8255); 
             after(grammarAccess.getLOTAccess().getLOTKeyword_1()); 

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
    // $ANTLR end "rule__LOT__Group__1__Impl"


    // $ANTLR start "rule__LOT__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4067:1: rule__LOT__Group__2 : rule__LOT__Group__2__Impl rule__LOT__Group__3 ;
    public final void rule__LOT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4071:1: ( rule__LOT__Group__2__Impl rule__LOT__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4072:2: rule__LOT__Group__2__Impl rule__LOT__Group__3
            {
            pushFollow(FOLLOW_rule__LOT__Group__2__Impl_in_rule__LOT__Group__28286);
            rule__LOT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__3_in_rule__LOT__Group__28289);
            rule__LOT__Group__3();

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
    // $ANTLR end "rule__LOT__Group__2"


    // $ANTLR start "rule__LOT__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4079:1: rule__LOT__Group__2__Impl : ( ( rule__LOT__NameAssignment_2 ) ) ;
    public final void rule__LOT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4083:1: ( ( ( rule__LOT__NameAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4084:1: ( ( rule__LOT__NameAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4084:1: ( ( rule__LOT__NameAssignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4085:1: ( rule__LOT__NameAssignment_2 )
            {
             before(grammarAccess.getLOTAccess().getNameAssignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4086:1: ( rule__LOT__NameAssignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4086:2: rule__LOT__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__LOT__NameAssignment_2_in_rule__LOT__Group__2__Impl8316);
            rule__LOT__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLOTAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__LOT__Group__2__Impl"


    // $ANTLR start "rule__LOT__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4096:1: rule__LOT__Group__3 : rule__LOT__Group__3__Impl rule__LOT__Group__4 ;
    public final void rule__LOT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4100:1: ( rule__LOT__Group__3__Impl rule__LOT__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4101:2: rule__LOT__Group__3__Impl rule__LOT__Group__4
            {
            pushFollow(FOLLOW_rule__LOT__Group__3__Impl_in_rule__LOT__Group__38346);
            rule__LOT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__4_in_rule__LOT__Group__38349);
            rule__LOT__Group__4();

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
    // $ANTLR end "rule__LOT__Group__3"


    // $ANTLR start "rule__LOT__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4108:1: rule__LOT__Group__3__Impl : ( '{' ) ;
    public final void rule__LOT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4112:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4113:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4113:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4114:1: '{'
            {
             before(grammarAccess.getLOTAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__LOT__Group__3__Impl8377); 
             after(grammarAccess.getLOTAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__LOT__Group__3__Impl"


    // $ANTLR start "rule__LOT__Group__4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4127:1: rule__LOT__Group__4 : rule__LOT__Group__4__Impl rule__LOT__Group__5 ;
    public final void rule__LOT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4131:1: ( rule__LOT__Group__4__Impl rule__LOT__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4132:2: rule__LOT__Group__4__Impl rule__LOT__Group__5
            {
            pushFollow(FOLLOW_rule__LOT__Group__4__Impl_in_rule__LOT__Group__48408);
            rule__LOT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__5_in_rule__LOT__Group__48411);
            rule__LOT__Group__5();

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
    // $ANTLR end "rule__LOT__Group__4"


    // $ANTLR start "rule__LOT__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4139:1: rule__LOT__Group__4__Impl : ( ( rule__LOT__Alternatives_4 )* ) ;
    public final void rule__LOT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4143:1: ( ( ( rule__LOT__Alternatives_4 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4144:1: ( ( rule__LOT__Alternatives_4 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4144:1: ( ( rule__LOT__Alternatives_4 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4145:1: ( rule__LOT__Alternatives_4 )*
            {
             before(grammarAccess.getLOTAccess().getAlternatives_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4146:1: ( rule__LOT__Alternatives_4 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4146:2: rule__LOT__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__LOT__Alternatives_4_in_rule__LOT__Group__4__Impl8438);
            	    rule__LOT__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getLOTAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__LOT__Group__4__Impl"


    // $ANTLR start "rule__LOT__Group__5"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4156:1: rule__LOT__Group__5 : rule__LOT__Group__5__Impl ;
    public final void rule__LOT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4160:1: ( rule__LOT__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4161:2: rule__LOT__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__LOT__Group__5__Impl_in_rule__LOT__Group__58469);
            rule__LOT__Group__5__Impl();

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
    // $ANTLR end "rule__LOT__Group__5"


    // $ANTLR start "rule__LOT__Group__5__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4167:1: rule__LOT__Group__5__Impl : ( '}' ) ;
    public final void rule__LOT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4171:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4172:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4172:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4173:1: '}'
            {
             before(grammarAccess.getLOTAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__LOT__Group__5__Impl8497); 
             after(grammarAccess.getLOTAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__LOT__Group__5__Impl"


    // $ANTLR start "rule__TOT__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4198:1: rule__TOT__Group__0 : rule__TOT__Group__0__Impl rule__TOT__Group__1 ;
    public final void rule__TOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4202:1: ( rule__TOT__Group__0__Impl rule__TOT__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4203:2: rule__TOT__Group__0__Impl rule__TOT__Group__1
            {
            pushFollow(FOLLOW_rule__TOT__Group__0__Impl_in_rule__TOT__Group__08540);
            rule__TOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__1_in_rule__TOT__Group__08543);
            rule__TOT__Group__1();

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
    // $ANTLR end "rule__TOT__Group__0"


    // $ANTLR start "rule__TOT__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4210:1: rule__TOT__Group__0__Impl : ( ( rule__TOT__AnnotationAssignment_0 )? ) ;
    public final void rule__TOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4214:1: ( ( ( rule__TOT__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4215:1: ( ( rule__TOT__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4215:1: ( ( rule__TOT__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4216:1: ( rule__TOT__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getTOTAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4217:1: ( rule__TOT__AnnotationAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=40 && LA39_0<=43)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4217:2: rule__TOT__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TOT__AnnotationAssignment_0_in_rule__TOT__Group__0__Impl8570);
                    rule__TOT__AnnotationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTOTAccess().getAnnotationAssignment_0()); 

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
    // $ANTLR end "rule__TOT__Group__0__Impl"


    // $ANTLR start "rule__TOT__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4227:1: rule__TOT__Group__1 : rule__TOT__Group__1__Impl rule__TOT__Group__2 ;
    public final void rule__TOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4231:1: ( rule__TOT__Group__1__Impl rule__TOT__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4232:2: rule__TOT__Group__1__Impl rule__TOT__Group__2
            {
            pushFollow(FOLLOW_rule__TOT__Group__1__Impl_in_rule__TOT__Group__18601);
            rule__TOT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__2_in_rule__TOT__Group__18604);
            rule__TOT__Group__2();

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
    // $ANTLR end "rule__TOT__Group__1"


    // $ANTLR start "rule__TOT__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4239:1: rule__TOT__Group__1__Impl : ( 'TOT' ) ;
    public final void rule__TOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4243:1: ( ( 'TOT' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4244:1: ( 'TOT' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4244:1: ( 'TOT' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4245:1: 'TOT'
            {
             before(grammarAccess.getTOTAccess().getTOTKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__TOT__Group__1__Impl8632); 
             after(grammarAccess.getTOTAccess().getTOTKeyword_1()); 

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
    // $ANTLR end "rule__TOT__Group__1__Impl"


    // $ANTLR start "rule__TOT__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4258:1: rule__TOT__Group__2 : rule__TOT__Group__2__Impl rule__TOT__Group__3 ;
    public final void rule__TOT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4262:1: ( rule__TOT__Group__2__Impl rule__TOT__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4263:2: rule__TOT__Group__2__Impl rule__TOT__Group__3
            {
            pushFollow(FOLLOW_rule__TOT__Group__2__Impl_in_rule__TOT__Group__28663);
            rule__TOT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__3_in_rule__TOT__Group__28666);
            rule__TOT__Group__3();

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
    // $ANTLR end "rule__TOT__Group__2"


    // $ANTLR start "rule__TOT__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4270:1: rule__TOT__Group__2__Impl : ( ( rule__TOT__NameAssignment_2 ) ) ;
    public final void rule__TOT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4274:1: ( ( ( rule__TOT__NameAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4275:1: ( ( rule__TOT__NameAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4275:1: ( ( rule__TOT__NameAssignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4276:1: ( rule__TOT__NameAssignment_2 )
            {
             before(grammarAccess.getTOTAccess().getNameAssignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4277:1: ( rule__TOT__NameAssignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4277:2: rule__TOT__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TOT__NameAssignment_2_in_rule__TOT__Group__2__Impl8693);
            rule__TOT__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTOTAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__TOT__Group__2__Impl"


    // $ANTLR start "rule__TOT__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4287:1: rule__TOT__Group__3 : rule__TOT__Group__3__Impl rule__TOT__Group__4 ;
    public final void rule__TOT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4291:1: ( rule__TOT__Group__3__Impl rule__TOT__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4292:2: rule__TOT__Group__3__Impl rule__TOT__Group__4
            {
            pushFollow(FOLLOW_rule__TOT__Group__3__Impl_in_rule__TOT__Group__38723);
            rule__TOT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__4_in_rule__TOT__Group__38726);
            rule__TOT__Group__4();

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
    // $ANTLR end "rule__TOT__Group__3"


    // $ANTLR start "rule__TOT__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4299:1: rule__TOT__Group__3__Impl : ( '{' ) ;
    public final void rule__TOT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4303:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4304:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4304:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4305:1: '{'
            {
             before(grammarAccess.getTOTAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__TOT__Group__3__Impl8754); 
             after(grammarAccess.getTOTAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__TOT__Group__3__Impl"


    // $ANTLR start "rule__TOT__Group__4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4318:1: rule__TOT__Group__4 : rule__TOT__Group__4__Impl rule__TOT__Group__5 ;
    public final void rule__TOT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4322:1: ( rule__TOT__Group__4__Impl rule__TOT__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4323:2: rule__TOT__Group__4__Impl rule__TOT__Group__5
            {
            pushFollow(FOLLOW_rule__TOT__Group__4__Impl_in_rule__TOT__Group__48785);
            rule__TOT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__5_in_rule__TOT__Group__48788);
            rule__TOT__Group__5();

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
    // $ANTLR end "rule__TOT__Group__4"


    // $ANTLR start "rule__TOT__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4330:1: rule__TOT__Group__4__Impl : ( ( rule__TOT__Alternatives_4 )* ) ;
    public final void rule__TOT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4334:1: ( ( ( rule__TOT__Alternatives_4 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4335:1: ( ( rule__TOT__Alternatives_4 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4335:1: ( ( rule__TOT__Alternatives_4 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4336:1: ( rule__TOT__Alternatives_4 )*
            {
             before(grammarAccess.getTOTAccess().getAlternatives_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4337:1: ( rule__TOT__Alternatives_4 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4337:2: rule__TOT__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__TOT__Alternatives_4_in_rule__TOT__Group__4__Impl8815);
            	    rule__TOT__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getTOTAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__TOT__Group__4__Impl"


    // $ANTLR start "rule__TOT__Group__5"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4347:1: rule__TOT__Group__5 : rule__TOT__Group__5__Impl ;
    public final void rule__TOT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4351:1: ( rule__TOT__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4352:2: rule__TOT__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__TOT__Group__5__Impl_in_rule__TOT__Group__58846);
            rule__TOT__Group__5__Impl();

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
    // $ANTLR end "rule__TOT__Group__5"


    // $ANTLR start "rule__TOT__Group__5__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4358:1: rule__TOT__Group__5__Impl : ( '}' ) ;
    public final void rule__TOT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4362:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4363:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4363:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4364:1: '}'
            {
             before(grammarAccess.getTOTAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__TOT__Group__5__Impl8874); 
             after(grammarAccess.getTOTAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__TOT__Group__5__Impl"


    // $ANTLR start "rule__Attribut__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4389:1: rule__Attribut__Group__0 : rule__Attribut__Group__0__Impl rule__Attribut__Group__1 ;
    public final void rule__Attribut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4393:1: ( rule__Attribut__Group__0__Impl rule__Attribut__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4394:2: rule__Attribut__Group__0__Impl rule__Attribut__Group__1
            {
            pushFollow(FOLLOW_rule__Attribut__Group__0__Impl_in_rule__Attribut__Group__08917);
            rule__Attribut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribut__Group__1_in_rule__Attribut__Group__08920);
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
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4401:1: rule__Attribut__Group__0__Impl : ( ( rule__Attribut__TypAssignment_0 )? ) ;
    public final void rule__Attribut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4405:1: ( ( ( rule__Attribut__TypAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4406:1: ( ( rule__Attribut__TypAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4406:1: ( ( rule__Attribut__TypAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4407:1: ( rule__Attribut__TypAssignment_0 )?
            {
             before(grammarAccess.getAttributAccess().getTypAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4408:1: ( rule__Attribut__TypAssignment_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==RULE_ID) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4408:2: rule__Attribut__TypAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Attribut__TypAssignment_0_in_rule__Attribut__Group__0__Impl8947);
                    rule__Attribut__TypAssignment_0();

                    state._fsp--;


                    }
                    break;

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4418:1: rule__Attribut__Group__1 : rule__Attribut__Group__1__Impl rule__Attribut__Group__2 ;
    public final void rule__Attribut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4422:1: ( rule__Attribut__Group__1__Impl rule__Attribut__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4423:2: rule__Attribut__Group__1__Impl rule__Attribut__Group__2
            {
            pushFollow(FOLLOW_rule__Attribut__Group__1__Impl_in_rule__Attribut__Group__18978);
            rule__Attribut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribut__Group__2_in_rule__Attribut__Group__18981);
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
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4430:1: rule__Attribut__Group__1__Impl : ( ( rule__Attribut__NameAssignment_1 ) ) ;
    public final void rule__Attribut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4434:1: ( ( ( rule__Attribut__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4435:1: ( ( rule__Attribut__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4435:1: ( ( rule__Attribut__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4436:1: ( rule__Attribut__NameAssignment_1 )
            {
             before(grammarAccess.getAttributAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4437:1: ( rule__Attribut__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4437:2: rule__Attribut__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribut__NameAssignment_1_in_rule__Attribut__Group__1__Impl9008);
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
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4447:1: rule__Attribut__Group__2 : rule__Attribut__Group__2__Impl ;
    public final void rule__Attribut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4451:1: ( rule__Attribut__Group__2__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4452:2: rule__Attribut__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribut__Group__2__Impl_in_rule__Attribut__Group__29038);
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
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4458:1: rule__Attribut__Group__2__Impl : ( ';' ) ;
    public final void rule__Attribut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4462:1: ( ( ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4463:1: ( ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4463:1: ( ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4464:1: ';'
            {
             before(grammarAccess.getAttributAccess().getSemicolonKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Attribut__Group__2__Impl9066); 
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


    // $ANTLR start "rule__Operator__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4483:1: rule__Operator__Group__0 : rule__Operator__Group__0__Impl rule__Operator__Group__1 ;
    public final void rule__Operator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4487:1: ( rule__Operator__Group__0__Impl rule__Operator__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4488:2: rule__Operator__Group__0__Impl rule__Operator__Group__1
            {
            pushFollow(FOLLOW_rule__Operator__Group__0__Impl_in_rule__Operator__Group__09103);
            rule__Operator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__1_in_rule__Operator__Group__09106);
            rule__Operator__Group__1();

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
    // $ANTLR end "rule__Operator__Group__0"


    // $ANTLR start "rule__Operator__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4495:1: rule__Operator__Group__0__Impl : ( ( rule__Operator__NameAssignment_0 ) ) ;
    public final void rule__Operator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4499:1: ( ( ( rule__Operator__NameAssignment_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4500:1: ( ( rule__Operator__NameAssignment_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4500:1: ( ( rule__Operator__NameAssignment_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4501:1: ( rule__Operator__NameAssignment_0 )
            {
             before(grammarAccess.getOperatorAccess().getNameAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4502:1: ( rule__Operator__NameAssignment_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4502:2: rule__Operator__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Operator__NameAssignment_0_in_rule__Operator__Group__0__Impl9133);
            rule__Operator__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Operator__Group__0__Impl"


    // $ANTLR start "rule__Operator__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4512:1: rule__Operator__Group__1 : rule__Operator__Group__1__Impl rule__Operator__Group__2 ;
    public final void rule__Operator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4516:1: ( rule__Operator__Group__1__Impl rule__Operator__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4517:2: rule__Operator__Group__1__Impl rule__Operator__Group__2
            {
            pushFollow(FOLLOW_rule__Operator__Group__1__Impl_in_rule__Operator__Group__19163);
            rule__Operator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__2_in_rule__Operator__Group__19166);
            rule__Operator__Group__2();

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
    // $ANTLR end "rule__Operator__Group__1"


    // $ANTLR start "rule__Operator__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4524:1: rule__Operator__Group__1__Impl : ( '(' ) ;
    public final void rule__Operator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4528:1: ( ( '(' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4529:1: ( '(' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4529:1: ( '(' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4530:1: '('
            {
             before(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Operator__Group__1__Impl9194); 
             after(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Operator__Group__1__Impl"


    // $ANTLR start "rule__Operator__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4543:1: rule__Operator__Group__2 : rule__Operator__Group__2__Impl rule__Operator__Group__3 ;
    public final void rule__Operator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4547:1: ( rule__Operator__Group__2__Impl rule__Operator__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4548:2: rule__Operator__Group__2__Impl rule__Operator__Group__3
            {
            pushFollow(FOLLOW_rule__Operator__Group__2__Impl_in_rule__Operator__Group__29225);
            rule__Operator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__3_in_rule__Operator__Group__29228);
            rule__Operator__Group__3();

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
    // $ANTLR end "rule__Operator__Group__2"


    // $ANTLR start "rule__Operator__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4555:1: rule__Operator__Group__2__Impl : ( ( rule__Operator__ParameterAssignment_2 )* ) ;
    public final void rule__Operator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4559:1: ( ( ( rule__Operator__ParameterAssignment_2 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4560:1: ( ( rule__Operator__ParameterAssignment_2 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4560:1: ( ( rule__Operator__ParameterAssignment_2 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4561:1: ( rule__Operator__ParameterAssignment_2 )*
            {
             before(grammarAccess.getOperatorAccess().getParameterAssignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4562:1: ( rule__Operator__ParameterAssignment_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4562:2: rule__Operator__ParameterAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Operator__ParameterAssignment_2_in_rule__Operator__Group__2__Impl9255);
            	    rule__Operator__ParameterAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getOperatorAccess().getParameterAssignment_2()); 

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
    // $ANTLR end "rule__Operator__Group__2__Impl"


    // $ANTLR start "rule__Operator__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4572:1: rule__Operator__Group__3 : rule__Operator__Group__3__Impl rule__Operator__Group__4 ;
    public final void rule__Operator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4576:1: ( rule__Operator__Group__3__Impl rule__Operator__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4577:2: rule__Operator__Group__3__Impl rule__Operator__Group__4
            {
            pushFollow(FOLLOW_rule__Operator__Group__3__Impl_in_rule__Operator__Group__39286);
            rule__Operator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__4_in_rule__Operator__Group__39289);
            rule__Operator__Group__4();

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
    // $ANTLR end "rule__Operator__Group__3"


    // $ANTLR start "rule__Operator__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4584:1: rule__Operator__Group__3__Impl : ( ')' ) ;
    public final void rule__Operator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4588:1: ( ( ')' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4589:1: ( ')' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4589:1: ( ')' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4590:1: ')'
            {
             before(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Operator__Group__3__Impl9317); 
             after(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Operator__Group__3__Impl"


    // $ANTLR start "rule__Operator__Group__4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4603:1: rule__Operator__Group__4 : rule__Operator__Group__4__Impl ;
    public final void rule__Operator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4607:1: ( rule__Operator__Group__4__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4608:2: rule__Operator__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Operator__Group__4__Impl_in_rule__Operator__Group__49348);
            rule__Operator__Group__4__Impl();

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
    // $ANTLR end "rule__Operator__Group__4"


    // $ANTLR start "rule__Operator__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4614:1: rule__Operator__Group__4__Impl : ( ';' ) ;
    public final void rule__Operator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4618:1: ( ( ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4619:1: ( ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4619:1: ( ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4620:1: ';'
            {
             before(grammarAccess.getOperatorAccess().getSemicolonKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Operator__Group__4__Impl9376); 
             after(grammarAccess.getOperatorAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Operator__Group__4__Impl"


    // $ANTLR start "rule__Interacts_with__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4643:1: rule__Interacts_with__Group__0 : rule__Interacts_with__Group__0__Impl rule__Interacts_with__Group__1 ;
    public final void rule__Interacts_with__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4647:1: ( rule__Interacts_with__Group__0__Impl rule__Interacts_with__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4648:2: rule__Interacts_with__Group__0__Impl rule__Interacts_with__Group__1
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__0__Impl_in_rule__Interacts_with__Group__09417);
            rule__Interacts_with__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__1_in_rule__Interacts_with__Group__09420);
            rule__Interacts_with__Group__1();

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
    // $ANTLR end "rule__Interacts_with__Group__0"


    // $ANTLR start "rule__Interacts_with__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4655:1: rule__Interacts_with__Group__0__Impl : ( ( rule__Interacts_with__AnnotationAssignment_0 )? ) ;
    public final void rule__Interacts_with__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4659:1: ( ( ( rule__Interacts_with__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4660:1: ( ( rule__Interacts_with__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4660:1: ( ( rule__Interacts_with__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4661:1: ( rule__Interacts_with__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getInteracts_withAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4662:1: ( rule__Interacts_with__AnnotationAssignment_0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=40 && LA43_0<=43)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4662:2: rule__Interacts_with__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Interacts_with__AnnotationAssignment_0_in_rule__Interacts_with__Group__0__Impl9447);
                    rule__Interacts_with__AnnotationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInteracts_withAccess().getAnnotationAssignment_0()); 

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
    // $ANTLR end "rule__Interacts_with__Group__0__Impl"


    // $ANTLR start "rule__Interacts_with__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4672:1: rule__Interacts_with__Group__1 : rule__Interacts_with__Group__1__Impl rule__Interacts_with__Group__2 ;
    public final void rule__Interacts_with__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4676:1: ( rule__Interacts_with__Group__1__Impl rule__Interacts_with__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4677:2: rule__Interacts_with__Group__1__Impl rule__Interacts_with__Group__2
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__1__Impl_in_rule__Interacts_with__Group__19478);
            rule__Interacts_with__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__2_in_rule__Interacts_with__Group__19481);
            rule__Interacts_with__Group__2();

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
    // $ANTLR end "rule__Interacts_with__Group__1"


    // $ANTLR start "rule__Interacts_with__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4684:1: rule__Interacts_with__Group__1__Impl : ( ( 'interacts_with:' )? ) ;
    public final void rule__Interacts_with__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4688:1: ( ( ( 'interacts_with:' )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4689:1: ( ( 'interacts_with:' )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4689:1: ( ( 'interacts_with:' )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4690:1: ( 'interacts_with:' )?
            {
             before(grammarAccess.getInteracts_withAccess().getInteracts_withKeyword_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4691:1: ( 'interacts_with:' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==37) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4692:2: 'interacts_with:'
                    {
                    match(input,37,FOLLOW_37_in_rule__Interacts_with__Group__1__Impl9510); 

                    }
                    break;

            }

             after(grammarAccess.getInteracts_withAccess().getInteracts_withKeyword_1()); 

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
    // $ANTLR end "rule__Interacts_with__Group__1__Impl"


    // $ANTLR start "rule__Interacts_with__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4703:1: rule__Interacts_with__Group__2 : rule__Interacts_with__Group__2__Impl rule__Interacts_with__Group__3 ;
    public final void rule__Interacts_with__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4707:1: ( rule__Interacts_with__Group__2__Impl rule__Interacts_with__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4708:2: rule__Interacts_with__Group__2__Impl rule__Interacts_with__Group__3
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__2__Impl_in_rule__Interacts_with__Group__29543);
            rule__Interacts_with__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__3_in_rule__Interacts_with__Group__29546);
            rule__Interacts_with__Group__3();

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
    // $ANTLR end "rule__Interacts_with__Group__2"


    // $ANTLR start "rule__Interacts_with__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4715:1: rule__Interacts_with__Group__2__Impl : ( ( rule__Interacts_with__Objekttyp1Assignment_2 ) ) ;
    public final void rule__Interacts_with__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4719:1: ( ( ( rule__Interacts_with__Objekttyp1Assignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4720:1: ( ( rule__Interacts_with__Objekttyp1Assignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4720:1: ( ( rule__Interacts_with__Objekttyp1Assignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4721:1: ( rule__Interacts_with__Objekttyp1Assignment_2 )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp1Assignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4722:1: ( rule__Interacts_with__Objekttyp1Assignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4722:2: rule__Interacts_with__Objekttyp1Assignment_2
            {
            pushFollow(FOLLOW_rule__Interacts_with__Objekttyp1Assignment_2_in_rule__Interacts_with__Group__2__Impl9573);
            rule__Interacts_with__Objekttyp1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInteracts_withAccess().getObjekttyp1Assignment_2()); 

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
    // $ANTLR end "rule__Interacts_with__Group__2__Impl"


    // $ANTLR start "rule__Interacts_with__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4732:1: rule__Interacts_with__Group__3 : rule__Interacts_with__Group__3__Impl rule__Interacts_with__Group__4 ;
    public final void rule__Interacts_with__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4736:1: ( rule__Interacts_with__Group__3__Impl rule__Interacts_with__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4737:2: rule__Interacts_with__Group__3__Impl rule__Interacts_with__Group__4
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__3__Impl_in_rule__Interacts_with__Group__39603);
            rule__Interacts_with__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__4_in_rule__Interacts_with__Group__39606);
            rule__Interacts_with__Group__4();

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
    // $ANTLR end "rule__Interacts_with__Group__3"


    // $ANTLR start "rule__Interacts_with__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4744:1: rule__Interacts_with__Group__3__Impl : ( ( rule__Interacts_with__KardinalitaetAssignment_3 ) ) ;
    public final void rule__Interacts_with__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4748:1: ( ( ( rule__Interacts_with__KardinalitaetAssignment_3 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4749:1: ( ( rule__Interacts_with__KardinalitaetAssignment_3 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4749:1: ( ( rule__Interacts_with__KardinalitaetAssignment_3 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4750:1: ( rule__Interacts_with__KardinalitaetAssignment_3 )
            {
             before(grammarAccess.getInteracts_withAccess().getKardinalitaetAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4751:1: ( rule__Interacts_with__KardinalitaetAssignment_3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4751:2: rule__Interacts_with__KardinalitaetAssignment_3
            {
            pushFollow(FOLLOW_rule__Interacts_with__KardinalitaetAssignment_3_in_rule__Interacts_with__Group__3__Impl9633);
            rule__Interacts_with__KardinalitaetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInteracts_withAccess().getKardinalitaetAssignment_3()); 

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
    // $ANTLR end "rule__Interacts_with__Group__3__Impl"


    // $ANTLR start "rule__Interacts_with__Group__4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4761:1: rule__Interacts_with__Group__4 : rule__Interacts_with__Group__4__Impl rule__Interacts_with__Group__5 ;
    public final void rule__Interacts_with__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4765:1: ( rule__Interacts_with__Group__4__Impl rule__Interacts_with__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4766:2: rule__Interacts_with__Group__4__Impl rule__Interacts_with__Group__5
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__4__Impl_in_rule__Interacts_with__Group__49663);
            rule__Interacts_with__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__5_in_rule__Interacts_with__Group__49666);
            rule__Interacts_with__Group__5();

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
    // $ANTLR end "rule__Interacts_with__Group__4"


    // $ANTLR start "rule__Interacts_with__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4773:1: rule__Interacts_with__Group__4__Impl : ( ( rule__Interacts_with__Objekttyp2Assignment_4 ) ) ;
    public final void rule__Interacts_with__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4777:1: ( ( ( rule__Interacts_with__Objekttyp2Assignment_4 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4778:1: ( ( rule__Interacts_with__Objekttyp2Assignment_4 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4778:1: ( ( rule__Interacts_with__Objekttyp2Assignment_4 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4779:1: ( rule__Interacts_with__Objekttyp2Assignment_4 )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp2Assignment_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4780:1: ( rule__Interacts_with__Objekttyp2Assignment_4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4780:2: rule__Interacts_with__Objekttyp2Assignment_4
            {
            pushFollow(FOLLOW_rule__Interacts_with__Objekttyp2Assignment_4_in_rule__Interacts_with__Group__4__Impl9693);
            rule__Interacts_with__Objekttyp2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInteracts_withAccess().getObjekttyp2Assignment_4()); 

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
    // $ANTLR end "rule__Interacts_with__Group__4__Impl"


    // $ANTLR start "rule__Interacts_with__Group__5"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4790:1: rule__Interacts_with__Group__5 : rule__Interacts_with__Group__5__Impl ;
    public final void rule__Interacts_with__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4794:1: ( rule__Interacts_with__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4795:2: rule__Interacts_with__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__5__Impl_in_rule__Interacts_with__Group__59723);
            rule__Interacts_with__Group__5__Impl();

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
    // $ANTLR end "rule__Interacts_with__Group__5"


    // $ANTLR start "rule__Interacts_with__Group__5__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4801:1: rule__Interacts_with__Group__5__Impl : ( ';' ) ;
    public final void rule__Interacts_with__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4805:1: ( ( ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4806:1: ( ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4806:1: ( ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4807:1: ';'
            {
             before(grammarAccess.getInteracts_withAccess().getSemicolonKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__Interacts_with__Group__5__Impl9751); 
             after(grammarAccess.getInteracts_withAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Interacts_with__Group__5__Impl"


    // $ANTLR start "rule__Is_a__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4832:1: rule__Is_a__Group__0 : rule__Is_a__Group__0__Impl rule__Is_a__Group__1 ;
    public final void rule__Is_a__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4836:1: ( rule__Is_a__Group__0__Impl rule__Is_a__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4837:2: rule__Is_a__Group__0__Impl rule__Is_a__Group__1
            {
            pushFollow(FOLLOW_rule__Is_a__Group__0__Impl_in_rule__Is_a__Group__09794);
            rule__Is_a__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__1_in_rule__Is_a__Group__09797);
            rule__Is_a__Group__1();

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
    // $ANTLR end "rule__Is_a__Group__0"


    // $ANTLR start "rule__Is_a__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4844:1: rule__Is_a__Group__0__Impl : ( ( rule__Is_a__AnnotationAssignment_0 )? ) ;
    public final void rule__Is_a__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4848:1: ( ( ( rule__Is_a__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4849:1: ( ( rule__Is_a__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4849:1: ( ( rule__Is_a__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4850:1: ( rule__Is_a__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getIs_aAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4851:1: ( rule__Is_a__AnnotationAssignment_0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=40 && LA45_0<=43)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4851:2: rule__Is_a__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Is_a__AnnotationAssignment_0_in_rule__Is_a__Group__0__Impl9824);
                    rule__Is_a__AnnotationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIs_aAccess().getAnnotationAssignment_0()); 

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
    // $ANTLR end "rule__Is_a__Group__0__Impl"


    // $ANTLR start "rule__Is_a__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4861:1: rule__Is_a__Group__1 : rule__Is_a__Group__1__Impl rule__Is_a__Group__2 ;
    public final void rule__Is_a__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4865:1: ( rule__Is_a__Group__1__Impl rule__Is_a__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4866:2: rule__Is_a__Group__1__Impl rule__Is_a__Group__2
            {
            pushFollow(FOLLOW_rule__Is_a__Group__1__Impl_in_rule__Is_a__Group__19855);
            rule__Is_a__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__2_in_rule__Is_a__Group__19858);
            rule__Is_a__Group__2();

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
    // $ANTLR end "rule__Is_a__Group__1"


    // $ANTLR start "rule__Is_a__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4873:1: rule__Is_a__Group__1__Impl : ( 'is_a:' ) ;
    public final void rule__Is_a__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4877:1: ( ( 'is_a:' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4878:1: ( 'is_a:' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4878:1: ( 'is_a:' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4879:1: 'is_a:'
            {
             before(grammarAccess.getIs_aAccess().getIs_aKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__Is_a__Group__1__Impl9886); 
             after(grammarAccess.getIs_aAccess().getIs_aKeyword_1()); 

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
    // $ANTLR end "rule__Is_a__Group__1__Impl"


    // $ANTLR start "rule__Is_a__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4892:1: rule__Is_a__Group__2 : rule__Is_a__Group__2__Impl rule__Is_a__Group__3 ;
    public final void rule__Is_a__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4896:1: ( rule__Is_a__Group__2__Impl rule__Is_a__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4897:2: rule__Is_a__Group__2__Impl rule__Is_a__Group__3
            {
            pushFollow(FOLLOW_rule__Is_a__Group__2__Impl_in_rule__Is_a__Group__29917);
            rule__Is_a__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__3_in_rule__Is_a__Group__29920);
            rule__Is_a__Group__3();

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
    // $ANTLR end "rule__Is_a__Group__2"


    // $ANTLR start "rule__Is_a__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4904:1: rule__Is_a__Group__2__Impl : ( ( rule__Is_a__Objekttyp1Assignment_2 ) ) ;
    public final void rule__Is_a__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4908:1: ( ( ( rule__Is_a__Objekttyp1Assignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4909:1: ( ( rule__Is_a__Objekttyp1Assignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4909:1: ( ( rule__Is_a__Objekttyp1Assignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4910:1: ( rule__Is_a__Objekttyp1Assignment_2 )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp1Assignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4911:1: ( rule__Is_a__Objekttyp1Assignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4911:2: rule__Is_a__Objekttyp1Assignment_2
            {
            pushFollow(FOLLOW_rule__Is_a__Objekttyp1Assignment_2_in_rule__Is_a__Group__2__Impl9947);
            rule__Is_a__Objekttyp1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIs_aAccess().getObjekttyp1Assignment_2()); 

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
    // $ANTLR end "rule__Is_a__Group__2__Impl"


    // $ANTLR start "rule__Is_a__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4921:1: rule__Is_a__Group__3 : rule__Is_a__Group__3__Impl rule__Is_a__Group__4 ;
    public final void rule__Is_a__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4925:1: ( rule__Is_a__Group__3__Impl rule__Is_a__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4926:2: rule__Is_a__Group__3__Impl rule__Is_a__Group__4
            {
            pushFollow(FOLLOW_rule__Is_a__Group__3__Impl_in_rule__Is_a__Group__39977);
            rule__Is_a__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__4_in_rule__Is_a__Group__39980);
            rule__Is_a__Group__4();

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
    // $ANTLR end "rule__Is_a__Group__3"


    // $ANTLR start "rule__Is_a__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4933:1: rule__Is_a__Group__3__Impl : ( ( rule__Is_a__KardinalitaetAssignment_3 ) ) ;
    public final void rule__Is_a__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4937:1: ( ( ( rule__Is_a__KardinalitaetAssignment_3 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4938:1: ( ( rule__Is_a__KardinalitaetAssignment_3 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4938:1: ( ( rule__Is_a__KardinalitaetAssignment_3 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4939:1: ( rule__Is_a__KardinalitaetAssignment_3 )
            {
             before(grammarAccess.getIs_aAccess().getKardinalitaetAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4940:1: ( rule__Is_a__KardinalitaetAssignment_3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4940:2: rule__Is_a__KardinalitaetAssignment_3
            {
            pushFollow(FOLLOW_rule__Is_a__KardinalitaetAssignment_3_in_rule__Is_a__Group__3__Impl10007);
            rule__Is_a__KardinalitaetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIs_aAccess().getKardinalitaetAssignment_3()); 

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
    // $ANTLR end "rule__Is_a__Group__3__Impl"


    // $ANTLR start "rule__Is_a__Group__4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4950:1: rule__Is_a__Group__4 : rule__Is_a__Group__4__Impl rule__Is_a__Group__5 ;
    public final void rule__Is_a__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4954:1: ( rule__Is_a__Group__4__Impl rule__Is_a__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4955:2: rule__Is_a__Group__4__Impl rule__Is_a__Group__5
            {
            pushFollow(FOLLOW_rule__Is_a__Group__4__Impl_in_rule__Is_a__Group__410037);
            rule__Is_a__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__5_in_rule__Is_a__Group__410040);
            rule__Is_a__Group__5();

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
    // $ANTLR end "rule__Is_a__Group__4"


    // $ANTLR start "rule__Is_a__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4962:1: rule__Is_a__Group__4__Impl : ( ( rule__Is_a__Objekttyp2Assignment_4 ) ) ;
    public final void rule__Is_a__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4966:1: ( ( ( rule__Is_a__Objekttyp2Assignment_4 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4967:1: ( ( rule__Is_a__Objekttyp2Assignment_4 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4967:1: ( ( rule__Is_a__Objekttyp2Assignment_4 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4968:1: ( rule__Is_a__Objekttyp2Assignment_4 )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp2Assignment_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4969:1: ( rule__Is_a__Objekttyp2Assignment_4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4969:2: rule__Is_a__Objekttyp2Assignment_4
            {
            pushFollow(FOLLOW_rule__Is_a__Objekttyp2Assignment_4_in_rule__Is_a__Group__4__Impl10067);
            rule__Is_a__Objekttyp2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIs_aAccess().getObjekttyp2Assignment_4()); 

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
    // $ANTLR end "rule__Is_a__Group__4__Impl"


    // $ANTLR start "rule__Is_a__Group__5"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4979:1: rule__Is_a__Group__5 : rule__Is_a__Group__5__Impl ;
    public final void rule__Is_a__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4983:1: ( rule__Is_a__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4984:2: rule__Is_a__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Is_a__Group__5__Impl_in_rule__Is_a__Group__510097);
            rule__Is_a__Group__5__Impl();

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
    // $ANTLR end "rule__Is_a__Group__5"


    // $ANTLR start "rule__Is_a__Group__5__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4990:1: rule__Is_a__Group__5__Impl : ( ';' ) ;
    public final void rule__Is_a__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4994:1: ( ( ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4995:1: ( ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4995:1: ( ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:4996:1: ';'
            {
             before(grammarAccess.getIs_aAccess().getSemicolonKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__Is_a__Group__5__Impl10125); 
             after(grammarAccess.getIs_aAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Is_a__Group__5__Impl"


    // $ANTLR start "rule__Is_part_of__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5021:1: rule__Is_part_of__Group__0 : rule__Is_part_of__Group__0__Impl rule__Is_part_of__Group__1 ;
    public final void rule__Is_part_of__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5025:1: ( rule__Is_part_of__Group__0__Impl rule__Is_part_of__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5026:2: rule__Is_part_of__Group__0__Impl rule__Is_part_of__Group__1
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__0__Impl_in_rule__Is_part_of__Group__010168);
            rule__Is_part_of__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__1_in_rule__Is_part_of__Group__010171);
            rule__Is_part_of__Group__1();

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
    // $ANTLR end "rule__Is_part_of__Group__0"


    // $ANTLR start "rule__Is_part_of__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5033:1: rule__Is_part_of__Group__0__Impl : ( ( rule__Is_part_of__AnnotationAssignment_0 )? ) ;
    public final void rule__Is_part_of__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5037:1: ( ( ( rule__Is_part_of__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5038:1: ( ( rule__Is_part_of__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5038:1: ( ( rule__Is_part_of__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5039:1: ( rule__Is_part_of__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getIs_part_ofAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5040:1: ( rule__Is_part_of__AnnotationAssignment_0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=40 && LA46_0<=43)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5040:2: rule__Is_part_of__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Is_part_of__AnnotationAssignment_0_in_rule__Is_part_of__Group__0__Impl10198);
                    rule__Is_part_of__AnnotationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIs_part_ofAccess().getAnnotationAssignment_0()); 

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
    // $ANTLR end "rule__Is_part_of__Group__0__Impl"


    // $ANTLR start "rule__Is_part_of__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5050:1: rule__Is_part_of__Group__1 : rule__Is_part_of__Group__1__Impl rule__Is_part_of__Group__2 ;
    public final void rule__Is_part_of__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5054:1: ( rule__Is_part_of__Group__1__Impl rule__Is_part_of__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5055:2: rule__Is_part_of__Group__1__Impl rule__Is_part_of__Group__2
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__1__Impl_in_rule__Is_part_of__Group__110229);
            rule__Is_part_of__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__2_in_rule__Is_part_of__Group__110232);
            rule__Is_part_of__Group__2();

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
    // $ANTLR end "rule__Is_part_of__Group__1"


    // $ANTLR start "rule__Is_part_of__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5062:1: rule__Is_part_of__Group__1__Impl : ( 'is_part_of:' ) ;
    public final void rule__Is_part_of__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5066:1: ( ( 'is_part_of:' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5067:1: ( 'is_part_of:' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5067:1: ( 'is_part_of:' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5068:1: 'is_part_of:'
            {
             before(grammarAccess.getIs_part_ofAccess().getIs_part_ofKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__Is_part_of__Group__1__Impl10260); 
             after(grammarAccess.getIs_part_ofAccess().getIs_part_ofKeyword_1()); 

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
    // $ANTLR end "rule__Is_part_of__Group__1__Impl"


    // $ANTLR start "rule__Is_part_of__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5081:1: rule__Is_part_of__Group__2 : rule__Is_part_of__Group__2__Impl rule__Is_part_of__Group__3 ;
    public final void rule__Is_part_of__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5085:1: ( rule__Is_part_of__Group__2__Impl rule__Is_part_of__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5086:2: rule__Is_part_of__Group__2__Impl rule__Is_part_of__Group__3
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__2__Impl_in_rule__Is_part_of__Group__210291);
            rule__Is_part_of__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__3_in_rule__Is_part_of__Group__210294);
            rule__Is_part_of__Group__3();

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
    // $ANTLR end "rule__Is_part_of__Group__2"


    // $ANTLR start "rule__Is_part_of__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5093:1: rule__Is_part_of__Group__2__Impl : ( ( rule__Is_part_of__Objekttyp1Assignment_2 ) ) ;
    public final void rule__Is_part_of__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5097:1: ( ( ( rule__Is_part_of__Objekttyp1Assignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5098:1: ( ( rule__Is_part_of__Objekttyp1Assignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5098:1: ( ( rule__Is_part_of__Objekttyp1Assignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5099:1: ( rule__Is_part_of__Objekttyp1Assignment_2 )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp1Assignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5100:1: ( rule__Is_part_of__Objekttyp1Assignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5100:2: rule__Is_part_of__Objekttyp1Assignment_2
            {
            pushFollow(FOLLOW_rule__Is_part_of__Objekttyp1Assignment_2_in_rule__Is_part_of__Group__2__Impl10321);
            rule__Is_part_of__Objekttyp1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIs_part_ofAccess().getObjekttyp1Assignment_2()); 

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
    // $ANTLR end "rule__Is_part_of__Group__2__Impl"


    // $ANTLR start "rule__Is_part_of__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5110:1: rule__Is_part_of__Group__3 : rule__Is_part_of__Group__3__Impl rule__Is_part_of__Group__4 ;
    public final void rule__Is_part_of__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5114:1: ( rule__Is_part_of__Group__3__Impl rule__Is_part_of__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5115:2: rule__Is_part_of__Group__3__Impl rule__Is_part_of__Group__4
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__3__Impl_in_rule__Is_part_of__Group__310351);
            rule__Is_part_of__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__4_in_rule__Is_part_of__Group__310354);
            rule__Is_part_of__Group__4();

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
    // $ANTLR end "rule__Is_part_of__Group__3"


    // $ANTLR start "rule__Is_part_of__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5122:1: rule__Is_part_of__Group__3__Impl : ( ( rule__Is_part_of__KardinalitaetAssignment_3 ) ) ;
    public final void rule__Is_part_of__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5126:1: ( ( ( rule__Is_part_of__KardinalitaetAssignment_3 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5127:1: ( ( rule__Is_part_of__KardinalitaetAssignment_3 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5127:1: ( ( rule__Is_part_of__KardinalitaetAssignment_3 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5128:1: ( rule__Is_part_of__KardinalitaetAssignment_3 )
            {
             before(grammarAccess.getIs_part_ofAccess().getKardinalitaetAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5129:1: ( rule__Is_part_of__KardinalitaetAssignment_3 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5129:2: rule__Is_part_of__KardinalitaetAssignment_3
            {
            pushFollow(FOLLOW_rule__Is_part_of__KardinalitaetAssignment_3_in_rule__Is_part_of__Group__3__Impl10381);
            rule__Is_part_of__KardinalitaetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIs_part_ofAccess().getKardinalitaetAssignment_3()); 

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
    // $ANTLR end "rule__Is_part_of__Group__3__Impl"


    // $ANTLR start "rule__Is_part_of__Group__4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5139:1: rule__Is_part_of__Group__4 : rule__Is_part_of__Group__4__Impl rule__Is_part_of__Group__5 ;
    public final void rule__Is_part_of__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5143:1: ( rule__Is_part_of__Group__4__Impl rule__Is_part_of__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5144:2: rule__Is_part_of__Group__4__Impl rule__Is_part_of__Group__5
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__4__Impl_in_rule__Is_part_of__Group__410411);
            rule__Is_part_of__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__5_in_rule__Is_part_of__Group__410414);
            rule__Is_part_of__Group__5();

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
    // $ANTLR end "rule__Is_part_of__Group__4"


    // $ANTLR start "rule__Is_part_of__Group__4__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5151:1: rule__Is_part_of__Group__4__Impl : ( ( rule__Is_part_of__Objekttyp2Assignment_4 ) ) ;
    public final void rule__Is_part_of__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5155:1: ( ( ( rule__Is_part_of__Objekttyp2Assignment_4 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5156:1: ( ( rule__Is_part_of__Objekttyp2Assignment_4 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5156:1: ( ( rule__Is_part_of__Objekttyp2Assignment_4 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5157:1: ( rule__Is_part_of__Objekttyp2Assignment_4 )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp2Assignment_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5158:1: ( rule__Is_part_of__Objekttyp2Assignment_4 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5158:2: rule__Is_part_of__Objekttyp2Assignment_4
            {
            pushFollow(FOLLOW_rule__Is_part_of__Objekttyp2Assignment_4_in_rule__Is_part_of__Group__4__Impl10441);
            rule__Is_part_of__Objekttyp2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIs_part_ofAccess().getObjekttyp2Assignment_4()); 

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
    // $ANTLR end "rule__Is_part_of__Group__4__Impl"


    // $ANTLR start "rule__Is_part_of__Group__5"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5168:1: rule__Is_part_of__Group__5 : rule__Is_part_of__Group__5__Impl ;
    public final void rule__Is_part_of__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5172:1: ( rule__Is_part_of__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5173:2: rule__Is_part_of__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__5__Impl_in_rule__Is_part_of__Group__510471);
            rule__Is_part_of__Group__5__Impl();

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
    // $ANTLR end "rule__Is_part_of__Group__5"


    // $ANTLR start "rule__Is_part_of__Group__5__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5179:1: rule__Is_part_of__Group__5__Impl : ( ';' ) ;
    public final void rule__Is_part_of__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5183:1: ( ( ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5184:1: ( ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5184:1: ( ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5185:1: ';'
            {
             before(grammarAccess.getIs_part_ofAccess().getSemicolonKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__Is_part_of__Group__5__Impl10499); 
             after(grammarAccess.getIs_part_ofAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Is_part_of__Group__5__Impl"


    // $ANTLR start "rule__Kardinalitaet01__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5210:1: rule__Kardinalitaet01__Group__0 : rule__Kardinalitaet01__Group__0__Impl rule__Kardinalitaet01__Group__1 ;
    public final void rule__Kardinalitaet01__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5214:1: ( rule__Kardinalitaet01__Group__0__Impl rule__Kardinalitaet01__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5215:2: rule__Kardinalitaet01__Group__0__Impl rule__Kardinalitaet01__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__0__Impl_in_rule__Kardinalitaet01__Group__010542);
            rule__Kardinalitaet01__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__1_in_rule__Kardinalitaet01__Group__010545);
            rule__Kardinalitaet01__Group__1();

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
    // $ANTLR end "rule__Kardinalitaet01__Group__0"


    // $ANTLR start "rule__Kardinalitaet01__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5222:1: rule__Kardinalitaet01__Group__0__Impl : ( ( rule__Kardinalitaet01__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet01__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5226:1: ( ( ( rule__Kardinalitaet01__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5227:1: ( ( rule__Kardinalitaet01__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5227:1: ( ( rule__Kardinalitaet01__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5228:1: ( rule__Kardinalitaet01__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet01Access().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5229:1: ( rule__Kardinalitaet01__Alternatives_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5229:2: rule__Kardinalitaet01__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Alternatives_0_in_rule__Kardinalitaet01__Group__0__Impl10572);
            rule__Kardinalitaet01__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getKardinalitaet01Access().getAlternatives_0()); 

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
    // $ANTLR end "rule__Kardinalitaet01__Group__0__Impl"


    // $ANTLR start "rule__Kardinalitaet01__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5239:1: rule__Kardinalitaet01__Group__1 : rule__Kardinalitaet01__Group__1__Impl ;
    public final void rule__Kardinalitaet01__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5243:1: ( rule__Kardinalitaet01__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5244:2: rule__Kardinalitaet01__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__1__Impl_in_rule__Kardinalitaet01__Group__110602);
            rule__Kardinalitaet01__Group__1__Impl();

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
    // $ANTLR end "rule__Kardinalitaet01__Group__1"


    // $ANTLR start "rule__Kardinalitaet01__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5250:1: rule__Kardinalitaet01__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet01__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5254:1: ( ( () ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5255:1: ( () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5255:1: ( () )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5256:1: ()
            {
             before(grammarAccess.getKardinalitaet01Access().getKardinalitaet01Action_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5257:1: ()
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5259:1: 
            {
            }

             after(grammarAccess.getKardinalitaet01Access().getKardinalitaet01Action_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kardinalitaet01__Group__1__Impl"


    // $ANTLR start "rule__Kardinalitaet0x__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5273:1: rule__Kardinalitaet0x__Group__0 : rule__Kardinalitaet0x__Group__0__Impl rule__Kardinalitaet0x__Group__1 ;
    public final void rule__Kardinalitaet0x__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5277:1: ( rule__Kardinalitaet0x__Group__0__Impl rule__Kardinalitaet0x__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5278:2: rule__Kardinalitaet0x__Group__0__Impl rule__Kardinalitaet0x__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__0__Impl_in_rule__Kardinalitaet0x__Group__010664);
            rule__Kardinalitaet0x__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__1_in_rule__Kardinalitaet0x__Group__010667);
            rule__Kardinalitaet0x__Group__1();

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
    // $ANTLR end "rule__Kardinalitaet0x__Group__0"


    // $ANTLR start "rule__Kardinalitaet0x__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5285:1: rule__Kardinalitaet0x__Group__0__Impl : ( ( rule__Kardinalitaet0x__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet0x__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5289:1: ( ( ( rule__Kardinalitaet0x__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5290:1: ( ( rule__Kardinalitaet0x__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5290:1: ( ( rule__Kardinalitaet0x__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5291:1: ( rule__Kardinalitaet0x__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet0xAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5292:1: ( rule__Kardinalitaet0x__Alternatives_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5292:2: rule__Kardinalitaet0x__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Alternatives_0_in_rule__Kardinalitaet0x__Group__0__Impl10694);
            rule__Kardinalitaet0x__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getKardinalitaet0xAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Kardinalitaet0x__Group__0__Impl"


    // $ANTLR start "rule__Kardinalitaet0x__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5302:1: rule__Kardinalitaet0x__Group__1 : rule__Kardinalitaet0x__Group__1__Impl ;
    public final void rule__Kardinalitaet0x__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5306:1: ( rule__Kardinalitaet0x__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5307:2: rule__Kardinalitaet0x__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__1__Impl_in_rule__Kardinalitaet0x__Group__110724);
            rule__Kardinalitaet0x__Group__1__Impl();

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
    // $ANTLR end "rule__Kardinalitaet0x__Group__1"


    // $ANTLR start "rule__Kardinalitaet0x__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5313:1: rule__Kardinalitaet0x__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet0x__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5317:1: ( ( () ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5318:1: ( () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5318:1: ( () )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5319:1: ()
            {
             before(grammarAccess.getKardinalitaet0xAccess().getKardinalitaet0xAction_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5320:1: ()
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5322:1: 
            {
            }

             after(grammarAccess.getKardinalitaet0xAccess().getKardinalitaet0xAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kardinalitaet0x__Group__1__Impl"


    // $ANTLR start "rule__Kardinalitaet11__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5336:1: rule__Kardinalitaet11__Group__0 : rule__Kardinalitaet11__Group__0__Impl rule__Kardinalitaet11__Group__1 ;
    public final void rule__Kardinalitaet11__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5340:1: ( rule__Kardinalitaet11__Group__0__Impl rule__Kardinalitaet11__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5341:2: rule__Kardinalitaet11__Group__0__Impl rule__Kardinalitaet11__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__0__Impl_in_rule__Kardinalitaet11__Group__010786);
            rule__Kardinalitaet11__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__1_in_rule__Kardinalitaet11__Group__010789);
            rule__Kardinalitaet11__Group__1();

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
    // $ANTLR end "rule__Kardinalitaet11__Group__0"


    // $ANTLR start "rule__Kardinalitaet11__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5348:1: rule__Kardinalitaet11__Group__0__Impl : ( ( rule__Kardinalitaet11__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet11__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5352:1: ( ( ( rule__Kardinalitaet11__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5353:1: ( ( rule__Kardinalitaet11__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5353:1: ( ( rule__Kardinalitaet11__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5354:1: ( rule__Kardinalitaet11__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet11Access().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5355:1: ( rule__Kardinalitaet11__Alternatives_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5355:2: rule__Kardinalitaet11__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Alternatives_0_in_rule__Kardinalitaet11__Group__0__Impl10816);
            rule__Kardinalitaet11__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getKardinalitaet11Access().getAlternatives_0()); 

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
    // $ANTLR end "rule__Kardinalitaet11__Group__0__Impl"


    // $ANTLR start "rule__Kardinalitaet11__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5365:1: rule__Kardinalitaet11__Group__1 : rule__Kardinalitaet11__Group__1__Impl ;
    public final void rule__Kardinalitaet11__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5369:1: ( rule__Kardinalitaet11__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5370:2: rule__Kardinalitaet11__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__1__Impl_in_rule__Kardinalitaet11__Group__110846);
            rule__Kardinalitaet11__Group__1__Impl();

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
    // $ANTLR end "rule__Kardinalitaet11__Group__1"


    // $ANTLR start "rule__Kardinalitaet11__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5376:1: rule__Kardinalitaet11__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet11__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5380:1: ( ( () ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5381:1: ( () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5381:1: ( () )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5382:1: ()
            {
             before(grammarAccess.getKardinalitaet11Access().getKardinalitaet11Action_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5383:1: ()
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5385:1: 
            {
            }

             after(grammarAccess.getKardinalitaet11Access().getKardinalitaet11Action_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kardinalitaet11__Group__1__Impl"


    // $ANTLR start "rule__Kardinalitaet1x__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5399:1: rule__Kardinalitaet1x__Group__0 : rule__Kardinalitaet1x__Group__0__Impl rule__Kardinalitaet1x__Group__1 ;
    public final void rule__Kardinalitaet1x__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5403:1: ( rule__Kardinalitaet1x__Group__0__Impl rule__Kardinalitaet1x__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5404:2: rule__Kardinalitaet1x__Group__0__Impl rule__Kardinalitaet1x__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__0__Impl_in_rule__Kardinalitaet1x__Group__010908);
            rule__Kardinalitaet1x__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__1_in_rule__Kardinalitaet1x__Group__010911);
            rule__Kardinalitaet1x__Group__1();

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
    // $ANTLR end "rule__Kardinalitaet1x__Group__0"


    // $ANTLR start "rule__Kardinalitaet1x__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5411:1: rule__Kardinalitaet1x__Group__0__Impl : ( ( rule__Kardinalitaet1x__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet1x__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5415:1: ( ( ( rule__Kardinalitaet1x__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5416:1: ( ( rule__Kardinalitaet1x__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5416:1: ( ( rule__Kardinalitaet1x__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5417:1: ( rule__Kardinalitaet1x__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet1xAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5418:1: ( rule__Kardinalitaet1x__Alternatives_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5418:2: rule__Kardinalitaet1x__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Alternatives_0_in_rule__Kardinalitaet1x__Group__0__Impl10938);
            rule__Kardinalitaet1x__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getKardinalitaet1xAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Kardinalitaet1x__Group__0__Impl"


    // $ANTLR start "rule__Kardinalitaet1x__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5428:1: rule__Kardinalitaet1x__Group__1 : rule__Kardinalitaet1x__Group__1__Impl ;
    public final void rule__Kardinalitaet1x__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5432:1: ( rule__Kardinalitaet1x__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5433:2: rule__Kardinalitaet1x__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__1__Impl_in_rule__Kardinalitaet1x__Group__110968);
            rule__Kardinalitaet1x__Group__1__Impl();

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
    // $ANTLR end "rule__Kardinalitaet1x__Group__1"


    // $ANTLR start "rule__Kardinalitaet1x__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5439:1: rule__Kardinalitaet1x__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet1x__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5443:1: ( ( () ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5444:1: ( () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5444:1: ( () )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5445:1: ()
            {
             before(grammarAccess.getKardinalitaet1xAccess().getKardinalitaet1xAction_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5446:1: ()
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5448:1: 
            {
            }

             after(grammarAccess.getKardinalitaet1xAccess().getKardinalitaet1xAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kardinalitaet1x__Group__1__Impl"


    // $ANTLR start "rule__Name__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5462:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5466:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5467:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__011030);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Name__Group__1_in_rule__Name__Group__011033);
            rule__Name__Group__1();

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
    // $ANTLR end "rule__Name__Group__0"


    // $ANTLR start "rule__Name__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5474:1: rule__Name__Group__0__Impl : ( '@name' ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5478:1: ( ( '@name' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5479:1: ( '@name' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5479:1: ( '@name' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5480:1: '@name'
            {
             before(grammarAccess.getNameAccess().getNameKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Name__Group__0__Impl11061); 
             after(grammarAccess.getNameAccess().getNameKeyword_0()); 

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
    // $ANTLR end "rule__Name__Group__0__Impl"


    // $ANTLR start "rule__Name__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5493:1: rule__Name__Group__1 : rule__Name__Group__1__Impl ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5497:1: ( rule__Name__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5498:2: rule__Name__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__111092);
            rule__Name__Group__1__Impl();

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
    // $ANTLR end "rule__Name__Group__1"


    // $ANTLR start "rule__Name__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5504:1: rule__Name__Group__1__Impl : ( ( rule__Name__NameAssignment_1 ) ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5508:1: ( ( ( rule__Name__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5509:1: ( ( rule__Name__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5509:1: ( ( rule__Name__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5510:1: ( rule__Name__NameAssignment_1 )
            {
             before(grammarAccess.getNameAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5511:1: ( rule__Name__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5511:2: rule__Name__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Name__NameAssignment_1_in_rule__Name__Group__1__Impl11119);
            rule__Name__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Name__Group__1__Impl"


    // $ANTLR start "rule__Merge__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5525:1: rule__Merge__Group__0 : rule__Merge__Group__0__Impl rule__Merge__Group__1 ;
    public final void rule__Merge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5529:1: ( rule__Merge__Group__0__Impl rule__Merge__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5530:2: rule__Merge__Group__0__Impl rule__Merge__Group__1
            {
            pushFollow(FOLLOW_rule__Merge__Group__0__Impl_in_rule__Merge__Group__011153);
            rule__Merge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Merge__Group__1_in_rule__Merge__Group__011156);
            rule__Merge__Group__1();

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
    // $ANTLR end "rule__Merge__Group__0"


    // $ANTLR start "rule__Merge__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5537:1: rule__Merge__Group__0__Impl : ( '@merge' ) ;
    public final void rule__Merge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5541:1: ( ( '@merge' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5542:1: ( '@merge' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5542:1: ( '@merge' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5543:1: '@merge'
            {
             before(grammarAccess.getMergeAccess().getMergeKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Merge__Group__0__Impl11184); 
             after(grammarAccess.getMergeAccess().getMergeKeyword_0()); 

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
    // $ANTLR end "rule__Merge__Group__0__Impl"


    // $ANTLR start "rule__Merge__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5556:1: rule__Merge__Group__1 : rule__Merge__Group__1__Impl ;
    public final void rule__Merge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5560:1: ( rule__Merge__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5561:2: rule__Merge__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Merge__Group__1__Impl_in_rule__Merge__Group__111215);
            rule__Merge__Group__1__Impl();

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
    // $ANTLR end "rule__Merge__Group__1"


    // $ANTLR start "rule__Merge__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5567:1: rule__Merge__Group__1__Impl : ( ( rule__Merge__NameAssignment_1 ) ) ;
    public final void rule__Merge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5571:1: ( ( ( rule__Merge__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5572:1: ( ( rule__Merge__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5572:1: ( ( rule__Merge__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5573:1: ( rule__Merge__NameAssignment_1 )
            {
             before(grammarAccess.getMergeAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5574:1: ( rule__Merge__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5574:2: rule__Merge__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Merge__NameAssignment_1_in_rule__Merge__Group__1__Impl11242);
            rule__Merge__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMergeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Merge__Group__1__Impl"


    // $ANTLR start "rule__Ignore__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5588:1: rule__Ignore__Group__0 : rule__Ignore__Group__0__Impl rule__Ignore__Group__1 ;
    public final void rule__Ignore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5592:1: ( rule__Ignore__Group__0__Impl rule__Ignore__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5593:2: rule__Ignore__Group__0__Impl rule__Ignore__Group__1
            {
            pushFollow(FOLLOW_rule__Ignore__Group__0__Impl_in_rule__Ignore__Group__011276);
            rule__Ignore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ignore__Group__1_in_rule__Ignore__Group__011279);
            rule__Ignore__Group__1();

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
    // $ANTLR end "rule__Ignore__Group__0"


    // $ANTLR start "rule__Ignore__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5600:1: rule__Ignore__Group__0__Impl : ( '@ignore' ) ;
    public final void rule__Ignore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5604:1: ( ( '@ignore' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5605:1: ( '@ignore' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5605:1: ( '@ignore' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5606:1: '@ignore'
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Ignore__Group__0__Impl11307); 
             after(grammarAccess.getIgnoreAccess().getIgnoreKeyword_0()); 

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
    // $ANTLR end "rule__Ignore__Group__0__Impl"


    // $ANTLR start "rule__Ignore__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5619:1: rule__Ignore__Group__1 : rule__Ignore__Group__1__Impl ;
    public final void rule__Ignore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5623:1: ( rule__Ignore__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5624:2: rule__Ignore__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Ignore__Group__1__Impl_in_rule__Ignore__Group__111338);
            rule__Ignore__Group__1__Impl();

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
    // $ANTLR end "rule__Ignore__Group__1"


    // $ANTLR start "rule__Ignore__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5630:1: rule__Ignore__Group__1__Impl : ( () ) ;
    public final void rule__Ignore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5634:1: ( ( () ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5635:1: ( () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5635:1: ( () )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5636:1: ()
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreAction_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5637:1: ()
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5639:1: 
            {
            }

             after(grammarAccess.getIgnoreAccess().getIgnoreAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignore__Group__1__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5653:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5657:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5658:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__011400);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__011403);
            rule__Version__Group__1();

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
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5665:1: rule__Version__Group__0__Impl : ( '@version' ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5669:1: ( ( '@version' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5670:1: ( '@version' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5670:1: ( '@version' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5671:1: '@version'
            {
             before(grammarAccess.getVersionAccess().getVersionKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Version__Group__0__Impl11431); 
             after(grammarAccess.getVersionAccess().getVersionKeyword_0()); 

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
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5684:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5688:1: ( rule__Version__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5689:2: rule__Version__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__111462);
            rule__Version__Group__1__Impl();

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
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5695:1: rule__Version__Group__1__Impl : ( ( rule__Version__VersionAssignment_1 ) ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5699:1: ( ( ( rule__Version__VersionAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5700:1: ( ( rule__Version__VersionAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5700:1: ( ( rule__Version__VersionAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5701:1: ( rule__Version__VersionAssignment_1 )
            {
             before(grammarAccess.getVersionAccess().getVersionAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5702:1: ( rule__Version__VersionAssignment_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5702:2: rule__Version__VersionAssignment_1
            {
            pushFollow(FOLLOW_rule__Version__VersionAssignment_1_in_rule__Version__Group__1__Impl11489);
            rule__Version__VersionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getVersionAssignment_1()); 

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
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__SOA_AwS__UnorderedGroup_3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5717:1: rule__SOA_AwS__UnorderedGroup_3 : rule__SOA_AwS__UnorderedGroup_3__0 {...}?;
    public final void rule__SOA_AwS__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3());
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5722:1: ( rule__SOA_AwS__UnorderedGroup_3__0 {...}?)
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5723:2: rule__SOA_AwS__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__SOA_AwS__UnorderedGroup_3__0_in_rule__SOA_AwS__UnorderedGroup_311524);
            rule__SOA_AwS__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__SOA_AwS__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SOA_AwS__UnorderedGroup_3"


    // $ANTLR start "rule__SOA_AwS__UnorderedGroup_3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5734:1: rule__SOA_AwS__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__SOA_AwS__VosAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__SOA_AwS__KosAssignment_3_1 ) ) ) ) ) ;
    public final void rule__SOA_AwS__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5739:1: ( ( ({...}? => ( ( ( rule__SOA_AwS__VosAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__SOA_AwS__KosAssignment_3_1 ) ) ) ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5740:3: ( ({...}? => ( ( ( rule__SOA_AwS__VosAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__SOA_AwS__KosAssignment_3_1 ) ) ) ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5740:3: ( ({...}? => ( ( ( rule__SOA_AwS__VosAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__SOA_AwS__KosAssignment_3_1 ) ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 ==RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 1) ) ) {
                int LA47_2 = input.LA(2);

                if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 0) ) {
                    alt47=1;
                }
                else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 1) ) {
                    alt47=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
            }
            else if ( LA47_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 1) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5742:4: ({...}? => ( ( ( rule__SOA_AwS__VosAssignment_3_0 ) ) ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5742:4: ({...}? => ( ( ( rule__SOA_AwS__VosAssignment_3_0 ) ) ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5743:5: {...}? => ( ( ( rule__SOA_AwS__VosAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__SOA_AwS__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5743:104: ( ( ( rule__SOA_AwS__VosAssignment_3_0 ) ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5744:6: ( ( rule__SOA_AwS__VosAssignment_3_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5750:6: ( ( rule__SOA_AwS__VosAssignment_3_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5752:7: ( rule__SOA_AwS__VosAssignment_3_0 )
                    {
                     before(grammarAccess.getSOA_AwSAccess().getVosAssignment_3_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5753:7: ( rule__SOA_AwS__VosAssignment_3_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5753:8: rule__SOA_AwS__VosAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__SOA_AwS__VosAssignment_3_0_in_rule__SOA_AwS__UnorderedGroup_3__Impl11613);
                    rule__SOA_AwS__VosAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSOA_AwSAccess().getVosAssignment_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5759:4: ({...}? => ( ( ( rule__SOA_AwS__KosAssignment_3_1 ) ) ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5759:4: ({...}? => ( ( ( rule__SOA_AwS__KosAssignment_3_1 ) ) ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5760:5: {...}? => ( ( ( rule__SOA_AwS__KosAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__SOA_AwS__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5760:104: ( ( ( rule__SOA_AwS__KosAssignment_3_1 ) ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5761:6: ( ( rule__SOA_AwS__KosAssignment_3_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5767:6: ( ( rule__SOA_AwS__KosAssignment_3_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5769:7: ( rule__SOA_AwS__KosAssignment_3_1 )
                    {
                     before(grammarAccess.getSOA_AwSAccess().getKosAssignment_3_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5770:7: ( rule__SOA_AwS__KosAssignment_3_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5770:8: rule__SOA_AwS__KosAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__SOA_AwS__KosAssignment_3_1_in_rule__SOA_AwS__UnorderedGroup_3__Impl11704);
                    rule__SOA_AwS__KosAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSOA_AwSAccess().getKosAssignment_3_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SOA_AwS__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__SOA_AwS__UnorderedGroup_3__0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5785:1: rule__SOA_AwS__UnorderedGroup_3__0 : rule__SOA_AwS__UnorderedGroup_3__Impl ( rule__SOA_AwS__UnorderedGroup_3__1 )? ;
    public final void rule__SOA_AwS__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5789:1: ( rule__SOA_AwS__UnorderedGroup_3__Impl ( rule__SOA_AwS__UnorderedGroup_3__1 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5790:2: rule__SOA_AwS__UnorderedGroup_3__Impl ( rule__SOA_AwS__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__SOA_AwS__UnorderedGroup_3__Impl_in_rule__SOA_AwS__UnorderedGroup_3__011763);
            rule__SOA_AwS__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5791:2: ( rule__SOA_AwS__UnorderedGroup_3__1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 ==RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 1) ) ) {
                alt48=1;
            }
            else if ( LA48_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 1) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5791:2: rule__SOA_AwS__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__SOA_AwS__UnorderedGroup_3__1_in_rule__SOA_AwS__UnorderedGroup_3__011766);
                    rule__SOA_AwS__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__SOA_AwS__UnorderedGroup_3__0"


    // $ANTLR start "rule__SOA_AwS__UnorderedGroup_3__1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5798:1: rule__SOA_AwS__UnorderedGroup_3__1 : rule__SOA_AwS__UnorderedGroup_3__Impl ;
    public final void rule__SOA_AwS__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5802:1: ( rule__SOA_AwS__UnorderedGroup_3__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5803:2: rule__SOA_AwS__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__SOA_AwS__UnorderedGroup_3__Impl_in_rule__SOA_AwS__UnorderedGroup_3__111791);
            rule__SOA_AwS__UnorderedGroup_3__Impl();

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
    // $ANTLR end "rule__SOA_AwS__UnorderedGroup_3__1"


    // $ANTLR start "rule__SOA_AwS__NameAssignment_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5815:1: rule__SOA_AwS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SOA_AwS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5819:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5820:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5820:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5821:1: RULE_ID
            {
             before(grammarAccess.getSOA_AwSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SOA_AwS__NameAssignment_111824); 
             after(grammarAccess.getSOA_AwSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SOA_AwS__NameAssignment_1"


    // $ANTLR start "rule__SOA_AwS__VersionAssignment_2_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5830:1: rule__SOA_AwS__VersionAssignment_2_1 : ( RULE_VERSION_NUMBER ) ;
    public final void rule__SOA_AwS__VersionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5834:1: ( ( RULE_VERSION_NUMBER ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5835:1: ( RULE_VERSION_NUMBER )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5835:1: ( RULE_VERSION_NUMBER )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5836:1: RULE_VERSION_NUMBER
            {
             before(grammarAccess.getSOA_AwSAccess().getVersionVERSION_NUMBERTerminalRuleCall_2_1_0()); 
            match(input,RULE_VERSION_NUMBER,FOLLOW_RULE_VERSION_NUMBER_in_rule__SOA_AwS__VersionAssignment_2_111855); 
             after(grammarAccess.getSOA_AwSAccess().getVersionVERSION_NUMBERTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__SOA_AwS__VersionAssignment_2_1"


    // $ANTLR start "rule__SOA_AwS__VosAssignment_3_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5845:1: rule__SOA_AwS__VosAssignment_3_0 : ( ruleVOS ) ;
    public final void rule__SOA_AwS__VosAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5849:1: ( ( ruleVOS ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5850:1: ( ruleVOS )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5850:1: ( ruleVOS )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5851:1: ruleVOS
            {
             before(grammarAccess.getSOA_AwSAccess().getVosVOSParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleVOS_in_rule__SOA_AwS__VosAssignment_3_011886);
            ruleVOS();

            state._fsp--;

             after(grammarAccess.getSOA_AwSAccess().getVosVOSParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__SOA_AwS__VosAssignment_3_0"


    // $ANTLR start "rule__SOA_AwS__KosAssignment_3_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5860:1: rule__SOA_AwS__KosAssignment_3_1 : ( ruleKOS ) ;
    public final void rule__SOA_AwS__KosAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5864:1: ( ( ruleKOS ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5865:1: ( ruleKOS )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5865:1: ( ruleKOS )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5866:1: ruleKOS
            {
             before(grammarAccess.getSOA_AwSAccess().getKosKOSParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleKOS_in_rule__SOA_AwS__KosAssignment_3_111917);
            ruleKOS();

            state._fsp--;

             after(grammarAccess.getSOA_AwSAccess().getKosKOSParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__SOA_AwS__KosAssignment_3_1"


    // $ANTLR start "rule__SOA_AwS__VorgangsservicesAssignment_4_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5875:1: rule__SOA_AwS__VorgangsservicesAssignment_4_0 : ( ruleVorgangsservice ) ;
    public final void rule__SOA_AwS__VorgangsservicesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5879:1: ( ( ruleVorgangsservice ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5880:1: ( ruleVorgangsservice )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5880:1: ( ruleVorgangsservice )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5881:1: ruleVorgangsservice
            {
             before(grammarAccess.getSOA_AwSAccess().getVorgangsservicesVorgangsserviceParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleVorgangsservice_in_rule__SOA_AwS__VorgangsservicesAssignment_4_011948);
            ruleVorgangsservice();

            state._fsp--;

             after(grammarAccess.getSOA_AwSAccess().getVorgangsservicesVorgangsserviceParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__SOA_AwS__VorgangsservicesAssignment_4_0"


    // $ANTLR start "rule__SOA_AwS__EntityservicesAssignment_4_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5890:1: rule__SOA_AwS__EntityservicesAssignment_4_1 : ( ruleEntityservice ) ;
    public final void rule__SOA_AwS__EntityservicesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5894:1: ( ( ruleEntityservice ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5895:1: ( ruleEntityservice )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5895:1: ( ruleEntityservice )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5896:1: ruleEntityservice
            {
             before(grammarAccess.getSOA_AwSAccess().getEntityservicesEntityserviceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEntityservice_in_rule__SOA_AwS__EntityservicesAssignment_4_111979);
            ruleEntityservice();

            state._fsp--;

             after(grammarAccess.getSOA_AwSAccess().getEntityservicesEntityserviceParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__SOA_AwS__EntityservicesAssignment_4_1"


    // $ANTLR start "rule__Vorgangsservice__NameAssignment_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5905:1: rule__Vorgangsservice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Vorgangsservice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5909:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5910:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5910:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5911:1: RULE_ID
            {
             before(grammarAccess.getVorgangsserviceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Vorgangsservice__NameAssignment_112010); 
             after(grammarAccess.getVorgangsserviceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Vorgangsservice__NameAssignment_1"


    // $ANTLR start "rule__Vorgangsservice__ChoreographieIFAssignment_3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5920:1: rule__Vorgangsservice__ChoreographieIFAssignment_3 : ( ruleInterface ) ;
    public final void rule__Vorgangsservice__ChoreographieIFAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5924:1: ( ( ruleInterface ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5925:1: ( ruleInterface )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5925:1: ( ruleInterface )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5926:1: ruleInterface
            {
             before(grammarAccess.getVorgangsserviceAccess().getChoreographieIFInterfaceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__Vorgangsservice__ChoreographieIFAssignment_312041);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getVorgangsserviceAccess().getChoreographieIFInterfaceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Vorgangsservice__ChoreographieIFAssignment_3"


    // $ANTLR start "rule__Vorgangsservice__VorgangsservicesElementarAssignment_4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5935:1: rule__Vorgangsservice__VorgangsservicesElementarAssignment_4 : ( ruleVorgangsserviceElementar ) ;
    public final void rule__Vorgangsservice__VorgangsservicesElementarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5939:1: ( ( ruleVorgangsserviceElementar ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5940:1: ( ruleVorgangsserviceElementar )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5940:1: ( ruleVorgangsserviceElementar )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5941:1: ruleVorgangsserviceElementar
            {
             before(grammarAccess.getVorgangsserviceAccess().getVorgangsservicesElementarVorgangsserviceElementarParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleVorgangsserviceElementar_in_rule__Vorgangsservice__VorgangsservicesElementarAssignment_412072);
            ruleVorgangsserviceElementar();

            state._fsp--;

             after(grammarAccess.getVorgangsserviceAccess().getVorgangsservicesElementarVorgangsserviceElementarParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Vorgangsservice__VorgangsservicesElementarAssignment_4"


    // $ANTLR start "rule__Vorgangsservice__WorkflowAssignment_5"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5950:1: rule__Vorgangsservice__WorkflowAssignment_5 : ( ruleWorkflow ) ;
    public final void rule__Vorgangsservice__WorkflowAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5954:1: ( ( ruleWorkflow ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5955:1: ( ruleWorkflow )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5955:1: ( ruleWorkflow )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5956:1: ruleWorkflow
            {
             before(grammarAccess.getVorgangsserviceAccess().getWorkflowWorkflowParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleWorkflow_in_rule__Vorgangsservice__WorkflowAssignment_512103);
            ruleWorkflow();

            state._fsp--;

             after(grammarAccess.getVorgangsserviceAccess().getWorkflowWorkflowParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Vorgangsservice__WorkflowAssignment_5"


    // $ANTLR start "rule__VorgangsserviceElementar__NameAssignment_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5965:1: rule__VorgangsserviceElementar__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VorgangsserviceElementar__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5969:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5970:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5970:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5971:1: RULE_ID
            {
             before(grammarAccess.getVorgangsserviceElementarAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VorgangsserviceElementar__NameAssignment_012134); 
             after(grammarAccess.getVorgangsserviceElementarAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__VorgangsserviceElementar__NameAssignment_0"


    // $ANTLR start "rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5980:1: rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5984:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5985:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5985:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5986:1: ( RULE_ID )
            {
             before(grammarAccess.getVorgangsserviceElementarAccess().getKomponentenObjekttypVOTCrossReference_2_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5987:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5988:1: RULE_ID
            {
             before(grammarAccess.getVorgangsserviceElementarAccess().getKomponentenObjekttypVOTIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_212169); 
             after(grammarAccess.getVorgangsserviceElementarAccess().getKomponentenObjekttypVOTIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getVorgangsserviceElementarAccess().getKomponentenObjekttypVOTCrossReference_2_0()); 

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
    // $ANTLR end "rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_2"


    // $ANTLR start "rule__VorgangsserviceElementar__InterfaceAssignment_3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:5999:1: rule__VorgangsserviceElementar__InterfaceAssignment_3 : ( ruleInterface ) ;
    public final void rule__VorgangsserviceElementar__InterfaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6003:1: ( ( ruleInterface ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6004:1: ( ruleInterface )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6004:1: ( ruleInterface )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6005:1: ruleInterface
            {
             before(grammarAccess.getVorgangsserviceElementarAccess().getInterfaceInterfaceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__VorgangsserviceElementar__InterfaceAssignment_312204);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getVorgangsserviceElementarAccess().getInterfaceInterfaceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__VorgangsserviceElementar__InterfaceAssignment_3"


    // $ANTLR start "rule__Interface__NameAssignment_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6014:1: rule__Interface__NameAssignment_0 : ( ( 'Interface' ) ) ;
    public final void rule__Interface__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6018:1: ( ( ( 'Interface' ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6019:1: ( ( 'Interface' ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6019:1: ( ( 'Interface' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6020:1: ( 'Interface' )
            {
             before(grammarAccess.getInterfaceAccess().getNameInterfaceKeyword_0_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6021:1: ( 'Interface' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6022:1: 'Interface'
            {
             before(grammarAccess.getInterfaceAccess().getNameInterfaceKeyword_0_0()); 
            match(input,44,FOLLOW_44_in_rule__Interface__NameAssignment_012240); 
             after(grammarAccess.getInterfaceAccess().getNameInterfaceKeyword_0_0()); 

            }

             after(grammarAccess.getInterfaceAccess().getNameInterfaceKeyword_0_0()); 

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
    // $ANTLR end "rule__Interface__NameAssignment_0"


    // $ANTLR start "rule__Interface__MethodenAssignment_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6037:1: rule__Interface__MethodenAssignment_2 : ( ruleServiceMethode ) ;
    public final void rule__Interface__MethodenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6041:1: ( ( ruleServiceMethode ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6042:1: ( ruleServiceMethode )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6042:1: ( ruleServiceMethode )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6043:1: ruleServiceMethode
            {
             before(grammarAccess.getInterfaceAccess().getMethodenServiceMethodeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleServiceMethode_in_rule__Interface__MethodenAssignment_212279);
            ruleServiceMethode();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getMethodenServiceMethodeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Interface__MethodenAssignment_2"


    // $ANTLR start "rule__ServiceMethode__NameAssignment_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6052:1: rule__ServiceMethode__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ServiceMethode__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6056:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6057:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6057:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6058:1: RULE_ID
            {
             before(grammarAccess.getServiceMethodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceMethode__NameAssignment_012310); 
             after(grammarAccess.getServiceMethodeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ServiceMethode__NameAssignment_0"


    // $ANTLR start "rule__ServiceMethode__ParameterAssignment_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6067:1: rule__ServiceMethode__ParameterAssignment_2 : ( RULE_ID ) ;
    public final void rule__ServiceMethode__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6071:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6072:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6072:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6073:1: RULE_ID
            {
             before(grammarAccess.getServiceMethodeAccess().getParameterIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceMethode__ParameterAssignment_212341); 
             after(grammarAccess.getServiceMethodeAccess().getParameterIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ServiceMethode__ParameterAssignment_2"


    // $ANTLR start "rule__Workflow__OrchestrierungAssignment_2_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6082:1: rule__Workflow__OrchestrierungAssignment_2_0 : ( ruleOrchestrierung ) ;
    public final void rule__Workflow__OrchestrierungAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6086:1: ( ( ruleOrchestrierung ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6087:1: ( ruleOrchestrierung )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6087:1: ( ruleOrchestrierung )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6088:1: ruleOrchestrierung
            {
             before(grammarAccess.getWorkflowAccess().getOrchestrierungOrchestrierungParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleOrchestrierung_in_rule__Workflow__OrchestrierungAssignment_2_012372);
            ruleOrchestrierung();

            state._fsp--;

             after(grammarAccess.getWorkflowAccess().getOrchestrierungOrchestrierungParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Workflow__OrchestrierungAssignment_2_0"


    // $ANTLR start "rule__Workflow__ChoreographieAssignment_2_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6097:1: rule__Workflow__ChoreographieAssignment_2_1 : ( ruleChoreographieLokal ) ;
    public final void rule__Workflow__ChoreographieAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6101:1: ( ( ruleChoreographieLokal ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6102:1: ( ruleChoreographieLokal )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6102:1: ( ruleChoreographieLokal )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6103:1: ruleChoreographieLokal
            {
             before(grammarAccess.getWorkflowAccess().getChoreographieChoreographieLokalParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleChoreographieLokal_in_rule__Workflow__ChoreographieAssignment_2_112403);
            ruleChoreographieLokal();

            state._fsp--;

             after(grammarAccess.getWorkflowAccess().getChoreographieChoreographieLokalParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Workflow__ChoreographieAssignment_2_1"


    // $ANTLR start "rule__Orchestrierung__BedingungAssignment_0_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6112:1: rule__Orchestrierung__BedingungAssignment_0_1 : ( ruleBedingung ) ;
    public final void rule__Orchestrierung__BedingungAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6116:1: ( ( ruleBedingung ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6117:1: ( ruleBedingung )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6117:1: ( ruleBedingung )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6118:1: ruleBedingung
            {
             before(grammarAccess.getOrchestrierungAccess().getBedingungBedingungParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleBedingung_in_rule__Orchestrierung__BedingungAssignment_0_112434);
            ruleBedingung();

            state._fsp--;

             after(grammarAccess.getOrchestrierungAccess().getBedingungBedingungParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Orchestrierung__BedingungAssignment_0_1"


    // $ANTLR start "rule__Orchestrierung__Methode1Assignment_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6127:1: rule__Orchestrierung__Methode1Assignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Orchestrierung__Methode1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6131:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6132:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6132:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6133:1: ( RULE_ID )
            {
             before(grammarAccess.getOrchestrierungAccess().getMethode1ServiceMethodeCrossReference_1_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6134:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6135:1: RULE_ID
            {
             before(grammarAccess.getOrchestrierungAccess().getMethode1ServiceMethodeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Orchestrierung__Methode1Assignment_112469); 
             after(grammarAccess.getOrchestrierungAccess().getMethode1ServiceMethodeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOrchestrierungAccess().getMethode1ServiceMethodeCrossReference_1_0()); 

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
    // $ANTLR end "rule__Orchestrierung__Methode1Assignment_1"


    // $ANTLR start "rule__Orchestrierung__Methode2Assignment_3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6146:1: rule__Orchestrierung__Methode2Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Orchestrierung__Methode2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6150:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6151:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6151:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6152:1: ( RULE_ID )
            {
             before(grammarAccess.getOrchestrierungAccess().getMethode2ServiceMethodeCrossReference_3_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6153:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6154:1: RULE_ID
            {
             before(grammarAccess.getOrchestrierungAccess().getMethode2ServiceMethodeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Orchestrierung__Methode2Assignment_312508); 
             after(grammarAccess.getOrchestrierungAccess().getMethode2ServiceMethodeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getOrchestrierungAccess().getMethode2ServiceMethodeCrossReference_3_0()); 

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
    // $ANTLR end "rule__Orchestrierung__Methode2Assignment_3"


    // $ANTLR start "rule__ChoreographieLokal__BedingungAssignment_0_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6165:1: rule__ChoreographieLokal__BedingungAssignment_0_1 : ( ruleBedingung ) ;
    public final void rule__ChoreographieLokal__BedingungAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6169:1: ( ( ruleBedingung ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6170:1: ( ruleBedingung )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6170:1: ( ruleBedingung )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6171:1: ruleBedingung
            {
             before(grammarAccess.getChoreographieLokalAccess().getBedingungBedingungParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleBedingung_in_rule__ChoreographieLokal__BedingungAssignment_0_112543);
            ruleBedingung();

            state._fsp--;

             after(grammarAccess.getChoreographieLokalAccess().getBedingungBedingungParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__ChoreographieLokal__BedingungAssignment_0_1"


    // $ANTLR start "rule__ChoreographieLokal__Methode1Assignment_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6180:1: rule__ChoreographieLokal__Methode1Assignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ChoreographieLokal__Methode1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6184:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6185:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6185:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6186:1: ( RULE_ID )
            {
             before(grammarAccess.getChoreographieLokalAccess().getMethode1ServiceMethodeCrossReference_1_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6187:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6188:1: RULE_ID
            {
             before(grammarAccess.getChoreographieLokalAccess().getMethode1ServiceMethodeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ChoreographieLokal__Methode1Assignment_112578); 
             after(grammarAccess.getChoreographieLokalAccess().getMethode1ServiceMethodeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getChoreographieLokalAccess().getMethode1ServiceMethodeCrossReference_1_0()); 

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
    // $ANTLR end "rule__ChoreographieLokal__Methode1Assignment_1"


    // $ANTLR start "rule__ChoreographieLokal__Service2Assignment_3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6199:1: rule__ChoreographieLokal__Service2Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ChoreographieLokal__Service2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6203:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6204:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6204:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6205:1: ( RULE_ID )
            {
             before(grammarAccess.getChoreographieLokalAccess().getService2ServiceCrossReference_3_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6206:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6207:1: RULE_ID
            {
             before(grammarAccess.getChoreographieLokalAccess().getService2ServiceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ChoreographieLokal__Service2Assignment_312617); 
             after(grammarAccess.getChoreographieLokalAccess().getService2ServiceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getChoreographieLokalAccess().getService2ServiceCrossReference_3_0()); 

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
    // $ANTLR end "rule__ChoreographieLokal__Service2Assignment_3"


    // $ANTLR start "rule__ChoreographieLokal__Methode2Assignment_5"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6218:1: rule__ChoreographieLokal__Methode2Assignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ChoreographieLokal__Methode2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6222:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6223:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6223:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6224:1: ( RULE_ID )
            {
             before(grammarAccess.getChoreographieLokalAccess().getMethode2ServiceMethodeCrossReference_5_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6225:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6226:1: RULE_ID
            {
             before(grammarAccess.getChoreographieLokalAccess().getMethode2ServiceMethodeIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ChoreographieLokal__Methode2Assignment_512656); 
             after(grammarAccess.getChoreographieLokalAccess().getMethode2ServiceMethodeIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getChoreographieLokalAccess().getMethode2ServiceMethodeCrossReference_5_0()); 

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
    // $ANTLR end "rule__ChoreographieLokal__Methode2Assignment_5"


    // $ANTLR start "rule__Bedingung__BedingungAssignment"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6237:1: rule__Bedingung__BedingungAssignment : ( RULE_ID ) ;
    public final void rule__Bedingung__BedingungAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6241:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6242:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6242:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6243:1: RULE_ID
            {
             before(grammarAccess.getBedingungAccess().getBedingungIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bedingung__BedingungAssignment12691); 
             after(grammarAccess.getBedingungAccess().getBedingungIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Bedingung__BedingungAssignment"


    // $ANTLR start "rule__Entityservice__NameAssignment_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6252:1: rule__Entityservice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entityservice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6256:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6257:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6257:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6258:1: RULE_ID
            {
             before(grammarAccess.getEntityserviceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entityservice__NameAssignment_112722); 
             after(grammarAccess.getEntityserviceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entityservice__NameAssignment_1"


    // $ANTLR start "rule__Entityservice__InterfaceAssignment_3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6267:1: rule__Entityservice__InterfaceAssignment_3 : ( ruleInterface ) ;
    public final void rule__Entityservice__InterfaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6271:1: ( ( ruleInterface ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6272:1: ( ruleInterface )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6272:1: ( ruleInterface )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6273:1: ruleInterface
            {
             before(grammarAccess.getEntityserviceAccess().getInterfaceInterfaceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__Entityservice__InterfaceAssignment_312753);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getEntityserviceAccess().getInterfaceInterfaceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entityservice__InterfaceAssignment_3"


    // $ANTLR start "rule__Entityservice__EntitiesAssignment_4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6282:1: rule__Entityservice__EntitiesAssignment_4 : ( ruleEntity ) ;
    public final void rule__Entityservice__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6286:1: ( ( ruleEntity ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6287:1: ( ruleEntity )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6287:1: ( ruleEntity )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6288:1: ruleEntity
            {
             before(grammarAccess.getEntityserviceAccess().getEntitiesEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Entityservice__EntitiesAssignment_412784);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityserviceAccess().getEntitiesEntityParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Entityservice__EntitiesAssignment_4"


    // $ANTLR start "rule__Entity__NameAssignment_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6297:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6301:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6302:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6302:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6303:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_012815); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_0"


    // $ANTLR start "rule__Entity__KomponentenObjekttypAssignment_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6312:1: rule__Entity__KomponentenObjekttypAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__KomponentenObjekttypAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6316:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6317:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6317:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6318:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getKomponentenObjekttypKOTCrossReference_2_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6319:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6320:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getKomponentenObjekttypKOTIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__KomponentenObjekttypAssignment_212850); 
             after(grammarAccess.getEntityAccess().getKomponentenObjekttypKOTIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getKomponentenObjekttypKOTCrossReference_2_0()); 

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
    // $ANTLR end "rule__Entity__KomponentenObjekttypAssignment_2"


    // $ANTLR start "rule__Entity__InterfaceAssignment_3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6331:1: rule__Entity__InterfaceAssignment_3 : ( ruleInterface ) ;
    public final void rule__Entity__InterfaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6335:1: ( ( ruleInterface ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6336:1: ( ruleInterface )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6336:1: ( ruleInterface )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6337:1: ruleInterface
            {
             before(grammarAccess.getEntityAccess().getInterfaceInterfaceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__Entity__InterfaceAssignment_312885);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getInterfaceInterfaceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entity__InterfaceAssignment_3"


    // $ANTLR start "rule__VOS__NameAssignment_0_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6350:1: rule__VOS__NameAssignment_0_0 : ( ( 'VOS' ) ) ;
    public final void rule__VOS__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6354:1: ( ( ( 'VOS' ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6355:1: ( ( 'VOS' ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6355:1: ( ( 'VOS' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6356:1: ( 'VOS' )
            {
             before(grammarAccess.getVOSAccess().getNameVOSKeyword_0_0_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6357:1: ( 'VOS' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6358:1: 'VOS'
            {
             before(grammarAccess.getVOSAccess().getNameVOSKeyword_0_0_0()); 
            match(input,45,FOLLOW_45_in_rule__VOS__NameAssignment_0_012925); 
             after(grammarAccess.getVOSAccess().getNameVOSKeyword_0_0_0()); 

            }

             after(grammarAccess.getVOSAccess().getNameVOSKeyword_0_0_0()); 

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
    // $ANTLR end "rule__VOS__NameAssignment_0_0"


    // $ANTLR start "rule__VOS__NameAssignment_0_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6373:1: rule__VOS__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__VOS__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6377:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6378:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6378:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6379:1: RULE_ID
            {
             before(grammarAccess.getVOSAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VOS__NameAssignment_0_112964); 
             after(grammarAccess.getVOSAccess().getNameIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__VOS__NameAssignment_0_1"


    // $ANTLR start "rule__VOS__ObjekttypenAssignment_2_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6388:1: rule__VOS__ObjekttypenAssignment_2_0 : ( ruleVOT ) ;
    public final void rule__VOS__ObjekttypenAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6392:1: ( ( ruleVOT ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6393:1: ( ruleVOT )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6393:1: ( ruleVOT )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6394:1: ruleVOT
            {
             before(grammarAccess.getVOSAccess().getObjekttypenVOTParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleVOT_in_rule__VOS__ObjekttypenAssignment_2_012995);
            ruleVOT();

            state._fsp--;

             after(grammarAccess.getVOSAccess().getObjekttypenVOTParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__VOS__ObjekttypenAssignment_2_0"


    // $ANTLR start "rule__VOS__BeziehungenAssignment_2_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6403:1: rule__VOS__BeziehungenAssignment_2_1 : ( ruleInteracts_with ) ;
    public final void rule__VOS__BeziehungenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6407:1: ( ( ruleInteracts_with ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6408:1: ( ruleInteracts_with )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6408:1: ( ruleInteracts_with )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6409:1: ruleInteracts_with
            {
             before(grammarAccess.getVOSAccess().getBeziehungenInteracts_withParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleInteracts_with_in_rule__VOS__BeziehungenAssignment_2_113026);
            ruleInteracts_with();

            state._fsp--;

             after(grammarAccess.getVOSAccess().getBeziehungenInteracts_withParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__VOS__BeziehungenAssignment_2_1"


    // $ANTLR start "rule__VOS__GliederungAssignment_2_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6418:1: rule__VOS__GliederungAssignment_2_2 : ( ruleVOS ) ;
    public final void rule__VOS__GliederungAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6422:1: ( ( ruleVOS ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6423:1: ( ruleVOS )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6423:1: ( ruleVOS )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6424:1: ruleVOS
            {
             before(grammarAccess.getVOSAccess().getGliederungVOSParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleVOS_in_rule__VOS__GliederungAssignment_2_213057);
            ruleVOS();

            state._fsp--;

             after(grammarAccess.getVOSAccess().getGliederungVOSParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__VOS__GliederungAssignment_2_2"


    // $ANTLR start "rule__KOS__NameAssignment_0_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6433:1: rule__KOS__NameAssignment_0_0 : ( ( 'KOS' ) ) ;
    public final void rule__KOS__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6437:1: ( ( ( 'KOS' ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6438:1: ( ( 'KOS' ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6438:1: ( ( 'KOS' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6439:1: ( 'KOS' )
            {
             before(grammarAccess.getKOSAccess().getNameKOSKeyword_0_0_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6440:1: ( 'KOS' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6441:1: 'KOS'
            {
             before(grammarAccess.getKOSAccess().getNameKOSKeyword_0_0_0()); 
            match(input,46,FOLLOW_46_in_rule__KOS__NameAssignment_0_013093); 
             after(grammarAccess.getKOSAccess().getNameKOSKeyword_0_0_0()); 

            }

             after(grammarAccess.getKOSAccess().getNameKOSKeyword_0_0_0()); 

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
    // $ANTLR end "rule__KOS__NameAssignment_0_0"


    // $ANTLR start "rule__KOS__NameAssignment_0_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6456:1: rule__KOS__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__KOS__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6460:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6461:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6461:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6462:1: RULE_ID
            {
             before(grammarAccess.getKOSAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KOS__NameAssignment_0_113132); 
             after(grammarAccess.getKOSAccess().getNameIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__KOS__NameAssignment_0_1"


    // $ANTLR start "rule__KOS__ObjekttypenAssignment_2_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6471:1: rule__KOS__ObjekttypenAssignment_2_0 : ( ruleKOT ) ;
    public final void rule__KOS__ObjekttypenAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6475:1: ( ( ruleKOT ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6476:1: ( ruleKOT )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6476:1: ( ruleKOT )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6477:1: ruleKOT
            {
             before(grammarAccess.getKOSAccess().getObjekttypenKOTParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleKOT_in_rule__KOS__ObjekttypenAssignment_2_013163);
            ruleKOT();

            state._fsp--;

             after(grammarAccess.getKOSAccess().getObjekttypenKOTParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__KOS__ObjekttypenAssignment_2_0"


    // $ANTLR start "rule__KOS__BeziehungenAssignment_2_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6486:1: rule__KOS__BeziehungenAssignment_2_1 : ( ruleBeziehung ) ;
    public final void rule__KOS__BeziehungenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6490:1: ( ( ruleBeziehung ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6491:1: ( ruleBeziehung )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6491:1: ( ruleBeziehung )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6492:1: ruleBeziehung
            {
             before(grammarAccess.getKOSAccess().getBeziehungenBeziehungParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBeziehung_in_rule__KOS__BeziehungenAssignment_2_113194);
            ruleBeziehung();

            state._fsp--;

             after(grammarAccess.getKOSAccess().getBeziehungenBeziehungParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__KOS__BeziehungenAssignment_2_1"


    // $ANTLR start "rule__KOS__GliederungAssignment_2_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6501:1: rule__KOS__GliederungAssignment_2_2 : ( ruleKOS ) ;
    public final void rule__KOS__GliederungAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6505:1: ( ( ruleKOS ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6506:1: ( ruleKOS )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6506:1: ( ruleKOS )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6507:1: ruleKOS
            {
             before(grammarAccess.getKOSAccess().getGliederungKOSParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleKOS_in_rule__KOS__GliederungAssignment_2_213225);
            ruleKOS();

            state._fsp--;

             after(grammarAccess.getKOSAccess().getGliederungKOSParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__KOS__GliederungAssignment_2_2"


    // $ANTLR start "rule__VOT__AnnotationAssignment_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6516:1: rule__VOT__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__VOT__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6520:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6521:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6521:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6522:1: ruleAnnotation
            {
             before(grammarAccess.getVOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__VOT__AnnotationAssignment_013256);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getVOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__VOT__AnnotationAssignment_0"


    // $ANTLR start "rule__VOT__NameAssignment_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6531:1: rule__VOT__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VOT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6535:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6536:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6536:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6537:1: RULE_ID
            {
             before(grammarAccess.getVOTAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VOT__NameAssignment_213287); 
             after(grammarAccess.getVOTAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__VOT__NameAssignment_2"


    // $ANTLR start "rule__VOT__AttributeAssignment_4_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6546:1: rule__VOT__AttributeAssignment_4_0 : ( ruleAttribut ) ;
    public final void rule__VOT__AttributeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6550:1: ( ( ruleAttribut ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6551:1: ( ruleAttribut )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6551:1: ( ruleAttribut )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6552:1: ruleAttribut
            {
             before(grammarAccess.getVOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleAttribut_in_rule__VOT__AttributeAssignment_4_013318);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getVOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__VOT__AttributeAssignment_4_0"


    // $ANTLR start "rule__VOT__OperatorenAssignment_4_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6561:1: rule__VOT__OperatorenAssignment_4_1 : ( ruleOperator ) ;
    public final void rule__VOT__OperatorenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6565:1: ( ( ruleOperator ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6566:1: ( ruleOperator )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6566:1: ( ruleOperator )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6567:1: ruleOperator
            {
             before(grammarAccess.getVOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__VOT__OperatorenAssignment_4_113349);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getVOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__VOT__OperatorenAssignment_4_1"


    // $ANTLR start "rule__OOT__AnnotationAssignment_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6576:1: rule__OOT__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__OOT__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6580:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6581:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6581:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6582:1: ruleAnnotation
            {
             before(grammarAccess.getOOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__OOT__AnnotationAssignment_013380);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getOOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__OOT__AnnotationAssignment_0"


    // $ANTLR start "rule__OOT__NameAssignment_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6591:1: rule__OOT__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OOT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6595:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6596:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6596:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6597:1: RULE_ID
            {
             before(grammarAccess.getOOTAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OOT__NameAssignment_213411); 
             after(grammarAccess.getOOTAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__OOT__NameAssignment_2"


    // $ANTLR start "rule__OOT__AttributeAssignment_4_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6606:1: rule__OOT__AttributeAssignment_4_0 : ( ruleAttribut ) ;
    public final void rule__OOT__AttributeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6610:1: ( ( ruleAttribut ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6611:1: ( ruleAttribut )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6611:1: ( ruleAttribut )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6612:1: ruleAttribut
            {
             before(grammarAccess.getOOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleAttribut_in_rule__OOT__AttributeAssignment_4_013442);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getOOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__OOT__AttributeAssignment_4_0"


    // $ANTLR start "rule__OOT__OperatorenAssignment_4_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6621:1: rule__OOT__OperatorenAssignment_4_1 : ( ruleOperator ) ;
    public final void rule__OOT__OperatorenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6625:1: ( ( ruleOperator ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6626:1: ( ruleOperator )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6626:1: ( ruleOperator )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6627:1: ruleOperator
            {
             before(grammarAccess.getOOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__OOT__OperatorenAssignment_4_113473);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__OOT__OperatorenAssignment_4_1"


    // $ANTLR start "rule__LOT__AnnotationAssignment_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6636:1: rule__LOT__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__LOT__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6640:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6641:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6641:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6642:1: ruleAnnotation
            {
             before(grammarAccess.getLOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__LOT__AnnotationAssignment_013504);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getLOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LOT__AnnotationAssignment_0"


    // $ANTLR start "rule__LOT__NameAssignment_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6651:1: rule__LOT__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LOT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6655:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6656:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6656:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6657:1: RULE_ID
            {
             before(grammarAccess.getLOTAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LOT__NameAssignment_213535); 
             after(grammarAccess.getLOTAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__LOT__NameAssignment_2"


    // $ANTLR start "rule__LOT__AttributeAssignment_4_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6666:1: rule__LOT__AttributeAssignment_4_0 : ( ruleAttribut ) ;
    public final void rule__LOT__AttributeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6670:1: ( ( ruleAttribut ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6671:1: ( ruleAttribut )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6671:1: ( ruleAttribut )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6672:1: ruleAttribut
            {
             before(grammarAccess.getLOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleAttribut_in_rule__LOT__AttributeAssignment_4_013566);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getLOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__LOT__AttributeAssignment_4_0"


    // $ANTLR start "rule__LOT__OperatorenAssignment_4_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6681:1: rule__LOT__OperatorenAssignment_4_1 : ( ruleOperator ) ;
    public final void rule__LOT__OperatorenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6685:1: ( ( ruleOperator ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6686:1: ( ruleOperator )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6686:1: ( ruleOperator )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6687:1: ruleOperator
            {
             before(grammarAccess.getLOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__LOT__OperatorenAssignment_4_113597);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getLOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__LOT__OperatorenAssignment_4_1"


    // $ANTLR start "rule__TOT__AnnotationAssignment_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6696:1: rule__TOT__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__TOT__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6700:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6701:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6701:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6702:1: ruleAnnotation
            {
             before(grammarAccess.getTOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__TOT__AnnotationAssignment_013628);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getTOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TOT__AnnotationAssignment_0"


    // $ANTLR start "rule__TOT__NameAssignment_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6711:1: rule__TOT__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TOT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6715:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6716:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6716:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6717:1: RULE_ID
            {
             before(grammarAccess.getTOTAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TOT__NameAssignment_213659); 
             after(grammarAccess.getTOTAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TOT__NameAssignment_2"


    // $ANTLR start "rule__TOT__AttributeAssignment_4_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6726:1: rule__TOT__AttributeAssignment_4_0 : ( ruleAttribut ) ;
    public final void rule__TOT__AttributeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6730:1: ( ( ruleAttribut ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6731:1: ( ruleAttribut )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6731:1: ( ruleAttribut )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6732:1: ruleAttribut
            {
             before(grammarAccess.getTOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleAttribut_in_rule__TOT__AttributeAssignment_4_013690);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getTOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__TOT__AttributeAssignment_4_0"


    // $ANTLR start "rule__TOT__OperatorenAssignment_4_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6741:1: rule__TOT__OperatorenAssignment_4_1 : ( ruleOperator ) ;
    public final void rule__TOT__OperatorenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6745:1: ( ( ruleOperator ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6746:1: ( ruleOperator )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6746:1: ( ruleOperator )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6747:1: ruleOperator
            {
             before(grammarAccess.getTOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__TOT__OperatorenAssignment_4_113721);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getTOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__TOT__OperatorenAssignment_4_1"


    // $ANTLR start "rule__Attribut__TypAssignment_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6756:1: rule__Attribut__TypAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribut__TypAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6760:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6761:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6761:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6762:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributAccess().getTypObjekttypCrossReference_0_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6763:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6764:1: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getTypObjekttypIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribut__TypAssignment_013756); 
             after(grammarAccess.getAttributAccess().getTypObjekttypIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributAccess().getTypObjekttypCrossReference_0_0()); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6775:1: rule__Attribut__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6779:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6780:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6780:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6781:1: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribut__NameAssignment_113791); 
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


    // $ANTLR start "rule__Operator__NameAssignment_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6790:1: rule__Operator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Operator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6794:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6795:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6795:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6796:1: RULE_ID
            {
             before(grammarAccess.getOperatorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operator__NameAssignment_013822); 
             after(grammarAccess.getOperatorAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Operator__NameAssignment_0"


    // $ANTLR start "rule__Operator__ParameterAssignment_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6805:1: rule__Operator__ParameterAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Operator__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6809:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6810:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6810:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6811:1: ( RULE_ID )
            {
             before(grammarAccess.getOperatorAccess().getParameterObjekttypCrossReference_2_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6812:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6813:1: RULE_ID
            {
             before(grammarAccess.getOperatorAccess().getParameterObjekttypIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operator__ParameterAssignment_213857); 
             after(grammarAccess.getOperatorAccess().getParameterObjekttypIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getOperatorAccess().getParameterObjekttypCrossReference_2_0()); 

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
    // $ANTLR end "rule__Operator__ParameterAssignment_2"


    // $ANTLR start "rule__Interacts_with__AnnotationAssignment_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6824:1: rule__Interacts_with__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Interacts_with__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6828:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6829:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6829:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6830:1: ruleAnnotation
            {
             before(grammarAccess.getInteracts_withAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Interacts_with__AnnotationAssignment_013892);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getInteracts_withAccess().getAnnotationAnnotationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Interacts_with__AnnotationAssignment_0"


    // $ANTLR start "rule__Interacts_with__Objekttyp1Assignment_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6839:1: rule__Interacts_with__Objekttyp1Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Interacts_with__Objekttyp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6843:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6844:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6844:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6845:1: ( RULE_ID )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6846:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6847:1: RULE_ID
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp1Assignment_213927); 
             after(grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 

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
    // $ANTLR end "rule__Interacts_with__Objekttyp1Assignment_2"


    // $ANTLR start "rule__Interacts_with__KardinalitaetAssignment_3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6858:1: rule__Interacts_with__KardinalitaetAssignment_3 : ( ( rule__Interacts_with__KardinalitaetAlternatives_3_0 ) ) ;
    public final void rule__Interacts_with__KardinalitaetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6862:1: ( ( ( rule__Interacts_with__KardinalitaetAlternatives_3_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6863:1: ( ( rule__Interacts_with__KardinalitaetAlternatives_3_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6863:1: ( ( rule__Interacts_with__KardinalitaetAlternatives_3_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6864:1: ( rule__Interacts_with__KardinalitaetAlternatives_3_0 )
            {
             before(grammarAccess.getInteracts_withAccess().getKardinalitaetAlternatives_3_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6865:1: ( rule__Interacts_with__KardinalitaetAlternatives_3_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6865:2: rule__Interacts_with__KardinalitaetAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Interacts_with__KardinalitaetAlternatives_3_0_in_rule__Interacts_with__KardinalitaetAssignment_313962);
            rule__Interacts_with__KardinalitaetAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getInteracts_withAccess().getKardinalitaetAlternatives_3_0()); 

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
    // $ANTLR end "rule__Interacts_with__KardinalitaetAssignment_3"


    // $ANTLR start "rule__Interacts_with__Objekttyp2Assignment_4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6874:1: rule__Interacts_with__Objekttyp2Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Interacts_with__Objekttyp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6878:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6879:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6879:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6880:1: ( RULE_ID )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6881:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6882:1: RULE_ID
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp2Assignment_413999); 
             after(grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 

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
    // $ANTLR end "rule__Interacts_with__Objekttyp2Assignment_4"


    // $ANTLR start "rule__Is_a__AnnotationAssignment_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6893:1: rule__Is_a__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Is_a__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6897:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6898:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6898:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6899:1: ruleAnnotation
            {
             before(grammarAccess.getIs_aAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Is_a__AnnotationAssignment_014034);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getIs_aAccess().getAnnotationAnnotationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Is_a__AnnotationAssignment_0"


    // $ANTLR start "rule__Is_a__Objekttyp1Assignment_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6908:1: rule__Is_a__Objekttyp1Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Is_a__Objekttyp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6912:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6913:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6913:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6914:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6915:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6916:1: RULE_ID
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp1Assignment_214069); 
             after(grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 

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
    // $ANTLR end "rule__Is_a__Objekttyp1Assignment_2"


    // $ANTLR start "rule__Is_a__KardinalitaetAssignment_3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6927:1: rule__Is_a__KardinalitaetAssignment_3 : ( ( rule__Is_a__KardinalitaetAlternatives_3_0 ) ) ;
    public final void rule__Is_a__KardinalitaetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6931:1: ( ( ( rule__Is_a__KardinalitaetAlternatives_3_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6932:1: ( ( rule__Is_a__KardinalitaetAlternatives_3_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6932:1: ( ( rule__Is_a__KardinalitaetAlternatives_3_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6933:1: ( rule__Is_a__KardinalitaetAlternatives_3_0 )
            {
             before(grammarAccess.getIs_aAccess().getKardinalitaetAlternatives_3_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6934:1: ( rule__Is_a__KardinalitaetAlternatives_3_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6934:2: rule__Is_a__KardinalitaetAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Is_a__KardinalitaetAlternatives_3_0_in_rule__Is_a__KardinalitaetAssignment_314104);
            rule__Is_a__KardinalitaetAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getIs_aAccess().getKardinalitaetAlternatives_3_0()); 

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
    // $ANTLR end "rule__Is_a__KardinalitaetAssignment_3"


    // $ANTLR start "rule__Is_a__Objekttyp2Assignment_4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6943:1: rule__Is_a__Objekttyp2Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Is_a__Objekttyp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6947:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6948:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6948:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6949:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6950:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6951:1: RULE_ID
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp2Assignment_414141); 
             after(grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 

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
    // $ANTLR end "rule__Is_a__Objekttyp2Assignment_4"


    // $ANTLR start "rule__Is_part_of__AnnotationAssignment_0"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6962:1: rule__Is_part_of__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Is_part_of__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6966:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6967:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6967:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6968:1: ruleAnnotation
            {
             before(grammarAccess.getIs_part_ofAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Is_part_of__AnnotationAssignment_014176);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getIs_part_ofAccess().getAnnotationAnnotationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Is_part_of__AnnotationAssignment_0"


    // $ANTLR start "rule__Is_part_of__Objekttyp1Assignment_2"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6977:1: rule__Is_part_of__Objekttyp1Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Is_part_of__Objekttyp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6981:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6982:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6982:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6983:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6984:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6985:1: RULE_ID
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp1Assignment_214211); 
             after(grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 

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
    // $ANTLR end "rule__Is_part_of__Objekttyp1Assignment_2"


    // $ANTLR start "rule__Is_part_of__KardinalitaetAssignment_3"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:6996:1: rule__Is_part_of__KardinalitaetAssignment_3 : ( ( rule__Is_part_of__KardinalitaetAlternatives_3_0 ) ) ;
    public final void rule__Is_part_of__KardinalitaetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7000:1: ( ( ( rule__Is_part_of__KardinalitaetAlternatives_3_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7001:1: ( ( rule__Is_part_of__KardinalitaetAlternatives_3_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7001:1: ( ( rule__Is_part_of__KardinalitaetAlternatives_3_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7002:1: ( rule__Is_part_of__KardinalitaetAlternatives_3_0 )
            {
             before(grammarAccess.getIs_part_ofAccess().getKardinalitaetAlternatives_3_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7003:1: ( rule__Is_part_of__KardinalitaetAlternatives_3_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7003:2: rule__Is_part_of__KardinalitaetAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Is_part_of__KardinalitaetAlternatives_3_0_in_rule__Is_part_of__KardinalitaetAssignment_314246);
            rule__Is_part_of__KardinalitaetAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getIs_part_ofAccess().getKardinalitaetAlternatives_3_0()); 

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
    // $ANTLR end "rule__Is_part_of__KardinalitaetAssignment_3"


    // $ANTLR start "rule__Is_part_of__Objekttyp2Assignment_4"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7012:1: rule__Is_part_of__Objekttyp2Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Is_part_of__Objekttyp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7016:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7017:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7017:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7018:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7019:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7020:1: RULE_ID
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp2Assignment_414283); 
             after(grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 

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
    // $ANTLR end "rule__Is_part_of__Objekttyp2Assignment_4"


    // $ANTLR start "rule__Name__NameAssignment_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7031:1: rule__Name__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Name__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7035:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7036:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7036:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7037:1: RULE_ID
            {
             before(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__NameAssignment_114318); 
             after(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Name__NameAssignment_1"


    // $ANTLR start "rule__Merge__NameAssignment_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7046:1: rule__Merge__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Merge__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7050:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7051:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7051:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7052:1: RULE_ID
            {
             before(grammarAccess.getMergeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Merge__NameAssignment_114349); 
             after(grammarAccess.getMergeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Merge__NameAssignment_1"


    // $ANTLR start "rule__Version__VersionAssignment_1"
    // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7061:1: rule__Version__VersionAssignment_1 : ( RULE_VERSION_NUMBER ) ;
    public final void rule__Version__VersionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7065:1: ( ( RULE_VERSION_NUMBER ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7066:1: ( RULE_VERSION_NUMBER )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7066:1: ( RULE_VERSION_NUMBER )
            // ../de.uniba.wiai.seda.fha.som.aws.soa.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/ui/contentassist/antlr/internal/InternalSoa.g:7067:1: RULE_VERSION_NUMBER
            {
             before(grammarAccess.getVersionAccess().getVersionVERSION_NUMBERTerminalRuleCall_1_0()); 
            match(input,RULE_VERSION_NUMBER,FOLLOW_RULE_VERSION_NUMBER_in_rule__Version__VersionAssignment_114380); 
             after(grammarAccess.getVersionAccess().getVersionVERSION_NUMBERTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Version__VersionAssignment_1"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\4\4\1\5\2\uffff\1\14\1\uffff\3\4";
    static final String DFA4_maxS =
        "\1\55\1\4\1\45\1\4\1\5\2\uffff\1\27\1\uffff\3\45";
    static final String DFA4_acceptS =
        "\5\uffff\1\1\1\2\1\uffff\1\3\3\uffff";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\7\24\uffff\1\5\13\uffff\1\6\2\uffff\1\1\1\3\1\2\1\4\1\uffff"+
            "\1\10",
            "\1\11",
            "\1\6\24\uffff\1\5\13\uffff\1\6",
            "\1\12",
            "\1\13",
            "",
            "",
            "\4\6\2\uffff\2\6\3\uffff\1\10",
            "",
            "\1\6\24\uffff\1\5\13\uffff\1\6",
            "\1\6\24\uffff\1\5\13\uffff\1\6",
            "\1\6\24\uffff\1\5\13\uffff\1\6"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1062:1: rule__VOS__Alternatives_2 : ( ( ( rule__VOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__VOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__VOS__GliederungAssignment_2_2 ) ) );";
        }
    }
    static final String DFA6_eotS =
        "\14\uffff";
    static final String DFA6_eofS =
        "\14\uffff";
    static final String DFA6_minS =
        "\4\4\1\5\2\uffff\1\14\1\uffff\3\4";
    static final String DFA6_maxS =
        "\1\56\1\4\1\47\1\4\1\5\2\uffff\1\27\1\uffff\3\47";
    static final String DFA6_acceptS =
        "\5\uffff\1\1\1\2\1\uffff\1\3\3\uffff";
    static final String DFA6_specialS =
        "\14\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\7\35\uffff\3\5\3\6\1\1\1\3\1\2\1\4\2\uffff\1\10",
            "\1\11",
            "\1\6\35\uffff\3\5\3\6",
            "\1\12",
            "\1\13",
            "",
            "",
            "\4\6\2\uffff\2\6\3\uffff\1\10",
            "",
            "\1\6\35\uffff\3\5\3\6",
            "\1\6\35\uffff\3\5\3\6",
            "\1\6\35\uffff\3\5\3\6"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1112:1: rule__KOS__Alternatives_2 : ( ( ( rule__KOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__KOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__KOS__GliederungAssignment_2_2 ) ) );";
        }
    }
    static final String DFA8_eotS =
        "\13\uffff";
    static final String DFA8_eofS =
        "\13\uffff";
    static final String DFA8_minS =
        "\1\42\1\4\1\42\1\4\1\5\3\uffff\3\42";
    static final String DFA8_maxS =
        "\1\53\1\4\1\44\1\4\1\5\3\uffff\3\44";
    static final String DFA8_acceptS =
        "\5\uffff\1\1\1\2\1\3\3\uffff";
    static final String DFA8_specialS =
        "\13\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\5\1\6\1\7\3\uffff\1\1\1\3\1\2\1\4",
            "\1\10",
            "\1\5\1\6\1\7",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "\1\5\1\6\1\7",
            "\1\5\1\6\1\7",
            "\1\5\1\6\1\7"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1163:1: rule__KOT__Alternatives : ( ( ruleOOT ) | ( ruleLOT ) | ( ruleTOT ) );";
        }
    }
    static final String DFA12_eotS =
        "\13\uffff";
    static final String DFA12_eofS =
        "\13\uffff";
    static final String DFA12_minS =
        "\4\4\1\5\3\uffff\3\4";
    static final String DFA12_maxS =
        "\1\53\1\4\1\47\1\4\1\5\3\uffff\3\47";
    static final String DFA12_acceptS =
        "\5\uffff\1\1\1\2\1\3\3\uffff";
    static final String DFA12_specialS =
        "\13\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\5\40\uffff\1\5\1\6\1\7\1\1\1\3\1\2\1\4",
            "\1\10",
            "\1\5\40\uffff\1\5\1\6\1\7",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "\1\5\40\uffff\1\5\1\6\1\7",
            "\1\5\40\uffff\1\5\1\6\1\7",
            "\1\5\40\uffff\1\5\1\6\1\7"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1257:1: rule__Beziehung__Alternatives : ( ( ruleInteracts_with ) | ( ruleIs_a ) | ( ruleIs_part_of ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleSOA_AwS_in_entryRuleSOA_AwS61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSOA_AwS68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__Group__0_in_ruleSOA_AwS94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVorgangsservice_in_entryRuleVorgangsservice123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVorgangsservice130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__Group__0_in_ruleVorgangsservice156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVorgangsserviceElementar_in_entryRuleVorgangsserviceElementar183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVorgangsserviceElementar190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VorgangsserviceElementar__Group__0_in_ruleVorgangsserviceElementar216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0_in_ruleInterface276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethode_in_entryRuleServiceMethode303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceMethode310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethode__Group__0_in_ruleServiceMethode336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflow_in_entryRuleWorkflow363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflow370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Workflow__Group__0_in_ruleWorkflow396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrchestrierung_in_entryRuleOrchestrierung423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrchestrierung430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group__0_in_ruleOrchestrierung456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoreographieLokal_in_entryRuleChoreographieLokal483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoreographieLokal490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group__0_in_ruleChoreographieLokal516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBedingung_in_entryRuleBedingung543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBedingung550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bedingung__BedingungAssignment_in_ruleBedingung576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityservice_in_entryRuleEntityservice603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityservice610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entityservice__Group__0_in_ruleEntityservice636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOS_in_entryRuleVOS727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVOS734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Group__0_in_ruleVOS760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOS_in_entryRuleKOS787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKOS794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Group__0_in_ruleKOS820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOT_in_entryRuleVOT849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVOT856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__0_in_ruleVOT882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOT_in_entryRuleKOT909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKOT916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOT__Alternatives_in_ruleKOT942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_entryRuleOOT969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOOT976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__0_in_ruleOOT1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_entryRuleLOT1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOT1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__0_in_ruleLOT1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_entryRuleTOT1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTOT1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__0_in_ruleTOT1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_entryRuleAttribut1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribut1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__0_in_ruleAttribut1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator1209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__0_in_ruleOperator1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeziehung_in_entryRuleBeziehung1269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeziehung1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Beziehung__Alternatives_in_ruleBeziehung1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteracts_with1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__0_in_ruleInteracts_with1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_a_in_entryRuleIs_a1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_a1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__0_in_ruleIs_a1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of1449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_part_of1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__0_in_ruleIs_part_of1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet011511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet011518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__0_in_ruleKardinalitaet011544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x1571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet0x1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__0_in_ruleKardinalitaet0x1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet111631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet111638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__0_in_ruleKardinalitaet111664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x1691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet1x1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__0_in_ruleKardinalitaet1x1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName1811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__0_in_ruleName1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_entryRuleMerge1871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMerge1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__Group__0_in_ruleMerge1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_entryRuleIgnore1931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIgnore1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ignore__Group__0_in_ruleIgnore1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion1991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__VorgangsservicesAssignment_4_0_in_rule__SOA_AwS__Alternatives_42060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__EntityservicesAssignment_4_1_in_rule__SOA_AwS__Alternatives_42078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Workflow__OrchestrierungAssignment_2_0_in_rule__Workflow__Alternatives_22112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Workflow__ChoreographieAssignment_2_1_in_rule__Workflow__Alternatives_22130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__NameAssignment_0_0_in_rule__VOS__Alternatives_02164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__NameAssignment_0_1_in_rule__VOS__Alternatives_02182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__ObjekttypenAssignment_2_0_in_rule__VOS__Alternatives_22215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__BeziehungenAssignment_2_1_in_rule__VOS__Alternatives_22233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__GliederungAssignment_2_2_in_rule__VOS__Alternatives_22251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__NameAssignment_0_0_in_rule__KOS__Alternatives_02284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__NameAssignment_0_1_in_rule__KOS__Alternatives_02302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__ObjekttypenAssignment_2_0_in_rule__KOS__Alternatives_22335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__BeziehungenAssignment_2_1_in_rule__KOS__Alternatives_22353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__GliederungAssignment_2_2_in_rule__KOS__Alternatives_22371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__AttributeAssignment_4_0_in_rule__VOT__Alternatives_42405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__OperatorenAssignment_4_1_in_rule__VOT__Alternatives_42423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_rule__KOT__Alternatives2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_rule__KOT__Alternatives2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_rule__KOT__Alternatives2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__AttributeAssignment_4_0_in_rule__OOT__Alternatives_42522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__OperatorenAssignment_4_1_in_rule__OOT__Alternatives_42540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__AttributeAssignment_4_0_in_rule__LOT__Alternatives_42573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__OperatorenAssignment_4_1_in_rule__LOT__Alternatives_42591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__AttributeAssignment_4_0_in_rule__TOT__Alternatives_42624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__OperatorenAssignment_4_1_in_rule__TOT__Alternatives_42642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_rule__Beziehung__Alternatives2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_a_in_rule__Beziehung__Alternatives2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_rule__Beziehung__Alternatives2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_rule__Interacts_with__KardinalitaetAlternatives_3_02741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_rule__Interacts_with__KardinalitaetAlternatives_3_02758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_rule__Interacts_with__KardinalitaetAlternatives_3_02775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_rule__Is_a__KardinalitaetAlternatives_3_02807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_rule__Is_a__KardinalitaetAlternatives_3_02824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_rule__Is_part_of__KardinalitaetAlternatives_3_02856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_rule__Is_part_of__KardinalitaetAlternatives_3_02873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_rule__Is_part_of__KardinalitaetAlternatives_3_02890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Kardinalitaet01__Alternatives_02924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Kardinalitaet01__Alternatives_02944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Kardinalitaet0x__Alternatives_02979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Kardinalitaet0x__Alternatives_02999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Kardinalitaet11__Alternatives_03034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Kardinalitaet11__Alternatives_03054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Kardinalitaet1x__Alternatives_03089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Kardinalitaet1x__Alternatives_03109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Annotation__Alternatives3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_rule__Annotation__Alternatives3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_rule__Annotation__Alternatives3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Annotation__Alternatives3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__Group__0__Impl_in_rule__SOA_AwS__Group__03224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SOA_AwS__Group__1_in_rule__SOA_AwS__Group__03227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SOA_AwS__Group__0__Impl3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__Group__1__Impl_in_rule__SOA_AwS__Group__13286 = new BitSet(new long[]{0x0000600000200010L});
    public static final BitSet FOLLOW_rule__SOA_AwS__Group__2_in_rule__SOA_AwS__Group__13289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__NameAssignment_1_in_rule__SOA_AwS__Group__1__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__Group__2__Impl_in_rule__SOA_AwS__Group__23346 = new BitSet(new long[]{0x0000600000200010L});
    public static final BitSet FOLLOW_rule__SOA_AwS__Group__3_in_rule__SOA_AwS__Group__23349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__Group_2__0_in_rule__SOA_AwS__Group__2__Impl3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__Group__3__Impl_in_rule__SOA_AwS__Group__33407 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_rule__SOA_AwS__Group__4_in_rule__SOA_AwS__Group__33410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__UnorderedGroup_3_in_rule__SOA_AwS__Group__3__Impl3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__Group__4__Impl_in_rule__SOA_AwS__Group__43467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__Alternatives_4_in_rule__SOA_AwS__Group__4__Impl3494 = new BitSet(new long[]{0x0000000100400002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__Group_2__0__Impl_in_rule__SOA_AwS__Group_2__03535 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SOA_AwS__Group_2__1_in_rule__SOA_AwS__Group_2__03538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SOA_AwS__Group_2__0__Impl3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__Group_2__1__Impl_in_rule__SOA_AwS__Group_2__13597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__VersionAssignment_2_1_in_rule__SOA_AwS__Group_2__1__Impl3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__Group__0__Impl_in_rule__Vorgangsservice__Group__03658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__Group__1_in_rule__Vorgangsservice__Group__03661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Vorgangsservice__Group__0__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__Group__1__Impl_in_rule__Vorgangsservice__Group__13720 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__Group__2_in_rule__Vorgangsservice__Group__13723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__NameAssignment_1_in_rule__Vorgangsservice__Group__1__Impl3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__Group__2__Impl_in_rule__Vorgangsservice__Group__23780 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__Group__3_in_rule__Vorgangsservice__Group__23783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Vorgangsservice__Group__2__Impl3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__Group__3__Impl_in_rule__Vorgangsservice__Group__33842 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__Group__4_in_rule__Vorgangsservice__Group__33845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__ChoreographieIFAssignment_3_in_rule__Vorgangsservice__Group__3__Impl3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__Group__4__Impl_in_rule__Vorgangsservice__Group__43902 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__Group__5_in_rule__Vorgangsservice__Group__43905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__VorgangsservicesElementarAssignment_4_in_rule__Vorgangsservice__Group__4__Impl3932 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__Group__5__Impl_in_rule__Vorgangsservice__Group__53963 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__Group__6_in_rule__Vorgangsservice__Group__53966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__WorkflowAssignment_5_in_rule__Vorgangsservice__Group__5__Impl3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vorgangsservice__Group__6__Impl_in_rule__Vorgangsservice__Group__64023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Vorgangsservice__Group__6__Impl4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VorgangsserviceElementar__Group__0__Impl_in_rule__VorgangsserviceElementar__Group__04096 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__VorgangsserviceElementar__Group__1_in_rule__VorgangsserviceElementar__Group__04099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VorgangsserviceElementar__NameAssignment_0_in_rule__VorgangsserviceElementar__Group__0__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VorgangsserviceElementar__Group__1__Impl_in_rule__VorgangsserviceElementar__Group__14156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VorgangsserviceElementar__Group__2_in_rule__VorgangsserviceElementar__Group__14159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VorgangsserviceElementar__Group__1__Impl4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VorgangsserviceElementar__Group__2__Impl_in_rule__VorgangsserviceElementar__Group__24218 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__VorgangsserviceElementar__Group__3_in_rule__VorgangsserviceElementar__Group__24221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_2_in_rule__VorgangsserviceElementar__Group__2__Impl4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VorgangsserviceElementar__Group__3__Impl_in_rule__VorgangsserviceElementar__Group__34278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VorgangsserviceElementar__InterfaceAssignment_3_in_rule__VorgangsserviceElementar__Group__3__Impl4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__04343 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__04346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_0_in_rule__Interface__Group__0__Impl4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__14403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__14406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Interface__Group__1__Impl4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__24465 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__24468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__MethodenAssignment_2_in_rule__Interface__Group__2__Impl4497 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Interface__MethodenAssignment_2_in_rule__Interface__Group__2__Impl4509 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__34542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Interface__Group__3__Impl4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethode__Group__0__Impl_in_rule__ServiceMethode__Group__04609 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ServiceMethode__Group__1_in_rule__ServiceMethode__Group__04612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethode__NameAssignment_0_in_rule__ServiceMethode__Group__0__Impl4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethode__Group__1__Impl_in_rule__ServiceMethode__Group__14669 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__ServiceMethode__Group__2_in_rule__ServiceMethode__Group__14672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ServiceMethode__Group__1__Impl4700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethode__Group__2__Impl_in_rule__ServiceMethode__Group__24731 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__ServiceMethode__Group__3_in_rule__ServiceMethode__Group__24734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethode__ParameterAssignment_2_in_rule__ServiceMethode__Group__2__Impl4761 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ServiceMethode__Group__3__Impl_in_rule__ServiceMethode__Group__34792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ServiceMethode__Group__3__Impl4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Workflow__Group__0__Impl_in_rule__Workflow__Group__04859 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Workflow__Group__1_in_rule__Workflow__Group__04862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Workflow__Group__0__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Workflow__Group__1__Impl_in_rule__Workflow__Group__14921 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Workflow__Group__2_in_rule__Workflow__Group__14924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Workflow__Group__1__Impl4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Workflow__Group__2__Impl_in_rule__Workflow__Group__24983 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Workflow__Group__3_in_rule__Workflow__Group__24986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Workflow__Alternatives_2_in_rule__Workflow__Group__2__Impl5015 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_rule__Workflow__Alternatives_2_in_rule__Workflow__Group__2__Impl5027 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_rule__Workflow__Group__3__Impl_in_rule__Workflow__Group__35060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Workflow__Group__3__Impl5088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group__0__Impl_in_rule__Orchestrierung__Group__05127 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group__1_in_rule__Orchestrierung__Group__05130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group_0__0_in_rule__Orchestrierung__Group__0__Impl5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group__1__Impl_in_rule__Orchestrierung__Group__15188 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group__2_in_rule__Orchestrierung__Group__15191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Methode1Assignment_1_in_rule__Orchestrierung__Group__1__Impl5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group__2__Impl_in_rule__Orchestrierung__Group__25248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group__3_in_rule__Orchestrierung__Group__25251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Orchestrierung__Group__2__Impl5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group__3__Impl_in_rule__Orchestrierung__Group__35310 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group__4_in_rule__Orchestrierung__Group__35313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Methode2Assignment_3_in_rule__Orchestrierung__Group__3__Impl5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group__4__Impl_in_rule__Orchestrierung__Group__45370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Orchestrierung__Group__4__Impl5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group_0__0__Impl_in_rule__Orchestrierung__Group_0__05439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group_0__1_in_rule__Orchestrierung__Group_0__05442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Orchestrierung__Group_0__0__Impl5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group_0__1__Impl_in_rule__Orchestrierung__Group_0__15501 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group_0__2_in_rule__Orchestrierung__Group_0__15504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orchestrierung__BedingungAssignment_0_1_in_rule__Orchestrierung__Group_0__1__Impl5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orchestrierung__Group_0__2__Impl_in_rule__Orchestrierung__Group_0__25561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Orchestrierung__Group_0__2__Impl5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group__0__Impl_in_rule__ChoreographieLokal__Group__05626 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group__1_in_rule__ChoreographieLokal__Group__05629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group_0__0_in_rule__ChoreographieLokal__Group__0__Impl5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group__1__Impl_in_rule__ChoreographieLokal__Group__15687 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group__2_in_rule__ChoreographieLokal__Group__15690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Methode1Assignment_1_in_rule__ChoreographieLokal__Group__1__Impl5717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group__2__Impl_in_rule__ChoreographieLokal__Group__25747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group__3_in_rule__ChoreographieLokal__Group__25750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ChoreographieLokal__Group__2__Impl5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group__3__Impl_in_rule__ChoreographieLokal__Group__35809 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group__4_in_rule__ChoreographieLokal__Group__35812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Service2Assignment_3_in_rule__ChoreographieLokal__Group__3__Impl5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group__4__Impl_in_rule__ChoreographieLokal__Group__45869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group__5_in_rule__ChoreographieLokal__Group__45872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ChoreographieLokal__Group__4__Impl5900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group__5__Impl_in_rule__ChoreographieLokal__Group__55931 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group__6_in_rule__ChoreographieLokal__Group__55934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Methode2Assignment_5_in_rule__ChoreographieLokal__Group__5__Impl5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group__6__Impl_in_rule__ChoreographieLokal__Group__65991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ChoreographieLokal__Group__6__Impl6019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group_0__0__Impl_in_rule__ChoreographieLokal__Group_0__06064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group_0__1_in_rule__ChoreographieLokal__Group_0__06067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ChoreographieLokal__Group_0__0__Impl6095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group_0__1__Impl_in_rule__ChoreographieLokal__Group_0__16126 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group_0__2_in_rule__ChoreographieLokal__Group_0__16129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__BedingungAssignment_0_1_in_rule__ChoreographieLokal__Group_0__1__Impl6156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoreographieLokal__Group_0__2__Impl_in_rule__ChoreographieLokal__Group_0__26186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ChoreographieLokal__Group_0__2__Impl6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entityservice__Group__0__Impl_in_rule__Entityservice__Group__06251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entityservice__Group__1_in_rule__Entityservice__Group__06254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Entityservice__Group__0__Impl6282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entityservice__Group__1__Impl_in_rule__Entityservice__Group__16313 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Entityservice__Group__2_in_rule__Entityservice__Group__16316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entityservice__NameAssignment_1_in_rule__Entityservice__Group__1__Impl6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entityservice__Group__2__Impl_in_rule__Entityservice__Group__26373 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Entityservice__Group__3_in_rule__Entityservice__Group__26376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Entityservice__Group__2__Impl6404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entityservice__Group__3__Impl_in_rule__Entityservice__Group__36435 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Entityservice__Group__4_in_rule__Entityservice__Group__36438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entityservice__InterfaceAssignment_3_in_rule__Entityservice__Group__3__Impl6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entityservice__Group__4__Impl_in_rule__Entityservice__Group__46495 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__Entityservice__Group__5_in_rule__Entityservice__Group__46498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entityservice__EntitiesAssignment_4_in_rule__Entityservice__Group__4__Impl6525 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entityservice__Group__5__Impl_in_rule__Entityservice__Group__56556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Entityservice__Group__5__Impl6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__06627 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__06630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_0_in_rule__Entity__Group__0__Impl6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__16687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__16690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Entity__Group__1__Impl6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__26749 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__26752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__KomponentenObjekttypAssignment_2_in_rule__Entity__Group__2__Impl6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__36809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__InterfaceAssignment_3_in_rule__Entity__Group__3__Impl6836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Group__0__Impl_in_rule__VOS__Group__06877 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__VOS__Group__1_in_rule__VOS__Group__06880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Alternatives_0_in_rule__VOS__Group__0__Impl6907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Group__1__Impl_in_rule__VOS__Group__16937 = new BitSet(new long[]{0x00002F2002000010L});
    public static final BitSet FOLLOW_rule__VOS__Group__2_in_rule__VOS__Group__16940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VOS__Group__1__Impl6968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Group__2__Impl_in_rule__VOS__Group__26999 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__VOS__Group__3_in_rule__VOS__Group__27002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Alternatives_2_in_rule__VOS__Group__2__Impl7031 = new BitSet(new long[]{0x00002F2002000012L});
    public static final BitSet FOLLOW_rule__VOS__Alternatives_2_in_rule__VOS__Group__2__Impl7043 = new BitSet(new long[]{0x00002F2002000012L});
    public static final BitSet FOLLOW_rule__VOS__Group__3__Impl_in_rule__VOS__Group__37076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__VOS__Group__3__Impl7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Group__0__Impl_in_rule__KOS__Group__07143 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__KOS__Group__1_in_rule__KOS__Group__07146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Alternatives_0_in_rule__KOS__Group__0__Impl7173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Group__1__Impl_in_rule__KOS__Group__17203 = new BitSet(new long[]{0x00006FFC00200010L});
    public static final BitSet FOLLOW_rule__KOS__Group__2_in_rule__KOS__Group__17206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__KOS__Group__1__Impl7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Group__2__Impl_in_rule__KOS__Group__27265 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__KOS__Group__3_in_rule__KOS__Group__27268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Alternatives_2_in_rule__KOS__Group__2__Impl7297 = new BitSet(new long[]{0x00006FFC00200012L});
    public static final BitSet FOLLOW_rule__KOS__Alternatives_2_in_rule__KOS__Group__2__Impl7309 = new BitSet(new long[]{0x00006FFC00200012L});
    public static final BitSet FOLLOW_rule__KOS__Group__3__Impl_in_rule__KOS__Group__37342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__KOS__Group__3__Impl7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__0__Impl_in_rule__VOT__Group__07409 = new BitSet(new long[]{0x00000F0002000000L});
    public static final BitSet FOLLOW_rule__VOT__Group__1_in_rule__VOT__Group__07412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__AnnotationAssignment_0_in_rule__VOT__Group__0__Impl7439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__1__Impl_in_rule__VOT__Group__17470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VOT__Group__2_in_rule__VOT__Group__17473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__VOT__Group__1__Impl7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__2__Impl_in_rule__VOT__Group__27532 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__VOT__Group__3_in_rule__VOT__Group__27535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__NameAssignment_2_in_rule__VOT__Group__2__Impl7562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__3__Impl_in_rule__VOT__Group__37592 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__VOT__Group__4_in_rule__VOT__Group__37595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VOT__Group__3__Impl7623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__4__Impl_in_rule__VOT__Group__47654 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__VOT__Group__5_in_rule__VOT__Group__47657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Alternatives_4_in_rule__VOT__Group__4__Impl7684 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__VOT__Group__5__Impl_in_rule__VOT__Group__57715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__VOT__Group__5__Impl7743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__0__Impl_in_rule__OOT__Group__07786 = new BitSet(new long[]{0x00000F0400000000L});
    public static final BitSet FOLLOW_rule__OOT__Group__1_in_rule__OOT__Group__07789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__AnnotationAssignment_0_in_rule__OOT__Group__0__Impl7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__1__Impl_in_rule__OOT__Group__17847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OOT__Group__2_in_rule__OOT__Group__17850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__OOT__Group__1__Impl7878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__2__Impl_in_rule__OOT__Group__27909 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__OOT__Group__3_in_rule__OOT__Group__27912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__NameAssignment_2_in_rule__OOT__Group__2__Impl7939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__3__Impl_in_rule__OOT__Group__37969 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__OOT__Group__4_in_rule__OOT__Group__37972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__OOT__Group__3__Impl8000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__4__Impl_in_rule__OOT__Group__48031 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__OOT__Group__5_in_rule__OOT__Group__48034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Alternatives_4_in_rule__OOT__Group__4__Impl8061 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__OOT__Group__5__Impl_in_rule__OOT__Group__58092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__OOT__Group__5__Impl8120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__0__Impl_in_rule__LOT__Group__08163 = new BitSet(new long[]{0x00000F0800000000L});
    public static final BitSet FOLLOW_rule__LOT__Group__1_in_rule__LOT__Group__08166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__AnnotationAssignment_0_in_rule__LOT__Group__0__Impl8193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__1__Impl_in_rule__LOT__Group__18224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LOT__Group__2_in_rule__LOT__Group__18227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__LOT__Group__1__Impl8255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__2__Impl_in_rule__LOT__Group__28286 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__LOT__Group__3_in_rule__LOT__Group__28289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__NameAssignment_2_in_rule__LOT__Group__2__Impl8316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__3__Impl_in_rule__LOT__Group__38346 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__LOT__Group__4_in_rule__LOT__Group__38349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LOT__Group__3__Impl8377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__4__Impl_in_rule__LOT__Group__48408 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__LOT__Group__5_in_rule__LOT__Group__48411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Alternatives_4_in_rule__LOT__Group__4__Impl8438 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__LOT__Group__5__Impl_in_rule__LOT__Group__58469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LOT__Group__5__Impl8497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__0__Impl_in_rule__TOT__Group__08540 = new BitSet(new long[]{0x00000F1C00000000L});
    public static final BitSet FOLLOW_rule__TOT__Group__1_in_rule__TOT__Group__08543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__AnnotationAssignment_0_in_rule__TOT__Group__0__Impl8570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__1__Impl_in_rule__TOT__Group__18601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TOT__Group__2_in_rule__TOT__Group__18604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TOT__Group__1__Impl8632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__2__Impl_in_rule__TOT__Group__28663 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TOT__Group__3_in_rule__TOT__Group__28666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__NameAssignment_2_in_rule__TOT__Group__2__Impl8693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__3__Impl_in_rule__TOT__Group__38723 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__TOT__Group__4_in_rule__TOT__Group__38726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TOT__Group__3__Impl8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__4__Impl_in_rule__TOT__Group__48785 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__TOT__Group__5_in_rule__TOT__Group__48788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Alternatives_4_in_rule__TOT__Group__4__Impl8815 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__TOT__Group__5__Impl_in_rule__TOT__Group__58846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TOT__Group__5__Impl8874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__0__Impl_in_rule__Attribut__Group__08917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribut__Group__1_in_rule__Attribut__Group__08920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__TypAssignment_0_in_rule__Attribut__Group__0__Impl8947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__1__Impl_in_rule__Attribut__Group__18978 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Attribut__Group__2_in_rule__Attribut__Group__18981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__NameAssignment_1_in_rule__Attribut__Group__1__Impl9008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__2__Impl_in_rule__Attribut__Group__29038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Attribut__Group__2__Impl9066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__0__Impl_in_rule__Operator__Group__09103 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Operator__Group__1_in_rule__Operator__Group__09106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__NameAssignment_0_in_rule__Operator__Group__0__Impl9133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__1__Impl_in_rule__Operator__Group__19163 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Operator__Group__2_in_rule__Operator__Group__19166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Operator__Group__1__Impl9194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__2__Impl_in_rule__Operator__Group__29225 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Operator__Group__3_in_rule__Operator__Group__29228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__ParameterAssignment_2_in_rule__Operator__Group__2__Impl9255 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Operator__Group__3__Impl_in_rule__Operator__Group__39286 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Operator__Group__4_in_rule__Operator__Group__39289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Operator__Group__3__Impl9317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__4__Impl_in_rule__Operator__Group__49348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Operator__Group__4__Impl9376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__0__Impl_in_rule__Interacts_with__Group__09417 = new BitSet(new long[]{0x00000F2000000010L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__1_in_rule__Interacts_with__Group__09420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__AnnotationAssignment_0_in_rule__Interacts_with__Group__0__Impl9447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__1__Impl_in_rule__Interacts_with__Group__19478 = new BitSet(new long[]{0x00000F2000000010L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__2_in_rule__Interacts_with__Group__19481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Interacts_with__Group__1__Impl9510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__2__Impl_in_rule__Interacts_with__Group__29543 = new BitSet(new long[]{0x00000000000CF000L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__3_in_rule__Interacts_with__Group__29546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Objekttyp1Assignment_2_in_rule__Interacts_with__Group__2__Impl9573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__3__Impl_in_rule__Interacts_with__Group__39603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__4_in_rule__Interacts_with__Group__39606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__KardinalitaetAssignment_3_in_rule__Interacts_with__Group__3__Impl9633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__4__Impl_in_rule__Interacts_with__Group__49663 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__5_in_rule__Interacts_with__Group__49666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Objekttyp2Assignment_4_in_rule__Interacts_with__Group__4__Impl9693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__5__Impl_in_rule__Interacts_with__Group__59723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Interacts_with__Group__5__Impl9751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__0__Impl_in_rule__Is_a__Group__09794 = new BitSet(new long[]{0x00000F4000000000L});
    public static final BitSet FOLLOW_rule__Is_a__Group__1_in_rule__Is_a__Group__09797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__AnnotationAssignment_0_in_rule__Is_a__Group__0__Impl9824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__1__Impl_in_rule__Is_a__Group__19855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Is_a__Group__2_in_rule__Is_a__Group__19858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Is_a__Group__1__Impl9886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__2__Impl_in_rule__Is_a__Group__29917 = new BitSet(new long[]{0x0000000000033000L});
    public static final BitSet FOLLOW_rule__Is_a__Group__3_in_rule__Is_a__Group__29920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Objekttyp1Assignment_2_in_rule__Is_a__Group__2__Impl9947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__3__Impl_in_rule__Is_a__Group__39977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Is_a__Group__4_in_rule__Is_a__Group__39980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__KardinalitaetAssignment_3_in_rule__Is_a__Group__3__Impl10007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__4__Impl_in_rule__Is_a__Group__410037 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Is_a__Group__5_in_rule__Is_a__Group__410040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Objekttyp2Assignment_4_in_rule__Is_a__Group__4__Impl10067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__5__Impl_in_rule__Is_a__Group__510097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Is_a__Group__5__Impl10125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__0__Impl_in_rule__Is_part_of__Group__010168 = new BitSet(new long[]{0x00000FE000000010L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__1_in_rule__Is_part_of__Group__010171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__AnnotationAssignment_0_in_rule__Is_part_of__Group__0__Impl10198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__1__Impl_in_rule__Is_part_of__Group__110229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__2_in_rule__Is_part_of__Group__110232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Is_part_of__Group__1__Impl10260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__2__Impl_in_rule__Is_part_of__Group__210291 = new BitSet(new long[]{0x00000000000CF000L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__3_in_rule__Is_part_of__Group__210294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Objekttyp1Assignment_2_in_rule__Is_part_of__Group__2__Impl10321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__3__Impl_in_rule__Is_part_of__Group__310351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__4_in_rule__Is_part_of__Group__310354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__KardinalitaetAssignment_3_in_rule__Is_part_of__Group__3__Impl10381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__4__Impl_in_rule__Is_part_of__Group__410411 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__5_in_rule__Is_part_of__Group__410414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Objekttyp2Assignment_4_in_rule__Is_part_of__Group__4__Impl10441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__5__Impl_in_rule__Is_part_of__Group__510471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Is_part_of__Group__5__Impl10499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__0__Impl_in_rule__Kardinalitaet01__Group__010542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__1_in_rule__Kardinalitaet01__Group__010545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Alternatives_0_in_rule__Kardinalitaet01__Group__0__Impl10572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__1__Impl_in_rule__Kardinalitaet01__Group__110602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__0__Impl_in_rule__Kardinalitaet0x__Group__010664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__1_in_rule__Kardinalitaet0x__Group__010667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Alternatives_0_in_rule__Kardinalitaet0x__Group__0__Impl10694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__1__Impl_in_rule__Kardinalitaet0x__Group__110724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__0__Impl_in_rule__Kardinalitaet11__Group__010786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__1_in_rule__Kardinalitaet11__Group__010789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Alternatives_0_in_rule__Kardinalitaet11__Group__0__Impl10816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__1__Impl_in_rule__Kardinalitaet11__Group__110846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__0__Impl_in_rule__Kardinalitaet1x__Group__010908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__1_in_rule__Kardinalitaet1x__Group__010911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Alternatives_0_in_rule__Kardinalitaet1x__Group__0__Impl10938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__1__Impl_in_rule__Kardinalitaet1x__Group__110968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__011030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Name__Group__1_in_rule__Name__Group__011033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Name__Group__0__Impl11061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__111092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__NameAssignment_1_in_rule__Name__Group__1__Impl11119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__Group__0__Impl_in_rule__Merge__Group__011153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Merge__Group__1_in_rule__Merge__Group__011156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Merge__Group__0__Impl11184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__Group__1__Impl_in_rule__Merge__Group__111215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__NameAssignment_1_in_rule__Merge__Group__1__Impl11242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ignore__Group__0__Impl_in_rule__Ignore__Group__011276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Ignore__Group__1_in_rule__Ignore__Group__011279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Ignore__Group__0__Impl11307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ignore__Group__1__Impl_in_rule__Ignore__Group__111338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__011400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__011403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Version__Group__0__Impl11431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__111462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__VersionAssignment_1_in_rule__Version__Group__1__Impl11489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__UnorderedGroup_3__0_in_rule__SOA_AwS__UnorderedGroup_311524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__VosAssignment_3_0_in_rule__SOA_AwS__UnorderedGroup_3__Impl11613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__KosAssignment_3_1_in_rule__SOA_AwS__UnorderedGroup_3__Impl11704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__UnorderedGroup_3__Impl_in_rule__SOA_AwS__UnorderedGroup_3__011763 = new BitSet(new long[]{0x0000600000200012L});
    public static final BitSet FOLLOW_rule__SOA_AwS__UnorderedGroup_3__1_in_rule__SOA_AwS__UnorderedGroup_3__011766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOA_AwS__UnorderedGroup_3__Impl_in_rule__SOA_AwS__UnorderedGroup_3__111791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SOA_AwS__NameAssignment_111824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VERSION_NUMBER_in_rule__SOA_AwS__VersionAssignment_2_111855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOS_in_rule__SOA_AwS__VosAssignment_3_011886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOS_in_rule__SOA_AwS__KosAssignment_3_111917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVorgangsservice_in_rule__SOA_AwS__VorgangsservicesAssignment_4_011948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityservice_in_rule__SOA_AwS__EntityservicesAssignment_4_111979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Vorgangsservice__NameAssignment_112010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__Vorgangsservice__ChoreographieIFAssignment_312041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVorgangsserviceElementar_in_rule__Vorgangsservice__VorgangsservicesElementarAssignment_412072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflow_in_rule__Vorgangsservice__WorkflowAssignment_512103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VorgangsserviceElementar__NameAssignment_012134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VorgangsserviceElementar__KomponentenObjekttypAssignment_212169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__VorgangsserviceElementar__InterfaceAssignment_312204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Interface__NameAssignment_012240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethode_in_rule__Interface__MethodenAssignment_212279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceMethode__NameAssignment_012310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceMethode__ParameterAssignment_212341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrchestrierung_in_rule__Workflow__OrchestrierungAssignment_2_012372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoreographieLokal_in_rule__Workflow__ChoreographieAssignment_2_112403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBedingung_in_rule__Orchestrierung__BedingungAssignment_0_112434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Orchestrierung__Methode1Assignment_112469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Orchestrierung__Methode2Assignment_312508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBedingung_in_rule__ChoreographieLokal__BedingungAssignment_0_112543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ChoreographieLokal__Methode1Assignment_112578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ChoreographieLokal__Service2Assignment_312617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ChoreographieLokal__Methode2Assignment_512656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bedingung__BedingungAssignment12691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entityservice__NameAssignment_112722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__Entityservice__InterfaceAssignment_312753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Entityservice__EntitiesAssignment_412784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_012815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__KomponentenObjekttypAssignment_212850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__Entity__InterfaceAssignment_312885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__VOS__NameAssignment_0_012925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VOS__NameAssignment_0_112964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOT_in_rule__VOS__ObjekttypenAssignment_2_012995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_rule__VOS__BeziehungenAssignment_2_113026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOS_in_rule__VOS__GliederungAssignment_2_213057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__KOS__NameAssignment_0_013093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KOS__NameAssignment_0_113132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOT_in_rule__KOS__ObjekttypenAssignment_2_013163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeziehung_in_rule__KOS__BeziehungenAssignment_2_113194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOS_in_rule__KOS__GliederungAssignment_2_213225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__VOT__AnnotationAssignment_013256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VOT__NameAssignment_213287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_rule__VOT__AttributeAssignment_4_013318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__VOT__OperatorenAssignment_4_113349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__OOT__AnnotationAssignment_013380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OOT__NameAssignment_213411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_rule__OOT__AttributeAssignment_4_013442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__OOT__OperatorenAssignment_4_113473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__LOT__AnnotationAssignment_013504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LOT__NameAssignment_213535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_rule__LOT__AttributeAssignment_4_013566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__LOT__OperatorenAssignment_4_113597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__TOT__AnnotationAssignment_013628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TOT__NameAssignment_213659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_rule__TOT__AttributeAssignment_4_013690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__TOT__OperatorenAssignment_4_113721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribut__TypAssignment_013756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribut__NameAssignment_113791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operator__NameAssignment_013822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operator__ParameterAssignment_213857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Interacts_with__AnnotationAssignment_013892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp1Assignment_213927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__KardinalitaetAlternatives_3_0_in_rule__Interacts_with__KardinalitaetAssignment_313962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp2Assignment_413999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Is_a__AnnotationAssignment_014034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp1Assignment_214069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__KardinalitaetAlternatives_3_0_in_rule__Is_a__KardinalitaetAssignment_314104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp2Assignment_414141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Is_part_of__AnnotationAssignment_014176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp1Assignment_214211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__KardinalitaetAlternatives_3_0_in_rule__Is_part_of__KardinalitaetAssignment_314246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp2Assignment_414283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__NameAssignment_114318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Merge__NameAssignment_114349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VERSION_NUMBER_in_rule__Version__VersionAssignment_114380 = new BitSet(new long[]{0x0000000000000002L});

}
