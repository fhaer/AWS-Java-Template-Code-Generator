package de.uniba.wiai.seda.fha.som.aws.ui.contentassist.antlr.internal; 

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
import de.uniba.wiai.seda.fha.som.aws.services.AwsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAwsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VERSION_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'--'", "'(0,1)'", "'->'", "'(0,*)'", "'=='", "'(1,1)'", "'=>'", "'(1,*)'", "'AwS:'", "'v'", "'{'", "'}'", "'VOT'", "'OOT'", "'LOT'", "'TOT'", "';'", "'('", "')'", "'interacts_with:'", "'is_a:'", "'is_part_of:'", "'@name'", "'@merge'", "'@ignore'", "'@version'", "'VOS'", "'KOS'"
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
    public static final int RULE_VERSION_NUMBER=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalAwsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAwsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAwsParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g"; }


     
     	private AwsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AwsGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleAwS"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:60:1: entryRuleAwS : ruleAwS EOF ;
    public final void entryRuleAwS() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:61:1: ( ruleAwS EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:62:1: ruleAwS EOF
            {
             before(grammarAccess.getAwSRule()); 
            pushFollow(FOLLOW_ruleAwS_in_entryRuleAwS61);
            ruleAwS();

            state._fsp--;

             after(grammarAccess.getAwSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwS68); 

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
    // $ANTLR end "entryRuleAwS"


    // $ANTLR start "ruleAwS"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:69:1: ruleAwS : ( ( rule__AwS__Group__0 ) ) ;
    public final void ruleAwS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:73:2: ( ( ( rule__AwS__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:74:1: ( ( rule__AwS__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:74:1: ( ( rule__AwS__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:75:1: ( rule__AwS__Group__0 )
            {
             before(grammarAccess.getAwSAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:76:1: ( rule__AwS__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:76:2: rule__AwS__Group__0
            {
            pushFollow(FOLLOW_rule__AwS__Group__0_in_ruleAwS94);
            rule__AwS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAwSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAwS"


    // $ANTLR start "entryRuleVOS"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:90:1: entryRuleVOS : ruleVOS EOF ;
    public final void entryRuleVOS() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:91:1: ( ruleVOS EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:92:1: ruleVOS EOF
            {
             before(grammarAccess.getVOSRule()); 
            pushFollow(FOLLOW_ruleVOS_in_entryRuleVOS123);
            ruleVOS();

            state._fsp--;

             after(grammarAccess.getVOSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVOS130); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:99:1: ruleVOS : ( ( rule__VOS__Group__0 ) ) ;
    public final void ruleVOS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:103:2: ( ( ( rule__VOS__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:104:1: ( ( rule__VOS__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:104:1: ( ( rule__VOS__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:105:1: ( rule__VOS__Group__0 )
            {
             before(grammarAccess.getVOSAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:106:1: ( rule__VOS__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:106:2: rule__VOS__Group__0
            {
            pushFollow(FOLLOW_rule__VOS__Group__0_in_ruleVOS156);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:118:1: entryRuleKOS : ruleKOS EOF ;
    public final void entryRuleKOS() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:119:1: ( ruleKOS EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:120:1: ruleKOS EOF
            {
             before(grammarAccess.getKOSRule()); 
            pushFollow(FOLLOW_ruleKOS_in_entryRuleKOS183);
            ruleKOS();

            state._fsp--;

             after(grammarAccess.getKOSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKOS190); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:127:1: ruleKOS : ( ( rule__KOS__Group__0 ) ) ;
    public final void ruleKOS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:131:2: ( ( ( rule__KOS__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:132:1: ( ( rule__KOS__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:132:1: ( ( rule__KOS__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:133:1: ( rule__KOS__Group__0 )
            {
             before(grammarAccess.getKOSAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:134:1: ( rule__KOS__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:134:2: rule__KOS__Group__0
            {
            pushFollow(FOLLOW_rule__KOS__Group__0_in_ruleKOS216);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:148:1: entryRuleVOT : ruleVOT EOF ;
    public final void entryRuleVOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:149:1: ( ruleVOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:150:1: ruleVOT EOF
            {
             before(grammarAccess.getVOTRule()); 
            pushFollow(FOLLOW_ruleVOT_in_entryRuleVOT245);
            ruleVOT();

            state._fsp--;

             after(grammarAccess.getVOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVOT252); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:157:1: ruleVOT : ( ( rule__VOT__Group__0 ) ) ;
    public final void ruleVOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:161:2: ( ( ( rule__VOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:162:1: ( ( rule__VOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:162:1: ( ( rule__VOT__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:163:1: ( rule__VOT__Group__0 )
            {
             before(grammarAccess.getVOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:164:1: ( rule__VOT__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:164:2: rule__VOT__Group__0
            {
            pushFollow(FOLLOW_rule__VOT__Group__0_in_ruleVOT278);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:176:1: entryRuleKOT : ruleKOT EOF ;
    public final void entryRuleKOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:177:1: ( ruleKOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:178:1: ruleKOT EOF
            {
             before(grammarAccess.getKOTRule()); 
            pushFollow(FOLLOW_ruleKOT_in_entryRuleKOT305);
            ruleKOT();

            state._fsp--;

             after(grammarAccess.getKOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKOT312); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:185:1: ruleKOT : ( ( rule__KOT__Alternatives ) ) ;
    public final void ruleKOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:189:2: ( ( ( rule__KOT__Alternatives ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:190:1: ( ( rule__KOT__Alternatives ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:190:1: ( ( rule__KOT__Alternatives ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:191:1: ( rule__KOT__Alternatives )
            {
             before(grammarAccess.getKOTAccess().getAlternatives()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:192:1: ( rule__KOT__Alternatives )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:192:2: rule__KOT__Alternatives
            {
            pushFollow(FOLLOW_rule__KOT__Alternatives_in_ruleKOT338);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:204:1: entryRuleOOT : ruleOOT EOF ;
    public final void entryRuleOOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:205:1: ( ruleOOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:206:1: ruleOOT EOF
            {
             before(grammarAccess.getOOTRule()); 
            pushFollow(FOLLOW_ruleOOT_in_entryRuleOOT365);
            ruleOOT();

            state._fsp--;

             after(grammarAccess.getOOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOOT372); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:213:1: ruleOOT : ( ( rule__OOT__Group__0 ) ) ;
    public final void ruleOOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:217:2: ( ( ( rule__OOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:218:1: ( ( rule__OOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:218:1: ( ( rule__OOT__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:219:1: ( rule__OOT__Group__0 )
            {
             before(grammarAccess.getOOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:220:1: ( rule__OOT__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:220:2: rule__OOT__Group__0
            {
            pushFollow(FOLLOW_rule__OOT__Group__0_in_ruleOOT398);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:232:1: entryRuleLOT : ruleLOT EOF ;
    public final void entryRuleLOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:233:1: ( ruleLOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:234:1: ruleLOT EOF
            {
             before(grammarAccess.getLOTRule()); 
            pushFollow(FOLLOW_ruleLOT_in_entryRuleLOT425);
            ruleLOT();

            state._fsp--;

             after(grammarAccess.getLOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOT432); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:241:1: ruleLOT : ( ( rule__LOT__Group__0 ) ) ;
    public final void ruleLOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:245:2: ( ( ( rule__LOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:246:1: ( ( rule__LOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:246:1: ( ( rule__LOT__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:247:1: ( rule__LOT__Group__0 )
            {
             before(grammarAccess.getLOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:248:1: ( rule__LOT__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:248:2: rule__LOT__Group__0
            {
            pushFollow(FOLLOW_rule__LOT__Group__0_in_ruleLOT458);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:260:1: entryRuleTOT : ruleTOT EOF ;
    public final void entryRuleTOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:261:1: ( ruleTOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:262:1: ruleTOT EOF
            {
             before(grammarAccess.getTOTRule()); 
            pushFollow(FOLLOW_ruleTOT_in_entryRuleTOT485);
            ruleTOT();

            state._fsp--;

             after(grammarAccess.getTOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTOT492); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:269:1: ruleTOT : ( ( rule__TOT__Group__0 ) ) ;
    public final void ruleTOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:273:2: ( ( ( rule__TOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:274:1: ( ( rule__TOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:274:1: ( ( rule__TOT__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:275:1: ( rule__TOT__Group__0 )
            {
             before(grammarAccess.getTOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:276:1: ( rule__TOT__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:276:2: rule__TOT__Group__0
            {
            pushFollow(FOLLOW_rule__TOT__Group__0_in_ruleTOT518);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:288:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:289:1: ( ruleAttribut EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:290:1: ruleAttribut EOF
            {
             before(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_ruleAttribut_in_entryRuleAttribut545);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getAttributRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribut552); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:297:1: ruleAttribut : ( ( rule__Attribut__Group__0 ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:301:2: ( ( ( rule__Attribut__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:302:1: ( ( rule__Attribut__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:302:1: ( ( rule__Attribut__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:303:1: ( rule__Attribut__Group__0 )
            {
             before(grammarAccess.getAttributAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:304:1: ( rule__Attribut__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:304:2: rule__Attribut__Group__0
            {
            pushFollow(FOLLOW_rule__Attribut__Group__0_in_ruleAttribut578);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:316:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:317:1: ( ruleOperator EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:318:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator605);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator612); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:325:1: ruleOperator : ( ( rule__Operator__Group__0 ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:329:2: ( ( ( rule__Operator__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:330:1: ( ( rule__Operator__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:330:1: ( ( rule__Operator__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:331:1: ( rule__Operator__Group__0 )
            {
             before(grammarAccess.getOperatorAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:332:1: ( rule__Operator__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:332:2: rule__Operator__Group__0
            {
            pushFollow(FOLLOW_rule__Operator__Group__0_in_ruleOperator638);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:344:1: entryRuleBeziehung : ruleBeziehung EOF ;
    public final void entryRuleBeziehung() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:345:1: ( ruleBeziehung EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:346:1: ruleBeziehung EOF
            {
             before(grammarAccess.getBeziehungRule()); 
            pushFollow(FOLLOW_ruleBeziehung_in_entryRuleBeziehung665);
            ruleBeziehung();

            state._fsp--;

             after(grammarAccess.getBeziehungRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeziehung672); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:353:1: ruleBeziehung : ( ( rule__Beziehung__Alternatives ) ) ;
    public final void ruleBeziehung() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:357:2: ( ( ( rule__Beziehung__Alternatives ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:358:1: ( ( rule__Beziehung__Alternatives ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:358:1: ( ( rule__Beziehung__Alternatives ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:359:1: ( rule__Beziehung__Alternatives )
            {
             before(grammarAccess.getBeziehungAccess().getAlternatives()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:360:1: ( rule__Beziehung__Alternatives )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:360:2: rule__Beziehung__Alternatives
            {
            pushFollow(FOLLOW_rule__Beziehung__Alternatives_in_ruleBeziehung698);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:372:1: entryRuleInteracts_with : ruleInteracts_with EOF ;
    public final void entryRuleInteracts_with() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:373:1: ( ruleInteracts_with EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:374:1: ruleInteracts_with EOF
            {
             before(grammarAccess.getInteracts_withRule()); 
            pushFollow(FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with725);
            ruleInteracts_with();

            state._fsp--;

             after(grammarAccess.getInteracts_withRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteracts_with732); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:381:1: ruleInteracts_with : ( ( rule__Interacts_with__Group__0 ) ) ;
    public final void ruleInteracts_with() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:385:2: ( ( ( rule__Interacts_with__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:386:1: ( ( rule__Interacts_with__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:386:1: ( ( rule__Interacts_with__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:387:1: ( rule__Interacts_with__Group__0 )
            {
             before(grammarAccess.getInteracts_withAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:388:1: ( rule__Interacts_with__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:388:2: rule__Interacts_with__Group__0
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__0_in_ruleInteracts_with758);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:400:1: entryRuleIs_a : ruleIs_a EOF ;
    public final void entryRuleIs_a() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:401:1: ( ruleIs_a EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:402:1: ruleIs_a EOF
            {
             before(grammarAccess.getIs_aRule()); 
            pushFollow(FOLLOW_ruleIs_a_in_entryRuleIs_a785);
            ruleIs_a();

            state._fsp--;

             after(grammarAccess.getIs_aRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_a792); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:409:1: ruleIs_a : ( ( rule__Is_a__Group__0 ) ) ;
    public final void ruleIs_a() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:413:2: ( ( ( rule__Is_a__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:414:1: ( ( rule__Is_a__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:414:1: ( ( rule__Is_a__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:415:1: ( rule__Is_a__Group__0 )
            {
             before(grammarAccess.getIs_aAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:416:1: ( rule__Is_a__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:416:2: rule__Is_a__Group__0
            {
            pushFollow(FOLLOW_rule__Is_a__Group__0_in_ruleIs_a818);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:428:1: entryRuleIs_part_of : ruleIs_part_of EOF ;
    public final void entryRuleIs_part_of() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:429:1: ( ruleIs_part_of EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:430:1: ruleIs_part_of EOF
            {
             before(grammarAccess.getIs_part_ofRule()); 
            pushFollow(FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of845);
            ruleIs_part_of();

            state._fsp--;

             after(grammarAccess.getIs_part_ofRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_part_of852); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:437:1: ruleIs_part_of : ( ( rule__Is_part_of__Group__0 ) ) ;
    public final void ruleIs_part_of() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:441:2: ( ( ( rule__Is_part_of__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:442:1: ( ( rule__Is_part_of__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:442:1: ( ( rule__Is_part_of__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:443:1: ( rule__Is_part_of__Group__0 )
            {
             before(grammarAccess.getIs_part_ofAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:444:1: ( rule__Is_part_of__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:444:2: rule__Is_part_of__Group__0
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__0_in_ruleIs_part_of878);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:458:1: entryRuleKardinalitaet01 : ruleKardinalitaet01 EOF ;
    public final void entryRuleKardinalitaet01() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:459:1: ( ruleKardinalitaet01 EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:460:1: ruleKardinalitaet01 EOF
            {
             before(grammarAccess.getKardinalitaet01Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet01907);
            ruleKardinalitaet01();

            state._fsp--;

             after(grammarAccess.getKardinalitaet01Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet01914); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:467:1: ruleKardinalitaet01 : ( ( rule__Kardinalitaet01__Group__0 ) ) ;
    public final void ruleKardinalitaet01() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:471:2: ( ( ( rule__Kardinalitaet01__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:472:1: ( ( rule__Kardinalitaet01__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:472:1: ( ( rule__Kardinalitaet01__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:473:1: ( rule__Kardinalitaet01__Group__0 )
            {
             before(grammarAccess.getKardinalitaet01Access().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:474:1: ( rule__Kardinalitaet01__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:474:2: rule__Kardinalitaet01__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__0_in_ruleKardinalitaet01940);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:486:1: entryRuleKardinalitaet0x : ruleKardinalitaet0x EOF ;
    public final void entryRuleKardinalitaet0x() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:487:1: ( ruleKardinalitaet0x EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:488:1: ruleKardinalitaet0x EOF
            {
             before(grammarAccess.getKardinalitaet0xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x967);
            ruleKardinalitaet0x();

            state._fsp--;

             after(grammarAccess.getKardinalitaet0xRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet0x974); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:495:1: ruleKardinalitaet0x : ( ( rule__Kardinalitaet0x__Group__0 ) ) ;
    public final void ruleKardinalitaet0x() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:499:2: ( ( ( rule__Kardinalitaet0x__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:500:1: ( ( rule__Kardinalitaet0x__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:500:1: ( ( rule__Kardinalitaet0x__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:501:1: ( rule__Kardinalitaet0x__Group__0 )
            {
             before(grammarAccess.getKardinalitaet0xAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:502:1: ( rule__Kardinalitaet0x__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:502:2: rule__Kardinalitaet0x__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__0_in_ruleKardinalitaet0x1000);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:514:1: entryRuleKardinalitaet11 : ruleKardinalitaet11 EOF ;
    public final void entryRuleKardinalitaet11() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:515:1: ( ruleKardinalitaet11 EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:516:1: ruleKardinalitaet11 EOF
            {
             before(grammarAccess.getKardinalitaet11Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet111027);
            ruleKardinalitaet11();

            state._fsp--;

             after(grammarAccess.getKardinalitaet11Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet111034); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:523:1: ruleKardinalitaet11 : ( ( rule__Kardinalitaet11__Group__0 ) ) ;
    public final void ruleKardinalitaet11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:527:2: ( ( ( rule__Kardinalitaet11__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:528:1: ( ( rule__Kardinalitaet11__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:528:1: ( ( rule__Kardinalitaet11__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:529:1: ( rule__Kardinalitaet11__Group__0 )
            {
             before(grammarAccess.getKardinalitaet11Access().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:530:1: ( rule__Kardinalitaet11__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:530:2: rule__Kardinalitaet11__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__0_in_ruleKardinalitaet111060);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:542:1: entryRuleKardinalitaet1x : ruleKardinalitaet1x EOF ;
    public final void entryRuleKardinalitaet1x() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:543:1: ( ruleKardinalitaet1x EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:544:1: ruleKardinalitaet1x EOF
            {
             before(grammarAccess.getKardinalitaet1xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x1087);
            ruleKardinalitaet1x();

            state._fsp--;

             after(grammarAccess.getKardinalitaet1xRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet1x1094); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:551:1: ruleKardinalitaet1x : ( ( rule__Kardinalitaet1x__Group__0 ) ) ;
    public final void ruleKardinalitaet1x() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:555:2: ( ( ( rule__Kardinalitaet1x__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:556:1: ( ( rule__Kardinalitaet1x__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:556:1: ( ( rule__Kardinalitaet1x__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:557:1: ( rule__Kardinalitaet1x__Group__0 )
            {
             before(grammarAccess.getKardinalitaet1xAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:558:1: ( rule__Kardinalitaet1x__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:558:2: rule__Kardinalitaet1x__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__0_in_ruleKardinalitaet1x1120);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:570:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:571:1: ( ruleAnnotation EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:572:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1147);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1154); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:579:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:583:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:584:1: ( ( rule__Annotation__Alternatives ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:584:1: ( ( rule__Annotation__Alternatives ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:585:1: ( rule__Annotation__Alternatives )
            {
             before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:586:1: ( rule__Annotation__Alternatives )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:586:2: rule__Annotation__Alternatives
            {
            pushFollow(FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1180);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:598:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:599:1: ( ruleName EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:600:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName1207);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName1214); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:607:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:611:2: ( ( ( rule__Name__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:612:1: ( ( rule__Name__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:612:1: ( ( rule__Name__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:613:1: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:614:1: ( rule__Name__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:614:2: rule__Name__Group__0
            {
            pushFollow(FOLLOW_rule__Name__Group__0_in_ruleName1240);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:626:1: entryRuleMerge : ruleMerge EOF ;
    public final void entryRuleMerge() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:627:1: ( ruleMerge EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:628:1: ruleMerge EOF
            {
             before(grammarAccess.getMergeRule()); 
            pushFollow(FOLLOW_ruleMerge_in_entryRuleMerge1267);
            ruleMerge();

            state._fsp--;

             after(grammarAccess.getMergeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMerge1274); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:635:1: ruleMerge : ( ( rule__Merge__Group__0 ) ) ;
    public final void ruleMerge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:639:2: ( ( ( rule__Merge__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:640:1: ( ( rule__Merge__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:640:1: ( ( rule__Merge__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:641:1: ( rule__Merge__Group__0 )
            {
             before(grammarAccess.getMergeAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:642:1: ( rule__Merge__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:642:2: rule__Merge__Group__0
            {
            pushFollow(FOLLOW_rule__Merge__Group__0_in_ruleMerge1300);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:654:1: entryRuleIgnore : ruleIgnore EOF ;
    public final void entryRuleIgnore() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:655:1: ( ruleIgnore EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:656:1: ruleIgnore EOF
            {
             before(grammarAccess.getIgnoreRule()); 
            pushFollow(FOLLOW_ruleIgnore_in_entryRuleIgnore1327);
            ruleIgnore();

            state._fsp--;

             after(grammarAccess.getIgnoreRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIgnore1334); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:663:1: ruleIgnore : ( ( rule__Ignore__Group__0 ) ) ;
    public final void ruleIgnore() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:667:2: ( ( ( rule__Ignore__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:668:1: ( ( rule__Ignore__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:668:1: ( ( rule__Ignore__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:669:1: ( rule__Ignore__Group__0 )
            {
             before(grammarAccess.getIgnoreAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:670:1: ( rule__Ignore__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:670:2: rule__Ignore__Group__0
            {
            pushFollow(FOLLOW_rule__Ignore__Group__0_in_ruleIgnore1360);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:682:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:683:1: ( ruleVersion EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:684:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion1387);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion1394); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:691:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:695:2: ( ( ( rule__Version__Group__0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:696:1: ( ( rule__Version__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:696:1: ( ( rule__Version__Group__0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:697:1: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:698:1: ( rule__Version__Group__0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:698:2: rule__Version__Group__0
            {
            pushFollow(FOLLOW_rule__Version__Group__0_in_ruleVersion1420);
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


    // $ANTLR start "rule__VOS__Alternatives_0"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:711:1: rule__VOS__Alternatives_0 : ( ( ( rule__VOS__NameAssignment_0_0 ) ) | ( ( rule__VOS__NameAssignment_0_1 ) ) );
    public final void rule__VOS__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:715:1: ( ( ( rule__VOS__NameAssignment_0_0 ) ) | ( ( rule__VOS__NameAssignment_0_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==38) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:716:1: ( ( rule__VOS__NameAssignment_0_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:716:1: ( ( rule__VOS__NameAssignment_0_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:717:1: ( rule__VOS__NameAssignment_0_0 )
                    {
                     before(grammarAccess.getVOSAccess().getNameAssignment_0_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:718:1: ( rule__VOS__NameAssignment_0_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:718:2: rule__VOS__NameAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__VOS__NameAssignment_0_0_in_rule__VOS__Alternatives_01457);
                    rule__VOS__NameAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVOSAccess().getNameAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:722:6: ( ( rule__VOS__NameAssignment_0_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:722:6: ( ( rule__VOS__NameAssignment_0_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:723:1: ( rule__VOS__NameAssignment_0_1 )
                    {
                     before(grammarAccess.getVOSAccess().getNameAssignment_0_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:724:1: ( rule__VOS__NameAssignment_0_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:724:2: rule__VOS__NameAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__VOS__NameAssignment_0_1_in_rule__VOS__Alternatives_01475);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:733:1: rule__VOS__Alternatives_2 : ( ( ( rule__VOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__VOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__VOS__GliederungAssignment_2_2 ) ) );
    public final void rule__VOS__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:737:1: ( ( ( rule__VOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__VOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__VOS__GliederungAssignment_2_2 ) ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:738:1: ( ( rule__VOS__ObjekttypenAssignment_2_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:738:1: ( ( rule__VOS__ObjekttypenAssignment_2_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:739:1: ( rule__VOS__ObjekttypenAssignment_2_0 )
                    {
                     before(grammarAccess.getVOSAccess().getObjekttypenAssignment_2_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:740:1: ( rule__VOS__ObjekttypenAssignment_2_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:740:2: rule__VOS__ObjekttypenAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__VOS__ObjekttypenAssignment_2_0_in_rule__VOS__Alternatives_21508);
                    rule__VOS__ObjekttypenAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVOSAccess().getObjekttypenAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:744:6: ( ( rule__VOS__BeziehungenAssignment_2_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:744:6: ( ( rule__VOS__BeziehungenAssignment_2_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:745:1: ( rule__VOS__BeziehungenAssignment_2_1 )
                    {
                     before(grammarAccess.getVOSAccess().getBeziehungenAssignment_2_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:746:1: ( rule__VOS__BeziehungenAssignment_2_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:746:2: rule__VOS__BeziehungenAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__VOS__BeziehungenAssignment_2_1_in_rule__VOS__Alternatives_21526);
                    rule__VOS__BeziehungenAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVOSAccess().getBeziehungenAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:750:6: ( ( rule__VOS__GliederungAssignment_2_2 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:750:6: ( ( rule__VOS__GliederungAssignment_2_2 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:751:1: ( rule__VOS__GliederungAssignment_2_2 )
                    {
                     before(grammarAccess.getVOSAccess().getGliederungAssignment_2_2()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:752:1: ( rule__VOS__GliederungAssignment_2_2 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:752:2: rule__VOS__GliederungAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__VOS__GliederungAssignment_2_2_in_rule__VOS__Alternatives_21544);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:761:1: rule__KOS__Alternatives_0 : ( ( ( rule__KOS__NameAssignment_0_0 ) ) | ( ( rule__KOS__NameAssignment_0_1 ) ) );
    public final void rule__KOS__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:765:1: ( ( ( rule__KOS__NameAssignment_0_0 ) ) | ( ( rule__KOS__NameAssignment_0_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==39) ) {
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
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:766:1: ( ( rule__KOS__NameAssignment_0_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:766:1: ( ( rule__KOS__NameAssignment_0_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:767:1: ( rule__KOS__NameAssignment_0_0 )
                    {
                     before(grammarAccess.getKOSAccess().getNameAssignment_0_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:768:1: ( rule__KOS__NameAssignment_0_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:768:2: rule__KOS__NameAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__KOS__NameAssignment_0_0_in_rule__KOS__Alternatives_01577);
                    rule__KOS__NameAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKOSAccess().getNameAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:772:6: ( ( rule__KOS__NameAssignment_0_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:772:6: ( ( rule__KOS__NameAssignment_0_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:773:1: ( rule__KOS__NameAssignment_0_1 )
                    {
                     before(grammarAccess.getKOSAccess().getNameAssignment_0_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:774:1: ( rule__KOS__NameAssignment_0_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:774:2: rule__KOS__NameAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__KOS__NameAssignment_0_1_in_rule__KOS__Alternatives_01595);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:783:1: rule__KOS__Alternatives_2 : ( ( ( rule__KOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__KOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__KOS__GliederungAssignment_2_2 ) ) );
    public final void rule__KOS__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:787:1: ( ( ( rule__KOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__KOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__KOS__GliederungAssignment_2_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:788:1: ( ( rule__KOS__ObjekttypenAssignment_2_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:788:1: ( ( rule__KOS__ObjekttypenAssignment_2_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:789:1: ( rule__KOS__ObjekttypenAssignment_2_0 )
                    {
                     before(grammarAccess.getKOSAccess().getObjekttypenAssignment_2_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:790:1: ( rule__KOS__ObjekttypenAssignment_2_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:790:2: rule__KOS__ObjekttypenAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__KOS__ObjekttypenAssignment_2_0_in_rule__KOS__Alternatives_21628);
                    rule__KOS__ObjekttypenAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKOSAccess().getObjekttypenAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:794:6: ( ( rule__KOS__BeziehungenAssignment_2_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:794:6: ( ( rule__KOS__BeziehungenAssignment_2_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:795:1: ( rule__KOS__BeziehungenAssignment_2_1 )
                    {
                     before(grammarAccess.getKOSAccess().getBeziehungenAssignment_2_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:796:1: ( rule__KOS__BeziehungenAssignment_2_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:796:2: rule__KOS__BeziehungenAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__KOS__BeziehungenAssignment_2_1_in_rule__KOS__Alternatives_21646);
                    rule__KOS__BeziehungenAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getKOSAccess().getBeziehungenAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:800:6: ( ( rule__KOS__GliederungAssignment_2_2 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:800:6: ( ( rule__KOS__GliederungAssignment_2_2 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:801:1: ( rule__KOS__GliederungAssignment_2_2 )
                    {
                     before(grammarAccess.getKOSAccess().getGliederungAssignment_2_2()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:802:1: ( rule__KOS__GliederungAssignment_2_2 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:802:2: rule__KOS__GliederungAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__KOS__GliederungAssignment_2_2_in_rule__KOS__Alternatives_21664);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:812:1: rule__VOT__Alternatives_4 : ( ( ( rule__VOT__AttributeAssignment_4_0 ) ) | ( ( rule__VOT__OperatorenAssignment_4_1 ) ) );
    public final void rule__VOT__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:816:1: ( ( ( rule__VOT__AttributeAssignment_4_0 ) ) | ( ( rule__VOT__OperatorenAssignment_4_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID||LA5_1==28) ) {
                    alt5=1;
                }
                else if ( (LA5_1==29) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:817:1: ( ( rule__VOT__AttributeAssignment_4_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:817:1: ( ( rule__VOT__AttributeAssignment_4_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:818:1: ( rule__VOT__AttributeAssignment_4_0 )
                    {
                     before(grammarAccess.getVOTAccess().getAttributeAssignment_4_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:819:1: ( rule__VOT__AttributeAssignment_4_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:819:2: rule__VOT__AttributeAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__VOT__AttributeAssignment_4_0_in_rule__VOT__Alternatives_41698);
                    rule__VOT__AttributeAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVOTAccess().getAttributeAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:823:6: ( ( rule__VOT__OperatorenAssignment_4_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:823:6: ( ( rule__VOT__OperatorenAssignment_4_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:824:1: ( rule__VOT__OperatorenAssignment_4_1 )
                    {
                     before(grammarAccess.getVOTAccess().getOperatorenAssignment_4_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:825:1: ( rule__VOT__OperatorenAssignment_4_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:825:2: rule__VOT__OperatorenAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__VOT__OperatorenAssignment_4_1_in_rule__VOT__Alternatives_41716);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:834:1: rule__KOT__Alternatives : ( ( ruleOOT ) | ( ruleLOT ) | ( ruleTOT ) );
    public final void rule__KOT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:838:1: ( ( ruleOOT ) | ( ruleLOT ) | ( ruleTOT ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:839:1: ( ruleOOT )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:839:1: ( ruleOOT )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:840:1: ruleOOT
                    {
                     before(grammarAccess.getKOTAccess().getOOTParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOOT_in_rule__KOT__Alternatives1749);
                    ruleOOT();

                    state._fsp--;

                     after(grammarAccess.getKOTAccess().getOOTParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:845:6: ( ruleLOT )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:845:6: ( ruleLOT )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:846:1: ruleLOT
                    {
                     before(grammarAccess.getKOTAccess().getLOTParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLOT_in_rule__KOT__Alternatives1766);
                    ruleLOT();

                    state._fsp--;

                     after(grammarAccess.getKOTAccess().getLOTParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:851:6: ( ruleTOT )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:851:6: ( ruleTOT )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:852:1: ruleTOT
                    {
                     before(grammarAccess.getKOTAccess().getTOTParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTOT_in_rule__KOT__Alternatives1783);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:862:1: rule__OOT__Alternatives_4 : ( ( ( rule__OOT__AttributeAssignment_4_0 ) ) | ( ( rule__OOT__OperatorenAssignment_4_1 ) ) );
    public final void rule__OOT__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:866:1: ( ( ( rule__OOT__AttributeAssignment_4_0 ) ) | ( ( rule__OOT__OperatorenAssignment_4_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID||LA7_1==28) ) {
                    alt7=1;
                }
                else if ( (LA7_1==29) ) {
                    alt7=2;
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
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:867:1: ( ( rule__OOT__AttributeAssignment_4_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:867:1: ( ( rule__OOT__AttributeAssignment_4_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:868:1: ( rule__OOT__AttributeAssignment_4_0 )
                    {
                     before(grammarAccess.getOOTAccess().getAttributeAssignment_4_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:869:1: ( rule__OOT__AttributeAssignment_4_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:869:2: rule__OOT__AttributeAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__OOT__AttributeAssignment_4_0_in_rule__OOT__Alternatives_41815);
                    rule__OOT__AttributeAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOOTAccess().getAttributeAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:873:6: ( ( rule__OOT__OperatorenAssignment_4_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:873:6: ( ( rule__OOT__OperatorenAssignment_4_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:874:1: ( rule__OOT__OperatorenAssignment_4_1 )
                    {
                     before(grammarAccess.getOOTAccess().getOperatorenAssignment_4_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:875:1: ( rule__OOT__OperatorenAssignment_4_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:875:2: rule__OOT__OperatorenAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__OOT__OperatorenAssignment_4_1_in_rule__OOT__Alternatives_41833);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:884:1: rule__LOT__Alternatives_4 : ( ( ( rule__LOT__AttributeAssignment_4_0 ) ) | ( ( rule__LOT__OperatorenAssignment_4_1 ) ) );
    public final void rule__LOT__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:888:1: ( ( ( rule__LOT__AttributeAssignment_4_0 ) ) | ( ( rule__LOT__OperatorenAssignment_4_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==29) ) {
                    alt8=2;
                }
                else if ( (LA8_1==RULE_ID||LA8_1==28) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:889:1: ( ( rule__LOT__AttributeAssignment_4_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:889:1: ( ( rule__LOT__AttributeAssignment_4_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:890:1: ( rule__LOT__AttributeAssignment_4_0 )
                    {
                     before(grammarAccess.getLOTAccess().getAttributeAssignment_4_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:891:1: ( rule__LOT__AttributeAssignment_4_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:891:2: rule__LOT__AttributeAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__LOT__AttributeAssignment_4_0_in_rule__LOT__Alternatives_41866);
                    rule__LOT__AttributeAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLOTAccess().getAttributeAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:895:6: ( ( rule__LOT__OperatorenAssignment_4_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:895:6: ( ( rule__LOT__OperatorenAssignment_4_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:896:1: ( rule__LOT__OperatorenAssignment_4_1 )
                    {
                     before(grammarAccess.getLOTAccess().getOperatorenAssignment_4_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:897:1: ( rule__LOT__OperatorenAssignment_4_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:897:2: rule__LOT__OperatorenAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__LOT__OperatorenAssignment_4_1_in_rule__LOT__Alternatives_41884);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:906:1: rule__TOT__Alternatives_4 : ( ( ( rule__TOT__AttributeAssignment_4_0 ) ) | ( ( rule__TOT__OperatorenAssignment_4_1 ) ) );
    public final void rule__TOT__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:910:1: ( ( ( rule__TOT__AttributeAssignment_4_0 ) ) | ( ( rule__TOT__OperatorenAssignment_4_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_ID||LA9_1==28) ) {
                    alt9=1;
                }
                else if ( (LA9_1==29) ) {
                    alt9=2;
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
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:911:1: ( ( rule__TOT__AttributeAssignment_4_0 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:911:1: ( ( rule__TOT__AttributeAssignment_4_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:912:1: ( rule__TOT__AttributeAssignment_4_0 )
                    {
                     before(grammarAccess.getTOTAccess().getAttributeAssignment_4_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:913:1: ( rule__TOT__AttributeAssignment_4_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:913:2: rule__TOT__AttributeAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__TOT__AttributeAssignment_4_0_in_rule__TOT__Alternatives_41917);
                    rule__TOT__AttributeAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTOTAccess().getAttributeAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:917:6: ( ( rule__TOT__OperatorenAssignment_4_1 ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:917:6: ( ( rule__TOT__OperatorenAssignment_4_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:918:1: ( rule__TOT__OperatorenAssignment_4_1 )
                    {
                     before(grammarAccess.getTOTAccess().getOperatorenAssignment_4_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:919:1: ( rule__TOT__OperatorenAssignment_4_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:919:2: rule__TOT__OperatorenAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__TOT__OperatorenAssignment_4_1_in_rule__TOT__Alternatives_41935);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:928:1: rule__Beziehung__Alternatives : ( ( ruleInteracts_with ) | ( ruleIs_a ) | ( ruleIs_part_of ) );
    public final void rule__Beziehung__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:932:1: ( ( ruleInteracts_with ) | ( ruleIs_a ) | ( ruleIs_part_of ) )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:933:1: ( ruleInteracts_with )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:933:1: ( ruleInteracts_with )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:934:1: ruleInteracts_with
                    {
                     before(grammarAccess.getBeziehungAccess().getInteracts_withParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInteracts_with_in_rule__Beziehung__Alternatives1968);
                    ruleInteracts_with();

                    state._fsp--;

                     after(grammarAccess.getBeziehungAccess().getInteracts_withParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:939:6: ( ruleIs_a )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:939:6: ( ruleIs_a )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:940:1: ruleIs_a
                    {
                     before(grammarAccess.getBeziehungAccess().getIs_aParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIs_a_in_rule__Beziehung__Alternatives1985);
                    ruleIs_a();

                    state._fsp--;

                     after(grammarAccess.getBeziehungAccess().getIs_aParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:945:6: ( ruleIs_part_of )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:945:6: ( ruleIs_part_of )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:946:1: ruleIs_part_of
                    {
                     before(grammarAccess.getBeziehungAccess().getIs_part_ofParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIs_part_of_in_rule__Beziehung__Alternatives2002);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:956:1: rule__Interacts_with__KardinalitaetAlternatives_3_0 : ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) );
    public final void rule__Interacts_with__KardinalitaetAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:960:1: ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt11=1;
                }
                break;
            case 14:
            case 15:
                {
                alt11=2;
                }
                break;
            case 18:
            case 19:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:961:1: ( ruleKardinalitaet01 )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:961:1: ( ruleKardinalitaet01 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:962:1: ruleKardinalitaet01
                    {
                     before(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_rule__Interacts_with__KardinalitaetAlternatives_3_02034);
                    ruleKardinalitaet01();

                    state._fsp--;

                     after(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:967:6: ( ruleKardinalitaet0x )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:967:6: ( ruleKardinalitaet0x )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:968:1: ruleKardinalitaet0x
                    {
                     before(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_rule__Interacts_with__KardinalitaetAlternatives_3_02051);
                    ruleKardinalitaet0x();

                    state._fsp--;

                     after(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:973:6: ( ruleKardinalitaet1x )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:973:6: ( ruleKardinalitaet1x )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:974:1: ruleKardinalitaet1x
                    {
                     before(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet1xParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_rule__Interacts_with__KardinalitaetAlternatives_3_02068);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:984:1: rule__Is_a__KardinalitaetAlternatives_3_0 : ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet11 ) );
    public final void rule__Is_a__KardinalitaetAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:988:1: ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet11 ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=12 && LA12_0<=13)) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=16 && LA12_0<=17)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:989:1: ( ruleKardinalitaet01 )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:989:1: ( ruleKardinalitaet01 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:990:1: ruleKardinalitaet01
                    {
                     before(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_rule__Is_a__KardinalitaetAlternatives_3_02100);
                    ruleKardinalitaet01();

                    state._fsp--;

                     after(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:995:6: ( ruleKardinalitaet11 )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:995:6: ( ruleKardinalitaet11 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:996:1: ruleKardinalitaet11
                    {
                     before(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet11ParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleKardinalitaet11_in_rule__Is_a__KardinalitaetAlternatives_3_02117);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1006:1: rule__Is_part_of__KardinalitaetAlternatives_3_0 : ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) );
    public final void rule__Is_part_of__KardinalitaetAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1010:1: ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) )
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
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1011:1: ( ruleKardinalitaet01 )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1011:1: ( ruleKardinalitaet01 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1012:1: ruleKardinalitaet01
                    {
                     before(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_rule__Is_part_of__KardinalitaetAlternatives_3_02149);
                    ruleKardinalitaet01();

                    state._fsp--;

                     after(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1017:6: ( ruleKardinalitaet0x )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1017:6: ( ruleKardinalitaet0x )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1018:1: ruleKardinalitaet0x
                    {
                     before(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_rule__Is_part_of__KardinalitaetAlternatives_3_02166);
                    ruleKardinalitaet0x();

                    state._fsp--;

                     after(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1023:6: ( ruleKardinalitaet1x )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1023:6: ( ruleKardinalitaet1x )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1024:1: ruleKardinalitaet1x
                    {
                     before(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet1xParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_rule__Is_part_of__KardinalitaetAlternatives_3_02183);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1035:1: rule__Kardinalitaet01__Alternatives_0 : ( ( '--' ) | ( '(0,1)' ) );
    public final void rule__Kardinalitaet01__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1039:1: ( ( '--' ) | ( '(0,1)' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            else if ( (LA14_0==13) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1040:1: ( '--' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1040:1: ( '--' )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1041:1: '--'
                    {
                     before(grammarAccess.getKardinalitaet01Access().getHyphenMinusHyphenMinusKeyword_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Kardinalitaet01__Alternatives_02217); 
                     after(grammarAccess.getKardinalitaet01Access().getHyphenMinusHyphenMinusKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1048:6: ( '(0,1)' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1048:6: ( '(0,1)' )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1049:1: '(0,1)'
                    {
                     before(grammarAccess.getKardinalitaet01Access().getLeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Kardinalitaet01__Alternatives_02237); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1061:1: rule__Kardinalitaet0x__Alternatives_0 : ( ( '->' ) | ( '(0,*)' ) );
    public final void rule__Kardinalitaet0x__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1065:1: ( ( '->' ) | ( '(0,*)' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                alt15=1;
            }
            else if ( (LA15_0==15) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1066:1: ( '->' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1066:1: ( '->' )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1067:1: '->'
                    {
                     before(grammarAccess.getKardinalitaet0xAccess().getHyphenMinusGreaterThanSignKeyword_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Kardinalitaet0x__Alternatives_02272); 
                     after(grammarAccess.getKardinalitaet0xAccess().getHyphenMinusGreaterThanSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1074:6: ( '(0,*)' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1074:6: ( '(0,*)' )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1075:1: '(0,*)'
                    {
                     before(grammarAccess.getKardinalitaet0xAccess().getLeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Kardinalitaet0x__Alternatives_02292); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1087:1: rule__Kardinalitaet11__Alternatives_0 : ( ( '==' ) | ( '(1,1)' ) );
    public final void rule__Kardinalitaet11__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1091:1: ( ( '==' ) | ( '(1,1)' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            else if ( (LA16_0==17) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1092:1: ( '==' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1092:1: ( '==' )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1093:1: '=='
                    {
                     before(grammarAccess.getKardinalitaet11Access().getEqualsSignEqualsSignKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Kardinalitaet11__Alternatives_02327); 
                     after(grammarAccess.getKardinalitaet11Access().getEqualsSignEqualsSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1100:6: ( '(1,1)' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1100:6: ( '(1,1)' )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1101:1: '(1,1)'
                    {
                     before(grammarAccess.getKardinalitaet11Access().getLeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Kardinalitaet11__Alternatives_02347); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1113:1: rule__Kardinalitaet1x__Alternatives_0 : ( ( '=>' ) | ( '(1,*)' ) );
    public final void rule__Kardinalitaet1x__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1117:1: ( ( '=>' ) | ( '(1,*)' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            else if ( (LA17_0==19) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1118:1: ( '=>' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1118:1: ( '=>' )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1119:1: '=>'
                    {
                     before(grammarAccess.getKardinalitaet1xAccess().getEqualsSignGreaterThanSignKeyword_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__Kardinalitaet1x__Alternatives_02382); 
                     after(grammarAccess.getKardinalitaet1xAccess().getEqualsSignGreaterThanSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1126:6: ( '(1,*)' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1126:6: ( '(1,*)' )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1127:1: '(1,*)'
                    {
                     before(grammarAccess.getKardinalitaet1xAccess().getLeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__Kardinalitaet1x__Alternatives_02402); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1139:1: rule__Annotation__Alternatives : ( ( ruleName ) | ( ruleIgnore ) | ( ruleMerge ) | ( ruleVersion ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1143:1: ( ( ruleName ) | ( ruleIgnore ) | ( ruleMerge ) | ( ruleVersion ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt18=1;
                }
                break;
            case 36:
                {
                alt18=2;
                }
                break;
            case 35:
                {
                alt18=3;
                }
                break;
            case 37:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1144:1: ( ruleName )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1144:1: ( ruleName )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1145:1: ruleName
                    {
                     before(grammarAccess.getAnnotationAccess().getNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleName_in_rule__Annotation__Alternatives2436);
                    ruleName();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1150:6: ( ruleIgnore )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1150:6: ( ruleIgnore )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1151:1: ruleIgnore
                    {
                     before(grammarAccess.getAnnotationAccess().getIgnoreParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIgnore_in_rule__Annotation__Alternatives2453);
                    ruleIgnore();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getIgnoreParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1156:6: ( ruleMerge )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1156:6: ( ruleMerge )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1157:1: ruleMerge
                    {
                     before(grammarAccess.getAnnotationAccess().getMergeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMerge_in_rule__Annotation__Alternatives2470);
                    ruleMerge();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getMergeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1162:6: ( ruleVersion )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1162:6: ( ruleVersion )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1163:1: ruleVersion
                    {
                     before(grammarAccess.getAnnotationAccess().getVersionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleVersion_in_rule__Annotation__Alternatives2487);
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


    // $ANTLR start "rule__AwS__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1175:1: rule__AwS__Group__0 : rule__AwS__Group__0__Impl rule__AwS__Group__1 ;
    public final void rule__AwS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1179:1: ( rule__AwS__Group__0__Impl rule__AwS__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1180:2: rule__AwS__Group__0__Impl rule__AwS__Group__1
            {
            pushFollow(FOLLOW_rule__AwS__Group__0__Impl_in_rule__AwS__Group__02517);
            rule__AwS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AwS__Group__1_in_rule__AwS__Group__02520);
            rule__AwS__Group__1();

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
    // $ANTLR end "rule__AwS__Group__0"


    // $ANTLR start "rule__AwS__Group__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1187:1: rule__AwS__Group__0__Impl : ( 'AwS:' ) ;
    public final void rule__AwS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1191:1: ( ( 'AwS:' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1192:1: ( 'AwS:' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1192:1: ( 'AwS:' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1193:1: 'AwS:'
            {
             before(grammarAccess.getAwSAccess().getAwSKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__AwS__Group__0__Impl2548); 
             after(grammarAccess.getAwSAccess().getAwSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AwS__Group__0__Impl"


    // $ANTLR start "rule__AwS__Group__1"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1206:1: rule__AwS__Group__1 : rule__AwS__Group__1__Impl rule__AwS__Group__2 ;
    public final void rule__AwS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1210:1: ( rule__AwS__Group__1__Impl rule__AwS__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1211:2: rule__AwS__Group__1__Impl rule__AwS__Group__2
            {
            pushFollow(FOLLOW_rule__AwS__Group__1__Impl_in_rule__AwS__Group__12579);
            rule__AwS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AwS__Group__2_in_rule__AwS__Group__12582);
            rule__AwS__Group__2();

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
    // $ANTLR end "rule__AwS__Group__1"


    // $ANTLR start "rule__AwS__Group__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1218:1: rule__AwS__Group__1__Impl : ( ( rule__AwS__NameAssignment_1 ) ) ;
    public final void rule__AwS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1222:1: ( ( ( rule__AwS__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1223:1: ( ( rule__AwS__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1223:1: ( ( rule__AwS__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1224:1: ( rule__AwS__NameAssignment_1 )
            {
             before(grammarAccess.getAwSAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1225:1: ( rule__AwS__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1225:2: rule__AwS__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AwS__NameAssignment_1_in_rule__AwS__Group__1__Impl2609);
            rule__AwS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAwSAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AwS__Group__1__Impl"


    // $ANTLR start "rule__AwS__Group__2"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1235:1: rule__AwS__Group__2 : rule__AwS__Group__2__Impl rule__AwS__Group__3 ;
    public final void rule__AwS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1239:1: ( rule__AwS__Group__2__Impl rule__AwS__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1240:2: rule__AwS__Group__2__Impl rule__AwS__Group__3
            {
            pushFollow(FOLLOW_rule__AwS__Group__2__Impl_in_rule__AwS__Group__22639);
            rule__AwS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AwS__Group__3_in_rule__AwS__Group__22642);
            rule__AwS__Group__3();

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
    // $ANTLR end "rule__AwS__Group__2"


    // $ANTLR start "rule__AwS__Group__2__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1247:1: rule__AwS__Group__2__Impl : ( ( rule__AwS__Group_2__0 )? ) ;
    public final void rule__AwS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1251:1: ( ( ( rule__AwS__Group_2__0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1252:1: ( ( rule__AwS__Group_2__0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1252:1: ( ( rule__AwS__Group_2__0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1253:1: ( rule__AwS__Group_2__0 )?
            {
             before(grammarAccess.getAwSAccess().getGroup_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1254:1: ( rule__AwS__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1254:2: rule__AwS__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AwS__Group_2__0_in_rule__AwS__Group__2__Impl2669);
                    rule__AwS__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAwSAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AwS__Group__2__Impl"


    // $ANTLR start "rule__AwS__Group__3"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1264:1: rule__AwS__Group__3 : rule__AwS__Group__3__Impl ;
    public final void rule__AwS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1268:1: ( rule__AwS__Group__3__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1269:2: rule__AwS__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AwS__Group__3__Impl_in_rule__AwS__Group__32700);
            rule__AwS__Group__3__Impl();

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
    // $ANTLR end "rule__AwS__Group__3"


    // $ANTLR start "rule__AwS__Group__3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1275:1: rule__AwS__Group__3__Impl : ( ( rule__AwS__UnorderedGroup_3 ) ) ;
    public final void rule__AwS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1279:1: ( ( ( rule__AwS__UnorderedGroup_3 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1280:1: ( ( rule__AwS__UnorderedGroup_3 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1280:1: ( ( rule__AwS__UnorderedGroup_3 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1281:1: ( rule__AwS__UnorderedGroup_3 )
            {
             before(grammarAccess.getAwSAccess().getUnorderedGroup_3()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1282:1: ( rule__AwS__UnorderedGroup_3 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1282:2: rule__AwS__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__AwS__UnorderedGroup_3_in_rule__AwS__Group__3__Impl2727);
            rule__AwS__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getAwSAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AwS__Group__3__Impl"


    // $ANTLR start "rule__AwS__Group_2__0"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1300:1: rule__AwS__Group_2__0 : rule__AwS__Group_2__0__Impl rule__AwS__Group_2__1 ;
    public final void rule__AwS__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1304:1: ( rule__AwS__Group_2__0__Impl rule__AwS__Group_2__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1305:2: rule__AwS__Group_2__0__Impl rule__AwS__Group_2__1
            {
            pushFollow(FOLLOW_rule__AwS__Group_2__0__Impl_in_rule__AwS__Group_2__02765);
            rule__AwS__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AwS__Group_2__1_in_rule__AwS__Group_2__02768);
            rule__AwS__Group_2__1();

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
    // $ANTLR end "rule__AwS__Group_2__0"


    // $ANTLR start "rule__AwS__Group_2__0__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1312:1: rule__AwS__Group_2__0__Impl : ( 'v' ) ;
    public final void rule__AwS__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1316:1: ( ( 'v' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1317:1: ( 'v' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1317:1: ( 'v' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1318:1: 'v'
            {
             before(grammarAccess.getAwSAccess().getVKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__AwS__Group_2__0__Impl2796); 
             after(grammarAccess.getAwSAccess().getVKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AwS__Group_2__0__Impl"


    // $ANTLR start "rule__AwS__Group_2__1"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1331:1: rule__AwS__Group_2__1 : rule__AwS__Group_2__1__Impl ;
    public final void rule__AwS__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1335:1: ( rule__AwS__Group_2__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1336:2: rule__AwS__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AwS__Group_2__1__Impl_in_rule__AwS__Group_2__12827);
            rule__AwS__Group_2__1__Impl();

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
    // $ANTLR end "rule__AwS__Group_2__1"


    // $ANTLR start "rule__AwS__Group_2__1__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1342:1: rule__AwS__Group_2__1__Impl : ( ( rule__AwS__VersionAssignment_2_1 ) ) ;
    public final void rule__AwS__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1346:1: ( ( ( rule__AwS__VersionAssignment_2_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1347:1: ( ( rule__AwS__VersionAssignment_2_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1347:1: ( ( rule__AwS__VersionAssignment_2_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1348:1: ( rule__AwS__VersionAssignment_2_1 )
            {
             before(grammarAccess.getAwSAccess().getVersionAssignment_2_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1349:1: ( rule__AwS__VersionAssignment_2_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1349:2: rule__AwS__VersionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AwS__VersionAssignment_2_1_in_rule__AwS__Group_2__1__Impl2854);
            rule__AwS__VersionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAwSAccess().getVersionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AwS__Group_2__1__Impl"


    // $ANTLR start "rule__VOS__Group__0"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1363:1: rule__VOS__Group__0 : rule__VOS__Group__0__Impl rule__VOS__Group__1 ;
    public final void rule__VOS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1367:1: ( rule__VOS__Group__0__Impl rule__VOS__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1368:2: rule__VOS__Group__0__Impl rule__VOS__Group__1
            {
            pushFollow(FOLLOW_rule__VOS__Group__0__Impl_in_rule__VOS__Group__02888);
            rule__VOS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOS__Group__1_in_rule__VOS__Group__02891);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1375:1: rule__VOS__Group__0__Impl : ( ( rule__VOS__Alternatives_0 ) ) ;
    public final void rule__VOS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1379:1: ( ( ( rule__VOS__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1380:1: ( ( rule__VOS__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1380:1: ( ( rule__VOS__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1381:1: ( rule__VOS__Alternatives_0 )
            {
             before(grammarAccess.getVOSAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1382:1: ( rule__VOS__Alternatives_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1382:2: rule__VOS__Alternatives_0
            {
            pushFollow(FOLLOW_rule__VOS__Alternatives_0_in_rule__VOS__Group__0__Impl2918);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1392:1: rule__VOS__Group__1 : rule__VOS__Group__1__Impl rule__VOS__Group__2 ;
    public final void rule__VOS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1396:1: ( rule__VOS__Group__1__Impl rule__VOS__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1397:2: rule__VOS__Group__1__Impl rule__VOS__Group__2
            {
            pushFollow(FOLLOW_rule__VOS__Group__1__Impl_in_rule__VOS__Group__12948);
            rule__VOS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOS__Group__2_in_rule__VOS__Group__12951);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1404:1: rule__VOS__Group__1__Impl : ( '{' ) ;
    public final void rule__VOS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1408:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1409:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1409:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1410:1: '{'
            {
             before(grammarAccess.getVOSAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__VOS__Group__1__Impl2979); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1423:1: rule__VOS__Group__2 : rule__VOS__Group__2__Impl rule__VOS__Group__3 ;
    public final void rule__VOS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1427:1: ( rule__VOS__Group__2__Impl rule__VOS__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1428:2: rule__VOS__Group__2__Impl rule__VOS__Group__3
            {
            pushFollow(FOLLOW_rule__VOS__Group__2__Impl_in_rule__VOS__Group__23010);
            rule__VOS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOS__Group__3_in_rule__VOS__Group__23013);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1435:1: rule__VOS__Group__2__Impl : ( ( ( rule__VOS__Alternatives_2 ) ) ( ( rule__VOS__Alternatives_2 )* ) ) ;
    public final void rule__VOS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1439:1: ( ( ( ( rule__VOS__Alternatives_2 ) ) ( ( rule__VOS__Alternatives_2 )* ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1440:1: ( ( ( rule__VOS__Alternatives_2 ) ) ( ( rule__VOS__Alternatives_2 )* ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1440:1: ( ( ( rule__VOS__Alternatives_2 ) ) ( ( rule__VOS__Alternatives_2 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1441:1: ( ( rule__VOS__Alternatives_2 ) ) ( ( rule__VOS__Alternatives_2 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1441:1: ( ( rule__VOS__Alternatives_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1442:1: ( rule__VOS__Alternatives_2 )
            {
             before(grammarAccess.getVOSAccess().getAlternatives_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1443:1: ( rule__VOS__Alternatives_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1443:2: rule__VOS__Alternatives_2
            {
            pushFollow(FOLLOW_rule__VOS__Alternatives_2_in_rule__VOS__Group__2__Impl3042);
            rule__VOS__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getVOSAccess().getAlternatives_2()); 

            }

            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1446:1: ( ( rule__VOS__Alternatives_2 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1447:1: ( rule__VOS__Alternatives_2 )*
            {
             before(grammarAccess.getVOSAccess().getAlternatives_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1448:1: ( rule__VOS__Alternatives_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==24||LA20_0==31||(LA20_0>=34 && LA20_0<=38)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1448:2: rule__VOS__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__VOS__Alternatives_2_in_rule__VOS__Group__2__Impl3054);
            	    rule__VOS__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1459:1: rule__VOS__Group__3 : rule__VOS__Group__3__Impl ;
    public final void rule__VOS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1463:1: ( rule__VOS__Group__3__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1464:2: rule__VOS__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VOS__Group__3__Impl_in_rule__VOS__Group__33087);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1470:1: rule__VOS__Group__3__Impl : ( '}' ) ;
    public final void rule__VOS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1474:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1475:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1475:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1476:1: '}'
            {
             before(grammarAccess.getVOSAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__VOS__Group__3__Impl3115); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1497:1: rule__KOS__Group__0 : rule__KOS__Group__0__Impl rule__KOS__Group__1 ;
    public final void rule__KOS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1501:1: ( rule__KOS__Group__0__Impl rule__KOS__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1502:2: rule__KOS__Group__0__Impl rule__KOS__Group__1
            {
            pushFollow(FOLLOW_rule__KOS__Group__0__Impl_in_rule__KOS__Group__03154);
            rule__KOS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KOS__Group__1_in_rule__KOS__Group__03157);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1509:1: rule__KOS__Group__0__Impl : ( ( rule__KOS__Alternatives_0 ) ) ;
    public final void rule__KOS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1513:1: ( ( ( rule__KOS__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1514:1: ( ( rule__KOS__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1514:1: ( ( rule__KOS__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1515:1: ( rule__KOS__Alternatives_0 )
            {
             before(grammarAccess.getKOSAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1516:1: ( rule__KOS__Alternatives_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1516:2: rule__KOS__Alternatives_0
            {
            pushFollow(FOLLOW_rule__KOS__Alternatives_0_in_rule__KOS__Group__0__Impl3184);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1526:1: rule__KOS__Group__1 : rule__KOS__Group__1__Impl rule__KOS__Group__2 ;
    public final void rule__KOS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1530:1: ( rule__KOS__Group__1__Impl rule__KOS__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1531:2: rule__KOS__Group__1__Impl rule__KOS__Group__2
            {
            pushFollow(FOLLOW_rule__KOS__Group__1__Impl_in_rule__KOS__Group__13214);
            rule__KOS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KOS__Group__2_in_rule__KOS__Group__13217);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1538:1: rule__KOS__Group__1__Impl : ( '{' ) ;
    public final void rule__KOS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1542:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1543:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1543:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1544:1: '{'
            {
             before(grammarAccess.getKOSAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__KOS__Group__1__Impl3245); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1557:1: rule__KOS__Group__2 : rule__KOS__Group__2__Impl rule__KOS__Group__3 ;
    public final void rule__KOS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1561:1: ( rule__KOS__Group__2__Impl rule__KOS__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1562:2: rule__KOS__Group__2__Impl rule__KOS__Group__3
            {
            pushFollow(FOLLOW_rule__KOS__Group__2__Impl_in_rule__KOS__Group__23276);
            rule__KOS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KOS__Group__3_in_rule__KOS__Group__23279);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1569:1: rule__KOS__Group__2__Impl : ( ( ( rule__KOS__Alternatives_2 ) ) ( ( rule__KOS__Alternatives_2 )* ) ) ;
    public final void rule__KOS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1573:1: ( ( ( ( rule__KOS__Alternatives_2 ) ) ( ( rule__KOS__Alternatives_2 )* ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1574:1: ( ( ( rule__KOS__Alternatives_2 ) ) ( ( rule__KOS__Alternatives_2 )* ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1574:1: ( ( ( rule__KOS__Alternatives_2 ) ) ( ( rule__KOS__Alternatives_2 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1575:1: ( ( rule__KOS__Alternatives_2 ) ) ( ( rule__KOS__Alternatives_2 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1575:1: ( ( rule__KOS__Alternatives_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1576:1: ( rule__KOS__Alternatives_2 )
            {
             before(grammarAccess.getKOSAccess().getAlternatives_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1577:1: ( rule__KOS__Alternatives_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1577:2: rule__KOS__Alternatives_2
            {
            pushFollow(FOLLOW_rule__KOS__Alternatives_2_in_rule__KOS__Group__2__Impl3308);
            rule__KOS__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getKOSAccess().getAlternatives_2()); 

            }

            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1580:1: ( ( rule__KOS__Alternatives_2 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1581:1: ( rule__KOS__Alternatives_2 )*
            {
             before(grammarAccess.getKOSAccess().getAlternatives_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1582:1: ( rule__KOS__Alternatives_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=25 && LA21_0<=27)||(LA21_0>=31 && LA21_0<=37)||LA21_0==39) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1582:2: rule__KOS__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__KOS__Alternatives_2_in_rule__KOS__Group__2__Impl3320);
            	    rule__KOS__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1593:1: rule__KOS__Group__3 : rule__KOS__Group__3__Impl ;
    public final void rule__KOS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1597:1: ( rule__KOS__Group__3__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1598:2: rule__KOS__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KOS__Group__3__Impl_in_rule__KOS__Group__33353);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1604:1: rule__KOS__Group__3__Impl : ( '}' ) ;
    public final void rule__KOS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1608:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1609:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1609:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1610:1: '}'
            {
             before(grammarAccess.getKOSAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__KOS__Group__3__Impl3381); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1631:1: rule__VOT__Group__0 : rule__VOT__Group__0__Impl rule__VOT__Group__1 ;
    public final void rule__VOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1635:1: ( rule__VOT__Group__0__Impl rule__VOT__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1636:2: rule__VOT__Group__0__Impl rule__VOT__Group__1
            {
            pushFollow(FOLLOW_rule__VOT__Group__0__Impl_in_rule__VOT__Group__03420);
            rule__VOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__1_in_rule__VOT__Group__03423);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1643:1: rule__VOT__Group__0__Impl : ( ( rule__VOT__AnnotationAssignment_0 )? ) ;
    public final void rule__VOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1647:1: ( ( ( rule__VOT__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1648:1: ( ( rule__VOT__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1648:1: ( ( rule__VOT__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1649:1: ( rule__VOT__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getVOTAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1650:1: ( rule__VOT__AnnotationAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=34 && LA22_0<=37)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1650:2: rule__VOT__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__VOT__AnnotationAssignment_0_in_rule__VOT__Group__0__Impl3450);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1660:1: rule__VOT__Group__1 : rule__VOT__Group__1__Impl rule__VOT__Group__2 ;
    public final void rule__VOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1664:1: ( rule__VOT__Group__1__Impl rule__VOT__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1665:2: rule__VOT__Group__1__Impl rule__VOT__Group__2
            {
            pushFollow(FOLLOW_rule__VOT__Group__1__Impl_in_rule__VOT__Group__13481);
            rule__VOT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__2_in_rule__VOT__Group__13484);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1672:1: rule__VOT__Group__1__Impl : ( 'VOT' ) ;
    public final void rule__VOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1676:1: ( ( 'VOT' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1677:1: ( 'VOT' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1677:1: ( 'VOT' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1678:1: 'VOT'
            {
             before(grammarAccess.getVOTAccess().getVOTKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__VOT__Group__1__Impl3512); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1691:1: rule__VOT__Group__2 : rule__VOT__Group__2__Impl rule__VOT__Group__3 ;
    public final void rule__VOT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1695:1: ( rule__VOT__Group__2__Impl rule__VOT__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1696:2: rule__VOT__Group__2__Impl rule__VOT__Group__3
            {
            pushFollow(FOLLOW_rule__VOT__Group__2__Impl_in_rule__VOT__Group__23543);
            rule__VOT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__3_in_rule__VOT__Group__23546);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1703:1: rule__VOT__Group__2__Impl : ( ( rule__VOT__NameAssignment_2 ) ) ;
    public final void rule__VOT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1707:1: ( ( ( rule__VOT__NameAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1708:1: ( ( rule__VOT__NameAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1708:1: ( ( rule__VOT__NameAssignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1709:1: ( rule__VOT__NameAssignment_2 )
            {
             before(grammarAccess.getVOTAccess().getNameAssignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1710:1: ( rule__VOT__NameAssignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1710:2: rule__VOT__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__VOT__NameAssignment_2_in_rule__VOT__Group__2__Impl3573);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1720:1: rule__VOT__Group__3 : rule__VOT__Group__3__Impl rule__VOT__Group__4 ;
    public final void rule__VOT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1724:1: ( rule__VOT__Group__3__Impl rule__VOT__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1725:2: rule__VOT__Group__3__Impl rule__VOT__Group__4
            {
            pushFollow(FOLLOW_rule__VOT__Group__3__Impl_in_rule__VOT__Group__33603);
            rule__VOT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__4_in_rule__VOT__Group__33606);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1732:1: rule__VOT__Group__3__Impl : ( '{' ) ;
    public final void rule__VOT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1736:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1737:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1737:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1738:1: '{'
            {
             before(grammarAccess.getVOTAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__VOT__Group__3__Impl3634); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1751:1: rule__VOT__Group__4 : rule__VOT__Group__4__Impl rule__VOT__Group__5 ;
    public final void rule__VOT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1755:1: ( rule__VOT__Group__4__Impl rule__VOT__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1756:2: rule__VOT__Group__4__Impl rule__VOT__Group__5
            {
            pushFollow(FOLLOW_rule__VOT__Group__4__Impl_in_rule__VOT__Group__43665);
            rule__VOT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__5_in_rule__VOT__Group__43668);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1763:1: rule__VOT__Group__4__Impl : ( ( rule__VOT__Alternatives_4 )* ) ;
    public final void rule__VOT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1767:1: ( ( ( rule__VOT__Alternatives_4 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1768:1: ( ( rule__VOT__Alternatives_4 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1768:1: ( ( rule__VOT__Alternatives_4 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1769:1: ( rule__VOT__Alternatives_4 )*
            {
             before(grammarAccess.getVOTAccess().getAlternatives_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1770:1: ( rule__VOT__Alternatives_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1770:2: rule__VOT__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__VOT__Alternatives_4_in_rule__VOT__Group__4__Impl3695);
            	    rule__VOT__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1780:1: rule__VOT__Group__5 : rule__VOT__Group__5__Impl ;
    public final void rule__VOT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1784:1: ( rule__VOT__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1785:2: rule__VOT__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__VOT__Group__5__Impl_in_rule__VOT__Group__53726);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1791:1: rule__VOT__Group__5__Impl : ( '}' ) ;
    public final void rule__VOT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1795:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1796:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1796:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1797:1: '}'
            {
             before(grammarAccess.getVOTAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__VOT__Group__5__Impl3754); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1822:1: rule__OOT__Group__0 : rule__OOT__Group__0__Impl rule__OOT__Group__1 ;
    public final void rule__OOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1826:1: ( rule__OOT__Group__0__Impl rule__OOT__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1827:2: rule__OOT__Group__0__Impl rule__OOT__Group__1
            {
            pushFollow(FOLLOW_rule__OOT__Group__0__Impl_in_rule__OOT__Group__03797);
            rule__OOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__1_in_rule__OOT__Group__03800);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1834:1: rule__OOT__Group__0__Impl : ( ( rule__OOT__AnnotationAssignment_0 )? ) ;
    public final void rule__OOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1838:1: ( ( ( rule__OOT__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1839:1: ( ( rule__OOT__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1839:1: ( ( rule__OOT__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1840:1: ( rule__OOT__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getOOTAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1841:1: ( rule__OOT__AnnotationAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=34 && LA24_0<=37)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1841:2: rule__OOT__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__OOT__AnnotationAssignment_0_in_rule__OOT__Group__0__Impl3827);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1851:1: rule__OOT__Group__1 : rule__OOT__Group__1__Impl rule__OOT__Group__2 ;
    public final void rule__OOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1855:1: ( rule__OOT__Group__1__Impl rule__OOT__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1856:2: rule__OOT__Group__1__Impl rule__OOT__Group__2
            {
            pushFollow(FOLLOW_rule__OOT__Group__1__Impl_in_rule__OOT__Group__13858);
            rule__OOT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__2_in_rule__OOT__Group__13861);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1863:1: rule__OOT__Group__1__Impl : ( 'OOT' ) ;
    public final void rule__OOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1867:1: ( ( 'OOT' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1868:1: ( 'OOT' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1868:1: ( 'OOT' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1869:1: 'OOT'
            {
             before(grammarAccess.getOOTAccess().getOOTKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__OOT__Group__1__Impl3889); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1882:1: rule__OOT__Group__2 : rule__OOT__Group__2__Impl rule__OOT__Group__3 ;
    public final void rule__OOT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1886:1: ( rule__OOT__Group__2__Impl rule__OOT__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1887:2: rule__OOT__Group__2__Impl rule__OOT__Group__3
            {
            pushFollow(FOLLOW_rule__OOT__Group__2__Impl_in_rule__OOT__Group__23920);
            rule__OOT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__3_in_rule__OOT__Group__23923);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1894:1: rule__OOT__Group__2__Impl : ( ( rule__OOT__NameAssignment_2 ) ) ;
    public final void rule__OOT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1898:1: ( ( ( rule__OOT__NameAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1899:1: ( ( rule__OOT__NameAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1899:1: ( ( rule__OOT__NameAssignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1900:1: ( rule__OOT__NameAssignment_2 )
            {
             before(grammarAccess.getOOTAccess().getNameAssignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1901:1: ( rule__OOT__NameAssignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1901:2: rule__OOT__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__OOT__NameAssignment_2_in_rule__OOT__Group__2__Impl3950);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1911:1: rule__OOT__Group__3 : rule__OOT__Group__3__Impl rule__OOT__Group__4 ;
    public final void rule__OOT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1915:1: ( rule__OOT__Group__3__Impl rule__OOT__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1916:2: rule__OOT__Group__3__Impl rule__OOT__Group__4
            {
            pushFollow(FOLLOW_rule__OOT__Group__3__Impl_in_rule__OOT__Group__33980);
            rule__OOT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__4_in_rule__OOT__Group__33983);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1923:1: rule__OOT__Group__3__Impl : ( '{' ) ;
    public final void rule__OOT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1927:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1928:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1928:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1929:1: '{'
            {
             before(grammarAccess.getOOTAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__OOT__Group__3__Impl4011); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1942:1: rule__OOT__Group__4 : rule__OOT__Group__4__Impl rule__OOT__Group__5 ;
    public final void rule__OOT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1946:1: ( rule__OOT__Group__4__Impl rule__OOT__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1947:2: rule__OOT__Group__4__Impl rule__OOT__Group__5
            {
            pushFollow(FOLLOW_rule__OOT__Group__4__Impl_in_rule__OOT__Group__44042);
            rule__OOT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__5_in_rule__OOT__Group__44045);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1954:1: rule__OOT__Group__4__Impl : ( ( rule__OOT__Alternatives_4 )* ) ;
    public final void rule__OOT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1958:1: ( ( ( rule__OOT__Alternatives_4 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1959:1: ( ( rule__OOT__Alternatives_4 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1959:1: ( ( rule__OOT__Alternatives_4 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1960:1: ( rule__OOT__Alternatives_4 )*
            {
             before(grammarAccess.getOOTAccess().getAlternatives_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1961:1: ( rule__OOT__Alternatives_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1961:2: rule__OOT__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__OOT__Alternatives_4_in_rule__OOT__Group__4__Impl4072);
            	    rule__OOT__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1971:1: rule__OOT__Group__5 : rule__OOT__Group__5__Impl ;
    public final void rule__OOT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1975:1: ( rule__OOT__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1976:2: rule__OOT__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__OOT__Group__5__Impl_in_rule__OOT__Group__54103);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1982:1: rule__OOT__Group__5__Impl : ( '}' ) ;
    public final void rule__OOT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1986:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1987:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1987:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:1988:1: '}'
            {
             before(grammarAccess.getOOTAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__OOT__Group__5__Impl4131); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2013:1: rule__LOT__Group__0 : rule__LOT__Group__0__Impl rule__LOT__Group__1 ;
    public final void rule__LOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2017:1: ( rule__LOT__Group__0__Impl rule__LOT__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2018:2: rule__LOT__Group__0__Impl rule__LOT__Group__1
            {
            pushFollow(FOLLOW_rule__LOT__Group__0__Impl_in_rule__LOT__Group__04174);
            rule__LOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__1_in_rule__LOT__Group__04177);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2025:1: rule__LOT__Group__0__Impl : ( ( rule__LOT__AnnotationAssignment_0 )? ) ;
    public final void rule__LOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2029:1: ( ( ( rule__LOT__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2030:1: ( ( rule__LOT__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2030:1: ( ( rule__LOT__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2031:1: ( rule__LOT__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getLOTAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2032:1: ( rule__LOT__AnnotationAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=34 && LA26_0<=37)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2032:2: rule__LOT__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__LOT__AnnotationAssignment_0_in_rule__LOT__Group__0__Impl4204);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2042:1: rule__LOT__Group__1 : rule__LOT__Group__1__Impl rule__LOT__Group__2 ;
    public final void rule__LOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2046:1: ( rule__LOT__Group__1__Impl rule__LOT__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2047:2: rule__LOT__Group__1__Impl rule__LOT__Group__2
            {
            pushFollow(FOLLOW_rule__LOT__Group__1__Impl_in_rule__LOT__Group__14235);
            rule__LOT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__2_in_rule__LOT__Group__14238);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2054:1: rule__LOT__Group__1__Impl : ( 'LOT' ) ;
    public final void rule__LOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2058:1: ( ( 'LOT' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2059:1: ( 'LOT' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2059:1: ( 'LOT' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2060:1: 'LOT'
            {
             before(grammarAccess.getLOTAccess().getLOTKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__LOT__Group__1__Impl4266); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2073:1: rule__LOT__Group__2 : rule__LOT__Group__2__Impl rule__LOT__Group__3 ;
    public final void rule__LOT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2077:1: ( rule__LOT__Group__2__Impl rule__LOT__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2078:2: rule__LOT__Group__2__Impl rule__LOT__Group__3
            {
            pushFollow(FOLLOW_rule__LOT__Group__2__Impl_in_rule__LOT__Group__24297);
            rule__LOT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__3_in_rule__LOT__Group__24300);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2085:1: rule__LOT__Group__2__Impl : ( ( rule__LOT__NameAssignment_2 ) ) ;
    public final void rule__LOT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2089:1: ( ( ( rule__LOT__NameAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2090:1: ( ( rule__LOT__NameAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2090:1: ( ( rule__LOT__NameAssignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2091:1: ( rule__LOT__NameAssignment_2 )
            {
             before(grammarAccess.getLOTAccess().getNameAssignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2092:1: ( rule__LOT__NameAssignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2092:2: rule__LOT__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__LOT__NameAssignment_2_in_rule__LOT__Group__2__Impl4327);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2102:1: rule__LOT__Group__3 : rule__LOT__Group__3__Impl rule__LOT__Group__4 ;
    public final void rule__LOT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2106:1: ( rule__LOT__Group__3__Impl rule__LOT__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2107:2: rule__LOT__Group__3__Impl rule__LOT__Group__4
            {
            pushFollow(FOLLOW_rule__LOT__Group__3__Impl_in_rule__LOT__Group__34357);
            rule__LOT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__4_in_rule__LOT__Group__34360);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2114:1: rule__LOT__Group__3__Impl : ( '{' ) ;
    public final void rule__LOT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2118:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2119:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2119:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2120:1: '{'
            {
             before(grammarAccess.getLOTAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__LOT__Group__3__Impl4388); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2133:1: rule__LOT__Group__4 : rule__LOT__Group__4__Impl rule__LOT__Group__5 ;
    public final void rule__LOT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2137:1: ( rule__LOT__Group__4__Impl rule__LOT__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2138:2: rule__LOT__Group__4__Impl rule__LOT__Group__5
            {
            pushFollow(FOLLOW_rule__LOT__Group__4__Impl_in_rule__LOT__Group__44419);
            rule__LOT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__5_in_rule__LOT__Group__44422);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2145:1: rule__LOT__Group__4__Impl : ( ( rule__LOT__Alternatives_4 )* ) ;
    public final void rule__LOT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2149:1: ( ( ( rule__LOT__Alternatives_4 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2150:1: ( ( rule__LOT__Alternatives_4 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2150:1: ( ( rule__LOT__Alternatives_4 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2151:1: ( rule__LOT__Alternatives_4 )*
            {
             before(grammarAccess.getLOTAccess().getAlternatives_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2152:1: ( rule__LOT__Alternatives_4 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2152:2: rule__LOT__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__LOT__Alternatives_4_in_rule__LOT__Group__4__Impl4449);
            	    rule__LOT__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2162:1: rule__LOT__Group__5 : rule__LOT__Group__5__Impl ;
    public final void rule__LOT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2166:1: ( rule__LOT__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2167:2: rule__LOT__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__LOT__Group__5__Impl_in_rule__LOT__Group__54480);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2173:1: rule__LOT__Group__5__Impl : ( '}' ) ;
    public final void rule__LOT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2177:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2178:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2178:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2179:1: '}'
            {
             before(grammarAccess.getLOTAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__LOT__Group__5__Impl4508); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2204:1: rule__TOT__Group__0 : rule__TOT__Group__0__Impl rule__TOT__Group__1 ;
    public final void rule__TOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2208:1: ( rule__TOT__Group__0__Impl rule__TOT__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2209:2: rule__TOT__Group__0__Impl rule__TOT__Group__1
            {
            pushFollow(FOLLOW_rule__TOT__Group__0__Impl_in_rule__TOT__Group__04551);
            rule__TOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__1_in_rule__TOT__Group__04554);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2216:1: rule__TOT__Group__0__Impl : ( ( rule__TOT__AnnotationAssignment_0 )? ) ;
    public final void rule__TOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2220:1: ( ( ( rule__TOT__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2221:1: ( ( rule__TOT__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2221:1: ( ( rule__TOT__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2222:1: ( rule__TOT__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getTOTAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2223:1: ( rule__TOT__AnnotationAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=34 && LA28_0<=37)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2223:2: rule__TOT__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TOT__AnnotationAssignment_0_in_rule__TOT__Group__0__Impl4581);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2233:1: rule__TOT__Group__1 : rule__TOT__Group__1__Impl rule__TOT__Group__2 ;
    public final void rule__TOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2237:1: ( rule__TOT__Group__1__Impl rule__TOT__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2238:2: rule__TOT__Group__1__Impl rule__TOT__Group__2
            {
            pushFollow(FOLLOW_rule__TOT__Group__1__Impl_in_rule__TOT__Group__14612);
            rule__TOT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__2_in_rule__TOT__Group__14615);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2245:1: rule__TOT__Group__1__Impl : ( 'TOT' ) ;
    public final void rule__TOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2249:1: ( ( 'TOT' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2250:1: ( 'TOT' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2250:1: ( 'TOT' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2251:1: 'TOT'
            {
             before(grammarAccess.getTOTAccess().getTOTKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__TOT__Group__1__Impl4643); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2264:1: rule__TOT__Group__2 : rule__TOT__Group__2__Impl rule__TOT__Group__3 ;
    public final void rule__TOT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2268:1: ( rule__TOT__Group__2__Impl rule__TOT__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2269:2: rule__TOT__Group__2__Impl rule__TOT__Group__3
            {
            pushFollow(FOLLOW_rule__TOT__Group__2__Impl_in_rule__TOT__Group__24674);
            rule__TOT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__3_in_rule__TOT__Group__24677);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2276:1: rule__TOT__Group__2__Impl : ( ( rule__TOT__NameAssignment_2 ) ) ;
    public final void rule__TOT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2280:1: ( ( ( rule__TOT__NameAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2281:1: ( ( rule__TOT__NameAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2281:1: ( ( rule__TOT__NameAssignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2282:1: ( rule__TOT__NameAssignment_2 )
            {
             before(grammarAccess.getTOTAccess().getNameAssignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2283:1: ( rule__TOT__NameAssignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2283:2: rule__TOT__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TOT__NameAssignment_2_in_rule__TOT__Group__2__Impl4704);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2293:1: rule__TOT__Group__3 : rule__TOT__Group__3__Impl rule__TOT__Group__4 ;
    public final void rule__TOT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2297:1: ( rule__TOT__Group__3__Impl rule__TOT__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2298:2: rule__TOT__Group__3__Impl rule__TOT__Group__4
            {
            pushFollow(FOLLOW_rule__TOT__Group__3__Impl_in_rule__TOT__Group__34734);
            rule__TOT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__4_in_rule__TOT__Group__34737);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2305:1: rule__TOT__Group__3__Impl : ( '{' ) ;
    public final void rule__TOT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2309:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2310:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2310:1: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2311:1: '{'
            {
             before(grammarAccess.getTOTAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__TOT__Group__3__Impl4765); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2324:1: rule__TOT__Group__4 : rule__TOT__Group__4__Impl rule__TOT__Group__5 ;
    public final void rule__TOT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2328:1: ( rule__TOT__Group__4__Impl rule__TOT__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2329:2: rule__TOT__Group__4__Impl rule__TOT__Group__5
            {
            pushFollow(FOLLOW_rule__TOT__Group__4__Impl_in_rule__TOT__Group__44796);
            rule__TOT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__5_in_rule__TOT__Group__44799);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2336:1: rule__TOT__Group__4__Impl : ( ( rule__TOT__Alternatives_4 )* ) ;
    public final void rule__TOT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2340:1: ( ( ( rule__TOT__Alternatives_4 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2341:1: ( ( rule__TOT__Alternatives_4 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2341:1: ( ( rule__TOT__Alternatives_4 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2342:1: ( rule__TOT__Alternatives_4 )*
            {
             before(grammarAccess.getTOTAccess().getAlternatives_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2343:1: ( rule__TOT__Alternatives_4 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2343:2: rule__TOT__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__TOT__Alternatives_4_in_rule__TOT__Group__4__Impl4826);
            	    rule__TOT__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2353:1: rule__TOT__Group__5 : rule__TOT__Group__5__Impl ;
    public final void rule__TOT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2357:1: ( rule__TOT__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2358:2: rule__TOT__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__TOT__Group__5__Impl_in_rule__TOT__Group__54857);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2364:1: rule__TOT__Group__5__Impl : ( '}' ) ;
    public final void rule__TOT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2368:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2369:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2369:1: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2370:1: '}'
            {
             before(grammarAccess.getTOTAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__TOT__Group__5__Impl4885); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2395:1: rule__Attribut__Group__0 : rule__Attribut__Group__0__Impl rule__Attribut__Group__1 ;
    public final void rule__Attribut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2399:1: ( rule__Attribut__Group__0__Impl rule__Attribut__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2400:2: rule__Attribut__Group__0__Impl rule__Attribut__Group__1
            {
            pushFollow(FOLLOW_rule__Attribut__Group__0__Impl_in_rule__Attribut__Group__04928);
            rule__Attribut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribut__Group__1_in_rule__Attribut__Group__04931);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2407:1: rule__Attribut__Group__0__Impl : ( ( rule__Attribut__TypAssignment_0 )? ) ;
    public final void rule__Attribut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2411:1: ( ( ( rule__Attribut__TypAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2412:1: ( ( rule__Attribut__TypAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2412:1: ( ( rule__Attribut__TypAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2413:1: ( rule__Attribut__TypAssignment_0 )?
            {
             before(grammarAccess.getAttributAccess().getTypAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2414:1: ( rule__Attribut__TypAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==RULE_ID) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2414:2: rule__Attribut__TypAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Attribut__TypAssignment_0_in_rule__Attribut__Group__0__Impl4958);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2424:1: rule__Attribut__Group__1 : rule__Attribut__Group__1__Impl rule__Attribut__Group__2 ;
    public final void rule__Attribut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2428:1: ( rule__Attribut__Group__1__Impl rule__Attribut__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2429:2: rule__Attribut__Group__1__Impl rule__Attribut__Group__2
            {
            pushFollow(FOLLOW_rule__Attribut__Group__1__Impl_in_rule__Attribut__Group__14989);
            rule__Attribut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribut__Group__2_in_rule__Attribut__Group__14992);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2436:1: rule__Attribut__Group__1__Impl : ( ( rule__Attribut__NameAssignment_1 ) ) ;
    public final void rule__Attribut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2440:1: ( ( ( rule__Attribut__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2441:1: ( ( rule__Attribut__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2441:1: ( ( rule__Attribut__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2442:1: ( rule__Attribut__NameAssignment_1 )
            {
             before(grammarAccess.getAttributAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2443:1: ( rule__Attribut__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2443:2: rule__Attribut__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribut__NameAssignment_1_in_rule__Attribut__Group__1__Impl5019);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2453:1: rule__Attribut__Group__2 : rule__Attribut__Group__2__Impl ;
    public final void rule__Attribut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2457:1: ( rule__Attribut__Group__2__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2458:2: rule__Attribut__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribut__Group__2__Impl_in_rule__Attribut__Group__25049);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2464:1: rule__Attribut__Group__2__Impl : ( ';' ) ;
    public final void rule__Attribut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2468:1: ( ( ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2469:1: ( ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2469:1: ( ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2470:1: ';'
            {
             before(grammarAccess.getAttributAccess().getSemicolonKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Attribut__Group__2__Impl5077); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2489:1: rule__Operator__Group__0 : rule__Operator__Group__0__Impl rule__Operator__Group__1 ;
    public final void rule__Operator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2493:1: ( rule__Operator__Group__0__Impl rule__Operator__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2494:2: rule__Operator__Group__0__Impl rule__Operator__Group__1
            {
            pushFollow(FOLLOW_rule__Operator__Group__0__Impl_in_rule__Operator__Group__05114);
            rule__Operator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__1_in_rule__Operator__Group__05117);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2501:1: rule__Operator__Group__0__Impl : ( ( rule__Operator__NameAssignment_0 ) ) ;
    public final void rule__Operator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2505:1: ( ( ( rule__Operator__NameAssignment_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2506:1: ( ( rule__Operator__NameAssignment_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2506:1: ( ( rule__Operator__NameAssignment_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2507:1: ( rule__Operator__NameAssignment_0 )
            {
             before(grammarAccess.getOperatorAccess().getNameAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2508:1: ( rule__Operator__NameAssignment_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2508:2: rule__Operator__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Operator__NameAssignment_0_in_rule__Operator__Group__0__Impl5144);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2518:1: rule__Operator__Group__1 : rule__Operator__Group__1__Impl rule__Operator__Group__2 ;
    public final void rule__Operator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2522:1: ( rule__Operator__Group__1__Impl rule__Operator__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2523:2: rule__Operator__Group__1__Impl rule__Operator__Group__2
            {
            pushFollow(FOLLOW_rule__Operator__Group__1__Impl_in_rule__Operator__Group__15174);
            rule__Operator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__2_in_rule__Operator__Group__15177);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2530:1: rule__Operator__Group__1__Impl : ( '(' ) ;
    public final void rule__Operator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2534:1: ( ( '(' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2535:1: ( '(' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2535:1: ( '(' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2536:1: '('
            {
             before(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__Operator__Group__1__Impl5205); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2549:1: rule__Operator__Group__2 : rule__Operator__Group__2__Impl rule__Operator__Group__3 ;
    public final void rule__Operator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2553:1: ( rule__Operator__Group__2__Impl rule__Operator__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2554:2: rule__Operator__Group__2__Impl rule__Operator__Group__3
            {
            pushFollow(FOLLOW_rule__Operator__Group__2__Impl_in_rule__Operator__Group__25236);
            rule__Operator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__3_in_rule__Operator__Group__25239);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2561:1: rule__Operator__Group__2__Impl : ( ( rule__Operator__ParameterAssignment_2 )* ) ;
    public final void rule__Operator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2565:1: ( ( ( rule__Operator__ParameterAssignment_2 )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2566:1: ( ( rule__Operator__ParameterAssignment_2 )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2566:1: ( ( rule__Operator__ParameterAssignment_2 )* )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2567:1: ( rule__Operator__ParameterAssignment_2 )*
            {
             before(grammarAccess.getOperatorAccess().getParameterAssignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2568:1: ( rule__Operator__ParameterAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2568:2: rule__Operator__ParameterAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Operator__ParameterAssignment_2_in_rule__Operator__Group__2__Impl5266);
            	    rule__Operator__ParameterAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2578:1: rule__Operator__Group__3 : rule__Operator__Group__3__Impl rule__Operator__Group__4 ;
    public final void rule__Operator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2582:1: ( rule__Operator__Group__3__Impl rule__Operator__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2583:2: rule__Operator__Group__3__Impl rule__Operator__Group__4
            {
            pushFollow(FOLLOW_rule__Operator__Group__3__Impl_in_rule__Operator__Group__35297);
            rule__Operator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__4_in_rule__Operator__Group__35300);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2590:1: rule__Operator__Group__3__Impl : ( ')' ) ;
    public final void rule__Operator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2594:1: ( ( ')' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2595:1: ( ')' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2595:1: ( ')' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2596:1: ')'
            {
             before(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Operator__Group__3__Impl5328); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2609:1: rule__Operator__Group__4 : rule__Operator__Group__4__Impl ;
    public final void rule__Operator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2613:1: ( rule__Operator__Group__4__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2614:2: rule__Operator__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Operator__Group__4__Impl_in_rule__Operator__Group__45359);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2620:1: rule__Operator__Group__4__Impl : ( ';' ) ;
    public final void rule__Operator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2624:1: ( ( ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2625:1: ( ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2625:1: ( ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2626:1: ';'
            {
             before(grammarAccess.getOperatorAccess().getSemicolonKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__Operator__Group__4__Impl5387); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2649:1: rule__Interacts_with__Group__0 : rule__Interacts_with__Group__0__Impl rule__Interacts_with__Group__1 ;
    public final void rule__Interacts_with__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2653:1: ( rule__Interacts_with__Group__0__Impl rule__Interacts_with__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2654:2: rule__Interacts_with__Group__0__Impl rule__Interacts_with__Group__1
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__0__Impl_in_rule__Interacts_with__Group__05428);
            rule__Interacts_with__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__1_in_rule__Interacts_with__Group__05431);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2661:1: rule__Interacts_with__Group__0__Impl : ( ( rule__Interacts_with__AnnotationAssignment_0 )? ) ;
    public final void rule__Interacts_with__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2665:1: ( ( ( rule__Interacts_with__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2666:1: ( ( rule__Interacts_with__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2666:1: ( ( rule__Interacts_with__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2667:1: ( rule__Interacts_with__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getInteracts_withAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2668:1: ( rule__Interacts_with__AnnotationAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=34 && LA32_0<=37)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2668:2: rule__Interacts_with__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Interacts_with__AnnotationAssignment_0_in_rule__Interacts_with__Group__0__Impl5458);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2678:1: rule__Interacts_with__Group__1 : rule__Interacts_with__Group__1__Impl rule__Interacts_with__Group__2 ;
    public final void rule__Interacts_with__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2682:1: ( rule__Interacts_with__Group__1__Impl rule__Interacts_with__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2683:2: rule__Interacts_with__Group__1__Impl rule__Interacts_with__Group__2
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__1__Impl_in_rule__Interacts_with__Group__15489);
            rule__Interacts_with__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__2_in_rule__Interacts_with__Group__15492);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2690:1: rule__Interacts_with__Group__1__Impl : ( ( 'interacts_with:' )? ) ;
    public final void rule__Interacts_with__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2694:1: ( ( ( 'interacts_with:' )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2695:1: ( ( 'interacts_with:' )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2695:1: ( ( 'interacts_with:' )? )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2696:1: ( 'interacts_with:' )?
            {
             before(grammarAccess.getInteracts_withAccess().getInteracts_withKeyword_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2697:1: ( 'interacts_with:' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2698:2: 'interacts_with:'
                    {
                    match(input,31,FOLLOW_31_in_rule__Interacts_with__Group__1__Impl5521); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2709:1: rule__Interacts_with__Group__2 : rule__Interacts_with__Group__2__Impl rule__Interacts_with__Group__3 ;
    public final void rule__Interacts_with__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2713:1: ( rule__Interacts_with__Group__2__Impl rule__Interacts_with__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2714:2: rule__Interacts_with__Group__2__Impl rule__Interacts_with__Group__3
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__2__Impl_in_rule__Interacts_with__Group__25554);
            rule__Interacts_with__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__3_in_rule__Interacts_with__Group__25557);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2721:1: rule__Interacts_with__Group__2__Impl : ( ( rule__Interacts_with__Objekttyp1Assignment_2 ) ) ;
    public final void rule__Interacts_with__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2725:1: ( ( ( rule__Interacts_with__Objekttyp1Assignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2726:1: ( ( rule__Interacts_with__Objekttyp1Assignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2726:1: ( ( rule__Interacts_with__Objekttyp1Assignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2727:1: ( rule__Interacts_with__Objekttyp1Assignment_2 )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp1Assignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2728:1: ( rule__Interacts_with__Objekttyp1Assignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2728:2: rule__Interacts_with__Objekttyp1Assignment_2
            {
            pushFollow(FOLLOW_rule__Interacts_with__Objekttyp1Assignment_2_in_rule__Interacts_with__Group__2__Impl5584);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2738:1: rule__Interacts_with__Group__3 : rule__Interacts_with__Group__3__Impl rule__Interacts_with__Group__4 ;
    public final void rule__Interacts_with__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2742:1: ( rule__Interacts_with__Group__3__Impl rule__Interacts_with__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2743:2: rule__Interacts_with__Group__3__Impl rule__Interacts_with__Group__4
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__3__Impl_in_rule__Interacts_with__Group__35614);
            rule__Interacts_with__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__4_in_rule__Interacts_with__Group__35617);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2750:1: rule__Interacts_with__Group__3__Impl : ( ( rule__Interacts_with__KardinalitaetAssignment_3 ) ) ;
    public final void rule__Interacts_with__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2754:1: ( ( ( rule__Interacts_with__KardinalitaetAssignment_3 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2755:1: ( ( rule__Interacts_with__KardinalitaetAssignment_3 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2755:1: ( ( rule__Interacts_with__KardinalitaetAssignment_3 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2756:1: ( rule__Interacts_with__KardinalitaetAssignment_3 )
            {
             before(grammarAccess.getInteracts_withAccess().getKardinalitaetAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2757:1: ( rule__Interacts_with__KardinalitaetAssignment_3 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2757:2: rule__Interacts_with__KardinalitaetAssignment_3
            {
            pushFollow(FOLLOW_rule__Interacts_with__KardinalitaetAssignment_3_in_rule__Interacts_with__Group__3__Impl5644);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2767:1: rule__Interacts_with__Group__4 : rule__Interacts_with__Group__4__Impl rule__Interacts_with__Group__5 ;
    public final void rule__Interacts_with__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2771:1: ( rule__Interacts_with__Group__4__Impl rule__Interacts_with__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2772:2: rule__Interacts_with__Group__4__Impl rule__Interacts_with__Group__5
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__4__Impl_in_rule__Interacts_with__Group__45674);
            rule__Interacts_with__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__5_in_rule__Interacts_with__Group__45677);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2779:1: rule__Interacts_with__Group__4__Impl : ( ( rule__Interacts_with__Objekttyp2Assignment_4 ) ) ;
    public final void rule__Interacts_with__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2783:1: ( ( ( rule__Interacts_with__Objekttyp2Assignment_4 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2784:1: ( ( rule__Interacts_with__Objekttyp2Assignment_4 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2784:1: ( ( rule__Interacts_with__Objekttyp2Assignment_4 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2785:1: ( rule__Interacts_with__Objekttyp2Assignment_4 )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp2Assignment_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2786:1: ( rule__Interacts_with__Objekttyp2Assignment_4 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2786:2: rule__Interacts_with__Objekttyp2Assignment_4
            {
            pushFollow(FOLLOW_rule__Interacts_with__Objekttyp2Assignment_4_in_rule__Interacts_with__Group__4__Impl5704);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2796:1: rule__Interacts_with__Group__5 : rule__Interacts_with__Group__5__Impl ;
    public final void rule__Interacts_with__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2800:1: ( rule__Interacts_with__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2801:2: rule__Interacts_with__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__5__Impl_in_rule__Interacts_with__Group__55734);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2807:1: rule__Interacts_with__Group__5__Impl : ( ';' ) ;
    public final void rule__Interacts_with__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2811:1: ( ( ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2812:1: ( ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2812:1: ( ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2813:1: ';'
            {
             before(grammarAccess.getInteracts_withAccess().getSemicolonKeyword_5()); 
            match(input,28,FOLLOW_28_in_rule__Interacts_with__Group__5__Impl5762); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2838:1: rule__Is_a__Group__0 : rule__Is_a__Group__0__Impl rule__Is_a__Group__1 ;
    public final void rule__Is_a__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2842:1: ( rule__Is_a__Group__0__Impl rule__Is_a__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2843:2: rule__Is_a__Group__0__Impl rule__Is_a__Group__1
            {
            pushFollow(FOLLOW_rule__Is_a__Group__0__Impl_in_rule__Is_a__Group__05805);
            rule__Is_a__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__1_in_rule__Is_a__Group__05808);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2850:1: rule__Is_a__Group__0__Impl : ( ( rule__Is_a__AnnotationAssignment_0 )? ) ;
    public final void rule__Is_a__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2854:1: ( ( ( rule__Is_a__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2855:1: ( ( rule__Is_a__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2855:1: ( ( rule__Is_a__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2856:1: ( rule__Is_a__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getIs_aAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2857:1: ( rule__Is_a__AnnotationAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=34 && LA34_0<=37)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2857:2: rule__Is_a__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Is_a__AnnotationAssignment_0_in_rule__Is_a__Group__0__Impl5835);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2867:1: rule__Is_a__Group__1 : rule__Is_a__Group__1__Impl rule__Is_a__Group__2 ;
    public final void rule__Is_a__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2871:1: ( rule__Is_a__Group__1__Impl rule__Is_a__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2872:2: rule__Is_a__Group__1__Impl rule__Is_a__Group__2
            {
            pushFollow(FOLLOW_rule__Is_a__Group__1__Impl_in_rule__Is_a__Group__15866);
            rule__Is_a__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__2_in_rule__Is_a__Group__15869);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2879:1: rule__Is_a__Group__1__Impl : ( 'is_a:' ) ;
    public final void rule__Is_a__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2883:1: ( ( 'is_a:' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2884:1: ( 'is_a:' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2884:1: ( 'is_a:' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2885:1: 'is_a:'
            {
             before(grammarAccess.getIs_aAccess().getIs_aKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Is_a__Group__1__Impl5897); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2898:1: rule__Is_a__Group__2 : rule__Is_a__Group__2__Impl rule__Is_a__Group__3 ;
    public final void rule__Is_a__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2902:1: ( rule__Is_a__Group__2__Impl rule__Is_a__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2903:2: rule__Is_a__Group__2__Impl rule__Is_a__Group__3
            {
            pushFollow(FOLLOW_rule__Is_a__Group__2__Impl_in_rule__Is_a__Group__25928);
            rule__Is_a__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__3_in_rule__Is_a__Group__25931);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2910:1: rule__Is_a__Group__2__Impl : ( ( rule__Is_a__Objekttyp1Assignment_2 ) ) ;
    public final void rule__Is_a__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2914:1: ( ( ( rule__Is_a__Objekttyp1Assignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2915:1: ( ( rule__Is_a__Objekttyp1Assignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2915:1: ( ( rule__Is_a__Objekttyp1Assignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2916:1: ( rule__Is_a__Objekttyp1Assignment_2 )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp1Assignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2917:1: ( rule__Is_a__Objekttyp1Assignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2917:2: rule__Is_a__Objekttyp1Assignment_2
            {
            pushFollow(FOLLOW_rule__Is_a__Objekttyp1Assignment_2_in_rule__Is_a__Group__2__Impl5958);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2927:1: rule__Is_a__Group__3 : rule__Is_a__Group__3__Impl rule__Is_a__Group__4 ;
    public final void rule__Is_a__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2931:1: ( rule__Is_a__Group__3__Impl rule__Is_a__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2932:2: rule__Is_a__Group__3__Impl rule__Is_a__Group__4
            {
            pushFollow(FOLLOW_rule__Is_a__Group__3__Impl_in_rule__Is_a__Group__35988);
            rule__Is_a__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__4_in_rule__Is_a__Group__35991);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2939:1: rule__Is_a__Group__3__Impl : ( ( rule__Is_a__KardinalitaetAssignment_3 ) ) ;
    public final void rule__Is_a__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2943:1: ( ( ( rule__Is_a__KardinalitaetAssignment_3 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2944:1: ( ( rule__Is_a__KardinalitaetAssignment_3 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2944:1: ( ( rule__Is_a__KardinalitaetAssignment_3 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2945:1: ( rule__Is_a__KardinalitaetAssignment_3 )
            {
             before(grammarAccess.getIs_aAccess().getKardinalitaetAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2946:1: ( rule__Is_a__KardinalitaetAssignment_3 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2946:2: rule__Is_a__KardinalitaetAssignment_3
            {
            pushFollow(FOLLOW_rule__Is_a__KardinalitaetAssignment_3_in_rule__Is_a__Group__3__Impl6018);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2956:1: rule__Is_a__Group__4 : rule__Is_a__Group__4__Impl rule__Is_a__Group__5 ;
    public final void rule__Is_a__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2960:1: ( rule__Is_a__Group__4__Impl rule__Is_a__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2961:2: rule__Is_a__Group__4__Impl rule__Is_a__Group__5
            {
            pushFollow(FOLLOW_rule__Is_a__Group__4__Impl_in_rule__Is_a__Group__46048);
            rule__Is_a__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__5_in_rule__Is_a__Group__46051);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2968:1: rule__Is_a__Group__4__Impl : ( ( rule__Is_a__Objekttyp2Assignment_4 ) ) ;
    public final void rule__Is_a__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2972:1: ( ( ( rule__Is_a__Objekttyp2Assignment_4 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2973:1: ( ( rule__Is_a__Objekttyp2Assignment_4 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2973:1: ( ( rule__Is_a__Objekttyp2Assignment_4 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2974:1: ( rule__Is_a__Objekttyp2Assignment_4 )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp2Assignment_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2975:1: ( rule__Is_a__Objekttyp2Assignment_4 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2975:2: rule__Is_a__Objekttyp2Assignment_4
            {
            pushFollow(FOLLOW_rule__Is_a__Objekttyp2Assignment_4_in_rule__Is_a__Group__4__Impl6078);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2985:1: rule__Is_a__Group__5 : rule__Is_a__Group__5__Impl ;
    public final void rule__Is_a__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2989:1: ( rule__Is_a__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2990:2: rule__Is_a__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Is_a__Group__5__Impl_in_rule__Is_a__Group__56108);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:2996:1: rule__Is_a__Group__5__Impl : ( ';' ) ;
    public final void rule__Is_a__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3000:1: ( ( ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3001:1: ( ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3001:1: ( ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3002:1: ';'
            {
             before(grammarAccess.getIs_aAccess().getSemicolonKeyword_5()); 
            match(input,28,FOLLOW_28_in_rule__Is_a__Group__5__Impl6136); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3027:1: rule__Is_part_of__Group__0 : rule__Is_part_of__Group__0__Impl rule__Is_part_of__Group__1 ;
    public final void rule__Is_part_of__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3031:1: ( rule__Is_part_of__Group__0__Impl rule__Is_part_of__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3032:2: rule__Is_part_of__Group__0__Impl rule__Is_part_of__Group__1
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__0__Impl_in_rule__Is_part_of__Group__06179);
            rule__Is_part_of__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__1_in_rule__Is_part_of__Group__06182);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3039:1: rule__Is_part_of__Group__0__Impl : ( ( rule__Is_part_of__AnnotationAssignment_0 )? ) ;
    public final void rule__Is_part_of__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3043:1: ( ( ( rule__Is_part_of__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3044:1: ( ( rule__Is_part_of__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3044:1: ( ( rule__Is_part_of__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3045:1: ( rule__Is_part_of__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getIs_part_ofAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3046:1: ( rule__Is_part_of__AnnotationAssignment_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=34 && LA35_0<=37)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3046:2: rule__Is_part_of__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Is_part_of__AnnotationAssignment_0_in_rule__Is_part_of__Group__0__Impl6209);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3056:1: rule__Is_part_of__Group__1 : rule__Is_part_of__Group__1__Impl rule__Is_part_of__Group__2 ;
    public final void rule__Is_part_of__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3060:1: ( rule__Is_part_of__Group__1__Impl rule__Is_part_of__Group__2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3061:2: rule__Is_part_of__Group__1__Impl rule__Is_part_of__Group__2
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__1__Impl_in_rule__Is_part_of__Group__16240);
            rule__Is_part_of__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__2_in_rule__Is_part_of__Group__16243);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3068:1: rule__Is_part_of__Group__1__Impl : ( 'is_part_of:' ) ;
    public final void rule__Is_part_of__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3072:1: ( ( 'is_part_of:' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3073:1: ( 'is_part_of:' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3073:1: ( 'is_part_of:' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3074:1: 'is_part_of:'
            {
             before(grammarAccess.getIs_part_ofAccess().getIs_part_ofKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Is_part_of__Group__1__Impl6271); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3087:1: rule__Is_part_of__Group__2 : rule__Is_part_of__Group__2__Impl rule__Is_part_of__Group__3 ;
    public final void rule__Is_part_of__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3091:1: ( rule__Is_part_of__Group__2__Impl rule__Is_part_of__Group__3 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3092:2: rule__Is_part_of__Group__2__Impl rule__Is_part_of__Group__3
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__2__Impl_in_rule__Is_part_of__Group__26302);
            rule__Is_part_of__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__3_in_rule__Is_part_of__Group__26305);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3099:1: rule__Is_part_of__Group__2__Impl : ( ( rule__Is_part_of__Objekttyp1Assignment_2 ) ) ;
    public final void rule__Is_part_of__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3103:1: ( ( ( rule__Is_part_of__Objekttyp1Assignment_2 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3104:1: ( ( rule__Is_part_of__Objekttyp1Assignment_2 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3104:1: ( ( rule__Is_part_of__Objekttyp1Assignment_2 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3105:1: ( rule__Is_part_of__Objekttyp1Assignment_2 )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp1Assignment_2()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3106:1: ( rule__Is_part_of__Objekttyp1Assignment_2 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3106:2: rule__Is_part_of__Objekttyp1Assignment_2
            {
            pushFollow(FOLLOW_rule__Is_part_of__Objekttyp1Assignment_2_in_rule__Is_part_of__Group__2__Impl6332);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3116:1: rule__Is_part_of__Group__3 : rule__Is_part_of__Group__3__Impl rule__Is_part_of__Group__4 ;
    public final void rule__Is_part_of__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3120:1: ( rule__Is_part_of__Group__3__Impl rule__Is_part_of__Group__4 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3121:2: rule__Is_part_of__Group__3__Impl rule__Is_part_of__Group__4
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__3__Impl_in_rule__Is_part_of__Group__36362);
            rule__Is_part_of__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__4_in_rule__Is_part_of__Group__36365);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3128:1: rule__Is_part_of__Group__3__Impl : ( ( rule__Is_part_of__KardinalitaetAssignment_3 ) ) ;
    public final void rule__Is_part_of__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3132:1: ( ( ( rule__Is_part_of__KardinalitaetAssignment_3 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3133:1: ( ( rule__Is_part_of__KardinalitaetAssignment_3 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3133:1: ( ( rule__Is_part_of__KardinalitaetAssignment_3 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3134:1: ( rule__Is_part_of__KardinalitaetAssignment_3 )
            {
             before(grammarAccess.getIs_part_ofAccess().getKardinalitaetAssignment_3()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3135:1: ( rule__Is_part_of__KardinalitaetAssignment_3 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3135:2: rule__Is_part_of__KardinalitaetAssignment_3
            {
            pushFollow(FOLLOW_rule__Is_part_of__KardinalitaetAssignment_3_in_rule__Is_part_of__Group__3__Impl6392);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3145:1: rule__Is_part_of__Group__4 : rule__Is_part_of__Group__4__Impl rule__Is_part_of__Group__5 ;
    public final void rule__Is_part_of__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3149:1: ( rule__Is_part_of__Group__4__Impl rule__Is_part_of__Group__5 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3150:2: rule__Is_part_of__Group__4__Impl rule__Is_part_of__Group__5
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__4__Impl_in_rule__Is_part_of__Group__46422);
            rule__Is_part_of__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__5_in_rule__Is_part_of__Group__46425);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3157:1: rule__Is_part_of__Group__4__Impl : ( ( rule__Is_part_of__Objekttyp2Assignment_4 ) ) ;
    public final void rule__Is_part_of__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3161:1: ( ( ( rule__Is_part_of__Objekttyp2Assignment_4 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3162:1: ( ( rule__Is_part_of__Objekttyp2Assignment_4 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3162:1: ( ( rule__Is_part_of__Objekttyp2Assignment_4 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3163:1: ( rule__Is_part_of__Objekttyp2Assignment_4 )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp2Assignment_4()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3164:1: ( rule__Is_part_of__Objekttyp2Assignment_4 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3164:2: rule__Is_part_of__Objekttyp2Assignment_4
            {
            pushFollow(FOLLOW_rule__Is_part_of__Objekttyp2Assignment_4_in_rule__Is_part_of__Group__4__Impl6452);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3174:1: rule__Is_part_of__Group__5 : rule__Is_part_of__Group__5__Impl ;
    public final void rule__Is_part_of__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3178:1: ( rule__Is_part_of__Group__5__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3179:2: rule__Is_part_of__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__5__Impl_in_rule__Is_part_of__Group__56482);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3185:1: rule__Is_part_of__Group__5__Impl : ( ';' ) ;
    public final void rule__Is_part_of__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3189:1: ( ( ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3190:1: ( ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3190:1: ( ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3191:1: ';'
            {
             before(grammarAccess.getIs_part_ofAccess().getSemicolonKeyword_5()); 
            match(input,28,FOLLOW_28_in_rule__Is_part_of__Group__5__Impl6510); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3216:1: rule__Kardinalitaet01__Group__0 : rule__Kardinalitaet01__Group__0__Impl rule__Kardinalitaet01__Group__1 ;
    public final void rule__Kardinalitaet01__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3220:1: ( rule__Kardinalitaet01__Group__0__Impl rule__Kardinalitaet01__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3221:2: rule__Kardinalitaet01__Group__0__Impl rule__Kardinalitaet01__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__0__Impl_in_rule__Kardinalitaet01__Group__06553);
            rule__Kardinalitaet01__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__1_in_rule__Kardinalitaet01__Group__06556);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3228:1: rule__Kardinalitaet01__Group__0__Impl : ( ( rule__Kardinalitaet01__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet01__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3232:1: ( ( ( rule__Kardinalitaet01__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3233:1: ( ( rule__Kardinalitaet01__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3233:1: ( ( rule__Kardinalitaet01__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3234:1: ( rule__Kardinalitaet01__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet01Access().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3235:1: ( rule__Kardinalitaet01__Alternatives_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3235:2: rule__Kardinalitaet01__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Alternatives_0_in_rule__Kardinalitaet01__Group__0__Impl6583);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3245:1: rule__Kardinalitaet01__Group__1 : rule__Kardinalitaet01__Group__1__Impl ;
    public final void rule__Kardinalitaet01__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3249:1: ( rule__Kardinalitaet01__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3250:2: rule__Kardinalitaet01__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__1__Impl_in_rule__Kardinalitaet01__Group__16613);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3256:1: rule__Kardinalitaet01__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet01__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3260:1: ( ( () ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3261:1: ( () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3261:1: ( () )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3262:1: ()
            {
             before(grammarAccess.getKardinalitaet01Access().getKardinalitaet01Action_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3263:1: ()
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3265:1: 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3279:1: rule__Kardinalitaet0x__Group__0 : rule__Kardinalitaet0x__Group__0__Impl rule__Kardinalitaet0x__Group__1 ;
    public final void rule__Kardinalitaet0x__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3283:1: ( rule__Kardinalitaet0x__Group__0__Impl rule__Kardinalitaet0x__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3284:2: rule__Kardinalitaet0x__Group__0__Impl rule__Kardinalitaet0x__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__0__Impl_in_rule__Kardinalitaet0x__Group__06675);
            rule__Kardinalitaet0x__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__1_in_rule__Kardinalitaet0x__Group__06678);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3291:1: rule__Kardinalitaet0x__Group__0__Impl : ( ( rule__Kardinalitaet0x__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet0x__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3295:1: ( ( ( rule__Kardinalitaet0x__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3296:1: ( ( rule__Kardinalitaet0x__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3296:1: ( ( rule__Kardinalitaet0x__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3297:1: ( rule__Kardinalitaet0x__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet0xAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3298:1: ( rule__Kardinalitaet0x__Alternatives_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3298:2: rule__Kardinalitaet0x__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Alternatives_0_in_rule__Kardinalitaet0x__Group__0__Impl6705);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3308:1: rule__Kardinalitaet0x__Group__1 : rule__Kardinalitaet0x__Group__1__Impl ;
    public final void rule__Kardinalitaet0x__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3312:1: ( rule__Kardinalitaet0x__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3313:2: rule__Kardinalitaet0x__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__1__Impl_in_rule__Kardinalitaet0x__Group__16735);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3319:1: rule__Kardinalitaet0x__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet0x__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3323:1: ( ( () ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3324:1: ( () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3324:1: ( () )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3325:1: ()
            {
             before(grammarAccess.getKardinalitaet0xAccess().getKardinalitaet0xAction_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3326:1: ()
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3328:1: 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3342:1: rule__Kardinalitaet11__Group__0 : rule__Kardinalitaet11__Group__0__Impl rule__Kardinalitaet11__Group__1 ;
    public final void rule__Kardinalitaet11__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3346:1: ( rule__Kardinalitaet11__Group__0__Impl rule__Kardinalitaet11__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3347:2: rule__Kardinalitaet11__Group__0__Impl rule__Kardinalitaet11__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__0__Impl_in_rule__Kardinalitaet11__Group__06797);
            rule__Kardinalitaet11__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__1_in_rule__Kardinalitaet11__Group__06800);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3354:1: rule__Kardinalitaet11__Group__0__Impl : ( ( rule__Kardinalitaet11__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet11__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3358:1: ( ( ( rule__Kardinalitaet11__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3359:1: ( ( rule__Kardinalitaet11__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3359:1: ( ( rule__Kardinalitaet11__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3360:1: ( rule__Kardinalitaet11__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet11Access().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3361:1: ( rule__Kardinalitaet11__Alternatives_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3361:2: rule__Kardinalitaet11__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Alternatives_0_in_rule__Kardinalitaet11__Group__0__Impl6827);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3371:1: rule__Kardinalitaet11__Group__1 : rule__Kardinalitaet11__Group__1__Impl ;
    public final void rule__Kardinalitaet11__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3375:1: ( rule__Kardinalitaet11__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3376:2: rule__Kardinalitaet11__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__1__Impl_in_rule__Kardinalitaet11__Group__16857);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3382:1: rule__Kardinalitaet11__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet11__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3386:1: ( ( () ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3387:1: ( () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3387:1: ( () )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3388:1: ()
            {
             before(grammarAccess.getKardinalitaet11Access().getKardinalitaet11Action_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3389:1: ()
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3391:1: 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3405:1: rule__Kardinalitaet1x__Group__0 : rule__Kardinalitaet1x__Group__0__Impl rule__Kardinalitaet1x__Group__1 ;
    public final void rule__Kardinalitaet1x__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3409:1: ( rule__Kardinalitaet1x__Group__0__Impl rule__Kardinalitaet1x__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3410:2: rule__Kardinalitaet1x__Group__0__Impl rule__Kardinalitaet1x__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__0__Impl_in_rule__Kardinalitaet1x__Group__06919);
            rule__Kardinalitaet1x__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__1_in_rule__Kardinalitaet1x__Group__06922);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3417:1: rule__Kardinalitaet1x__Group__0__Impl : ( ( rule__Kardinalitaet1x__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet1x__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3421:1: ( ( ( rule__Kardinalitaet1x__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3422:1: ( ( rule__Kardinalitaet1x__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3422:1: ( ( rule__Kardinalitaet1x__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3423:1: ( rule__Kardinalitaet1x__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet1xAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3424:1: ( rule__Kardinalitaet1x__Alternatives_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3424:2: rule__Kardinalitaet1x__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Alternatives_0_in_rule__Kardinalitaet1x__Group__0__Impl6949);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3434:1: rule__Kardinalitaet1x__Group__1 : rule__Kardinalitaet1x__Group__1__Impl ;
    public final void rule__Kardinalitaet1x__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3438:1: ( rule__Kardinalitaet1x__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3439:2: rule__Kardinalitaet1x__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__1__Impl_in_rule__Kardinalitaet1x__Group__16979);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3445:1: rule__Kardinalitaet1x__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet1x__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3449:1: ( ( () ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3450:1: ( () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3450:1: ( () )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3451:1: ()
            {
             before(grammarAccess.getKardinalitaet1xAccess().getKardinalitaet1xAction_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3452:1: ()
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3454:1: 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3468:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3472:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3473:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__07041);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Name__Group__1_in_rule__Name__Group__07044);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3480:1: rule__Name__Group__0__Impl : ( '@name' ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3484:1: ( ( '@name' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3485:1: ( '@name' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3485:1: ( '@name' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3486:1: '@name'
            {
             before(grammarAccess.getNameAccess().getNameKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Name__Group__0__Impl7072); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3499:1: rule__Name__Group__1 : rule__Name__Group__1__Impl ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3503:1: ( rule__Name__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3504:2: rule__Name__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__17103);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3510:1: rule__Name__Group__1__Impl : ( ( rule__Name__NameAssignment_1 ) ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3514:1: ( ( ( rule__Name__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3515:1: ( ( rule__Name__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3515:1: ( ( rule__Name__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3516:1: ( rule__Name__NameAssignment_1 )
            {
             before(grammarAccess.getNameAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3517:1: ( rule__Name__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3517:2: rule__Name__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Name__NameAssignment_1_in_rule__Name__Group__1__Impl7130);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3531:1: rule__Merge__Group__0 : rule__Merge__Group__0__Impl rule__Merge__Group__1 ;
    public final void rule__Merge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3535:1: ( rule__Merge__Group__0__Impl rule__Merge__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3536:2: rule__Merge__Group__0__Impl rule__Merge__Group__1
            {
            pushFollow(FOLLOW_rule__Merge__Group__0__Impl_in_rule__Merge__Group__07164);
            rule__Merge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Merge__Group__1_in_rule__Merge__Group__07167);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3543:1: rule__Merge__Group__0__Impl : ( '@merge' ) ;
    public final void rule__Merge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3547:1: ( ( '@merge' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3548:1: ( '@merge' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3548:1: ( '@merge' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3549:1: '@merge'
            {
             before(grammarAccess.getMergeAccess().getMergeKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Merge__Group__0__Impl7195); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3562:1: rule__Merge__Group__1 : rule__Merge__Group__1__Impl ;
    public final void rule__Merge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3566:1: ( rule__Merge__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3567:2: rule__Merge__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Merge__Group__1__Impl_in_rule__Merge__Group__17226);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3573:1: rule__Merge__Group__1__Impl : ( ( rule__Merge__NameAssignment_1 ) ) ;
    public final void rule__Merge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3577:1: ( ( ( rule__Merge__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3578:1: ( ( rule__Merge__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3578:1: ( ( rule__Merge__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3579:1: ( rule__Merge__NameAssignment_1 )
            {
             before(grammarAccess.getMergeAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3580:1: ( rule__Merge__NameAssignment_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3580:2: rule__Merge__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Merge__NameAssignment_1_in_rule__Merge__Group__1__Impl7253);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3594:1: rule__Ignore__Group__0 : rule__Ignore__Group__0__Impl rule__Ignore__Group__1 ;
    public final void rule__Ignore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3598:1: ( rule__Ignore__Group__0__Impl rule__Ignore__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3599:2: rule__Ignore__Group__0__Impl rule__Ignore__Group__1
            {
            pushFollow(FOLLOW_rule__Ignore__Group__0__Impl_in_rule__Ignore__Group__07287);
            rule__Ignore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ignore__Group__1_in_rule__Ignore__Group__07290);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3606:1: rule__Ignore__Group__0__Impl : ( '@ignore' ) ;
    public final void rule__Ignore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3610:1: ( ( '@ignore' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3611:1: ( '@ignore' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3611:1: ( '@ignore' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3612:1: '@ignore'
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Ignore__Group__0__Impl7318); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3625:1: rule__Ignore__Group__1 : rule__Ignore__Group__1__Impl ;
    public final void rule__Ignore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3629:1: ( rule__Ignore__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3630:2: rule__Ignore__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Ignore__Group__1__Impl_in_rule__Ignore__Group__17349);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3636:1: rule__Ignore__Group__1__Impl : ( () ) ;
    public final void rule__Ignore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3640:1: ( ( () ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3641:1: ( () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3641:1: ( () )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3642:1: ()
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreAction_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3643:1: ()
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3645:1: 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3659:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3663:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3664:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__07411);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__07414);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3671:1: rule__Version__Group__0__Impl : ( '@version' ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3675:1: ( ( '@version' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3676:1: ( '@version' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3676:1: ( '@version' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3677:1: '@version'
            {
             before(grammarAccess.getVersionAccess().getVersionKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Version__Group__0__Impl7442); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3690:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3694:1: ( rule__Version__Group__1__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3695:2: rule__Version__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__17473);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3701:1: rule__Version__Group__1__Impl : ( ( rule__Version__VersionAssignment_1 ) ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3705:1: ( ( ( rule__Version__VersionAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3706:1: ( ( rule__Version__VersionAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3706:1: ( ( rule__Version__VersionAssignment_1 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3707:1: ( rule__Version__VersionAssignment_1 )
            {
             before(grammarAccess.getVersionAccess().getVersionAssignment_1()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3708:1: ( rule__Version__VersionAssignment_1 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3708:2: rule__Version__VersionAssignment_1
            {
            pushFollow(FOLLOW_rule__Version__VersionAssignment_1_in_rule__Version__Group__1__Impl7500);
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


    // $ANTLR start "rule__AwS__UnorderedGroup_3"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3723:1: rule__AwS__UnorderedGroup_3 : rule__AwS__UnorderedGroup_3__0 {...}?;
    public final void rule__AwS__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAwSAccess().getUnorderedGroup_3());
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3728:1: ( rule__AwS__UnorderedGroup_3__0 {...}?)
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3729:2: rule__AwS__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__AwS__UnorderedGroup_3__0_in_rule__AwS__UnorderedGroup_37535);
            rule__AwS__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAwSAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__AwS__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getAwSAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getAwSAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AwS__UnorderedGroup_3"


    // $ANTLR start "rule__AwS__UnorderedGroup_3__Impl"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3740:1: rule__AwS__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__AwS__KosAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__AwS__VosAssignment_3_1 ) ) ) ) ) ;
    public final void rule__AwS__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3745:1: ( ( ({...}? => ( ( ( rule__AwS__KosAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__AwS__VosAssignment_3_1 ) ) ) ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3746:3: ( ({...}? => ( ( ( rule__AwS__KosAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__AwS__VosAssignment_3_1 ) ) ) ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3746:3: ( ({...}? => ( ( ( rule__AwS__KosAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__AwS__VosAssignment_3_1 ) ) ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( LA36_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) {
                alt36=1;
            }
            else if ( LA36_0 ==RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) ) {
                int LA36_2 = input.LA(2);

                if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) {
                    alt36=1;
                }
                else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) ) {
                    alt36=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;
                }
            }
            else if ( LA36_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3748:4: ({...}? => ( ( ( rule__AwS__KosAssignment_3_0 ) ) ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3748:4: ({...}? => ( ( ( rule__AwS__KosAssignment_3_0 ) ) ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3749:5: {...}? => ( ( ( rule__AwS__KosAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__AwS__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3749:100: ( ( ( rule__AwS__KosAssignment_3_0 ) ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3750:6: ( ( rule__AwS__KosAssignment_3_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3756:6: ( ( rule__AwS__KosAssignment_3_0 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3758:7: ( rule__AwS__KosAssignment_3_0 )
                    {
                     before(grammarAccess.getAwSAccess().getKosAssignment_3_0()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3759:7: ( rule__AwS__KosAssignment_3_0 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3759:8: rule__AwS__KosAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__AwS__KosAssignment_3_0_in_rule__AwS__UnorderedGroup_3__Impl7624);
                    rule__AwS__KosAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAwSAccess().getKosAssignment_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3765:4: ({...}? => ( ( ( rule__AwS__VosAssignment_3_1 ) ) ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3765:4: ({...}? => ( ( ( rule__AwS__VosAssignment_3_1 ) ) ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3766:5: {...}? => ( ( ( rule__AwS__VosAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__AwS__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3766:100: ( ( ( rule__AwS__VosAssignment_3_1 ) ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3767:6: ( ( rule__AwS__VosAssignment_3_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3773:6: ( ( rule__AwS__VosAssignment_3_1 ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3775:7: ( rule__AwS__VosAssignment_3_1 )
                    {
                     before(grammarAccess.getAwSAccess().getVosAssignment_3_1()); 
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3776:7: ( rule__AwS__VosAssignment_3_1 )
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3776:8: rule__AwS__VosAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__AwS__VosAssignment_3_1_in_rule__AwS__UnorderedGroup_3__Impl7715);
                    rule__AwS__VosAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAwSAccess().getVosAssignment_3_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAwSAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AwS__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__AwS__UnorderedGroup_3__0"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3791:1: rule__AwS__UnorderedGroup_3__0 : rule__AwS__UnorderedGroup_3__Impl ( rule__AwS__UnorderedGroup_3__1 )? ;
    public final void rule__AwS__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3795:1: ( rule__AwS__UnorderedGroup_3__Impl ( rule__AwS__UnorderedGroup_3__1 )? )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3796:2: rule__AwS__UnorderedGroup_3__Impl ( rule__AwS__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__AwS__UnorderedGroup_3__Impl_in_rule__AwS__UnorderedGroup_3__07774);
            rule__AwS__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3797:2: ( rule__AwS__UnorderedGroup_3__1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( LA37_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 ==RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) ) {
                alt37=1;
            }
            else if ( LA37_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3797:2: rule__AwS__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__AwS__UnorderedGroup_3__1_in_rule__AwS__UnorderedGroup_3__07777);
                    rule__AwS__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__AwS__UnorderedGroup_3__0"


    // $ANTLR start "rule__AwS__UnorderedGroup_3__1"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3804:1: rule__AwS__UnorderedGroup_3__1 : rule__AwS__UnorderedGroup_3__Impl ;
    public final void rule__AwS__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3808:1: ( rule__AwS__UnorderedGroup_3__Impl )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3809:2: rule__AwS__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__AwS__UnorderedGroup_3__Impl_in_rule__AwS__UnorderedGroup_3__17802);
            rule__AwS__UnorderedGroup_3__Impl();

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
    // $ANTLR end "rule__AwS__UnorderedGroup_3__1"


    // $ANTLR start "rule__AwS__NameAssignment_1"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3820:1: rule__AwS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AwS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3824:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3825:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3825:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3826:1: RULE_ID
            {
             before(grammarAccess.getAwSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AwS__NameAssignment_17834); 
             after(grammarAccess.getAwSAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AwS__NameAssignment_1"


    // $ANTLR start "rule__AwS__VersionAssignment_2_1"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3835:1: rule__AwS__VersionAssignment_2_1 : ( RULE_VERSION_NUMBER ) ;
    public final void rule__AwS__VersionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3839:1: ( ( RULE_VERSION_NUMBER ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3840:1: ( RULE_VERSION_NUMBER )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3840:1: ( RULE_VERSION_NUMBER )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3841:1: RULE_VERSION_NUMBER
            {
             before(grammarAccess.getAwSAccess().getVersionVERSION_NUMBERTerminalRuleCall_2_1_0()); 
            match(input,RULE_VERSION_NUMBER,FOLLOW_RULE_VERSION_NUMBER_in_rule__AwS__VersionAssignment_2_17865); 
             after(grammarAccess.getAwSAccess().getVersionVERSION_NUMBERTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AwS__VersionAssignment_2_1"


    // $ANTLR start "rule__AwS__KosAssignment_3_0"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3850:1: rule__AwS__KosAssignment_3_0 : ( ruleKOS ) ;
    public final void rule__AwS__KosAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3854:1: ( ( ruleKOS ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3855:1: ( ruleKOS )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3855:1: ( ruleKOS )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3856:1: ruleKOS
            {
             before(grammarAccess.getAwSAccess().getKosKOSParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleKOS_in_rule__AwS__KosAssignment_3_07896);
            ruleKOS();

            state._fsp--;

             after(grammarAccess.getAwSAccess().getKosKOSParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AwS__KosAssignment_3_0"


    // $ANTLR start "rule__AwS__VosAssignment_3_1"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3865:1: rule__AwS__VosAssignment_3_1 : ( ruleVOS ) ;
    public final void rule__AwS__VosAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3869:1: ( ( ruleVOS ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3870:1: ( ruleVOS )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3870:1: ( ruleVOS )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3871:1: ruleVOS
            {
             before(grammarAccess.getAwSAccess().getVosVOSParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleVOS_in_rule__AwS__VosAssignment_3_17927);
            ruleVOS();

            state._fsp--;

             after(grammarAccess.getAwSAccess().getVosVOSParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AwS__VosAssignment_3_1"


    // $ANTLR start "rule__VOS__NameAssignment_0_0"
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3880:1: rule__VOS__NameAssignment_0_0 : ( ( 'VOS' ) ) ;
    public final void rule__VOS__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3884:1: ( ( ( 'VOS' ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3885:1: ( ( 'VOS' ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3885:1: ( ( 'VOS' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3886:1: ( 'VOS' )
            {
             before(grammarAccess.getVOSAccess().getNameVOSKeyword_0_0_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3887:1: ( 'VOS' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3888:1: 'VOS'
            {
             before(grammarAccess.getVOSAccess().getNameVOSKeyword_0_0_0()); 
            match(input,38,FOLLOW_38_in_rule__VOS__NameAssignment_0_07963); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3903:1: rule__VOS__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__VOS__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3907:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3908:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3908:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3909:1: RULE_ID
            {
             before(grammarAccess.getVOSAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VOS__NameAssignment_0_18002); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3918:1: rule__VOS__ObjekttypenAssignment_2_0 : ( ruleVOT ) ;
    public final void rule__VOS__ObjekttypenAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3922:1: ( ( ruleVOT ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3923:1: ( ruleVOT )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3923:1: ( ruleVOT )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3924:1: ruleVOT
            {
             before(grammarAccess.getVOSAccess().getObjekttypenVOTParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleVOT_in_rule__VOS__ObjekttypenAssignment_2_08033);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3933:1: rule__VOS__BeziehungenAssignment_2_1 : ( ruleInteracts_with ) ;
    public final void rule__VOS__BeziehungenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3937:1: ( ( ruleInteracts_with ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3938:1: ( ruleInteracts_with )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3938:1: ( ruleInteracts_with )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3939:1: ruleInteracts_with
            {
             before(grammarAccess.getVOSAccess().getBeziehungenInteracts_withParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleInteracts_with_in_rule__VOS__BeziehungenAssignment_2_18064);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3948:1: rule__VOS__GliederungAssignment_2_2 : ( ruleVOS ) ;
    public final void rule__VOS__GliederungAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3952:1: ( ( ruleVOS ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3953:1: ( ruleVOS )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3953:1: ( ruleVOS )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3954:1: ruleVOS
            {
             before(grammarAccess.getVOSAccess().getGliederungVOSParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleVOS_in_rule__VOS__GliederungAssignment_2_28095);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3963:1: rule__KOS__NameAssignment_0_0 : ( ( 'KOS' ) ) ;
    public final void rule__KOS__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3967:1: ( ( ( 'KOS' ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3968:1: ( ( 'KOS' ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3968:1: ( ( 'KOS' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3969:1: ( 'KOS' )
            {
             before(grammarAccess.getKOSAccess().getNameKOSKeyword_0_0_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3970:1: ( 'KOS' )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3971:1: 'KOS'
            {
             before(grammarAccess.getKOSAccess().getNameKOSKeyword_0_0_0()); 
            match(input,39,FOLLOW_39_in_rule__KOS__NameAssignment_0_08131); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3986:1: rule__KOS__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__KOS__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3990:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3991:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3991:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:3992:1: RULE_ID
            {
             before(grammarAccess.getKOSAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KOS__NameAssignment_0_18170); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4001:1: rule__KOS__ObjekttypenAssignment_2_0 : ( ruleKOT ) ;
    public final void rule__KOS__ObjekttypenAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4005:1: ( ( ruleKOT ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4006:1: ( ruleKOT )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4006:1: ( ruleKOT )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4007:1: ruleKOT
            {
             before(grammarAccess.getKOSAccess().getObjekttypenKOTParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleKOT_in_rule__KOS__ObjekttypenAssignment_2_08201);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4016:1: rule__KOS__BeziehungenAssignment_2_1 : ( ruleBeziehung ) ;
    public final void rule__KOS__BeziehungenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4020:1: ( ( ruleBeziehung ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4021:1: ( ruleBeziehung )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4021:1: ( ruleBeziehung )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4022:1: ruleBeziehung
            {
             before(grammarAccess.getKOSAccess().getBeziehungenBeziehungParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBeziehung_in_rule__KOS__BeziehungenAssignment_2_18232);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4031:1: rule__KOS__GliederungAssignment_2_2 : ( ruleKOS ) ;
    public final void rule__KOS__GliederungAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4035:1: ( ( ruleKOS ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4036:1: ( ruleKOS )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4036:1: ( ruleKOS )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4037:1: ruleKOS
            {
             before(grammarAccess.getKOSAccess().getGliederungKOSParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleKOS_in_rule__KOS__GliederungAssignment_2_28263);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4046:1: rule__VOT__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__VOT__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4050:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4051:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4051:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4052:1: ruleAnnotation
            {
             before(grammarAccess.getVOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__VOT__AnnotationAssignment_08294);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4061:1: rule__VOT__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VOT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4065:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4066:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4066:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4067:1: RULE_ID
            {
             before(grammarAccess.getVOTAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VOT__NameAssignment_28325); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4076:1: rule__VOT__AttributeAssignment_4_0 : ( ruleAttribut ) ;
    public final void rule__VOT__AttributeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4080:1: ( ( ruleAttribut ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4081:1: ( ruleAttribut )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4081:1: ( ruleAttribut )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4082:1: ruleAttribut
            {
             before(grammarAccess.getVOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleAttribut_in_rule__VOT__AttributeAssignment_4_08356);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4091:1: rule__VOT__OperatorenAssignment_4_1 : ( ruleOperator ) ;
    public final void rule__VOT__OperatorenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4095:1: ( ( ruleOperator ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4096:1: ( ruleOperator )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4096:1: ( ruleOperator )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4097:1: ruleOperator
            {
             before(grammarAccess.getVOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__VOT__OperatorenAssignment_4_18387);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4106:1: rule__OOT__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__OOT__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4110:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4111:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4111:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4112:1: ruleAnnotation
            {
             before(grammarAccess.getOOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__OOT__AnnotationAssignment_08418);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4121:1: rule__OOT__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OOT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4125:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4126:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4126:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4127:1: RULE_ID
            {
             before(grammarAccess.getOOTAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OOT__NameAssignment_28449); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4136:1: rule__OOT__AttributeAssignment_4_0 : ( ruleAttribut ) ;
    public final void rule__OOT__AttributeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4140:1: ( ( ruleAttribut ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4141:1: ( ruleAttribut )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4141:1: ( ruleAttribut )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4142:1: ruleAttribut
            {
             before(grammarAccess.getOOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleAttribut_in_rule__OOT__AttributeAssignment_4_08480);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4151:1: rule__OOT__OperatorenAssignment_4_1 : ( ruleOperator ) ;
    public final void rule__OOT__OperatorenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4155:1: ( ( ruleOperator ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4156:1: ( ruleOperator )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4156:1: ( ruleOperator )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4157:1: ruleOperator
            {
             before(grammarAccess.getOOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__OOT__OperatorenAssignment_4_18511);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4166:1: rule__LOT__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__LOT__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4170:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4171:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4171:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4172:1: ruleAnnotation
            {
             before(grammarAccess.getLOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__LOT__AnnotationAssignment_08542);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4181:1: rule__LOT__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LOT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4185:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4186:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4186:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4187:1: RULE_ID
            {
             before(grammarAccess.getLOTAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LOT__NameAssignment_28573); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4196:1: rule__LOT__AttributeAssignment_4_0 : ( ruleAttribut ) ;
    public final void rule__LOT__AttributeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4200:1: ( ( ruleAttribut ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4201:1: ( ruleAttribut )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4201:1: ( ruleAttribut )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4202:1: ruleAttribut
            {
             before(grammarAccess.getLOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleAttribut_in_rule__LOT__AttributeAssignment_4_08604);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4211:1: rule__LOT__OperatorenAssignment_4_1 : ( ruleOperator ) ;
    public final void rule__LOT__OperatorenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4215:1: ( ( ruleOperator ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4216:1: ( ruleOperator )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4216:1: ( ruleOperator )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4217:1: ruleOperator
            {
             before(grammarAccess.getLOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__LOT__OperatorenAssignment_4_18635);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4226:1: rule__TOT__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__TOT__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4230:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4231:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4231:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4232:1: ruleAnnotation
            {
             before(grammarAccess.getTOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__TOT__AnnotationAssignment_08666);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4241:1: rule__TOT__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TOT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4245:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4246:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4246:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4247:1: RULE_ID
            {
             before(grammarAccess.getTOTAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TOT__NameAssignment_28697); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4256:1: rule__TOT__AttributeAssignment_4_0 : ( ruleAttribut ) ;
    public final void rule__TOT__AttributeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4260:1: ( ( ruleAttribut ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4261:1: ( ruleAttribut )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4261:1: ( ruleAttribut )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4262:1: ruleAttribut
            {
             before(grammarAccess.getTOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleAttribut_in_rule__TOT__AttributeAssignment_4_08728);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4271:1: rule__TOT__OperatorenAssignment_4_1 : ( ruleOperator ) ;
    public final void rule__TOT__OperatorenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4275:1: ( ( ruleOperator ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4276:1: ( ruleOperator )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4276:1: ( ruleOperator )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4277:1: ruleOperator
            {
             before(grammarAccess.getTOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__TOT__OperatorenAssignment_4_18759);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4286:1: rule__Attribut__TypAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribut__TypAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4290:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4291:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4291:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4292:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributAccess().getTypObjekttypCrossReference_0_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4293:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4294:1: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getTypObjekttypIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribut__TypAssignment_08794); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4305:1: rule__Attribut__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4309:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4310:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4310:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4311:1: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribut__NameAssignment_18829); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4320:1: rule__Operator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Operator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4324:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4325:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4325:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4326:1: RULE_ID
            {
             before(grammarAccess.getOperatorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operator__NameAssignment_08860); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4335:1: rule__Operator__ParameterAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Operator__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4339:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4340:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4340:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4341:1: ( RULE_ID )
            {
             before(grammarAccess.getOperatorAccess().getParameterObjekttypCrossReference_2_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4342:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4343:1: RULE_ID
            {
             before(grammarAccess.getOperatorAccess().getParameterObjekttypIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operator__ParameterAssignment_28895); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4354:1: rule__Interacts_with__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Interacts_with__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4358:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4359:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4359:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4360:1: ruleAnnotation
            {
             before(grammarAccess.getInteracts_withAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Interacts_with__AnnotationAssignment_08930);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4369:1: rule__Interacts_with__Objekttyp1Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Interacts_with__Objekttyp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4373:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4374:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4374:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4375:1: ( RULE_ID )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4376:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4377:1: RULE_ID
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp1Assignment_28965); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4388:1: rule__Interacts_with__KardinalitaetAssignment_3 : ( ( rule__Interacts_with__KardinalitaetAlternatives_3_0 ) ) ;
    public final void rule__Interacts_with__KardinalitaetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4392:1: ( ( ( rule__Interacts_with__KardinalitaetAlternatives_3_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4393:1: ( ( rule__Interacts_with__KardinalitaetAlternatives_3_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4393:1: ( ( rule__Interacts_with__KardinalitaetAlternatives_3_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4394:1: ( rule__Interacts_with__KardinalitaetAlternatives_3_0 )
            {
             before(grammarAccess.getInteracts_withAccess().getKardinalitaetAlternatives_3_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4395:1: ( rule__Interacts_with__KardinalitaetAlternatives_3_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4395:2: rule__Interacts_with__KardinalitaetAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Interacts_with__KardinalitaetAlternatives_3_0_in_rule__Interacts_with__KardinalitaetAssignment_39000);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4404:1: rule__Interacts_with__Objekttyp2Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Interacts_with__Objekttyp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4408:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4409:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4409:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4410:1: ( RULE_ID )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4411:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4412:1: RULE_ID
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp2Assignment_49037); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4423:1: rule__Is_a__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Is_a__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4427:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4428:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4428:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4429:1: ruleAnnotation
            {
             before(grammarAccess.getIs_aAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Is_a__AnnotationAssignment_09072);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4438:1: rule__Is_a__Objekttyp1Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Is_a__Objekttyp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4442:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4443:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4443:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4444:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4445:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4446:1: RULE_ID
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp1Assignment_29107); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4457:1: rule__Is_a__KardinalitaetAssignment_3 : ( ( rule__Is_a__KardinalitaetAlternatives_3_0 ) ) ;
    public final void rule__Is_a__KardinalitaetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4461:1: ( ( ( rule__Is_a__KardinalitaetAlternatives_3_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4462:1: ( ( rule__Is_a__KardinalitaetAlternatives_3_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4462:1: ( ( rule__Is_a__KardinalitaetAlternatives_3_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4463:1: ( rule__Is_a__KardinalitaetAlternatives_3_0 )
            {
             before(grammarAccess.getIs_aAccess().getKardinalitaetAlternatives_3_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4464:1: ( rule__Is_a__KardinalitaetAlternatives_3_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4464:2: rule__Is_a__KardinalitaetAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Is_a__KardinalitaetAlternatives_3_0_in_rule__Is_a__KardinalitaetAssignment_39142);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4473:1: rule__Is_a__Objekttyp2Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Is_a__Objekttyp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4477:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4478:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4478:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4479:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4480:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4481:1: RULE_ID
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp2Assignment_49179); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4492:1: rule__Is_part_of__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Is_part_of__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4496:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4497:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4497:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4498:1: ruleAnnotation
            {
             before(grammarAccess.getIs_part_ofAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Is_part_of__AnnotationAssignment_09214);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4507:1: rule__Is_part_of__Objekttyp1Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Is_part_of__Objekttyp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4511:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4512:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4512:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4513:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4514:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4515:1: RULE_ID
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp1Assignment_29249); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4526:1: rule__Is_part_of__KardinalitaetAssignment_3 : ( ( rule__Is_part_of__KardinalitaetAlternatives_3_0 ) ) ;
    public final void rule__Is_part_of__KardinalitaetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4530:1: ( ( ( rule__Is_part_of__KardinalitaetAlternatives_3_0 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4531:1: ( ( rule__Is_part_of__KardinalitaetAlternatives_3_0 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4531:1: ( ( rule__Is_part_of__KardinalitaetAlternatives_3_0 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4532:1: ( rule__Is_part_of__KardinalitaetAlternatives_3_0 )
            {
             before(grammarAccess.getIs_part_ofAccess().getKardinalitaetAlternatives_3_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4533:1: ( rule__Is_part_of__KardinalitaetAlternatives_3_0 )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4533:2: rule__Is_part_of__KardinalitaetAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Is_part_of__KardinalitaetAlternatives_3_0_in_rule__Is_part_of__KardinalitaetAssignment_39284);
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4542:1: rule__Is_part_of__Objekttyp2Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Is_part_of__Objekttyp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4546:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4547:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4547:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4548:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4549:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4550:1: RULE_ID
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp2Assignment_49321); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4561:1: rule__Name__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Name__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4565:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4566:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4566:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4567:1: RULE_ID
            {
             before(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__NameAssignment_19356); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4576:1: rule__Merge__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Merge__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4580:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4581:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4581:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4582:1: RULE_ID
            {
             before(grammarAccess.getMergeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Merge__NameAssignment_19387); 
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
    // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4591:1: rule__Version__VersionAssignment_1 : ( RULE_VERSION_NUMBER ) ;
    public final void rule__Version__VersionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4595:1: ( ( RULE_VERSION_NUMBER ) )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4596:1: ( RULE_VERSION_NUMBER )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4596:1: ( RULE_VERSION_NUMBER )
            // ../de.uniba.wiai.seda.fha.som.aws.ui/src-gen/de/uniba/wiai/seda/fha/som/aws/ui/contentassist/antlr/internal/InternalAws.g:4597:1: RULE_VERSION_NUMBER
            {
             before(grammarAccess.getVersionAccess().getVersionVERSION_NUMBERTerminalRuleCall_1_0()); 
            match(input,RULE_VERSION_NUMBER,FOLLOW_RULE_VERSION_NUMBER_in_rule__Version__VersionAssignment_19418); 
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA2_eotS =
        "\14\uffff";
    static final String DFA2_eofS =
        "\14\uffff";
    static final String DFA2_minS =
        "\4\4\1\5\2\uffff\1\14\1\uffff\3\4";
    static final String DFA2_maxS =
        "\1\46\1\4\1\37\1\4\1\5\2\uffff\1\26\1\uffff\3\37";
    static final String DFA2_acceptS =
        "\5\uffff\1\1\1\2\1\uffff\1\3\3\uffff";
    static final String DFA2_specialS =
        "\14\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\7\23\uffff\1\5\6\uffff\1\6\2\uffff\1\1\1\3\1\2\1\4\1\10",
            "\1\11",
            "\1\6\23\uffff\1\5\6\uffff\1\6",
            "\1\12",
            "\1\13",
            "",
            "",
            "\4\6\2\uffff\2\6\2\uffff\1\10",
            "",
            "\1\6\23\uffff\1\5\6\uffff\1\6",
            "\1\6\23\uffff\1\5\6\uffff\1\6",
            "\1\6\23\uffff\1\5\6\uffff\1\6"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "733:1: rule__VOS__Alternatives_2 : ( ( ( rule__VOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__VOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__VOS__GliederungAssignment_2_2 ) ) );";
        }
    }
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\4\4\1\5\2\uffff\1\14\1\uffff\3\4";
    static final String DFA4_maxS =
        "\1\47\1\4\1\41\1\4\1\5\2\uffff\1\26\1\uffff\3\41";
    static final String DFA4_acceptS =
        "\5\uffff\1\1\1\2\1\uffff\1\3\3\uffff";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\7\24\uffff\3\5\3\uffff\3\6\1\1\1\3\1\2\1\4\1\uffff\1\10",
            "\1\11",
            "\1\6\24\uffff\3\5\3\uffff\3\6",
            "\1\12",
            "\1\13",
            "",
            "",
            "\4\6\2\uffff\2\6\2\uffff\1\10",
            "",
            "\1\6\24\uffff\3\5\3\uffff\3\6",
            "\1\6\24\uffff\3\5\3\uffff\3\6",
            "\1\6\24\uffff\3\5\3\uffff\3\6"
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
            return "783:1: rule__KOS__Alternatives_2 : ( ( ( rule__KOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__KOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__KOS__GliederungAssignment_2_2 ) ) );";
        }
    }
    static final String DFA6_eotS =
        "\13\uffff";
    static final String DFA6_eofS =
        "\13\uffff";
    static final String DFA6_minS =
        "\1\31\1\4\1\31\1\4\1\5\3\uffff\3\31";
    static final String DFA6_maxS =
        "\1\45\1\4\1\33\1\4\1\5\3\uffff\3\33";
    static final String DFA6_acceptS =
        "\5\uffff\1\1\1\2\1\3\3\uffff";
    static final String DFA6_specialS =
        "\13\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\5\1\6\1\7\6\uffff\1\1\1\3\1\2\1\4",
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
            return "834:1: rule__KOT__Alternatives : ( ( ruleOOT ) | ( ruleLOT ) | ( ruleTOT ) );";
        }
    }
    static final String DFA10_eotS =
        "\13\uffff";
    static final String DFA10_eofS =
        "\13\uffff";
    static final String DFA10_minS =
        "\4\4\1\5\3\uffff\3\4";
    static final String DFA10_maxS =
        "\1\45\1\4\1\41\1\4\1\5\3\uffff\3\41";
    static final String DFA10_acceptS =
        "\5\uffff\1\1\1\2\1\3\3\uffff";
    static final String DFA10_specialS =
        "\13\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\5\32\uffff\1\5\1\6\1\7\1\1\1\3\1\2\1\4",
            "\1\10",
            "\1\5\32\uffff\1\5\1\6\1\7",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "\1\5\32\uffff\1\5\1\6\1\7",
            "\1\5\32\uffff\1\5\1\6\1\7",
            "\1\5\32\uffff\1\5\1\6\1\7"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "928:1: rule__Beziehung__Alternatives : ( ( ruleInteracts_with ) | ( ruleIs_a ) | ( ruleIs_part_of ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleAwS_in_entryRuleAwS61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwS68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group__0_in_ruleAwS94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOS_in_entryRuleVOS123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVOS130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Group__0_in_ruleVOS156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOS_in_entryRuleKOS183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKOS190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Group__0_in_ruleKOS216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOT_in_entryRuleVOT245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVOT252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__0_in_ruleVOT278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOT_in_entryRuleKOT305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKOT312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOT__Alternatives_in_ruleKOT338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_entryRuleOOT365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOOT372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__0_in_ruleOOT398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_entryRuleLOT425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOT432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__0_in_ruleLOT458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_entryRuleTOT485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTOT492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__0_in_ruleTOT518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_entryRuleAttribut545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribut552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__0_in_ruleAttribut578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__0_in_ruleOperator638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeziehung_in_entryRuleBeziehung665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeziehung672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Beziehung__Alternatives_in_ruleBeziehung698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteracts_with732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__0_in_ruleInteracts_with758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_a_in_entryRuleIs_a785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_a792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__0_in_ruleIs_a818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_part_of852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__0_in_ruleIs_part_of878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet01907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet01914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__0_in_ruleKardinalitaet01940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet0x974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__0_in_ruleKardinalitaet0x1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet111027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet111034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__0_in_ruleKardinalitaet111060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet1x1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__0_in_ruleKardinalitaet1x1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__0_in_ruleName1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_entryRuleMerge1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMerge1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__Group__0_in_ruleMerge1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_entryRuleIgnore1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIgnore1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ignore__Group__0_in_ruleIgnore1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0_in_ruleVersion1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__NameAssignment_0_0_in_rule__VOS__Alternatives_01457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__NameAssignment_0_1_in_rule__VOS__Alternatives_01475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__ObjekttypenAssignment_2_0_in_rule__VOS__Alternatives_21508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__BeziehungenAssignment_2_1_in_rule__VOS__Alternatives_21526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__GliederungAssignment_2_2_in_rule__VOS__Alternatives_21544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__NameAssignment_0_0_in_rule__KOS__Alternatives_01577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__NameAssignment_0_1_in_rule__KOS__Alternatives_01595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__ObjekttypenAssignment_2_0_in_rule__KOS__Alternatives_21628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__BeziehungenAssignment_2_1_in_rule__KOS__Alternatives_21646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__GliederungAssignment_2_2_in_rule__KOS__Alternatives_21664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__AttributeAssignment_4_0_in_rule__VOT__Alternatives_41698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__OperatorenAssignment_4_1_in_rule__VOT__Alternatives_41716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_rule__KOT__Alternatives1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_rule__KOT__Alternatives1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_rule__KOT__Alternatives1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__AttributeAssignment_4_0_in_rule__OOT__Alternatives_41815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__OperatorenAssignment_4_1_in_rule__OOT__Alternatives_41833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__AttributeAssignment_4_0_in_rule__LOT__Alternatives_41866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__OperatorenAssignment_4_1_in_rule__LOT__Alternatives_41884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__AttributeAssignment_4_0_in_rule__TOT__Alternatives_41917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__OperatorenAssignment_4_1_in_rule__TOT__Alternatives_41935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_rule__Beziehung__Alternatives1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_a_in_rule__Beziehung__Alternatives1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_rule__Beziehung__Alternatives2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_rule__Interacts_with__KardinalitaetAlternatives_3_02034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_rule__Interacts_with__KardinalitaetAlternatives_3_02051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_rule__Interacts_with__KardinalitaetAlternatives_3_02068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_rule__Is_a__KardinalitaetAlternatives_3_02100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_rule__Is_a__KardinalitaetAlternatives_3_02117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_rule__Is_part_of__KardinalitaetAlternatives_3_02149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_rule__Is_part_of__KardinalitaetAlternatives_3_02166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_rule__Is_part_of__KardinalitaetAlternatives_3_02183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Kardinalitaet01__Alternatives_02217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Kardinalitaet01__Alternatives_02237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Kardinalitaet0x__Alternatives_02272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Kardinalitaet0x__Alternatives_02292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Kardinalitaet11__Alternatives_02327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Kardinalitaet11__Alternatives_02347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Kardinalitaet1x__Alternatives_02382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Kardinalitaet1x__Alternatives_02402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Annotation__Alternatives2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_rule__Annotation__Alternatives2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_rule__Annotation__Alternatives2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__Annotation__Alternatives2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group__0__Impl_in_rule__AwS__Group__02517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AwS__Group__1_in_rule__AwS__Group__02520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AwS__Group__0__Impl2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group__1__Impl_in_rule__AwS__Group__12579 = new BitSet(new long[]{0x000000C000200010L});
    public static final BitSet FOLLOW_rule__AwS__Group__2_in_rule__AwS__Group__12582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__NameAssignment_1_in_rule__AwS__Group__1__Impl2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group__2__Impl_in_rule__AwS__Group__22639 = new BitSet(new long[]{0x000000C000200010L});
    public static final BitSet FOLLOW_rule__AwS__Group__3_in_rule__AwS__Group__22642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group_2__0_in_rule__AwS__Group__2__Impl2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group__3__Impl_in_rule__AwS__Group__32700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__UnorderedGroup_3_in_rule__AwS__Group__3__Impl2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group_2__0__Impl_in_rule__AwS__Group_2__02765 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AwS__Group_2__1_in_rule__AwS__Group_2__02768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AwS__Group_2__0__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group_2__1__Impl_in_rule__AwS__Group_2__12827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__VersionAssignment_2_1_in_rule__AwS__Group_2__1__Impl2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Group__0__Impl_in_rule__VOS__Group__02888 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__VOS__Group__1_in_rule__VOS__Group__02891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Alternatives_0_in_rule__VOS__Group__0__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Group__1__Impl_in_rule__VOS__Group__12948 = new BitSet(new long[]{0x000000FC81200010L});
    public static final BitSet FOLLOW_rule__VOS__Group__2_in_rule__VOS__Group__12951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VOS__Group__1__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Group__2__Impl_in_rule__VOS__Group__23010 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__VOS__Group__3_in_rule__VOS__Group__23013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Alternatives_2_in_rule__VOS__Group__2__Impl3042 = new BitSet(new long[]{0x000000FC81200012L});
    public static final BitSet FOLLOW_rule__VOS__Alternatives_2_in_rule__VOS__Group__2__Impl3054 = new BitSet(new long[]{0x000000FC81200012L});
    public static final BitSet FOLLOW_rule__VOS__Group__3__Impl_in_rule__VOS__Group__33087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VOS__Group__3__Impl3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Group__0__Impl_in_rule__KOS__Group__03154 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__KOS__Group__1_in_rule__KOS__Group__03157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Alternatives_0_in_rule__KOS__Group__0__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Group__1__Impl_in_rule__KOS__Group__13214 = new BitSet(new long[]{0x000000BF8E000010L});
    public static final BitSet FOLLOW_rule__KOS__Group__2_in_rule__KOS__Group__13217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__KOS__Group__1__Impl3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Group__2__Impl_in_rule__KOS__Group__23276 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__KOS__Group__3_in_rule__KOS__Group__23279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Alternatives_2_in_rule__KOS__Group__2__Impl3308 = new BitSet(new long[]{0x000000BF8E000012L});
    public static final BitSet FOLLOW_rule__KOS__Alternatives_2_in_rule__KOS__Group__2__Impl3320 = new BitSet(new long[]{0x000000BF8E000012L});
    public static final BitSet FOLLOW_rule__KOS__Group__3__Impl_in_rule__KOS__Group__33353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__KOS__Group__3__Impl3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__0__Impl_in_rule__VOT__Group__03420 = new BitSet(new long[]{0x0000003C01000000L});
    public static final BitSet FOLLOW_rule__VOT__Group__1_in_rule__VOT__Group__03423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__AnnotationAssignment_0_in_rule__VOT__Group__0__Impl3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__1__Impl_in_rule__VOT__Group__13481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VOT__Group__2_in_rule__VOT__Group__13484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__VOT__Group__1__Impl3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__2__Impl_in_rule__VOT__Group__23543 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__VOT__Group__3_in_rule__VOT__Group__23546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__NameAssignment_2_in_rule__VOT__Group__2__Impl3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__3__Impl_in_rule__VOT__Group__33603 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__VOT__Group__4_in_rule__VOT__Group__33606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VOT__Group__3__Impl3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__4__Impl_in_rule__VOT__Group__43665 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__VOT__Group__5_in_rule__VOT__Group__43668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Alternatives_4_in_rule__VOT__Group__4__Impl3695 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__VOT__Group__5__Impl_in_rule__VOT__Group__53726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VOT__Group__5__Impl3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__0__Impl_in_rule__OOT__Group__03797 = new BitSet(new long[]{0x0000003C02000000L});
    public static final BitSet FOLLOW_rule__OOT__Group__1_in_rule__OOT__Group__03800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__AnnotationAssignment_0_in_rule__OOT__Group__0__Impl3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__1__Impl_in_rule__OOT__Group__13858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OOT__Group__2_in_rule__OOT__Group__13861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__OOT__Group__1__Impl3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__2__Impl_in_rule__OOT__Group__23920 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__OOT__Group__3_in_rule__OOT__Group__23923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__NameAssignment_2_in_rule__OOT__Group__2__Impl3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__3__Impl_in_rule__OOT__Group__33980 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__OOT__Group__4_in_rule__OOT__Group__33983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__OOT__Group__3__Impl4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__4__Impl_in_rule__OOT__Group__44042 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__OOT__Group__5_in_rule__OOT__Group__44045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Alternatives_4_in_rule__OOT__Group__4__Impl4072 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__OOT__Group__5__Impl_in_rule__OOT__Group__54103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__OOT__Group__5__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__0__Impl_in_rule__LOT__Group__04174 = new BitSet(new long[]{0x0000003C04000000L});
    public static final BitSet FOLLOW_rule__LOT__Group__1_in_rule__LOT__Group__04177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__AnnotationAssignment_0_in_rule__LOT__Group__0__Impl4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__1__Impl_in_rule__LOT__Group__14235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LOT__Group__2_in_rule__LOT__Group__14238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LOT__Group__1__Impl4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__2__Impl_in_rule__LOT__Group__24297 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__LOT__Group__3_in_rule__LOT__Group__24300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__NameAssignment_2_in_rule__LOT__Group__2__Impl4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__3__Impl_in_rule__LOT__Group__34357 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__LOT__Group__4_in_rule__LOT__Group__34360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LOT__Group__3__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__4__Impl_in_rule__LOT__Group__44419 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__LOT__Group__5_in_rule__LOT__Group__44422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Alternatives_4_in_rule__LOT__Group__4__Impl4449 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__LOT__Group__5__Impl_in_rule__LOT__Group__54480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LOT__Group__5__Impl4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__0__Impl_in_rule__TOT__Group__04551 = new BitSet(new long[]{0x0000003C0E000000L});
    public static final BitSet FOLLOW_rule__TOT__Group__1_in_rule__TOT__Group__04554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__AnnotationAssignment_0_in_rule__TOT__Group__0__Impl4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__1__Impl_in_rule__TOT__Group__14612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TOT__Group__2_in_rule__TOT__Group__14615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TOT__Group__1__Impl4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__2__Impl_in_rule__TOT__Group__24674 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TOT__Group__3_in_rule__TOT__Group__24677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__NameAssignment_2_in_rule__TOT__Group__2__Impl4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__3__Impl_in_rule__TOT__Group__34734 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__TOT__Group__4_in_rule__TOT__Group__34737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TOT__Group__3__Impl4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__4__Impl_in_rule__TOT__Group__44796 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__TOT__Group__5_in_rule__TOT__Group__44799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Alternatives_4_in_rule__TOT__Group__4__Impl4826 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__TOT__Group__5__Impl_in_rule__TOT__Group__54857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TOT__Group__5__Impl4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__0__Impl_in_rule__Attribut__Group__04928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribut__Group__1_in_rule__Attribut__Group__04931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__TypAssignment_0_in_rule__Attribut__Group__0__Impl4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__1__Impl_in_rule__Attribut__Group__14989 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Attribut__Group__2_in_rule__Attribut__Group__14992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__NameAssignment_1_in_rule__Attribut__Group__1__Impl5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__2__Impl_in_rule__Attribut__Group__25049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Attribut__Group__2__Impl5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__0__Impl_in_rule__Operator__Group__05114 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Operator__Group__1_in_rule__Operator__Group__05117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__NameAssignment_0_in_rule__Operator__Group__0__Impl5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__1__Impl_in_rule__Operator__Group__15174 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Operator__Group__2_in_rule__Operator__Group__15177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Operator__Group__1__Impl5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__2__Impl_in_rule__Operator__Group__25236 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Operator__Group__3_in_rule__Operator__Group__25239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__ParameterAssignment_2_in_rule__Operator__Group__2__Impl5266 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Operator__Group__3__Impl_in_rule__Operator__Group__35297 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Operator__Group__4_in_rule__Operator__Group__35300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Operator__Group__3__Impl5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__4__Impl_in_rule__Operator__Group__45359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Operator__Group__4__Impl5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__0__Impl_in_rule__Interacts_with__Group__05428 = new BitSet(new long[]{0x0000003C80000010L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__1_in_rule__Interacts_with__Group__05431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__AnnotationAssignment_0_in_rule__Interacts_with__Group__0__Impl5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__1__Impl_in_rule__Interacts_with__Group__15489 = new BitSet(new long[]{0x0000003C80000010L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__2_in_rule__Interacts_with__Group__15492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Interacts_with__Group__1__Impl5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__2__Impl_in_rule__Interacts_with__Group__25554 = new BitSet(new long[]{0x00000000000CF000L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__3_in_rule__Interacts_with__Group__25557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Objekttyp1Assignment_2_in_rule__Interacts_with__Group__2__Impl5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__3__Impl_in_rule__Interacts_with__Group__35614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__4_in_rule__Interacts_with__Group__35617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__KardinalitaetAssignment_3_in_rule__Interacts_with__Group__3__Impl5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__4__Impl_in_rule__Interacts_with__Group__45674 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__5_in_rule__Interacts_with__Group__45677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Objekttyp2Assignment_4_in_rule__Interacts_with__Group__4__Impl5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__5__Impl_in_rule__Interacts_with__Group__55734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Interacts_with__Group__5__Impl5762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__0__Impl_in_rule__Is_a__Group__05805 = new BitSet(new long[]{0x0000003D00000000L});
    public static final BitSet FOLLOW_rule__Is_a__Group__1_in_rule__Is_a__Group__05808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__AnnotationAssignment_0_in_rule__Is_a__Group__0__Impl5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__1__Impl_in_rule__Is_a__Group__15866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Is_a__Group__2_in_rule__Is_a__Group__15869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Is_a__Group__1__Impl5897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__2__Impl_in_rule__Is_a__Group__25928 = new BitSet(new long[]{0x0000000000033000L});
    public static final BitSet FOLLOW_rule__Is_a__Group__3_in_rule__Is_a__Group__25931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Objekttyp1Assignment_2_in_rule__Is_a__Group__2__Impl5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__3__Impl_in_rule__Is_a__Group__35988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Is_a__Group__4_in_rule__Is_a__Group__35991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__KardinalitaetAssignment_3_in_rule__Is_a__Group__3__Impl6018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__4__Impl_in_rule__Is_a__Group__46048 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Is_a__Group__5_in_rule__Is_a__Group__46051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Objekttyp2Assignment_4_in_rule__Is_a__Group__4__Impl6078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__5__Impl_in_rule__Is_a__Group__56108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Is_a__Group__5__Impl6136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__0__Impl_in_rule__Is_part_of__Group__06179 = new BitSet(new long[]{0x0000003F80000010L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__1_in_rule__Is_part_of__Group__06182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__AnnotationAssignment_0_in_rule__Is_part_of__Group__0__Impl6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__1__Impl_in_rule__Is_part_of__Group__16240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__2_in_rule__Is_part_of__Group__16243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Is_part_of__Group__1__Impl6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__2__Impl_in_rule__Is_part_of__Group__26302 = new BitSet(new long[]{0x00000000000CF000L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__3_in_rule__Is_part_of__Group__26305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Objekttyp1Assignment_2_in_rule__Is_part_of__Group__2__Impl6332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__3__Impl_in_rule__Is_part_of__Group__36362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__4_in_rule__Is_part_of__Group__36365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__KardinalitaetAssignment_3_in_rule__Is_part_of__Group__3__Impl6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__4__Impl_in_rule__Is_part_of__Group__46422 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__5_in_rule__Is_part_of__Group__46425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Objekttyp2Assignment_4_in_rule__Is_part_of__Group__4__Impl6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__5__Impl_in_rule__Is_part_of__Group__56482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Is_part_of__Group__5__Impl6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__0__Impl_in_rule__Kardinalitaet01__Group__06553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__1_in_rule__Kardinalitaet01__Group__06556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Alternatives_0_in_rule__Kardinalitaet01__Group__0__Impl6583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__1__Impl_in_rule__Kardinalitaet01__Group__16613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__0__Impl_in_rule__Kardinalitaet0x__Group__06675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__1_in_rule__Kardinalitaet0x__Group__06678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Alternatives_0_in_rule__Kardinalitaet0x__Group__0__Impl6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__1__Impl_in_rule__Kardinalitaet0x__Group__16735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__0__Impl_in_rule__Kardinalitaet11__Group__06797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__1_in_rule__Kardinalitaet11__Group__06800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Alternatives_0_in_rule__Kardinalitaet11__Group__0__Impl6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__1__Impl_in_rule__Kardinalitaet11__Group__16857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__0__Impl_in_rule__Kardinalitaet1x__Group__06919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__1_in_rule__Kardinalitaet1x__Group__06922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Alternatives_0_in_rule__Kardinalitaet1x__Group__0__Impl6949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__1__Impl_in_rule__Kardinalitaet1x__Group__16979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__07041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Name__Group__1_in_rule__Name__Group__07044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Name__Group__0__Impl7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__17103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__NameAssignment_1_in_rule__Name__Group__1__Impl7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__Group__0__Impl_in_rule__Merge__Group__07164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Merge__Group__1_in_rule__Merge__Group__07167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Merge__Group__0__Impl7195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__Group__1__Impl_in_rule__Merge__Group__17226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__NameAssignment_1_in_rule__Merge__Group__1__Impl7253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ignore__Group__0__Impl_in_rule__Ignore__Group__07287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Ignore__Group__1_in_rule__Ignore__Group__07290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Ignore__Group__0__Impl7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ignore__Group__1__Impl_in_rule__Ignore__Group__17349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__07411 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__07414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Version__Group__0__Impl7442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__17473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__VersionAssignment_1_in_rule__Version__Group__1__Impl7500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__UnorderedGroup_3__0_in_rule__AwS__UnorderedGroup_37535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__KosAssignment_3_0_in_rule__AwS__UnorderedGroup_3__Impl7624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__VosAssignment_3_1_in_rule__AwS__UnorderedGroup_3__Impl7715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__UnorderedGroup_3__Impl_in_rule__AwS__UnorderedGroup_3__07774 = new BitSet(new long[]{0x000000C000200012L});
    public static final BitSet FOLLOW_rule__AwS__UnorderedGroup_3__1_in_rule__AwS__UnorderedGroup_3__07777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__UnorderedGroup_3__Impl_in_rule__AwS__UnorderedGroup_3__17802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AwS__NameAssignment_17834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VERSION_NUMBER_in_rule__AwS__VersionAssignment_2_17865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOS_in_rule__AwS__KosAssignment_3_07896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOS_in_rule__AwS__VosAssignment_3_17927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__VOS__NameAssignment_0_07963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VOS__NameAssignment_0_18002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOT_in_rule__VOS__ObjekttypenAssignment_2_08033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_rule__VOS__BeziehungenAssignment_2_18064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOS_in_rule__VOS__GliederungAssignment_2_28095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__KOS__NameAssignment_0_08131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KOS__NameAssignment_0_18170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOT_in_rule__KOS__ObjekttypenAssignment_2_08201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeziehung_in_rule__KOS__BeziehungenAssignment_2_18232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOS_in_rule__KOS__GliederungAssignment_2_28263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__VOT__AnnotationAssignment_08294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VOT__NameAssignment_28325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_rule__VOT__AttributeAssignment_4_08356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__VOT__OperatorenAssignment_4_18387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__OOT__AnnotationAssignment_08418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OOT__NameAssignment_28449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_rule__OOT__AttributeAssignment_4_08480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__OOT__OperatorenAssignment_4_18511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__LOT__AnnotationAssignment_08542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LOT__NameAssignment_28573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_rule__LOT__AttributeAssignment_4_08604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__LOT__OperatorenAssignment_4_18635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__TOT__AnnotationAssignment_08666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TOT__NameAssignment_28697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_rule__TOT__AttributeAssignment_4_08728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__TOT__OperatorenAssignment_4_18759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribut__TypAssignment_08794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribut__NameAssignment_18829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operator__NameAssignment_08860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operator__ParameterAssignment_28895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Interacts_with__AnnotationAssignment_08930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp1Assignment_28965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__KardinalitaetAlternatives_3_0_in_rule__Interacts_with__KardinalitaetAssignment_39000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp2Assignment_49037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Is_a__AnnotationAssignment_09072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp1Assignment_29107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__KardinalitaetAlternatives_3_0_in_rule__Is_a__KardinalitaetAssignment_39142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp2Assignment_49179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Is_part_of__AnnotationAssignment_09214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp1Assignment_29249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__KardinalitaetAlternatives_3_0_in_rule__Is_part_of__KardinalitaetAssignment_39284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp2Assignment_49321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__NameAssignment_19356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Merge__NameAssignment_19387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VERSION_NUMBER_in_rule__Version__VersionAssignment_19418 = new BitSet(new long[]{0x0000000000000002L});

}
