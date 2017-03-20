package de.uniba.wiai.seda.somsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uniba.wiai.seda.somsl.services.SomSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSomSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANNOTATION", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'DT'", "';'", "'('", "') {'", "'.'", "'VOT'", "'OOT'", "'LOT'", "'TOT'", "'interacts_with:'", "'is_a:'", "'is_part_of:'", "'(0,1)'", "'--'", "'(0,*)'", "'->'", "'(1,1)'", "'=='", "'(1,*)'", "'=>'"
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
    public static final int RULE_ANNOTATION=5;
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
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g"; }



     	private SomSLGrammarAccess grammarAccess;
     	
        public InternalSomSLParser(TokenStream input, SomSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Metamodell";	
       	}
       	
       	@Override
       	protected SomSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMetamodell"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:67:1: entryRuleMetamodell returns [EObject current=null] : iv_ruleMetamodell= ruleMetamodell EOF ;
    public final EObject entryRuleMetamodell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodell = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:68:2: (iv_ruleMetamodell= ruleMetamodell EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:69:2: iv_ruleMetamodell= ruleMetamodell EOF
            {
             newCompositeNode(grammarAccess.getMetamodellRule()); 
            pushFollow(FOLLOW_ruleMetamodell_in_entryRuleMetamodell75);
            iv_ruleMetamodell=ruleMetamodell();

            state._fsp--;

             current =iv_ruleMetamodell; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodell85); 

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
    // $ANTLR end "entryRuleMetamodell"


    // $ANTLR start "ruleMetamodell"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:76:1: ruleMetamodell returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_version_1_0= RULE_ID ) ) ( ( (lv_objekttyp_2_0= ruleObjekttyp ) ) | ( (lv_beziehung_3_0= ruleBeziehung ) ) )* ) ;
    public final EObject ruleMetamodell() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_version_1_0=null;
        EObject lv_objekttyp_2_0 = null;

        EObject lv_beziehung_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:79:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_version_1_0= RULE_ID ) ) ( ( (lv_objekttyp_2_0= ruleObjekttyp ) ) | ( (lv_beziehung_3_0= ruleBeziehung ) ) )* ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:80:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_version_1_0= RULE_ID ) ) ( ( (lv_objekttyp_2_0= ruleObjekttyp ) ) | ( (lv_beziehung_3_0= ruleBeziehung ) ) )* )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:80:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_version_1_0= RULE_ID ) ) ( ( (lv_objekttyp_2_0= ruleObjekttyp ) ) | ( (lv_beziehung_3_0= ruleBeziehung ) ) )* )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:80:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_version_1_0= RULE_ID ) ) ( ( (lv_objekttyp_2_0= ruleObjekttyp ) ) | ( (lv_beziehung_3_0= ruleBeziehung ) ) )*
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:80:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:81:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:81:1: (lv_name_0_0= RULE_ID )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:82:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetamodell127); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMetamodellAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetamodellRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:98:2: ( (lv_version_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:99:1: (lv_version_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:99:1: (lv_version_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:100:3: lv_version_1_0= RULE_ID
            {
            lv_version_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetamodell149); 

            			newLeafNode(lv_version_1_0, grammarAccess.getMetamodellAccess().getVersionIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetamodellRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"version",
                    		lv_version_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:116:2: ( ( (lv_objekttyp_2_0= ruleObjekttyp ) ) | ( (lv_beziehung_3_0= ruleBeziehung ) ) )*
            loop1:
            do {
                int alt1=3;
                switch ( input.LA(1) ) {
                case RULE_ANNOTATION:
                    {
                    int LA1_2 = input.LA(2);

                    if ( ((LA1_2>=19 && LA1_2<=22)) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==RULE_ID||(LA1_2>=23 && LA1_2<=25)) ) {
                        alt1=2;
                    }


                    }
                    break;
                case 19:
                case 20:
                case 21:
                case 22:
                    {
                    alt1=1;
                    }
                    break;
                case RULE_ID:
                case 23:
                case 24:
                case 25:
                    {
                    alt1=2;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:116:3: ( (lv_objekttyp_2_0= ruleObjekttyp ) )
            	    {
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:116:3: ( (lv_objekttyp_2_0= ruleObjekttyp ) )
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:117:1: (lv_objekttyp_2_0= ruleObjekttyp )
            	    {
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:117:1: (lv_objekttyp_2_0= ruleObjekttyp )
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:118:3: lv_objekttyp_2_0= ruleObjekttyp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMetamodellAccess().getObjekttypObjekttypParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleObjekttyp_in_ruleMetamodell176);
            	    lv_objekttyp_2_0=ruleObjekttyp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMetamodellRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"objekttyp",
            	            		lv_objekttyp_2_0, 
            	            		"Objekttyp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:135:6: ( (lv_beziehung_3_0= ruleBeziehung ) )
            	    {
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:135:6: ( (lv_beziehung_3_0= ruleBeziehung ) )
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:136:1: (lv_beziehung_3_0= ruleBeziehung )
            	    {
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:136:1: (lv_beziehung_3_0= ruleBeziehung )
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:137:3: lv_beziehung_3_0= ruleBeziehung
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMetamodellAccess().getBeziehungBeziehungParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBeziehung_in_ruleMetamodell203);
            	    lv_beziehung_3_0=ruleBeziehung();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMetamodellRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"beziehung",
            	            		lv_beziehung_3_0, 
            	            		"Beziehung");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleMetamodell"


    // $ANTLR start "entryRuleObjekttyp"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:161:1: entryRuleObjekttyp returns [EObject current=null] : iv_ruleObjekttyp= ruleObjekttyp EOF ;
    public final EObject entryRuleObjekttyp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjekttyp = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:162:2: (iv_ruleObjekttyp= ruleObjekttyp EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:163:2: iv_ruleObjekttyp= ruleObjekttyp EOF
            {
             newCompositeNode(grammarAccess.getObjekttypRule()); 
            pushFollow(FOLLOW_ruleObjekttyp_in_entryRuleObjekttyp241);
            iv_ruleObjekttyp=ruleObjekttyp();

            state._fsp--;

             current =iv_ruleObjekttyp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjekttyp251); 

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
    // $ANTLR end "entryRuleObjekttyp"


    // $ANTLR start "ruleObjekttyp"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:170:1: ruleObjekttyp returns [EObject current=null] : ( (this_ANNOTATION_0= RULE_ANNOTATION )? (this_KOT_1= ruleKOT | this_VOT_2= ruleVOT ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attribute_5_0= ruleAttribut ) )* ( (lv_operatoren_6_0= ruleOperator ) )* otherlv_7= '}' ) ;
    public final EObject ruleObjekttyp() throws RecognitionException {
        EObject current = null;

        Token this_ANNOTATION_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject this_KOT_1 = null;

        EObject this_VOT_2 = null;

        EObject lv_attribute_5_0 = null;

        EObject lv_operatoren_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:173:28: ( ( (this_ANNOTATION_0= RULE_ANNOTATION )? (this_KOT_1= ruleKOT | this_VOT_2= ruleVOT ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attribute_5_0= ruleAttribut ) )* ( (lv_operatoren_6_0= ruleOperator ) )* otherlv_7= '}' ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:174:1: ( (this_ANNOTATION_0= RULE_ANNOTATION )? (this_KOT_1= ruleKOT | this_VOT_2= ruleVOT ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attribute_5_0= ruleAttribut ) )* ( (lv_operatoren_6_0= ruleOperator ) )* otherlv_7= '}' )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:174:1: ( (this_ANNOTATION_0= RULE_ANNOTATION )? (this_KOT_1= ruleKOT | this_VOT_2= ruleVOT ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attribute_5_0= ruleAttribut ) )* ( (lv_operatoren_6_0= ruleOperator ) )* otherlv_7= '}' )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:174:2: (this_ANNOTATION_0= RULE_ANNOTATION )? (this_KOT_1= ruleKOT | this_VOT_2= ruleVOT ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_attribute_5_0= ruleAttribut ) )* ( (lv_operatoren_6_0= ruleOperator ) )* otherlv_7= '}'
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:174:2: (this_ANNOTATION_0= RULE_ANNOTATION )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ANNOTATION) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:174:3: this_ANNOTATION_0= RULE_ANNOTATION
                    {
                    this_ANNOTATION_0=(Token)match(input,RULE_ANNOTATION,FOLLOW_RULE_ANNOTATION_in_ruleObjekttyp288); 
                     
                        newLeafNode(this_ANNOTATION_0, grammarAccess.getObjekttypAccess().getANNOTATIONTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:178:3: (this_KOT_1= ruleKOT | this_VOT_2= ruleVOT )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=20 && LA3_0<=22)) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:179:5: this_KOT_1= ruleKOT
                    {
                     
                            newCompositeNode(grammarAccess.getObjekttypAccess().getKOTParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleKOT_in_ruleObjekttyp312);
                    this_KOT_1=ruleKOT();

                    state._fsp--;

                     
                            current = this_KOT_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:189:5: this_VOT_2= ruleVOT
                    {
                     
                            newCompositeNode(grammarAccess.getObjekttypAccess().getVOTParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleVOT_in_ruleObjekttyp339);
                    this_VOT_2=ruleVOT();

                    state._fsp--;

                     
                            current = this_VOT_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:197:2: ( (lv_name_3_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:198:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:198:1: (lv_name_3_0= RULE_ID )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:199:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjekttyp356); 

            			newLeafNode(lv_name_3_0, grammarAccess.getObjekttypAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjekttypRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleObjekttyp373); 

                	newLeafNode(otherlv_4, grammarAccess.getObjekttypAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:219:1: ( (lv_attribute_5_0= ruleAttribut ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==RULE_ID) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:220:1: (lv_attribute_5_0= ruleAttribut )
            	    {
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:220:1: (lv_attribute_5_0= ruleAttribut )
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:221:3: lv_attribute_5_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjekttypAccess().getAttributeAttributParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleObjekttyp394);
            	    lv_attribute_5_0=ruleAttribut();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjekttypRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_5_0, 
            	            		"Attribut");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:237:3: ( (lv_operatoren_6_0= ruleOperator ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:238:1: (lv_operatoren_6_0= ruleOperator )
            	    {
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:238:1: (lv_operatoren_6_0= ruleOperator )
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:239:3: lv_operatoren_6_0= ruleOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjekttypAccess().getOperatorenOperatorParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperator_in_ruleObjekttyp416);
            	    lv_operatoren_6_0=ruleOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjekttypRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operatoren",
            	            		lv_operatoren_6_0, 
            	            		"Operator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleObjekttyp429); 

                	newLeafNode(otherlv_7, grammarAccess.getObjekttypAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleObjekttyp"


    // $ANTLR start "entryRuleAttribut"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:267:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:268:2: (iv_ruleAttribut= ruleAttribut EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:269:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_ruleAttribut_in_entryRuleAttribut465);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribut475); 

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
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:276:1: ruleAttribut returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_datentyp_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:279:28: ( ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:280:1: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:280:1: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:280:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:280:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:280:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:280:3: ( (otherlv_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:281:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:281:1: (otherlv_0= RULE_ID )
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:282:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribut521); 

                    		newLeafNode(otherlv_0, grammarAccess.getAttributAccess().getObjekttypObjekttypCrossReference_0_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:294:6: (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) )
                    {
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:294:6: (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) )
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:294:8: otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleAttribut540); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributAccess().getDTKeyword_0_1_0());
                        
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:298:1: ( (lv_datentyp_2_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:299:1: (lv_datentyp_2_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:299:1: (lv_datentyp_2_0= RULE_ID )
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:300:3: lv_datentyp_2_0= RULE_ID
                    {
                    lv_datentyp_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribut557); 

                    			newLeafNode(lv_datentyp_2_0, grammarAccess.getAttributAccess().getDatentypIDTerminalRuleCall_0_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"datentyp",
                            		lv_datentyp_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:316:4: ( (lv_name_3_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:317:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:317:1: (lv_name_3_0= RULE_ID )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:318:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribut581); 

            			newLeafNode(lv_name_3_0, grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleAttribut598); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleOperator"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:346:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:347:2: (iv_ruleOperator= ruleOperator EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:348:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator634);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator644); 

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:355:1: ruleOperator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ') {' ( (lv_anweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_anweisungen_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:358:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ') {' ( (lv_anweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:359:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ') {' ( (lv_anweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:359:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ') {' ( (lv_anweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:359:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ') {' ( (lv_anweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}'
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:359:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:360:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:360:1: (lv_name_0_0= RULE_ID )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:361:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperator686); 

            			newLeafNode(lv_name_0_0, grammarAccess.getOperatorAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOperatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleOperator703); 

                	newLeafNode(otherlv_1, grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:381:1: ( (otherlv_2= RULE_ID ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:382:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:382:1: (otherlv_2= RULE_ID )
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:383:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperatorRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperator723); 

            	    		newLeafNode(otherlv_2, grammarAccess.getOperatorAccess().getParameterObjekttypCrossReference_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleOperator736); 

                	newLeafNode(otherlv_3, grammarAccess.getOperatorAccess().getRightParenthesisSpaceLeftCurlyBracketKeyword_3());
                
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:398:1: ( (lv_anweisungen_4_0= ruleAnweisung ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:399:1: (lv_anweisungen_4_0= ruleAnweisung )
            	    {
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:399:1: (lv_anweisungen_4_0= ruleAnweisung )
            	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:400:3: lv_anweisungen_4_0= ruleAnweisung
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOperatorAccess().getAnweisungenAnweisungParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnweisung_in_ruleOperator757);
            	    lv_anweisungen_4_0=ruleAnweisung();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOperatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"anweisungen",
            	            		lv_anweisungen_4_0, 
            	            		"Anweisung");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleOperator770); 

                	newLeafNode(otherlv_5, grammarAccess.getOperatorAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleAnweisung"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:428:1: entryRuleAnweisung returns [EObject current=null] : iv_ruleAnweisung= ruleAnweisung EOF ;
    public final EObject entryRuleAnweisung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnweisung = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:429:2: (iv_ruleAnweisung= ruleAnweisung EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:430:2: iv_ruleAnweisung= ruleAnweisung EOF
            {
             newCompositeNode(grammarAccess.getAnweisungRule()); 
            pushFollow(FOLLOW_ruleAnweisung_in_entryRuleAnweisung806);
            iv_ruleAnweisung=ruleAnweisung();

            state._fsp--;

             current =iv_ruleAnweisung; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnweisung816); 

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
    // $ANTLR end "entryRuleAnweisung"


    // $ANTLR start "ruleAnweisung"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:437:1: ruleAnweisung returns [EObject current=null] : ( ( ( (lv_kontrollstruktur_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_bedingung_2_0= ruleAnweisung ) ) otherlv_3= ') {' ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' ) | ( ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )? ( (lv_operator_8_0= RULE_ID ) ) ) ) ;
    public final EObject ruleAnweisung() throws RecognitionException {
        EObject current = null;

        Token lv_kontrollstruktur_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_operator_8_0=null;
        EObject lv_bedingung_2_0 = null;

        EObject lv_bedigteAnweisungen_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:440:28: ( ( ( ( (lv_kontrollstruktur_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_bedingung_2_0= ruleAnweisung ) ) otherlv_3= ') {' ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' ) | ( ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )? ( (lv_operator_8_0= RULE_ID ) ) ) ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:441:1: ( ( ( (lv_kontrollstruktur_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_bedingung_2_0= ruleAnweisung ) ) otherlv_3= ') {' ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' ) | ( ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )? ( (lv_operator_8_0= RULE_ID ) ) ) )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:441:1: ( ( ( (lv_kontrollstruktur_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_bedingung_2_0= ruleAnweisung ) ) otherlv_3= ') {' ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' ) | ( ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )? ( (lv_operator_8_0= RULE_ID ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==16) ) {
                    alt11=1;
                }
                else if ( (LA11_1==EOF||LA11_1==RULE_ID||LA11_1==13||(LA11_1>=17 && LA11_1<=18)) ) {
                    alt11=2;
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
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:441:2: ( ( (lv_kontrollstruktur_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_bedingung_2_0= ruleAnweisung ) ) otherlv_3= ') {' ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' )
                    {
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:441:2: ( ( (lv_kontrollstruktur_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_bedingung_2_0= ruleAnweisung ) ) otherlv_3= ') {' ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' )
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:441:3: ( (lv_kontrollstruktur_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_bedingung_2_0= ruleAnweisung ) ) otherlv_3= ') {' ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}'
                    {
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:441:3: ( (lv_kontrollstruktur_0_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:442:1: (lv_kontrollstruktur_0_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:442:1: (lv_kontrollstruktur_0_0= RULE_ID )
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:443:3: lv_kontrollstruktur_0_0= RULE_ID
                    {
                    lv_kontrollstruktur_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnweisung859); 

                    			newLeafNode(lv_kontrollstruktur_0_0, grammarAccess.getAnweisungAccess().getKontrollstrukturIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnweisungRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"kontrollstruktur",
                            		lv_kontrollstruktur_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleAnweisung876); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnweisungAccess().getLeftParenthesisKeyword_0_1());
                        
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:463:1: ( (lv_bedingung_2_0= ruleAnweisung ) )
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:464:1: (lv_bedingung_2_0= ruleAnweisung )
                    {
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:464:1: (lv_bedingung_2_0= ruleAnweisung )
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:465:3: lv_bedingung_2_0= ruleAnweisung
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnweisungAccess().getBedingungAnweisungParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnweisung_in_ruleAnweisung897);
                    lv_bedingung_2_0=ruleAnweisung();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnweisungRule());
                    	        }
                           		set(
                           			current, 
                           			"bedingung",
                            		lv_bedingung_2_0, 
                            		"Anweisung");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleAnweisung909); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnweisungAccess().getRightParenthesisSpaceLeftCurlyBracketKeyword_0_3());
                        
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:485:1: ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:486:1: (lv_bedigteAnweisungen_4_0= ruleAnweisung )
                    	    {
                    	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:486:1: (lv_bedigteAnweisungen_4_0= ruleAnweisung )
                    	    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:487:3: lv_bedigteAnweisungen_4_0= ruleAnweisung
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnweisungAccess().getBedigteAnweisungenAnweisungParserRuleCall_0_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnweisung_in_ruleAnweisung930);
                    	    lv_bedigteAnweisungen_4_0=ruleAnweisung();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnweisungRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"bedigteAnweisungen",
                    	            		lv_bedigteAnweisungen_4_0, 
                    	            		"Anweisung");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleAnweisung943); 

                        	newLeafNode(otherlv_5, grammarAccess.getAnweisungAccess().getRightCurlyBracketKeyword_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:508:6: ( ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )? ( (lv_operator_8_0= RULE_ID ) ) )
                    {
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:508:6: ( ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )? ( (lv_operator_8_0= RULE_ID ) ) )
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:508:7: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )? ( (lv_operator_8_0= RULE_ID ) )
                    {
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:508:7: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==18) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:508:8: ( (otherlv_6= RULE_ID ) ) otherlv_7= '.'
                            {
                            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:508:8: ( (otherlv_6= RULE_ID ) )
                            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:509:1: (otherlv_6= RULE_ID )
                            {
                            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:509:1: (otherlv_6= RULE_ID )
                            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:510:3: otherlv_6= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getAnweisungRule());
                            	        }
                                    
                            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnweisung972); 

                            		newLeafNode(otherlv_6, grammarAccess.getAnweisungAccess().getObjektObjekttypCrossReference_1_0_0_0()); 
                            	

                            }


                            }

                            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleAnweisung984); 

                                	newLeafNode(otherlv_7, grammarAccess.getAnweisungAccess().getFullStopKeyword_1_0_1());
                                

                            }
                            break;

                    }

                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:525:3: ( (lv_operator_8_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:526:1: (lv_operator_8_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:526:1: (lv_operator_8_0= RULE_ID )
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:527:3: lv_operator_8_0= RULE_ID
                    {
                    lv_operator_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnweisung1003); 

                    			newLeafNode(lv_operator_8_0, grammarAccess.getAnweisungAccess().getOperatorIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnweisungRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operator",
                            		lv_operator_8_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


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
    // $ANTLR end "ruleAnweisung"


    // $ANTLR start "entryRuleKOT"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:551:1: entryRuleKOT returns [EObject current=null] : iv_ruleKOT= ruleKOT EOF ;
    public final EObject entryRuleKOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKOT = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:552:2: (iv_ruleKOT= ruleKOT EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:553:2: iv_ruleKOT= ruleKOT EOF
            {
             newCompositeNode(grammarAccess.getKOTRule()); 
            pushFollow(FOLLOW_ruleKOT_in_entryRuleKOT1045);
            iv_ruleKOT=ruleKOT();

            state._fsp--;

             current =iv_ruleKOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKOT1055); 

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
    // $ANTLR end "entryRuleKOT"


    // $ANTLR start "ruleKOT"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:560:1: ruleKOT returns [EObject current=null] : (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT ) ;
    public final EObject ruleKOT() throws RecognitionException {
        EObject current = null;

        EObject this_OOT_0 = null;

        EObject this_LOT_1 = null;

        EObject this_TOT_2 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:563:28: ( (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:564:1: (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:564:1: (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt12=1;
                }
                break;
            case 21:
                {
                alt12=2;
                }
                break;
            case 22:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:565:5: this_OOT_0= ruleOOT
                    {
                     
                            newCompositeNode(grammarAccess.getKOTAccess().getOOTParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOOT_in_ruleKOT1102);
                    this_OOT_0=ruleOOT();

                    state._fsp--;

                     
                            current = this_OOT_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:575:5: this_LOT_1= ruleLOT
                    {
                     
                            newCompositeNode(grammarAccess.getKOTAccess().getLOTParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLOT_in_ruleKOT1129);
                    this_LOT_1=ruleLOT();

                    state._fsp--;

                     
                            current = this_LOT_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:585:5: this_TOT_2= ruleTOT
                    {
                     
                            newCompositeNode(grammarAccess.getKOTAccess().getTOTParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTOT_in_ruleKOT1156);
                    this_TOT_2=ruleTOT();

                    state._fsp--;

                     
                            current = this_TOT_2; 
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
    // $ANTLR end "ruleKOT"


    // $ANTLR start "entryRuleVOT"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:601:1: entryRuleVOT returns [EObject current=null] : iv_ruleVOT= ruleVOT EOF ;
    public final EObject entryRuleVOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVOT = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:602:2: (iv_ruleVOT= ruleVOT EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:603:2: iv_ruleVOT= ruleVOT EOF
            {
             newCompositeNode(grammarAccess.getVOTRule()); 
            pushFollow(FOLLOW_ruleVOT_in_entryRuleVOT1191);
            iv_ruleVOT=ruleVOT();

            state._fsp--;

             current =iv_ruleVOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVOT1201); 

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
    // $ANTLR end "entryRuleVOT"


    // $ANTLR start "ruleVOT"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:610:1: ruleVOT returns [EObject current=null] : (otherlv_0= 'VOT' () ) ;
    public final EObject ruleVOT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:613:28: ( (otherlv_0= 'VOT' () ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:614:1: (otherlv_0= 'VOT' () )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:614:1: (otherlv_0= 'VOT' () )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:614:3: otherlv_0= 'VOT' ()
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleVOT1238); 

                	newLeafNode(otherlv_0, grammarAccess.getVOTAccess().getVOTKeyword_0());
                
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:618:1: ()
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:619:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVOTAccess().getVOTAction_1(),
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
    // $ANTLR end "ruleVOT"


    // $ANTLR start "entryRuleOOT"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:632:1: entryRuleOOT returns [EObject current=null] : iv_ruleOOT= ruleOOT EOF ;
    public final EObject entryRuleOOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOOT = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:633:2: (iv_ruleOOT= ruleOOT EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:634:2: iv_ruleOOT= ruleOOT EOF
            {
             newCompositeNode(grammarAccess.getOOTRule()); 
            pushFollow(FOLLOW_ruleOOT_in_entryRuleOOT1283);
            iv_ruleOOT=ruleOOT();

            state._fsp--;

             current =iv_ruleOOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOOT1293); 

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
    // $ANTLR end "entryRuleOOT"


    // $ANTLR start "ruleOOT"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:641:1: ruleOOT returns [EObject current=null] : (otherlv_0= 'OOT' () ) ;
    public final EObject ruleOOT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:644:28: ( (otherlv_0= 'OOT' () ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:645:1: (otherlv_0= 'OOT' () )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:645:1: (otherlv_0= 'OOT' () )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:645:3: otherlv_0= 'OOT' ()
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleOOT1330); 

                	newLeafNode(otherlv_0, grammarAccess.getOOTAccess().getOOTKeyword_0());
                
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:649:1: ()
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:650:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOOTAccess().getOOTAction_1(),
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
    // $ANTLR end "ruleOOT"


    // $ANTLR start "entryRuleLOT"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:663:1: entryRuleLOT returns [EObject current=null] : iv_ruleLOT= ruleLOT EOF ;
    public final EObject entryRuleLOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLOT = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:664:2: (iv_ruleLOT= ruleLOT EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:665:2: iv_ruleLOT= ruleLOT EOF
            {
             newCompositeNode(grammarAccess.getLOTRule()); 
            pushFollow(FOLLOW_ruleLOT_in_entryRuleLOT1375);
            iv_ruleLOT=ruleLOT();

            state._fsp--;

             current =iv_ruleLOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOT1385); 

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
    // $ANTLR end "entryRuleLOT"


    // $ANTLR start "ruleLOT"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:672:1: ruleLOT returns [EObject current=null] : (otherlv_0= 'LOT' () ) ;
    public final EObject ruleLOT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:675:28: ( (otherlv_0= 'LOT' () ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:676:1: (otherlv_0= 'LOT' () )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:676:1: (otherlv_0= 'LOT' () )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:676:3: otherlv_0= 'LOT' ()
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleLOT1422); 

                	newLeafNode(otherlv_0, grammarAccess.getLOTAccess().getLOTKeyword_0());
                
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:680:1: ()
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:681:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLOTAccess().getLOTAction_1(),
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
    // $ANTLR end "ruleLOT"


    // $ANTLR start "entryRuleTOT"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:694:1: entryRuleTOT returns [EObject current=null] : iv_ruleTOT= ruleTOT EOF ;
    public final EObject entryRuleTOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTOT = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:695:2: (iv_ruleTOT= ruleTOT EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:696:2: iv_ruleTOT= ruleTOT EOF
            {
             newCompositeNode(grammarAccess.getTOTRule()); 
            pushFollow(FOLLOW_ruleTOT_in_entryRuleTOT1467);
            iv_ruleTOT=ruleTOT();

            state._fsp--;

             current =iv_ruleTOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTOT1477); 

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
    // $ANTLR end "entryRuleTOT"


    // $ANTLR start "ruleTOT"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:703:1: ruleTOT returns [EObject current=null] : (otherlv_0= 'TOT' () ) ;
    public final EObject ruleTOT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:706:28: ( (otherlv_0= 'TOT' () ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:707:1: (otherlv_0= 'TOT' () )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:707:1: (otherlv_0= 'TOT' () )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:707:3: otherlv_0= 'TOT' ()
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleTOT1514); 

                	newLeafNode(otherlv_0, grammarAccess.getTOTAccess().getTOTKeyword_0());
                
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:711:1: ()
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:712:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTOTAccess().getTOTAction_1(),
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
    // $ANTLR end "ruleTOT"


    // $ANTLR start "entryRuleBeziehung"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:725:1: entryRuleBeziehung returns [EObject current=null] : iv_ruleBeziehung= ruleBeziehung EOF ;
    public final EObject entryRuleBeziehung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeziehung = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:726:2: (iv_ruleBeziehung= ruleBeziehung EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:727:2: iv_ruleBeziehung= ruleBeziehung EOF
            {
             newCompositeNode(grammarAccess.getBeziehungRule()); 
            pushFollow(FOLLOW_ruleBeziehung_in_entryRuleBeziehung1559);
            iv_ruleBeziehung=ruleBeziehung();

            state._fsp--;

             current =iv_ruleBeziehung; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeziehung1569); 

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
    // $ANTLR end "entryRuleBeziehung"


    // $ANTLR start "ruleBeziehung"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:734:1: ruleBeziehung returns [EObject current=null] : ( (this_ANNOTATION_0= RULE_ANNOTATION )? (this_Is_a_1= ruleIs_a | this_Interacts_with_2= ruleInteracts_with | this_Is_part_of_3= ruleIs_part_of ) ) ;
    public final EObject ruleBeziehung() throws RecognitionException {
        EObject current = null;

        Token this_ANNOTATION_0=null;
        EObject this_Is_a_1 = null;

        EObject this_Interacts_with_2 = null;

        EObject this_Is_part_of_3 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:737:28: ( ( (this_ANNOTATION_0= RULE_ANNOTATION )? (this_Is_a_1= ruleIs_a | this_Interacts_with_2= ruleInteracts_with | this_Is_part_of_3= ruleIs_part_of ) ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:738:1: ( (this_ANNOTATION_0= RULE_ANNOTATION )? (this_Is_a_1= ruleIs_a | this_Interacts_with_2= ruleInteracts_with | this_Is_part_of_3= ruleIs_part_of ) )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:738:1: ( (this_ANNOTATION_0= RULE_ANNOTATION )? (this_Is_a_1= ruleIs_a | this_Interacts_with_2= ruleInteracts_with | this_Is_part_of_3= ruleIs_part_of ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:738:2: (this_ANNOTATION_0= RULE_ANNOTATION )? (this_Is_a_1= ruleIs_a | this_Interacts_with_2= ruleInteracts_with | this_Is_part_of_3= ruleIs_part_of )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:738:2: (this_ANNOTATION_0= RULE_ANNOTATION )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ANNOTATION) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:738:3: this_ANNOTATION_0= RULE_ANNOTATION
                    {
                    this_ANNOTATION_0=(Token)match(input,RULE_ANNOTATION,FOLLOW_RULE_ANNOTATION_in_ruleBeziehung1606); 
                     
                        newLeafNode(this_ANNOTATION_0, grammarAccess.getBeziehungAccess().getANNOTATIONTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:742:3: (this_Is_a_1= ruleIs_a | this_Interacts_with_2= ruleInteracts_with | this_Is_part_of_3= ruleIs_part_of )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
            case 23:
                {
                alt14=2;
                }
                break;
            case 25:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:743:5: this_Is_a_1= ruleIs_a
                    {
                     
                            newCompositeNode(grammarAccess.getBeziehungAccess().getIs_aParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleIs_a_in_ruleBeziehung1630);
                    this_Is_a_1=ruleIs_a();

                    state._fsp--;

                     
                            current = this_Is_a_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:753:5: this_Interacts_with_2= ruleInteracts_with
                    {
                     
                            newCompositeNode(grammarAccess.getBeziehungAccess().getInteracts_withParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleInteracts_with_in_ruleBeziehung1657);
                    this_Interacts_with_2=ruleInteracts_with();

                    state._fsp--;

                     
                            current = this_Interacts_with_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:763:5: this_Is_part_of_3= ruleIs_part_of
                    {
                     
                            newCompositeNode(grammarAccess.getBeziehungAccess().getIs_part_ofParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleIs_part_of_in_ruleBeziehung1684);
                    this_Is_part_of_3=ruleIs_part_of();

                    state._fsp--;

                     
                            current = this_Is_part_of_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleBeziehung"


    // $ANTLR start "entryRuleInteracts_with"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:779:1: entryRuleInteracts_with returns [EObject current=null] : iv_ruleInteracts_with= ruleInteracts_with EOF ;
    public final EObject entryRuleInteracts_with() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteracts_with = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:780:2: (iv_ruleInteracts_with= ruleInteracts_with EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:781:2: iv_ruleInteracts_with= ruleInteracts_with EOF
            {
             newCompositeNode(grammarAccess.getInteracts_withRule()); 
            pushFollow(FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with1720);
            iv_ruleInteracts_with=ruleInteracts_with();

            state._fsp--;

             current =iv_ruleInteracts_with; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteracts_with1730); 

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
    // $ANTLR end "entryRuleInteracts_with"


    // $ANTLR start "ruleInteracts_with"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:788:1: ruleInteracts_with returns [EObject current=null] : ( (otherlv_0= 'interacts_with:' )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleInteracts_with() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_kardinalitaet_2_1 = null;

        EObject lv_kardinalitaet_2_2 = null;

        EObject lv_kardinalitaet_2_3 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:791:28: ( ( (otherlv_0= 'interacts_with:' )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:792:1: ( (otherlv_0= 'interacts_with:' )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:792:1: ( (otherlv_0= 'interacts_with:' )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) ) ) ( (otherlv_3= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:792:2: (otherlv_0= 'interacts_with:' )? ( (otherlv_1= RULE_ID ) ) ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) ) ) ( (otherlv_3= RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:792:2: (otherlv_0= 'interacts_with:' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:792:4: otherlv_0= 'interacts_with:'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleInteracts_with1768); 

                        	newLeafNode(otherlv_0, grammarAccess.getInteracts_withAccess().getInteracts_withKeyword_0());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:796:3: ( (otherlv_1= RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:797:1: (otherlv_1= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:797:1: (otherlv_1= RULE_ID )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:798:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInteracts_withRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteracts_with1790); 

            		newLeafNode(otherlv_1, grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypCrossReference_1_0()); 
            	

            }


            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:809:2: ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:810:1: ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:810:1: ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:811:1: (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:811:1: (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 26:
            case 27:
                {
                alt16=1;
                }
                break;
            case 28:
            case 29:
                {
                alt16=2;
                }
                break;
            case 32:
            case 33:
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
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:812:3: lv_kardinalitaet_2_1= ruleKardinalitaet01
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet01ParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_ruleInteracts_with1813);
                    lv_kardinalitaet_2_1=ruleKardinalitaet01();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInteracts_withRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_2_1, 
                            		"Kardinalitaet01");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:827:8: lv_kardinalitaet_2_2= ruleKardinalitaet0x
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet0xParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_ruleInteracts_with1832);
                    lv_kardinalitaet_2_2=ruleKardinalitaet0x();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInteracts_withRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_2_2, 
                            		"Kardinalitaet0x");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:842:8: lv_kardinalitaet_2_3= ruleKardinalitaet1x
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet1xParserRuleCall_2_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_ruleInteracts_with1851);
                    lv_kardinalitaet_2_3=ruleKardinalitaet1x();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInteracts_withRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_2_3, 
                            		"Kardinalitaet1x");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:860:2: ( (otherlv_3= RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:861:1: (otherlv_3= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:861:1: (otherlv_3= RULE_ID )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:862:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInteracts_withRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteracts_with1874); 

            		newLeafNode(otherlv_3, grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleInteracts_with"


    // $ANTLR start "entryRuleIs_a"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:881:1: entryRuleIs_a returns [EObject current=null] : iv_ruleIs_a= ruleIs_a EOF ;
    public final EObject entryRuleIs_a() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIs_a = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:882:2: (iv_ruleIs_a= ruleIs_a EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:883:2: iv_ruleIs_a= ruleIs_a EOF
            {
             newCompositeNode(grammarAccess.getIs_aRule()); 
            pushFollow(FOLLOW_ruleIs_a_in_entryRuleIs_a1910);
            iv_ruleIs_a=ruleIs_a();

            state._fsp--;

             current =iv_ruleIs_a; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_a1920); 

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
    // $ANTLR end "entryRuleIs_a"


    // $ANTLR start "ruleIs_a"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:890:1: ruleIs_a returns [EObject current=null] : (otherlv_0= 'is_a:' ( (otherlv_1= RULE_ID ) ) ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet11 ) ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleIs_a() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_kardinalitaet_2_1 = null;

        EObject lv_kardinalitaet_2_2 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:893:28: ( (otherlv_0= 'is_a:' ( (otherlv_1= RULE_ID ) ) ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet11 ) ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:894:1: (otherlv_0= 'is_a:' ( (otherlv_1= RULE_ID ) ) ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet11 ) ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:894:1: (otherlv_0= 'is_a:' ( (otherlv_1= RULE_ID ) ) ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet11 ) ) ) ( (otherlv_3= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:894:3: otherlv_0= 'is_a:' ( (otherlv_1= RULE_ID ) ) ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet11 ) ) ) ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleIs_a1957); 

                	newLeafNode(otherlv_0, grammarAccess.getIs_aAccess().getIs_aKeyword_0());
                
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:898:1: ( (otherlv_1= RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:899:1: (otherlv_1= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:899:1: (otherlv_1= RULE_ID )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:900:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_aRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_a1977); 

            		newLeafNode(otherlv_1, grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypCrossReference_1_0()); 
            	

            }


            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:911:2: ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet11 ) ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:912:1: ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet11 ) )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:912:1: ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet11 ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:913:1: (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet11 )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:913:1: (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet11 )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=26 && LA17_0<=27)) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=30 && LA17_0<=31)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:914:3: lv_kardinalitaet_2_1= ruleKardinalitaet01
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet01ParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_ruleIs_a2000);
                    lv_kardinalitaet_2_1=ruleKardinalitaet01();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIs_aRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_2_1, 
                            		"Kardinalitaet01");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:929:8: lv_kardinalitaet_2_2= ruleKardinalitaet11
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet11ParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet11_in_ruleIs_a2019);
                    lv_kardinalitaet_2_2=ruleKardinalitaet11();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIs_aRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_2_2, 
                            		"Kardinalitaet11");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:947:2: ( (otherlv_3= RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:948:1: (otherlv_3= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:948:1: (otherlv_3= RULE_ID )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:949:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_aRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_a2042); 

            		newLeafNode(otherlv_3, grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleIs_a"


    // $ANTLR start "entryRuleIs_part_of"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:968:1: entryRuleIs_part_of returns [EObject current=null] : iv_ruleIs_part_of= ruleIs_part_of EOF ;
    public final EObject entryRuleIs_part_of() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIs_part_of = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:969:2: (iv_ruleIs_part_of= ruleIs_part_of EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:970:2: iv_ruleIs_part_of= ruleIs_part_of EOF
            {
             newCompositeNode(grammarAccess.getIs_part_ofRule()); 
            pushFollow(FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of2078);
            iv_ruleIs_part_of=ruleIs_part_of();

            state._fsp--;

             current =iv_ruleIs_part_of; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_part_of2088); 

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
    // $ANTLR end "entryRuleIs_part_of"


    // $ANTLR start "ruleIs_part_of"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:977:1: ruleIs_part_of returns [EObject current=null] : (otherlv_0= 'is_part_of:' ( (otherlv_1= RULE_ID ) ) ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleIs_part_of() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_kardinalitaet_2_1 = null;

        EObject lv_kardinalitaet_2_2 = null;

        EObject lv_kardinalitaet_2_3 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:980:28: ( (otherlv_0= 'is_part_of:' ( (otherlv_1= RULE_ID ) ) ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:981:1: (otherlv_0= 'is_part_of:' ( (otherlv_1= RULE_ID ) ) ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:981:1: (otherlv_0= 'is_part_of:' ( (otherlv_1= RULE_ID ) ) ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) ) ) ( (otherlv_3= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:981:3: otherlv_0= 'is_part_of:' ( (otherlv_1= RULE_ID ) ) ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) ) ) ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleIs_part_of2125); 

                	newLeafNode(otherlv_0, grammarAccess.getIs_part_ofAccess().getIs_part_ofKeyword_0());
                
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:985:1: ( (otherlv_1= RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:986:1: (otherlv_1= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:986:1: (otherlv_1= RULE_ID )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:987:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_part_ofRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_part_of2145); 

            		newLeafNode(otherlv_1, grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypCrossReference_1_0()); 
            	

            }


            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:998:2: ( ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:999:1: ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:999:1: ( (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1000:1: (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1000:1: (lv_kardinalitaet_2_1= ruleKardinalitaet01 | lv_kardinalitaet_2_2= ruleKardinalitaet0x | lv_kardinalitaet_2_3= ruleKardinalitaet1x )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 26:
            case 27:
                {
                alt18=1;
                }
                break;
            case 28:
            case 29:
                {
                alt18=2;
                }
                break;
            case 32:
            case 33:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1001:3: lv_kardinalitaet_2_1= ruleKardinalitaet01
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet01ParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_ruleIs_part_of2168);
                    lv_kardinalitaet_2_1=ruleKardinalitaet01();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIs_part_ofRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_2_1, 
                            		"Kardinalitaet01");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1016:8: lv_kardinalitaet_2_2= ruleKardinalitaet0x
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet0xParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_ruleIs_part_of2187);
                    lv_kardinalitaet_2_2=ruleKardinalitaet0x();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIs_part_ofRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_2_2, 
                            		"Kardinalitaet0x");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1031:8: lv_kardinalitaet_2_3= ruleKardinalitaet1x
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet1xParserRuleCall_2_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_ruleIs_part_of2206);
                    lv_kardinalitaet_2_3=ruleKardinalitaet1x();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIs_part_ofRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_2_3, 
                            		"Kardinalitaet1x");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1049:2: ( (otherlv_3= RULE_ID ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1050:1: (otherlv_3= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1050:1: (otherlv_3= RULE_ID )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1051:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_part_ofRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_part_of2229); 

            		newLeafNode(otherlv_3, grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleIs_part_of"


    // $ANTLR start "entryRuleKardinalitaet01"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1072:1: entryRuleKardinalitaet01 returns [EObject current=null] : iv_ruleKardinalitaet01= ruleKardinalitaet01 EOF ;
    public final EObject entryRuleKardinalitaet01() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet01 = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1073:2: (iv_ruleKardinalitaet01= ruleKardinalitaet01 EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1074:2: iv_ruleKardinalitaet01= ruleKardinalitaet01 EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet01Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet012267);
            iv_ruleKardinalitaet01=ruleKardinalitaet01();

            state._fsp--;

             current =iv_ruleKardinalitaet01; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet012277); 

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
    // $ANTLR end "entryRuleKardinalitaet01"


    // $ANTLR start "ruleKardinalitaet01"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1081:1: ruleKardinalitaet01 returns [EObject current=null] : ( (otherlv_0= '(0,1)' | otherlv_1= '--' ) () ) ;
    public final EObject ruleKardinalitaet01() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1084:28: ( ( (otherlv_0= '(0,1)' | otherlv_1= '--' ) () ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1085:1: ( (otherlv_0= '(0,1)' | otherlv_1= '--' ) () )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1085:1: ( (otherlv_0= '(0,1)' | otherlv_1= '--' ) () )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1085:2: (otherlv_0= '(0,1)' | otherlv_1= '--' ) ()
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1085:2: (otherlv_0= '(0,1)' | otherlv_1= '--' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            else if ( (LA19_0==27) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1085:4: otherlv_0= '(0,1)'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleKardinalitaet012315); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet01Access().getLeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1090:7: otherlv_1= '--'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleKardinalitaet012333); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet01Access().getHyphenMinusHyphenMinusKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1094:2: ()
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1095:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKardinalitaet01Access().getKardinalitaet01Action_1(),
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
    // $ANTLR end "ruleKardinalitaet01"


    // $ANTLR start "entryRuleKardinalitaet0x"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1108:1: entryRuleKardinalitaet0x returns [EObject current=null] : iv_ruleKardinalitaet0x= ruleKardinalitaet0x EOF ;
    public final EObject entryRuleKardinalitaet0x() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet0x = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1109:2: (iv_ruleKardinalitaet0x= ruleKardinalitaet0x EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1110:2: iv_ruleKardinalitaet0x= ruleKardinalitaet0x EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet0xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x2379);
            iv_ruleKardinalitaet0x=ruleKardinalitaet0x();

            state._fsp--;

             current =iv_ruleKardinalitaet0x; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet0x2389); 

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
    // $ANTLR end "entryRuleKardinalitaet0x"


    // $ANTLR start "ruleKardinalitaet0x"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1117:1: ruleKardinalitaet0x returns [EObject current=null] : ( (otherlv_0= '(0,*)' | otherlv_1= '->' ) () ) ;
    public final EObject ruleKardinalitaet0x() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1120:28: ( ( (otherlv_0= '(0,*)' | otherlv_1= '->' ) () ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1121:1: ( (otherlv_0= '(0,*)' | otherlv_1= '->' ) () )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1121:1: ( (otherlv_0= '(0,*)' | otherlv_1= '->' ) () )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1121:2: (otherlv_0= '(0,*)' | otherlv_1= '->' ) ()
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1121:2: (otherlv_0= '(0,*)' | otherlv_1= '->' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            else if ( (LA20_0==29) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1121:4: otherlv_0= '(0,*)'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleKardinalitaet0x2427); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet0xAccess().getLeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1126:7: otherlv_1= '->'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleKardinalitaet0x2445); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet0xAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1130:2: ()
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1131:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKardinalitaet0xAccess().getKardinalitaet0xAction_1(),
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
    // $ANTLR end "ruleKardinalitaet0x"


    // $ANTLR start "entryRuleKardinalitaet11"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1144:1: entryRuleKardinalitaet11 returns [EObject current=null] : iv_ruleKardinalitaet11= ruleKardinalitaet11 EOF ;
    public final EObject entryRuleKardinalitaet11() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet11 = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1145:2: (iv_ruleKardinalitaet11= ruleKardinalitaet11 EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1146:2: iv_ruleKardinalitaet11= ruleKardinalitaet11 EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet11Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet112491);
            iv_ruleKardinalitaet11=ruleKardinalitaet11();

            state._fsp--;

             current =iv_ruleKardinalitaet11; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet112501); 

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
    // $ANTLR end "entryRuleKardinalitaet11"


    // $ANTLR start "ruleKardinalitaet11"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1153:1: ruleKardinalitaet11 returns [EObject current=null] : ( (otherlv_0= '(1,1)' | otherlv_1= '==' ) () ) ;
    public final EObject ruleKardinalitaet11() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1156:28: ( ( (otherlv_0= '(1,1)' | otherlv_1= '==' ) () ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1157:1: ( (otherlv_0= '(1,1)' | otherlv_1= '==' ) () )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1157:1: ( (otherlv_0= '(1,1)' | otherlv_1= '==' ) () )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1157:2: (otherlv_0= '(1,1)' | otherlv_1= '==' ) ()
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1157:2: (otherlv_0= '(1,1)' | otherlv_1= '==' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            else if ( (LA21_0==31) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1157:4: otherlv_0= '(1,1)'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleKardinalitaet112539); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet11Access().getLeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1162:7: otherlv_1= '=='
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleKardinalitaet112557); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet11Access().getEqualsSignEqualsSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1166:2: ()
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1167:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKardinalitaet11Access().getKardinalitaet11Action_1(),
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
    // $ANTLR end "ruleKardinalitaet11"


    // $ANTLR start "entryRuleKardinalitaet1x"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1180:1: entryRuleKardinalitaet1x returns [EObject current=null] : iv_ruleKardinalitaet1x= ruleKardinalitaet1x EOF ;
    public final EObject entryRuleKardinalitaet1x() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet1x = null;


        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1181:2: (iv_ruleKardinalitaet1x= ruleKardinalitaet1x EOF )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1182:2: iv_ruleKardinalitaet1x= ruleKardinalitaet1x EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet1xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x2603);
            iv_ruleKardinalitaet1x=ruleKardinalitaet1x();

            state._fsp--;

             current =iv_ruleKardinalitaet1x; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet1x2613); 

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
    // $ANTLR end "entryRuleKardinalitaet1x"


    // $ANTLR start "ruleKardinalitaet1x"
    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1189:1: ruleKardinalitaet1x returns [EObject current=null] : ( (otherlv_0= '(1,*)' | otherlv_1= '=>' ) () ) ;
    public final EObject ruleKardinalitaet1x() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1192:28: ( ( (otherlv_0= '(1,*)' | otherlv_1= '=>' ) () ) )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1193:1: ( (otherlv_0= '(1,*)' | otherlv_1= '=>' ) () )
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1193:1: ( (otherlv_0= '(1,*)' | otherlv_1= '=>' ) () )
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1193:2: (otherlv_0= '(1,*)' | otherlv_1= '=>' ) ()
            {
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1193:2: (otherlv_0= '(1,*)' | otherlv_1= '=>' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            else if ( (LA22_0==33) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1193:4: otherlv_0= '(1,*)'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleKardinalitaet1x2651); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet1xAccess().getLeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1198:7: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleKardinalitaet1x2669); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet1xAccess().getEqualsSignGreaterThanSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1202:2: ()
            // ../de.uniba.wiai.seda.somsl/src-gen/de/uniba/wiai/seda/somsl/parser/antlr/internal/InternalSomSL.g:1203:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKardinalitaet1xAccess().getKardinalitaet1xAction_1(),
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
    // $ANTLR end "ruleKardinalitaet1x"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMetamodell_in_entryRuleMetamodell75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodell85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetamodell127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetamodell149 = new BitSet(new long[]{0x0000000003F80032L});
    public static final BitSet FOLLOW_ruleObjekttyp_in_ruleMetamodell176 = new BitSet(new long[]{0x0000000003F80032L});
    public static final BitSet FOLLOW_ruleBeziehung_in_ruleMetamodell203 = new BitSet(new long[]{0x0000000003F80032L});
    public static final BitSet FOLLOW_ruleObjekttyp_in_entryRuleObjekttyp241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjekttyp251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANNOTATION_in_ruleObjekttyp288 = new BitSet(new long[]{0x0000000000780020L});
    public static final BitSet FOLLOW_ruleKOT_in_ruleObjekttyp312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVOT_in_ruleObjekttyp339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjekttyp356 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleObjekttyp373 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleObjekttyp394 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleObjekttyp416 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleObjekttyp429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_entryRuleAttribut465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribut475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribut521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14_in_ruleAttribut540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribut557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribut581 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAttribut598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperator686 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOperator703 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperator723 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleOperator736 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleAnweisung_in_ruleOperator757 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleOperator770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnweisung_in_entryRuleAnweisung806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnweisung816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnweisung859 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAnweisung876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnweisung_in_ruleAnweisung897 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAnweisung909 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleAnweisung_in_ruleAnweisung930 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleAnweisung943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnweisung972 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAnweisung984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnweisung1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOT_in_entryRuleKOT1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKOT1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_ruleKOT1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_ruleKOT1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_ruleKOT1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOT_in_entryRuleVOT1191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVOT1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVOT1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_entryRuleOOT1283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOOT1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOOT1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_entryRuleLOT1375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOT1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleLOT1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_entryRuleTOT1467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTOT1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTOT1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeziehung_in_entryRuleBeziehung1559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeziehung1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANNOTATION_in_ruleBeziehung1606 = new BitSet(new long[]{0x0000000003F80030L});
    public static final BitSet FOLLOW_ruleIs_a_in_ruleBeziehung1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_ruleBeziehung1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_ruleBeziehung1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with1720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteracts_with1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleInteracts_with1768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteracts_with1790 = new BitSet(new long[]{0x000000033C000000L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_ruleInteracts_with1813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_ruleInteracts_with1832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_ruleInteracts_with1851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteracts_with1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_a_in_entryRuleIs_a1910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_a1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleIs_a1957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_a1977 = new BitSet(new long[]{0x00000000CC000000L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_ruleIs_a2000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_ruleIs_a2019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_a2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of2078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_part_of2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleIs_part_of2125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_part_of2145 = new BitSet(new long[]{0x000000033C000000L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_ruleIs_part_of2168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_ruleIs_part_of2187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_ruleIs_part_of2206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_part_of2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet012267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet012277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleKardinalitaet012315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleKardinalitaet012333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x2379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet0x2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleKardinalitaet0x2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleKardinalitaet0x2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet112491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet112501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleKardinalitaet112539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleKardinalitaet112557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x2603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet1x2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleKardinalitaet1x2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleKardinalitaet1x2669 = new BitSet(new long[]{0x0000000000000002L});

}