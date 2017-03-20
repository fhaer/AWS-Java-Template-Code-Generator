package de.uniba.wiai.seda.somsl.annotation.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uniba.wiai.seda.somsl.annotation.services.AnnotationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotationParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g"; }



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
    // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:67:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:68:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:69:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:76:1: ruleAnnotation returns [EObject current=null] : (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject this_Ignore_1 = null;

        EObject this_Merge_2 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:79:28: ( (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge ) )
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:80:1: (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge )
            {
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:80:1: (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge )
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
                    // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:81:5: this_Name_0= ruleName
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
                    // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:91:5: this_Ignore_1= ruleIgnore
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
                    // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:101:5: this_Merge_2= ruleMerge
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getMergeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMerge_in_ruleAnnotation186);
                    this_Merge_2=ruleMerge();

                    state._fsp--;

                     
                            current = this_Merge_2; 
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
    // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:117:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:118:2: (iv_ruleName= ruleName EOF )
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:119:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName221);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName231); 

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
    // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:126:1: ruleName returns [EObject current=null] : (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:129:28: ( (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:130:1: (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:130:1: (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:130:3: otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleName268); 

                	newLeafNode(otherlv_0, grammarAccess.getNameAccess().getNameKeyword_0());
                
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:134:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:135:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:135:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:136:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName285); 

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
    // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:160:1: entryRuleMerge returns [EObject current=null] : iv_ruleMerge= ruleMerge EOF ;
    public final EObject entryRuleMerge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMerge = null;


        try {
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:161:2: (iv_ruleMerge= ruleMerge EOF )
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:162:2: iv_ruleMerge= ruleMerge EOF
            {
             newCompositeNode(grammarAccess.getMergeRule()); 
            pushFollow(FOLLOW_ruleMerge_in_entryRuleMerge326);
            iv_ruleMerge=ruleMerge();

            state._fsp--;

             current =iv_ruleMerge; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMerge336); 

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
    // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:169:1: ruleMerge returns [EObject current=null] : (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMerge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:172:28: ( (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:173:1: (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:173:1: (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:173:3: otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleMerge373); 

                	newLeafNode(otherlv_0, grammarAccess.getMergeAccess().getMergeKeyword_0());
                
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:177:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:178:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:178:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:179:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMerge390); 

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
    // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:203:1: entryRuleIgnore returns [EObject current=null] : iv_ruleIgnore= ruleIgnore EOF ;
    public final EObject entryRuleIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnore = null;


        try {
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:204:2: (iv_ruleIgnore= ruleIgnore EOF )
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:205:2: iv_ruleIgnore= ruleIgnore EOF
            {
             newCompositeNode(grammarAccess.getIgnoreRule()); 
            pushFollow(FOLLOW_ruleIgnore_in_entryRuleIgnore431);
            iv_ruleIgnore=ruleIgnore();

            state._fsp--;

             current =iv_ruleIgnore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIgnore441); 

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
    // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:212:1: ruleIgnore returns [EObject current=null] : (otherlv_0= '@ignore' () ) ;
    public final EObject ruleIgnore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:215:28: ( (otherlv_0= '@ignore' () ) )
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:216:1: (otherlv_0= '@ignore' () )
            {
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:216:1: (otherlv_0= '@ignore' () )
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:216:3: otherlv_0= '@ignore' ()
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleIgnore478); 

                	newLeafNode(otherlv_0, grammarAccess.getIgnoreAccess().getIgnoreKeyword_0());
                
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:220:1: ()
            // ../de.uniba.wiai.seda.somsl.annotation/src-gen/de/uniba/wiai/seda/somsl/annotation/parser/antlr/internal/InternalAnnotation.g:221:5: 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleAnnotation132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_ruleAnnotation159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_ruleAnnotation186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleName268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_entryRuleMerge326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMerge336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleMerge373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMerge390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_entryRuleIgnore431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIgnore441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleIgnore478 = new BitSet(new long[]{0x0000000000000002L});

}