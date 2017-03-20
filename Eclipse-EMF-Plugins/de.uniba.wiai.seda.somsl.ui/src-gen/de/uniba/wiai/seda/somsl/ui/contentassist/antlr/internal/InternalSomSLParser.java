package de.uniba.wiai.seda.somsl.ui.contentassist.antlr.internal; 

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
import de.uniba.wiai.seda.somsl.services.SomSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSomSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANNOTATION", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'(0,1)'", "'--'", "'(0,*)'", "'->'", "'(1,1)'", "'=='", "'(1,*)'", "'=>'", "'{'", "'}'", "';'", "'DT'", "'('", "') {'", "'.'", "'VOT'", "'OOT'", "'LOT'", "'TOT'", "'interacts_with:'", "'is_a:'", "'is_part_of:'"
    };
    public static final int RULE_ID=5;
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
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANNOTATION=4;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalSomSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSomSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSomSLParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g"; }


     
     	private SomSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SomSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMetamodell"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:60:1: entryRuleMetamodell : ruleMetamodell EOF ;
    public final void entryRuleMetamodell() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:61:1: ( ruleMetamodell EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:62:1: ruleMetamodell EOF
            {
             before(grammarAccess.getMetamodellRule()); 
            pushFollow(FOLLOW_ruleMetamodell_in_entryRuleMetamodell61);
            ruleMetamodell();

            state._fsp--;

             after(grammarAccess.getMetamodellRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodell68); 

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
    // $ANTLR end "entryRuleMetamodell"


    // $ANTLR start "ruleMetamodell"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:69:1: ruleMetamodell : ( ( rule__Metamodell__Group__0 ) ) ;
    public final void ruleMetamodell() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:73:2: ( ( ( rule__Metamodell__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:74:1: ( ( rule__Metamodell__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:74:1: ( ( rule__Metamodell__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:75:1: ( rule__Metamodell__Group__0 )
            {
             before(grammarAccess.getMetamodellAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:76:1: ( rule__Metamodell__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:76:2: rule__Metamodell__Group__0
            {
            pushFollow(FOLLOW_rule__Metamodell__Group__0_in_ruleMetamodell94);
            rule__Metamodell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetamodell"


    // $ANTLR start "entryRuleObjekttyp"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:88:1: entryRuleObjekttyp : ruleObjekttyp EOF ;
    public final void entryRuleObjekttyp() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:89:1: ( ruleObjekttyp EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:90:1: ruleObjekttyp EOF
            {
             before(grammarAccess.getObjekttypRule()); 
            pushFollow(FOLLOW_ruleObjekttyp_in_entryRuleObjekttyp121);
            ruleObjekttyp();

            state._fsp--;

             after(grammarAccess.getObjekttypRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjekttyp128); 

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
    // $ANTLR end "entryRuleObjekttyp"


    // $ANTLR start "ruleObjekttyp"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:97:1: ruleObjekttyp : ( ( rule__Objekttyp__Group__0 ) ) ;
    public final void ruleObjekttyp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:101:2: ( ( ( rule__Objekttyp__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:102:1: ( ( rule__Objekttyp__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:102:1: ( ( rule__Objekttyp__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:103:1: ( rule__Objekttyp__Group__0 )
            {
             before(grammarAccess.getObjekttypAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:104:1: ( rule__Objekttyp__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:104:2: rule__Objekttyp__Group__0
            {
            pushFollow(FOLLOW_rule__Objekttyp__Group__0_in_ruleObjekttyp154);
            rule__Objekttyp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjekttypAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjekttyp"


    // $ANTLR start "entryRuleAttribut"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:116:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:117:1: ( ruleAttribut EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:118:1: ruleAttribut EOF
            {
             before(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_ruleAttribut_in_entryRuleAttribut181);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getAttributRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribut188); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:125:1: ruleAttribut : ( ( rule__Attribut__Group__0 ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:129:2: ( ( ( rule__Attribut__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:130:1: ( ( rule__Attribut__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:130:1: ( ( rule__Attribut__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:131:1: ( rule__Attribut__Group__0 )
            {
             before(grammarAccess.getAttributAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:132:1: ( rule__Attribut__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:132:2: rule__Attribut__Group__0
            {
            pushFollow(FOLLOW_rule__Attribut__Group__0_in_ruleAttribut214);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:144:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:145:1: ( ruleOperator EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:146:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator241);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator248); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:153:1: ruleOperator : ( ( rule__Operator__Group__0 ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:157:2: ( ( ( rule__Operator__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:158:1: ( ( rule__Operator__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:158:1: ( ( rule__Operator__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:159:1: ( rule__Operator__Group__0 )
            {
             before(grammarAccess.getOperatorAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:160:1: ( rule__Operator__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:160:2: rule__Operator__Group__0
            {
            pushFollow(FOLLOW_rule__Operator__Group__0_in_ruleOperator274);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:172:1: entryRuleAnweisung : ruleAnweisung EOF ;
    public final void entryRuleAnweisung() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:173:1: ( ruleAnweisung EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:174:1: ruleAnweisung EOF
            {
             before(grammarAccess.getAnweisungRule()); 
            pushFollow(FOLLOW_ruleAnweisung_in_entryRuleAnweisung301);
            ruleAnweisung();

            state._fsp--;

             after(grammarAccess.getAnweisungRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnweisung308); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:181:1: ruleAnweisung : ( ( rule__Anweisung__Alternatives ) ) ;
    public final void ruleAnweisung() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:185:2: ( ( ( rule__Anweisung__Alternatives ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:186:1: ( ( rule__Anweisung__Alternatives ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:186:1: ( ( rule__Anweisung__Alternatives ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:187:1: ( rule__Anweisung__Alternatives )
            {
             before(grammarAccess.getAnweisungAccess().getAlternatives()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:188:1: ( rule__Anweisung__Alternatives )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:188:2: rule__Anweisung__Alternatives
            {
            pushFollow(FOLLOW_rule__Anweisung__Alternatives_in_ruleAnweisung334);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:200:1: entryRuleKOT : ruleKOT EOF ;
    public final void entryRuleKOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:201:1: ( ruleKOT EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:202:1: ruleKOT EOF
            {
             before(grammarAccess.getKOTRule()); 
            pushFollow(FOLLOW_ruleKOT_in_entryRuleKOT361);
            ruleKOT();

            state._fsp--;

             after(grammarAccess.getKOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKOT368); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:209:1: ruleKOT : ( ( rule__KOT__Alternatives ) ) ;
    public final void ruleKOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:213:2: ( ( ( rule__KOT__Alternatives ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:214:1: ( ( rule__KOT__Alternatives ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:214:1: ( ( rule__KOT__Alternatives ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:215:1: ( rule__KOT__Alternatives )
            {
             before(grammarAccess.getKOTAccess().getAlternatives()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:216:1: ( rule__KOT__Alternatives )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:216:2: rule__KOT__Alternatives
            {
            pushFollow(FOLLOW_rule__KOT__Alternatives_in_ruleKOT394);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:228:1: entryRuleVOT : ruleVOT EOF ;
    public final void entryRuleVOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:229:1: ( ruleVOT EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:230:1: ruleVOT EOF
            {
             before(grammarAccess.getVOTRule()); 
            pushFollow(FOLLOW_ruleVOT_in_entryRuleVOT421);
            ruleVOT();

            state._fsp--;

             after(grammarAccess.getVOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVOT428); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:237:1: ruleVOT : ( ( rule__VOT__Group__0 ) ) ;
    public final void ruleVOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:241:2: ( ( ( rule__VOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:242:1: ( ( rule__VOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:242:1: ( ( rule__VOT__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:243:1: ( rule__VOT__Group__0 )
            {
             before(grammarAccess.getVOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:244:1: ( rule__VOT__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:244:2: rule__VOT__Group__0
            {
            pushFollow(FOLLOW_rule__VOT__Group__0_in_ruleVOT454);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:256:1: entryRuleOOT : ruleOOT EOF ;
    public final void entryRuleOOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:257:1: ( ruleOOT EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:258:1: ruleOOT EOF
            {
             before(grammarAccess.getOOTRule()); 
            pushFollow(FOLLOW_ruleOOT_in_entryRuleOOT481);
            ruleOOT();

            state._fsp--;

             after(grammarAccess.getOOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOOT488); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:265:1: ruleOOT : ( ( rule__OOT__Group__0 ) ) ;
    public final void ruleOOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:269:2: ( ( ( rule__OOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:270:1: ( ( rule__OOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:270:1: ( ( rule__OOT__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:271:1: ( rule__OOT__Group__0 )
            {
             before(grammarAccess.getOOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:272:1: ( rule__OOT__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:272:2: rule__OOT__Group__0
            {
            pushFollow(FOLLOW_rule__OOT__Group__0_in_ruleOOT514);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:284:1: entryRuleLOT : ruleLOT EOF ;
    public final void entryRuleLOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:285:1: ( ruleLOT EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:286:1: ruleLOT EOF
            {
             before(grammarAccess.getLOTRule()); 
            pushFollow(FOLLOW_ruleLOT_in_entryRuleLOT541);
            ruleLOT();

            state._fsp--;

             after(grammarAccess.getLOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOT548); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:293:1: ruleLOT : ( ( rule__LOT__Group__0 ) ) ;
    public final void ruleLOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:297:2: ( ( ( rule__LOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:298:1: ( ( rule__LOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:298:1: ( ( rule__LOT__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:299:1: ( rule__LOT__Group__0 )
            {
             before(grammarAccess.getLOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:300:1: ( rule__LOT__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:300:2: rule__LOT__Group__0
            {
            pushFollow(FOLLOW_rule__LOT__Group__0_in_ruleLOT574);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:312:1: entryRuleTOT : ruleTOT EOF ;
    public final void entryRuleTOT() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:313:1: ( ruleTOT EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:314:1: ruleTOT EOF
            {
             before(grammarAccess.getTOTRule()); 
            pushFollow(FOLLOW_ruleTOT_in_entryRuleTOT601);
            ruleTOT();

            state._fsp--;

             after(grammarAccess.getTOTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTOT608); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:321:1: ruleTOT : ( ( rule__TOT__Group__0 ) ) ;
    public final void ruleTOT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:325:2: ( ( ( rule__TOT__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:326:1: ( ( rule__TOT__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:326:1: ( ( rule__TOT__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:327:1: ( rule__TOT__Group__0 )
            {
             before(grammarAccess.getTOTAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:328:1: ( rule__TOT__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:328:2: rule__TOT__Group__0
            {
            pushFollow(FOLLOW_rule__TOT__Group__0_in_ruleTOT634);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:340:1: entryRuleBeziehung : ruleBeziehung EOF ;
    public final void entryRuleBeziehung() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:341:1: ( ruleBeziehung EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:342:1: ruleBeziehung EOF
            {
             before(grammarAccess.getBeziehungRule()); 
            pushFollow(FOLLOW_ruleBeziehung_in_entryRuleBeziehung661);
            ruleBeziehung();

            state._fsp--;

             after(grammarAccess.getBeziehungRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeziehung668); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:349:1: ruleBeziehung : ( ( rule__Beziehung__Group__0 ) ) ;
    public final void ruleBeziehung() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:353:2: ( ( ( rule__Beziehung__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:354:1: ( ( rule__Beziehung__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:354:1: ( ( rule__Beziehung__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:355:1: ( rule__Beziehung__Group__0 )
            {
             before(grammarAccess.getBeziehungAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:356:1: ( rule__Beziehung__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:356:2: rule__Beziehung__Group__0
            {
            pushFollow(FOLLOW_rule__Beziehung__Group__0_in_ruleBeziehung694);
            rule__Beziehung__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeziehungAccess().getGroup()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:368:1: entryRuleInteracts_with : ruleInteracts_with EOF ;
    public final void entryRuleInteracts_with() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:369:1: ( ruleInteracts_with EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:370:1: ruleInteracts_with EOF
            {
             before(grammarAccess.getInteracts_withRule()); 
            pushFollow(FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with721);
            ruleInteracts_with();

            state._fsp--;

             after(grammarAccess.getInteracts_withRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteracts_with728); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:377:1: ruleInteracts_with : ( ( rule__Interacts_with__Group__0 ) ) ;
    public final void ruleInteracts_with() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:381:2: ( ( ( rule__Interacts_with__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:382:1: ( ( rule__Interacts_with__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:382:1: ( ( rule__Interacts_with__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:383:1: ( rule__Interacts_with__Group__0 )
            {
             before(grammarAccess.getInteracts_withAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:384:1: ( rule__Interacts_with__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:384:2: rule__Interacts_with__Group__0
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__0_in_ruleInteracts_with754);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:396:1: entryRuleIs_a : ruleIs_a EOF ;
    public final void entryRuleIs_a() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:397:1: ( ruleIs_a EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:398:1: ruleIs_a EOF
            {
             before(grammarAccess.getIs_aRule()); 
            pushFollow(FOLLOW_ruleIs_a_in_entryRuleIs_a781);
            ruleIs_a();

            state._fsp--;

             after(grammarAccess.getIs_aRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_a788); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:405:1: ruleIs_a : ( ( rule__Is_a__Group__0 ) ) ;
    public final void ruleIs_a() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:409:2: ( ( ( rule__Is_a__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:410:1: ( ( rule__Is_a__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:410:1: ( ( rule__Is_a__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:411:1: ( rule__Is_a__Group__0 )
            {
             before(grammarAccess.getIs_aAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:412:1: ( rule__Is_a__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:412:2: rule__Is_a__Group__0
            {
            pushFollow(FOLLOW_rule__Is_a__Group__0_in_ruleIs_a814);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:424:1: entryRuleIs_part_of : ruleIs_part_of EOF ;
    public final void entryRuleIs_part_of() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:425:1: ( ruleIs_part_of EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:426:1: ruleIs_part_of EOF
            {
             before(grammarAccess.getIs_part_ofRule()); 
            pushFollow(FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of841);
            ruleIs_part_of();

            state._fsp--;

             after(grammarAccess.getIs_part_ofRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_part_of848); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:433:1: ruleIs_part_of : ( ( rule__Is_part_of__Group__0 ) ) ;
    public final void ruleIs_part_of() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:437:2: ( ( ( rule__Is_part_of__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:438:1: ( ( rule__Is_part_of__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:438:1: ( ( rule__Is_part_of__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:439:1: ( rule__Is_part_of__Group__0 )
            {
             before(grammarAccess.getIs_part_ofAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:440:1: ( rule__Is_part_of__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:440:2: rule__Is_part_of__Group__0
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__0_in_ruleIs_part_of874);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:454:1: entryRuleKardinalitaet01 : ruleKardinalitaet01 EOF ;
    public final void entryRuleKardinalitaet01() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:455:1: ( ruleKardinalitaet01 EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:456:1: ruleKardinalitaet01 EOF
            {
             before(grammarAccess.getKardinalitaet01Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet01903);
            ruleKardinalitaet01();

            state._fsp--;

             after(grammarAccess.getKardinalitaet01Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet01910); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:463:1: ruleKardinalitaet01 : ( ( rule__Kardinalitaet01__Group__0 ) ) ;
    public final void ruleKardinalitaet01() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:467:2: ( ( ( rule__Kardinalitaet01__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:468:1: ( ( rule__Kardinalitaet01__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:468:1: ( ( rule__Kardinalitaet01__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:469:1: ( rule__Kardinalitaet01__Group__0 )
            {
             before(grammarAccess.getKardinalitaet01Access().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:470:1: ( rule__Kardinalitaet01__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:470:2: rule__Kardinalitaet01__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__0_in_ruleKardinalitaet01936);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:482:1: entryRuleKardinalitaet0x : ruleKardinalitaet0x EOF ;
    public final void entryRuleKardinalitaet0x() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:483:1: ( ruleKardinalitaet0x EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:484:1: ruleKardinalitaet0x EOF
            {
             before(grammarAccess.getKardinalitaet0xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x963);
            ruleKardinalitaet0x();

            state._fsp--;

             after(grammarAccess.getKardinalitaet0xRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet0x970); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:491:1: ruleKardinalitaet0x : ( ( rule__Kardinalitaet0x__Group__0 ) ) ;
    public final void ruleKardinalitaet0x() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:495:2: ( ( ( rule__Kardinalitaet0x__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:496:1: ( ( rule__Kardinalitaet0x__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:496:1: ( ( rule__Kardinalitaet0x__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:497:1: ( rule__Kardinalitaet0x__Group__0 )
            {
             before(grammarAccess.getKardinalitaet0xAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:498:1: ( rule__Kardinalitaet0x__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:498:2: rule__Kardinalitaet0x__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__0_in_ruleKardinalitaet0x996);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:510:1: entryRuleKardinalitaet11 : ruleKardinalitaet11 EOF ;
    public final void entryRuleKardinalitaet11() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:511:1: ( ruleKardinalitaet11 EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:512:1: ruleKardinalitaet11 EOF
            {
             before(grammarAccess.getKardinalitaet11Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet111023);
            ruleKardinalitaet11();

            state._fsp--;

             after(grammarAccess.getKardinalitaet11Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet111030); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:519:1: ruleKardinalitaet11 : ( ( rule__Kardinalitaet11__Group__0 ) ) ;
    public final void ruleKardinalitaet11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:523:2: ( ( ( rule__Kardinalitaet11__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:524:1: ( ( rule__Kardinalitaet11__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:524:1: ( ( rule__Kardinalitaet11__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:525:1: ( rule__Kardinalitaet11__Group__0 )
            {
             before(grammarAccess.getKardinalitaet11Access().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:526:1: ( rule__Kardinalitaet11__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:526:2: rule__Kardinalitaet11__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__0_in_ruleKardinalitaet111056);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:538:1: entryRuleKardinalitaet1x : ruleKardinalitaet1x EOF ;
    public final void entryRuleKardinalitaet1x() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:539:1: ( ruleKardinalitaet1x EOF )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:540:1: ruleKardinalitaet1x EOF
            {
             before(grammarAccess.getKardinalitaet1xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x1083);
            ruleKardinalitaet1x();

            state._fsp--;

             after(grammarAccess.getKardinalitaet1xRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet1x1090); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:547:1: ruleKardinalitaet1x : ( ( rule__Kardinalitaet1x__Group__0 ) ) ;
    public final void ruleKardinalitaet1x() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:551:2: ( ( ( rule__Kardinalitaet1x__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:552:1: ( ( rule__Kardinalitaet1x__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:552:1: ( ( rule__Kardinalitaet1x__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:553:1: ( rule__Kardinalitaet1x__Group__0 )
            {
             before(grammarAccess.getKardinalitaet1xAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:554:1: ( rule__Kardinalitaet1x__Group__0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:554:2: rule__Kardinalitaet1x__Group__0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__0_in_ruleKardinalitaet1x1116);
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


    // $ANTLR start "rule__Metamodell__Alternatives_2"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:566:1: rule__Metamodell__Alternatives_2 : ( ( ( rule__Metamodell__ObjekttypAssignment_2_0 ) ) | ( ( rule__Metamodell__BeziehungAssignment_2_1 ) ) );
    public final void rule__Metamodell__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:570:1: ( ( ( rule__Metamodell__ObjekttypAssignment_2_0 ) ) | ( ( rule__Metamodell__BeziehungAssignment_2_1 ) ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_ANNOTATION:
                {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=27 && LA1_1<=30)) ) {
                    alt1=1;
                }
                else if ( (LA1_1==RULE_ID||(LA1_1>=31 && LA1_1<=33)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
            case 31:
            case 32:
            case 33:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:571:1: ( ( rule__Metamodell__ObjekttypAssignment_2_0 ) )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:571:1: ( ( rule__Metamodell__ObjekttypAssignment_2_0 ) )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:572:1: ( rule__Metamodell__ObjekttypAssignment_2_0 )
                    {
                     before(grammarAccess.getMetamodellAccess().getObjekttypAssignment_2_0()); 
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:573:1: ( rule__Metamodell__ObjekttypAssignment_2_0 )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:573:2: rule__Metamodell__ObjekttypAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Metamodell__ObjekttypAssignment_2_0_in_rule__Metamodell__Alternatives_21152);
                    rule__Metamodell__ObjekttypAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMetamodellAccess().getObjekttypAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:577:6: ( ( rule__Metamodell__BeziehungAssignment_2_1 ) )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:577:6: ( ( rule__Metamodell__BeziehungAssignment_2_1 ) )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:578:1: ( rule__Metamodell__BeziehungAssignment_2_1 )
                    {
                     before(grammarAccess.getMetamodellAccess().getBeziehungAssignment_2_1()); 
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:579:1: ( rule__Metamodell__BeziehungAssignment_2_1 )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:579:2: rule__Metamodell__BeziehungAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Metamodell__BeziehungAssignment_2_1_in_rule__Metamodell__Alternatives_21170);
                    rule__Metamodell__BeziehungAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMetamodellAccess().getBeziehungAssignment_2_1()); 

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
    // $ANTLR end "rule__Metamodell__Alternatives_2"


    // $ANTLR start "rule__Objekttyp__Alternatives_1"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:588:1: rule__Objekttyp__Alternatives_1 : ( ( ruleKOT ) | ( ruleVOT ) );
    public final void rule__Objekttyp__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:592:1: ( ( ruleKOT ) | ( ruleVOT ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=28 && LA2_0<=30)) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:593:1: ( ruleKOT )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:593:1: ( ruleKOT )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:594:1: ruleKOT
                    {
                     before(grammarAccess.getObjekttypAccess().getKOTParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleKOT_in_rule__Objekttyp__Alternatives_11203);
                    ruleKOT();

                    state._fsp--;

                     after(grammarAccess.getObjekttypAccess().getKOTParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:599:6: ( ruleVOT )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:599:6: ( ruleVOT )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:600:1: ruleVOT
                    {
                     before(grammarAccess.getObjekttypAccess().getVOTParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleVOT_in_rule__Objekttyp__Alternatives_11220);
                    ruleVOT();

                    state._fsp--;

                     after(grammarAccess.getObjekttypAccess().getVOTParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Objekttyp__Alternatives_1"


    // $ANTLR start "rule__Attribut__Alternatives_0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:610:1: rule__Attribut__Alternatives_0 : ( ( ( rule__Attribut__ObjekttypAssignment_0_0 ) ) | ( ( rule__Attribut__Group_0_1__0 ) ) );
    public final void rule__Attribut__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:614:1: ( ( ( rule__Attribut__ObjekttypAssignment_0_0 ) ) | ( ( rule__Attribut__Group_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:615:1: ( ( rule__Attribut__ObjekttypAssignment_0_0 ) )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:615:1: ( ( rule__Attribut__ObjekttypAssignment_0_0 ) )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:616:1: ( rule__Attribut__ObjekttypAssignment_0_0 )
                    {
                     before(grammarAccess.getAttributAccess().getObjekttypAssignment_0_0()); 
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:617:1: ( rule__Attribut__ObjekttypAssignment_0_0 )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:617:2: rule__Attribut__ObjekttypAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Attribut__ObjekttypAssignment_0_0_in_rule__Attribut__Alternatives_01252);
                    rule__Attribut__ObjekttypAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributAccess().getObjekttypAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:621:6: ( ( rule__Attribut__Group_0_1__0 ) )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:621:6: ( ( rule__Attribut__Group_0_1__0 ) )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:622:1: ( rule__Attribut__Group_0_1__0 )
                    {
                     before(grammarAccess.getAttributAccess().getGroup_0_1()); 
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:623:1: ( rule__Attribut__Group_0_1__0 )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:623:2: rule__Attribut__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Attribut__Group_0_1__0_in_rule__Attribut__Alternatives_01270);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:632:1: rule__Anweisung__Alternatives : ( ( ( rule__Anweisung__Group_0__0 ) ) | ( ( rule__Anweisung__Group_1__0 ) ) );
    public final void rule__Anweisung__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:636:1: ( ( ( rule__Anweisung__Group_0__0 ) ) | ( ( rule__Anweisung__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==RULE_ID||LA4_1==21||(LA4_1>=25 && LA4_1<=26)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==24) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:637:1: ( ( rule__Anweisung__Group_0__0 ) )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:637:1: ( ( rule__Anweisung__Group_0__0 ) )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:638:1: ( rule__Anweisung__Group_0__0 )
                    {
                     before(grammarAccess.getAnweisungAccess().getGroup_0()); 
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:639:1: ( rule__Anweisung__Group_0__0 )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:639:2: rule__Anweisung__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Anweisung__Group_0__0_in_rule__Anweisung__Alternatives1303);
                    rule__Anweisung__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnweisungAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:643:6: ( ( rule__Anweisung__Group_1__0 ) )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:643:6: ( ( rule__Anweisung__Group_1__0 ) )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:644:1: ( rule__Anweisung__Group_1__0 )
                    {
                     before(grammarAccess.getAnweisungAccess().getGroup_1()); 
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:645:1: ( rule__Anweisung__Group_1__0 )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:645:2: rule__Anweisung__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Anweisung__Group_1__0_in_rule__Anweisung__Alternatives1321);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:654:1: rule__KOT__Alternatives : ( ( ruleOOT ) | ( ruleLOT ) | ( ruleTOT ) );
    public final void rule__KOT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:658:1: ( ( ruleOOT ) | ( ruleLOT ) | ( ruleTOT ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 30:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:659:1: ( ruleOOT )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:659:1: ( ruleOOT )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:660:1: ruleOOT
                    {
                     before(grammarAccess.getKOTAccess().getOOTParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOOT_in_rule__KOT__Alternatives1354);
                    ruleOOT();

                    state._fsp--;

                     after(grammarAccess.getKOTAccess().getOOTParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:665:6: ( ruleLOT )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:665:6: ( ruleLOT )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:666:1: ruleLOT
                    {
                     before(grammarAccess.getKOTAccess().getLOTParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLOT_in_rule__KOT__Alternatives1371);
                    ruleLOT();

                    state._fsp--;

                     after(grammarAccess.getKOTAccess().getLOTParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:671:6: ( ruleTOT )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:671:6: ( ruleTOT )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:672:1: ruleTOT
                    {
                     before(grammarAccess.getKOTAccess().getTOTParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTOT_in_rule__KOT__Alternatives1388);
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


    // $ANTLR start "rule__Beziehung__Alternatives_1"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:682:1: rule__Beziehung__Alternatives_1 : ( ( ruleIs_a ) | ( ruleInteracts_with ) | ( ruleIs_part_of ) );
    public final void rule__Beziehung__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:686:1: ( ( ruleIs_a ) | ( ruleInteracts_with ) | ( ruleIs_part_of ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
            case 31:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:687:1: ( ruleIs_a )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:687:1: ( ruleIs_a )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:688:1: ruleIs_a
                    {
                     before(grammarAccess.getBeziehungAccess().getIs_aParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleIs_a_in_rule__Beziehung__Alternatives_11420);
                    ruleIs_a();

                    state._fsp--;

                     after(grammarAccess.getBeziehungAccess().getIs_aParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:693:6: ( ruleInteracts_with )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:693:6: ( ruleInteracts_with )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:694:1: ruleInteracts_with
                    {
                     before(grammarAccess.getBeziehungAccess().getInteracts_withParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleInteracts_with_in_rule__Beziehung__Alternatives_11437);
                    ruleInteracts_with();

                    state._fsp--;

                     after(grammarAccess.getBeziehungAccess().getInteracts_withParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:699:6: ( ruleIs_part_of )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:699:6: ( ruleIs_part_of )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:700:1: ruleIs_part_of
                    {
                     before(grammarAccess.getBeziehungAccess().getIs_part_ofParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_ruleIs_part_of_in_rule__Beziehung__Alternatives_11454);
                    ruleIs_part_of();

                    state._fsp--;

                     after(grammarAccess.getBeziehungAccess().getIs_part_ofParserRuleCall_1_2()); 

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
    // $ANTLR end "rule__Beziehung__Alternatives_1"


    // $ANTLR start "rule__Interacts_with__KardinalitaetAlternatives_2_0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:710:1: rule__Interacts_with__KardinalitaetAlternatives_2_0 : ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) );
    public final void rule__Interacts_with__KardinalitaetAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:714:1: ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
            case 15:
                {
                alt7=2;
                }
                break;
            case 18:
            case 19:
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
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:715:1: ( ruleKardinalitaet01 )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:715:1: ( ruleKardinalitaet01 )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:716:1: ruleKardinalitaet01
                    {
                     before(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet01ParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_rule__Interacts_with__KardinalitaetAlternatives_2_01486);
                    ruleKardinalitaet01();

                    state._fsp--;

                     after(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet01ParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:721:6: ( ruleKardinalitaet0x )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:721:6: ( ruleKardinalitaet0x )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:722:1: ruleKardinalitaet0x
                    {
                     before(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet0xParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_rule__Interacts_with__KardinalitaetAlternatives_2_01503);
                    ruleKardinalitaet0x();

                    state._fsp--;

                     after(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet0xParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:727:6: ( ruleKardinalitaet1x )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:727:6: ( ruleKardinalitaet1x )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:728:1: ruleKardinalitaet1x
                    {
                     before(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet1xParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_rule__Interacts_with__KardinalitaetAlternatives_2_01520);
                    ruleKardinalitaet1x();

                    state._fsp--;

                     after(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet1xParserRuleCall_2_0_2()); 

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
    // $ANTLR end "rule__Interacts_with__KardinalitaetAlternatives_2_0"


    // $ANTLR start "rule__Is_a__KardinalitaetAlternatives_2_0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:738:1: rule__Is_a__KardinalitaetAlternatives_2_0 : ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet11 ) );
    public final void rule__Is_a__KardinalitaetAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:742:1: ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet11 ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=12 && LA8_0<=13)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=16 && LA8_0<=17)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:743:1: ( ruleKardinalitaet01 )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:743:1: ( ruleKardinalitaet01 )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:744:1: ruleKardinalitaet01
                    {
                     before(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet01ParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_rule__Is_a__KardinalitaetAlternatives_2_01552);
                    ruleKardinalitaet01();

                    state._fsp--;

                     after(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet01ParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:749:6: ( ruleKardinalitaet11 )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:749:6: ( ruleKardinalitaet11 )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:750:1: ruleKardinalitaet11
                    {
                     before(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet11ParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_ruleKardinalitaet11_in_rule__Is_a__KardinalitaetAlternatives_2_01569);
                    ruleKardinalitaet11();

                    state._fsp--;

                     after(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet11ParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__Is_a__KardinalitaetAlternatives_2_0"


    // $ANTLR start "rule__Is_part_of__KardinalitaetAlternatives_2_0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:760:1: rule__Is_part_of__KardinalitaetAlternatives_2_0 : ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) );
    public final void rule__Is_part_of__KardinalitaetAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:764:1: ( ( ruleKardinalitaet01 ) | ( ruleKardinalitaet0x ) | ( ruleKardinalitaet1x ) )
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
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:765:1: ( ruleKardinalitaet01 )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:765:1: ( ruleKardinalitaet01 )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:766:1: ruleKardinalitaet01
                    {
                     before(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet01ParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_rule__Is_part_of__KardinalitaetAlternatives_2_01601);
                    ruleKardinalitaet01();

                    state._fsp--;

                     after(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet01ParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:771:6: ( ruleKardinalitaet0x )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:771:6: ( ruleKardinalitaet0x )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:772:1: ruleKardinalitaet0x
                    {
                     before(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet0xParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_rule__Is_part_of__KardinalitaetAlternatives_2_01618);
                    ruleKardinalitaet0x();

                    state._fsp--;

                     after(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet0xParserRuleCall_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:777:6: ( ruleKardinalitaet1x )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:777:6: ( ruleKardinalitaet1x )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:778:1: ruleKardinalitaet1x
                    {
                     before(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet1xParserRuleCall_2_0_2()); 
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_rule__Is_part_of__KardinalitaetAlternatives_2_01635);
                    ruleKardinalitaet1x();

                    state._fsp--;

                     after(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet1xParserRuleCall_2_0_2()); 

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
    // $ANTLR end "rule__Is_part_of__KardinalitaetAlternatives_2_0"


    // $ANTLR start "rule__Kardinalitaet01__Alternatives_0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:789:1: rule__Kardinalitaet01__Alternatives_0 : ( ( '(0,1)' ) | ( '--' ) );
    public final void rule__Kardinalitaet01__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:793:1: ( ( '(0,1)' ) | ( '--' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            else if ( (LA10_0==13) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:794:1: ( '(0,1)' )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:794:1: ( '(0,1)' )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:795:1: '(0,1)'
                    {
                     before(grammarAccess.getKardinalitaet01Access().getLeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Kardinalitaet01__Alternatives_01669); 
                     after(grammarAccess.getKardinalitaet01Access().getLeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:802:6: ( '--' )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:802:6: ( '--' )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:803:1: '--'
                    {
                     before(grammarAccess.getKardinalitaet01Access().getHyphenMinusHyphenMinusKeyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Kardinalitaet01__Alternatives_01689); 
                     after(grammarAccess.getKardinalitaet01Access().getHyphenMinusHyphenMinusKeyword_0_1()); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:815:1: rule__Kardinalitaet0x__Alternatives_0 : ( ( '(0,*)' ) | ( '->' ) );
    public final void rule__Kardinalitaet0x__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:819:1: ( ( '(0,*)' ) | ( '->' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            else if ( (LA11_0==15) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:820:1: ( '(0,*)' )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:820:1: ( '(0,*)' )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:821:1: '(0,*)'
                    {
                     before(grammarAccess.getKardinalitaet0xAccess().getLeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Kardinalitaet0x__Alternatives_01724); 
                     after(grammarAccess.getKardinalitaet0xAccess().getLeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:828:6: ( '->' )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:828:6: ( '->' )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:829:1: '->'
                    {
                     before(grammarAccess.getKardinalitaet0xAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Kardinalitaet0x__Alternatives_01744); 
                     after(grammarAccess.getKardinalitaet0xAccess().getHyphenMinusGreaterThanSignKeyword_0_1()); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:841:1: rule__Kardinalitaet11__Alternatives_0 : ( ( '(1,1)' ) | ( '==' ) );
    public final void rule__Kardinalitaet11__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:845:1: ( ( '(1,1)' ) | ( '==' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            else if ( (LA12_0==17) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:846:1: ( '(1,1)' )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:846:1: ( '(1,1)' )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:847:1: '(1,1)'
                    {
                     before(grammarAccess.getKardinalitaet11Access().getLeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Kardinalitaet11__Alternatives_01779); 
                     after(grammarAccess.getKardinalitaet11Access().getLeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:854:6: ( '==' )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:854:6: ( '==' )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:855:1: '=='
                    {
                     before(grammarAccess.getKardinalitaet11Access().getEqualsSignEqualsSignKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Kardinalitaet11__Alternatives_01799); 
                     after(grammarAccess.getKardinalitaet11Access().getEqualsSignEqualsSignKeyword_0_1()); 

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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:867:1: rule__Kardinalitaet1x__Alternatives_0 : ( ( '(1,*)' ) | ( '=>' ) );
    public final void rule__Kardinalitaet1x__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:871:1: ( ( '(1,*)' ) | ( '=>' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            else if ( (LA13_0==19) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:872:1: ( '(1,*)' )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:872:1: ( '(1,*)' )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:873:1: '(1,*)'
                    {
                     before(grammarAccess.getKardinalitaet1xAccess().getLeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__Kardinalitaet1x__Alternatives_01834); 
                     after(grammarAccess.getKardinalitaet1xAccess().getLeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:880:6: ( '=>' )
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:880:6: ( '=>' )
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:881:1: '=>'
                    {
                     before(grammarAccess.getKardinalitaet1xAccess().getEqualsSignGreaterThanSignKeyword_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__Kardinalitaet1x__Alternatives_01854); 
                     after(grammarAccess.getKardinalitaet1xAccess().getEqualsSignGreaterThanSignKeyword_0_1()); 

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


    // $ANTLR start "rule__Metamodell__Group__0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:895:1: rule__Metamodell__Group__0 : rule__Metamodell__Group__0__Impl rule__Metamodell__Group__1 ;
    public final void rule__Metamodell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:899:1: ( rule__Metamodell__Group__0__Impl rule__Metamodell__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:900:2: rule__Metamodell__Group__0__Impl rule__Metamodell__Group__1
            {
            pushFollow(FOLLOW_rule__Metamodell__Group__0__Impl_in_rule__Metamodell__Group__01886);
            rule__Metamodell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metamodell__Group__1_in_rule__Metamodell__Group__01889);
            rule__Metamodell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodell__Group__0"


    // $ANTLR start "rule__Metamodell__Group__0__Impl"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:907:1: rule__Metamodell__Group__0__Impl : ( ( rule__Metamodell__NameAssignment_0 ) ) ;
    public final void rule__Metamodell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:911:1: ( ( ( rule__Metamodell__NameAssignment_0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:912:1: ( ( rule__Metamodell__NameAssignment_0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:912:1: ( ( rule__Metamodell__NameAssignment_0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:913:1: ( rule__Metamodell__NameAssignment_0 )
            {
             before(grammarAccess.getMetamodellAccess().getNameAssignment_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:914:1: ( rule__Metamodell__NameAssignment_0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:914:2: rule__Metamodell__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Metamodell__NameAssignment_0_in_rule__Metamodell__Group__0__Impl1916);
            rule__Metamodell__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodellAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodell__Group__0__Impl"


    // $ANTLR start "rule__Metamodell__Group__1"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:924:1: rule__Metamodell__Group__1 : rule__Metamodell__Group__1__Impl rule__Metamodell__Group__2 ;
    public final void rule__Metamodell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:928:1: ( rule__Metamodell__Group__1__Impl rule__Metamodell__Group__2 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:929:2: rule__Metamodell__Group__1__Impl rule__Metamodell__Group__2
            {
            pushFollow(FOLLOW_rule__Metamodell__Group__1__Impl_in_rule__Metamodell__Group__11946);
            rule__Metamodell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metamodell__Group__2_in_rule__Metamodell__Group__11949);
            rule__Metamodell__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodell__Group__1"


    // $ANTLR start "rule__Metamodell__Group__1__Impl"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:936:1: rule__Metamodell__Group__1__Impl : ( ( rule__Metamodell__VersionAssignment_1 ) ) ;
    public final void rule__Metamodell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:940:1: ( ( ( rule__Metamodell__VersionAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:941:1: ( ( rule__Metamodell__VersionAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:941:1: ( ( rule__Metamodell__VersionAssignment_1 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:942:1: ( rule__Metamodell__VersionAssignment_1 )
            {
             before(grammarAccess.getMetamodellAccess().getVersionAssignment_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:943:1: ( rule__Metamodell__VersionAssignment_1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:943:2: rule__Metamodell__VersionAssignment_1
            {
            pushFollow(FOLLOW_rule__Metamodell__VersionAssignment_1_in_rule__Metamodell__Group__1__Impl1976);
            rule__Metamodell__VersionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetamodellAccess().getVersionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodell__Group__1__Impl"


    // $ANTLR start "rule__Metamodell__Group__2"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:953:1: rule__Metamodell__Group__2 : rule__Metamodell__Group__2__Impl ;
    public final void rule__Metamodell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:957:1: ( rule__Metamodell__Group__2__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:958:2: rule__Metamodell__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Metamodell__Group__2__Impl_in_rule__Metamodell__Group__22006);
            rule__Metamodell__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodell__Group__2"


    // $ANTLR start "rule__Metamodell__Group__2__Impl"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:964:1: rule__Metamodell__Group__2__Impl : ( ( rule__Metamodell__Alternatives_2 )* ) ;
    public final void rule__Metamodell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:968:1: ( ( ( rule__Metamodell__Alternatives_2 )* ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:969:1: ( ( rule__Metamodell__Alternatives_2 )* )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:969:1: ( ( rule__Metamodell__Alternatives_2 )* )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:970:1: ( rule__Metamodell__Alternatives_2 )*
            {
             before(grammarAccess.getMetamodellAccess().getAlternatives_2()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:971:1: ( rule__Metamodell__Alternatives_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ANNOTATION && LA14_0<=RULE_ID)||(LA14_0>=27 && LA14_0<=33)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:971:2: rule__Metamodell__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Metamodell__Alternatives_2_in_rule__Metamodell__Group__2__Impl2033);
            	    rule__Metamodell__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMetamodellAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodell__Group__2__Impl"


    // $ANTLR start "rule__Objekttyp__Group__0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:987:1: rule__Objekttyp__Group__0 : rule__Objekttyp__Group__0__Impl rule__Objekttyp__Group__1 ;
    public final void rule__Objekttyp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:991:1: ( rule__Objekttyp__Group__0__Impl rule__Objekttyp__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:992:2: rule__Objekttyp__Group__0__Impl rule__Objekttyp__Group__1
            {
            pushFollow(FOLLOW_rule__Objekttyp__Group__0__Impl_in_rule__Objekttyp__Group__02070);
            rule__Objekttyp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objekttyp__Group__1_in_rule__Objekttyp__Group__02073);
            rule__Objekttyp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__Group__0"


    // $ANTLR start "rule__Objekttyp__Group__0__Impl"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:999:1: rule__Objekttyp__Group__0__Impl : ( ( RULE_ANNOTATION )? ) ;
    public final void rule__Objekttyp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1003:1: ( ( ( RULE_ANNOTATION )? ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1004:1: ( ( RULE_ANNOTATION )? )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1004:1: ( ( RULE_ANNOTATION )? )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1005:1: ( RULE_ANNOTATION )?
            {
             before(grammarAccess.getObjekttypAccess().getANNOTATIONTerminalRuleCall_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1006:1: ( RULE_ANNOTATION )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ANNOTATION) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1006:3: RULE_ANNOTATION
                    {
                    match(input,RULE_ANNOTATION,FOLLOW_RULE_ANNOTATION_in_rule__Objekttyp__Group__0__Impl2101); 

                    }
                    break;

            }

             after(grammarAccess.getObjekttypAccess().getANNOTATIONTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__Group__0__Impl"


    // $ANTLR start "rule__Objekttyp__Group__1"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1016:1: rule__Objekttyp__Group__1 : rule__Objekttyp__Group__1__Impl rule__Objekttyp__Group__2 ;
    public final void rule__Objekttyp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1020:1: ( rule__Objekttyp__Group__1__Impl rule__Objekttyp__Group__2 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1021:2: rule__Objekttyp__Group__1__Impl rule__Objekttyp__Group__2
            {
            pushFollow(FOLLOW_rule__Objekttyp__Group__1__Impl_in_rule__Objekttyp__Group__12132);
            rule__Objekttyp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objekttyp__Group__2_in_rule__Objekttyp__Group__12135);
            rule__Objekttyp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__Group__1"


    // $ANTLR start "rule__Objekttyp__Group__1__Impl"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1028:1: rule__Objekttyp__Group__1__Impl : ( ( rule__Objekttyp__Alternatives_1 ) ) ;
    public final void rule__Objekttyp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1032:1: ( ( ( rule__Objekttyp__Alternatives_1 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1033:1: ( ( rule__Objekttyp__Alternatives_1 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1033:1: ( ( rule__Objekttyp__Alternatives_1 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1034:1: ( rule__Objekttyp__Alternatives_1 )
            {
             before(grammarAccess.getObjekttypAccess().getAlternatives_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1035:1: ( rule__Objekttyp__Alternatives_1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1035:2: rule__Objekttyp__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Objekttyp__Alternatives_1_in_rule__Objekttyp__Group__1__Impl2162);
            rule__Objekttyp__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getObjekttypAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__Group__1__Impl"


    // $ANTLR start "rule__Objekttyp__Group__2"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1045:1: rule__Objekttyp__Group__2 : rule__Objekttyp__Group__2__Impl rule__Objekttyp__Group__3 ;
    public final void rule__Objekttyp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1049:1: ( rule__Objekttyp__Group__2__Impl rule__Objekttyp__Group__3 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1050:2: rule__Objekttyp__Group__2__Impl rule__Objekttyp__Group__3
            {
            pushFollow(FOLLOW_rule__Objekttyp__Group__2__Impl_in_rule__Objekttyp__Group__22192);
            rule__Objekttyp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objekttyp__Group__3_in_rule__Objekttyp__Group__22195);
            rule__Objekttyp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__Group__2"


    // $ANTLR start "rule__Objekttyp__Group__2__Impl"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1057:1: rule__Objekttyp__Group__2__Impl : ( ( rule__Objekttyp__NameAssignment_2 ) ) ;
    public final void rule__Objekttyp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1061:1: ( ( ( rule__Objekttyp__NameAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1062:1: ( ( rule__Objekttyp__NameAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1062:1: ( ( rule__Objekttyp__NameAssignment_2 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1063:1: ( rule__Objekttyp__NameAssignment_2 )
            {
             before(grammarAccess.getObjekttypAccess().getNameAssignment_2()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1064:1: ( rule__Objekttyp__NameAssignment_2 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1064:2: rule__Objekttyp__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Objekttyp__NameAssignment_2_in_rule__Objekttyp__Group__2__Impl2222);
            rule__Objekttyp__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjekttypAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__Group__2__Impl"


    // $ANTLR start "rule__Objekttyp__Group__3"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1074:1: rule__Objekttyp__Group__3 : rule__Objekttyp__Group__3__Impl rule__Objekttyp__Group__4 ;
    public final void rule__Objekttyp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1078:1: ( rule__Objekttyp__Group__3__Impl rule__Objekttyp__Group__4 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1079:2: rule__Objekttyp__Group__3__Impl rule__Objekttyp__Group__4
            {
            pushFollow(FOLLOW_rule__Objekttyp__Group__3__Impl_in_rule__Objekttyp__Group__32252);
            rule__Objekttyp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objekttyp__Group__4_in_rule__Objekttyp__Group__32255);
            rule__Objekttyp__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__Group__3"


    // $ANTLR start "rule__Objekttyp__Group__3__Impl"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1086:1: rule__Objekttyp__Group__3__Impl : ( '{' ) ;
    public final void rule__Objekttyp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1090:1: ( ( '{' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1091:1: ( '{' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1091:1: ( '{' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1092:1: '{'
            {
             before(grammarAccess.getObjekttypAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Objekttyp__Group__3__Impl2283); 
             after(grammarAccess.getObjekttypAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__Group__3__Impl"


    // $ANTLR start "rule__Objekttyp__Group__4"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1105:1: rule__Objekttyp__Group__4 : rule__Objekttyp__Group__4__Impl rule__Objekttyp__Group__5 ;
    public final void rule__Objekttyp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1109:1: ( rule__Objekttyp__Group__4__Impl rule__Objekttyp__Group__5 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1110:2: rule__Objekttyp__Group__4__Impl rule__Objekttyp__Group__5
            {
            pushFollow(FOLLOW_rule__Objekttyp__Group__4__Impl_in_rule__Objekttyp__Group__42314);
            rule__Objekttyp__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objekttyp__Group__5_in_rule__Objekttyp__Group__42317);
            rule__Objekttyp__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__Group__4"


    // $ANTLR start "rule__Objekttyp__Group__4__Impl"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1117:1: rule__Objekttyp__Group__4__Impl : ( ( rule__Objekttyp__AttributeAssignment_4 )* ) ;
    public final void rule__Objekttyp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1121:1: ( ( ( rule__Objekttyp__AttributeAssignment_4 )* ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1122:1: ( ( rule__Objekttyp__AttributeAssignment_4 )* )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1122:1: ( ( rule__Objekttyp__AttributeAssignment_4 )* )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1123:1: ( rule__Objekttyp__AttributeAssignment_4 )*
            {
             before(grammarAccess.getObjekttypAccess().getAttributeAssignment_4()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1124:1: ( rule__Objekttyp__AttributeAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_ID) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1124:2: rule__Objekttyp__AttributeAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Objekttyp__AttributeAssignment_4_in_rule__Objekttyp__Group__4__Impl2344);
            	    rule__Objekttyp__AttributeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getObjekttypAccess().getAttributeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__Group__4__Impl"


    // $ANTLR start "rule__Objekttyp__Group__5"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1134:1: rule__Objekttyp__Group__5 : rule__Objekttyp__Group__5__Impl rule__Objekttyp__Group__6 ;
    public final void rule__Objekttyp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1138:1: ( rule__Objekttyp__Group__5__Impl rule__Objekttyp__Group__6 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1139:2: rule__Objekttyp__Group__5__Impl rule__Objekttyp__Group__6
            {
            pushFollow(FOLLOW_rule__Objekttyp__Group__5__Impl_in_rule__Objekttyp__Group__52375);
            rule__Objekttyp__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objekttyp__Group__6_in_rule__Objekttyp__Group__52378);
            rule__Objekttyp__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__Group__5"


    // $ANTLR start "rule__Objekttyp__Group__5__Impl"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1146:1: rule__Objekttyp__Group__5__Impl : ( ( rule__Objekttyp__OperatorenAssignment_5 )* ) ;
    public final void rule__Objekttyp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1150:1: ( ( ( rule__Objekttyp__OperatorenAssignment_5 )* ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1151:1: ( ( rule__Objekttyp__OperatorenAssignment_5 )* )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1151:1: ( ( rule__Objekttyp__OperatorenAssignment_5 )* )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1152:1: ( rule__Objekttyp__OperatorenAssignment_5 )*
            {
             before(grammarAccess.getObjekttypAccess().getOperatorenAssignment_5()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1153:1: ( rule__Objekttyp__OperatorenAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1153:2: rule__Objekttyp__OperatorenAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Objekttyp__OperatorenAssignment_5_in_rule__Objekttyp__Group__5__Impl2405);
            	    rule__Objekttyp__OperatorenAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getObjekttypAccess().getOperatorenAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__Group__5__Impl"


    // $ANTLR start "rule__Objekttyp__Group__6"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1163:1: rule__Objekttyp__Group__6 : rule__Objekttyp__Group__6__Impl ;
    public final void rule__Objekttyp__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1167:1: ( rule__Objekttyp__Group__6__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1168:2: rule__Objekttyp__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Objekttyp__Group__6__Impl_in_rule__Objekttyp__Group__62436);
            rule__Objekttyp__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__Group__6"


    // $ANTLR start "rule__Objekttyp__Group__6__Impl"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1174:1: rule__Objekttyp__Group__6__Impl : ( '}' ) ;
    public final void rule__Objekttyp__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1178:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1179:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1179:1: ( '}' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1180:1: '}'
            {
             before(grammarAccess.getObjekttypAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__Objekttyp__Group__6__Impl2464); 
             after(grammarAccess.getObjekttypAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__Group__6__Impl"


    // $ANTLR start "rule__Attribut__Group__0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1207:1: rule__Attribut__Group__0 : rule__Attribut__Group__0__Impl rule__Attribut__Group__1 ;
    public final void rule__Attribut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1211:1: ( rule__Attribut__Group__0__Impl rule__Attribut__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1212:2: rule__Attribut__Group__0__Impl rule__Attribut__Group__1
            {
            pushFollow(FOLLOW_rule__Attribut__Group__0__Impl_in_rule__Attribut__Group__02509);
            rule__Attribut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribut__Group__1_in_rule__Attribut__Group__02512);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1219:1: rule__Attribut__Group__0__Impl : ( ( rule__Attribut__Alternatives_0 ) ) ;
    public final void rule__Attribut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1223:1: ( ( ( rule__Attribut__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1224:1: ( ( rule__Attribut__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1224:1: ( ( rule__Attribut__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1225:1: ( rule__Attribut__Alternatives_0 )
            {
             before(grammarAccess.getAttributAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1226:1: ( rule__Attribut__Alternatives_0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1226:2: rule__Attribut__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Attribut__Alternatives_0_in_rule__Attribut__Group__0__Impl2539);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1236:1: rule__Attribut__Group__1 : rule__Attribut__Group__1__Impl rule__Attribut__Group__2 ;
    public final void rule__Attribut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1240:1: ( rule__Attribut__Group__1__Impl rule__Attribut__Group__2 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1241:2: rule__Attribut__Group__1__Impl rule__Attribut__Group__2
            {
            pushFollow(FOLLOW_rule__Attribut__Group__1__Impl_in_rule__Attribut__Group__12569);
            rule__Attribut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribut__Group__2_in_rule__Attribut__Group__12572);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1248:1: rule__Attribut__Group__1__Impl : ( ( rule__Attribut__NameAssignment_1 ) ) ;
    public final void rule__Attribut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1252:1: ( ( ( rule__Attribut__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1253:1: ( ( rule__Attribut__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1253:1: ( ( rule__Attribut__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1254:1: ( rule__Attribut__NameAssignment_1 )
            {
             before(grammarAccess.getAttributAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1255:1: ( rule__Attribut__NameAssignment_1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1255:2: rule__Attribut__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribut__NameAssignment_1_in_rule__Attribut__Group__1__Impl2599);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1265:1: rule__Attribut__Group__2 : rule__Attribut__Group__2__Impl ;
    public final void rule__Attribut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1269:1: ( rule__Attribut__Group__2__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1270:2: rule__Attribut__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribut__Group__2__Impl_in_rule__Attribut__Group__22629);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1276:1: rule__Attribut__Group__2__Impl : ( ';' ) ;
    public final void rule__Attribut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1280:1: ( ( ';' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1281:1: ( ';' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1281:1: ( ';' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1282:1: ';'
            {
             before(grammarAccess.getAttributAccess().getSemicolonKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Attribut__Group__2__Impl2657); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1301:1: rule__Attribut__Group_0_1__0 : rule__Attribut__Group_0_1__0__Impl rule__Attribut__Group_0_1__1 ;
    public final void rule__Attribut__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1305:1: ( rule__Attribut__Group_0_1__0__Impl rule__Attribut__Group_0_1__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1306:2: rule__Attribut__Group_0_1__0__Impl rule__Attribut__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Attribut__Group_0_1__0__Impl_in_rule__Attribut__Group_0_1__02694);
            rule__Attribut__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribut__Group_0_1__1_in_rule__Attribut__Group_0_1__02697);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1313:1: rule__Attribut__Group_0_1__0__Impl : ( 'DT' ) ;
    public final void rule__Attribut__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1317:1: ( ( 'DT' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1318:1: ( 'DT' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1318:1: ( 'DT' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1319:1: 'DT'
            {
             before(grammarAccess.getAttributAccess().getDTKeyword_0_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Attribut__Group_0_1__0__Impl2725); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1332:1: rule__Attribut__Group_0_1__1 : rule__Attribut__Group_0_1__1__Impl ;
    public final void rule__Attribut__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1336:1: ( rule__Attribut__Group_0_1__1__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1337:2: rule__Attribut__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribut__Group_0_1__1__Impl_in_rule__Attribut__Group_0_1__12756);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1343:1: rule__Attribut__Group_0_1__1__Impl : ( ( rule__Attribut__DatentypAssignment_0_1_1 ) ) ;
    public final void rule__Attribut__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1347:1: ( ( ( rule__Attribut__DatentypAssignment_0_1_1 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1348:1: ( ( rule__Attribut__DatentypAssignment_0_1_1 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1348:1: ( ( rule__Attribut__DatentypAssignment_0_1_1 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1349:1: ( rule__Attribut__DatentypAssignment_0_1_1 )
            {
             before(grammarAccess.getAttributAccess().getDatentypAssignment_0_1_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1350:1: ( rule__Attribut__DatentypAssignment_0_1_1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1350:2: rule__Attribut__DatentypAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Attribut__DatentypAssignment_0_1_1_in_rule__Attribut__Group_0_1__1__Impl2783);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1364:1: rule__Operator__Group__0 : rule__Operator__Group__0__Impl rule__Operator__Group__1 ;
    public final void rule__Operator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1368:1: ( rule__Operator__Group__0__Impl rule__Operator__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1369:2: rule__Operator__Group__0__Impl rule__Operator__Group__1
            {
            pushFollow(FOLLOW_rule__Operator__Group__0__Impl_in_rule__Operator__Group__02817);
            rule__Operator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__1_in_rule__Operator__Group__02820);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1376:1: rule__Operator__Group__0__Impl : ( ( rule__Operator__NameAssignment_0 ) ) ;
    public final void rule__Operator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1380:1: ( ( ( rule__Operator__NameAssignment_0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1381:1: ( ( rule__Operator__NameAssignment_0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1381:1: ( ( rule__Operator__NameAssignment_0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1382:1: ( rule__Operator__NameAssignment_0 )
            {
             before(grammarAccess.getOperatorAccess().getNameAssignment_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1383:1: ( rule__Operator__NameAssignment_0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1383:2: rule__Operator__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Operator__NameAssignment_0_in_rule__Operator__Group__0__Impl2847);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1393:1: rule__Operator__Group__1 : rule__Operator__Group__1__Impl rule__Operator__Group__2 ;
    public final void rule__Operator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1397:1: ( rule__Operator__Group__1__Impl rule__Operator__Group__2 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1398:2: rule__Operator__Group__1__Impl rule__Operator__Group__2
            {
            pushFollow(FOLLOW_rule__Operator__Group__1__Impl_in_rule__Operator__Group__12877);
            rule__Operator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__2_in_rule__Operator__Group__12880);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1405:1: rule__Operator__Group__1__Impl : ( '(' ) ;
    public final void rule__Operator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1409:1: ( ( '(' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1410:1: ( '(' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1410:1: ( '(' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1411:1: '('
            {
             before(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Operator__Group__1__Impl2908); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1424:1: rule__Operator__Group__2 : rule__Operator__Group__2__Impl rule__Operator__Group__3 ;
    public final void rule__Operator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1428:1: ( rule__Operator__Group__2__Impl rule__Operator__Group__3 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1429:2: rule__Operator__Group__2__Impl rule__Operator__Group__3
            {
            pushFollow(FOLLOW_rule__Operator__Group__2__Impl_in_rule__Operator__Group__22939);
            rule__Operator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__3_in_rule__Operator__Group__22942);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1436:1: rule__Operator__Group__2__Impl : ( ( rule__Operator__ParameterAssignment_2 )* ) ;
    public final void rule__Operator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1440:1: ( ( ( rule__Operator__ParameterAssignment_2 )* ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1441:1: ( ( rule__Operator__ParameterAssignment_2 )* )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1441:1: ( ( rule__Operator__ParameterAssignment_2 )* )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1442:1: ( rule__Operator__ParameterAssignment_2 )*
            {
             before(grammarAccess.getOperatorAccess().getParameterAssignment_2()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1443:1: ( rule__Operator__ParameterAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1443:2: rule__Operator__ParameterAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Operator__ParameterAssignment_2_in_rule__Operator__Group__2__Impl2969);
            	    rule__Operator__ParameterAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1453:1: rule__Operator__Group__3 : rule__Operator__Group__3__Impl rule__Operator__Group__4 ;
    public final void rule__Operator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1457:1: ( rule__Operator__Group__3__Impl rule__Operator__Group__4 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1458:2: rule__Operator__Group__3__Impl rule__Operator__Group__4
            {
            pushFollow(FOLLOW_rule__Operator__Group__3__Impl_in_rule__Operator__Group__33000);
            rule__Operator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__4_in_rule__Operator__Group__33003);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1465:1: rule__Operator__Group__3__Impl : ( ') {' ) ;
    public final void rule__Operator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1469:1: ( ( ') {' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1470:1: ( ') {' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1470:1: ( ') {' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1471:1: ') {'
            {
             before(grammarAccess.getOperatorAccess().getRightParenthesisSpaceLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Operator__Group__3__Impl3031); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1484:1: rule__Operator__Group__4 : rule__Operator__Group__4__Impl rule__Operator__Group__5 ;
    public final void rule__Operator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1488:1: ( rule__Operator__Group__4__Impl rule__Operator__Group__5 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1489:2: rule__Operator__Group__4__Impl rule__Operator__Group__5
            {
            pushFollow(FOLLOW_rule__Operator__Group__4__Impl_in_rule__Operator__Group__43062);
            rule__Operator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operator__Group__5_in_rule__Operator__Group__43065);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1496:1: rule__Operator__Group__4__Impl : ( ( rule__Operator__AnweisungenAssignment_4 )* ) ;
    public final void rule__Operator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1500:1: ( ( ( rule__Operator__AnweisungenAssignment_4 )* ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1501:1: ( ( rule__Operator__AnweisungenAssignment_4 )* )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1501:1: ( ( rule__Operator__AnweisungenAssignment_4 )* )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1502:1: ( rule__Operator__AnweisungenAssignment_4 )*
            {
             before(grammarAccess.getOperatorAccess().getAnweisungenAssignment_4()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1503:1: ( rule__Operator__AnweisungenAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1503:2: rule__Operator__AnweisungenAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Operator__AnweisungenAssignment_4_in_rule__Operator__Group__4__Impl3092);
            	    rule__Operator__AnweisungenAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1513:1: rule__Operator__Group__5 : rule__Operator__Group__5__Impl ;
    public final void rule__Operator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1517:1: ( rule__Operator__Group__5__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1518:2: rule__Operator__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Operator__Group__5__Impl_in_rule__Operator__Group__53123);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1524:1: rule__Operator__Group__5__Impl : ( '}' ) ;
    public final void rule__Operator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1528:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1529:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1529:1: ( '}' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1530:1: '}'
            {
             before(grammarAccess.getOperatorAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Operator__Group__5__Impl3151); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1555:1: rule__Anweisung__Group_0__0 : rule__Anweisung__Group_0__0__Impl rule__Anweisung__Group_0__1 ;
    public final void rule__Anweisung__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1559:1: ( rule__Anweisung__Group_0__0__Impl rule__Anweisung__Group_0__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1560:2: rule__Anweisung__Group_0__0__Impl rule__Anweisung__Group_0__1
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_0__0__Impl_in_rule__Anweisung__Group_0__03194);
            rule__Anweisung__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Anweisung__Group_0__1_in_rule__Anweisung__Group_0__03197);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1567:1: rule__Anweisung__Group_0__0__Impl : ( ( rule__Anweisung__KontrollstrukturAssignment_0_0 ) ) ;
    public final void rule__Anweisung__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1571:1: ( ( ( rule__Anweisung__KontrollstrukturAssignment_0_0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1572:1: ( ( rule__Anweisung__KontrollstrukturAssignment_0_0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1572:1: ( ( rule__Anweisung__KontrollstrukturAssignment_0_0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1573:1: ( rule__Anweisung__KontrollstrukturAssignment_0_0 )
            {
             before(grammarAccess.getAnweisungAccess().getKontrollstrukturAssignment_0_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1574:1: ( rule__Anweisung__KontrollstrukturAssignment_0_0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1574:2: rule__Anweisung__KontrollstrukturAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Anweisung__KontrollstrukturAssignment_0_0_in_rule__Anweisung__Group_0__0__Impl3224);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1584:1: rule__Anweisung__Group_0__1 : rule__Anweisung__Group_0__1__Impl rule__Anweisung__Group_0__2 ;
    public final void rule__Anweisung__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1588:1: ( rule__Anweisung__Group_0__1__Impl rule__Anweisung__Group_0__2 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1589:2: rule__Anweisung__Group_0__1__Impl rule__Anweisung__Group_0__2
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_0__1__Impl_in_rule__Anweisung__Group_0__13254);
            rule__Anweisung__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Anweisung__Group_0__2_in_rule__Anweisung__Group_0__13257);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1596:1: rule__Anweisung__Group_0__1__Impl : ( '(' ) ;
    public final void rule__Anweisung__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1600:1: ( ( '(' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1601:1: ( '(' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1601:1: ( '(' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1602:1: '('
            {
             before(grammarAccess.getAnweisungAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,24,FOLLOW_24_in_rule__Anweisung__Group_0__1__Impl3285); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1615:1: rule__Anweisung__Group_0__2 : rule__Anweisung__Group_0__2__Impl rule__Anweisung__Group_0__3 ;
    public final void rule__Anweisung__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1619:1: ( rule__Anweisung__Group_0__2__Impl rule__Anweisung__Group_0__3 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1620:2: rule__Anweisung__Group_0__2__Impl rule__Anweisung__Group_0__3
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_0__2__Impl_in_rule__Anweisung__Group_0__23316);
            rule__Anweisung__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Anweisung__Group_0__3_in_rule__Anweisung__Group_0__23319);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1627:1: rule__Anweisung__Group_0__2__Impl : ( ( rule__Anweisung__BedingungAssignment_0_2 ) ) ;
    public final void rule__Anweisung__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1631:1: ( ( ( rule__Anweisung__BedingungAssignment_0_2 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1632:1: ( ( rule__Anweisung__BedingungAssignment_0_2 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1632:1: ( ( rule__Anweisung__BedingungAssignment_0_2 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1633:1: ( rule__Anweisung__BedingungAssignment_0_2 )
            {
             before(grammarAccess.getAnweisungAccess().getBedingungAssignment_0_2()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1634:1: ( rule__Anweisung__BedingungAssignment_0_2 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1634:2: rule__Anweisung__BedingungAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Anweisung__BedingungAssignment_0_2_in_rule__Anweisung__Group_0__2__Impl3346);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1644:1: rule__Anweisung__Group_0__3 : rule__Anweisung__Group_0__3__Impl rule__Anweisung__Group_0__4 ;
    public final void rule__Anweisung__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1648:1: ( rule__Anweisung__Group_0__3__Impl rule__Anweisung__Group_0__4 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1649:2: rule__Anweisung__Group_0__3__Impl rule__Anweisung__Group_0__4
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_0__3__Impl_in_rule__Anweisung__Group_0__33376);
            rule__Anweisung__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Anweisung__Group_0__4_in_rule__Anweisung__Group_0__33379);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1656:1: rule__Anweisung__Group_0__3__Impl : ( ') {' ) ;
    public final void rule__Anweisung__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1660:1: ( ( ') {' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1661:1: ( ') {' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1661:1: ( ') {' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1662:1: ') {'
            {
             before(grammarAccess.getAnweisungAccess().getRightParenthesisSpaceLeftCurlyBracketKeyword_0_3()); 
            match(input,25,FOLLOW_25_in_rule__Anweisung__Group_0__3__Impl3407); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1675:1: rule__Anweisung__Group_0__4 : rule__Anweisung__Group_0__4__Impl rule__Anweisung__Group_0__5 ;
    public final void rule__Anweisung__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1679:1: ( rule__Anweisung__Group_0__4__Impl rule__Anweisung__Group_0__5 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1680:2: rule__Anweisung__Group_0__4__Impl rule__Anweisung__Group_0__5
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_0__4__Impl_in_rule__Anweisung__Group_0__43438);
            rule__Anweisung__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Anweisung__Group_0__5_in_rule__Anweisung__Group_0__43441);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1687:1: rule__Anweisung__Group_0__4__Impl : ( ( rule__Anweisung__BedigteAnweisungenAssignment_0_4 )* ) ;
    public final void rule__Anweisung__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1691:1: ( ( ( rule__Anweisung__BedigteAnweisungenAssignment_0_4 )* ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1692:1: ( ( rule__Anweisung__BedigteAnweisungenAssignment_0_4 )* )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1692:1: ( ( rule__Anweisung__BedigteAnweisungenAssignment_0_4 )* )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1693:1: ( rule__Anweisung__BedigteAnweisungenAssignment_0_4 )*
            {
             before(grammarAccess.getAnweisungAccess().getBedigteAnweisungenAssignment_0_4()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1694:1: ( rule__Anweisung__BedigteAnweisungenAssignment_0_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1694:2: rule__Anweisung__BedigteAnweisungenAssignment_0_4
            	    {
            	    pushFollow(FOLLOW_rule__Anweisung__BedigteAnweisungenAssignment_0_4_in_rule__Anweisung__Group_0__4__Impl3468);
            	    rule__Anweisung__BedigteAnweisungenAssignment_0_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1704:1: rule__Anweisung__Group_0__5 : rule__Anweisung__Group_0__5__Impl ;
    public final void rule__Anweisung__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1708:1: ( rule__Anweisung__Group_0__5__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1709:2: rule__Anweisung__Group_0__5__Impl
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_0__5__Impl_in_rule__Anweisung__Group_0__53499);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1715:1: rule__Anweisung__Group_0__5__Impl : ( '}' ) ;
    public final void rule__Anweisung__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1719:1: ( ( '}' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1720:1: ( '}' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1720:1: ( '}' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1721:1: '}'
            {
             before(grammarAccess.getAnweisungAccess().getRightCurlyBracketKeyword_0_5()); 
            match(input,21,FOLLOW_21_in_rule__Anweisung__Group_0__5__Impl3527); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1746:1: rule__Anweisung__Group_1__0 : rule__Anweisung__Group_1__0__Impl rule__Anweisung__Group_1__1 ;
    public final void rule__Anweisung__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1750:1: ( rule__Anweisung__Group_1__0__Impl rule__Anweisung__Group_1__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1751:2: rule__Anweisung__Group_1__0__Impl rule__Anweisung__Group_1__1
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_1__0__Impl_in_rule__Anweisung__Group_1__03570);
            rule__Anweisung__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Anweisung__Group_1__1_in_rule__Anweisung__Group_1__03573);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1758:1: rule__Anweisung__Group_1__0__Impl : ( ( rule__Anweisung__Group_1_0__0 )? ) ;
    public final void rule__Anweisung__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1762:1: ( ( ( rule__Anweisung__Group_1_0__0 )? ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1763:1: ( ( rule__Anweisung__Group_1_0__0 )? )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1763:1: ( ( rule__Anweisung__Group_1_0__0 )? )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1764:1: ( rule__Anweisung__Group_1_0__0 )?
            {
             before(grammarAccess.getAnweisungAccess().getGroup_1_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1765:1: ( rule__Anweisung__Group_1_0__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==26) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1765:2: rule__Anweisung__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Anweisung__Group_1_0__0_in_rule__Anweisung__Group_1__0__Impl3600);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1775:1: rule__Anweisung__Group_1__1 : rule__Anweisung__Group_1__1__Impl ;
    public final void rule__Anweisung__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1779:1: ( rule__Anweisung__Group_1__1__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1780:2: rule__Anweisung__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_1__1__Impl_in_rule__Anweisung__Group_1__13631);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1786:1: rule__Anweisung__Group_1__1__Impl : ( ( rule__Anweisung__OperatorAssignment_1_1 ) ) ;
    public final void rule__Anweisung__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1790:1: ( ( ( rule__Anweisung__OperatorAssignment_1_1 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1791:1: ( ( rule__Anweisung__OperatorAssignment_1_1 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1791:1: ( ( rule__Anweisung__OperatorAssignment_1_1 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1792:1: ( rule__Anweisung__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAnweisungAccess().getOperatorAssignment_1_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1793:1: ( rule__Anweisung__OperatorAssignment_1_1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1793:2: rule__Anweisung__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Anweisung__OperatorAssignment_1_1_in_rule__Anweisung__Group_1__1__Impl3658);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1807:1: rule__Anweisung__Group_1_0__0 : rule__Anweisung__Group_1_0__0__Impl rule__Anweisung__Group_1_0__1 ;
    public final void rule__Anweisung__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1811:1: ( rule__Anweisung__Group_1_0__0__Impl rule__Anweisung__Group_1_0__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1812:2: rule__Anweisung__Group_1_0__0__Impl rule__Anweisung__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_1_0__0__Impl_in_rule__Anweisung__Group_1_0__03692);
            rule__Anweisung__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Anweisung__Group_1_0__1_in_rule__Anweisung__Group_1_0__03695);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1819:1: rule__Anweisung__Group_1_0__0__Impl : ( ( rule__Anweisung__ObjektAssignment_1_0_0 ) ) ;
    public final void rule__Anweisung__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1823:1: ( ( ( rule__Anweisung__ObjektAssignment_1_0_0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1824:1: ( ( rule__Anweisung__ObjektAssignment_1_0_0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1824:1: ( ( rule__Anweisung__ObjektAssignment_1_0_0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1825:1: ( rule__Anweisung__ObjektAssignment_1_0_0 )
            {
             before(grammarAccess.getAnweisungAccess().getObjektAssignment_1_0_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1826:1: ( rule__Anweisung__ObjektAssignment_1_0_0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1826:2: rule__Anweisung__ObjektAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__Anweisung__ObjektAssignment_1_0_0_in_rule__Anweisung__Group_1_0__0__Impl3722);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1836:1: rule__Anweisung__Group_1_0__1 : rule__Anweisung__Group_1_0__1__Impl ;
    public final void rule__Anweisung__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1840:1: ( rule__Anweisung__Group_1_0__1__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1841:2: rule__Anweisung__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Anweisung__Group_1_0__1__Impl_in_rule__Anweisung__Group_1_0__13752);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1847:1: rule__Anweisung__Group_1_0__1__Impl : ( '.' ) ;
    public final void rule__Anweisung__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1851:1: ( ( '.' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1852:1: ( '.' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1852:1: ( '.' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1853:1: '.'
            {
             before(grammarAccess.getAnweisungAccess().getFullStopKeyword_1_0_1()); 
            match(input,26,FOLLOW_26_in_rule__Anweisung__Group_1_0__1__Impl3780); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1870:1: rule__VOT__Group__0 : rule__VOT__Group__0__Impl rule__VOT__Group__1 ;
    public final void rule__VOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1874:1: ( rule__VOT__Group__0__Impl rule__VOT__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1875:2: rule__VOT__Group__0__Impl rule__VOT__Group__1
            {
            pushFollow(FOLLOW_rule__VOT__Group__0__Impl_in_rule__VOT__Group__03815);
            rule__VOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VOT__Group__1_in_rule__VOT__Group__03818);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1882:1: rule__VOT__Group__0__Impl : ( 'VOT' ) ;
    public final void rule__VOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1886:1: ( ( 'VOT' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1887:1: ( 'VOT' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1887:1: ( 'VOT' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1888:1: 'VOT'
            {
             before(grammarAccess.getVOTAccess().getVOTKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__VOT__Group__0__Impl3846); 
             after(grammarAccess.getVOTAccess().getVOTKeyword_0()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1901:1: rule__VOT__Group__1 : rule__VOT__Group__1__Impl ;
    public final void rule__VOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1905:1: ( rule__VOT__Group__1__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1906:2: rule__VOT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VOT__Group__1__Impl_in_rule__VOT__Group__13877);
            rule__VOT__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1912:1: rule__VOT__Group__1__Impl : ( () ) ;
    public final void rule__VOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1916:1: ( ( () ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1917:1: ( () )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1917:1: ( () )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1918:1: ()
            {
             before(grammarAccess.getVOTAccess().getVOTAction_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1919:1: ()
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1921:1: 
            {
            }

             after(grammarAccess.getVOTAccess().getVOTAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VOT__Group__1__Impl"


    // $ANTLR start "rule__OOT__Group__0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1935:1: rule__OOT__Group__0 : rule__OOT__Group__0__Impl rule__OOT__Group__1 ;
    public final void rule__OOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1939:1: ( rule__OOT__Group__0__Impl rule__OOT__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1940:2: rule__OOT__Group__0__Impl rule__OOT__Group__1
            {
            pushFollow(FOLLOW_rule__OOT__Group__0__Impl_in_rule__OOT__Group__03939);
            rule__OOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OOT__Group__1_in_rule__OOT__Group__03942);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1947:1: rule__OOT__Group__0__Impl : ( 'OOT' ) ;
    public final void rule__OOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1951:1: ( ( 'OOT' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1952:1: ( 'OOT' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1952:1: ( 'OOT' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1953:1: 'OOT'
            {
             before(grammarAccess.getOOTAccess().getOOTKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__OOT__Group__0__Impl3970); 
             after(grammarAccess.getOOTAccess().getOOTKeyword_0()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1966:1: rule__OOT__Group__1 : rule__OOT__Group__1__Impl ;
    public final void rule__OOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1970:1: ( rule__OOT__Group__1__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1971:2: rule__OOT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OOT__Group__1__Impl_in_rule__OOT__Group__14001);
            rule__OOT__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1977:1: rule__OOT__Group__1__Impl : ( () ) ;
    public final void rule__OOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1981:1: ( ( () ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1982:1: ( () )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1982:1: ( () )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1983:1: ()
            {
             before(grammarAccess.getOOTAccess().getOOTAction_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1984:1: ()
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1986:1: 
            {
            }

             after(grammarAccess.getOOTAccess().getOOTAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OOT__Group__1__Impl"


    // $ANTLR start "rule__LOT__Group__0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2000:1: rule__LOT__Group__0 : rule__LOT__Group__0__Impl rule__LOT__Group__1 ;
    public final void rule__LOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2004:1: ( rule__LOT__Group__0__Impl rule__LOT__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2005:2: rule__LOT__Group__0__Impl rule__LOT__Group__1
            {
            pushFollow(FOLLOW_rule__LOT__Group__0__Impl_in_rule__LOT__Group__04063);
            rule__LOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LOT__Group__1_in_rule__LOT__Group__04066);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2012:1: rule__LOT__Group__0__Impl : ( 'LOT' ) ;
    public final void rule__LOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2016:1: ( ( 'LOT' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2017:1: ( 'LOT' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2017:1: ( 'LOT' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2018:1: 'LOT'
            {
             before(grammarAccess.getLOTAccess().getLOTKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__LOT__Group__0__Impl4094); 
             after(grammarAccess.getLOTAccess().getLOTKeyword_0()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2031:1: rule__LOT__Group__1 : rule__LOT__Group__1__Impl ;
    public final void rule__LOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2035:1: ( rule__LOT__Group__1__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2036:2: rule__LOT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LOT__Group__1__Impl_in_rule__LOT__Group__14125);
            rule__LOT__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2042:1: rule__LOT__Group__1__Impl : ( () ) ;
    public final void rule__LOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2046:1: ( ( () ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2047:1: ( () )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2047:1: ( () )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2048:1: ()
            {
             before(grammarAccess.getLOTAccess().getLOTAction_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2049:1: ()
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2051:1: 
            {
            }

             after(grammarAccess.getLOTAccess().getLOTAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LOT__Group__1__Impl"


    // $ANTLR start "rule__TOT__Group__0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2065:1: rule__TOT__Group__0 : rule__TOT__Group__0__Impl rule__TOT__Group__1 ;
    public final void rule__TOT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2069:1: ( rule__TOT__Group__0__Impl rule__TOT__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2070:2: rule__TOT__Group__0__Impl rule__TOT__Group__1
            {
            pushFollow(FOLLOW_rule__TOT__Group__0__Impl_in_rule__TOT__Group__04187);
            rule__TOT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TOT__Group__1_in_rule__TOT__Group__04190);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2077:1: rule__TOT__Group__0__Impl : ( 'TOT' ) ;
    public final void rule__TOT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2081:1: ( ( 'TOT' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2082:1: ( 'TOT' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2082:1: ( 'TOT' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2083:1: 'TOT'
            {
             before(grammarAccess.getTOTAccess().getTOTKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__TOT__Group__0__Impl4218); 
             after(grammarAccess.getTOTAccess().getTOTKeyword_0()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2096:1: rule__TOT__Group__1 : rule__TOT__Group__1__Impl ;
    public final void rule__TOT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2100:1: ( rule__TOT__Group__1__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2101:2: rule__TOT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TOT__Group__1__Impl_in_rule__TOT__Group__14249);
            rule__TOT__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2107:1: rule__TOT__Group__1__Impl : ( () ) ;
    public final void rule__TOT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2111:1: ( ( () ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2112:1: ( () )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2112:1: ( () )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2113:1: ()
            {
             before(grammarAccess.getTOTAccess().getTOTAction_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2114:1: ()
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2116:1: 
            {
            }

             after(grammarAccess.getTOTAccess().getTOTAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TOT__Group__1__Impl"


    // $ANTLR start "rule__Beziehung__Group__0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2130:1: rule__Beziehung__Group__0 : rule__Beziehung__Group__0__Impl rule__Beziehung__Group__1 ;
    public final void rule__Beziehung__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2134:1: ( rule__Beziehung__Group__0__Impl rule__Beziehung__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2135:2: rule__Beziehung__Group__0__Impl rule__Beziehung__Group__1
            {
            pushFollow(FOLLOW_rule__Beziehung__Group__0__Impl_in_rule__Beziehung__Group__04311);
            rule__Beziehung__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Beziehung__Group__1_in_rule__Beziehung__Group__04314);
            rule__Beziehung__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__0"


    // $ANTLR start "rule__Beziehung__Group__0__Impl"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2142:1: rule__Beziehung__Group__0__Impl : ( ( RULE_ANNOTATION )? ) ;
    public final void rule__Beziehung__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2146:1: ( ( ( RULE_ANNOTATION )? ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2147:1: ( ( RULE_ANNOTATION )? )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2147:1: ( ( RULE_ANNOTATION )? )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2148:1: ( RULE_ANNOTATION )?
            {
             before(grammarAccess.getBeziehungAccess().getANNOTATIONTerminalRuleCall_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2149:1: ( RULE_ANNOTATION )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ANNOTATION) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2149:3: RULE_ANNOTATION
                    {
                    match(input,RULE_ANNOTATION,FOLLOW_RULE_ANNOTATION_in_rule__Beziehung__Group__0__Impl4342); 

                    }
                    break;

            }

             after(grammarAccess.getBeziehungAccess().getANNOTATIONTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__0__Impl"


    // $ANTLR start "rule__Beziehung__Group__1"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2159:1: rule__Beziehung__Group__1 : rule__Beziehung__Group__1__Impl ;
    public final void rule__Beziehung__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2163:1: ( rule__Beziehung__Group__1__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2164:2: rule__Beziehung__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Beziehung__Group__1__Impl_in_rule__Beziehung__Group__14373);
            rule__Beziehung__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__1"


    // $ANTLR start "rule__Beziehung__Group__1__Impl"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2170:1: rule__Beziehung__Group__1__Impl : ( ( rule__Beziehung__Alternatives_1 ) ) ;
    public final void rule__Beziehung__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2174:1: ( ( ( rule__Beziehung__Alternatives_1 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2175:1: ( ( rule__Beziehung__Alternatives_1 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2175:1: ( ( rule__Beziehung__Alternatives_1 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2176:1: ( rule__Beziehung__Alternatives_1 )
            {
             before(grammarAccess.getBeziehungAccess().getAlternatives_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2177:1: ( rule__Beziehung__Alternatives_1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2177:2: rule__Beziehung__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Beziehung__Alternatives_1_in_rule__Beziehung__Group__1__Impl4400);
            rule__Beziehung__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBeziehungAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Beziehung__Group__1__Impl"


    // $ANTLR start "rule__Interacts_with__Group__0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2191:1: rule__Interacts_with__Group__0 : rule__Interacts_with__Group__0__Impl rule__Interacts_with__Group__1 ;
    public final void rule__Interacts_with__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2195:1: ( rule__Interacts_with__Group__0__Impl rule__Interacts_with__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2196:2: rule__Interacts_with__Group__0__Impl rule__Interacts_with__Group__1
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__0__Impl_in_rule__Interacts_with__Group__04434);
            rule__Interacts_with__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__1_in_rule__Interacts_with__Group__04437);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2203:1: rule__Interacts_with__Group__0__Impl : ( ( 'interacts_with:' )? ) ;
    public final void rule__Interacts_with__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2207:1: ( ( ( 'interacts_with:' )? ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2208:1: ( ( 'interacts_with:' )? )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2208:1: ( ( 'interacts_with:' )? )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2209:1: ( 'interacts_with:' )?
            {
             before(grammarAccess.getInteracts_withAccess().getInteracts_withKeyword_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2210:1: ( 'interacts_with:' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2211:2: 'interacts_with:'
                    {
                    match(input,31,FOLLOW_31_in_rule__Interacts_with__Group__0__Impl4466); 

                    }
                    break;

            }

             after(grammarAccess.getInteracts_withAccess().getInteracts_withKeyword_0()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2222:1: rule__Interacts_with__Group__1 : rule__Interacts_with__Group__1__Impl rule__Interacts_with__Group__2 ;
    public final void rule__Interacts_with__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2226:1: ( rule__Interacts_with__Group__1__Impl rule__Interacts_with__Group__2 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2227:2: rule__Interacts_with__Group__1__Impl rule__Interacts_with__Group__2
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__1__Impl_in_rule__Interacts_with__Group__14499);
            rule__Interacts_with__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__2_in_rule__Interacts_with__Group__14502);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2234:1: rule__Interacts_with__Group__1__Impl : ( ( rule__Interacts_with__Objekttyp1Assignment_1 ) ) ;
    public final void rule__Interacts_with__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2238:1: ( ( ( rule__Interacts_with__Objekttyp1Assignment_1 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2239:1: ( ( rule__Interacts_with__Objekttyp1Assignment_1 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2239:1: ( ( rule__Interacts_with__Objekttyp1Assignment_1 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2240:1: ( rule__Interacts_with__Objekttyp1Assignment_1 )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp1Assignment_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2241:1: ( rule__Interacts_with__Objekttyp1Assignment_1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2241:2: rule__Interacts_with__Objekttyp1Assignment_1
            {
            pushFollow(FOLLOW_rule__Interacts_with__Objekttyp1Assignment_1_in_rule__Interacts_with__Group__1__Impl4529);
            rule__Interacts_with__Objekttyp1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInteracts_withAccess().getObjekttyp1Assignment_1()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2251:1: rule__Interacts_with__Group__2 : rule__Interacts_with__Group__2__Impl rule__Interacts_with__Group__3 ;
    public final void rule__Interacts_with__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2255:1: ( rule__Interacts_with__Group__2__Impl rule__Interacts_with__Group__3 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2256:2: rule__Interacts_with__Group__2__Impl rule__Interacts_with__Group__3
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__2__Impl_in_rule__Interacts_with__Group__24559);
            rule__Interacts_with__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interacts_with__Group__3_in_rule__Interacts_with__Group__24562);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2263:1: rule__Interacts_with__Group__2__Impl : ( ( rule__Interacts_with__KardinalitaetAssignment_2 ) ) ;
    public final void rule__Interacts_with__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2267:1: ( ( ( rule__Interacts_with__KardinalitaetAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2268:1: ( ( rule__Interacts_with__KardinalitaetAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2268:1: ( ( rule__Interacts_with__KardinalitaetAssignment_2 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2269:1: ( rule__Interacts_with__KardinalitaetAssignment_2 )
            {
             before(grammarAccess.getInteracts_withAccess().getKardinalitaetAssignment_2()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2270:1: ( rule__Interacts_with__KardinalitaetAssignment_2 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2270:2: rule__Interacts_with__KardinalitaetAssignment_2
            {
            pushFollow(FOLLOW_rule__Interacts_with__KardinalitaetAssignment_2_in_rule__Interacts_with__Group__2__Impl4589);
            rule__Interacts_with__KardinalitaetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInteracts_withAccess().getKardinalitaetAssignment_2()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2280:1: rule__Interacts_with__Group__3 : rule__Interacts_with__Group__3__Impl ;
    public final void rule__Interacts_with__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2284:1: ( rule__Interacts_with__Group__3__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2285:2: rule__Interacts_with__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Interacts_with__Group__3__Impl_in_rule__Interacts_with__Group__34619);
            rule__Interacts_with__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2291:1: rule__Interacts_with__Group__3__Impl : ( ( rule__Interacts_with__Objekttyp2Assignment_3 ) ) ;
    public final void rule__Interacts_with__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2295:1: ( ( ( rule__Interacts_with__Objekttyp2Assignment_3 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2296:1: ( ( rule__Interacts_with__Objekttyp2Assignment_3 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2296:1: ( ( rule__Interacts_with__Objekttyp2Assignment_3 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2297:1: ( rule__Interacts_with__Objekttyp2Assignment_3 )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp2Assignment_3()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2298:1: ( rule__Interacts_with__Objekttyp2Assignment_3 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2298:2: rule__Interacts_with__Objekttyp2Assignment_3
            {
            pushFollow(FOLLOW_rule__Interacts_with__Objekttyp2Assignment_3_in_rule__Interacts_with__Group__3__Impl4646);
            rule__Interacts_with__Objekttyp2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInteracts_withAccess().getObjekttyp2Assignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Is_a__Group__0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2316:1: rule__Is_a__Group__0 : rule__Is_a__Group__0__Impl rule__Is_a__Group__1 ;
    public final void rule__Is_a__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2320:1: ( rule__Is_a__Group__0__Impl rule__Is_a__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2321:2: rule__Is_a__Group__0__Impl rule__Is_a__Group__1
            {
            pushFollow(FOLLOW_rule__Is_a__Group__0__Impl_in_rule__Is_a__Group__04684);
            rule__Is_a__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__1_in_rule__Is_a__Group__04687);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2328:1: rule__Is_a__Group__0__Impl : ( 'is_a:' ) ;
    public final void rule__Is_a__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2332:1: ( ( 'is_a:' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2333:1: ( 'is_a:' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2333:1: ( 'is_a:' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2334:1: 'is_a:'
            {
             before(grammarAccess.getIs_aAccess().getIs_aKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Is_a__Group__0__Impl4715); 
             after(grammarAccess.getIs_aAccess().getIs_aKeyword_0()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2347:1: rule__Is_a__Group__1 : rule__Is_a__Group__1__Impl rule__Is_a__Group__2 ;
    public final void rule__Is_a__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2351:1: ( rule__Is_a__Group__1__Impl rule__Is_a__Group__2 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2352:2: rule__Is_a__Group__1__Impl rule__Is_a__Group__2
            {
            pushFollow(FOLLOW_rule__Is_a__Group__1__Impl_in_rule__Is_a__Group__14746);
            rule__Is_a__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__2_in_rule__Is_a__Group__14749);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2359:1: rule__Is_a__Group__1__Impl : ( ( rule__Is_a__Objekttyp1Assignment_1 ) ) ;
    public final void rule__Is_a__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2363:1: ( ( ( rule__Is_a__Objekttyp1Assignment_1 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2364:1: ( ( rule__Is_a__Objekttyp1Assignment_1 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2364:1: ( ( rule__Is_a__Objekttyp1Assignment_1 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2365:1: ( rule__Is_a__Objekttyp1Assignment_1 )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp1Assignment_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2366:1: ( rule__Is_a__Objekttyp1Assignment_1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2366:2: rule__Is_a__Objekttyp1Assignment_1
            {
            pushFollow(FOLLOW_rule__Is_a__Objekttyp1Assignment_1_in_rule__Is_a__Group__1__Impl4776);
            rule__Is_a__Objekttyp1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIs_aAccess().getObjekttyp1Assignment_1()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2376:1: rule__Is_a__Group__2 : rule__Is_a__Group__2__Impl rule__Is_a__Group__3 ;
    public final void rule__Is_a__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2380:1: ( rule__Is_a__Group__2__Impl rule__Is_a__Group__3 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2381:2: rule__Is_a__Group__2__Impl rule__Is_a__Group__3
            {
            pushFollow(FOLLOW_rule__Is_a__Group__2__Impl_in_rule__Is_a__Group__24806);
            rule__Is_a__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_a__Group__3_in_rule__Is_a__Group__24809);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2388:1: rule__Is_a__Group__2__Impl : ( ( rule__Is_a__KardinalitaetAssignment_2 ) ) ;
    public final void rule__Is_a__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2392:1: ( ( ( rule__Is_a__KardinalitaetAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2393:1: ( ( rule__Is_a__KardinalitaetAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2393:1: ( ( rule__Is_a__KardinalitaetAssignment_2 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2394:1: ( rule__Is_a__KardinalitaetAssignment_2 )
            {
             before(grammarAccess.getIs_aAccess().getKardinalitaetAssignment_2()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2395:1: ( rule__Is_a__KardinalitaetAssignment_2 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2395:2: rule__Is_a__KardinalitaetAssignment_2
            {
            pushFollow(FOLLOW_rule__Is_a__KardinalitaetAssignment_2_in_rule__Is_a__Group__2__Impl4836);
            rule__Is_a__KardinalitaetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIs_aAccess().getKardinalitaetAssignment_2()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2405:1: rule__Is_a__Group__3 : rule__Is_a__Group__3__Impl ;
    public final void rule__Is_a__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2409:1: ( rule__Is_a__Group__3__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2410:2: rule__Is_a__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Is_a__Group__3__Impl_in_rule__Is_a__Group__34866);
            rule__Is_a__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2416:1: rule__Is_a__Group__3__Impl : ( ( rule__Is_a__Objekttyp2Assignment_3 ) ) ;
    public final void rule__Is_a__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2420:1: ( ( ( rule__Is_a__Objekttyp2Assignment_3 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2421:1: ( ( rule__Is_a__Objekttyp2Assignment_3 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2421:1: ( ( rule__Is_a__Objekttyp2Assignment_3 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2422:1: ( rule__Is_a__Objekttyp2Assignment_3 )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp2Assignment_3()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2423:1: ( rule__Is_a__Objekttyp2Assignment_3 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2423:2: rule__Is_a__Objekttyp2Assignment_3
            {
            pushFollow(FOLLOW_rule__Is_a__Objekttyp2Assignment_3_in_rule__Is_a__Group__3__Impl4893);
            rule__Is_a__Objekttyp2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIs_aAccess().getObjekttyp2Assignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Is_part_of__Group__0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2441:1: rule__Is_part_of__Group__0 : rule__Is_part_of__Group__0__Impl rule__Is_part_of__Group__1 ;
    public final void rule__Is_part_of__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2445:1: ( rule__Is_part_of__Group__0__Impl rule__Is_part_of__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2446:2: rule__Is_part_of__Group__0__Impl rule__Is_part_of__Group__1
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__0__Impl_in_rule__Is_part_of__Group__04931);
            rule__Is_part_of__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__1_in_rule__Is_part_of__Group__04934);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2453:1: rule__Is_part_of__Group__0__Impl : ( 'is_part_of:' ) ;
    public final void rule__Is_part_of__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2457:1: ( ( 'is_part_of:' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2458:1: ( 'is_part_of:' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2458:1: ( 'is_part_of:' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2459:1: 'is_part_of:'
            {
             before(grammarAccess.getIs_part_ofAccess().getIs_part_ofKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Is_part_of__Group__0__Impl4962); 
             after(grammarAccess.getIs_part_ofAccess().getIs_part_ofKeyword_0()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2472:1: rule__Is_part_of__Group__1 : rule__Is_part_of__Group__1__Impl rule__Is_part_of__Group__2 ;
    public final void rule__Is_part_of__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2476:1: ( rule__Is_part_of__Group__1__Impl rule__Is_part_of__Group__2 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2477:2: rule__Is_part_of__Group__1__Impl rule__Is_part_of__Group__2
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__1__Impl_in_rule__Is_part_of__Group__14993);
            rule__Is_part_of__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__2_in_rule__Is_part_of__Group__14996);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2484:1: rule__Is_part_of__Group__1__Impl : ( ( rule__Is_part_of__Objekttyp1Assignment_1 ) ) ;
    public final void rule__Is_part_of__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2488:1: ( ( ( rule__Is_part_of__Objekttyp1Assignment_1 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2489:1: ( ( rule__Is_part_of__Objekttyp1Assignment_1 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2489:1: ( ( rule__Is_part_of__Objekttyp1Assignment_1 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2490:1: ( rule__Is_part_of__Objekttyp1Assignment_1 )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp1Assignment_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2491:1: ( rule__Is_part_of__Objekttyp1Assignment_1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2491:2: rule__Is_part_of__Objekttyp1Assignment_1
            {
            pushFollow(FOLLOW_rule__Is_part_of__Objekttyp1Assignment_1_in_rule__Is_part_of__Group__1__Impl5023);
            rule__Is_part_of__Objekttyp1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIs_part_ofAccess().getObjekttyp1Assignment_1()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2501:1: rule__Is_part_of__Group__2 : rule__Is_part_of__Group__2__Impl rule__Is_part_of__Group__3 ;
    public final void rule__Is_part_of__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2505:1: ( rule__Is_part_of__Group__2__Impl rule__Is_part_of__Group__3 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2506:2: rule__Is_part_of__Group__2__Impl rule__Is_part_of__Group__3
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__2__Impl_in_rule__Is_part_of__Group__25053);
            rule__Is_part_of__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Is_part_of__Group__3_in_rule__Is_part_of__Group__25056);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2513:1: rule__Is_part_of__Group__2__Impl : ( ( rule__Is_part_of__KardinalitaetAssignment_2 ) ) ;
    public final void rule__Is_part_of__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2517:1: ( ( ( rule__Is_part_of__KardinalitaetAssignment_2 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2518:1: ( ( rule__Is_part_of__KardinalitaetAssignment_2 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2518:1: ( ( rule__Is_part_of__KardinalitaetAssignment_2 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2519:1: ( rule__Is_part_of__KardinalitaetAssignment_2 )
            {
             before(grammarAccess.getIs_part_ofAccess().getKardinalitaetAssignment_2()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2520:1: ( rule__Is_part_of__KardinalitaetAssignment_2 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2520:2: rule__Is_part_of__KardinalitaetAssignment_2
            {
            pushFollow(FOLLOW_rule__Is_part_of__KardinalitaetAssignment_2_in_rule__Is_part_of__Group__2__Impl5083);
            rule__Is_part_of__KardinalitaetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIs_part_ofAccess().getKardinalitaetAssignment_2()); 

            }


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2530:1: rule__Is_part_of__Group__3 : rule__Is_part_of__Group__3__Impl ;
    public final void rule__Is_part_of__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2534:1: ( rule__Is_part_of__Group__3__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2535:2: rule__Is_part_of__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Is_part_of__Group__3__Impl_in_rule__Is_part_of__Group__35113);
            rule__Is_part_of__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2541:1: rule__Is_part_of__Group__3__Impl : ( ( rule__Is_part_of__Objekttyp2Assignment_3 ) ) ;
    public final void rule__Is_part_of__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2545:1: ( ( ( rule__Is_part_of__Objekttyp2Assignment_3 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2546:1: ( ( rule__Is_part_of__Objekttyp2Assignment_3 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2546:1: ( ( rule__Is_part_of__Objekttyp2Assignment_3 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2547:1: ( rule__Is_part_of__Objekttyp2Assignment_3 )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp2Assignment_3()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2548:1: ( rule__Is_part_of__Objekttyp2Assignment_3 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2548:2: rule__Is_part_of__Objekttyp2Assignment_3
            {
            pushFollow(FOLLOW_rule__Is_part_of__Objekttyp2Assignment_3_in_rule__Is_part_of__Group__3__Impl5140);
            rule__Is_part_of__Objekttyp2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIs_part_ofAccess().getObjekttyp2Assignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Kardinalitaet01__Group__0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2566:1: rule__Kardinalitaet01__Group__0 : rule__Kardinalitaet01__Group__0__Impl rule__Kardinalitaet01__Group__1 ;
    public final void rule__Kardinalitaet01__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2570:1: ( rule__Kardinalitaet01__Group__0__Impl rule__Kardinalitaet01__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2571:2: rule__Kardinalitaet01__Group__0__Impl rule__Kardinalitaet01__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__0__Impl_in_rule__Kardinalitaet01__Group__05178);
            rule__Kardinalitaet01__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__1_in_rule__Kardinalitaet01__Group__05181);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2578:1: rule__Kardinalitaet01__Group__0__Impl : ( ( rule__Kardinalitaet01__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet01__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2582:1: ( ( ( rule__Kardinalitaet01__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2583:1: ( ( rule__Kardinalitaet01__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2583:1: ( ( rule__Kardinalitaet01__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2584:1: ( rule__Kardinalitaet01__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet01Access().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2585:1: ( rule__Kardinalitaet01__Alternatives_0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2585:2: rule__Kardinalitaet01__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Alternatives_0_in_rule__Kardinalitaet01__Group__0__Impl5208);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2595:1: rule__Kardinalitaet01__Group__1 : rule__Kardinalitaet01__Group__1__Impl ;
    public final void rule__Kardinalitaet01__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2599:1: ( rule__Kardinalitaet01__Group__1__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2600:2: rule__Kardinalitaet01__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet01__Group__1__Impl_in_rule__Kardinalitaet01__Group__15238);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2606:1: rule__Kardinalitaet01__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet01__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2610:1: ( ( () ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2611:1: ( () )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2611:1: ( () )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2612:1: ()
            {
             before(grammarAccess.getKardinalitaet01Access().getKardinalitaet01Action_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2613:1: ()
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2615:1: 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2629:1: rule__Kardinalitaet0x__Group__0 : rule__Kardinalitaet0x__Group__0__Impl rule__Kardinalitaet0x__Group__1 ;
    public final void rule__Kardinalitaet0x__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2633:1: ( rule__Kardinalitaet0x__Group__0__Impl rule__Kardinalitaet0x__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2634:2: rule__Kardinalitaet0x__Group__0__Impl rule__Kardinalitaet0x__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__0__Impl_in_rule__Kardinalitaet0x__Group__05300);
            rule__Kardinalitaet0x__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__1_in_rule__Kardinalitaet0x__Group__05303);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2641:1: rule__Kardinalitaet0x__Group__0__Impl : ( ( rule__Kardinalitaet0x__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet0x__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2645:1: ( ( ( rule__Kardinalitaet0x__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2646:1: ( ( rule__Kardinalitaet0x__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2646:1: ( ( rule__Kardinalitaet0x__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2647:1: ( rule__Kardinalitaet0x__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet0xAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2648:1: ( rule__Kardinalitaet0x__Alternatives_0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2648:2: rule__Kardinalitaet0x__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Alternatives_0_in_rule__Kardinalitaet0x__Group__0__Impl5330);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2658:1: rule__Kardinalitaet0x__Group__1 : rule__Kardinalitaet0x__Group__1__Impl ;
    public final void rule__Kardinalitaet0x__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2662:1: ( rule__Kardinalitaet0x__Group__1__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2663:2: rule__Kardinalitaet0x__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet0x__Group__1__Impl_in_rule__Kardinalitaet0x__Group__15360);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2669:1: rule__Kardinalitaet0x__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet0x__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2673:1: ( ( () ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2674:1: ( () )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2674:1: ( () )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2675:1: ()
            {
             before(grammarAccess.getKardinalitaet0xAccess().getKardinalitaet0xAction_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2676:1: ()
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2678:1: 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2692:1: rule__Kardinalitaet11__Group__0 : rule__Kardinalitaet11__Group__0__Impl rule__Kardinalitaet11__Group__1 ;
    public final void rule__Kardinalitaet11__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2696:1: ( rule__Kardinalitaet11__Group__0__Impl rule__Kardinalitaet11__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2697:2: rule__Kardinalitaet11__Group__0__Impl rule__Kardinalitaet11__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__0__Impl_in_rule__Kardinalitaet11__Group__05422);
            rule__Kardinalitaet11__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__1_in_rule__Kardinalitaet11__Group__05425);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2704:1: rule__Kardinalitaet11__Group__0__Impl : ( ( rule__Kardinalitaet11__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet11__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2708:1: ( ( ( rule__Kardinalitaet11__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2709:1: ( ( rule__Kardinalitaet11__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2709:1: ( ( rule__Kardinalitaet11__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2710:1: ( rule__Kardinalitaet11__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet11Access().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2711:1: ( rule__Kardinalitaet11__Alternatives_0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2711:2: rule__Kardinalitaet11__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Alternatives_0_in_rule__Kardinalitaet11__Group__0__Impl5452);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2721:1: rule__Kardinalitaet11__Group__1 : rule__Kardinalitaet11__Group__1__Impl ;
    public final void rule__Kardinalitaet11__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2725:1: ( rule__Kardinalitaet11__Group__1__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2726:2: rule__Kardinalitaet11__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet11__Group__1__Impl_in_rule__Kardinalitaet11__Group__15482);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2732:1: rule__Kardinalitaet11__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet11__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2736:1: ( ( () ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2737:1: ( () )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2737:1: ( () )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2738:1: ()
            {
             before(grammarAccess.getKardinalitaet11Access().getKardinalitaet11Action_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2739:1: ()
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2741:1: 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2755:1: rule__Kardinalitaet1x__Group__0 : rule__Kardinalitaet1x__Group__0__Impl rule__Kardinalitaet1x__Group__1 ;
    public final void rule__Kardinalitaet1x__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2759:1: ( rule__Kardinalitaet1x__Group__0__Impl rule__Kardinalitaet1x__Group__1 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2760:2: rule__Kardinalitaet1x__Group__0__Impl rule__Kardinalitaet1x__Group__1
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__0__Impl_in_rule__Kardinalitaet1x__Group__05544);
            rule__Kardinalitaet1x__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__1_in_rule__Kardinalitaet1x__Group__05547);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2767:1: rule__Kardinalitaet1x__Group__0__Impl : ( ( rule__Kardinalitaet1x__Alternatives_0 ) ) ;
    public final void rule__Kardinalitaet1x__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2771:1: ( ( ( rule__Kardinalitaet1x__Alternatives_0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2772:1: ( ( rule__Kardinalitaet1x__Alternatives_0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2772:1: ( ( rule__Kardinalitaet1x__Alternatives_0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2773:1: ( rule__Kardinalitaet1x__Alternatives_0 )
            {
             before(grammarAccess.getKardinalitaet1xAccess().getAlternatives_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2774:1: ( rule__Kardinalitaet1x__Alternatives_0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2774:2: rule__Kardinalitaet1x__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Alternatives_0_in_rule__Kardinalitaet1x__Group__0__Impl5574);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2784:1: rule__Kardinalitaet1x__Group__1 : rule__Kardinalitaet1x__Group__1__Impl ;
    public final void rule__Kardinalitaet1x__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2788:1: ( rule__Kardinalitaet1x__Group__1__Impl )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2789:2: rule__Kardinalitaet1x__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Kardinalitaet1x__Group__1__Impl_in_rule__Kardinalitaet1x__Group__15604);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2795:1: rule__Kardinalitaet1x__Group__1__Impl : ( () ) ;
    public final void rule__Kardinalitaet1x__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2799:1: ( ( () ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2800:1: ( () )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2800:1: ( () )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2801:1: ()
            {
             before(grammarAccess.getKardinalitaet1xAccess().getKardinalitaet1xAction_1()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2802:1: ()
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2804:1: 
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


    // $ANTLR start "rule__Metamodell__NameAssignment_0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2819:1: rule__Metamodell__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Metamodell__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2823:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2824:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2824:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2825:1: RULE_ID
            {
             before(grammarAccess.getMetamodellAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Metamodell__NameAssignment_05671); 
             after(grammarAccess.getMetamodellAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodell__NameAssignment_0"


    // $ANTLR start "rule__Metamodell__VersionAssignment_1"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2834:1: rule__Metamodell__VersionAssignment_1 : ( RULE_ID ) ;
    public final void rule__Metamodell__VersionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2838:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2839:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2839:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2840:1: RULE_ID
            {
             before(grammarAccess.getMetamodellAccess().getVersionIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Metamodell__VersionAssignment_15702); 
             after(grammarAccess.getMetamodellAccess().getVersionIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodell__VersionAssignment_1"


    // $ANTLR start "rule__Metamodell__ObjekttypAssignment_2_0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2849:1: rule__Metamodell__ObjekttypAssignment_2_0 : ( ruleObjekttyp ) ;
    public final void rule__Metamodell__ObjekttypAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2853:1: ( ( ruleObjekttyp ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2854:1: ( ruleObjekttyp )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2854:1: ( ruleObjekttyp )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2855:1: ruleObjekttyp
            {
             before(grammarAccess.getMetamodellAccess().getObjekttypObjekttypParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleObjekttyp_in_rule__Metamodell__ObjekttypAssignment_2_05733);
            ruleObjekttyp();

            state._fsp--;

             after(grammarAccess.getMetamodellAccess().getObjekttypObjekttypParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodell__ObjekttypAssignment_2_0"


    // $ANTLR start "rule__Metamodell__BeziehungAssignment_2_1"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2864:1: rule__Metamodell__BeziehungAssignment_2_1 : ( ruleBeziehung ) ;
    public final void rule__Metamodell__BeziehungAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2868:1: ( ( ruleBeziehung ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2869:1: ( ruleBeziehung )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2869:1: ( ruleBeziehung )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2870:1: ruleBeziehung
            {
             before(grammarAccess.getMetamodellAccess().getBeziehungBeziehungParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBeziehung_in_rule__Metamodell__BeziehungAssignment_2_15764);
            ruleBeziehung();

            state._fsp--;

             after(grammarAccess.getMetamodellAccess().getBeziehungBeziehungParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodell__BeziehungAssignment_2_1"


    // $ANTLR start "rule__Objekttyp__NameAssignment_2"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2879:1: rule__Objekttyp__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Objekttyp__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2883:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2884:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2884:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2885:1: RULE_ID
            {
             before(grammarAccess.getObjekttypAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Objekttyp__NameAssignment_25795); 
             after(grammarAccess.getObjekttypAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__NameAssignment_2"


    // $ANTLR start "rule__Objekttyp__AttributeAssignment_4"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2894:1: rule__Objekttyp__AttributeAssignment_4 : ( ruleAttribut ) ;
    public final void rule__Objekttyp__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2898:1: ( ( ruleAttribut ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2899:1: ( ruleAttribut )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2899:1: ( ruleAttribut )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2900:1: ruleAttribut
            {
             before(grammarAccess.getObjekttypAccess().getAttributeAttributParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribut_in_rule__Objekttyp__AttributeAssignment_45826);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getObjekttypAccess().getAttributeAttributParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__AttributeAssignment_4"


    // $ANTLR start "rule__Objekttyp__OperatorenAssignment_5"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2909:1: rule__Objekttyp__OperatorenAssignment_5 : ( ruleOperator ) ;
    public final void rule__Objekttyp__OperatorenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2913:1: ( ( ruleOperator ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2914:1: ( ruleOperator )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2914:1: ( ruleOperator )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2915:1: ruleOperator
            {
             before(grammarAccess.getObjekttypAccess().getOperatorenOperatorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleOperator_in_rule__Objekttyp__OperatorenAssignment_55857);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getObjekttypAccess().getOperatorenOperatorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objekttyp__OperatorenAssignment_5"


    // $ANTLR start "rule__Attribut__ObjekttypAssignment_0_0"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2924:1: rule__Attribut__ObjekttypAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribut__ObjekttypAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2928:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2929:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2929:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2930:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributAccess().getObjekttypObjekttypCrossReference_0_0_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2931:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2932:1: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getObjekttypObjekttypIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribut__ObjekttypAssignment_0_05892); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2943:1: rule__Attribut__DatentypAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__Attribut__DatentypAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2947:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2948:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2948:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2949:1: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getDatentypIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribut__DatentypAssignment_0_1_15927); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2958:1: rule__Attribut__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2962:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2963:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2963:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2964:1: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribut__NameAssignment_15958); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2973:1: rule__Operator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Operator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2977:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2978:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2978:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2979:1: RULE_ID
            {
             before(grammarAccess.getOperatorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operator__NameAssignment_05989); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2988:1: rule__Operator__ParameterAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Operator__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2992:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2993:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2993:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2994:1: ( RULE_ID )
            {
             before(grammarAccess.getOperatorAccess().getParameterObjekttypCrossReference_2_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2995:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:2996:1: RULE_ID
            {
             before(grammarAccess.getOperatorAccess().getParameterObjekttypIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operator__ParameterAssignment_26024); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3007:1: rule__Operator__AnweisungenAssignment_4 : ( ruleAnweisung ) ;
    public final void rule__Operator__AnweisungenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3011:1: ( ( ruleAnweisung ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3012:1: ( ruleAnweisung )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3012:1: ( ruleAnweisung )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3013:1: ruleAnweisung
            {
             before(grammarAccess.getOperatorAccess().getAnweisungenAnweisungParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAnweisung_in_rule__Operator__AnweisungenAssignment_46059);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3022:1: rule__Anweisung__KontrollstrukturAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Anweisung__KontrollstrukturAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3026:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3027:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3027:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3028:1: RULE_ID
            {
             before(grammarAccess.getAnweisungAccess().getKontrollstrukturIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Anweisung__KontrollstrukturAssignment_0_06090); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3037:1: rule__Anweisung__BedingungAssignment_0_2 : ( ruleAnweisung ) ;
    public final void rule__Anweisung__BedingungAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3041:1: ( ( ruleAnweisung ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3042:1: ( ruleAnweisung )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3042:1: ( ruleAnweisung )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3043:1: ruleAnweisung
            {
             before(grammarAccess.getAnweisungAccess().getBedingungAnweisungParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleAnweisung_in_rule__Anweisung__BedingungAssignment_0_26121);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3052:1: rule__Anweisung__BedigteAnweisungenAssignment_0_4 : ( ruleAnweisung ) ;
    public final void rule__Anweisung__BedigteAnweisungenAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3056:1: ( ( ruleAnweisung ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3057:1: ( ruleAnweisung )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3057:1: ( ruleAnweisung )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3058:1: ruleAnweisung
            {
             before(grammarAccess.getAnweisungAccess().getBedigteAnweisungenAnweisungParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_ruleAnweisung_in_rule__Anweisung__BedigteAnweisungenAssignment_0_46152);
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3067:1: rule__Anweisung__ObjektAssignment_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Anweisung__ObjektAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3071:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3072:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3072:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3073:1: ( RULE_ID )
            {
             before(grammarAccess.getAnweisungAccess().getObjektObjekttypCrossReference_1_0_0_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3074:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3075:1: RULE_ID
            {
             before(grammarAccess.getAnweisungAccess().getObjektObjekttypIDTerminalRuleCall_1_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Anweisung__ObjektAssignment_1_0_06187); 
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
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3086:1: rule__Anweisung__OperatorAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Anweisung__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3090:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3091:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3091:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3092:1: RULE_ID
            {
             before(grammarAccess.getAnweisungAccess().getOperatorIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Anweisung__OperatorAssignment_1_16222); 
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


    // $ANTLR start "rule__Interacts_with__Objekttyp1Assignment_1"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3101:1: rule__Interacts_with__Objekttyp1Assignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Interacts_with__Objekttyp1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3105:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3106:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3106:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3107:1: ( RULE_ID )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypCrossReference_1_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3108:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3109:1: RULE_ID
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp1Assignment_16257); 
             after(grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interacts_with__Objekttyp1Assignment_1"


    // $ANTLR start "rule__Interacts_with__KardinalitaetAssignment_2"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3120:1: rule__Interacts_with__KardinalitaetAssignment_2 : ( ( rule__Interacts_with__KardinalitaetAlternatives_2_0 ) ) ;
    public final void rule__Interacts_with__KardinalitaetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3124:1: ( ( ( rule__Interacts_with__KardinalitaetAlternatives_2_0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3125:1: ( ( rule__Interacts_with__KardinalitaetAlternatives_2_0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3125:1: ( ( rule__Interacts_with__KardinalitaetAlternatives_2_0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3126:1: ( rule__Interacts_with__KardinalitaetAlternatives_2_0 )
            {
             before(grammarAccess.getInteracts_withAccess().getKardinalitaetAlternatives_2_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3127:1: ( rule__Interacts_with__KardinalitaetAlternatives_2_0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3127:2: rule__Interacts_with__KardinalitaetAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Interacts_with__KardinalitaetAlternatives_2_0_in_rule__Interacts_with__KardinalitaetAssignment_26292);
            rule__Interacts_with__KardinalitaetAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getInteracts_withAccess().getKardinalitaetAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interacts_with__KardinalitaetAssignment_2"


    // $ANTLR start "rule__Interacts_with__Objekttyp2Assignment_3"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3136:1: rule__Interacts_with__Objekttyp2Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Interacts_with__Objekttyp2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3140:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3141:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3141:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3142:1: ( RULE_ID )
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypCrossReference_3_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3143:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3144:1: RULE_ID
            {
             before(grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp2Assignment_36329); 
             after(grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interacts_with__Objekttyp2Assignment_3"


    // $ANTLR start "rule__Is_a__Objekttyp1Assignment_1"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3155:1: rule__Is_a__Objekttyp1Assignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Is_a__Objekttyp1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3159:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3160:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3160:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3161:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypCrossReference_1_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3162:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3163:1: RULE_ID
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp1Assignment_16368); 
             after(grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Is_a__Objekttyp1Assignment_1"


    // $ANTLR start "rule__Is_a__KardinalitaetAssignment_2"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3174:1: rule__Is_a__KardinalitaetAssignment_2 : ( ( rule__Is_a__KardinalitaetAlternatives_2_0 ) ) ;
    public final void rule__Is_a__KardinalitaetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3178:1: ( ( ( rule__Is_a__KardinalitaetAlternatives_2_0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3179:1: ( ( rule__Is_a__KardinalitaetAlternatives_2_0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3179:1: ( ( rule__Is_a__KardinalitaetAlternatives_2_0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3180:1: ( rule__Is_a__KardinalitaetAlternatives_2_0 )
            {
             before(grammarAccess.getIs_aAccess().getKardinalitaetAlternatives_2_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3181:1: ( rule__Is_a__KardinalitaetAlternatives_2_0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3181:2: rule__Is_a__KardinalitaetAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Is_a__KardinalitaetAlternatives_2_0_in_rule__Is_a__KardinalitaetAssignment_26403);
            rule__Is_a__KardinalitaetAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getIs_aAccess().getKardinalitaetAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Is_a__KardinalitaetAssignment_2"


    // $ANTLR start "rule__Is_a__Objekttyp2Assignment_3"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3190:1: rule__Is_a__Objekttyp2Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Is_a__Objekttyp2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3194:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3195:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3195:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3196:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypCrossReference_3_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3197:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3198:1: RULE_ID
            {
             before(grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp2Assignment_36440); 
             after(grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Is_a__Objekttyp2Assignment_3"


    // $ANTLR start "rule__Is_part_of__Objekttyp1Assignment_1"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3209:1: rule__Is_part_of__Objekttyp1Assignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Is_part_of__Objekttyp1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3213:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3214:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3214:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3215:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypCrossReference_1_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3216:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3217:1: RULE_ID
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp1Assignment_16479); 
             after(grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Is_part_of__Objekttyp1Assignment_1"


    // $ANTLR start "rule__Is_part_of__KardinalitaetAssignment_2"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3228:1: rule__Is_part_of__KardinalitaetAssignment_2 : ( ( rule__Is_part_of__KardinalitaetAlternatives_2_0 ) ) ;
    public final void rule__Is_part_of__KardinalitaetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3232:1: ( ( ( rule__Is_part_of__KardinalitaetAlternatives_2_0 ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3233:1: ( ( rule__Is_part_of__KardinalitaetAlternatives_2_0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3233:1: ( ( rule__Is_part_of__KardinalitaetAlternatives_2_0 ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3234:1: ( rule__Is_part_of__KardinalitaetAlternatives_2_0 )
            {
             before(grammarAccess.getIs_part_ofAccess().getKardinalitaetAlternatives_2_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3235:1: ( rule__Is_part_of__KardinalitaetAlternatives_2_0 )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3235:2: rule__Is_part_of__KardinalitaetAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Is_part_of__KardinalitaetAlternatives_2_0_in_rule__Is_part_of__KardinalitaetAssignment_26514);
            rule__Is_part_of__KardinalitaetAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getIs_part_ofAccess().getKardinalitaetAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Is_part_of__KardinalitaetAssignment_2"


    // $ANTLR start "rule__Is_part_of__Objekttyp2Assignment_3"
    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3244:1: rule__Is_part_of__Objekttyp2Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Is_part_of__Objekttyp2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3248:1: ( ( ( RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3249:1: ( ( RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3249:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3250:1: ( RULE_ID )
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypCrossReference_3_0()); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3251:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3252:1: RULE_ID
            {
             before(grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp2Assignment_36551); 
             after(grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Is_part_of__Objekttyp2Assignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMetamodell_in_entryRuleMetamodell61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodell68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodell__Group__0_in_ruleMetamodell94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjekttyp_in_entryRuleObjekttyp121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjekttyp128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objekttyp__Group__0_in_ruleObjekttyp154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_entryRuleAttribut181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribut188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__0_in_ruleAttribut214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__0_in_ruleOperator274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnweisung_in_entryRuleAnweisung301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnweisung308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Alternatives_in_ruleAnweisung334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOT_in_entryRuleKOT361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKOT368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KOT__Alternatives_in_ruleKOT394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOT_in_entryRuleVOT421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVOT428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__0_in_ruleVOT454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_entryRuleOOT481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOOT488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__0_in_ruleOOT514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_entryRuleLOT541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOT548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__0_in_ruleLOT574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_entryRuleTOT601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTOT608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__0_in_ruleTOT634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeziehung_in_entryRuleBeziehung661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeziehung668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Beziehung__Group__0_in_ruleBeziehung694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteracts_with728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__0_in_ruleInteracts_with754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_a_in_entryRuleIs_a781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_a788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__0_in_ruleIs_a814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_part_of848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__0_in_ruleIs_part_of874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet01903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet01910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__0_in_ruleKardinalitaet01936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet0x970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__0_in_ruleKardinalitaet0x996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet111023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet111030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__0_in_ruleKardinalitaet111056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet1x1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__0_in_ruleKardinalitaet1x1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodell__ObjekttypAssignment_2_0_in_rule__Metamodell__Alternatives_21152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodell__BeziehungAssignment_2_1_in_rule__Metamodell__Alternatives_21170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOT_in_rule__Objekttyp__Alternatives_11203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOT_in_rule__Objekttyp__Alternatives_11220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__ObjekttypAssignment_0_0_in_rule__Attribut__Alternatives_01252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group_0_1__0_in_rule__Attribut__Alternatives_01270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__0_in_rule__Anweisung__Alternatives1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1__0_in_rule__Anweisung__Alternatives1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_rule__KOT__Alternatives1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_rule__KOT__Alternatives1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_rule__KOT__Alternatives1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_a_in_rule__Beziehung__Alternatives_11420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_rule__Beziehung__Alternatives_11437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_rule__Beziehung__Alternatives_11454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_rule__Interacts_with__KardinalitaetAlternatives_2_01486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_rule__Interacts_with__KardinalitaetAlternatives_2_01503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_rule__Interacts_with__KardinalitaetAlternatives_2_01520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_rule__Is_a__KardinalitaetAlternatives_2_01552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_rule__Is_a__KardinalitaetAlternatives_2_01569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_rule__Is_part_of__KardinalitaetAlternatives_2_01601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_rule__Is_part_of__KardinalitaetAlternatives_2_01618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_rule__Is_part_of__KardinalitaetAlternatives_2_01635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Kardinalitaet01__Alternatives_01669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Kardinalitaet01__Alternatives_01689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Kardinalitaet0x__Alternatives_01724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Kardinalitaet0x__Alternatives_01744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Kardinalitaet11__Alternatives_01779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Kardinalitaet11__Alternatives_01799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Kardinalitaet1x__Alternatives_01834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Kardinalitaet1x__Alternatives_01854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodell__Group__0__Impl_in_rule__Metamodell__Group__01886 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Metamodell__Group__1_in_rule__Metamodell__Group__01889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodell__NameAssignment_0_in_rule__Metamodell__Group__0__Impl1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodell__Group__1__Impl_in_rule__Metamodell__Group__11946 = new BitSet(new long[]{0x00000003F8000030L});
    public static final BitSet FOLLOW_rule__Metamodell__Group__2_in_rule__Metamodell__Group__11949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodell__VersionAssignment_1_in_rule__Metamodell__Group__1__Impl1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodell__Group__2__Impl_in_rule__Metamodell__Group__22006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodell__Alternatives_2_in_rule__Metamodell__Group__2__Impl2033 = new BitSet(new long[]{0x00000003F8000032L});
    public static final BitSet FOLLOW_rule__Objekttyp__Group__0__Impl_in_rule__Objekttyp__Group__02070 = new BitSet(new long[]{0x0000000078000010L});
    public static final BitSet FOLLOW_rule__Objekttyp__Group__1_in_rule__Objekttyp__Group__02073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANNOTATION_in_rule__Objekttyp__Group__0__Impl2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objekttyp__Group__1__Impl_in_rule__Objekttyp__Group__12132 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Objekttyp__Group__2_in_rule__Objekttyp__Group__12135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objekttyp__Alternatives_1_in_rule__Objekttyp__Group__1__Impl2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objekttyp__Group__2__Impl_in_rule__Objekttyp__Group__22192 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Objekttyp__Group__3_in_rule__Objekttyp__Group__22195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objekttyp__NameAssignment_2_in_rule__Objekttyp__Group__2__Impl2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objekttyp__Group__3__Impl_in_rule__Objekttyp__Group__32252 = new BitSet(new long[]{0x0000000000A00020L});
    public static final BitSet FOLLOW_rule__Objekttyp__Group__4_in_rule__Objekttyp__Group__32255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Objekttyp__Group__3__Impl2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objekttyp__Group__4__Impl_in_rule__Objekttyp__Group__42314 = new BitSet(new long[]{0x0000000000A00020L});
    public static final BitSet FOLLOW_rule__Objekttyp__Group__5_in_rule__Objekttyp__Group__42317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objekttyp__AttributeAssignment_4_in_rule__Objekttyp__Group__4__Impl2344 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__Objekttyp__Group__5__Impl_in_rule__Objekttyp__Group__52375 = new BitSet(new long[]{0x0000000000A00020L});
    public static final BitSet FOLLOW_rule__Objekttyp__Group__6_in_rule__Objekttyp__Group__52378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objekttyp__OperatorenAssignment_5_in_rule__Objekttyp__Group__5__Impl2405 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Objekttyp__Group__6__Impl_in_rule__Objekttyp__Group__62436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Objekttyp__Group__6__Impl2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__0__Impl_in_rule__Attribut__Group__02509 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attribut__Group__1_in_rule__Attribut__Group__02512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Alternatives_0_in_rule__Attribut__Group__0__Impl2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__1__Impl_in_rule__Attribut__Group__12569 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Attribut__Group__2_in_rule__Attribut__Group__12572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__NameAssignment_1_in_rule__Attribut__Group__1__Impl2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group__2__Impl_in_rule__Attribut__Group__22629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Attribut__Group__2__Impl2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group_0_1__0__Impl_in_rule__Attribut__Group_0_1__02694 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attribut__Group_0_1__1_in_rule__Attribut__Group_0_1__02697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Attribut__Group_0_1__0__Impl2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__Group_0_1__1__Impl_in_rule__Attribut__Group_0_1__12756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribut__DatentypAssignment_0_1_1_in_rule__Attribut__Group_0_1__1__Impl2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__0__Impl_in_rule__Operator__Group__02817 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Operator__Group__1_in_rule__Operator__Group__02820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__NameAssignment_0_in_rule__Operator__Group__0__Impl2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__1__Impl_in_rule__Operator__Group__12877 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__Operator__Group__2_in_rule__Operator__Group__12880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Operator__Group__1__Impl2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__2__Impl_in_rule__Operator__Group__22939 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__Operator__Group__3_in_rule__Operator__Group__22942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__ParameterAssignment_2_in_rule__Operator__Group__2__Impl2969 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Operator__Group__3__Impl_in_rule__Operator__Group__33000 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__Operator__Group__4_in_rule__Operator__Group__33003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operator__Group__3__Impl3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Group__4__Impl_in_rule__Operator__Group__43062 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__Operator__Group__5_in_rule__Operator__Group__43065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__AnweisungenAssignment_4_in_rule__Operator__Group__4__Impl3092 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Operator__Group__5__Impl_in_rule__Operator__Group__53123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Operator__Group__5__Impl3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__0__Impl_in_rule__Anweisung__Group_0__03194 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__1_in_rule__Anweisung__Group_0__03197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__KontrollstrukturAssignment_0_0_in_rule__Anweisung__Group_0__0__Impl3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__1__Impl_in_rule__Anweisung__Group_0__13254 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__2_in_rule__Anweisung__Group_0__13257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Anweisung__Group_0__1__Impl3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__2__Impl_in_rule__Anweisung__Group_0__23316 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__3_in_rule__Anweisung__Group_0__23319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__BedingungAssignment_0_2_in_rule__Anweisung__Group_0__2__Impl3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__3__Impl_in_rule__Anweisung__Group_0__33376 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__4_in_rule__Anweisung__Group_0__33379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Anweisung__Group_0__3__Impl3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__4__Impl_in_rule__Anweisung__Group_0__43438 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__5_in_rule__Anweisung__Group_0__43441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__BedigteAnweisungenAssignment_0_4_in_rule__Anweisung__Group_0__4__Impl3468 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_0__5__Impl_in_rule__Anweisung__Group_0__53499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Anweisung__Group_0__5__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1__0__Impl_in_rule__Anweisung__Group_1__03570 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1__1_in_rule__Anweisung__Group_1__03573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1_0__0_in_rule__Anweisung__Group_1__0__Impl3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1__1__Impl_in_rule__Anweisung__Group_1__13631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__OperatorAssignment_1_1_in_rule__Anweisung__Group_1__1__Impl3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1_0__0__Impl_in_rule__Anweisung__Group_1_0__03692 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1_0__1_in_rule__Anweisung__Group_1_0__03695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__ObjektAssignment_1_0_0_in_rule__Anweisung__Group_1_0__0__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anweisung__Group_1_0__1__Impl_in_rule__Anweisung__Group_1_0__13752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Anweisung__Group_1_0__1__Impl3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__0__Impl_in_rule__VOT__Group__03815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__VOT__Group__1_in_rule__VOT__Group__03818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__VOT__Group__0__Impl3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VOT__Group__1__Impl_in_rule__VOT__Group__13877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__0__Impl_in_rule__OOT__Group__03939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__OOT__Group__1_in_rule__OOT__Group__03942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__OOT__Group__0__Impl3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OOT__Group__1__Impl_in_rule__OOT__Group__14001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__0__Impl_in_rule__LOT__Group__04063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__LOT__Group__1_in_rule__LOT__Group__04066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__LOT__Group__0__Impl4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOT__Group__1__Impl_in_rule__LOT__Group__14125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__0__Impl_in_rule__TOT__Group__04187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__TOT__Group__1_in_rule__TOT__Group__04190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TOT__Group__0__Impl4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TOT__Group__1__Impl_in_rule__TOT__Group__14249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Beziehung__Group__0__Impl_in_rule__Beziehung__Group__04311 = new BitSet(new long[]{0x00000003F8000030L});
    public static final BitSet FOLLOW_rule__Beziehung__Group__1_in_rule__Beziehung__Group__04314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANNOTATION_in_rule__Beziehung__Group__0__Impl4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Beziehung__Group__1__Impl_in_rule__Beziehung__Group__14373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Beziehung__Alternatives_1_in_rule__Beziehung__Group__1__Impl4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__0__Impl_in_rule__Interacts_with__Group__04434 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__1_in_rule__Interacts_with__Group__04437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Interacts_with__Group__0__Impl4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__1__Impl_in_rule__Interacts_with__Group__14499 = new BitSet(new long[]{0x00000000000CF000L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__2_in_rule__Interacts_with__Group__14502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Objekttyp1Assignment_1_in_rule__Interacts_with__Group__1__Impl4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__2__Impl_in_rule__Interacts_with__Group__24559 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__3_in_rule__Interacts_with__Group__24562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__KardinalitaetAssignment_2_in_rule__Interacts_with__Group__2__Impl4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Group__3__Impl_in_rule__Interacts_with__Group__34619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__Objekttyp2Assignment_3_in_rule__Interacts_with__Group__3__Impl4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__0__Impl_in_rule__Is_a__Group__04684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Is_a__Group__1_in_rule__Is_a__Group__04687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Is_a__Group__0__Impl4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__1__Impl_in_rule__Is_a__Group__14746 = new BitSet(new long[]{0x0000000000033000L});
    public static final BitSet FOLLOW_rule__Is_a__Group__2_in_rule__Is_a__Group__14749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Objekttyp1Assignment_1_in_rule__Is_a__Group__1__Impl4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__2__Impl_in_rule__Is_a__Group__24806 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Is_a__Group__3_in_rule__Is_a__Group__24809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__KardinalitaetAssignment_2_in_rule__Is_a__Group__2__Impl4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Group__3__Impl_in_rule__Is_a__Group__34866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__Objekttyp2Assignment_3_in_rule__Is_a__Group__3__Impl4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__0__Impl_in_rule__Is_part_of__Group__04931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__1_in_rule__Is_part_of__Group__04934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Is_part_of__Group__0__Impl4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__1__Impl_in_rule__Is_part_of__Group__14993 = new BitSet(new long[]{0x00000000000CF000L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__2_in_rule__Is_part_of__Group__14996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Objekttyp1Assignment_1_in_rule__Is_part_of__Group__1__Impl5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__2__Impl_in_rule__Is_part_of__Group__25053 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__3_in_rule__Is_part_of__Group__25056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__KardinalitaetAssignment_2_in_rule__Is_part_of__Group__2__Impl5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Group__3__Impl_in_rule__Is_part_of__Group__35113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__Objekttyp2Assignment_3_in_rule__Is_part_of__Group__3__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__0__Impl_in_rule__Kardinalitaet01__Group__05178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__1_in_rule__Kardinalitaet01__Group__05181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Alternatives_0_in_rule__Kardinalitaet01__Group__0__Impl5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet01__Group__1__Impl_in_rule__Kardinalitaet01__Group__15238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__0__Impl_in_rule__Kardinalitaet0x__Group__05300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__1_in_rule__Kardinalitaet0x__Group__05303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Alternatives_0_in_rule__Kardinalitaet0x__Group__0__Impl5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet0x__Group__1__Impl_in_rule__Kardinalitaet0x__Group__15360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__0__Impl_in_rule__Kardinalitaet11__Group__05422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__1_in_rule__Kardinalitaet11__Group__05425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Alternatives_0_in_rule__Kardinalitaet11__Group__0__Impl5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet11__Group__1__Impl_in_rule__Kardinalitaet11__Group__15482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__0__Impl_in_rule__Kardinalitaet1x__Group__05544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__1_in_rule__Kardinalitaet1x__Group__05547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Alternatives_0_in_rule__Kardinalitaet1x__Group__0__Impl5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kardinalitaet1x__Group__1__Impl_in_rule__Kardinalitaet1x__Group__15604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Metamodell__NameAssignment_05671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Metamodell__VersionAssignment_15702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjekttyp_in_rule__Metamodell__ObjekttypAssignment_2_05733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeziehung_in_rule__Metamodell__BeziehungAssignment_2_15764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Objekttyp__NameAssignment_25795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_rule__Objekttyp__AttributeAssignment_45826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__Objekttyp__OperatorenAssignment_55857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribut__ObjekttypAssignment_0_05892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribut__DatentypAssignment_0_1_15927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribut__NameAssignment_15958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operator__NameAssignment_05989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operator__ParameterAssignment_26024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnweisung_in_rule__Operator__AnweisungenAssignment_46059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Anweisung__KontrollstrukturAssignment_0_06090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnweisung_in_rule__Anweisung__BedingungAssignment_0_26121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnweisung_in_rule__Anweisung__BedigteAnweisungenAssignment_0_46152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Anweisung__ObjektAssignment_1_0_06187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Anweisung__OperatorAssignment_1_16222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp1Assignment_16257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interacts_with__KardinalitaetAlternatives_2_0_in_rule__Interacts_with__KardinalitaetAssignment_26292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interacts_with__Objekttyp2Assignment_36329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp1Assignment_16368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_a__KardinalitaetAlternatives_2_0_in_rule__Is_a__KardinalitaetAssignment_26403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_a__Objekttyp2Assignment_36440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp1Assignment_16479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Is_part_of__KardinalitaetAlternatives_2_0_in_rule__Is_part_of__KardinalitaetAssignment_26514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Is_part_of__Objekttyp2Assignment_36551 = new BitSet(new long[]{0x0000000000000002L});

}