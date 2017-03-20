package de.uniba.wiai.seda.somslmarked.ui.contentassist.antlr.internal; 

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
import de.uniba.wiai.seda.somslmarked.services.SomSLMarkedGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSomSLMarkedParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VERSION", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'--'", "'(0,1)'", "'->'", "'(0,*)'", "'=='", "'(1,1)'", "'=>'", "'(1,*)'", "'AwS:'", "'v'", "'{'", "'}'", "';'", "'DT'", "'('", "') {'", "'.'", "'VOT'", "'OOT'", "'LOT'", "'TOT'", "'interacts_with:'", "'is_a:'", "'is_part_of:'", "'@name'", "'@merge'", "'@ignore'", "'KOS'", "'VOS'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
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
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_VERSION=5;
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


        public InternalSomSLMarkedParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSomSLMarkedParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSomSLMarkedParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g"; }


     
     	private SomSLMarkedGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SomSLMarkedGrammarAccess grammarAccess) {
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:60:1: entryRuleAwS : ruleAwS EOF ;
    public final void entryRuleAwS() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:61:1: ( ruleAwS EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:62:1: ruleAwS EOF
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:69:1: ruleAwS : ( ( rule__AwS__Group__0 ) ) ;
    public final void ruleAwS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:73:2: ( ( ( rule__AwS__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:74:1: ( ( rule__AwS__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:74:1: ( ( rule__AwS__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:75:1: ( rule__AwS__Group__0 )
            {
             before(grammarAccess.getAwSAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:76:1: ( rule__AwS__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:76:2: rule__AwS__Group__0
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


    // $ANTLR start "entryRuleKOS"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:90:1: entryRuleKOS : ruleKOS EOF ;
    public final void entryRuleKOS() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:91:1: ( ruleKOS EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:92:1: ruleKOS EOF
            {
             before(grammarAccess.getKOSRule()); 
            pushFollow(FOLLOW_ruleKOS_in_entryRuleKOS123);
            ruleKOS();

            state._fsp--;

             after(grammarAccess.getKOSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKOS130); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:99:1: ruleKOS : ( ( rule__KOS__Group__0 ) ) ;
    public final void ruleKOS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:103:2: ( ( ( rule__KOS__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:104:1: ( ( rule__KOS__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:104:1: ( ( rule__KOS__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:105:1: ( rule__KOS__Group__0 )
            {
             before(grammarAccess.getKOSAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:106:1: ( rule__KOS__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:106:2: rule__KOS__Group__0
            {
            pushFollow(FOLLOW_rule__KOS__Group__0_in_ruleKOS156);
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


    // $ANTLR start "entryRuleVOS"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:118:1: entryRuleVOS : ruleVOS EOF ;
    public final void entryRuleVOS() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:119:1: ( ruleVOS EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:120:1: ruleVOS EOF
            {
             before(grammarAccess.getVOSRule()); 
            pushFollow(FOLLOW_ruleVOS_in_entryRuleVOS183);
            ruleVOS();

            state._fsp--;

             after(grammarAccess.getVOSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVOS190); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:127:1: ruleVOS : ( ( rule__VOS__Group__0 ) ) ;
    public final void ruleVOS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:131:2: ( ( ( rule__VOS__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:132:1: ( ( rule__VOS__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:132:1: ( ( rule__VOS__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:133:1: ( rule__VOS__Group__0 )
            {
             before(grammarAccess.getVOSAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:134:1: ( rule__VOS__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:134:2: rule__VOS__Group__0
            {
            pushFollow(FOLLOW_rule__VOS__Group__0_in_ruleVOS216);
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


    // $ANTLR start "entryRuleAttribut"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:148:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:149:1: ( ruleAttribut EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:150:1: ruleAttribut EOF
            {
             before(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_ruleAttribut_in_entryRuleAttribut245);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getAttributRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribut252); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:157:1: ruleAttribut : ( ( rule__Attribut__Group__0 ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:161:2: ( ( ( rule__Attribut__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:162:1: ( ( rule__Attribut__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:162:1: ( ( rule__Attribut__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:163:1: ( rule__Attribut__Group__0 )
            {
             before(grammarAccess.getAttributAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:164:1: ( rule__Attribut__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:164:2: rule__Attribut__Group__0
            {
            pushFollow(FOLLOW_rule__Attribut__Group__0_in_ruleAttribut278);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:176:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:177:1: ( ruleOperator EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:178:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator305);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator312); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:185:1: ruleOperator : ( ( rule__Operator__Group__0 ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:189:2: ( ( ( rule__Operator__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:190:1: ( ( rule__Operator__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:190:1: ( ( rule__Operator__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:191:1: ( rule__Operator__Group__0 )
            {
             before(grammarAccess.getOperatorAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:192:1: ( rule__Operator__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:192:2: rule__Operator__Group__0
            {
            pushFollow(FOLLOW_rule__Operator__Group__0_in_ruleOperator338);
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


    // $ANTLR start "entryRuleAnweisung"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:204:1: entryRuleAnweisung : ruleAnweisung EOF ;
    public final void entryRuleAnweisung() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:205:1: ( ruleAnweisung EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:206:1: ruleAnweisung EOF
            {
             before(grammarAccess.getAnweisungRule()); 
            pushFollow(FOLLOW_ruleAnweisung_in_entryRuleAnweisung365);
            ruleAnweisung();

            state._fsp--;

             after(grammarAccess.getAnweisungRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnweisung372); 

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
    // $ANTLR end "entryRuleAnweisung"


    // $ANTLR start "ruleAnweisung"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:213:1: ruleAnweisung : ( ( rule__Anweisung__Alternatives ) ) ;
    public final void ruleAnweisung() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:217:2: ( ( ( rule__Anweisung__Alternatives ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:218:1: ( ( rule__Anweisung__Alternatives ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:218:1: ( ( rule__Anweisung__Alternatives ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:219:1: ( rule__Anweisung__Alternatives )
            {
             before(grammarAccess.getAnweisungAccess().getAlternatives()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:220:1: ( rule__Anweisung__Alternatives )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:220:2: rule__Anweisung__Alternatives
            {
            pushFollow(FOLLOW_rule__Anweisung__Alternatives_in_ruleAnweisung398);
            rule__Anweisung__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnweisungAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnweisung"


    // $ANTLR start "entryRuleKOT"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:232:1: entryRuleKOT : ruleKOT EOF ;
    public final void entryRuleKOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:233:1: ( ruleKOT EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:234:1: ruleKOT EOF
            {
             before(grammarAccess.getKOTRule()); 
            pushFollow(FOLLOW_ruleKOT_in_entryRuleKOT425);
            ruleKOT();

            state._fsp--;

             after(grammarAccess.getKOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKOT432); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:241:1: ruleKOT : ( ( rule__KOT__Alternatives ) ) ;
    public final void ruleKOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:245:2: ( ( ( rule__KOT__Alternatives ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:246:1: ( ( rule__KOT__Alternatives ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:246:1: ( ( rule__KOT__Alternatives ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:247:1: ( rule__KOT__Alternatives )
            {
             before(grammarAccess.getKOTAccess().getAlternatives()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:248:1: ( rule__KOT__Alternatives )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:248:2: rule__KOT__Alternatives
            {
            pushFollow(FOLLOW_rule__KOT__Alternatives_in_ruleKOT458);
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


    // $ANTLR start "entryRuleVOT"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:260:1: entryRuleVOT : ruleVOT EOF ;
    public final void entryRuleVOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:261:1: ( ruleVOT EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:262:1: ruleVOT EOF
            {
             before(grammarAccess.getVOTRule()); 
            pushFollow(FOLLOW_ruleVOT_in_entryRuleVOT485);
            ruleVOT();

            state._fsp--;

             after(grammarAccess.getVOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVOT492); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:269:1: ruleVOT : ( ( rule__VOT__Group__0 ) ) ;
    public final void ruleVOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:273:2: ( ( ( rule__VOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:274:1: ( ( rule__VOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:274:1: ( ( rule__VOT__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:275:1: ( rule__VOT__Group__0 )
            {
             before(grammarAccess.getVOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:276:1: ( rule__VOT__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:276:2: rule__VOT__Group__0
            {
            pushFollow(FOLLOW_rule__VOT__Group__0_in_ruleVOT518);
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


    // $ANTLR start "entryRuleOOT"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:288:1: entryRuleOOT : ruleOOT EOF ;
    public final void entryRuleOOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:289:1: ( ruleOOT EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:290:1: ruleOOT EOF
            {
             before(grammarAccess.getOOTRule()); 
            pushFollow(FOLLOW_ruleOOT_in_entryRuleOOT545);
            ruleOOT();

            state._fsp--;

             after(grammarAccess.getOOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOOT552); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:297:1: ruleOOT : ( ( rule__OOT__Group__0 ) ) ;
    public final void ruleOOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:301:2: ( ( ( rule__OOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:302:1: ( ( rule__OOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:302:1: ( ( rule__OOT__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:303:1: ( rule__OOT__Group__0 )
            {
             before(grammarAccess.getOOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:304:1: ( rule__OOT__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:304:2: rule__OOT__Group__0
            {
            pushFollow(FOLLOW_rule__OOT__Group__0_in_ruleOOT578);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:316:1: entryRuleLOT : ruleLOT EOF ;
    public final void entryRuleLOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:317:1: ( ruleLOT EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:318:1: ruleLOT EOF
            {
             before(grammarAccess.getLOTRule()); 
            pushFollow(FOLLOW_ruleLOT_in_entryRuleLOT605);
            ruleLOT();

            state._fsp--;

             after(grammarAccess.getLOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOT612); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:325:1: ruleLOT : ( ( rule__LOT__Group__0 ) ) ;
    public final void ruleLOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:329:2: ( ( ( rule__LOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:330:1: ( ( rule__LOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:330:1: ( ( rule__LOT__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:331:1: ( rule__LOT__Group__0 )
            {
             before(grammarAccess.getLOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:332:1: ( rule__LOT__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:332:2: rule__LOT__Group__0
            {
            pushFollow(FOLLOW_rule__LOT__Group__0_in_ruleLOT638);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:344:1: entryRuleTOT : ruleTOT EOF ;
    public final void entryRuleTOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:345:1: ( ruleTOT EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:346:1: ruleTOT EOF
            {
             before(grammarAccess.getTOTRule()); 
            pushFollow(FOLLOW_ruleTOT_in_entryRuleTOT665);
            ruleTOT();

            state._fsp--;

             after(grammarAccess.getTOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTOT672); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:353:1: ruleTOT : ( ( rule__TOT__Group__0 ) ) ;
    public final void ruleTOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:357:2: ( ( ( rule__TOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:358:1: ( ( rule__TOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:358:1: ( ( rule__TOT__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:359:1: ( rule__TOT__Group__0 )
            {
             before(grammarAccess.getTOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:360:1: ( rule__TOT__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:360:2: rule__TOT__Group__0
            {
            pushFollow(FOLLOW_rule__TOT__Group__0_in_ruleTOT698);
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


    // $ANTLR start "entryRuleBeziehung"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:372:1: entryRuleBeziehung : ruleBeziehung EOF ;
    public final void entryRuleBeziehung() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:373:1: ( ruleBeziehung EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:374:1: ruleBeziehung EOF
            {
             before(grammarAccess.getBeziehungRule()); 
            pushFollow(FOLLOW_ruleBeziehung_in_entryRuleBeziehung725);
            ruleBeziehung();

            state._fsp--;

             after(grammarAccess.getBeziehungRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeziehung732); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:381:1: ruleBeziehung : ( ( rule__Beziehung__Alternatives ) ) ;
    public final void ruleBeziehung() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:385:2: ( ( ( rule__Beziehung__Alternatives ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:386:1: ( ( rule__Beziehung__Alternatives ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:386:1: ( ( rule__Beziehung__Alternatives ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:387:1: ( rule__Beziehung__Alternatives )
            {
             before(grammarAccess.getBeziehungAccess().getAlternatives()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:388:1: ( rule__Beziehung__Alternatives )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:388:2: rule__Beziehung__Alternatives
            {
            pushFollow(FOLLOW_rule__Beziehung__Alternatives_in_ruleBeziehung758);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:400:1: entryRuleInteracts_with : ruleInteracts_with EOF ;
    public final void entryRuleInteracts_with() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:401:1: ( ruleInteracts_with EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:402:1: ruleInteracts_with EOF
            {
             before(grammarAccess.getInteracts_withRule()); 
            pushFollow(FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with785);
            ruleInteracts_with();

            state._fsp--;

             after(grammarAccess.getInteracts_withRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteracts_with792); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:409:1: ruleInteracts_with : ( ( rule__Interacts_with__Group__0 ) ) ;
    public final void ruleInteracts_with() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:413:2: ( ( ( rule__Interacts_with__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:414:1: ( ( rule__Interacts_with__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:414:1: ( ( rule__Interacts_with__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:415:1: ( rule__Interacts_with__Group__0 )
            {
             before(grammarAccess.getInteracts_withAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:416:1: ( rule__Interacts_with__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:416:2: rule__Interacts_with__Group__0
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__0_in_ruleInteracts_with818);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:428:1: entryRuleIs_a : ruleIs_a EOF ;
    public final void entryRuleIs_a() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:429:1: ( ruleIs_a EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:430:1: ruleIs_a EOF
            {
             before(grammarAccess.getIs_aRule()); 
            pushFollow(FOLLOW_ruleIs_a_in_entryRuleIs_a845);
            ruleIs_a();

            state._fsp--;

             after(grammarAccess.getIs_aRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_a852); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:437:1: ruleIs_a : ( ( rule__Is_a__Group__0 ) ) ;
    public final void ruleIs_a() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:441:2: ( ( ( rule__Is_a__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:442:1: ( ( rule__Is_a__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:442:1: ( ( rule__Is_a__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:443:1: ( rule__Is_a__Group__0 )
            {
             before(grammarAccess.getIs_aAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:444:1: ( rule__Is_a__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:444:2: rule__Is_a__Group__0
            {
            pushFollow(FOLLOW_rule__Is_a__Group__0_in_ruleIs_a878);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:456:1: entryRuleIs_part_of : ruleIs_part_of EOF ;
    public final void entryRuleIs_part_of() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:457:1: ( ruleIs_part_of EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:458:1: ruleIs_part_of EOF
            {
             before(grammarAccess.getIs_part_ofRule()); 
            pushFollow(FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of905);
            ruleIs_part_of();

            state._fsp--;

             after(grammarAccess.getIs_part_ofRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_part_of912); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:465:1: ruleIs_part_of : ( ( rule__Is_part_of__Group__0 ) ) ;
    public final void ruleIs_part_of() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:469:2: ( ( ( rule__Is_part_of__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:470:1: ( ( rule__Is_part_of__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:470:1: ( ( rule__Is_part_of__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:471:1: ( rule__Is_part_of__Group__0 )
            {
             before(grammarAccess.getIs_part_ofAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:472:1: ( rule__Is_part_of__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:472:2: rule__Is_part_of__Group__0
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__0_in_ruleIs_part_of938);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:486:1: entryRuleKardinalitaet01 : ruleKardinalitaet01 EOF ;
    public final void entryRuleKardinalitaet01() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:487:1: ( ruleKardinalitaet01 EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:488:1: ruleKardinalitaet01 EOF
            {
             before(grammarAccess.getKardinalitaet01Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet01967);
            ruleKardinalitaet01();

            state._fsp--;

             after(grammarAccess.getKardinalitaet01Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet01974); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:495:1: ruleKardinalitaet01 : ( ( rule__Kardinalitaet01__Group__0 ) ) ;
    public final void ruleKardinalitaet01() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:499:2: ( ( ( rule__Kardinalitaet01__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:500:1: ( ( rule__Kardinalitaet01__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:500:1: ( ( rule__Kardinalitaet01__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:501:1: ( rule__Kardinalitaet01__Group__0 )
            {
             before(grammarAccess.getKardinalitaet01Access().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:502:1: ( rule__Kardinalitaet01__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:502:2: rule__Kardinalitaet01__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__0_in_ruleKardinalitaet011000);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:514:1: entryRuleKardinalitaet0x : ruleKardinalitaet0x EOF ;
    public final void entryRuleKardinalitaet0x() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:515:1: ( ruleKardinalitaet0x EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:516:1: ruleKardinalitaet0x EOF
            {
             before(grammarAccess.getKardinalitaet0xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x1027);
            ruleKardinalitaet0x();

            state._fsp--;

             after(grammarAccess.getKardinalitaet0xRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet0x1034); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:523:1: ruleKardinalitaet0x : ( ( rule__Kardinalitaet0x__Group__0 ) ) ;
    public final void ruleKardinalitaet0x() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:527:2: ( ( ( rule__Kardinalitaet0x__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:528:1: ( ( rule__Kardinalitaet0x__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:528:1: ( ( rule__Kardinalitaet0x__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:529:1: ( rule__Kardinalitaet0x__Group__0 )
            {
             before(grammarAccess.getKardinalitaet0xAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:530:1: ( rule__Kardinalitaet0x__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:530:2: rule__Kardinalitaet0x__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__0_in_ruleKardinalitaet0x1060);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:542:1: entryRuleKardinalitaet11 : ruleKardinalitaet11 EOF ;
    public final void entryRuleKardinalitaet11() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:543:1: ( ruleKardinalitaet11 EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:544:1: ruleKardinalitaet11 EOF
            {
             before(grammarAccess.getKardinalitaet11Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet111087);
            ruleKardinalitaet11();

            state._fsp--;

             after(grammarAccess.getKardinalitaet11Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet111094); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:551:1: ruleKardinalitaet11 : ( ( rule__Kardinalitaet11__Group__0 ) ) ;
    public final void ruleKardinalitaet11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:555:2: ( ( ( rule__Kardinalitaet11__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:556:1: ( ( rule__Kardinalitaet11__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:556:1: ( ( rule__Kardinalitaet11__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:557:1: ( rule__Kardinalitaet11__Group__0 )
            {
             before(grammarAccess.getKardinalitaet11Access().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:558:1: ( rule__Kardinalitaet11__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:558:2: rule__Kardinalitaet11__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__0_in_ruleKardinalitaet111120);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:570:1: entryRuleKardinalitaet1x : ruleKardinalitaet1x EOF ;
    public final void entryRuleKardinalitaet1x() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:571:1: ( ruleKardinalitaet1x EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:572:1: ruleKardinalitaet1x EOF
            {
             before(grammarAccess.getKardinalitaet1xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x1147);
            ruleKardinalitaet1x();

            state._fsp--;

             after(grammarAccess.getKardinalitaet1xRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet1x1154); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:579:1: ruleKardinalitaet1x : ( ( rule__Kardinalitaet1x__Group__0 ) ) ;
    public final void ruleKardinalitaet1x() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:583:2: ( ( ( rule__Kardinalitaet1x__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:584:1: ( ( rule__Kardinalitaet1x__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:584:1: ( ( rule__Kardinalitaet1x__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:585:1: ( rule__Kardinalitaet1x__Group__0 )
            {
             before(grammarAccess.getKardinalitaet1xAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:586:1: ( rule__Kardinalitaet1x__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:586:2: rule__Kardinalitaet1x__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__0_in_ruleKardinalitaet1x1180);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:598:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:599:1: ( ruleAnnotation EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:600:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1207);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1214); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:607:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:611:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:612:1: ( ( rule__Annotation__Alternatives ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:612:1: ( ( rule__Annotation__Alternatives ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:613:1: ( rule__Annotation__Alternatives )
            {
             before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:614:1: ( rule__Annotation__Alternatives )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:614:2: rule__Annotation__Alternatives
            {
            pushFollow(FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1240);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:626:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:627:1: ( ruleName EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:628:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName1267);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName1274); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:635:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:639:2: ( ( ( rule__Name__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:640:1: ( ( rule__Name__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:640:1: ( ( rule__Name__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:641:1: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:642:1: ( rule__Name__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:642:2: rule__Name__Group__0
            {
            pushFollow(FOLLOW_rule__Name__Group__0_in_ruleName1300);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:654:1: entryRuleMerge : ruleMerge EOF ;
    public final void entryRuleMerge() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:655:1: ( ruleMerge EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:656:1: ruleMerge EOF
            {
             before(grammarAccess.getMergeRule()); 
            pushFollow(FOLLOW_ruleMerge_in_entryRuleMerge1327);
            ruleMerge();

            state._fsp--;

             after(grammarAccess.getMergeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMerge1334); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:663:1: ruleMerge : ( ( rule__Merge__Group__0 ) ) ;
    public final void ruleMerge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:667:2: ( ( ( rule__Merge__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:668:1: ( ( rule__Merge__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:668:1: ( ( rule__Merge__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:669:1: ( rule__Merge__Group__0 )
            {
             before(grammarAccess.getMergeAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:670:1: ( rule__Merge__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:670:2: rule__Merge__Group__0
            {
            pushFollow(FOLLOW_rule__Merge__Group__0_in_ruleMerge1360);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:682:1: entryRuleIgnore : ruleIgnore EOF ;
    public final void entryRuleIgnore() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:683:1: ( ruleIgnore EOF )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:684:1: ruleIgnore EOF
            {
             before(grammarAccess.getIgnoreRule()); 
            pushFollow(FOLLOW_ruleIgnore_in_entryRuleIgnore1387);
            ruleIgnore();

            state._fsp--;

             after(grammarAccess.getIgnoreRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIgnore1394); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:691:1: ruleIgnore : ( ( rule__Ignore__Group__0 ) ) ;
    public final void ruleIgnore() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:695:2: ( ( ( rule__Ignore__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:696:1: ( ( rule__Ignore__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:696:1: ( ( rule__Ignore__Group__0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:697:1: ( rule__Ignore__Group__0 )
            {
             before(grammarAccess.getIgnoreAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:698:1: ( rule__Ignore__Group__0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:698:2: rule__Ignore__Group__0
            {
            pushFollow(FOLLOW_rule__Ignore__Group__0_in_ruleIgnore1420);
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


    // $ANTLR start "rule__KOS__Alternatives_0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:711:1: rule__KOS__Alternatives_0 : ( ( ( rule__KOS__NameAssignment_0_0 ) ) | ( ( rule__KOS__NameAssignment_0_1 ) ) );
    public final void rule__KOS__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:715:1: ( ( ( rule__KOS__NameAssignment_0_0 ) ) | ( ( rule__KOS__NameAssignment_0_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==39) ) {
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
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:716:1: ( ( rule__KOS__NameAssignment_0_0 ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:716:1: ( ( rule__KOS__NameAssignment_0_0 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:717:1: ( rule__KOS__NameAssignment_0_0 )
                    {
                     before(grammarAccess.getKOSAccess().getNameAssignment_0_0()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:718:1: ( rule__KOS__NameAssignment_0_0 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:718:2: rule__KOS__NameAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__KOS__NameAssignment_0_0_in_rule__KOS__Alternatives_01457);
                    rule__KOS__NameAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKOSAccess().getNameAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:722:6: ( ( rule__KOS__NameAssignment_0_1 ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:722:6: ( ( rule__KOS__NameAssignment_0_1 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:723:1: ( rule__KOS__NameAssignment_0_1 )
                    {
                     before(grammarAccess.getKOSAccess().getNameAssignment_0_1()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:724:1: ( rule__KOS__NameAssignment_0_1 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:724:2: rule__KOS__NameAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__KOS__NameAssignment_0_1_in_rule__KOS__Alternatives_01475);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:733:1: rule__KOS__Alternatives_2 : ( ( ( rule__KOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__KOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__KOS__GliederungAssignment_2_2 ) ) );
    public final void rule__KOS__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:737:1: ( ( ( rule__KOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__KOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__KOS__GliederungAssignment_2_2 ) ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:738:1: ( ( rule__KOS__ObjekttypenAssignment_2_0 ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:738:1: ( ( rule__KOS__ObjekttypenAssignment_2_0 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:739:1: ( rule__KOS__ObjekttypenAssignment_2_0 )
                    {
                     before(grammarAccess.getKOSAccess().getObjekttypenAssignment_2_0()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:740:1: ( rule__KOS__ObjekttypenAssignment_2_0 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:740:2: rule__KOS__ObjekttypenAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__KOS__ObjekttypenAssignment_2_0_in_rule__KOS__Alternatives_21508);
                    rule__KOS__ObjekttypenAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKOSAccess().getObjekttypenAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:744:6: ( ( rule__KOS__BeziehungenAssignment_2_1 ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:744:6: ( ( rule__KOS__BeziehungenAssignment_2_1 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:745:1: ( rule__KOS__BeziehungenAssignment_2_1 )
                    {
                     before(grammarAccess.getKOSAccess().getBeziehungenAssignment_2_1()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:746:1: ( rule__KOS__BeziehungenAssignment_2_1 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:746:2: rule__KOS__BeziehungenAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__KOS__BeziehungenAssignment_2_1_in_rule__KOS__Alternatives_21526);
                    rule__KOS__BeziehungenAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getKOSAccess().getBeziehungenAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:750:6: ( ( rule__KOS__GliederungAssignment_2_2 ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:750:6: ( ( rule__KOS__GliederungAssignment_2_2 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:751:1: ( rule__KOS__GliederungAssignment_2_2 )
                    {
                     before(grammarAccess.getKOSAccess().getGliederungAssignment_2_2()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:752:1: ( rule__KOS__GliederungAssignment_2_2 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:752:2: rule__KOS__GliederungAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__KOS__GliederungAssignment_2_2_in_rule__KOS__Alternatives_21544);
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


    // $ANTLR start "rule__VOS__Alternatives_0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:761:1: rule__VOS__Alternatives_0 : ( ( ( rule__VOS__NameAssignment_0_0 ) ) | ( ( rule__VOS__NameAssignment_0_1 ) ) );
    public final void rule__VOS__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:765:1: ( ( ( rule__VOS__NameAssignment_0_0 ) ) | ( ( rule__VOS__NameAssignment_0_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40) ) {
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
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:766:1: ( ( rule__VOS__NameAssignment_0_0 ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:766:1: ( ( rule__VOS__NameAssignment_0_0 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:767:1: ( rule__VOS__NameAssignment_0_0 )
                    {
                     before(grammarAccess.getVOSAccess().getNameAssignment_0_0()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:768:1: ( rule__VOS__NameAssignment_0_0 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:768:2: rule__VOS__NameAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__VOS__NameAssignment_0_0_in_rule__VOS__Alternatives_01577);
                    rule__VOS__NameAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVOSAccess().getNameAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:772:6: ( ( rule__VOS__NameAssignment_0_1 ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:772:6: ( ( rule__VOS__NameAssignment_0_1 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:773:1: ( rule__VOS__NameAssignment_0_1 )
                    {
                     before(grammarAccess.getVOSAccess().getNameAssignment_0_1()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:774:1: ( rule__VOS__NameAssignment_0_1 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:774:2: rule__VOS__NameAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__VOS__NameAssignment_0_1_in_rule__VOS__Alternatives_01595);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:783:1: rule__VOS__Alternatives_2 : ( ( ( rule__VOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__VOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__VOS__GliederungAssignment_2_2 ) ) );
    public final void rule__VOS__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:787:1: ( ( ( rule__VOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__VOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__VOS__GliederungAssignment_2_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:788:1: ( ( rule__VOS__ObjekttypenAssignment_2_0 ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:788:1: ( ( rule__VOS__ObjekttypenAssignment_2_0 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:789:1: ( rule__VOS__ObjekttypenAssignment_2_0 )
                    {
                     before(grammarAccess.getVOSAccess().getObjekttypenAssignment_2_0()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:790:1: ( rule__VOS__ObjekttypenAssignment_2_0 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:790:2: rule__VOS__ObjekttypenAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__VOS__ObjekttypenAssignment_2_0_in_rule__VOS__Alternatives_21628);
                    rule__VOS__ObjekttypenAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVOSAccess().getObjekttypenAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:794:6: ( ( rule__VOS__BeziehungenAssignment_2_1 ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:794:6: ( ( rule__VOS__BeziehungenAssignment_2_1 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:795:1: ( rule__VOS__BeziehungenAssignment_2_1 )
                    {
                     before(grammarAccess.getVOSAccess().getBeziehungenAssignment_2_1()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:796:1: ( rule__VOS__BeziehungenAssignment_2_1 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:796:2: rule__VOS__BeziehungenAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__VOS__BeziehungenAssignment_2_1_in_rule__VOS__Alternatives_21646);
                    rule__VOS__BeziehungenAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVOSAccess().getBeziehungenAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:800:6: ( ( rule__VOS__GliederungAssignment_2_2 ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:800:6: ( ( rule__VOS__GliederungAssignment_2_2 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:801:1: ( rule__VOS__GliederungAssignment_2_2 )
                    {
                     before(grammarAccess.getVOSAccess().getGliederungAssignment_2_2()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:802:1: ( rule__VOS__GliederungAssignment_2_2 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:802:2: rule__VOS__GliederungAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__VOS__GliederungAssignment_2_2_in_rule__VOS__Alternatives_21664);
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


    // $ANTLR start "rule__Attribut__Alternatives_0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:812:1: rule__Attribut__Alternatives_0 : ( ( ( rule__Attribut__ObjekttypAssignment_0_0 ) ) | ( ( rule__Attribut__Group_0_1__0 ) ) );
    public final void rule__Attribut__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:816:1: ( ( ( rule__Attribut__ObjekttypAssignment_0_0 ) ) | ( ( rule__Attribut__Group_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:817:1: ( ( rule__Attribut__ObjekttypAssignment_0_0 ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:817:1: ( ( rule__Attribut__ObjekttypAssignment_0_0 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:818:1: ( rule__Attribut__ObjekttypAssignment_0_0 )
                    {
                     before(grammarAccess.getAttributAccess().getObjekttypAssignment_0_0()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:819:1: ( rule__Attribut__ObjekttypAssignment_0_0 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:819:2: rule__Attribut__ObjekttypAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Attribut__ObjekttypAssignment_0_0_in_rule__Attribut__Alternatives_01698);
                    rule__Attribut__ObjekttypAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributAccess().getObjekttypAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:823:6: ( ( rule__Attribut__Group_0_1__0 ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:823:6: ( ( rule__Attribut__Group_0_1__0 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:824:1: ( rule__Attribut__Group_0_1__0 )
                    {
                     before(grammarAccess.getAttributAccess().getGroup_0_1()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:825:1: ( rule__Attribut__Group_0_1__0 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:825:2: rule__Attribut__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Attribut__Group_0_1__0_in_rule__Attribut__Alternatives_01716);
                    rule__Attribut__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__Attribut__Alternatives_0"


    // $ANTLR start "rule__Anweisung__Alternatives"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:834:1: rule__Anweisung__Alternatives : ( ( ( rule__Anweisung__Group_0__0 ) ) | ( ( rule__Anweisung__Group_1__0 ) ) );
    public final void rule__Anweisung__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:838:1: ( ( ( rule__Anweisung__Group_0__0 ) ) | ( ( rule__Anweisung__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==RULE_ID||LA6_1==23||(LA6_1>=27 && LA6_1<=28)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==26) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:839:1: ( ( rule__Anweisung__Group_0__0 ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:839:1: ( ( rule__Anweisung__Group_0__0 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:840:1: ( rule__Anweisung__Group_0__0 )
                    {
                     before(grammarAccess.getAnweisungAccess().getGroup_0()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:841:1: ( rule__Anweisung__Group_0__0 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:841:2: rule__Anweisung__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Anweisung__Group_0__0_in_rule__Anweisung__Alternatives1749);
                    rule__Anweisung__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnweisungAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:845:6: ( ( rule__Anweisung__Group_1__0 ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:845:6: ( ( rule__Anweisung__Group_1__0 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:846:1: ( rule__Anweisung__Group_1__0 )
                    {
                     before(grammarAccess.getAnweisungAccess().getGroup_1()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:847:1: ( rule__Anweisung__Group_1__0 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:847:2: rule__Anweisung__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Anweisung__Group_1__0_in_rule__Anweisung__Alternatives1767);
                    rule__Anweisung__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnweisungAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Anweisung__Alternatives"


    // $ANTLR start "rule__KOT__Alternatives"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:856:1: rule__KOT__Alternatives : ( ( ruleOOT ) | ( ruleLOT ) | ( ruleTOT ) );
    public final void rule__KOT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:860:1: ( ( ruleOOT ) | ( ruleLOT ) | ( ruleTOT ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 30:
                        {
                        alt7=1;
                        }
                        break;
                    case 31:
                        {
                        alt7=2;
                        }
                        break;
                    case 32:
                        {
                        alt7=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 7, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    alt7=1;
                    }
                    break;
                case 32:
                    {
                    alt7=3;
                    }
                    break;
                case 31:
                    {
                    alt7=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }

                }
                break;
            case 37:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 32:
                        {
                        alt7=3;
                        }
                        break;
                    case 31:
                        {
                        alt7=2;
                        }
                        break;
                    case 30:
                        {
                        alt7=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 8, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:861:1: ( ruleOOT )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:861:1: ( ruleOOT )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:862:1: ruleOOT
                    {
                     before(grammarAccess.getKOTAccess().getOOTParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOOT_in_rule__KOT__Alternatives1800);
                    ruleOOT();

                    state._fsp--;

                     after(grammarAccess.getKOTAccess().getOOTParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:867:6: ( ruleLOT )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:867:6: ( ruleLOT )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:868:1: ruleLOT
                    {
                     before(grammarAccess.getKOTAccess().getLOTParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLOT_in_rule__KOT__Alternatives1817);
                    ruleLOT();

                    state._fsp--;

                     after(grammarAccess.getKOTAccess().getLOTParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:873:6: ( ruleTOT )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:873:6: ( ruleTOT )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:874:1: ruleTOT
                    {
                     before(grammarAccess.getKOTAccess().getTOTParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTOT_in_rule__KOT__Alternatives1834);
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


    // $ANTLR start "rule__Beziehung__Alternatives"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:884:1: rule__Beziehung__Alternatives : ( ( ruleIs_a ) | ( ruleInteracts_with ) | ( ruleIs_part_of ) );
    public final void rule__Beziehung__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:888:1: ( ( ruleIs_a ) | ( ruleInteracts_with ) | ( ruleIs_part_of ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 34:
                        {
                        alt8=1;
                        }
                        break;
                    case 35:
                        {
                        alt8=3;
                        }
                        break;
                    case RULE_ID:
                    case 33:
                        {
                        alt8=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 7, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                switch ( input.LA(2) ) {
                case 34:
                    {
                    alt8=1;
                    }
                    break;
                case 35:
                    {
                    alt8=3;
                    }
                    break;
                case RULE_ID:
                case 33:
                    {
                    alt8=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }

                }
                break;
            case 37:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 35:
                        {
                        alt8=3;
                        }
                        break;
                    case RULE_ID:
                    case 33:
                        {
                        alt8=2;
                        }
                        break;
                    case 34:
                        {
                        alt8=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 8, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
            case 33:
                {
                alt8=2;
                }
                break;
            case 35:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:889:1: ( ruleIs_a )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:889:1: ( ruleIs_a )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:890:1: ruleIs_a
                    {
                     before(grammarAccess.getBeziehungAccess().getIs_aParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIs_a_in_rule__Beziehung__Alternatives1866);
                    ruleIs_a();

                    state._fsp--;

                     after(grammarAccess.getBeziehungAccess().getIs_aParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:895:6: ( ruleInteracts_with )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:895:6: ( ruleInteracts_with )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:896:1: ruleInteracts_with
                    {
                     before(grammarAccess.getBeziehungAccess().getInteracts_withParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInteracts_with_in_rule__Beziehung__Alternatives1883);
                    ruleInteracts_with();

                    state._fsp--;

                     after(grammarAccess.getBeziehungAccess().getInteracts_withParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:901:6: ( ruleIs_part_of )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:901:6: ( ruleIs_part_of )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:902:1: ruleIs_part_of
                    {
                     before(grammarAccess.getBeziehungAccess().getIs_part_ofParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIs_part_of_in_rule__Beziehung__Alternatives1900);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:912:1: rule__Interacts_with__KardinalitaetAlternatives_3_0 : ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) );
    public final void rule__Interacts_with__KardinalitaetAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:916:1: ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt9=1;
                }
                break;
            case 14:
            case 15:
                {
                alt9=2;
                }
                break;
            case 18:
            case 19:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:917:1: ( ruleKardinalitaet01 )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:917:1: ( ruleKardinalitaet01 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:918:1: ruleKardinalitaet01
                    {
                     before(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_rule__Interacts_with__KardinalitaetAlternatives_3_01932);
                    ruleKardinalitaet01();

                    state._fsp--;

                     after(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:923:6: ( ruleKardinalitaet0x )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:923:6: ( ruleKardinalitaet0x )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:924:1: ruleKardinalitaet0x
                    {
                     before(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_rule__Interacts_with__KardinalitaetAlternatives_3_01949);
                    ruleKardinalitaet0x();

                    state._fsp--;

                     after(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:929:6: ( ruleKardinalitaet1x )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:929:6: ( ruleKardinalitaet1x )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:930:1: ruleKardinalitaet1x
                    {
                     before(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet1xParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_rule__Interacts_with__KardinalitaetAlternatives_3_01966);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:940:1: rule__Is_a__KardinalitaetAlternatives_3_0 : ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet11 ) );
    public final void rule__Is_a__KardinalitaetAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:944:1: ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet11 ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=12 && LA10_0<=13)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=16 && LA10_0<=17)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:945:1: ( ruleKardinalitaet01 )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:945:1: ( ruleKardinalitaet01 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:946:1: ruleKardinalitaet01
                    {
                     before(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_rule__Is_a__KardinalitaetAlternatives_3_01998);
                    ruleKardinalitaet01();

                    state._fsp--;

                     after(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:951:6: ( ruleKardinalitaet11 )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:951:6: ( ruleKardinalitaet11 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:952:1: ruleKardinalitaet11
                    {
                     before(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet11ParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleKardinalitaet11_in_rule__Is_a__KardinalitaetAlternatives_3_02015);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:962:1: rule__Is_part_of__KardinalitaetAlternatives_3_0 : ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) );
    public final void rule__Is_part_of__KardinalitaetAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:966:1: ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) )
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
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:967:1: ( ruleKardinalitaet01 )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:967:1: ( ruleKardinalitaet01 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:968:1: ruleKardinalitaet01
                    {
                     before(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_rule__Is_part_of__KardinalitaetAlternatives_3_02047);
                    ruleKardinalitaet01();

                    state._fsp--;

                     after(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:973:6: ( ruleKardinalitaet0x )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:973:6: ( ruleKardinalitaet0x )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:974:1: ruleKardinalitaet0x
                    {
                     before(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_rule__Is_part_of__KardinalitaetAlternatives_3_02064);
                    ruleKardinalitaet0x();

                    state._fsp--;

                     after(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:979:6: ( ruleKardinalitaet1x )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:979:6: ( ruleKardinalitaet1x )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:980:1: ruleKardinalitaet1x
                    {
                     before(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet1xParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_rule__Is_part_of__KardinalitaetAlternatives_3_02081);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:991:1: rule__Kardinalitaet01__Alternatives_0 : ( ( '--' ) | ( '(0,1)' ) );
    public final void rule__Kardinalitaet01__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:995:1: ( ( '--' ) | ( '(0,1)' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            else if ( (LA12_0==13) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:996:1: ( '--' )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:996:1: ( '--' )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:997:1: '--'
                    {
                     before(grammarAccess.getKardinalitaet01Access().getHyphenMinusHyphenMinusKeyword_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Kardinalitaet01__Alternatives_02115); 
                     after(grammarAccess.getKardinalitaet01Access().getHyphenMinusHyphenMinusKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1004:6: ( '(0,1)' )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1004:6: ( '(0,1)' )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1005:1: '(0,1)'
                    {
                     before(grammarAccess.getKardinalitaet01Access().getLeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Kardinalitaet01__Alternatives_02135); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1017:1: rule__Kardinalitaet0x__Alternatives_0 : ( ( '->' ) | ( '(0,*)' ) );
    public final void rule__Kardinalitaet0x__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1021:1: ( ( '->' ) | ( '(0,*)' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            else if ( (LA13_0==15) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1022:1: ( '->' )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1022:1: ( '->' )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1023:1: '->'
                    {
                     before(grammarAccess.getKardinalitaet0xAccess().getHyphenMinusGreaterThanSignKeyword_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Kardinalitaet0x__Alternatives_02170); 
                     after(grammarAccess.getKardinalitaet0xAccess().getHyphenMinusGreaterThanSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1030:6: ( '(0,*)' )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1030:6: ( '(0,*)' )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1031:1: '(0,*)'
                    {
                     before(grammarAccess.getKardinalitaet0xAccess().getLeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Kardinalitaet0x__Alternatives_02190); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1043:1: rule__Kardinalitaet11__Alternatives_0 : ( ( '==' ) | ( '(1,1)' ) );
    public final void rule__Kardinalitaet11__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1047:1: ( ( '==' ) | ( '(1,1)' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            else if ( (LA14_0==17) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1048:1: ( '==' )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1048:1: ( '==' )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1049:1: '=='
                    {
                     before(grammarAccess.getKardinalitaet11Access().getEqualsSignEqualsSignKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Kardinalitaet11__Alternatives_02225); 
                     after(grammarAccess.getKardinalitaet11Access().getEqualsSignEqualsSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1056:6: ( '(1,1)' )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1056:6: ( '(1,1)' )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1057:1: '(1,1)'
                    {
                     before(grammarAccess.getKardinalitaet11Access().getLeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Kardinalitaet11__Alternatives_02245); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1069:1: rule__Kardinalitaet1x__Alternatives_0 : ( ( '=>' ) | ( '(1,*)' ) );
    public final void rule__Kardinalitaet1x__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1073:1: ( ( '=>' ) | ( '(1,*)' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            else if ( (LA15_0==19) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1074:1: ( '=>' )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1074:1: ( '=>' )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1075:1: '=>'
                    {
                     before(grammarAccess.getKardinalitaet1xAccess().getEqualsSignGreaterThanSignKeyword_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__Kardinalitaet1x__Alternatives_02280); 
                     after(grammarAccess.getKardinalitaet1xAccess().getEqualsSignGreaterThanSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1082:6: ( '(1,*)' )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1082:6: ( '(1,*)' )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1083:1: '(1,*)'
                    {
                     before(grammarAccess.getKardinalitaet1xAccess().getLeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__Kardinalitaet1x__Alternatives_02300); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1095:1: rule__Annotation__Alternatives : ( ( ruleName ) | ( ruleIgnore ) | ( ruleMerge ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1099:1: ( ( ruleName ) | ( ruleIgnore ) | ( ruleMerge ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt16=1;
                }
                break;
            case 38:
                {
                alt16=2;
                }
                break;
            case 37:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1100:1: ( ruleName )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1100:1: ( ruleName )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1101:1: ruleName
                    {
                     before(grammarAccess.getAnnotationAccess().getNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleName_in_rule__Annotation__Alternatives2334);
                    ruleName();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1106:6: ( ruleIgnore )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1106:6: ( ruleIgnore )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1107:1: ruleIgnore
                    {
                     before(grammarAccess.getAnnotationAccess().getIgnoreParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIgnore_in_rule__Annotation__Alternatives2351);
                    ruleIgnore();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getIgnoreParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1112:6: ( ruleMerge )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1112:6: ( ruleMerge )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1113:1: ruleMerge
                    {
                     before(grammarAccess.getAnnotationAccess().getMergeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMerge_in_rule__Annotation__Alternatives2368);
                    ruleMerge();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getMergeParserRuleCall_2()); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1125:1: rule__AwS__Group__0 : rule__AwS__Group__0__Impl rule__AwS__Group__1 ;
    public final void rule__AwS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1129:1: ( rule__AwS__Group__0__Impl rule__AwS__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1130:2: rule__AwS__Group__0__Impl rule__AwS__Group__1
            {
            pushFollow(FOLLOW_rule__AwS__Group__0__Impl_in_rule__AwS__Group__02398);
            rule__AwS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AwS__Group__1_in_rule__AwS__Group__02401);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1137:1: rule__AwS__Group__0__Impl : ( 'AwS:' ) ;
    public final void rule__AwS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1141:1: ( ( 'AwS:' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1142:1: ( 'AwS:' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1142:1: ( 'AwS:' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1143:1: 'AwS:'
            {
             before(grammarAccess.getAwSAccess().getAwSKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__AwS__Group__0__Impl2429); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1156:1: rule__AwS__Group__1 : rule__AwS__Group__1__Impl rule__AwS__Group__2 ;
    public final void rule__AwS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1160:1: ( rule__AwS__Group__1__Impl rule__AwS__Group__2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1161:2: rule__AwS__Group__1__Impl rule__AwS__Group__2
            {
            pushFollow(FOLLOW_rule__AwS__Group__1__Impl_in_rule__AwS__Group__12460);
            rule__AwS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AwS__Group__2_in_rule__AwS__Group__12463);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1168:1: rule__AwS__Group__1__Impl : ( ( rule__AwS__NameAssignment_1 ) ) ;
    public final void rule__AwS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1172:1: ( ( ( rule__AwS__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1173:1: ( ( rule__AwS__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1173:1: ( ( rule__AwS__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1174:1: ( rule__AwS__NameAssignment_1 )
            {
             before(grammarAccess.getAwSAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1175:1: ( rule__AwS__NameAssignment_1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1175:2: rule__AwS__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AwS__NameAssignment_1_in_rule__AwS__Group__1__Impl2490);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1185:1: rule__AwS__Group__2 : rule__AwS__Group__2__Impl rule__AwS__Group__3 ;
    public final void rule__AwS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1189:1: ( rule__AwS__Group__2__Impl rule__AwS__Group__3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1190:2: rule__AwS__Group__2__Impl rule__AwS__Group__3
            {
            pushFollow(FOLLOW_rule__AwS__Group__2__Impl_in_rule__AwS__Group__22520);
            rule__AwS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AwS__Group__3_in_rule__AwS__Group__22523);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1197:1: rule__AwS__Group__2__Impl : ( ( rule__AwS__Group_2__0 )? ) ;
    public final void rule__AwS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1201:1: ( ( ( rule__AwS__Group_2__0 )? ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1202:1: ( ( rule__AwS__Group_2__0 )? )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1202:1: ( ( rule__AwS__Group_2__0 )? )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1203:1: ( rule__AwS__Group_2__0 )?
            {
             before(grammarAccess.getAwSAccess().getGroup_2()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1204:1: ( rule__AwS__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1204:2: rule__AwS__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AwS__Group_2__0_in_rule__AwS__Group__2__Impl2550);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1214:1: rule__AwS__Group__3 : rule__AwS__Group__3__Impl ;
    public final void rule__AwS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1218:1: ( rule__AwS__Group__3__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1219:2: rule__AwS__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AwS__Group__3__Impl_in_rule__AwS__Group__32581);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1225:1: rule__AwS__Group__3__Impl : ( ( rule__AwS__UnorderedGroup_3 ) ) ;
    public final void rule__AwS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1229:1: ( ( ( rule__AwS__UnorderedGroup_3 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1230:1: ( ( rule__AwS__UnorderedGroup_3 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1230:1: ( ( rule__AwS__UnorderedGroup_3 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1231:1: ( rule__AwS__UnorderedGroup_3 )
            {
             before(grammarAccess.getAwSAccess().getUnorderedGroup_3()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1232:1: ( rule__AwS__UnorderedGroup_3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1232:2: rule__AwS__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__AwS__UnorderedGroup_3_in_rule__AwS__Group__3__Impl2608);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1250:1: rule__AwS__Group_2__0 : rule__AwS__Group_2__0__Impl rule__AwS__Group_2__1 ;
    public final void rule__AwS__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1254:1: ( rule__AwS__Group_2__0__Impl rule__AwS__Group_2__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1255:2: rule__AwS__Group_2__0__Impl rule__AwS__Group_2__1
            {
            pushFollow(FOLLOW_rule__AwS__Group_2__0__Impl_in_rule__AwS__Group_2__02646);
            rule__AwS__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AwS__Group_2__1_in_rule__AwS__Group_2__02649);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1262:1: rule__AwS__Group_2__0__Impl : ( 'v' ) ;
    public final void rule__AwS__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1266:1: ( ( 'v' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1267:1: ( 'v' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1267:1: ( 'v' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1268:1: 'v'
            {
             before(grammarAccess.getAwSAccess().getVKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__AwS__Group_2__0__Impl2677); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1281:1: rule__AwS__Group_2__1 : rule__AwS__Group_2__1__Impl ;
    public final void rule__AwS__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1285:1: ( rule__AwS__Group_2__1__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1286:2: rule__AwS__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AwS__Group_2__1__Impl_in_rule__AwS__Group_2__12708);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1292:1: rule__AwS__Group_2__1__Impl : ( ( rule__AwS__VersionAssignment_2_1 ) ) ;
    public final void rule__AwS__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1296:1: ( ( ( rule__AwS__VersionAssignment_2_1 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1297:1: ( ( rule__AwS__VersionAssignment_2_1 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1297:1: ( ( rule__AwS__VersionAssignment_2_1 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1298:1: ( rule__AwS__VersionAssignment_2_1 )
            {
             before(grammarAccess.getAwSAccess().getVersionAssignment_2_1()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1299:1: ( rule__AwS__VersionAssignment_2_1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1299:2: rule__AwS__VersionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AwS__VersionAssignment_2_1_in_rule__AwS__Group_2__1__Impl2735);
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


    // $ANTLR start "rule__KOS__Group__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1313:1: rule__KOS__Group__0 : rule__KOS__Group__0__Impl rule__KOS__Group__1 ;
    public final void rule__KOS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1317:1: ( rule__KOS__Group__0__Impl rule__KOS__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1318:2: rule__KOS__Group__0__Impl rule__KOS__Group__1
            {
            pushFollow(FOLLOW_rule__KOS__Group__0__Impl_in_rule__KOS__Group__02769);
            rule__KOS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KOS__Group__1_in_rule__KOS__Group__02772);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1325:1: rule__KOS__Group__0__Impl : ( ( rule__KOS__Alternatives_0 ) ) ;
    public final void rule__KOS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1329:1: ( ( ( rule__KOS__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1330:1: ( ( rule__KOS__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1330:1: ( ( rule__KOS__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1331:1: ( rule__KOS__Alternatives_0 )
            {
             before(grammarAccess.getKOSAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1332:1: ( rule__KOS__Alternatives_0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1332:2: rule__KOS__Alternatives_0
            {
            pushFollow(FOLLOW_rule__KOS__Alternatives_0_in_rule__KOS__Group__0__Impl2799);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1342:1: rule__KOS__Group__1 : rule__KOS__Group__1__Impl rule__KOS__Group__2 ;
    public final void rule__KOS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1346:1: ( rule__KOS__Group__1__Impl rule__KOS__Group__2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1347:2: rule__KOS__Group__1__Impl rule__KOS__Group__2
            {
            pushFollow(FOLLOW_rule__KOS__Group__1__Impl_in_rule__KOS__Group__12829);
            rule__KOS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KOS__Group__2_in_rule__KOS__Group__12832);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1354:1: rule__KOS__Group__1__Impl : ( '{' ) ;
    public final void rule__KOS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1358:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1359:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1359:1: ( '{' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1360:1: '{'
            {
             before(grammarAccess.getKOSAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__KOS__Group__1__Impl2860); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1373:1: rule__KOS__Group__2 : rule__KOS__Group__2__Impl rule__KOS__Group__3 ;
    public final void rule__KOS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1377:1: ( rule__KOS__Group__2__Impl rule__KOS__Group__3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1378:2: rule__KOS__Group__2__Impl rule__KOS__Group__3
            {
            pushFollow(FOLLOW_rule__KOS__Group__2__Impl_in_rule__KOS__Group__22891);
            rule__KOS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KOS__Group__3_in_rule__KOS__Group__22894);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1385:1: rule__KOS__Group__2__Impl : ( ( rule__KOS__Alternatives_2 )* ) ;
    public final void rule__KOS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1389:1: ( ( ( rule__KOS__Alternatives_2 )* ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1390:1: ( ( rule__KOS__Alternatives_2 )* )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1390:1: ( ( rule__KOS__Alternatives_2 )* )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1391:1: ( rule__KOS__Alternatives_2 )*
            {
             before(grammarAccess.getKOSAccess().getAlternatives_2()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1392:1: ( rule__KOS__Alternatives_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=30 && LA18_0<=39)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1392:2: rule__KOS__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__KOS__Alternatives_2_in_rule__KOS__Group__2__Impl2921);
            	    rule__KOS__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getKOSAccess().getAlternatives_2()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1402:1: rule__KOS__Group__3 : rule__KOS__Group__3__Impl ;
    public final void rule__KOS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1406:1: ( rule__KOS__Group__3__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1407:2: rule__KOS__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KOS__Group__3__Impl_in_rule__KOS__Group__32952);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1413:1: rule__KOS__Group__3__Impl : ( '}' ) ;
    public final void rule__KOS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1417:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1418:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1418:1: ( '}' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1419:1: '}'
            {
             before(grammarAccess.getKOSAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__KOS__Group__3__Impl2980); 
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


    // $ANTLR start "rule__VOS__Group__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1440:1: rule__VOS__Group__0 : rule__VOS__Group__0__Impl rule__VOS__Group__1 ;
    public final void rule__VOS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1444:1: ( rule__VOS__Group__0__Impl rule__VOS__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1445:2: rule__VOS__Group__0__Impl rule__VOS__Group__1
            {
            pushFollow(FOLLOW_rule__VOS__Group__0__Impl_in_rule__VOS__Group__03019);
            rule__VOS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOS__Group__1_in_rule__VOS__Group__03022);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1452:1: rule__VOS__Group__0__Impl : ( ( rule__VOS__Alternatives_0 ) ) ;
    public final void rule__VOS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1456:1: ( ( ( rule__VOS__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1457:1: ( ( rule__VOS__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1457:1: ( ( rule__VOS__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1458:1: ( rule__VOS__Alternatives_0 )
            {
             before(grammarAccess.getVOSAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1459:1: ( rule__VOS__Alternatives_0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1459:2: rule__VOS__Alternatives_0
            {
            pushFollow(FOLLOW_rule__VOS__Alternatives_0_in_rule__VOS__Group__0__Impl3049);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1469:1: rule__VOS__Group__1 : rule__VOS__Group__1__Impl rule__VOS__Group__2 ;
    public final void rule__VOS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1473:1: ( rule__VOS__Group__1__Impl rule__VOS__Group__2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1474:2: rule__VOS__Group__1__Impl rule__VOS__Group__2
            {
            pushFollow(FOLLOW_rule__VOS__Group__1__Impl_in_rule__VOS__Group__13079);
            rule__VOS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOS__Group__2_in_rule__VOS__Group__13082);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1481:1: rule__VOS__Group__1__Impl : ( '{' ) ;
    public final void rule__VOS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1485:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1486:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1486:1: ( '{' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1487:1: '{'
            {
             before(grammarAccess.getVOSAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__VOS__Group__1__Impl3110); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1500:1: rule__VOS__Group__2 : rule__VOS__Group__2__Impl rule__VOS__Group__3 ;
    public final void rule__VOS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1504:1: ( rule__VOS__Group__2__Impl rule__VOS__Group__3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1505:2: rule__VOS__Group__2__Impl rule__VOS__Group__3
            {
            pushFollow(FOLLOW_rule__VOS__Group__2__Impl_in_rule__VOS__Group__23141);
            rule__VOS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOS__Group__3_in_rule__VOS__Group__23144);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1512:1: rule__VOS__Group__2__Impl : ( ( rule__VOS__Alternatives_2 )* ) ;
    public final void rule__VOS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1516:1: ( ( ( rule__VOS__Alternatives_2 )* ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1517:1: ( ( rule__VOS__Alternatives_2 )* )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1517:1: ( ( rule__VOS__Alternatives_2 )* )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1518:1: ( rule__VOS__Alternatives_2 )*
            {
             before(grammarAccess.getVOSAccess().getAlternatives_2()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1519:1: ( rule__VOS__Alternatives_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==29||LA19_0==33||(LA19_0>=36 && LA19_0<=38)||LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1519:2: rule__VOS__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__VOS__Alternatives_2_in_rule__VOS__Group__2__Impl3171);
            	    rule__VOS__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getVOSAccess().getAlternatives_2()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1529:1: rule__VOS__Group__3 : rule__VOS__Group__3__Impl ;
    public final void rule__VOS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1533:1: ( rule__VOS__Group__3__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1534:2: rule__VOS__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VOS__Group__3__Impl_in_rule__VOS__Group__33202);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1540:1: rule__VOS__Group__3__Impl : ( '}' ) ;
    public final void rule__VOS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1544:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1545:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1545:1: ( '}' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1546:1: '}'
            {
             before(grammarAccess.getVOSAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__VOS__Group__3__Impl3230); 
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


    // $ANTLR start "rule__Attribut__Group__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1567:1: rule__Attribut__Group__0 : rule__Attribut__Group__0__Impl rule__Attribut__Group__1 ;
    public final void rule__Attribut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1571:1: ( rule__Attribut__Group__0__Impl rule__Attribut__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1572:2: rule__Attribut__Group__0__Impl rule__Attribut__Group__1
            {
            pushFollow(FOLLOW_rule__Attribut__Group__0__Impl_in_rule__Attribut__Group__03269);
            rule__Attribut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribut__Group__1_in_rule__Attribut__Group__03272);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1579:1: rule__Attribut__Group__0__Impl : ( ( rule__Attribut__Alternatives_0 ) ) ;
    public final void rule__Attribut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1583:1: ( ( ( rule__Attribut__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1584:1: ( ( rule__Attribut__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1584:1: ( ( rule__Attribut__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1585:1: ( rule__Attribut__Alternatives_0 )
            {
             before(grammarAccess.getAttributAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1586:1: ( rule__Attribut__Alternatives_0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1586:2: rule__Attribut__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Attribut__Alternatives_0_in_rule__Attribut__Group__0__Impl3299);
            rule__Attribut__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getAlternatives_0()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1596:1: rule__Attribut__Group__1 : rule__Attribut__Group__1__Impl rule__Attribut__Group__2 ;
    public final void rule__Attribut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1600:1: ( rule__Attribut__Group__1__Impl rule__Attribut__Group__2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1601:2: rule__Attribut__Group__1__Impl rule__Attribut__Group__2
            {
            pushFollow(FOLLOW_rule__Attribut__Group__1__Impl_in_rule__Attribut__Group__13329);
            rule__Attribut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribut__Group__2_in_rule__Attribut__Group__13332);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1608:1: rule__Attribut__Group__1__Impl : ( ( rule__Attribut__NameAssignment_1 ) ) ;
    public final void rule__Attribut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1612:1: ( ( ( rule__Attribut__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1613:1: ( ( rule__Attribut__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1613:1: ( ( rule__Attribut__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1614:1: ( rule__Attribut__NameAssignment_1 )
            {
             before(grammarAccess.getAttributAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1615:1: ( rule__Attribut__NameAssignment_1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1615:2: rule__Attribut__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribut__NameAssignment_1_in_rule__Attribut__Group__1__Impl3359);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1625:1: rule__Attribut__Group__2 : rule__Attribut__Group__2__Impl ;
    public final void rule__Attribut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1629:1: ( rule__Attribut__Group__2__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1630:2: rule__Attribut__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribut__Group__2__Impl_in_rule__Attribut__Group__23389);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1636:1: rule__Attribut__Group__2__Impl : ( ';' ) ;
    public final void rule__Attribut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1640:1: ( ( ';' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1641:1: ( ';' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1641:1: ( ';' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1642:1: ';'
            {
             before(grammarAccess.getAttributAccess().getSemicolonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Attribut__Group__2__Impl3417); 
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


    // $ANTLR start "rule__Attribut__Group_0_1__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1661:1: rule__Attribut__Group_0_1__0 : rule__Attribut__Group_0_1__0__Impl rule__Attribut__Group_0_1__1 ;
    public final void rule__Attribut__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1665:1: ( rule__Attribut__Group_0_1__0__Impl rule__Attribut__Group_0_1__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1666:2: rule__Attribut__Group_0_1__0__Impl rule__Attribut__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Attribut__Group_0_1__0__Impl_in_rule__Attribut__Group_0_1__03454);
            rule__Attribut__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribut__Group_0_1__1_in_rule__Attribut__Group_0_1__03457);
            rule__Attribut__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_0_1__0"


    // $ANTLR start "rule__Attribut__Group_0_1__0__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1673:1: rule__Attribut__Group_0_1__0__Impl : ( 'DT' ) ;
    public final void rule__Attribut__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1677:1: ( ( 'DT' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1678:1: ( 'DT' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1678:1: ( 'DT' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1679:1: 'DT'
            {
             before(grammarAccess.getAttributAccess().getDTKeyword_0_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Attribut__Group_0_1__0__Impl3485); 
             after(grammarAccess.getAttributAccess().getDTKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_0_1__0__Impl"


    // $ANTLR start "rule__Attribut__Group_0_1__1"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1692:1: rule__Attribut__Group_0_1__1 : rule__Attribut__Group_0_1__1__Impl ;
    public final void rule__Attribut__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1696:1: ( rule__Attribut__Group_0_1__1__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1697:2: rule__Attribut__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribut__Group_0_1__1__Impl_in_rule__Attribut__Group_0_1__13516);
            rule__Attribut__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_0_1__1"


    // $ANTLR start "rule__Attribut__Group_0_1__1__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1703:1: rule__Attribut__Group_0_1__1__Impl : ( ( rule__Attribut__DatentypAssignment_0_1_1 ) ) ;
    public final void rule__Attribut__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1707:1: ( ( ( rule__Attribut__DatentypAssignment_0_1_1 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1708:1: ( ( rule__Attribut__DatentypAssignment_0_1_1 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1708:1: ( ( rule__Attribut__DatentypAssignment_0_1_1 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1709:1: ( rule__Attribut__DatentypAssignment_0_1_1 )
            {
             before(grammarAccess.getAttributAccess().getDatentypAssignment_0_1_1()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1710:1: ( rule__Attribut__DatentypAssignment_0_1_1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1710:2: rule__Attribut__DatentypAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Attribut__DatentypAssignment_0_1_1_in_rule__Attribut__Group_0_1__1__Impl3543);
            rule__Attribut__DatentypAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getDatentypAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_0_1__1__Impl"


    // $ANTLR start "rule__Operator__Group__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1724:1: rule__Operator__Group__0 : rule__Operator__Group__0__Impl rule__Operator__Group__1 ;
    public final void rule__Operator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1728:1: ( rule__Operator__Group__0__Impl rule__Operator__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1729:2: rule__Operator__Group__0__Impl rule__Operator__Group__1
            {
            pushFollow(FOLLOW_rule__Operator__Group__0__Impl_in_rule__Operator__Group__03577);
            rule__Operator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__1_in_rule__Operator__Group__03580);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1736:1: rule__Operator__Group__0__Impl : ( ( rule__Operator__NameAssignment_0 ) ) ;
    public final void rule__Operator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1740:1: ( ( ( rule__Operator__NameAssignment_0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1741:1: ( ( rule__Operator__NameAssignment_0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1741:1: ( ( rule__Operator__NameAssignment_0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1742:1: ( rule__Operator__NameAssignment_0 )
            {
             before(grammarAccess.getOperatorAccess().getNameAssignment_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1743:1: ( rule__Operator__NameAssignment_0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1743:2: rule__Operator__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Operator__NameAssignment_0_in_rule__Operator__Group__0__Impl3607);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1753:1: rule__Operator__Group__1 : rule__Operator__Group__1__Impl rule__Operator__Group__2 ;
    public final void rule__Operator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1757:1: ( rule__Operator__Group__1__Impl rule__Operator__Group__2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1758:2: rule__Operator__Group__1__Impl rule__Operator__Group__2
            {
            pushFollow(FOLLOW_rule__Operator__Group__1__Impl_in_rule__Operator__Group__13637);
            rule__Operator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__2_in_rule__Operator__Group__13640);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1765:1: rule__Operator__Group__1__Impl : ( '(' ) ;
    public final void rule__Operator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1769:1: ( ( '(' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1770:1: ( '(' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1770:1: ( '(' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1771:1: '('
            {
             before(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Operator__Group__1__Impl3668); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1784:1: rule__Operator__Group__2 : rule__Operator__Group__2__Impl rule__Operator__Group__3 ;
    public final void rule__Operator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1788:1: ( rule__Operator__Group__2__Impl rule__Operator__Group__3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1789:2: rule__Operator__Group__2__Impl rule__Operator__Group__3
            {
            pushFollow(FOLLOW_rule__Operator__Group__2__Impl_in_rule__Operator__Group__23699);
            rule__Operator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__3_in_rule__Operator__Group__23702);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1796:1: rule__Operator__Group__2__Impl : ( ( rule__Operator__ParameterAssignment_2 )* ) ;
    public final void rule__Operator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1800:1: ( ( ( rule__Operator__ParameterAssignment_2 )* ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1801:1: ( ( rule__Operator__ParameterAssignment_2 )* )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1801:1: ( ( rule__Operator__ParameterAssignment_2 )* )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1802:1: ( rule__Operator__ParameterAssignment_2 )*
            {
             before(grammarAccess.getOperatorAccess().getParameterAssignment_2()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1803:1: ( rule__Operator__ParameterAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1803:2: rule__Operator__ParameterAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Operator__ParameterAssignment_2_in_rule__Operator__Group__2__Impl3729);
            	    rule__Operator__ParameterAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1813:1: rule__Operator__Group__3 : rule__Operator__Group__3__Impl rule__Operator__Group__4 ;
    public final void rule__Operator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1817:1: ( rule__Operator__Group__3__Impl rule__Operator__Group__4 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1818:2: rule__Operator__Group__3__Impl rule__Operator__Group__4
            {
            pushFollow(FOLLOW_rule__Operator__Group__3__Impl_in_rule__Operator__Group__33760);
            rule__Operator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__4_in_rule__Operator__Group__33763);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1825:1: rule__Operator__Group__3__Impl : ( ') {' ) ;
    public final void rule__Operator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1829:1: ( ( ') {' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1830:1: ( ') {' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1830:1: ( ') {' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1831:1: ') {'
            {
             before(grammarAccess.getOperatorAccess().getRightParenthesisSpaceLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Operator__Group__3__Impl3791); 
             after(grammarAccess.getOperatorAccess().getRightParenthesisSpaceLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1844:1: rule__Operator__Group__4 : rule__Operator__Group__4__Impl rule__Operator__Group__5 ;
    public final void rule__Operator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1848:1: ( rule__Operator__Group__4__Impl rule__Operator__Group__5 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1849:2: rule__Operator__Group__4__Impl rule__Operator__Group__5
            {
            pushFollow(FOLLOW_rule__Operator__Group__4__Impl_in_rule__Operator__Group__43822);
            rule__Operator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__5_in_rule__Operator__Group__43825);
            rule__Operator__Group__5();

            state._fsp--;


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1856:1: rule__Operator__Group__4__Impl : ( ( rule__Operator__AnweisungenAssignment_4 )* ) ;
    public final void rule__Operator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1860:1: ( ( ( rule__Operator__AnweisungenAssignment_4 )* ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1861:1: ( ( rule__Operator__AnweisungenAssignment_4 )* )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1861:1: ( ( rule__Operator__AnweisungenAssignment_4 )* )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1862:1: ( rule__Operator__AnweisungenAssignment_4 )*
            {
             before(grammarAccess.getOperatorAccess().getAnweisungenAssignment_4()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1863:1: ( rule__Operator__AnweisungenAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1863:2: rule__Operator__AnweisungenAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Operator__AnweisungenAssignment_4_in_rule__Operator__Group__4__Impl3852);
            	    rule__Operator__AnweisungenAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getOperatorAccess().getAnweisungenAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Operator__Group__5"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1873:1: rule__Operator__Group__5 : rule__Operator__Group__5__Impl ;
    public final void rule__Operator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1877:1: ( rule__Operator__Group__5__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1878:2: rule__Operator__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Operator__Group__5__Impl_in_rule__Operator__Group__53883);
            rule__Operator__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__5"


    // $ANTLR start "rule__Operator__Group__5__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1884:1: rule__Operator__Group__5__Impl : ( '}' ) ;
    public final void rule__Operator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1888:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1889:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1889:1: ( '}' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1890:1: '}'
            {
             before(grammarAccess.getOperatorAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Operator__Group__5__Impl3911); 
             after(grammarAccess.getOperatorAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group__5__Impl"


    // $ANTLR start "rule__Anweisung__Group_0__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1915:1: rule__Anweisung__Group_0__0 : rule__Anweisung__Group_0__0__Impl rule__Anweisung__Group_0__1 ;
    public final void rule__Anweisung__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1919:1: ( rule__Anweisung__Group_0__0__Impl rule__Anweisung__Group_0__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1920:2: rule__Anweisung__Group_0__0__Impl rule__Anweisung__Group_0__1
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_0__0__Impl_in_rule__Anweisung__Group_0__03954);
            rule__Anweisung__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Anweisung__Group_0__1_in_rule__Anweisung__Group_0__03957);
            rule__Anweisung__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_0__0"


    // $ANTLR start "rule__Anweisung__Group_0__0__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1927:1: rule__Anweisung__Group_0__0__Impl : ( ( rule__Anweisung__KontrollstrukturAssignment_0_0 ) ) ;
    public final void rule__Anweisung__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1931:1: ( ( ( rule__Anweisung__KontrollstrukturAssignment_0_0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1932:1: ( ( rule__Anweisung__KontrollstrukturAssignment_0_0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1932:1: ( ( rule__Anweisung__KontrollstrukturAssignment_0_0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1933:1: ( rule__Anweisung__KontrollstrukturAssignment_0_0 )
            {
             before(grammarAccess.getAnweisungAccess().getKontrollstrukturAssignment_0_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1934:1: ( rule__Anweisung__KontrollstrukturAssignment_0_0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1934:2: rule__Anweisung__KontrollstrukturAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Anweisung__KontrollstrukturAssignment_0_0_in_rule__Anweisung__Group_0__0__Impl3984);
            rule__Anweisung__KontrollstrukturAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAnweisungAccess().getKontrollstrukturAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_0__0__Impl"


    // $ANTLR start "rule__Anweisung__Group_0__1"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1944:1: rule__Anweisung__Group_0__1 : rule__Anweisung__Group_0__1__Impl rule__Anweisung__Group_0__2 ;
    public final void rule__Anweisung__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1948:1: ( rule__Anweisung__Group_0__1__Impl rule__Anweisung__Group_0__2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1949:2: rule__Anweisung__Group_0__1__Impl rule__Anweisung__Group_0__2
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_0__1__Impl_in_rule__Anweisung__Group_0__14014);
            rule__Anweisung__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Anweisung__Group_0__2_in_rule__Anweisung__Group_0__14017);
            rule__Anweisung__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_0__1"


    // $ANTLR start "rule__Anweisung__Group_0__1__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1956:1: rule__Anweisung__Group_0__1__Impl : ( '(' ) ;
    public final void rule__Anweisung__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1960:1: ( ( '(' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1961:1: ( '(' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1961:1: ( '(' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1962:1: '('
            {
             before(grammarAccess.getAnweisungAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,26,FOLLOW_26_in_rule__Anweisung__Group_0__1__Impl4045); 
             after(grammarAccess.getAnweisungAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_0__1__Impl"


    // $ANTLR start "rule__Anweisung__Group_0__2"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1975:1: rule__Anweisung__Group_0__2 : rule__Anweisung__Group_0__2__Impl rule__Anweisung__Group_0__3 ;
    public final void rule__Anweisung__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1979:1: ( rule__Anweisung__Group_0__2__Impl rule__Anweisung__Group_0__3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1980:2: rule__Anweisung__Group_0__2__Impl rule__Anweisung__Group_0__3
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_0__2__Impl_in_rule__Anweisung__Group_0__24076);
            rule__Anweisung__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Anweisung__Group_0__3_in_rule__Anweisung__Group_0__24079);
            rule__Anweisung__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_0__2"


    // $ANTLR start "rule__Anweisung__Group_0__2__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1987:1: rule__Anweisung__Group_0__2__Impl : ( ( rule__Anweisung__BedingungAssignment_0_2 ) ) ;
    public final void rule__Anweisung__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1991:1: ( ( ( rule__Anweisung__BedingungAssignment_0_2 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1992:1: ( ( rule__Anweisung__BedingungAssignment_0_2 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1992:1: ( ( rule__Anweisung__BedingungAssignment_0_2 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1993:1: ( rule__Anweisung__BedingungAssignment_0_2 )
            {
             before(grammarAccess.getAnweisungAccess().getBedingungAssignment_0_2()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1994:1: ( rule__Anweisung__BedingungAssignment_0_2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:1994:2: rule__Anweisung__BedingungAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Anweisung__BedingungAssignment_0_2_in_rule__Anweisung__Group_0__2__Impl4106);
            rule__Anweisung__BedingungAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAnweisungAccess().getBedingungAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_0__2__Impl"


    // $ANTLR start "rule__Anweisung__Group_0__3"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2004:1: rule__Anweisung__Group_0__3 : rule__Anweisung__Group_0__3__Impl rule__Anweisung__Group_0__4 ;
    public final void rule__Anweisung__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2008:1: ( rule__Anweisung__Group_0__3__Impl rule__Anweisung__Group_0__4 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2009:2: rule__Anweisung__Group_0__3__Impl rule__Anweisung__Group_0__4
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_0__3__Impl_in_rule__Anweisung__Group_0__34136);
            rule__Anweisung__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Anweisung__Group_0__4_in_rule__Anweisung__Group_0__34139);
            rule__Anweisung__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_0__3"


    // $ANTLR start "rule__Anweisung__Group_0__3__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2016:1: rule__Anweisung__Group_0__3__Impl : ( ') {' ) ;
    public final void rule__Anweisung__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2020:1: ( ( ') {' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2021:1: ( ') {' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2021:1: ( ') {' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2022:1: ') {'
            {
             before(grammarAccess.getAnweisungAccess().getRightParenthesisSpaceLeftCurlyBracketKeyword_0_3()); 
            match(input,27,FOLLOW_27_in_rule__Anweisung__Group_0__3__Impl4167); 
             after(grammarAccess.getAnweisungAccess().getRightParenthesisSpaceLeftCurlyBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_0__3__Impl"


    // $ANTLR start "rule__Anweisung__Group_0__4"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2035:1: rule__Anweisung__Group_0__4 : rule__Anweisung__Group_0__4__Impl rule__Anweisung__Group_0__5 ;
    public final void rule__Anweisung__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2039:1: ( rule__Anweisung__Group_0__4__Impl rule__Anweisung__Group_0__5 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2040:2: rule__Anweisung__Group_0__4__Impl rule__Anweisung__Group_0__5
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_0__4__Impl_in_rule__Anweisung__Group_0__44198);
            rule__Anweisung__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Anweisung__Group_0__5_in_rule__Anweisung__Group_0__44201);
            rule__Anweisung__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_0__4"


    // $ANTLR start "rule__Anweisung__Group_0__4__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2047:1: rule__Anweisung__Group_0__4__Impl : ( ( rule__Anweisung__BedigteAnweisungenAssignment_0_4 )* ) ;
    public final void rule__Anweisung__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2051:1: ( ( ( rule__Anweisung__BedigteAnweisungenAssignment_0_4 )* ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2052:1: ( ( rule__Anweisung__BedigteAnweisungenAssignment_0_4 )* )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2052:1: ( ( rule__Anweisung__BedigteAnweisungenAssignment_0_4 )* )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2053:1: ( rule__Anweisung__BedigteAnweisungenAssignment_0_4 )*
            {
             before(grammarAccess.getAnweisungAccess().getBedigteAnweisungenAssignment_0_4()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2054:1: ( rule__Anweisung__BedigteAnweisungenAssignment_0_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2054:2: rule__Anweisung__BedigteAnweisungenAssignment_0_4
            	    {
            	    pushFollow(FOLLOW_rule__Anweisung__BedigteAnweisungenAssignment_0_4_in_rule__Anweisung__Group_0__4__Impl4228);
            	    rule__Anweisung__BedigteAnweisungenAssignment_0_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAnweisungAccess().getBedigteAnweisungenAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_0__4__Impl"


    // $ANTLR start "rule__Anweisung__Group_0__5"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2064:1: rule__Anweisung__Group_0__5 : rule__Anweisung__Group_0__5__Impl ;
    public final void rule__Anweisung__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2068:1: ( rule__Anweisung__Group_0__5__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2069:2: rule__Anweisung__Group_0__5__Impl
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_0__5__Impl_in_rule__Anweisung__Group_0__54259);
            rule__Anweisung__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_0__5"


    // $ANTLR start "rule__Anweisung__Group_0__5__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2075:1: rule__Anweisung__Group_0__5__Impl : ( '}' ) ;
    public final void rule__Anweisung__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2079:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2080:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2080:1: ( '}' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2081:1: '}'
            {
             before(grammarAccess.getAnweisungAccess().getRightCurlyBracketKeyword_0_5()); 
            match(input,23,FOLLOW_23_in_rule__Anweisung__Group_0__5__Impl4287); 
             after(grammarAccess.getAnweisungAccess().getRightCurlyBracketKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_0__5__Impl"


    // $ANTLR start "rule__Anweisung__Group_1__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2106:1: rule__Anweisung__Group_1__0 : rule__Anweisung__Group_1__0__Impl rule__Anweisung__Group_1__1 ;
    public final void rule__Anweisung__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2110:1: ( rule__Anweisung__Group_1__0__Impl rule__Anweisung__Group_1__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2111:2: rule__Anweisung__Group_1__0__Impl rule__Anweisung__Group_1__1
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_1__0__Impl_in_rule__Anweisung__Group_1__04330);
            rule__Anweisung__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Anweisung__Group_1__1_in_rule__Anweisung__Group_1__04333);
            rule__Anweisung__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_1__0"


    // $ANTLR start "rule__Anweisung__Group_1__0__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2118:1: rule__Anweisung__Group_1__0__Impl : ( ( rule__Anweisung__Group_1_0__0 )? ) ;
    public final void rule__Anweisung__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2122:1: ( ( ( rule__Anweisung__Group_1_0__0 )? ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2123:1: ( ( rule__Anweisung__Group_1_0__0 )? )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2123:1: ( ( rule__Anweisung__Group_1_0__0 )? )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2124:1: ( rule__Anweisung__Group_1_0__0 )?
            {
             before(grammarAccess.getAnweisungAccess().getGroup_1_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2125:1: ( rule__Anweisung__Group_1_0__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==28) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2125:2: rule__Anweisung__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Anweisung__Group_1_0__0_in_rule__Anweisung__Group_1__0__Impl4360);
                    rule__Anweisung__Group_1_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnweisungAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_1__0__Impl"


    // $ANTLR start "rule__Anweisung__Group_1__1"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2135:1: rule__Anweisung__Group_1__1 : rule__Anweisung__Group_1__1__Impl ;
    public final void rule__Anweisung__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2139:1: ( rule__Anweisung__Group_1__1__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2140:2: rule__Anweisung__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_1__1__Impl_in_rule__Anweisung__Group_1__14391);
            rule__Anweisung__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_1__1"


    // $ANTLR start "rule__Anweisung__Group_1__1__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2146:1: rule__Anweisung__Group_1__1__Impl : ( ( rule__Anweisung__OperatorAssignment_1_1 ) ) ;
    public final void rule__Anweisung__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2150:1: ( ( ( rule__Anweisung__OperatorAssignment_1_1 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2151:1: ( ( rule__Anweisung__OperatorAssignment_1_1 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2151:1: ( ( rule__Anweisung__OperatorAssignment_1_1 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2152:1: ( rule__Anweisung__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAnweisungAccess().getOperatorAssignment_1_1()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2153:1: ( rule__Anweisung__OperatorAssignment_1_1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2153:2: rule__Anweisung__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Anweisung__OperatorAssignment_1_1_in_rule__Anweisung__Group_1__1__Impl4418);
            rule__Anweisung__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAnweisungAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_1__1__Impl"


    // $ANTLR start "rule__Anweisung__Group_1_0__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2167:1: rule__Anweisung__Group_1_0__0 : rule__Anweisung__Group_1_0__0__Impl rule__Anweisung__Group_1_0__1 ;
    public final void rule__Anweisung__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2171:1: ( rule__Anweisung__Group_1_0__0__Impl rule__Anweisung__Group_1_0__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2172:2: rule__Anweisung__Group_1_0__0__Impl rule__Anweisung__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_1_0__0__Impl_in_rule__Anweisung__Group_1_0__04452);
            rule__Anweisung__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Anweisung__Group_1_0__1_in_rule__Anweisung__Group_1_0__04455);
            rule__Anweisung__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_1_0__0"


    // $ANTLR start "rule__Anweisung__Group_1_0__0__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2179:1: rule__Anweisung__Group_1_0__0__Impl : ( ( rule__Anweisung__ObjektAssignment_1_0_0 ) ) ;
    public final void rule__Anweisung__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2183:1: ( ( ( rule__Anweisung__ObjektAssignment_1_0_0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2184:1: ( ( rule__Anweisung__ObjektAssignment_1_0_0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2184:1: ( ( rule__Anweisung__ObjektAssignment_1_0_0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2185:1: ( rule__Anweisung__ObjektAssignment_1_0_0 )
            {
             before(grammarAccess.getAnweisungAccess().getObjektAssignment_1_0_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2186:1: ( rule__Anweisung__ObjektAssignment_1_0_0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2186:2: rule__Anweisung__ObjektAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__Anweisung__ObjektAssignment_1_0_0_in_rule__Anweisung__Group_1_0__0__Impl4482);
            rule__Anweisung__ObjektAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAnweisungAccess().getObjektAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_1_0__0__Impl"


    // $ANTLR start "rule__Anweisung__Group_1_0__1"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2196:1: rule__Anweisung__Group_1_0__1 : rule__Anweisung__Group_1_0__1__Impl ;
    public final void rule__Anweisung__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2200:1: ( rule__Anweisung__Group_1_0__1__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2201:2: rule__Anweisung__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_1_0__1__Impl_in_rule__Anweisung__Group_1_0__14512);
            rule__Anweisung__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_1_0__1"


    // $ANTLR start "rule__Anweisung__Group_1_0__1__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2207:1: rule__Anweisung__Group_1_0__1__Impl : ( '.' ) ;
    public final void rule__Anweisung__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2211:1: ( ( '.' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2212:1: ( '.' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2212:1: ( '.' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2213:1: '.'
            {
             before(grammarAccess.getAnweisungAccess().getFullStopKeyword_1_0_1()); 
            match(input,28,FOLLOW_28_in_rule__Anweisung__Group_1_0__1__Impl4540); 
             after(grammarAccess.getAnweisungAccess().getFullStopKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__Group_1_0__1__Impl"


    // $ANTLR start "rule__VOT__Group__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2230:1: rule__VOT__Group__0 : rule__VOT__Group__0__Impl rule__VOT__Group__1 ;
    public final void rule__VOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2234:1: ( rule__VOT__Group__0__Impl rule__VOT__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2235:2: rule__VOT__Group__0__Impl rule__VOT__Group__1
            {
            pushFollow(FOLLOW_rule__VOT__Group__0__Impl_in_rule__VOT__Group__04575);
            rule__VOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__1_in_rule__VOT__Group__04578);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2242:1: rule__VOT__Group__0__Impl : ( ( rule__VOT__AnnotationAssignment_0 )? ) ;
    public final void rule__VOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2246:1: ( ( ( rule__VOT__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2247:1: ( ( rule__VOT__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2247:1: ( ( rule__VOT__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2248:1: ( rule__VOT__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getVOTAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2249:1: ( rule__VOT__AnnotationAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=36 && LA24_0<=38)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2249:2: rule__VOT__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__VOT__AnnotationAssignment_0_in_rule__VOT__Group__0__Impl4605);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2259:1: rule__VOT__Group__1 : rule__VOT__Group__1__Impl rule__VOT__Group__2 ;
    public final void rule__VOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2263:1: ( rule__VOT__Group__1__Impl rule__VOT__Group__2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2264:2: rule__VOT__Group__1__Impl rule__VOT__Group__2
            {
            pushFollow(FOLLOW_rule__VOT__Group__1__Impl_in_rule__VOT__Group__14636);
            rule__VOT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__2_in_rule__VOT__Group__14639);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2271:1: rule__VOT__Group__1__Impl : ( 'VOT' ) ;
    public final void rule__VOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2275:1: ( ( 'VOT' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2276:1: ( 'VOT' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2276:1: ( 'VOT' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2277:1: 'VOT'
            {
             before(grammarAccess.getVOTAccess().getVOTKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__VOT__Group__1__Impl4667); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2290:1: rule__VOT__Group__2 : rule__VOT__Group__2__Impl rule__VOT__Group__3 ;
    public final void rule__VOT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2294:1: ( rule__VOT__Group__2__Impl rule__VOT__Group__3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2295:2: rule__VOT__Group__2__Impl rule__VOT__Group__3
            {
            pushFollow(FOLLOW_rule__VOT__Group__2__Impl_in_rule__VOT__Group__24698);
            rule__VOT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__3_in_rule__VOT__Group__24701);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2302:1: rule__VOT__Group__2__Impl : ( ( rule__VOT__NameAssignment_2 ) ) ;
    public final void rule__VOT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2306:1: ( ( ( rule__VOT__NameAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2307:1: ( ( rule__VOT__NameAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2307:1: ( ( rule__VOT__NameAssignment_2 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2308:1: ( rule__VOT__NameAssignment_2 )
            {
             before(grammarAccess.getVOTAccess().getNameAssignment_2()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2309:1: ( rule__VOT__NameAssignment_2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2309:2: rule__VOT__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__VOT__NameAssignment_2_in_rule__VOT__Group__2__Impl4728);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2319:1: rule__VOT__Group__3 : rule__VOT__Group__3__Impl rule__VOT__Group__4 ;
    public final void rule__VOT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2323:1: ( rule__VOT__Group__3__Impl rule__VOT__Group__4 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2324:2: rule__VOT__Group__3__Impl rule__VOT__Group__4
            {
            pushFollow(FOLLOW_rule__VOT__Group__3__Impl_in_rule__VOT__Group__34758);
            rule__VOT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__4_in_rule__VOT__Group__34761);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2331:1: rule__VOT__Group__3__Impl : ( '{' ) ;
    public final void rule__VOT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2335:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2336:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2336:1: ( '{' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2337:1: '{'
            {
             before(grammarAccess.getVOTAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__VOT__Group__3__Impl4789); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2350:1: rule__VOT__Group__4 : rule__VOT__Group__4__Impl rule__VOT__Group__5 ;
    public final void rule__VOT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2354:1: ( rule__VOT__Group__4__Impl rule__VOT__Group__5 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2355:2: rule__VOT__Group__4__Impl rule__VOT__Group__5
            {
            pushFollow(FOLLOW_rule__VOT__Group__4__Impl_in_rule__VOT__Group__44820);
            rule__VOT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__5_in_rule__VOT__Group__44823);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2362:1: rule__VOT__Group__4__Impl : ( ( rule__VOT__AttributeAssignment_4 )* ) ;
    public final void rule__VOT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2366:1: ( ( ( rule__VOT__AttributeAssignment_4 )* ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2367:1: ( ( rule__VOT__AttributeAssignment_4 )* )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2367:1: ( ( rule__VOT__AttributeAssignment_4 )* )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2368:1: ( rule__VOT__AttributeAssignment_4 )*
            {
             before(grammarAccess.getVOTAccess().getAttributeAssignment_4()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2369:1: ( rule__VOT__AttributeAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_ID) ) {
                        alt25=1;
                    }


                }
                else if ( (LA25_0==25) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2369:2: rule__VOT__AttributeAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__VOT__AttributeAssignment_4_in_rule__VOT__Group__4__Impl4850);
            	    rule__VOT__AttributeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getVOTAccess().getAttributeAssignment_4()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2379:1: rule__VOT__Group__5 : rule__VOT__Group__5__Impl rule__VOT__Group__6 ;
    public final void rule__VOT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2383:1: ( rule__VOT__Group__5__Impl rule__VOT__Group__6 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2384:2: rule__VOT__Group__5__Impl rule__VOT__Group__6
            {
            pushFollow(FOLLOW_rule__VOT__Group__5__Impl_in_rule__VOT__Group__54881);
            rule__VOT__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__6_in_rule__VOT__Group__54884);
            rule__VOT__Group__6();

            state._fsp--;


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2391:1: rule__VOT__Group__5__Impl : ( ( rule__VOT__OperatorenAssignment_5 )* ) ;
    public final void rule__VOT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2395:1: ( ( ( rule__VOT__OperatorenAssignment_5 )* ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2396:1: ( ( rule__VOT__OperatorenAssignment_5 )* )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2396:1: ( ( rule__VOT__OperatorenAssignment_5 )* )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2397:1: ( rule__VOT__OperatorenAssignment_5 )*
            {
             before(grammarAccess.getVOTAccess().getOperatorenAssignment_5()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2398:1: ( rule__VOT__OperatorenAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2398:2: rule__VOT__OperatorenAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__VOT__OperatorenAssignment_5_in_rule__VOT__Group__5__Impl4911);
            	    rule__VOT__OperatorenAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getVOTAccess().getOperatorenAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__VOT__Group__6"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2408:1: rule__VOT__Group__6 : rule__VOT__Group__6__Impl ;
    public final void rule__VOT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2412:1: ( rule__VOT__Group__6__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2413:2: rule__VOT__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__VOT__Group__6__Impl_in_rule__VOT__Group__64942);
            rule__VOT__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VOT__Group__6"


    // $ANTLR start "rule__VOT__Group__6__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2419:1: rule__VOT__Group__6__Impl : ( '}' ) ;
    public final void rule__VOT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2423:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2424:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2424:1: ( '}' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2425:1: '}'
            {
             before(grammarAccess.getVOTAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__VOT__Group__6__Impl4970); 
             after(grammarAccess.getVOTAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VOT__Group__6__Impl"


    // $ANTLR start "rule__OOT__Group__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2452:1: rule__OOT__Group__0 : rule__OOT__Group__0__Impl rule__OOT__Group__1 ;
    public final void rule__OOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2456:1: ( rule__OOT__Group__0__Impl rule__OOT__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2457:2: rule__OOT__Group__0__Impl rule__OOT__Group__1
            {
            pushFollow(FOLLOW_rule__OOT__Group__0__Impl_in_rule__OOT__Group__05015);
            rule__OOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__1_in_rule__OOT__Group__05018);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2464:1: rule__OOT__Group__0__Impl : ( ( rule__OOT__AnnotationAssignment_0 )? ) ;
    public final void rule__OOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2468:1: ( ( ( rule__OOT__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2469:1: ( ( rule__OOT__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2469:1: ( ( rule__OOT__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2470:1: ( rule__OOT__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getOOTAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2471:1: ( rule__OOT__AnnotationAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=36 && LA27_0<=38)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2471:2: rule__OOT__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__OOT__AnnotationAssignment_0_in_rule__OOT__Group__0__Impl5045);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2481:1: rule__OOT__Group__1 : rule__OOT__Group__1__Impl rule__OOT__Group__2 ;
    public final void rule__OOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2485:1: ( rule__OOT__Group__1__Impl rule__OOT__Group__2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2486:2: rule__OOT__Group__1__Impl rule__OOT__Group__2
            {
            pushFollow(FOLLOW_rule__OOT__Group__1__Impl_in_rule__OOT__Group__15076);
            rule__OOT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__2_in_rule__OOT__Group__15079);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2493:1: rule__OOT__Group__1__Impl : ( 'OOT' ) ;
    public final void rule__OOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2497:1: ( ( 'OOT' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2498:1: ( 'OOT' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2498:1: ( 'OOT' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2499:1: 'OOT'
            {
             before(grammarAccess.getOOTAccess().getOOTKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__OOT__Group__1__Impl5107); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2512:1: rule__OOT__Group__2 : rule__OOT__Group__2__Impl rule__OOT__Group__3 ;
    public final void rule__OOT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2516:1: ( rule__OOT__Group__2__Impl rule__OOT__Group__3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2517:2: rule__OOT__Group__2__Impl rule__OOT__Group__3
            {
            pushFollow(FOLLOW_rule__OOT__Group__2__Impl_in_rule__OOT__Group__25138);
            rule__OOT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__3_in_rule__OOT__Group__25141);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2524:1: rule__OOT__Group__2__Impl : ( ( rule__OOT__NameAssignment_2 ) ) ;
    public final void rule__OOT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2528:1: ( ( ( rule__OOT__NameAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2529:1: ( ( rule__OOT__NameAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2529:1: ( ( rule__OOT__NameAssignment_2 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2530:1: ( rule__OOT__NameAssignment_2 )
            {
             before(grammarAccess.getOOTAccess().getNameAssignment_2()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2531:1: ( rule__OOT__NameAssignment_2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2531:2: rule__OOT__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__OOT__NameAssignment_2_in_rule__OOT__Group__2__Impl5168);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2541:1: rule__OOT__Group__3 : rule__OOT__Group__3__Impl rule__OOT__Group__4 ;
    public final void rule__OOT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2545:1: ( rule__OOT__Group__3__Impl rule__OOT__Group__4 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2546:2: rule__OOT__Group__3__Impl rule__OOT__Group__4
            {
            pushFollow(FOLLOW_rule__OOT__Group__3__Impl_in_rule__OOT__Group__35198);
            rule__OOT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__4_in_rule__OOT__Group__35201);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2553:1: rule__OOT__Group__3__Impl : ( '{' ) ;
    public final void rule__OOT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2557:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2558:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2558:1: ( '{' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2559:1: '{'
            {
             before(grammarAccess.getOOTAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__OOT__Group__3__Impl5229); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2572:1: rule__OOT__Group__4 : rule__OOT__Group__4__Impl rule__OOT__Group__5 ;
    public final void rule__OOT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2576:1: ( rule__OOT__Group__4__Impl rule__OOT__Group__5 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2577:2: rule__OOT__Group__4__Impl rule__OOT__Group__5
            {
            pushFollow(FOLLOW_rule__OOT__Group__4__Impl_in_rule__OOT__Group__45260);
            rule__OOT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__5_in_rule__OOT__Group__45263);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2584:1: rule__OOT__Group__4__Impl : ( ( rule__OOT__AttributeAssignment_4 )* ) ;
    public final void rule__OOT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2588:1: ( ( ( rule__OOT__AttributeAssignment_4 )* ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2589:1: ( ( rule__OOT__AttributeAssignment_4 )* )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2589:1: ( ( rule__OOT__AttributeAssignment_4 )* )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2590:1: ( rule__OOT__AttributeAssignment_4 )*
            {
             before(grammarAccess.getOOTAccess().getAttributeAssignment_4()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2591:1: ( rule__OOT__AttributeAssignment_4 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_ID) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==25) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2591:2: rule__OOT__AttributeAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__OOT__AttributeAssignment_4_in_rule__OOT__Group__4__Impl5290);
            	    rule__OOT__AttributeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getOOTAccess().getAttributeAssignment_4()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2601:1: rule__OOT__Group__5 : rule__OOT__Group__5__Impl rule__OOT__Group__6 ;
    public final void rule__OOT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2605:1: ( rule__OOT__Group__5__Impl rule__OOT__Group__6 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2606:2: rule__OOT__Group__5__Impl rule__OOT__Group__6
            {
            pushFollow(FOLLOW_rule__OOT__Group__5__Impl_in_rule__OOT__Group__55321);
            rule__OOT__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__6_in_rule__OOT__Group__55324);
            rule__OOT__Group__6();

            state._fsp--;


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2613:1: rule__OOT__Group__5__Impl : ( ( rule__OOT__OperatorenAssignment_5 )* ) ;
    public final void rule__OOT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2617:1: ( ( ( rule__OOT__OperatorenAssignment_5 )* ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2618:1: ( ( rule__OOT__OperatorenAssignment_5 )* )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2618:1: ( ( rule__OOT__OperatorenAssignment_5 )* )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2619:1: ( rule__OOT__OperatorenAssignment_5 )*
            {
             before(grammarAccess.getOOTAccess().getOperatorenAssignment_5()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2620:1: ( rule__OOT__OperatorenAssignment_5 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2620:2: rule__OOT__OperatorenAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__OOT__OperatorenAssignment_5_in_rule__OOT__Group__5__Impl5351);
            	    rule__OOT__OperatorenAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getOOTAccess().getOperatorenAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__OOT__Group__6"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2630:1: rule__OOT__Group__6 : rule__OOT__Group__6__Impl ;
    public final void rule__OOT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2634:1: ( rule__OOT__Group__6__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2635:2: rule__OOT__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__OOT__Group__6__Impl_in_rule__OOT__Group__65382);
            rule__OOT__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OOT__Group__6"


    // $ANTLR start "rule__OOT__Group__6__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2641:1: rule__OOT__Group__6__Impl : ( '}' ) ;
    public final void rule__OOT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2645:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2646:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2646:1: ( '}' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2647:1: '}'
            {
             before(grammarAccess.getOOTAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__OOT__Group__6__Impl5410); 
             after(grammarAccess.getOOTAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OOT__Group__6__Impl"


    // $ANTLR start "rule__LOT__Group__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2674:1: rule__LOT__Group__0 : rule__LOT__Group__0__Impl rule__LOT__Group__1 ;
    public final void rule__LOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2678:1: ( rule__LOT__Group__0__Impl rule__LOT__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2679:2: rule__LOT__Group__0__Impl rule__LOT__Group__1
            {
            pushFollow(FOLLOW_rule__LOT__Group__0__Impl_in_rule__LOT__Group__05455);
            rule__LOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__1_in_rule__LOT__Group__05458);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2686:1: rule__LOT__Group__0__Impl : ( ( rule__LOT__AnnotationAssignment_0 )? ) ;
    public final void rule__LOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2690:1: ( ( ( rule__LOT__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2691:1: ( ( rule__LOT__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2691:1: ( ( rule__LOT__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2692:1: ( rule__LOT__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getLOTAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2693:1: ( rule__LOT__AnnotationAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=36 && LA30_0<=38)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2693:2: rule__LOT__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__LOT__AnnotationAssignment_0_in_rule__LOT__Group__0__Impl5485);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2703:1: rule__LOT__Group__1 : rule__LOT__Group__1__Impl rule__LOT__Group__2 ;
    public final void rule__LOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2707:1: ( rule__LOT__Group__1__Impl rule__LOT__Group__2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2708:2: rule__LOT__Group__1__Impl rule__LOT__Group__2
            {
            pushFollow(FOLLOW_rule__LOT__Group__1__Impl_in_rule__LOT__Group__15516);
            rule__LOT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__2_in_rule__LOT__Group__15519);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2715:1: rule__LOT__Group__1__Impl : ( 'LOT' ) ;
    public final void rule__LOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2719:1: ( ( 'LOT' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2720:1: ( 'LOT' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2720:1: ( 'LOT' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2721:1: 'LOT'
            {
             before(grammarAccess.getLOTAccess().getLOTKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__LOT__Group__1__Impl5547); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2734:1: rule__LOT__Group__2 : rule__LOT__Group__2__Impl rule__LOT__Group__3 ;
    public final void rule__LOT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2738:1: ( rule__LOT__Group__2__Impl rule__LOT__Group__3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2739:2: rule__LOT__Group__2__Impl rule__LOT__Group__3
            {
            pushFollow(FOLLOW_rule__LOT__Group__2__Impl_in_rule__LOT__Group__25578);
            rule__LOT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__3_in_rule__LOT__Group__25581);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2746:1: rule__LOT__Group__2__Impl : ( ( rule__LOT__NameAssignment_2 ) ) ;
    public final void rule__LOT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2750:1: ( ( ( rule__LOT__NameAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2751:1: ( ( rule__LOT__NameAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2751:1: ( ( rule__LOT__NameAssignment_2 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2752:1: ( rule__LOT__NameAssignment_2 )
            {
             before(grammarAccess.getLOTAccess().getNameAssignment_2()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2753:1: ( rule__LOT__NameAssignment_2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2753:2: rule__LOT__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__LOT__NameAssignment_2_in_rule__LOT__Group__2__Impl5608);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2763:1: rule__LOT__Group__3 : rule__LOT__Group__3__Impl rule__LOT__Group__4 ;
    public final void rule__LOT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2767:1: ( rule__LOT__Group__3__Impl rule__LOT__Group__4 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2768:2: rule__LOT__Group__3__Impl rule__LOT__Group__4
            {
            pushFollow(FOLLOW_rule__LOT__Group__3__Impl_in_rule__LOT__Group__35638);
            rule__LOT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__4_in_rule__LOT__Group__35641);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2775:1: rule__LOT__Group__3__Impl : ( '{' ) ;
    public final void rule__LOT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2779:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2780:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2780:1: ( '{' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2781:1: '{'
            {
             before(grammarAccess.getLOTAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__LOT__Group__3__Impl5669); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2794:1: rule__LOT__Group__4 : rule__LOT__Group__4__Impl rule__LOT__Group__5 ;
    public final void rule__LOT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2798:1: ( rule__LOT__Group__4__Impl rule__LOT__Group__5 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2799:2: rule__LOT__Group__4__Impl rule__LOT__Group__5
            {
            pushFollow(FOLLOW_rule__LOT__Group__4__Impl_in_rule__LOT__Group__45700);
            rule__LOT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__5_in_rule__LOT__Group__45703);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2806:1: rule__LOT__Group__4__Impl : ( ( rule__LOT__AttributeAssignment_4 )* ) ;
    public final void rule__LOT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2810:1: ( ( ( rule__LOT__AttributeAssignment_4 )* ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2811:1: ( ( rule__LOT__AttributeAssignment_4 )* )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2811:1: ( ( rule__LOT__AttributeAssignment_4 )* )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2812:1: ( rule__LOT__AttributeAssignment_4 )*
            {
             before(grammarAccess.getLOTAccess().getAttributeAssignment_4()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2813:1: ( rule__LOT__AttributeAssignment_4 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==RULE_ID) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==25) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2813:2: rule__LOT__AttributeAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__LOT__AttributeAssignment_4_in_rule__LOT__Group__4__Impl5730);
            	    rule__LOT__AttributeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getLOTAccess().getAttributeAssignment_4()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2823:1: rule__LOT__Group__5 : rule__LOT__Group__5__Impl rule__LOT__Group__6 ;
    public final void rule__LOT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2827:1: ( rule__LOT__Group__5__Impl rule__LOT__Group__6 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2828:2: rule__LOT__Group__5__Impl rule__LOT__Group__6
            {
            pushFollow(FOLLOW_rule__LOT__Group__5__Impl_in_rule__LOT__Group__55761);
            rule__LOT__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__6_in_rule__LOT__Group__55764);
            rule__LOT__Group__6();

            state._fsp--;


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2835:1: rule__LOT__Group__5__Impl : ( ( rule__LOT__OperatorenAssignment_5 )* ) ;
    public final void rule__LOT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2839:1: ( ( ( rule__LOT__OperatorenAssignment_5 )* ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2840:1: ( ( rule__LOT__OperatorenAssignment_5 )* )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2840:1: ( ( rule__LOT__OperatorenAssignment_5 )* )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2841:1: ( rule__LOT__OperatorenAssignment_5 )*
            {
             before(grammarAccess.getLOTAccess().getOperatorenAssignment_5()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2842:1: ( rule__LOT__OperatorenAssignment_5 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2842:2: rule__LOT__OperatorenAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__LOT__OperatorenAssignment_5_in_rule__LOT__Group__5__Impl5791);
            	    rule__LOT__OperatorenAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getLOTAccess().getOperatorenAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__LOT__Group__6"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2852:1: rule__LOT__Group__6 : rule__LOT__Group__6__Impl ;
    public final void rule__LOT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2856:1: ( rule__LOT__Group__6__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2857:2: rule__LOT__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__LOT__Group__6__Impl_in_rule__LOT__Group__65822);
            rule__LOT__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOT__Group__6"


    // $ANTLR start "rule__LOT__Group__6__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2863:1: rule__LOT__Group__6__Impl : ( '}' ) ;
    public final void rule__LOT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2867:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2868:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2868:1: ( '}' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2869:1: '}'
            {
             before(grammarAccess.getLOTAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__LOT__Group__6__Impl5850); 
             after(grammarAccess.getLOTAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOT__Group__6__Impl"


    // $ANTLR start "rule__TOT__Group__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2896:1: rule__TOT__Group__0 : rule__TOT__Group__0__Impl rule__TOT__Group__1 ;
    public final void rule__TOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2900:1: ( rule__TOT__Group__0__Impl rule__TOT__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2901:2: rule__TOT__Group__0__Impl rule__TOT__Group__1
            {
            pushFollow(FOLLOW_rule__TOT__Group__0__Impl_in_rule__TOT__Group__05895);
            rule__TOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__1_in_rule__TOT__Group__05898);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2908:1: rule__TOT__Group__0__Impl : ( ( rule__TOT__AnnotationAssignment_0 )? ) ;
    public final void rule__TOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2912:1: ( ( ( rule__TOT__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2913:1: ( ( rule__TOT__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2913:1: ( ( rule__TOT__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2914:1: ( rule__TOT__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getTOTAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2915:1: ( rule__TOT__AnnotationAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=36 && LA33_0<=38)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2915:2: rule__TOT__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TOT__AnnotationAssignment_0_in_rule__TOT__Group__0__Impl5925);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2925:1: rule__TOT__Group__1 : rule__TOT__Group__1__Impl rule__TOT__Group__2 ;
    public final void rule__TOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2929:1: ( rule__TOT__Group__1__Impl rule__TOT__Group__2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2930:2: rule__TOT__Group__1__Impl rule__TOT__Group__2
            {
            pushFollow(FOLLOW_rule__TOT__Group__1__Impl_in_rule__TOT__Group__15956);
            rule__TOT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__2_in_rule__TOT__Group__15959);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2937:1: rule__TOT__Group__1__Impl : ( 'TOT' ) ;
    public final void rule__TOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2941:1: ( ( 'TOT' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2942:1: ( 'TOT' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2942:1: ( 'TOT' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2943:1: 'TOT'
            {
             before(grammarAccess.getTOTAccess().getTOTKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__TOT__Group__1__Impl5987); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2956:1: rule__TOT__Group__2 : rule__TOT__Group__2__Impl rule__TOT__Group__3 ;
    public final void rule__TOT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2960:1: ( rule__TOT__Group__2__Impl rule__TOT__Group__3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2961:2: rule__TOT__Group__2__Impl rule__TOT__Group__3
            {
            pushFollow(FOLLOW_rule__TOT__Group__2__Impl_in_rule__TOT__Group__26018);
            rule__TOT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__3_in_rule__TOT__Group__26021);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2968:1: rule__TOT__Group__2__Impl : ( ( rule__TOT__NameAssignment_2 ) ) ;
    public final void rule__TOT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2972:1: ( ( ( rule__TOT__NameAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2973:1: ( ( rule__TOT__NameAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2973:1: ( ( rule__TOT__NameAssignment_2 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2974:1: ( rule__TOT__NameAssignment_2 )
            {
             before(grammarAccess.getTOTAccess().getNameAssignment_2()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2975:1: ( rule__TOT__NameAssignment_2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2975:2: rule__TOT__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TOT__NameAssignment_2_in_rule__TOT__Group__2__Impl6048);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2985:1: rule__TOT__Group__3 : rule__TOT__Group__3__Impl rule__TOT__Group__4 ;
    public final void rule__TOT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2989:1: ( rule__TOT__Group__3__Impl rule__TOT__Group__4 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2990:2: rule__TOT__Group__3__Impl rule__TOT__Group__4
            {
            pushFollow(FOLLOW_rule__TOT__Group__3__Impl_in_rule__TOT__Group__36078);
            rule__TOT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__4_in_rule__TOT__Group__36081);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:2997:1: rule__TOT__Group__3__Impl : ( '{' ) ;
    public final void rule__TOT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3001:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3002:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3002:1: ( '{' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3003:1: '{'
            {
             before(grammarAccess.getTOTAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__TOT__Group__3__Impl6109); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3016:1: rule__TOT__Group__4 : rule__TOT__Group__4__Impl rule__TOT__Group__5 ;
    public final void rule__TOT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3020:1: ( rule__TOT__Group__4__Impl rule__TOT__Group__5 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3021:2: rule__TOT__Group__4__Impl rule__TOT__Group__5
            {
            pushFollow(FOLLOW_rule__TOT__Group__4__Impl_in_rule__TOT__Group__46140);
            rule__TOT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__5_in_rule__TOT__Group__46143);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3028:1: rule__TOT__Group__4__Impl : ( ( rule__TOT__AttributeAssignment_4 )* ) ;
    public final void rule__TOT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3032:1: ( ( ( rule__TOT__AttributeAssignment_4 )* ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3033:1: ( ( rule__TOT__AttributeAssignment_4 )* )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3033:1: ( ( rule__TOT__AttributeAssignment_4 )* )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3034:1: ( rule__TOT__AttributeAssignment_4 )*
            {
             before(grammarAccess.getTOTAccess().getAttributeAssignment_4()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3035:1: ( rule__TOT__AttributeAssignment_4 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==RULE_ID) ) {
                        alt34=1;
                    }


                }
                else if ( (LA34_0==25) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3035:2: rule__TOT__AttributeAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__TOT__AttributeAssignment_4_in_rule__TOT__Group__4__Impl6170);
            	    rule__TOT__AttributeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getTOTAccess().getAttributeAssignment_4()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3045:1: rule__TOT__Group__5 : rule__TOT__Group__5__Impl rule__TOT__Group__6 ;
    public final void rule__TOT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3049:1: ( rule__TOT__Group__5__Impl rule__TOT__Group__6 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3050:2: rule__TOT__Group__5__Impl rule__TOT__Group__6
            {
            pushFollow(FOLLOW_rule__TOT__Group__5__Impl_in_rule__TOT__Group__56201);
            rule__TOT__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__6_in_rule__TOT__Group__56204);
            rule__TOT__Group__6();

            state._fsp--;


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3057:1: rule__TOT__Group__5__Impl : ( ( rule__TOT__OperatorenAssignment_5 )* ) ;
    public final void rule__TOT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3061:1: ( ( ( rule__TOT__OperatorenAssignment_5 )* ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3062:1: ( ( rule__TOT__OperatorenAssignment_5 )* )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3062:1: ( ( rule__TOT__OperatorenAssignment_5 )* )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3063:1: ( rule__TOT__OperatorenAssignment_5 )*
            {
             before(grammarAccess.getTOTAccess().getOperatorenAssignment_5()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3064:1: ( rule__TOT__OperatorenAssignment_5 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3064:2: rule__TOT__OperatorenAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__TOT__OperatorenAssignment_5_in_rule__TOT__Group__5__Impl6231);
            	    rule__TOT__OperatorenAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getTOTAccess().getOperatorenAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__TOT__Group__6"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3074:1: rule__TOT__Group__6 : rule__TOT__Group__6__Impl ;
    public final void rule__TOT__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3078:1: ( rule__TOT__Group__6__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3079:2: rule__TOT__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__TOT__Group__6__Impl_in_rule__TOT__Group__66262);
            rule__TOT__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TOT__Group__6"


    // $ANTLR start "rule__TOT__Group__6__Impl"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3085:1: rule__TOT__Group__6__Impl : ( '}' ) ;
    public final void rule__TOT__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3089:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3090:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3090:1: ( '}' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3091:1: '}'
            {
             before(grammarAccess.getTOTAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__TOT__Group__6__Impl6290); 
             after(grammarAccess.getTOTAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TOT__Group__6__Impl"


    // $ANTLR start "rule__Interacts_with__Group__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3118:1: rule__Interacts_with__Group__0 : rule__Interacts_with__Group__0__Impl rule__Interacts_with__Group__1 ;
    public final void rule__Interacts_with__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3122:1: ( rule__Interacts_with__Group__0__Impl rule__Interacts_with__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3123:2: rule__Interacts_with__Group__0__Impl rule__Interacts_with__Group__1
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__0__Impl_in_rule__Interacts_with__Group__06335);
            rule__Interacts_with__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__1_in_rule__Interacts_with__Group__06338);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3130:1: rule__Interacts_with__Group__0__Impl : ( ( rule__Interacts_with__AnnotationAssignment_0 )? ) ;
    public final void rule__Interacts_with__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3134:1: ( ( ( rule__Interacts_with__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3135:1: ( ( rule__Interacts_with__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3135:1: ( ( rule__Interacts_with__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3136:1: ( rule__Interacts_with__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getInteracts_withAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3137:1: ( rule__Interacts_with__AnnotationAssignment_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=36 && LA36_0<=38)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3137:2: rule__Interacts_with__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Interacts_with__AnnotationAssignment_0_in_rule__Interacts_with__Group__0__Impl6365);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3147:1: rule__Interacts_with__Group__1 : rule__Interacts_with__Group__1__Impl rule__Interacts_with__Group__2 ;
    public final void rule__Interacts_with__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3151:1: ( rule__Interacts_with__Group__1__Impl rule__Interacts_with__Group__2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3152:2: rule__Interacts_with__Group__1__Impl rule__Interacts_with__Group__2
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__1__Impl_in_rule__Interacts_with__Group__16396);
            rule__Interacts_with__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__2_in_rule__Interacts_with__Group__16399);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3159:1: rule__Interacts_with__Group__1__Impl : ( ( 'interacts_with:' )? ) ;
    public final void rule__Interacts_with__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3163:1: ( ( ( 'interacts_with:' )? ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3164:1: ( ( 'interacts_with:' )? )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3164:1: ( ( 'interacts_with:' )? )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3165:1: ( 'interacts_with:' )?
            {
             before(grammarAccess.getInteracts_withAccess().getInteracts_withKeyword_1()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3166:1: ( 'interacts_with:' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3167:2: 'interacts_with:'
                    {
                    match(input,33,FOLLOW_33_in_rule__Interacts_with__Group__1__Impl6428); 

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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3178:1: rule__Interacts_with__Group__2 : rule__Interacts_with__Group__2__Impl rule__Interacts_with__Group__3 ;
    public final void rule__Interacts_with__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3182:1: ( rule__Interacts_with__Group__2__Impl rule__Interacts_with__Group__3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3183:2: rule__Interacts_with__Group__2__Impl rule__Interacts_with__Group__3
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__2__Impl_in_rule__Interacts_with__Group__26461);
            rule__Interacts_with__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__3_in_rule__Interacts_with__Group__26464);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3190:1: rule__Interacts_with__Group__2__Impl : ( ( rule__Interacts_with__Objekttyp1Assignment_2 ) ) ;
    public final void rule__Interacts_with__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3194:1: ( ( ( rule__Interacts_with__Objekttyp1Assignment_2 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3195:1: ( ( rule__Interacts_with__Objekttyp1Assignment_2 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3195:1: ( ( rule__Interacts_with__Objekttyp1Assignment_2 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3196:1: ( rule__Interacts_with__Objekttyp1Assignment_2 )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp1Assignment_2()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3197:1: ( rule__Interacts_with__Objekttyp1Assignment_2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3197:2: rule__Interacts_with__Objekttyp1Assignment_2
            {
            pushFollow(FOLLOW_rule__Interacts_with__Objekttyp1Assignment_2_in_rule__Interacts_with__Group__2__Impl6491);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3207:1: rule__Interacts_with__Group__3 : rule__Interacts_with__Group__3__Impl rule__Interacts_with__Group__4 ;
    public final void rule__Interacts_with__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3211:1: ( rule__Interacts_with__Group__3__Impl rule__Interacts_with__Group__4 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3212:2: rule__Interacts_with__Group__3__Impl rule__Interacts_with__Group__4
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__3__Impl_in_rule__Interacts_with__Group__36521);
            rule__Interacts_with__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__4_in_rule__Interacts_with__Group__36524);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3219:1: rule__Interacts_with__Group__3__Impl : ( ( rule__Interacts_with__KardinalitaetAssignment_3 ) ) ;
    public final void rule__Interacts_with__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3223:1: ( ( ( rule__Interacts_with__KardinalitaetAssignment_3 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3224:1: ( ( rule__Interacts_with__KardinalitaetAssignment_3 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3224:1: ( ( rule__Interacts_with__KardinalitaetAssignment_3 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3225:1: ( rule__Interacts_with__KardinalitaetAssignment_3 )
            {
             before(grammarAccess.getInteracts_withAccess().getKardinalitaetAssignment_3()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3226:1: ( rule__Interacts_with__KardinalitaetAssignment_3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3226:2: rule__Interacts_with__KardinalitaetAssignment_3
            {
            pushFollow(FOLLOW_rule__Interacts_with__KardinalitaetAssignment_3_in_rule__Interacts_with__Group__3__Impl6551);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3236:1: rule__Interacts_with__Group__4 : rule__Interacts_with__Group__4__Impl ;
    public final void rule__Interacts_with__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3240:1: ( rule__Interacts_with__Group__4__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3241:2: rule__Interacts_with__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__4__Impl_in_rule__Interacts_with__Group__46581);
            rule__Interacts_with__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3247:1: rule__Interacts_with__Group__4__Impl : ( ( rule__Interacts_with__Objekttyp2Assignment_4 ) ) ;
    public final void rule__Interacts_with__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3251:1: ( ( ( rule__Interacts_with__Objekttyp2Assignment_4 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3252:1: ( ( rule__Interacts_with__Objekttyp2Assignment_4 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3252:1: ( ( rule__Interacts_with__Objekttyp2Assignment_4 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3253:1: ( rule__Interacts_with__Objekttyp2Assignment_4 )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp2Assignment_4()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3254:1: ( rule__Interacts_with__Objekttyp2Assignment_4 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3254:2: rule__Interacts_with__Objekttyp2Assignment_4
            {
            pushFollow(FOLLOW_rule__Interacts_with__Objekttyp2Assignment_4_in_rule__Interacts_with__Group__4__Impl6608);
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


    // $ANTLR start "rule__Is_a__Group__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3274:1: rule__Is_a__Group__0 : rule__Is_a__Group__0__Impl rule__Is_a__Group__1 ;
    public final void rule__Is_a__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3278:1: ( rule__Is_a__Group__0__Impl rule__Is_a__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3279:2: rule__Is_a__Group__0__Impl rule__Is_a__Group__1
            {
            pushFollow(FOLLOW_rule__Is_a__Group__0__Impl_in_rule__Is_a__Group__06648);
            rule__Is_a__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__1_in_rule__Is_a__Group__06651);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3286:1: rule__Is_a__Group__0__Impl : ( ( rule__Is_a__AnnotationAssignment_0 )? ) ;
    public final void rule__Is_a__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3290:1: ( ( ( rule__Is_a__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3291:1: ( ( rule__Is_a__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3291:1: ( ( rule__Is_a__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3292:1: ( rule__Is_a__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getIs_aAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3293:1: ( rule__Is_a__AnnotationAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=36 && LA38_0<=38)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3293:2: rule__Is_a__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Is_a__AnnotationAssignment_0_in_rule__Is_a__Group__0__Impl6678);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3303:1: rule__Is_a__Group__1 : rule__Is_a__Group__1__Impl rule__Is_a__Group__2 ;
    public final void rule__Is_a__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3307:1: ( rule__Is_a__Group__1__Impl rule__Is_a__Group__2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3308:2: rule__Is_a__Group__1__Impl rule__Is_a__Group__2
            {
            pushFollow(FOLLOW_rule__Is_a__Group__1__Impl_in_rule__Is_a__Group__16709);
            rule__Is_a__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__2_in_rule__Is_a__Group__16712);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3315:1: rule__Is_a__Group__1__Impl : ( 'is_a:' ) ;
    public final void rule__Is_a__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3319:1: ( ( 'is_a:' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3320:1: ( 'is_a:' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3320:1: ( 'is_a:' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3321:1: 'is_a:'
            {
             before(grammarAccess.getIs_aAccess().getIs_aKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__Is_a__Group__1__Impl6740); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3334:1: rule__Is_a__Group__2 : rule__Is_a__Group__2__Impl rule__Is_a__Group__3 ;
    public final void rule__Is_a__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3338:1: ( rule__Is_a__Group__2__Impl rule__Is_a__Group__3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3339:2: rule__Is_a__Group__2__Impl rule__Is_a__Group__3
            {
            pushFollow(FOLLOW_rule__Is_a__Group__2__Impl_in_rule__Is_a__Group__26771);
            rule__Is_a__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__3_in_rule__Is_a__Group__26774);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3346:1: rule__Is_a__Group__2__Impl : ( ( rule__Is_a__Objekttyp1Assignment_2 ) ) ;
    public final void rule__Is_a__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3350:1: ( ( ( rule__Is_a__Objekttyp1Assignment_2 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3351:1: ( ( rule__Is_a__Objekttyp1Assignment_2 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3351:1: ( ( rule__Is_a__Objekttyp1Assignment_2 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3352:1: ( rule__Is_a__Objekttyp1Assignment_2 )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp1Assignment_2()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3353:1: ( rule__Is_a__Objekttyp1Assignment_2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3353:2: rule__Is_a__Objekttyp1Assignment_2
            {
            pushFollow(FOLLOW_rule__Is_a__Objekttyp1Assignment_2_in_rule__Is_a__Group__2__Impl6801);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3363:1: rule__Is_a__Group__3 : rule__Is_a__Group__3__Impl rule__Is_a__Group__4 ;
    public final void rule__Is_a__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3367:1: ( rule__Is_a__Group__3__Impl rule__Is_a__Group__4 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3368:2: rule__Is_a__Group__3__Impl rule__Is_a__Group__4
            {
            pushFollow(FOLLOW_rule__Is_a__Group__3__Impl_in_rule__Is_a__Group__36831);
            rule__Is_a__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__4_in_rule__Is_a__Group__36834);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3375:1: rule__Is_a__Group__3__Impl : ( ( rule__Is_a__KardinalitaetAssignment_3 ) ) ;
    public final void rule__Is_a__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3379:1: ( ( ( rule__Is_a__KardinalitaetAssignment_3 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3380:1: ( ( rule__Is_a__KardinalitaetAssignment_3 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3380:1: ( ( rule__Is_a__KardinalitaetAssignment_3 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3381:1: ( rule__Is_a__KardinalitaetAssignment_3 )
            {
             before(grammarAccess.getIs_aAccess().getKardinalitaetAssignment_3()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3382:1: ( rule__Is_a__KardinalitaetAssignment_3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3382:2: rule__Is_a__KardinalitaetAssignment_3
            {
            pushFollow(FOLLOW_rule__Is_a__KardinalitaetAssignment_3_in_rule__Is_a__Group__3__Impl6861);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3392:1: rule__Is_a__Group__4 : rule__Is_a__Group__4__Impl ;
    public final void rule__Is_a__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3396:1: ( rule__Is_a__Group__4__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3397:2: rule__Is_a__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Is_a__Group__4__Impl_in_rule__Is_a__Group__46891);
            rule__Is_a__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3403:1: rule__Is_a__Group__4__Impl : ( ( rule__Is_a__Objekttyp2Assignment_4 ) ) ;
    public final void rule__Is_a__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3407:1: ( ( ( rule__Is_a__Objekttyp2Assignment_4 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3408:1: ( ( rule__Is_a__Objekttyp2Assignment_4 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3408:1: ( ( rule__Is_a__Objekttyp2Assignment_4 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3409:1: ( rule__Is_a__Objekttyp2Assignment_4 )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp2Assignment_4()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3410:1: ( rule__Is_a__Objekttyp2Assignment_4 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3410:2: rule__Is_a__Objekttyp2Assignment_4
            {
            pushFollow(FOLLOW_rule__Is_a__Objekttyp2Assignment_4_in_rule__Is_a__Group__4__Impl6918);
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


    // $ANTLR start "rule__Is_part_of__Group__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3430:1: rule__Is_part_of__Group__0 : rule__Is_part_of__Group__0__Impl rule__Is_part_of__Group__1 ;
    public final void rule__Is_part_of__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3434:1: ( rule__Is_part_of__Group__0__Impl rule__Is_part_of__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3435:2: rule__Is_part_of__Group__0__Impl rule__Is_part_of__Group__1
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__0__Impl_in_rule__Is_part_of__Group__06958);
            rule__Is_part_of__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__1_in_rule__Is_part_of__Group__06961);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3442:1: rule__Is_part_of__Group__0__Impl : ( ( rule__Is_part_of__AnnotationAssignment_0 )? ) ;
    public final void rule__Is_part_of__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3446:1: ( ( ( rule__Is_part_of__AnnotationAssignment_0 )? ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3447:1: ( ( rule__Is_part_of__AnnotationAssignment_0 )? )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3447:1: ( ( rule__Is_part_of__AnnotationAssignment_0 )? )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3448:1: ( rule__Is_part_of__AnnotationAssignment_0 )?
            {
             before(grammarAccess.getIs_part_ofAccess().getAnnotationAssignment_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3449:1: ( rule__Is_part_of__AnnotationAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=36 && LA39_0<=38)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3449:2: rule__Is_part_of__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Is_part_of__AnnotationAssignment_0_in_rule__Is_part_of__Group__0__Impl6988);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3459:1: rule__Is_part_of__Group__1 : rule__Is_part_of__Group__1__Impl rule__Is_part_of__Group__2 ;
    public final void rule__Is_part_of__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3463:1: ( rule__Is_part_of__Group__1__Impl rule__Is_part_of__Group__2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3464:2: rule__Is_part_of__Group__1__Impl rule__Is_part_of__Group__2
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__1__Impl_in_rule__Is_part_of__Group__17019);
            rule__Is_part_of__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__2_in_rule__Is_part_of__Group__17022);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3471:1: rule__Is_part_of__Group__1__Impl : ( 'is_part_of:' ) ;
    public final void rule__Is_part_of__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3475:1: ( ( 'is_part_of:' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3476:1: ( 'is_part_of:' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3476:1: ( 'is_part_of:' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3477:1: 'is_part_of:'
            {
             before(grammarAccess.getIs_part_ofAccess().getIs_part_ofKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__Is_part_of__Group__1__Impl7050); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3490:1: rule__Is_part_of__Group__2 : rule__Is_part_of__Group__2__Impl rule__Is_part_of__Group__3 ;
    public final void rule__Is_part_of__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3494:1: ( rule__Is_part_of__Group__2__Impl rule__Is_part_of__Group__3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3495:2: rule__Is_part_of__Group__2__Impl rule__Is_part_of__Group__3
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__2__Impl_in_rule__Is_part_of__Group__27081);
            rule__Is_part_of__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__3_in_rule__Is_part_of__Group__27084);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3502:1: rule__Is_part_of__Group__2__Impl : ( ( rule__Is_part_of__Objekttyp1Assignment_2 ) ) ;
    public final void rule__Is_part_of__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3506:1: ( ( ( rule__Is_part_of__Objekttyp1Assignment_2 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3507:1: ( ( rule__Is_part_of__Objekttyp1Assignment_2 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3507:1: ( ( rule__Is_part_of__Objekttyp1Assignment_2 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3508:1: ( rule__Is_part_of__Objekttyp1Assignment_2 )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp1Assignment_2()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3509:1: ( rule__Is_part_of__Objekttyp1Assignment_2 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3509:2: rule__Is_part_of__Objekttyp1Assignment_2
            {
            pushFollow(FOLLOW_rule__Is_part_of__Objekttyp1Assignment_2_in_rule__Is_part_of__Group__2__Impl7111);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3519:1: rule__Is_part_of__Group__3 : rule__Is_part_of__Group__3__Impl rule__Is_part_of__Group__4 ;
    public final void rule__Is_part_of__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3523:1: ( rule__Is_part_of__Group__3__Impl rule__Is_part_of__Group__4 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3524:2: rule__Is_part_of__Group__3__Impl rule__Is_part_of__Group__4
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__3__Impl_in_rule__Is_part_of__Group__37141);
            rule__Is_part_of__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__4_in_rule__Is_part_of__Group__37144);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3531:1: rule__Is_part_of__Group__3__Impl : ( ( rule__Is_part_of__KardinalitaetAssignment_3 ) ) ;
    public final void rule__Is_part_of__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3535:1: ( ( ( rule__Is_part_of__KardinalitaetAssignment_3 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3536:1: ( ( rule__Is_part_of__KardinalitaetAssignment_3 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3536:1: ( ( rule__Is_part_of__KardinalitaetAssignment_3 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3537:1: ( rule__Is_part_of__KardinalitaetAssignment_3 )
            {
             before(grammarAccess.getIs_part_ofAccess().getKardinalitaetAssignment_3()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3538:1: ( rule__Is_part_of__KardinalitaetAssignment_3 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3538:2: rule__Is_part_of__KardinalitaetAssignment_3
            {
            pushFollow(FOLLOW_rule__Is_part_of__KardinalitaetAssignment_3_in_rule__Is_part_of__Group__3__Impl7171);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3548:1: rule__Is_part_of__Group__4 : rule__Is_part_of__Group__4__Impl ;
    public final void rule__Is_part_of__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3552:1: ( rule__Is_part_of__Group__4__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3553:2: rule__Is_part_of__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__4__Impl_in_rule__Is_part_of__Group__47201);
            rule__Is_part_of__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3559:1: rule__Is_part_of__Group__4__Impl : ( ( rule__Is_part_of__Objekttyp2Assignment_4 ) ) ;
    public final void rule__Is_part_of__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3563:1: ( ( ( rule__Is_part_of__Objekttyp2Assignment_4 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3564:1: ( ( rule__Is_part_of__Objekttyp2Assignment_4 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3564:1: ( ( rule__Is_part_of__Objekttyp2Assignment_4 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3565:1: ( rule__Is_part_of__Objekttyp2Assignment_4 )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp2Assignment_4()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3566:1: ( rule__Is_part_of__Objekttyp2Assignment_4 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3566:2: rule__Is_part_of__Objekttyp2Assignment_4
            {
            pushFollow(FOLLOW_rule__Is_part_of__Objekttyp2Assignment_4_in_rule__Is_part_of__Group__4__Impl7228);
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


    // $ANTLR start "rule__Kardinalitaet01__Group__0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3586:1: rule__Kardinalitaet01__Group__0 : rule__Kardinalitaet01__Group__0__Impl rule__Kardinalitaet01__Group__1 ;
    public final void rule__Kardinalitaet01__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3590:1: ( rule__Kardinalitaet01__Group__0__Impl rule__Kardinalitaet01__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3591:2: rule__Kardinalitaet01__Group__0__Impl rule__Kardinalitaet01__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__0__Impl_in_rule__Kardinalitaet01__Group__07268);
            rule__Kardinalitaet01__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__1_in_rule__Kardinalitaet01__Group__07271);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3598:1: rule__Kardinalitaet01__Group__0__Impl : ( ( rule__Kardinalitaet01__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet01__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3602:1: ( ( ( rule__Kardinalitaet01__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3603:1: ( ( rule__Kardinalitaet01__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3603:1: ( ( rule__Kardinalitaet01__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3604:1: ( rule__Kardinalitaet01__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet01Access().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3605:1: ( rule__Kardinalitaet01__Alternatives_0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3605:2: rule__Kardinalitaet01__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Alternatives_0_in_rule__Kardinalitaet01__Group__0__Impl7298);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3615:1: rule__Kardinalitaet01__Group__1 : rule__Kardinalitaet01__Group__1__Impl ;
    public final void rule__Kardinalitaet01__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3619:1: ( rule__Kardinalitaet01__Group__1__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3620:2: rule__Kardinalitaet01__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__1__Impl_in_rule__Kardinalitaet01__Group__17328);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3626:1: rule__Kardinalitaet01__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet01__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3630:1: ( ( () ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3631:1: ( () )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3631:1: ( () )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3632:1: ()
            {
             before(grammarAccess.getKardinalitaet01Access().getKardinalitaet01Action_1()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3633:1: ()
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3635:1: 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3649:1: rule__Kardinalitaet0x__Group__0 : rule__Kardinalitaet0x__Group__0__Impl rule__Kardinalitaet0x__Group__1 ;
    public final void rule__Kardinalitaet0x__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3653:1: ( rule__Kardinalitaet0x__Group__0__Impl rule__Kardinalitaet0x__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3654:2: rule__Kardinalitaet0x__Group__0__Impl rule__Kardinalitaet0x__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__0__Impl_in_rule__Kardinalitaet0x__Group__07390);
            rule__Kardinalitaet0x__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__1_in_rule__Kardinalitaet0x__Group__07393);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3661:1: rule__Kardinalitaet0x__Group__0__Impl : ( ( rule__Kardinalitaet0x__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet0x__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3665:1: ( ( ( rule__Kardinalitaet0x__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3666:1: ( ( rule__Kardinalitaet0x__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3666:1: ( ( rule__Kardinalitaet0x__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3667:1: ( rule__Kardinalitaet0x__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet0xAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3668:1: ( rule__Kardinalitaet0x__Alternatives_0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3668:2: rule__Kardinalitaet0x__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Alternatives_0_in_rule__Kardinalitaet0x__Group__0__Impl7420);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3678:1: rule__Kardinalitaet0x__Group__1 : rule__Kardinalitaet0x__Group__1__Impl ;
    public final void rule__Kardinalitaet0x__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3682:1: ( rule__Kardinalitaet0x__Group__1__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3683:2: rule__Kardinalitaet0x__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__1__Impl_in_rule__Kardinalitaet0x__Group__17450);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3689:1: rule__Kardinalitaet0x__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet0x__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3693:1: ( ( () ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3694:1: ( () )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3694:1: ( () )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3695:1: ()
            {
             before(grammarAccess.getKardinalitaet0xAccess().getKardinalitaet0xAction_1()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3696:1: ()
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3698:1: 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3712:1: rule__Kardinalitaet11__Group__0 : rule__Kardinalitaet11__Group__0__Impl rule__Kardinalitaet11__Group__1 ;
    public final void rule__Kardinalitaet11__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3716:1: ( rule__Kardinalitaet11__Group__0__Impl rule__Kardinalitaet11__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3717:2: rule__Kardinalitaet11__Group__0__Impl rule__Kardinalitaet11__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__0__Impl_in_rule__Kardinalitaet11__Group__07512);
            rule__Kardinalitaet11__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__1_in_rule__Kardinalitaet11__Group__07515);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3724:1: rule__Kardinalitaet11__Group__0__Impl : ( ( rule__Kardinalitaet11__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet11__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3728:1: ( ( ( rule__Kardinalitaet11__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3729:1: ( ( rule__Kardinalitaet11__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3729:1: ( ( rule__Kardinalitaet11__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3730:1: ( rule__Kardinalitaet11__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet11Access().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3731:1: ( rule__Kardinalitaet11__Alternatives_0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3731:2: rule__Kardinalitaet11__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Alternatives_0_in_rule__Kardinalitaet11__Group__0__Impl7542);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3741:1: rule__Kardinalitaet11__Group__1 : rule__Kardinalitaet11__Group__1__Impl ;
    public final void rule__Kardinalitaet11__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3745:1: ( rule__Kardinalitaet11__Group__1__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3746:2: rule__Kardinalitaet11__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__1__Impl_in_rule__Kardinalitaet11__Group__17572);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3752:1: rule__Kardinalitaet11__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet11__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3756:1: ( ( () ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3757:1: ( () )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3757:1: ( () )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3758:1: ()
            {
             before(grammarAccess.getKardinalitaet11Access().getKardinalitaet11Action_1()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3759:1: ()
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3761:1: 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3775:1: rule__Kardinalitaet1x__Group__0 : rule__Kardinalitaet1x__Group__0__Impl rule__Kardinalitaet1x__Group__1 ;
    public final void rule__Kardinalitaet1x__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3779:1: ( rule__Kardinalitaet1x__Group__0__Impl rule__Kardinalitaet1x__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3780:2: rule__Kardinalitaet1x__Group__0__Impl rule__Kardinalitaet1x__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__0__Impl_in_rule__Kardinalitaet1x__Group__07634);
            rule__Kardinalitaet1x__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__1_in_rule__Kardinalitaet1x__Group__07637);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3787:1: rule__Kardinalitaet1x__Group__0__Impl : ( ( rule__Kardinalitaet1x__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet1x__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3791:1: ( ( ( rule__Kardinalitaet1x__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3792:1: ( ( rule__Kardinalitaet1x__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3792:1: ( ( rule__Kardinalitaet1x__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3793:1: ( rule__Kardinalitaet1x__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet1xAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3794:1: ( rule__Kardinalitaet1x__Alternatives_0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3794:2: rule__Kardinalitaet1x__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Alternatives_0_in_rule__Kardinalitaet1x__Group__0__Impl7664);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3804:1: rule__Kardinalitaet1x__Group__1 : rule__Kardinalitaet1x__Group__1__Impl ;
    public final void rule__Kardinalitaet1x__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3808:1: ( rule__Kardinalitaet1x__Group__1__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3809:2: rule__Kardinalitaet1x__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__1__Impl_in_rule__Kardinalitaet1x__Group__17694);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3815:1: rule__Kardinalitaet1x__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet1x__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3819:1: ( ( () ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3820:1: ( () )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3820:1: ( () )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3821:1: ()
            {
             before(grammarAccess.getKardinalitaet1xAccess().getKardinalitaet1xAction_1()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3822:1: ()
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3824:1: 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3838:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3842:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3843:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__07756);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Name__Group__1_in_rule__Name__Group__07759);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3850:1: rule__Name__Group__0__Impl : ( '@name' ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3854:1: ( ( '@name' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3855:1: ( '@name' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3855:1: ( '@name' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3856:1: '@name'
            {
             before(grammarAccess.getNameAccess().getNameKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Name__Group__0__Impl7787); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3869:1: rule__Name__Group__1 : rule__Name__Group__1__Impl ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3873:1: ( rule__Name__Group__1__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3874:2: rule__Name__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__17818);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3880:1: rule__Name__Group__1__Impl : ( ( rule__Name__NameAssignment_1 ) ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3884:1: ( ( ( rule__Name__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3885:1: ( ( rule__Name__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3885:1: ( ( rule__Name__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3886:1: ( rule__Name__NameAssignment_1 )
            {
             before(grammarAccess.getNameAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3887:1: ( rule__Name__NameAssignment_1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3887:2: rule__Name__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Name__NameAssignment_1_in_rule__Name__Group__1__Impl7845);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3901:1: rule__Merge__Group__0 : rule__Merge__Group__0__Impl rule__Merge__Group__1 ;
    public final void rule__Merge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3905:1: ( rule__Merge__Group__0__Impl rule__Merge__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3906:2: rule__Merge__Group__0__Impl rule__Merge__Group__1
            {
            pushFollow(FOLLOW_rule__Merge__Group__0__Impl_in_rule__Merge__Group__07879);
            rule__Merge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Merge__Group__1_in_rule__Merge__Group__07882);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3913:1: rule__Merge__Group__0__Impl : ( '@merge' ) ;
    public final void rule__Merge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3917:1: ( ( '@merge' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3918:1: ( '@merge' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3918:1: ( '@merge' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3919:1: '@merge'
            {
             before(grammarAccess.getMergeAccess().getMergeKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Merge__Group__0__Impl7910); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3932:1: rule__Merge__Group__1 : rule__Merge__Group__1__Impl ;
    public final void rule__Merge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3936:1: ( rule__Merge__Group__1__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3937:2: rule__Merge__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Merge__Group__1__Impl_in_rule__Merge__Group__17941);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3943:1: rule__Merge__Group__1__Impl : ( ( rule__Merge__NameAssignment_1 ) ) ;
    public final void rule__Merge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3947:1: ( ( ( rule__Merge__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3948:1: ( ( rule__Merge__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3948:1: ( ( rule__Merge__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3949:1: ( rule__Merge__NameAssignment_1 )
            {
             before(grammarAccess.getMergeAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3950:1: ( rule__Merge__NameAssignment_1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3950:2: rule__Merge__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Merge__NameAssignment_1_in_rule__Merge__Group__1__Impl7968);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3964:1: rule__Ignore__Group__0 : rule__Ignore__Group__0__Impl rule__Ignore__Group__1 ;
    public final void rule__Ignore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3968:1: ( rule__Ignore__Group__0__Impl rule__Ignore__Group__1 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3969:2: rule__Ignore__Group__0__Impl rule__Ignore__Group__1
            {
            pushFollow(FOLLOW_rule__Ignore__Group__0__Impl_in_rule__Ignore__Group__08002);
            rule__Ignore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ignore__Group__1_in_rule__Ignore__Group__08005);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3976:1: rule__Ignore__Group__0__Impl : ( '@ignore' ) ;
    public final void rule__Ignore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3980:1: ( ( '@ignore' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3981:1: ( '@ignore' )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3981:1: ( '@ignore' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3982:1: '@ignore'
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Ignore__Group__0__Impl8033); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3995:1: rule__Ignore__Group__1 : rule__Ignore__Group__1__Impl ;
    public final void rule__Ignore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:3999:1: ( rule__Ignore__Group__1__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4000:2: rule__Ignore__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Ignore__Group__1__Impl_in_rule__Ignore__Group__18064);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4006:1: rule__Ignore__Group__1__Impl : ( () ) ;
    public final void rule__Ignore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4010:1: ( ( () ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4011:1: ( () )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4011:1: ( () )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4012:1: ()
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreAction_1()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4013:1: ()
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4015:1: 
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


    // $ANTLR start "rule__AwS__UnorderedGroup_3"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4030:1: rule__AwS__UnorderedGroup_3 : rule__AwS__UnorderedGroup_3__0 {...}?;
    public final void rule__AwS__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAwSAccess().getUnorderedGroup_3());
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4035:1: ( rule__AwS__UnorderedGroup_3__0 {...}?)
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4036:2: rule__AwS__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__AwS__UnorderedGroup_3__0_in_rule__AwS__UnorderedGroup_38127);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4047:1: rule__AwS__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__AwS__KosAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__AwS__VosAssignment_3_1 ) ) ) ) ) ;
    public final void rule__AwS__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4052:1: ( ( ({...}? => ( ( ( rule__AwS__KosAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__AwS__VosAssignment_3_1 ) ) ) ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4053:3: ( ({...}? => ( ( ( rule__AwS__KosAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__AwS__VosAssignment_3_1 ) ) ) ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4053:3: ( ({...}? => ( ( ( rule__AwS__KosAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__AwS__VosAssignment_3_1 ) ) ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 ==RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) ) {
                int LA40_2 = input.LA(2);

                if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) {
                    alt40=1;
                }
                else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) ) {
                    alt40=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
            }
            else if ( LA40_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4055:4: ({...}? => ( ( ( rule__AwS__KosAssignment_3_0 ) ) ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4055:4: ({...}? => ( ( ( rule__AwS__KosAssignment_3_0 ) ) ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4056:5: {...}? => ( ( ( rule__AwS__KosAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__AwS__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4056:100: ( ( ( rule__AwS__KosAssignment_3_0 ) ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4057:6: ( ( rule__AwS__KosAssignment_3_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4063:6: ( ( rule__AwS__KosAssignment_3_0 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4065:7: ( rule__AwS__KosAssignment_3_0 )
                    {
                     before(grammarAccess.getAwSAccess().getKosAssignment_3_0()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4066:7: ( rule__AwS__KosAssignment_3_0 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4066:8: rule__AwS__KosAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__AwS__KosAssignment_3_0_in_rule__AwS__UnorderedGroup_3__Impl8216);
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
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4072:4: ({...}? => ( ( ( rule__AwS__VosAssignment_3_1 ) ) ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4072:4: ({...}? => ( ( ( rule__AwS__VosAssignment_3_1 ) ) ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4073:5: {...}? => ( ( ( rule__AwS__VosAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__AwS__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4073:100: ( ( ( rule__AwS__VosAssignment_3_1 ) ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4074:6: ( ( rule__AwS__VosAssignment_3_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4080:6: ( ( rule__AwS__VosAssignment_3_1 ) )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4082:7: ( rule__AwS__VosAssignment_3_1 )
                    {
                     before(grammarAccess.getAwSAccess().getVosAssignment_3_1()); 
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4083:7: ( rule__AwS__VosAssignment_3_1 )
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4083:8: rule__AwS__VosAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__AwS__VosAssignment_3_1_in_rule__AwS__UnorderedGroup_3__Impl8307);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4098:1: rule__AwS__UnorderedGroup_3__0 : rule__AwS__UnorderedGroup_3__Impl ( rule__AwS__UnorderedGroup_3__1 )? ;
    public final void rule__AwS__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4102:1: ( rule__AwS__UnorderedGroup_3__Impl ( rule__AwS__UnorderedGroup_3__1 )? )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4103:2: rule__AwS__UnorderedGroup_3__Impl ( rule__AwS__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__AwS__UnorderedGroup_3__Impl_in_rule__AwS__UnorderedGroup_3__08366);
            rule__AwS__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4104:2: ( rule__AwS__UnorderedGroup_3__1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 ==RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) ) {
                alt41=1;
            }
            else if ( LA41_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4104:2: rule__AwS__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__AwS__UnorderedGroup_3__1_in_rule__AwS__UnorderedGroup_3__08369);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4111:1: rule__AwS__UnorderedGroup_3__1 : rule__AwS__UnorderedGroup_3__Impl ;
    public final void rule__AwS__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4115:1: ( rule__AwS__UnorderedGroup_3__Impl )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4116:2: rule__AwS__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__AwS__UnorderedGroup_3__Impl_in_rule__AwS__UnorderedGroup_3__18394);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4127:1: rule__AwS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AwS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4131:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4132:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4132:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4133:1: RULE_ID
            {
             before(grammarAccess.getAwSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AwS__NameAssignment_18426); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4142:1: rule__AwS__VersionAssignment_2_1 : ( RULE_VERSION ) ;
    public final void rule__AwS__VersionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4146:1: ( ( RULE_VERSION ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4147:1: ( RULE_VERSION )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4147:1: ( RULE_VERSION )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4148:1: RULE_VERSION
            {
             before(grammarAccess.getAwSAccess().getVersionVERSIONTerminalRuleCall_2_1_0()); 
            match(input,RULE_VERSION,FOLLOW_RULE_VERSION_in_rule__AwS__VersionAssignment_2_18457); 
             after(grammarAccess.getAwSAccess().getVersionVERSIONTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4157:1: rule__AwS__KosAssignment_3_0 : ( ruleKOS ) ;
    public final void rule__AwS__KosAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4161:1: ( ( ruleKOS ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4162:1: ( ruleKOS )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4162:1: ( ruleKOS )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4163:1: ruleKOS
            {
             before(grammarAccess.getAwSAccess().getKosKOSParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleKOS_in_rule__AwS__KosAssignment_3_08488);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4172:1: rule__AwS__VosAssignment_3_1 : ( ruleVOS ) ;
    public final void rule__AwS__VosAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4176:1: ( ( ruleVOS ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4177:1: ( ruleVOS )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4177:1: ( ruleVOS )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4178:1: ruleVOS
            {
             before(grammarAccess.getAwSAccess().getVosVOSParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleVOS_in_rule__AwS__VosAssignment_3_18519);
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


    // $ANTLR start "rule__KOS__NameAssignment_0_0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4187:1: rule__KOS__NameAssignment_0_0 : ( ( 'KOS' ) ) ;
    public final void rule__KOS__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4191:1: ( ( ( 'KOS' ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4192:1: ( ( 'KOS' ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4192:1: ( ( 'KOS' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4193:1: ( 'KOS' )
            {
             before(grammarAccess.getKOSAccess().getNameKOSKeyword_0_0_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4194:1: ( 'KOS' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4195:1: 'KOS'
            {
             before(grammarAccess.getKOSAccess().getNameKOSKeyword_0_0_0()); 
            match(input,39,FOLLOW_39_in_rule__KOS__NameAssignment_0_08555); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4210:1: rule__KOS__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__KOS__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4214:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4215:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4215:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4216:1: RULE_ID
            {
             before(grammarAccess.getKOSAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KOS__NameAssignment_0_18594); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4225:1: rule__KOS__ObjekttypenAssignment_2_0 : ( ruleKOT ) ;
    public final void rule__KOS__ObjekttypenAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4229:1: ( ( ruleKOT ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4230:1: ( ruleKOT )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4230:1: ( ruleKOT )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4231:1: ruleKOT
            {
             before(grammarAccess.getKOSAccess().getObjekttypenKOTParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleKOT_in_rule__KOS__ObjekttypenAssignment_2_08625);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4240:1: rule__KOS__BeziehungenAssignment_2_1 : ( ruleBeziehung ) ;
    public final void rule__KOS__BeziehungenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4244:1: ( ( ruleBeziehung ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4245:1: ( ruleBeziehung )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4245:1: ( ruleBeziehung )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4246:1: ruleBeziehung
            {
             before(grammarAccess.getKOSAccess().getBeziehungenBeziehungParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBeziehung_in_rule__KOS__BeziehungenAssignment_2_18656);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4255:1: rule__KOS__GliederungAssignment_2_2 : ( ruleKOS ) ;
    public final void rule__KOS__GliederungAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4259:1: ( ( ruleKOS ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4260:1: ( ruleKOS )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4260:1: ( ruleKOS )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4261:1: ruleKOS
            {
             before(grammarAccess.getKOSAccess().getGliederungKOSParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleKOS_in_rule__KOS__GliederungAssignment_2_28687);
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


    // $ANTLR start "rule__VOS__NameAssignment_0_0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4270:1: rule__VOS__NameAssignment_0_0 : ( ( 'VOS' ) ) ;
    public final void rule__VOS__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4274:1: ( ( ( 'VOS' ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4275:1: ( ( 'VOS' ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4275:1: ( ( 'VOS' ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4276:1: ( 'VOS' )
            {
             before(grammarAccess.getVOSAccess().getNameVOSKeyword_0_0_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4277:1: ( 'VOS' )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4278:1: 'VOS'
            {
             before(grammarAccess.getVOSAccess().getNameVOSKeyword_0_0_0()); 
            match(input,40,FOLLOW_40_in_rule__VOS__NameAssignment_0_08723); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4293:1: rule__VOS__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__VOS__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4297:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4298:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4298:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4299:1: RULE_ID
            {
             before(grammarAccess.getVOSAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VOS__NameAssignment_0_18762); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4308:1: rule__VOS__ObjekttypenAssignment_2_0 : ( ruleVOT ) ;
    public final void rule__VOS__ObjekttypenAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4312:1: ( ( ruleVOT ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4313:1: ( ruleVOT )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4313:1: ( ruleVOT )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4314:1: ruleVOT
            {
             before(grammarAccess.getVOSAccess().getObjekttypenVOTParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleVOT_in_rule__VOS__ObjekttypenAssignment_2_08793);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4323:1: rule__VOS__BeziehungenAssignment_2_1 : ( ruleInteracts_with ) ;
    public final void rule__VOS__BeziehungenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4327:1: ( ( ruleInteracts_with ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4328:1: ( ruleInteracts_with )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4328:1: ( ruleInteracts_with )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4329:1: ruleInteracts_with
            {
             before(grammarAccess.getVOSAccess().getBeziehungenInteracts_withParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleInteracts_with_in_rule__VOS__BeziehungenAssignment_2_18824);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4338:1: rule__VOS__GliederungAssignment_2_2 : ( ruleVOS ) ;
    public final void rule__VOS__GliederungAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4342:1: ( ( ruleVOS ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4343:1: ( ruleVOS )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4343:1: ( ruleVOS )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4344:1: ruleVOS
            {
             before(grammarAccess.getVOSAccess().getGliederungVOSParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleVOS_in_rule__VOS__GliederungAssignment_2_28855);
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


    // $ANTLR start "rule__Attribut__ObjekttypAssignment_0_0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4353:1: rule__Attribut__ObjekttypAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribut__ObjekttypAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4357:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4358:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4358:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4359:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributAccess().getObjekttypObjekttypCrossReference_0_0_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4360:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4361:1: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getObjekttypObjekttypIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribut__ObjekttypAssignment_0_08890); 
             after(grammarAccess.getAttributAccess().getObjekttypObjekttypIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getAttributAccess().getObjekttypObjekttypCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__ObjekttypAssignment_0_0"


    // $ANTLR start "rule__Attribut__DatentypAssignment_0_1_1"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4372:1: rule__Attribut__DatentypAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__Attribut__DatentypAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4376:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4377:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4377:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4378:1: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getDatentypIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribut__DatentypAssignment_0_1_18925); 
             after(grammarAccess.getAttributAccess().getDatentypIDTerminalRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__DatentypAssignment_0_1_1"


    // $ANTLR start "rule__Attribut__NameAssignment_1"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4387:1: rule__Attribut__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4391:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4392:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4392:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4393:1: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribut__NameAssignment_18956); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4402:1: rule__Operator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Operator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4406:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4407:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4407:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4408:1: RULE_ID
            {
             before(grammarAccess.getOperatorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operator__NameAssignment_08987); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4417:1: rule__Operator__ParameterAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Operator__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4421:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4422:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4422:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4423:1: ( RULE_ID )
            {
             before(grammarAccess.getOperatorAccess().getParameterObjekttypCrossReference_2_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4424:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4425:1: RULE_ID
            {
             before(grammarAccess.getOperatorAccess().getParameterObjekttypIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operator__ParameterAssignment_29022); 
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


    // $ANTLR start "rule__Operator__AnweisungenAssignment_4"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4436:1: rule__Operator__AnweisungenAssignment_4 : ( ruleAnweisung ) ;
    public final void rule__Operator__AnweisungenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4440:1: ( ( ruleAnweisung ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4441:1: ( ruleAnweisung )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4441:1: ( ruleAnweisung )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4442:1: ruleAnweisung
            {
             before(grammarAccess.getOperatorAccess().getAnweisungenAnweisungParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAnweisung_in_rule__Operator__AnweisungenAssignment_49057);
            ruleAnweisung();

            state._fsp--;

             after(grammarAccess.getOperatorAccess().getAnweisungenAnweisungParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__AnweisungenAssignment_4"


    // $ANTLR start "rule__Anweisung__KontrollstrukturAssignment_0_0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4451:1: rule__Anweisung__KontrollstrukturAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Anweisung__KontrollstrukturAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4455:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4456:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4456:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4457:1: RULE_ID
            {
             before(grammarAccess.getAnweisungAccess().getKontrollstrukturIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Anweisung__KontrollstrukturAssignment_0_09088); 
             after(grammarAccess.getAnweisungAccess().getKontrollstrukturIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__KontrollstrukturAssignment_0_0"


    // $ANTLR start "rule__Anweisung__BedingungAssignment_0_2"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4466:1: rule__Anweisung__BedingungAssignment_0_2 : ( ruleAnweisung ) ;
    public final void rule__Anweisung__BedingungAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4470:1: ( ( ruleAnweisung ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4471:1: ( ruleAnweisung )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4471:1: ( ruleAnweisung )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4472:1: ruleAnweisung
            {
             before(grammarAccess.getAnweisungAccess().getBedingungAnweisungParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleAnweisung_in_rule__Anweisung__BedingungAssignment_0_29119);
            ruleAnweisung();

            state._fsp--;

             after(grammarAccess.getAnweisungAccess().getBedingungAnweisungParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__BedingungAssignment_0_2"


    // $ANTLR start "rule__Anweisung__BedigteAnweisungenAssignment_0_4"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4481:1: rule__Anweisung__BedigteAnweisungenAssignment_0_4 : ( ruleAnweisung ) ;
    public final void rule__Anweisung__BedigteAnweisungenAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4485:1: ( ( ruleAnweisung ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4486:1: ( ruleAnweisung )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4486:1: ( ruleAnweisung )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4487:1: ruleAnweisung
            {
             before(grammarAccess.getAnweisungAccess().getBedigteAnweisungenAnweisungParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_ruleAnweisung_in_rule__Anweisung__BedigteAnweisungenAssignment_0_49150);
            ruleAnweisung();

            state._fsp--;

             after(grammarAccess.getAnweisungAccess().getBedigteAnweisungenAnweisungParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__BedigteAnweisungenAssignment_0_4"


    // $ANTLR start "rule__Anweisung__ObjektAssignment_1_0_0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4496:1: rule__Anweisung__ObjektAssignment_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Anweisung__ObjektAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4500:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4501:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4501:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4502:1: ( RULE_ID )
            {
             before(grammarAccess.getAnweisungAccess().getObjektObjekttypCrossReference_1_0_0_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4503:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4504:1: RULE_ID
            {
             before(grammarAccess.getAnweisungAccess().getObjektObjekttypIDTerminalRuleCall_1_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Anweisung__ObjektAssignment_1_0_09185); 
             after(grammarAccess.getAnweisungAccess().getObjektObjekttypIDTerminalRuleCall_1_0_0_0_1()); 

            }

             after(grammarAccess.getAnweisungAccess().getObjektObjekttypCrossReference_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__ObjektAssignment_1_0_0"


    // $ANTLR start "rule__Anweisung__OperatorAssignment_1_1"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4515:1: rule__Anweisung__OperatorAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Anweisung__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4519:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4520:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4520:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4521:1: RULE_ID
            {
             before(grammarAccess.getAnweisungAccess().getOperatorIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Anweisung__OperatorAssignment_1_19220); 
             after(grammarAccess.getAnweisungAccess().getOperatorIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Anweisung__OperatorAssignment_1_1"


    // $ANTLR start "rule__VOT__AnnotationAssignment_0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4530:1: rule__VOT__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__VOT__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4534:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4535:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4535:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4536:1: ruleAnnotation
            {
             before(grammarAccess.getVOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__VOT__AnnotationAssignment_09251);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4545:1: rule__VOT__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VOT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4549:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4550:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4550:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4551:1: RULE_ID
            {
             before(grammarAccess.getVOTAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VOT__NameAssignment_29282); 
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


    // $ANTLR start "rule__VOT__AttributeAssignment_4"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4560:1: rule__VOT__AttributeAssignment_4 : ( ruleAttribut ) ;
    public final void rule__VOT__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4564:1: ( ( ruleAttribut ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4565:1: ( ruleAttribut )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4565:1: ( ruleAttribut )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4566:1: ruleAttribut
            {
             before(grammarAccess.getVOTAccess().getAttributeAttributParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribut_in_rule__VOT__AttributeAssignment_49313);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getVOTAccess().getAttributeAttributParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VOT__AttributeAssignment_4"


    // $ANTLR start "rule__VOT__OperatorenAssignment_5"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4575:1: rule__VOT__OperatorenAssignment_5 : ( ruleOperator ) ;
    public final void rule__VOT__OperatorenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4579:1: ( ( ruleOperator ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4580:1: ( ruleOperator )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4580:1: ( ruleOperator )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4581:1: ruleOperator
            {
             before(grammarAccess.getVOTAccess().getOperatorenOperatorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__VOT__OperatorenAssignment_59344);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getVOTAccess().getOperatorenOperatorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VOT__OperatorenAssignment_5"


    // $ANTLR start "rule__OOT__AnnotationAssignment_0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4590:1: rule__OOT__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__OOT__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4594:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4595:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4595:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4596:1: ruleAnnotation
            {
             before(grammarAccess.getOOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__OOT__AnnotationAssignment_09375);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4605:1: rule__OOT__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OOT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4609:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4610:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4610:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4611:1: RULE_ID
            {
             before(grammarAccess.getOOTAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OOT__NameAssignment_29406); 
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


    // $ANTLR start "rule__OOT__AttributeAssignment_4"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4620:1: rule__OOT__AttributeAssignment_4 : ( ruleAttribut ) ;
    public final void rule__OOT__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4624:1: ( ( ruleAttribut ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4625:1: ( ruleAttribut )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4625:1: ( ruleAttribut )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4626:1: ruleAttribut
            {
             before(grammarAccess.getOOTAccess().getAttributeAttributParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribut_in_rule__OOT__AttributeAssignment_49437);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getOOTAccess().getAttributeAttributParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OOT__AttributeAssignment_4"


    // $ANTLR start "rule__OOT__OperatorenAssignment_5"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4635:1: rule__OOT__OperatorenAssignment_5 : ( ruleOperator ) ;
    public final void rule__OOT__OperatorenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4639:1: ( ( ruleOperator ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4640:1: ( ruleOperator )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4640:1: ( ruleOperator )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4641:1: ruleOperator
            {
             before(grammarAccess.getOOTAccess().getOperatorenOperatorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__OOT__OperatorenAssignment_59468);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOOTAccess().getOperatorenOperatorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OOT__OperatorenAssignment_5"


    // $ANTLR start "rule__LOT__AnnotationAssignment_0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4650:1: rule__LOT__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__LOT__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4654:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4655:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4655:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4656:1: ruleAnnotation
            {
             before(grammarAccess.getLOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__LOT__AnnotationAssignment_09499);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4665:1: rule__LOT__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LOT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4669:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4670:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4670:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4671:1: RULE_ID
            {
             before(grammarAccess.getLOTAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LOT__NameAssignment_29530); 
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


    // $ANTLR start "rule__LOT__AttributeAssignment_4"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4680:1: rule__LOT__AttributeAssignment_4 : ( ruleAttribut ) ;
    public final void rule__LOT__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4684:1: ( ( ruleAttribut ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4685:1: ( ruleAttribut )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4685:1: ( ruleAttribut )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4686:1: ruleAttribut
            {
             before(grammarAccess.getLOTAccess().getAttributeAttributParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribut_in_rule__LOT__AttributeAssignment_49561);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getLOTAccess().getAttributeAttributParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOT__AttributeAssignment_4"


    // $ANTLR start "rule__LOT__OperatorenAssignment_5"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4695:1: rule__LOT__OperatorenAssignment_5 : ( ruleOperator ) ;
    public final void rule__LOT__OperatorenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4699:1: ( ( ruleOperator ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4700:1: ( ruleOperator )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4700:1: ( ruleOperator )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4701:1: ruleOperator
            {
             before(grammarAccess.getLOTAccess().getOperatorenOperatorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__LOT__OperatorenAssignment_59592);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getLOTAccess().getOperatorenOperatorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOT__OperatorenAssignment_5"


    // $ANTLR start "rule__TOT__AnnotationAssignment_0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4710:1: rule__TOT__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__TOT__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4714:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4715:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4715:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4716:1: ruleAnnotation
            {
             before(grammarAccess.getTOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__TOT__AnnotationAssignment_09623);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4725:1: rule__TOT__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TOT__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4729:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4730:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4730:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4731:1: RULE_ID
            {
             before(grammarAccess.getTOTAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TOT__NameAssignment_29654); 
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


    // $ANTLR start "rule__TOT__AttributeAssignment_4"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4740:1: rule__TOT__AttributeAssignment_4 : ( ruleAttribut ) ;
    public final void rule__TOT__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4744:1: ( ( ruleAttribut ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4745:1: ( ruleAttribut )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4745:1: ( ruleAttribut )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4746:1: ruleAttribut
            {
             before(grammarAccess.getTOTAccess().getAttributeAttributParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribut_in_rule__TOT__AttributeAssignment_49685);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getTOTAccess().getAttributeAttributParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TOT__AttributeAssignment_4"


    // $ANTLR start "rule__TOT__OperatorenAssignment_5"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4755:1: rule__TOT__OperatorenAssignment_5 : ( ruleOperator ) ;
    public final void rule__TOT__OperatorenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4759:1: ( ( ruleOperator ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4760:1: ( ruleOperator )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4760:1: ( ruleOperator )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4761:1: ruleOperator
            {
             before(grammarAccess.getTOTAccess().getOperatorenOperatorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__TOT__OperatorenAssignment_59716);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getTOTAccess().getOperatorenOperatorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TOT__OperatorenAssignment_5"


    // $ANTLR start "rule__Interacts_with__AnnotationAssignment_0"
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4770:1: rule__Interacts_with__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Interacts_with__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4774:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4775:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4775:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4776:1: ruleAnnotation
            {
             before(grammarAccess.getInteracts_withAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Interacts_with__AnnotationAssignment_09747);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4785:1: rule__Interacts_with__Objekttyp1Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Interacts_with__Objekttyp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4789:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4790:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4790:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4791:1: ( RULE_ID )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4792:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4793:1: RULE_ID
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp1Assignment_29782); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4804:1: rule__Interacts_with__KardinalitaetAssignment_3 : ( ( rule__Interacts_with__KardinalitaetAlternatives_3_0 ) ) ;
    public final void rule__Interacts_with__KardinalitaetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4808:1: ( ( ( rule__Interacts_with__KardinalitaetAlternatives_3_0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4809:1: ( ( rule__Interacts_with__KardinalitaetAlternatives_3_0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4809:1: ( ( rule__Interacts_with__KardinalitaetAlternatives_3_0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4810:1: ( rule__Interacts_with__KardinalitaetAlternatives_3_0 )
            {
             before(grammarAccess.getInteracts_withAccess().getKardinalitaetAlternatives_3_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4811:1: ( rule__Interacts_with__KardinalitaetAlternatives_3_0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4811:2: rule__Interacts_with__KardinalitaetAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Interacts_with__KardinalitaetAlternatives_3_0_in_rule__Interacts_with__KardinalitaetAssignment_39817);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4820:1: rule__Interacts_with__Objekttyp2Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Interacts_with__Objekttyp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4824:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4825:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4825:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4826:1: ( RULE_ID )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4827:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4828:1: RULE_ID
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp2Assignment_49854); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4839:1: rule__Is_a__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Is_a__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4843:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4844:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4844:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4845:1: ruleAnnotation
            {
             before(grammarAccess.getIs_aAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Is_a__AnnotationAssignment_09889);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4854:1: rule__Is_a__Objekttyp1Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Is_a__Objekttyp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4858:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4859:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4859:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4860:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4861:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4862:1: RULE_ID
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp1Assignment_29924); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4873:1: rule__Is_a__KardinalitaetAssignment_3 : ( ( rule__Is_a__KardinalitaetAlternatives_3_0 ) ) ;
    public final void rule__Is_a__KardinalitaetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4877:1: ( ( ( rule__Is_a__KardinalitaetAlternatives_3_0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4878:1: ( ( rule__Is_a__KardinalitaetAlternatives_3_0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4878:1: ( ( rule__Is_a__KardinalitaetAlternatives_3_0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4879:1: ( rule__Is_a__KardinalitaetAlternatives_3_0 )
            {
             before(grammarAccess.getIs_aAccess().getKardinalitaetAlternatives_3_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4880:1: ( rule__Is_a__KardinalitaetAlternatives_3_0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4880:2: rule__Is_a__KardinalitaetAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Is_a__KardinalitaetAlternatives_3_0_in_rule__Is_a__KardinalitaetAssignment_39959);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4889:1: rule__Is_a__Objekttyp2Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Is_a__Objekttyp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4893:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4894:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4894:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4895:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4896:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4897:1: RULE_ID
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp2Assignment_49996); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4908:1: rule__Is_part_of__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Is_part_of__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4912:1: ( ( ruleAnnotation ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4913:1: ( ruleAnnotation )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4913:1: ( ruleAnnotation )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4914:1: ruleAnnotation
            {
             before(grammarAccess.getIs_part_ofAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Is_part_of__AnnotationAssignment_010031);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4923:1: rule__Is_part_of__Objekttyp1Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Is_part_of__Objekttyp1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4927:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4928:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4928:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4929:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4930:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4931:1: RULE_ID
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp1Assignment_210066); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4942:1: rule__Is_part_of__KardinalitaetAssignment_3 : ( ( rule__Is_part_of__KardinalitaetAlternatives_3_0 ) ) ;
    public final void rule__Is_part_of__KardinalitaetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4946:1: ( ( ( rule__Is_part_of__KardinalitaetAlternatives_3_0 ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4947:1: ( ( rule__Is_part_of__KardinalitaetAlternatives_3_0 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4947:1: ( ( rule__Is_part_of__KardinalitaetAlternatives_3_0 ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4948:1: ( rule__Is_part_of__KardinalitaetAlternatives_3_0 )
            {
             before(grammarAccess.getIs_part_ofAccess().getKardinalitaetAlternatives_3_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4949:1: ( rule__Is_part_of__KardinalitaetAlternatives_3_0 )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4949:2: rule__Is_part_of__KardinalitaetAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Is_part_of__KardinalitaetAlternatives_3_0_in_rule__Is_part_of__KardinalitaetAssignment_310101);
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4958:1: rule__Is_part_of__Objekttyp2Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Is_part_of__Objekttyp2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4962:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4963:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4963:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4964:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4965:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4966:1: RULE_ID
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp2Assignment_410138); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4977:1: rule__Name__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Name__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4981:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4982:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4982:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4983:1: RULE_ID
            {
             before(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__NameAssignment_110173); 
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
    // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4992:1: rule__Merge__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Merge__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4996:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4997:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4997:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked.ui/src-gen/de/uniba/wiai/seda/somslmarked/ui/contentassist/antlr/internal/InternalSomSLMarked.g:4998:1: RULE_ID
            {
             before(grammarAccess.getMergeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Merge__NameAssignment_110204); 
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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\4\4\2\uffff\1\14\1\uffff\2\4";
    static final String DFA2_maxS =
        "\1\47\1\4\1\43\1\4\2\uffff\1\26\1\uffff\2\43";
    static final String DFA2_acceptS =
        "\4\uffff\1\1\1\2\1\uffff\1\3\2\uffff";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\6\31\uffff\3\4\3\5\1\1\1\3\1\2\1\7",
            "\1\10",
            "\1\5\31\uffff\3\4\3\5",
            "\1\11",
            "",
            "",
            "\4\5\2\uffff\2\5\2\uffff\1\7",
            "",
            "\1\5\31\uffff\3\4\3\5",
            "\1\5\31\uffff\3\4\3\5"
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
            return "733:1: rule__KOS__Alternatives_2 : ( ( ( rule__KOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__KOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__KOS__GliederungAssignment_2_2 ) ) );";
        }
    }
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\4\4\2\uffff\1\14\1\uffff\2\4";
    static final String DFA4_maxS =
        "\1\50\1\4\1\41\1\4\2\uffff\1\26\1\uffff\2\41";
    static final String DFA4_acceptS =
        "\4\uffff\1\1\1\2\1\uffff\1\3\2\uffff";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\6\30\uffff\1\4\3\uffff\1\5\2\uffff\1\1\1\3\1\2\1\uffff\1"+
            "\7",
            "\1\10",
            "\1\5\30\uffff\1\4\3\uffff\1\5",
            "\1\11",
            "",
            "",
            "\4\5\2\uffff\2\5\2\uffff\1\7",
            "",
            "\1\5\30\uffff\1\4\3\uffff\1\5",
            "\1\5\30\uffff\1\4\3\uffff\1\5"
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
            return "783:1: rule__VOS__Alternatives_2 : ( ( ( rule__VOS__ObjekttypenAssignment_2_0 ) ) | ( ( rule__VOS__BeziehungenAssignment_2_1 ) ) | ( ( rule__VOS__GliederungAssignment_2_2 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleAwS_in_entryRuleAwS61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwS68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group__0_in_ruleAwS94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOS_in_entryRuleKOS123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKOS130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Group__0_in_ruleKOS156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOS_in_entryRuleVOS183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVOS190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Group__0_in_ruleVOS216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_entryRuleAttribut245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribut252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__0_in_ruleAttribut278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__0_in_ruleOperator338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnweisung_in_entryRuleAnweisung365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnweisung372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Alternatives_in_ruleAnweisung398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOT_in_entryRuleKOT425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKOT432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOT__Alternatives_in_ruleKOT458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOT_in_entryRuleVOT485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVOT492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__0_in_ruleVOT518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_entryRuleOOT545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOOT552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__0_in_ruleOOT578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_entryRuleLOT605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOT612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__0_in_ruleLOT638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_entryRuleTOT665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTOT672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__0_in_ruleTOT698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeziehung_in_entryRuleBeziehung725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeziehung732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Beziehung__Alternatives_in_ruleBeziehung758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteracts_with792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__0_in_ruleInteracts_with818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_a_in_entryRuleIs_a845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_a852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__0_in_ruleIs_a878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_part_of912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__0_in_ruleIs_part_of938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet01967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet01974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__0_in_ruleKardinalitaet011000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet0x1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__0_in_ruleKardinalitaet0x1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet111087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet111094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__0_in_ruleKardinalitaet111120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet1x1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__0_in_ruleKardinalitaet1x1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__0_in_ruleName1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_entryRuleMerge1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMerge1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__Group__0_in_ruleMerge1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_entryRuleIgnore1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIgnore1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ignore__Group__0_in_ruleIgnore1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__NameAssignment_0_0_in_rule__KOS__Alternatives_01457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__NameAssignment_0_1_in_rule__KOS__Alternatives_01475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__ObjekttypenAssignment_2_0_in_rule__KOS__Alternatives_21508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__BeziehungenAssignment_2_1_in_rule__KOS__Alternatives_21526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__GliederungAssignment_2_2_in_rule__KOS__Alternatives_21544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__NameAssignment_0_0_in_rule__VOS__Alternatives_01577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__NameAssignment_0_1_in_rule__VOS__Alternatives_01595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__ObjekttypenAssignment_2_0_in_rule__VOS__Alternatives_21628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__BeziehungenAssignment_2_1_in_rule__VOS__Alternatives_21646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__GliederungAssignment_2_2_in_rule__VOS__Alternatives_21664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__ObjekttypAssignment_0_0_in_rule__Attribut__Alternatives_01698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group_0_1__0_in_rule__Attribut__Alternatives_01716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__0_in_rule__Anweisung__Alternatives1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1__0_in_rule__Anweisung__Alternatives1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_rule__KOT__Alternatives1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_rule__KOT__Alternatives1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_rule__KOT__Alternatives1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_a_in_rule__Beziehung__Alternatives1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_rule__Beziehung__Alternatives1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_rule__Beziehung__Alternatives1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_rule__Interacts_with__KardinalitaetAlternatives_3_01932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_rule__Interacts_with__KardinalitaetAlternatives_3_01949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_rule__Interacts_with__KardinalitaetAlternatives_3_01966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_rule__Is_a__KardinalitaetAlternatives_3_01998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_rule__Is_a__KardinalitaetAlternatives_3_02015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_rule__Is_part_of__KardinalitaetAlternatives_3_02047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_rule__Is_part_of__KardinalitaetAlternatives_3_02064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_rule__Is_part_of__KardinalitaetAlternatives_3_02081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Kardinalitaet01__Alternatives_02115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Kardinalitaet01__Alternatives_02135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Kardinalitaet0x__Alternatives_02170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Kardinalitaet0x__Alternatives_02190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Kardinalitaet11__Alternatives_02225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Kardinalitaet11__Alternatives_02245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Kardinalitaet1x__Alternatives_02280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Kardinalitaet1x__Alternatives_02300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Annotation__Alternatives2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_rule__Annotation__Alternatives2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_rule__Annotation__Alternatives2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group__0__Impl_in_rule__AwS__Group__02398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AwS__Group__1_in_rule__AwS__Group__02401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AwS__Group__0__Impl2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group__1__Impl_in_rule__AwS__Group__12460 = new BitSet(new long[]{0x0000018000200010L});
    public static final BitSet FOLLOW_rule__AwS__Group__2_in_rule__AwS__Group__12463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__NameAssignment_1_in_rule__AwS__Group__1__Impl2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group__2__Impl_in_rule__AwS__Group__22520 = new BitSet(new long[]{0x0000018000200010L});
    public static final BitSet FOLLOW_rule__AwS__Group__3_in_rule__AwS__Group__22523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group_2__0_in_rule__AwS__Group__2__Impl2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group__3__Impl_in_rule__AwS__Group__32581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__UnorderedGroup_3_in_rule__AwS__Group__3__Impl2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group_2__0__Impl_in_rule__AwS__Group_2__02646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AwS__Group_2__1_in_rule__AwS__Group_2__02649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AwS__Group_2__0__Impl2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__Group_2__1__Impl_in_rule__AwS__Group_2__12708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__VersionAssignment_2_1_in_rule__AwS__Group_2__1__Impl2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Group__0__Impl_in_rule__KOS__Group__02769 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__KOS__Group__1_in_rule__KOS__Group__02772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Alternatives_0_in_rule__KOS__Group__0__Impl2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Group__1__Impl_in_rule__KOS__Group__12829 = new BitSet(new long[]{0x000000FFC0800010L});
    public static final BitSet FOLLOW_rule__KOS__Group__2_in_rule__KOS__Group__12832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__KOS__Group__1__Impl2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Group__2__Impl_in_rule__KOS__Group__22891 = new BitSet(new long[]{0x000000FFC0800010L});
    public static final BitSet FOLLOW_rule__KOS__Group__3_in_rule__KOS__Group__22894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOS__Alternatives_2_in_rule__KOS__Group__2__Impl2921 = new BitSet(new long[]{0x000000FFC0000012L});
    public static final BitSet FOLLOW_rule__KOS__Group__3__Impl_in_rule__KOS__Group__32952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__KOS__Group__3__Impl2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Group__0__Impl_in_rule__VOS__Group__03019 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__VOS__Group__1_in_rule__VOS__Group__03022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Alternatives_0_in_rule__VOS__Group__0__Impl3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Group__1__Impl_in_rule__VOS__Group__13079 = new BitSet(new long[]{0x000001F220A00010L});
    public static final BitSet FOLLOW_rule__VOS__Group__2_in_rule__VOS__Group__13082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VOS__Group__1__Impl3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Group__2__Impl_in_rule__VOS__Group__23141 = new BitSet(new long[]{0x000001F220A00010L});
    public static final BitSet FOLLOW_rule__VOS__Group__3_in_rule__VOS__Group__23144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOS__Alternatives_2_in_rule__VOS__Group__2__Impl3171 = new BitSet(new long[]{0x000001F220200012L});
    public static final BitSet FOLLOW_rule__VOS__Group__3__Impl_in_rule__VOS__Group__33202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VOS__Group__3__Impl3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__0__Impl_in_rule__Attribut__Group__03269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribut__Group__1_in_rule__Attribut__Group__03272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Alternatives_0_in_rule__Attribut__Group__0__Impl3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__1__Impl_in_rule__Attribut__Group__13329 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Attribut__Group__2_in_rule__Attribut__Group__13332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__NameAssignment_1_in_rule__Attribut__Group__1__Impl3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__2__Impl_in_rule__Attribut__Group__23389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Attribut__Group__2__Impl3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group_0_1__0__Impl_in_rule__Attribut__Group_0_1__03454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribut__Group_0_1__1_in_rule__Attribut__Group_0_1__03457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Attribut__Group_0_1__0__Impl3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group_0_1__1__Impl_in_rule__Attribut__Group_0_1__13516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__DatentypAssignment_0_1_1_in_rule__Attribut__Group_0_1__1__Impl3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__0__Impl_in_rule__Operator__Group__03577 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Operator__Group__1_in_rule__Operator__Group__03580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__NameAssignment_0_in_rule__Operator__Group__0__Impl3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__1__Impl_in_rule__Operator__Group__13637 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Operator__Group__2_in_rule__Operator__Group__13640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Operator__Group__1__Impl3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__2__Impl_in_rule__Operator__Group__23699 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Operator__Group__3_in_rule__Operator__Group__23702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__ParameterAssignment_2_in_rule__Operator__Group__2__Impl3729 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Operator__Group__3__Impl_in_rule__Operator__Group__33760 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Operator__Group__4_in_rule__Operator__Group__33763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Operator__Group__3__Impl3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__4__Impl_in_rule__Operator__Group__43822 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Operator__Group__5_in_rule__Operator__Group__43825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__AnweisungenAssignment_4_in_rule__Operator__Group__4__Impl3852 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Operator__Group__5__Impl_in_rule__Operator__Group__53883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Operator__Group__5__Impl3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__0__Impl_in_rule__Anweisung__Group_0__03954 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__1_in_rule__Anweisung__Group_0__03957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__KontrollstrukturAssignment_0_0_in_rule__Anweisung__Group_0__0__Impl3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__1__Impl_in_rule__Anweisung__Group_0__14014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__2_in_rule__Anweisung__Group_0__14017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Anweisung__Group_0__1__Impl4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__2__Impl_in_rule__Anweisung__Group_0__24076 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__3_in_rule__Anweisung__Group_0__24079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__BedingungAssignment_0_2_in_rule__Anweisung__Group_0__2__Impl4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__3__Impl_in_rule__Anweisung__Group_0__34136 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__4_in_rule__Anweisung__Group_0__34139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Anweisung__Group_0__3__Impl4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__4__Impl_in_rule__Anweisung__Group_0__44198 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__5_in_rule__Anweisung__Group_0__44201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__BedigteAnweisungenAssignment_0_4_in_rule__Anweisung__Group_0__4__Impl4228 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__5__Impl_in_rule__Anweisung__Group_0__54259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Anweisung__Group_0__5__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1__0__Impl_in_rule__Anweisung__Group_1__04330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1__1_in_rule__Anweisung__Group_1__04333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1_0__0_in_rule__Anweisung__Group_1__0__Impl4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1__1__Impl_in_rule__Anweisung__Group_1__14391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__OperatorAssignment_1_1_in_rule__Anweisung__Group_1__1__Impl4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1_0__0__Impl_in_rule__Anweisung__Group_1_0__04452 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1_0__1_in_rule__Anweisung__Group_1_0__04455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__ObjektAssignment_1_0_0_in_rule__Anweisung__Group_1_0__0__Impl4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1_0__1__Impl_in_rule__Anweisung__Group_1_0__14512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Anweisung__Group_1_0__1__Impl4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__0__Impl_in_rule__VOT__Group__04575 = new BitSet(new long[]{0x0000007020000000L});
    public static final BitSet FOLLOW_rule__VOT__Group__1_in_rule__VOT__Group__04578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__AnnotationAssignment_0_in_rule__VOT__Group__0__Impl4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__1__Impl_in_rule__VOT__Group__14636 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VOT__Group__2_in_rule__VOT__Group__14639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VOT__Group__1__Impl4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__2__Impl_in_rule__VOT__Group__24698 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__VOT__Group__3_in_rule__VOT__Group__24701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__NameAssignment_2_in_rule__VOT__Group__2__Impl4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__3__Impl_in_rule__VOT__Group__34758 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__VOT__Group__4_in_rule__VOT__Group__34761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VOT__Group__3__Impl4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__4__Impl_in_rule__VOT__Group__44820 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__VOT__Group__5_in_rule__VOT__Group__44823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__AttributeAssignment_4_in_rule__VOT__Group__4__Impl4850 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_rule__VOT__Group__5__Impl_in_rule__VOT__Group__54881 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__VOT__Group__6_in_rule__VOT__Group__54884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__OperatorenAssignment_5_in_rule__VOT__Group__5__Impl4911 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__VOT__Group__6__Impl_in_rule__VOT__Group__64942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VOT__Group__6__Impl4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__0__Impl_in_rule__OOT__Group__05015 = new BitSet(new long[]{0x0000007040000000L});
    public static final BitSet FOLLOW_rule__OOT__Group__1_in_rule__OOT__Group__05018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__AnnotationAssignment_0_in_rule__OOT__Group__0__Impl5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__1__Impl_in_rule__OOT__Group__15076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OOT__Group__2_in_rule__OOT__Group__15079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__OOT__Group__1__Impl5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__2__Impl_in_rule__OOT__Group__25138 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__OOT__Group__3_in_rule__OOT__Group__25141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__NameAssignment_2_in_rule__OOT__Group__2__Impl5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__3__Impl_in_rule__OOT__Group__35198 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__OOT__Group__4_in_rule__OOT__Group__35201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__OOT__Group__3__Impl5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__4__Impl_in_rule__OOT__Group__45260 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__OOT__Group__5_in_rule__OOT__Group__45263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__AttributeAssignment_4_in_rule__OOT__Group__4__Impl5290 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_rule__OOT__Group__5__Impl_in_rule__OOT__Group__55321 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__OOT__Group__6_in_rule__OOT__Group__55324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__OperatorenAssignment_5_in_rule__OOT__Group__5__Impl5351 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__OOT__Group__6__Impl_in_rule__OOT__Group__65382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__OOT__Group__6__Impl5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__0__Impl_in_rule__LOT__Group__05455 = new BitSet(new long[]{0x0000007080000000L});
    public static final BitSet FOLLOW_rule__LOT__Group__1_in_rule__LOT__Group__05458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__AnnotationAssignment_0_in_rule__LOT__Group__0__Impl5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__1__Impl_in_rule__LOT__Group__15516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LOT__Group__2_in_rule__LOT__Group__15519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__LOT__Group__1__Impl5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__2__Impl_in_rule__LOT__Group__25578 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__LOT__Group__3_in_rule__LOT__Group__25581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__NameAssignment_2_in_rule__LOT__Group__2__Impl5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__3__Impl_in_rule__LOT__Group__35638 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__LOT__Group__4_in_rule__LOT__Group__35641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LOT__Group__3__Impl5669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__4__Impl_in_rule__LOT__Group__45700 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__LOT__Group__5_in_rule__LOT__Group__45703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__AttributeAssignment_4_in_rule__LOT__Group__4__Impl5730 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_rule__LOT__Group__5__Impl_in_rule__LOT__Group__55761 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__LOT__Group__6_in_rule__LOT__Group__55764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__OperatorenAssignment_5_in_rule__LOT__Group__5__Impl5791 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__LOT__Group__6__Impl_in_rule__LOT__Group__65822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LOT__Group__6__Impl5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__0__Impl_in_rule__TOT__Group__05895 = new BitSet(new long[]{0x00000071C0000000L});
    public static final BitSet FOLLOW_rule__TOT__Group__1_in_rule__TOT__Group__05898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__AnnotationAssignment_0_in_rule__TOT__Group__0__Impl5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__1__Impl_in_rule__TOT__Group__15956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TOT__Group__2_in_rule__TOT__Group__15959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TOT__Group__1__Impl5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__2__Impl_in_rule__TOT__Group__26018 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TOT__Group__3_in_rule__TOT__Group__26021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__NameAssignment_2_in_rule__TOT__Group__2__Impl6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__3__Impl_in_rule__TOT__Group__36078 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__TOT__Group__4_in_rule__TOT__Group__36081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TOT__Group__3__Impl6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__4__Impl_in_rule__TOT__Group__46140 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__TOT__Group__5_in_rule__TOT__Group__46143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__AttributeAssignment_4_in_rule__TOT__Group__4__Impl6170 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_rule__TOT__Group__5__Impl_in_rule__TOT__Group__56201 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_rule__TOT__Group__6_in_rule__TOT__Group__56204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__OperatorenAssignment_5_in_rule__TOT__Group__5__Impl6231 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__TOT__Group__6__Impl_in_rule__TOT__Group__66262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TOT__Group__6__Impl6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__0__Impl_in_rule__Interacts_with__Group__06335 = new BitSet(new long[]{0x0000007200000010L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__1_in_rule__Interacts_with__Group__06338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__AnnotationAssignment_0_in_rule__Interacts_with__Group__0__Impl6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__1__Impl_in_rule__Interacts_with__Group__16396 = new BitSet(new long[]{0x0000007200000010L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__2_in_rule__Interacts_with__Group__16399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Interacts_with__Group__1__Impl6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__2__Impl_in_rule__Interacts_with__Group__26461 = new BitSet(new long[]{0x00000000000CF000L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__3_in_rule__Interacts_with__Group__26464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Objekttyp1Assignment_2_in_rule__Interacts_with__Group__2__Impl6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__3__Impl_in_rule__Interacts_with__Group__36521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__4_in_rule__Interacts_with__Group__36524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__KardinalitaetAssignment_3_in_rule__Interacts_with__Group__3__Impl6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__4__Impl_in_rule__Interacts_with__Group__46581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Objekttyp2Assignment_4_in_rule__Interacts_with__Group__4__Impl6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__0__Impl_in_rule__Is_a__Group__06648 = new BitSet(new long[]{0x0000007400000000L});
    public static final BitSet FOLLOW_rule__Is_a__Group__1_in_rule__Is_a__Group__06651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__AnnotationAssignment_0_in_rule__Is_a__Group__0__Impl6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__1__Impl_in_rule__Is_a__Group__16709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Is_a__Group__2_in_rule__Is_a__Group__16712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Is_a__Group__1__Impl6740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__2__Impl_in_rule__Is_a__Group__26771 = new BitSet(new long[]{0x0000000000033000L});
    public static final BitSet FOLLOW_rule__Is_a__Group__3_in_rule__Is_a__Group__26774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Objekttyp1Assignment_2_in_rule__Is_a__Group__2__Impl6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__3__Impl_in_rule__Is_a__Group__36831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Is_a__Group__4_in_rule__Is_a__Group__36834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__KardinalitaetAssignment_3_in_rule__Is_a__Group__3__Impl6861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__4__Impl_in_rule__Is_a__Group__46891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Objekttyp2Assignment_4_in_rule__Is_a__Group__4__Impl6918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__0__Impl_in_rule__Is_part_of__Group__06958 = new BitSet(new long[]{0x0000007E00000010L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__1_in_rule__Is_part_of__Group__06961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__AnnotationAssignment_0_in_rule__Is_part_of__Group__0__Impl6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__1__Impl_in_rule__Is_part_of__Group__17019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__2_in_rule__Is_part_of__Group__17022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Is_part_of__Group__1__Impl7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__2__Impl_in_rule__Is_part_of__Group__27081 = new BitSet(new long[]{0x00000000000CF000L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__3_in_rule__Is_part_of__Group__27084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Objekttyp1Assignment_2_in_rule__Is_part_of__Group__2__Impl7111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__3__Impl_in_rule__Is_part_of__Group__37141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__4_in_rule__Is_part_of__Group__37144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__KardinalitaetAssignment_3_in_rule__Is_part_of__Group__3__Impl7171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__4__Impl_in_rule__Is_part_of__Group__47201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Objekttyp2Assignment_4_in_rule__Is_part_of__Group__4__Impl7228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__0__Impl_in_rule__Kardinalitaet01__Group__07268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__1_in_rule__Kardinalitaet01__Group__07271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Alternatives_0_in_rule__Kardinalitaet01__Group__0__Impl7298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__1__Impl_in_rule__Kardinalitaet01__Group__17328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__0__Impl_in_rule__Kardinalitaet0x__Group__07390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__1_in_rule__Kardinalitaet0x__Group__07393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Alternatives_0_in_rule__Kardinalitaet0x__Group__0__Impl7420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__1__Impl_in_rule__Kardinalitaet0x__Group__17450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__0__Impl_in_rule__Kardinalitaet11__Group__07512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__1_in_rule__Kardinalitaet11__Group__07515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Alternatives_0_in_rule__Kardinalitaet11__Group__0__Impl7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__1__Impl_in_rule__Kardinalitaet11__Group__17572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__0__Impl_in_rule__Kardinalitaet1x__Group__07634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__1_in_rule__Kardinalitaet1x__Group__07637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Alternatives_0_in_rule__Kardinalitaet1x__Group__0__Impl7664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__1__Impl_in_rule__Kardinalitaet1x__Group__17694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__07756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Name__Group__1_in_rule__Name__Group__07759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Name__Group__0__Impl7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__17818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__NameAssignment_1_in_rule__Name__Group__1__Impl7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__Group__0__Impl_in_rule__Merge__Group__07879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Merge__Group__1_in_rule__Merge__Group__07882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Merge__Group__0__Impl7910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__Group__1__Impl_in_rule__Merge__Group__17941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__NameAssignment_1_in_rule__Merge__Group__1__Impl7968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ignore__Group__0__Impl_in_rule__Ignore__Group__08002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Ignore__Group__1_in_rule__Ignore__Group__08005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Ignore__Group__0__Impl8033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ignore__Group__1__Impl_in_rule__Ignore__Group__18064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__UnorderedGroup_3__0_in_rule__AwS__UnorderedGroup_38127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__KosAssignment_3_0_in_rule__AwS__UnorderedGroup_3__Impl8216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__VosAssignment_3_1_in_rule__AwS__UnorderedGroup_3__Impl8307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__UnorderedGroup_3__Impl_in_rule__AwS__UnorderedGroup_3__08366 = new BitSet(new long[]{0x0000018000200012L});
    public static final BitSet FOLLOW_rule__AwS__UnorderedGroup_3__1_in_rule__AwS__UnorderedGroup_3__08369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AwS__UnorderedGroup_3__Impl_in_rule__AwS__UnorderedGroup_3__18394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AwS__NameAssignment_18426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VERSION_in_rule__AwS__VersionAssignment_2_18457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOS_in_rule__AwS__KosAssignment_3_08488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOS_in_rule__AwS__VosAssignment_3_18519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__KOS__NameAssignment_0_08555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KOS__NameAssignment_0_18594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOT_in_rule__KOS__ObjekttypenAssignment_2_08625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeziehung_in_rule__KOS__BeziehungenAssignment_2_18656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOS_in_rule__KOS__GliederungAssignment_2_28687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__VOS__NameAssignment_0_08723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VOS__NameAssignment_0_18762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOT_in_rule__VOS__ObjekttypenAssignment_2_08793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_rule__VOS__BeziehungenAssignment_2_18824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOS_in_rule__VOS__GliederungAssignment_2_28855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribut__ObjekttypAssignment_0_08890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribut__DatentypAssignment_0_1_18925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribut__NameAssignment_18956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operator__NameAssignment_08987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operator__ParameterAssignment_29022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnweisung_in_rule__Operator__AnweisungenAssignment_49057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Anweisung__KontrollstrukturAssignment_0_09088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnweisung_in_rule__Anweisung__BedingungAssignment_0_29119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnweisung_in_rule__Anweisung__BedigteAnweisungenAssignment_0_49150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Anweisung__ObjektAssignment_1_0_09185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Anweisung__OperatorAssignment_1_19220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__VOT__AnnotationAssignment_09251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VOT__NameAssignment_29282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_rule__VOT__AttributeAssignment_49313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__VOT__OperatorenAssignment_59344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__OOT__AnnotationAssignment_09375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OOT__NameAssignment_29406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_rule__OOT__AttributeAssignment_49437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__OOT__OperatorenAssignment_59468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__LOT__AnnotationAssignment_09499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LOT__NameAssignment_29530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_rule__LOT__AttributeAssignment_49561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__LOT__OperatorenAssignment_59592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__TOT__AnnotationAssignment_09623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TOT__NameAssignment_29654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_rule__TOT__AttributeAssignment_49685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__TOT__OperatorenAssignment_59716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Interacts_with__AnnotationAssignment_09747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp1Assignment_29782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__KardinalitaetAlternatives_3_0_in_rule__Interacts_with__KardinalitaetAssignment_39817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp2Assignment_49854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Is_a__AnnotationAssignment_09889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp1Assignment_29924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__KardinalitaetAlternatives_3_0_in_rule__Is_a__KardinalitaetAssignment_39959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp2Assignment_49996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Is_part_of__AnnotationAssignment_010031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp1Assignment_210066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__KardinalitaetAlternatives_3_0_in_rule__Is_part_of__KardinalitaetAssignment_310101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp2Assignment_410138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__NameAssignment_110173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Merge__NameAssignment_110204 = new BitSet(new long[]{0x0000000000000002L});

}
