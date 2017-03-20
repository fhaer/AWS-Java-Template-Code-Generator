package de.uniba.wiai.seda.somsl.annotation.ui.contentassist.antlr.internal; 

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
import de.uniba.wiai.seda.somsl.annotation.services.AnnotationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VERSION", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@name'", "'@merge'", "'@ignore'"
    };
    public static final int RULE_VERSION=5;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators


        public InternalAnnotationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnnotationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnnotationParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g"; }


     
     	private AnnotationGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AnnotationGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleAnnotation"
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:60:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:61:1: ( ruleAnnotation EOF )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:62:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation61);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation68); 

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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:69:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:73:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:74:1: ( ( rule__Annotation__Alternatives ) )
            {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:74:1: ( ( rule__Annotation__Alternatives ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:75:1: ( rule__Annotation__Alternatives )
            {
             before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:76:1: ( rule__Annotation__Alternatives )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:76:2: rule__Annotation__Alternatives
            {
            pushFollow(FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation94);
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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:88:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:89:1: ( ruleName EOF )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:90:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName121);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName128); 

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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:97:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:101:2: ( ( ( rule__Name__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:102:1: ( ( rule__Name__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:102:1: ( ( rule__Name__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:103:1: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:104:1: ( rule__Name__Group__0 )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:104:2: rule__Name__Group__0
            {
            pushFollow(FOLLOW_rule__Name__Group__0_in_ruleName154);
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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:116:1: entryRuleMerge : ruleMerge EOF ;
    public final void entryRuleMerge() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:117:1: ( ruleMerge EOF )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:118:1: ruleMerge EOF
            {
             before(grammarAccess.getMergeRule()); 
            pushFollow(FOLLOW_ruleMerge_in_entryRuleMerge181);
            ruleMerge();

            state._fsp--;

             after(grammarAccess.getMergeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMerge188); 

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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:125:1: ruleMerge : ( ( rule__Merge__Group__0 ) ) ;
    public final void ruleMerge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:129:2: ( ( ( rule__Merge__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:130:1: ( ( rule__Merge__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:130:1: ( ( rule__Merge__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:131:1: ( rule__Merge__Group__0 )
            {
             before(grammarAccess.getMergeAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:132:1: ( rule__Merge__Group__0 )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:132:2: rule__Merge__Group__0
            {
            pushFollow(FOLLOW_rule__Merge__Group__0_in_ruleMerge214);
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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:144:1: entryRuleIgnore : ruleIgnore EOF ;
    public final void entryRuleIgnore() throws RecognitionException {
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:145:1: ( ruleIgnore EOF )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:146:1: ruleIgnore EOF
            {
             before(grammarAccess.getIgnoreRule()); 
            pushFollow(FOLLOW_ruleIgnore_in_entryRuleIgnore241);
            ruleIgnore();

            state._fsp--;

             after(grammarAccess.getIgnoreRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIgnore248); 

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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:153:1: ruleIgnore : ( ( rule__Ignore__Group__0 ) ) ;
    public final void ruleIgnore() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:157:2: ( ( ( rule__Ignore__Group__0 ) ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:158:1: ( ( rule__Ignore__Group__0 ) )
            {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:158:1: ( ( rule__Ignore__Group__0 ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:159:1: ( rule__Ignore__Group__0 )
            {
             before(grammarAccess.getIgnoreAccess().getGroup()); 
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:160:1: ( rule__Ignore__Group__0 )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:160:2: rule__Ignore__Group__0
            {
            pushFollow(FOLLOW_rule__Ignore__Group__0_in_ruleIgnore274);
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


    // $ANTLR start "rule__Annotation__Alternatives"
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:172:1: rule__Annotation__Alternatives : ( ( ruleName ) | ( ruleIgnore ) | ( ruleMerge ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:176:1: ( ( ruleName ) | ( ruleIgnore ) | ( ruleMerge ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 14:
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
                    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:177:1: ( ruleName )
                    {
                    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:177:1: ( ruleName )
                    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:178:1: ruleName
                    {
                     before(grammarAccess.getAnnotationAccess().getNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleName_in_rule__Annotation__Alternatives310);
                    ruleName();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:183:6: ( ruleIgnore )
                    {
                    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:183:6: ( ruleIgnore )
                    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:184:1: ruleIgnore
                    {
                     before(grammarAccess.getAnnotationAccess().getIgnoreParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIgnore_in_rule__Annotation__Alternatives327);
                    ruleIgnore();

                    state._fsp--;

                     after(grammarAccess.getAnnotationAccess().getIgnoreParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:189:6: ( ruleMerge )
                    {
                    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:189:6: ( ruleMerge )
                    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:190:1: ruleMerge
                    {
                     before(grammarAccess.getAnnotationAccess().getMergeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMerge_in_rule__Annotation__Alternatives344);
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


    // $ANTLR start "rule__Name__Group__0"
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:202:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:206:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:207:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__0374);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Name__Group__1_in_rule__Name__Group__0377);
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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:214:1: rule__Name__Group__0__Impl : ( '@name' ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:218:1: ( ( '@name' ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:219:1: ( '@name' )
            {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:219:1: ( '@name' )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:220:1: '@name'
            {
             before(grammarAccess.getNameAccess().getNameKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Name__Group__0__Impl405); 
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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:233:1: rule__Name__Group__1 : rule__Name__Group__1__Impl ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:237:1: ( rule__Name__Group__1__Impl )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:238:2: rule__Name__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__1436);
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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:244:1: rule__Name__Group__1__Impl : ( ( rule__Name__NameAssignment_1 ) ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:248:1: ( ( ( rule__Name__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:249:1: ( ( rule__Name__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:249:1: ( ( rule__Name__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:250:1: ( rule__Name__NameAssignment_1 )
            {
             before(grammarAccess.getNameAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:251:1: ( rule__Name__NameAssignment_1 )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:251:2: rule__Name__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Name__NameAssignment_1_in_rule__Name__Group__1__Impl463);
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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:265:1: rule__Merge__Group__0 : rule__Merge__Group__0__Impl rule__Merge__Group__1 ;
    public final void rule__Merge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:269:1: ( rule__Merge__Group__0__Impl rule__Merge__Group__1 )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:270:2: rule__Merge__Group__0__Impl rule__Merge__Group__1
            {
            pushFollow(FOLLOW_rule__Merge__Group__0__Impl_in_rule__Merge__Group__0497);
            rule__Merge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Merge__Group__1_in_rule__Merge__Group__0500);
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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:277:1: rule__Merge__Group__0__Impl : ( '@merge' ) ;
    public final void rule__Merge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:281:1: ( ( '@merge' ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:282:1: ( '@merge' )
            {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:282:1: ( '@merge' )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:283:1: '@merge'
            {
             before(grammarAccess.getMergeAccess().getMergeKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Merge__Group__0__Impl528); 
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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:296:1: rule__Merge__Group__1 : rule__Merge__Group__1__Impl ;
    public final void rule__Merge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:300:1: ( rule__Merge__Group__1__Impl )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:301:2: rule__Merge__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Merge__Group__1__Impl_in_rule__Merge__Group__1559);
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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:307:1: rule__Merge__Group__1__Impl : ( ( rule__Merge__NameAssignment_1 ) ) ;
    public final void rule__Merge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:311:1: ( ( ( rule__Merge__NameAssignment_1 ) ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:312:1: ( ( rule__Merge__NameAssignment_1 ) )
            {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:312:1: ( ( rule__Merge__NameAssignment_1 ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:313:1: ( rule__Merge__NameAssignment_1 )
            {
             before(grammarAccess.getMergeAccess().getNameAssignment_1()); 
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:314:1: ( rule__Merge__NameAssignment_1 )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:314:2: rule__Merge__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Merge__NameAssignment_1_in_rule__Merge__Group__1__Impl586);
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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:328:1: rule__Ignore__Group__0 : rule__Ignore__Group__0__Impl rule__Ignore__Group__1 ;
    public final void rule__Ignore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:332:1: ( rule__Ignore__Group__0__Impl rule__Ignore__Group__1 )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:333:2: rule__Ignore__Group__0__Impl rule__Ignore__Group__1
            {
            pushFollow(FOLLOW_rule__Ignore__Group__0__Impl_in_rule__Ignore__Group__0620);
            rule__Ignore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ignore__Group__1_in_rule__Ignore__Group__0623);
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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:340:1: rule__Ignore__Group__0__Impl : ( '@ignore' ) ;
    public final void rule__Ignore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:344:1: ( ( '@ignore' ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:345:1: ( '@ignore' )
            {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:345:1: ( '@ignore' )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:346:1: '@ignore'
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Ignore__Group__0__Impl651); 
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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:359:1: rule__Ignore__Group__1 : rule__Ignore__Group__1__Impl ;
    public final void rule__Ignore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:363:1: ( rule__Ignore__Group__1__Impl )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:364:2: rule__Ignore__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Ignore__Group__1__Impl_in_rule__Ignore__Group__1682);
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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:370:1: rule__Ignore__Group__1__Impl : ( () ) ;
    public final void rule__Ignore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:374:1: ( ( () ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:375:1: ( () )
            {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:375:1: ( () )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:376:1: ()
            {
             before(grammarAccess.getIgnoreAccess().getIgnoreAction_1()); 
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:377:1: ()
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:379:1: 
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


    // $ANTLR start "rule__Name__NameAssignment_1"
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:394:1: rule__Name__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Name__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:398:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:399:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:399:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:400:1: RULE_ID
            {
             before(grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__NameAssignment_1749); 
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
    // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:409:1: rule__Merge__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Merge__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:413:1: ( ( RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:414:1: ( RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:414:1: ( RULE_ID )
            // ../de.uniba.wiai.seda.somsl.annotation.ui/src-gen/de/uniba/wiai/seda/somsl/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:415:1: RULE_ID
            {
             before(grammarAccess.getMergeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Merge__NameAssignment_1780); 
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


 

    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__0_in_ruleName154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_entryRuleMerge181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMerge188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__Group__0_in_ruleMerge214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_entryRuleIgnore241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIgnore248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ignore__Group__0_in_ruleIgnore274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Annotation__Alternatives310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_rule__Annotation__Alternatives327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_rule__Annotation__Alternatives344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__0374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Name__Group__1_in_rule__Name__Group__0377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Name__Group__0__Impl405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__NameAssignment_1_in_rule__Name__Group__1__Impl463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__Group__0__Impl_in_rule__Merge__Group__0497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Merge__Group__1_in_rule__Merge__Group__0500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Merge__Group__0__Impl528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__Group__1__Impl_in_rule__Merge__Group__1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Merge__NameAssignment_1_in_rule__Merge__Group__1__Impl586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ignore__Group__0__Impl_in_rule__Ignore__Group__0620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__Ignore__Group__1_in_rule__Ignore__Group__0623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Ignore__Group__0__Impl651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ignore__Group__1__Impl_in_rule__Ignore__Group__1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__NameAssignment_1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Merge__NameAssignment_1780 = new BitSet(new long[]{0x0000000000000002L});

}