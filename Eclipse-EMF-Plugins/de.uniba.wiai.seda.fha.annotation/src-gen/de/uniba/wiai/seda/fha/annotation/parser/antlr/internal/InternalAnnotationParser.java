package de.uniba.wiai.seda.fha.annotation.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uniba.wiai.seda.fha.annotation.services.AnnotationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VERSION_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@name'", "'@merge'", "'@ignore'", "'@version'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_VERSION_NUMBER=5;
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
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g"; }



     	private AnnotationGrammarAccess grammarAccess;
     	
        public InternalAnnotationParser(TokenStream input, AnnotationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Annotation";	
       	}
       	
       	@Override
       	protected AnnotationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAnnotation"
    // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:67:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:68:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:69:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation75);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:76:1: ruleAnnotation returns [EObject current=null] : (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge | this_Version_3= ruleVersion ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject this_Ignore_1 = null;

        EObject this_Merge_2 = null;

        EObject this_Version_3 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:79:28: ( (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge | this_Version_3= ruleVersion ) )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:80:1: (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge | this_Version_3= ruleVersion )
            {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:80:1: (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge | this_Version_3= ruleVersion )
            int alt1=4;
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
            case 15:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:81:5: this_Name_0= ruleName
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getNameParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleName_in_ruleAnnotation132);
                    this_Name_0=ruleName();

                    state._fsp--;

                     
                            current = this_Name_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:91:5: this_Ignore_1= ruleIgnore
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getIgnoreParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIgnore_in_ruleAnnotation159);
                    this_Ignore_1=ruleIgnore();

                    state._fsp--;

                     
                            current = this_Ignore_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:101:5: this_Merge_2= ruleMerge
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getMergeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMerge_in_ruleAnnotation186);
                    this_Merge_2=ruleMerge();

                    state._fsp--;

                     
                            current = this_Merge_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:111:5: this_Version_3= ruleVersion
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getVersionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleVersion_in_ruleAnnotation213);
                    this_Version_3=ruleVersion();

                    state._fsp--;

                     
                            current = this_Version_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleName"
    // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:127:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:128:2: (iv_ruleName= ruleName EOF )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:129:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName248);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName258); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:136:1: ruleName returns [EObject current=null] : (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:139:28: ( (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:140:1: (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:140:1: (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:140:3: otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleName295); 

                	newLeafNode(otherlv_0, grammarAccess.getNameAccess().getNameKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:144:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:145:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:145:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:146:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName312); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNameAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleMerge"
    // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:170:1: entryRuleMerge returns [EObject current=null] : iv_ruleMerge= ruleMerge EOF ;
    public final EObject entryRuleMerge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMerge = null;


        try {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:171:2: (iv_ruleMerge= ruleMerge EOF )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:172:2: iv_ruleMerge= ruleMerge EOF
            {
             newCompositeNode(grammarAccess.getMergeRule()); 
            pushFollow(FOLLOW_ruleMerge_in_entryRuleMerge353);
            iv_ruleMerge=ruleMerge();

            state._fsp--;

             current =iv_ruleMerge; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMerge363); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMerge"


    // $ANTLR start "ruleMerge"
    // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:179:1: ruleMerge returns [EObject current=null] : (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMerge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:182:28: ( (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:183:1: (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:183:1: (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:183:3: otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleMerge400); 

                	newLeafNode(otherlv_0, grammarAccess.getMergeAccess().getMergeKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:187:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:188:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:188:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:189:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMerge417); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMergeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMergeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMerge"


    // $ANTLR start "entryRuleIgnore"
    // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:213:1: entryRuleIgnore returns [EObject current=null] : iv_ruleIgnore= ruleIgnore EOF ;
    public final EObject entryRuleIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnore = null;


        try {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:214:2: (iv_ruleIgnore= ruleIgnore EOF )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:215:2: iv_ruleIgnore= ruleIgnore EOF
            {
             newCompositeNode(grammarAccess.getIgnoreRule()); 
            pushFollow(FOLLOW_ruleIgnore_in_entryRuleIgnore458);
            iv_ruleIgnore=ruleIgnore();

            state._fsp--;

             current =iv_ruleIgnore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIgnore468); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIgnore"


    // $ANTLR start "ruleIgnore"
    // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:222:1: ruleIgnore returns [EObject current=null] : (otherlv_0= '@ignore' () ) ;
    public final EObject ruleIgnore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:225:28: ( (otherlv_0= '@ignore' () ) )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:226:1: (otherlv_0= '@ignore' () )
            {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:226:1: (otherlv_0= '@ignore' () )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:226:3: otherlv_0= '@ignore' ()
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleIgnore505); 

                	newLeafNode(otherlv_0, grammarAccess.getIgnoreAccess().getIgnoreKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:230:1: ()
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:231:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIgnoreAccess().getIgnoreAction_1(),
                        current);
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIgnore"


    // $ANTLR start "entryRuleVersion"
    // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:244:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:245:2: (iv_ruleVersion= ruleVersion EOF )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:246:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion550);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion560); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:253:1: ruleVersion returns [EObject current=null] : (otherlv_0= '@version' ( (lv_version_1_0= RULE_VERSION_NUMBER ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_version_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:256:28: ( (otherlv_0= '@version' ( (lv_version_1_0= RULE_VERSION_NUMBER ) ) ) )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:257:1: (otherlv_0= '@version' ( (lv_version_1_0= RULE_VERSION_NUMBER ) ) )
            {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:257:1: (otherlv_0= '@version' ( (lv_version_1_0= RULE_VERSION_NUMBER ) ) )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:257:3: otherlv_0= '@version' ( (lv_version_1_0= RULE_VERSION_NUMBER ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleVersion597); 

                	newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getVersionKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:261:1: ( (lv_version_1_0= RULE_VERSION_NUMBER ) )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:262:1: (lv_version_1_0= RULE_VERSION_NUMBER )
            {
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:262:1: (lv_version_1_0= RULE_VERSION_NUMBER )
            // ../de.uniba.wiai.seda.fha.annotation/src-gen/de/uniba/wiai/seda/fha/annotation/parser/antlr/internal/InternalAnnotation.g:263:3: lv_version_1_0= RULE_VERSION_NUMBER
            {
            lv_version_1_0=(Token)match(input,RULE_VERSION_NUMBER,FOLLOW_RULE_VERSION_NUMBER_in_ruleVersion614); 

            			newLeafNode(lv_version_1_0, grammarAccess.getVersionAccess().getVersionVERSION_NUMBERTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVersionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"version",
                    		lv_version_1_0, 
                    		"VERSION_NUMBER");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleAnnotation132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_ruleAnnotation159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_ruleAnnotation186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleAnnotation213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleName295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_entryRuleMerge353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMerge363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleMerge400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMerge417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_entryRuleIgnore458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIgnore468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleIgnore505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleVersion597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_VERSION_NUMBER_in_ruleVersion614 = new BitSet(new long[]{0x0000000000000002L});

}