package de.uniba.wiai.seda.fha.som.aws.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uniba.wiai.seda.fha.som.aws.services.AwsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAwsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VERSION_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AwS:'", "'v'", "'VOS'", "'{'", "'}'", "'KOS'", "'VOT'", "'OOT'", "'LOT'", "'TOT'", "';'", "'('", "')'", "'interacts_with:'", "'is_a:'", "'is_part_of:'", "'--'", "'(0,1)'", "'->'", "'(0,*)'", "'=='", "'(1,1)'", "'=>'", "'(1,*)'", "'@name'", "'@merge'", "'@ignore'", "'@version'"
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
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g"; }



     	private AwsGrammarAccess grammarAccess;
     	
        public InternalAwsParser(TokenStream input, AwsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AwS";	
       	}
       	
       	@Override
       	protected AwsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAwS"
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:67:1: entryRuleAwS returns [EObject current=null] : iv_ruleAwS= ruleAwS EOF ;
    public final EObject entryRuleAwS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAwS = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:68:2: (iv_ruleAwS= ruleAwS EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:69:2: iv_ruleAwS= ruleAwS EOF
            {
             newCompositeNode(grammarAccess.getAwSRule()); 
            pushFollow(FOLLOW_ruleAwS_in_entryRuleAwS75);
            iv_ruleAwS=ruleAwS();

            state._fsp--;

             current =iv_ruleAwS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwS85); 

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
    // $ANTLR end "entryRuleAwS"


    // $ANTLR start "ruleAwS"
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:76:1: ruleAwS returns [EObject current=null] : (otherlv_0= 'AwS:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION_NUMBER ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleAwS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_version_3_0=null;
        EObject lv_kos_5_0 = null;

        EObject lv_vos_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:79:28: ( (otherlv_0= 'AwS:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION_NUMBER ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) ) ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:80:1: (otherlv_0= 'AwS:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION_NUMBER ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) ) ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:80:1: (otherlv_0= 'AwS:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION_NUMBER ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:80:3: otherlv_0= 'AwS:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION_NUMBER ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleAwS122); 

                	newLeafNode(otherlv_0, grammarAccess.getAwSAccess().getAwSKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:85:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAwS139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAwSAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAwSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:102:2: (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION_NUMBER ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:102:4: otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION_NUMBER ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAwS157); 

                        	newLeafNode(otherlv_2, grammarAccess.getAwSAccess().getVKeyword_2_0());
                        
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:106:1: ( (lv_version_3_0= RULE_VERSION_NUMBER ) )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:107:1: (lv_version_3_0= RULE_VERSION_NUMBER )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:107:1: (lv_version_3_0= RULE_VERSION_NUMBER )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:108:3: lv_version_3_0= RULE_VERSION_NUMBER
                    {
                    lv_version_3_0=(Token)match(input,RULE_VERSION_NUMBER,FOLLOW_RULE_VERSION_NUMBER_in_ruleAwS174); 

                    			newLeafNode(lv_version_3_0, grammarAccess.getAwSAccess().getVersionVERSION_NUMBERTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAwSRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"version",
                            		lv_version_3_0, 
                            		"VERSION_NUMBER");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:124:4: ( ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:126:1: ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:126:1: ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:127:2: ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getAwSAccess().getUnorderedGroup_3());
            	
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:130:2: ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?)
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:131:3: ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:131:3: ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) ) {
                    int LA2_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) {
                        alt2=1;
                    }
                    else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) ) {
                        alt2=2;
                    }


                }
                else if ( LA2_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:133:4: ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:133:4: ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:134:5: {...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAwS", "getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:134:100: ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:135:6: ({...}? => ( (lv_kos_5_0= ruleKOS ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:138:6: ({...}? => ( (lv_kos_5_0= ruleKOS ) ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:138:7: {...}? => ( (lv_kos_5_0= ruleKOS ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAwS", "true");
            	    }
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:138:16: ( (lv_kos_5_0= ruleKOS ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:139:1: (lv_kos_5_0= ruleKOS )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:139:1: (lv_kos_5_0= ruleKOS )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:140:3: lv_kos_5_0= ruleKOS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAwSAccess().getKosKOSParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleKOS_in_ruleAwS247);
            	    lv_kos_5_0=ruleKOS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAwSRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"kos",
            	            		lv_kos_5_0, 
            	            		"KOS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAwSAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:163:4: ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:163:4: ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:164:5: {...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAwS", "getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:164:100: ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:165:6: ({...}? => ( (lv_vos_6_0= ruleVOS ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:168:6: ({...}? => ( (lv_vos_6_0= ruleVOS ) ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:168:7: {...}? => ( (lv_vos_6_0= ruleVOS ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAwS", "true");
            	    }
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:168:16: ( (lv_vos_6_0= ruleVOS ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:169:1: (lv_vos_6_0= ruleVOS )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:169:1: (lv_vos_6_0= ruleVOS )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:170:3: lv_vos_6_0= ruleVOS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAwSAccess().getVosVOSParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVOS_in_ruleAwS322);
            	    lv_vos_6_0=ruleVOS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAwSRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"vos",
            	            		lv_vos_6_0, 
            	            		"VOS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAwSAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAwSAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleAwS", "getUnorderedGroupHelper().canLeave(grammarAccess.getAwSAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getAwSAccess().getUnorderedGroup_3());
            	

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
    // $ANTLR end "ruleAwS"


    // $ANTLR start "entryRuleVOS"
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:211:1: entryRuleVOS returns [EObject current=null] : iv_ruleVOS= ruleVOS EOF ;
    public final EObject entryRuleVOS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVOS = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:212:2: (iv_ruleVOS= ruleVOS EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:213:2: iv_ruleVOS= ruleVOS EOF
            {
             newCompositeNode(grammarAccess.getVOSRule()); 
            pushFollow(FOLLOW_ruleVOS_in_entryRuleVOS406);
            iv_ruleVOS=ruleVOS();

            state._fsp--;

             current =iv_ruleVOS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVOS416); 

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
    // $ANTLR end "entryRuleVOS"


    // $ANTLR start "ruleVOS"
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:220:1: ruleVOS returns [EObject current=null] : ( ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )+ otherlv_6= '}' ) ;
    public final EObject ruleVOS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_objekttypen_3_0 = null;

        EObject lv_beziehungen_4_0 = null;

        EObject lv_gliederung_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:223:28: ( ( ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )+ otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:224:1: ( ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )+ otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:224:1: ( ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )+ otherlv_6= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:224:2: ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )+ otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:224:2: ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
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
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:224:3: ( (lv_name_0_0= 'VOS' ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:224:3: ( (lv_name_0_0= 'VOS' ) )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:225:1: (lv_name_0_0= 'VOS' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:225:1: (lv_name_0_0= 'VOS' )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:226:3: lv_name_0_0= 'VOS'
                    {
                    lv_name_0_0=(Token)match(input,14,FOLLOW_14_in_ruleVOS460); 

                            newLeafNode(lv_name_0_0, grammarAccess.getVOSAccess().getNameVOSKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVOSRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "VOS");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:240:6: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:240:6: ( (lv_name_1_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:241:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:241:1: (lv_name_1_0= RULE_ID )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:242:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVOS496); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getVOSAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVOSRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleVOS514); 

                	newLeafNode(otherlv_2, grammarAccess.getVOSAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:262:1: ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=4;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:262:2: ( (lv_objekttypen_3_0= ruleVOT ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:262:2: ( (lv_objekttypen_3_0= ruleVOT ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:263:1: (lv_objekttypen_3_0= ruleVOT )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:263:1: (lv_objekttypen_3_0= ruleVOT )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:264:3: lv_objekttypen_3_0= ruleVOT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVOSAccess().getObjekttypenVOTParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVOT_in_ruleVOS536);
            	    lv_objekttypen_3_0=ruleVOT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVOSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"objekttypen",
            	            		lv_objekttypen_3_0, 
            	            		"VOT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:281:6: ( (lv_beziehungen_4_0= ruleInteracts_with ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:281:6: ( (lv_beziehungen_4_0= ruleInteracts_with ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:282:1: (lv_beziehungen_4_0= ruleInteracts_with )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:282:1: (lv_beziehungen_4_0= ruleInteracts_with )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:283:3: lv_beziehungen_4_0= ruleInteracts_with
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVOSAccess().getBeziehungenInteracts_withParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInteracts_with_in_ruleVOS563);
            	    lv_beziehungen_4_0=ruleInteracts_with();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVOSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"beziehungen",
            	            		lv_beziehungen_4_0, 
            	            		"Interacts_with");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:300:6: ( (lv_gliederung_5_0= ruleVOS ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:300:6: ( (lv_gliederung_5_0= ruleVOS ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:301:1: (lv_gliederung_5_0= ruleVOS )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:301:1: (lv_gliederung_5_0= ruleVOS )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:302:3: lv_gliederung_5_0= ruleVOS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVOSAccess().getGliederungVOSParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVOS_in_ruleVOS590);
            	    lv_gliederung_5_0=ruleVOS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVOSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"gliederung",
            	            		lv_gliederung_5_0, 
            	            		"VOS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleVOS604); 

                	newLeafNode(otherlv_6, grammarAccess.getVOSAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleVOS"


    // $ANTLR start "entryRuleKOS"
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:330:1: entryRuleKOS returns [EObject current=null] : iv_ruleKOS= ruleKOS EOF ;
    public final EObject entryRuleKOS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKOS = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:331:2: (iv_ruleKOS= ruleKOS EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:332:2: iv_ruleKOS= ruleKOS EOF
            {
             newCompositeNode(grammarAccess.getKOSRule()); 
            pushFollow(FOLLOW_ruleKOS_in_entryRuleKOS640);
            iv_ruleKOS=ruleKOS();

            state._fsp--;

             current =iv_ruleKOS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKOS650); 

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
    // $ANTLR end "entryRuleKOS"


    // $ANTLR start "ruleKOS"
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:339:1: ruleKOS returns [EObject current=null] : ( ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )+ otherlv_6= '}' ) ;
    public final EObject ruleKOS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_objekttypen_3_0 = null;

        EObject lv_beziehungen_4_0 = null;

        EObject lv_gliederung_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:342:28: ( ( ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )+ otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:343:1: ( ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )+ otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:343:1: ( ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )+ otherlv_6= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:343:2: ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )+ otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:343:2: ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
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
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:343:3: ( (lv_name_0_0= 'KOS' ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:343:3: ( (lv_name_0_0= 'KOS' ) )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:344:1: (lv_name_0_0= 'KOS' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:344:1: (lv_name_0_0= 'KOS' )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:345:3: lv_name_0_0= 'KOS'
                    {
                    lv_name_0_0=(Token)match(input,17,FOLLOW_17_in_ruleKOS694); 

                            newLeafNode(lv_name_0_0, grammarAccess.getKOSAccess().getNameKOSKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKOSRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "KOS");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:359:6: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:359:6: ( (lv_name_1_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:360:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:360:1: (lv_name_1_0= RULE_ID )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:361:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKOS730); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getKOSAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKOSRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleKOS748); 

                	newLeafNode(otherlv_2, grammarAccess.getKOSAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:381:1: ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=4;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:381:2: ( (lv_objekttypen_3_0= ruleKOT ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:381:2: ( (lv_objekttypen_3_0= ruleKOT ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:382:1: (lv_objekttypen_3_0= ruleKOT )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:382:1: (lv_objekttypen_3_0= ruleKOT )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:383:3: lv_objekttypen_3_0= ruleKOT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKOSAccess().getObjekttypenKOTParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleKOT_in_ruleKOS770);
            	    lv_objekttypen_3_0=ruleKOT();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKOSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"objekttypen",
            	            		lv_objekttypen_3_0, 
            	            		"KOT");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:400:6: ( (lv_beziehungen_4_0= ruleBeziehung ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:400:6: ( (lv_beziehungen_4_0= ruleBeziehung ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:401:1: (lv_beziehungen_4_0= ruleBeziehung )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:401:1: (lv_beziehungen_4_0= ruleBeziehung )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:402:3: lv_beziehungen_4_0= ruleBeziehung
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKOSAccess().getBeziehungenBeziehungParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBeziehung_in_ruleKOS797);
            	    lv_beziehungen_4_0=ruleBeziehung();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKOSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"beziehungen",
            	            		lv_beziehungen_4_0, 
            	            		"Beziehung");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:419:6: ( (lv_gliederung_5_0= ruleKOS ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:419:6: ( (lv_gliederung_5_0= ruleKOS ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:420:1: (lv_gliederung_5_0= ruleKOS )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:420:1: (lv_gliederung_5_0= ruleKOS )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:421:3: lv_gliederung_5_0= ruleKOS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKOSAccess().getGliederungKOSParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleKOS_in_ruleKOS824);
            	    lv_gliederung_5_0=ruleKOS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKOSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"gliederung",
            	            		lv_gliederung_5_0, 
            	            		"KOS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleKOS838); 

                	newLeafNode(otherlv_6, grammarAccess.getKOSAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleKOS"


    // $ANTLR start "entryRuleVOT"
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:451:1: entryRuleVOT returns [EObject current=null] : iv_ruleVOT= ruleVOT EOF ;
    public final EObject entryRuleVOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVOT = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:452:2: (iv_ruleVOT= ruleVOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:453:2: iv_ruleVOT= ruleVOT EOF
            {
             newCompositeNode(grammarAccess.getVOTRule()); 
            pushFollow(FOLLOW_ruleVOT_in_entryRuleVOT876);
            iv_ruleVOT=ruleVOT();

            state._fsp--;

             current =iv_ruleVOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVOT886); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:460:1: ruleVOT returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'VOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleVOT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_attribute_4_0 = null;

        EObject lv_operatoren_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:463:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'VOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:464:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'VOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:464:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'VOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:464:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'VOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:464:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=36 && LA7_0<=39)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:465:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:465:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:466:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getVOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleVOT932);
                    lv_annotation_0_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVOTRule());
                    	        }
                           		set(
                           			current, 
                           			"annotation",
                            		lv_annotation_0_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleVOT945); 

                	newLeafNode(otherlv_1, grammarAccess.getVOTAccess().getVOTKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:486:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:487:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:487:1: (lv_name_2_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:488:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVOT962); 

            			newLeafNode(lv_name_2_0, grammarAccess.getVOTAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVOTRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleVOT979); 

                	newLeafNode(otherlv_3, grammarAccess.getVOTAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:508:1: ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==RULE_ID||LA8_2==22) ) {
                        alt8=1;
                    }
                    else if ( (LA8_2==23) ) {
                        alt8=2;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:508:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:508:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:509:1: (lv_attribute_4_0= ruleAttribut )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:509:1: (lv_attribute_4_0= ruleAttribut )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:510:3: lv_attribute_4_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleVOT1001);
            	    lv_attribute_4_0=ruleAttribut();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVOTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_4_0, 
            	            		"Attribut");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:527:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:527:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:528:1: (lv_operatoren_5_0= ruleOperator )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:528:1: (lv_operatoren_5_0= ruleOperator )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:529:3: lv_operatoren_5_0= ruleOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperator_in_ruleVOT1028);
            	    lv_operatoren_5_0=ruleOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVOTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operatoren",
            	            		lv_operatoren_5_0, 
            	            		"Operator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleVOT1042); 

                	newLeafNode(otherlv_6, grammarAccess.getVOTAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleKOT"
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:557:1: entryRuleKOT returns [EObject current=null] : iv_ruleKOT= ruleKOT EOF ;
    public final EObject entryRuleKOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKOT = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:558:2: (iv_ruleKOT= ruleKOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:559:2: iv_ruleKOT= ruleKOT EOF
            {
             newCompositeNode(grammarAccess.getKOTRule()); 
            pushFollow(FOLLOW_ruleKOT_in_entryRuleKOT1078);
            iv_ruleKOT=ruleKOT();

            state._fsp--;

             current =iv_ruleKOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKOT1088); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:566:1: ruleKOT returns [EObject current=null] : (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT ) ;
    public final EObject ruleKOT() throws RecognitionException {
        EObject current = null;

        EObject this_OOT_0 = null;

        EObject this_LOT_1 = null;

        EObject this_TOT_2 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:569:28: ( (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:570:1: (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:570:1: (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:571:5: this_OOT_0= ruleOOT
                    {
                     
                            newCompositeNode(grammarAccess.getKOTAccess().getOOTParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOOT_in_ruleKOT1135);
                    this_OOT_0=ruleOOT();

                    state._fsp--;

                     
                            current = this_OOT_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:581:5: this_LOT_1= ruleLOT
                    {
                     
                            newCompositeNode(grammarAccess.getKOTAccess().getLOTParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLOT_in_ruleKOT1162);
                    this_LOT_1=ruleLOT();

                    state._fsp--;

                     
                            current = this_LOT_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:591:5: this_TOT_2= ruleTOT
                    {
                     
                            newCompositeNode(grammarAccess.getKOTAccess().getTOTParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTOT_in_ruleKOT1189);
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


    // $ANTLR start "entryRuleOOT"
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:607:1: entryRuleOOT returns [EObject current=null] : iv_ruleOOT= ruleOOT EOF ;
    public final EObject entryRuleOOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOOT = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:608:2: (iv_ruleOOT= ruleOOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:609:2: iv_ruleOOT= ruleOOT EOF
            {
             newCompositeNode(grammarAccess.getOOTRule()); 
            pushFollow(FOLLOW_ruleOOT_in_entryRuleOOT1224);
            iv_ruleOOT=ruleOOT();

            state._fsp--;

             current =iv_ruleOOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOOT1234); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:616:1: ruleOOT returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'OOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleOOT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_attribute_4_0 = null;

        EObject lv_operatoren_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:619:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'OOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:620:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'OOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:620:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'OOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:620:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'OOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:620:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=36 && LA10_0<=39)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:621:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:621:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:622:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getOOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleOOT1280);
                    lv_annotation_0_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOOTRule());
                    	        }
                           		set(
                           			current, 
                           			"annotation",
                            		lv_annotation_0_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleOOT1293); 

                	newLeafNode(otherlv_1, grammarAccess.getOOTAccess().getOOTKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:642:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:643:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:643:1: (lv_name_2_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:644:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOOT1310); 

            			newLeafNode(lv_name_2_0, grammarAccess.getOOTAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOOTRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleOOT1327); 

                	newLeafNode(otherlv_3, grammarAccess.getOOTAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:664:1: ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==23) ) {
                        alt11=2;
                    }
                    else if ( (LA11_2==RULE_ID||LA11_2==22) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:664:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:664:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:665:1: (lv_attribute_4_0= ruleAttribut )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:665:1: (lv_attribute_4_0= ruleAttribut )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:666:3: lv_attribute_4_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleOOT1349);
            	    lv_attribute_4_0=ruleAttribut();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOOTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_4_0, 
            	            		"Attribut");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:683:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:683:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:684:1: (lv_operatoren_5_0= ruleOperator )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:684:1: (lv_operatoren_5_0= ruleOperator )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:685:3: lv_operatoren_5_0= ruleOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperator_in_ruleOOT1376);
            	    lv_operatoren_5_0=ruleOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOOTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operatoren",
            	            		lv_operatoren_5_0, 
            	            		"Operator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleOOT1390); 

                	newLeafNode(otherlv_6, grammarAccess.getOOTAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:713:1: entryRuleLOT returns [EObject current=null] : iv_ruleLOT= ruleLOT EOF ;
    public final EObject entryRuleLOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLOT = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:714:2: (iv_ruleLOT= ruleLOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:715:2: iv_ruleLOT= ruleLOT EOF
            {
             newCompositeNode(grammarAccess.getLOTRule()); 
            pushFollow(FOLLOW_ruleLOT_in_entryRuleLOT1426);
            iv_ruleLOT=ruleLOT();

            state._fsp--;

             current =iv_ruleLOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOT1436); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:722:1: ruleLOT returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'LOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleLOT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_attribute_4_0 = null;

        EObject lv_operatoren_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:725:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'LOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:726:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'LOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:726:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'LOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:726:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'LOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:726:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=36 && LA12_0<=39)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:727:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:727:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:728:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getLOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleLOT1482);
                    lv_annotation_0_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLOTRule());
                    	        }
                           		set(
                           			current, 
                           			"annotation",
                            		lv_annotation_0_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleLOT1495); 

                	newLeafNode(otherlv_1, grammarAccess.getLOTAccess().getLOTKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:748:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:749:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:749:1: (lv_name_2_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:750:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLOT1512); 

            			newLeafNode(lv_name_2_0, grammarAccess.getLOTAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLOTRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleLOT1529); 

                	newLeafNode(otherlv_3, grammarAccess.getLOTAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:770:1: ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==23) ) {
                        alt13=2;
                    }
                    else if ( (LA13_2==RULE_ID||LA13_2==22) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:770:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:770:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:771:1: (lv_attribute_4_0= ruleAttribut )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:771:1: (lv_attribute_4_0= ruleAttribut )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:772:3: lv_attribute_4_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleLOT1551);
            	    lv_attribute_4_0=ruleAttribut();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLOTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_4_0, 
            	            		"Attribut");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:789:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:789:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:790:1: (lv_operatoren_5_0= ruleOperator )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:790:1: (lv_operatoren_5_0= ruleOperator )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:791:3: lv_operatoren_5_0= ruleOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperator_in_ruleLOT1578);
            	    lv_operatoren_5_0=ruleOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLOTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operatoren",
            	            		lv_operatoren_5_0, 
            	            		"Operator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleLOT1592); 

                	newLeafNode(otherlv_6, grammarAccess.getLOTAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:819:1: entryRuleTOT returns [EObject current=null] : iv_ruleTOT= ruleTOT EOF ;
    public final EObject entryRuleTOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTOT = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:820:2: (iv_ruleTOT= ruleTOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:821:2: iv_ruleTOT= ruleTOT EOF
            {
             newCompositeNode(grammarAccess.getTOTRule()); 
            pushFollow(FOLLOW_ruleTOT_in_entryRuleTOT1628);
            iv_ruleTOT=ruleTOT();

            state._fsp--;

             current =iv_ruleTOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTOT1638); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:828:1: ruleTOT returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'TOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleTOT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_attribute_4_0 = null;

        EObject lv_operatoren_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:831:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'TOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:832:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'TOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:832:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'TOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:832:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'TOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:832:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=36 && LA14_0<=39)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:833:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:833:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:834:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getTOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleTOT1684);
                    lv_annotation_0_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTOTRule());
                    	        }
                           		set(
                           			current, 
                           			"annotation",
                            		lv_annotation_0_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleTOT1697); 

                	newLeafNode(otherlv_1, grammarAccess.getTOTAccess().getTOTKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:854:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:855:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:855:1: (lv_name_2_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:856:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTOT1714); 

            			newLeafNode(lv_name_2_0, grammarAccess.getTOTAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTOTRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleTOT1731); 

                	newLeafNode(otherlv_3, grammarAccess.getTOTAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:876:1: ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==23) ) {
                        alt15=2;
                    }
                    else if ( (LA15_2==RULE_ID||LA15_2==22) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:876:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:876:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:877:1: (lv_attribute_4_0= ruleAttribut )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:877:1: (lv_attribute_4_0= ruleAttribut )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:878:3: lv_attribute_4_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleTOT1753);
            	    lv_attribute_4_0=ruleAttribut();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTOTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_4_0, 
            	            		"Attribut");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:895:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:895:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:896:1: (lv_operatoren_5_0= ruleOperator )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:896:1: (lv_operatoren_5_0= ruleOperator )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:897:3: lv_operatoren_5_0= ruleOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperator_in_ruleTOT1780);
            	    lv_operatoren_5_0=ruleOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTOTRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operatoren",
            	            		lv_operatoren_5_0, 
            	            		"Operator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleTOT1794); 

                	newLeafNode(otherlv_6, grammarAccess.getTOTAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleAttribut"
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:925:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:926:2: (iv_ruleAttribut= ruleAttribut EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:927:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_ruleAttribut_in_entryRuleAttribut1830);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribut1840); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:934:1: ruleAttribut returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:937:28: ( ( ( (otherlv_0= RULE_ID ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:938:1: ( ( (otherlv_0= RULE_ID ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:938:1: ( ( (otherlv_0= RULE_ID ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:938:2: ( (otherlv_0= RULE_ID ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:938:2: ( (otherlv_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_ID) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:939:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:939:1: (otherlv_0= RULE_ID )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:940:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribut1885); 

                    		newLeafNode(otherlv_0, grammarAccess.getAttributAccess().getTypObjekttypCrossReference_0_0()); 
                    	

                    }


                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:951:3: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:952:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:952:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:953:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribut1903); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAttribut1920); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributAccess().getSemicolonKeyword_2());
                

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:981:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:982:2: (iv_ruleOperator= ruleOperator EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:983:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator1956);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator1966); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:990:1: ruleOperator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:993:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' otherlv_4= ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:994:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' otherlv_4= ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:994:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' otherlv_4= ';' )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:994:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' otherlv_4= ';'
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:994:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:995:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:995:1: (lv_name_0_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:996:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperator2008); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleOperator2025); 

                	newLeafNode(otherlv_1, grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1016:1: ( (otherlv_2= RULE_ID ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1017:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1017:1: (otherlv_2= RULE_ID )
            	    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1018:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperatorRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperator2045); 

            	    		newLeafNode(otherlv_2, grammarAccess.getOperatorAccess().getParameterObjekttypCrossReference_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleOperator2058); 

                	newLeafNode(otherlv_3, grammarAccess.getOperatorAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleOperator2070); 

                	newLeafNode(otherlv_4, grammarAccess.getOperatorAccess().getSemicolonKeyword_4());
                

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


    // $ANTLR start "entryRuleBeziehung"
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1045:1: entryRuleBeziehung returns [EObject current=null] : iv_ruleBeziehung= ruleBeziehung EOF ;
    public final EObject entryRuleBeziehung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeziehung = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1046:2: (iv_ruleBeziehung= ruleBeziehung EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1047:2: iv_ruleBeziehung= ruleBeziehung EOF
            {
             newCompositeNode(grammarAccess.getBeziehungRule()); 
            pushFollow(FOLLOW_ruleBeziehung_in_entryRuleBeziehung2106);
            iv_ruleBeziehung=ruleBeziehung();

            state._fsp--;

             current =iv_ruleBeziehung; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeziehung2116); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1054:1: ruleBeziehung returns [EObject current=null] : (this_Interacts_with_0= ruleInteracts_with | this_Is_a_1= ruleIs_a | this_Is_part_of_2= ruleIs_part_of ) ;
    public final EObject ruleBeziehung() throws RecognitionException {
        EObject current = null;

        EObject this_Interacts_with_0 = null;

        EObject this_Is_a_1 = null;

        EObject this_Is_part_of_2 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1057:28: ( (this_Interacts_with_0= ruleInteracts_with | this_Is_a_1= ruleIs_a | this_Is_part_of_2= ruleIs_part_of ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1058:1: (this_Interacts_with_0= ruleInteracts_with | this_Is_a_1= ruleIs_a | this_Is_part_of_2= ruleIs_part_of )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1058:1: (this_Interacts_with_0= ruleInteracts_with | this_Is_a_1= ruleIs_a | this_Is_part_of_2= ruleIs_part_of )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1059:5: this_Interacts_with_0= ruleInteracts_with
                    {
                     
                            newCompositeNode(grammarAccess.getBeziehungAccess().getInteracts_withParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInteracts_with_in_ruleBeziehung2163);
                    this_Interacts_with_0=ruleInteracts_with();

                    state._fsp--;

                     
                            current = this_Interacts_with_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1069:5: this_Is_a_1= ruleIs_a
                    {
                     
                            newCompositeNode(grammarAccess.getBeziehungAccess().getIs_aParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIs_a_in_ruleBeziehung2190);
                    this_Is_a_1=ruleIs_a();

                    state._fsp--;

                     
                            current = this_Is_a_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1079:5: this_Is_part_of_2= ruleIs_part_of
                    {
                     
                            newCompositeNode(grammarAccess.getBeziehungAccess().getIs_part_ofParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIs_part_of_in_ruleBeziehung2217);
                    this_Is_part_of_2=ruleIs_part_of();

                    state._fsp--;

                     
                            current = this_Is_part_of_2; 
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
    // $ANTLR end "ruleBeziehung"


    // $ANTLR start "entryRuleInteracts_with"
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1095:1: entryRuleInteracts_with returns [EObject current=null] : iv_ruleInteracts_with= ruleInteracts_with EOF ;
    public final EObject entryRuleInteracts_with() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteracts_with = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1096:2: (iv_ruleInteracts_with= ruleInteracts_with EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1097:2: iv_ruleInteracts_with= ruleInteracts_with EOF
            {
             newCompositeNode(grammarAccess.getInteracts_withRule()); 
            pushFollow(FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with2252);
            iv_ruleInteracts_with=ruleInteracts_with();

            state._fsp--;

             current =iv_ruleInteracts_with; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteracts_with2262); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1104:1: ruleInteracts_with returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? (otherlv_1= 'interacts_with:' )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleInteracts_with() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_kardinalitaet_3_1 = null;

        EObject lv_kardinalitaet_3_2 = null;

        EObject lv_kardinalitaet_3_3 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1107:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? (otherlv_1= 'interacts_with:' )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1108:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? (otherlv_1= 'interacts_with:' )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1108:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? (otherlv_1= 'interacts_with:' )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1108:2: ( (lv_annotation_0_0= ruleAnnotation ) )? (otherlv_1= 'interacts_with:' )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1108:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=36 && LA19_0<=39)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1109:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1109:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1110:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteracts_withAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleInteracts_with2308);
                    lv_annotation_0_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInteracts_withRule());
                    	        }
                           		set(
                           			current, 
                           			"annotation",
                            		lv_annotation_0_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1126:3: (otherlv_1= 'interacts_with:' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1126:5: otherlv_1= 'interacts_with:'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleInteracts_with2322); 

                        	newLeafNode(otherlv_1, grammarAccess.getInteracts_withAccess().getInteracts_withKeyword_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1130:3: ( (otherlv_2= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1131:1: (otherlv_2= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1131:1: (otherlv_2= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1132:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInteracts_withRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteracts_with2344); 

            		newLeafNode(otherlv_2, grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            	

            }


            }

            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1143:2: ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1144:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1144:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1145:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1145:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
                {
                alt21=1;
                }
                break;
            case 30:
            case 31:
                {
                alt21=2;
                }
                break;
            case 34:
            case 35:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1146:3: lv_kardinalitaet_3_1= ruleKardinalitaet01
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_ruleInteracts_with2367);
                    lv_kardinalitaet_3_1=ruleKardinalitaet01();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInteracts_withRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_3_1, 
                            		"Kardinalitaet01");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1161:8: lv_kardinalitaet_3_2= ruleKardinalitaet0x
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_ruleInteracts_with2386);
                    lv_kardinalitaet_3_2=ruleKardinalitaet0x();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInteracts_withRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_3_2, 
                            		"Kardinalitaet0x");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1176:8: lv_kardinalitaet_3_3= ruleKardinalitaet1x
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet1xParserRuleCall_3_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_ruleInteracts_with2405);
                    lv_kardinalitaet_3_3=ruleKardinalitaet1x();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInteracts_withRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_3_3, 
                            		"Kardinalitaet1x");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1194:2: ( (otherlv_4= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1195:1: (otherlv_4= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1195:1: (otherlv_4= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1196:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInteracts_withRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteracts_with2428); 

            		newLeafNode(otherlv_4, grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleInteracts_with2440); 

                	newLeafNode(otherlv_5, grammarAccess.getInteracts_withAccess().getSemicolonKeyword_5());
                

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1219:1: entryRuleIs_a returns [EObject current=null] : iv_ruleIs_a= ruleIs_a EOF ;
    public final EObject entryRuleIs_a() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIs_a = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1220:2: (iv_ruleIs_a= ruleIs_a EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1221:2: iv_ruleIs_a= ruleIs_a EOF
            {
             newCompositeNode(grammarAccess.getIs_aRule()); 
            pushFollow(FOLLOW_ruleIs_a_in_entryRuleIs_a2476);
            iv_ruleIs_a=ruleIs_a();

            state._fsp--;

             current =iv_ruleIs_a; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_a2486); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1228:1: ruleIs_a returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_a:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleIs_a() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_kardinalitaet_3_1 = null;

        EObject lv_kardinalitaet_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1231:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_a:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1232:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_a:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1232:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_a:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1232:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_a:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1232:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=36 && LA22_0<=39)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1233:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1233:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1234:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_aAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleIs_a2532);
                    lv_annotation_0_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIs_aRule());
                    	        }
                           		set(
                           			current, 
                           			"annotation",
                            		lv_annotation_0_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleIs_a2545); 

                	newLeafNode(otherlv_1, grammarAccess.getIs_aAccess().getIs_aKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1254:1: ( (otherlv_2= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1255:1: (otherlv_2= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1255:1: (otherlv_2= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1256:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_aRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_a2565); 

            		newLeafNode(otherlv_2, grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            	

            }


            }

            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1267:2: ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1268:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1268:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1269:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1269:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=28 && LA23_0<=29)) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=32 && LA23_0<=33)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1270:3: lv_kardinalitaet_3_1= ruleKardinalitaet01
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_ruleIs_a2588);
                    lv_kardinalitaet_3_1=ruleKardinalitaet01();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIs_aRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_3_1, 
                            		"Kardinalitaet01");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1285:8: lv_kardinalitaet_3_2= ruleKardinalitaet11
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet11ParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet11_in_ruleIs_a2607);
                    lv_kardinalitaet_3_2=ruleKardinalitaet11();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIs_aRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_3_2, 
                            		"Kardinalitaet11");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1303:2: ( (otherlv_4= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1304:1: (otherlv_4= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1304:1: (otherlv_4= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1305:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_aRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_a2630); 

            		newLeafNode(otherlv_4, grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleIs_a2642); 

                	newLeafNode(otherlv_5, grammarAccess.getIs_aAccess().getSemicolonKeyword_5());
                

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1328:1: entryRuleIs_part_of returns [EObject current=null] : iv_ruleIs_part_of= ruleIs_part_of EOF ;
    public final EObject entryRuleIs_part_of() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIs_part_of = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1329:2: (iv_ruleIs_part_of= ruleIs_part_of EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1330:2: iv_ruleIs_part_of= ruleIs_part_of EOF
            {
             newCompositeNode(grammarAccess.getIs_part_ofRule()); 
            pushFollow(FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of2678);
            iv_ruleIs_part_of=ruleIs_part_of();

            state._fsp--;

             current =iv_ruleIs_part_of; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_part_of2688); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1337:1: ruleIs_part_of returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_part_of:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleIs_part_of() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_kardinalitaet_3_1 = null;

        EObject lv_kardinalitaet_3_2 = null;

        EObject lv_kardinalitaet_3_3 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1340:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_part_of:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1341:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_part_of:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1341:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_part_of:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1341:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_part_of:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1341:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=36 && LA24_0<=39)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1342:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1342:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1343:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleIs_part_of2734);
                    lv_annotation_0_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIs_part_ofRule());
                    	        }
                           		set(
                           			current, 
                           			"annotation",
                            		lv_annotation_0_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleIs_part_of2747); 

                	newLeafNode(otherlv_1, grammarAccess.getIs_part_ofAccess().getIs_part_ofKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1363:1: ( (otherlv_2= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1364:1: (otherlv_2= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1364:1: (otherlv_2= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1365:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_part_ofRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_part_of2767); 

            		newLeafNode(otherlv_2, grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            	

            }


            }

            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1376:2: ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1377:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1377:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1378:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1378:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
                {
                alt25=1;
                }
                break;
            case 30:
            case 31:
                {
                alt25=2;
                }
                break;
            case 34:
            case 35:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1379:3: lv_kardinalitaet_3_1= ruleKardinalitaet01
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_ruleIs_part_of2790);
                    lv_kardinalitaet_3_1=ruleKardinalitaet01();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIs_part_ofRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_3_1, 
                            		"Kardinalitaet01");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1394:8: lv_kardinalitaet_3_2= ruleKardinalitaet0x
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_ruleIs_part_of2809);
                    lv_kardinalitaet_3_2=ruleKardinalitaet0x();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIs_part_ofRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_3_2, 
                            		"Kardinalitaet0x");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1409:8: lv_kardinalitaet_3_3= ruleKardinalitaet1x
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet1xParserRuleCall_3_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_ruleIs_part_of2828);
                    lv_kardinalitaet_3_3=ruleKardinalitaet1x();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIs_part_ofRule());
                    	        }
                           		set(
                           			current, 
                           			"kardinalitaet",
                            		lv_kardinalitaet_3_3, 
                            		"Kardinalitaet1x");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1427:2: ( (otherlv_4= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1428:1: (otherlv_4= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1428:1: (otherlv_4= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1429:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_part_ofRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_part_of2851); 

            		newLeafNode(otherlv_4, grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleIs_part_of2863); 

                	newLeafNode(otherlv_5, grammarAccess.getIs_part_ofAccess().getSemicolonKeyword_5());
                

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1454:1: entryRuleKardinalitaet01 returns [EObject current=null] : iv_ruleKardinalitaet01= ruleKardinalitaet01 EOF ;
    public final EObject entryRuleKardinalitaet01() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet01 = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1455:2: (iv_ruleKardinalitaet01= ruleKardinalitaet01 EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1456:2: iv_ruleKardinalitaet01= ruleKardinalitaet01 EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet01Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet012901);
            iv_ruleKardinalitaet01=ruleKardinalitaet01();

            state._fsp--;

             current =iv_ruleKardinalitaet01; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet012911); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1463:1: ruleKardinalitaet01 returns [EObject current=null] : ( (otherlv_0= '--' | otherlv_1= '(0,1)' ) () ) ;
    public final EObject ruleKardinalitaet01() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1466:28: ( ( (otherlv_0= '--' | otherlv_1= '(0,1)' ) () ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1467:1: ( (otherlv_0= '--' | otherlv_1= '(0,1)' ) () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1467:1: ( (otherlv_0= '--' | otherlv_1= '(0,1)' ) () )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1467:2: (otherlv_0= '--' | otherlv_1= '(0,1)' ) ()
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1467:2: (otherlv_0= '--' | otherlv_1= '(0,1)' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            else if ( (LA26_0==29) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1467:4: otherlv_0= '--'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleKardinalitaet012949); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet01Access().getHyphenMinusHyphenMinusKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1472:7: otherlv_1= '(0,1)'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleKardinalitaet012967); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet01Access().getLeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1476:2: ()
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1477:5: 
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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1490:1: entryRuleKardinalitaet0x returns [EObject current=null] : iv_ruleKardinalitaet0x= ruleKardinalitaet0x EOF ;
    public final EObject entryRuleKardinalitaet0x() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet0x = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1491:2: (iv_ruleKardinalitaet0x= ruleKardinalitaet0x EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1492:2: iv_ruleKardinalitaet0x= ruleKardinalitaet0x EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet0xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x3013);
            iv_ruleKardinalitaet0x=ruleKardinalitaet0x();

            state._fsp--;

             current =iv_ruleKardinalitaet0x; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet0x3023); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1499:1: ruleKardinalitaet0x returns [EObject current=null] : ( (otherlv_0= '->' | otherlv_1= '(0,*)' ) () ) ;
    public final EObject ruleKardinalitaet0x() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1502:28: ( ( (otherlv_0= '->' | otherlv_1= '(0,*)' ) () ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1503:1: ( (otherlv_0= '->' | otherlv_1= '(0,*)' ) () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1503:1: ( (otherlv_0= '->' | otherlv_1= '(0,*)' ) () )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1503:2: (otherlv_0= '->' | otherlv_1= '(0,*)' ) ()
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1503:2: (otherlv_0= '->' | otherlv_1= '(0,*)' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            else if ( (LA27_0==31) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1503:4: otherlv_0= '->'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleKardinalitaet0x3061); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet0xAccess().getHyphenMinusGreaterThanSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1508:7: otherlv_1= '(0,*)'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleKardinalitaet0x3079); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet0xAccess().getLeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1512:2: ()
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1513:5: 
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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1526:1: entryRuleKardinalitaet11 returns [EObject current=null] : iv_ruleKardinalitaet11= ruleKardinalitaet11 EOF ;
    public final EObject entryRuleKardinalitaet11() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet11 = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1527:2: (iv_ruleKardinalitaet11= ruleKardinalitaet11 EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1528:2: iv_ruleKardinalitaet11= ruleKardinalitaet11 EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet11Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet113125);
            iv_ruleKardinalitaet11=ruleKardinalitaet11();

            state._fsp--;

             current =iv_ruleKardinalitaet11; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet113135); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1535:1: ruleKardinalitaet11 returns [EObject current=null] : ( (otherlv_0= '==' | otherlv_1= '(1,1)' ) () ) ;
    public final EObject ruleKardinalitaet11() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1538:28: ( ( (otherlv_0= '==' | otherlv_1= '(1,1)' ) () ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1539:1: ( (otherlv_0= '==' | otherlv_1= '(1,1)' ) () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1539:1: ( (otherlv_0= '==' | otherlv_1= '(1,1)' ) () )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1539:2: (otherlv_0= '==' | otherlv_1= '(1,1)' ) ()
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1539:2: (otherlv_0= '==' | otherlv_1= '(1,1)' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            else if ( (LA28_0==33) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1539:4: otherlv_0= '=='
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleKardinalitaet113173); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet11Access().getEqualsSignEqualsSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1544:7: otherlv_1= '(1,1)'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleKardinalitaet113191); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet11Access().getLeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1548:2: ()
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1549:5: 
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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1562:1: entryRuleKardinalitaet1x returns [EObject current=null] : iv_ruleKardinalitaet1x= ruleKardinalitaet1x EOF ;
    public final EObject entryRuleKardinalitaet1x() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet1x = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1563:2: (iv_ruleKardinalitaet1x= ruleKardinalitaet1x EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1564:2: iv_ruleKardinalitaet1x= ruleKardinalitaet1x EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet1xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x3237);
            iv_ruleKardinalitaet1x=ruleKardinalitaet1x();

            state._fsp--;

             current =iv_ruleKardinalitaet1x; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet1x3247); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1571:1: ruleKardinalitaet1x returns [EObject current=null] : ( (otherlv_0= '=>' | otherlv_1= '(1,*)' ) () ) ;
    public final EObject ruleKardinalitaet1x() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1574:28: ( ( (otherlv_0= '=>' | otherlv_1= '(1,*)' ) () ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1575:1: ( (otherlv_0= '=>' | otherlv_1= '(1,*)' ) () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1575:1: ( (otherlv_0= '=>' | otherlv_1= '(1,*)' ) () )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1575:2: (otherlv_0= '=>' | otherlv_1= '(1,*)' ) ()
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1575:2: (otherlv_0= '=>' | otherlv_1= '(1,*)' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            else if ( (LA29_0==35) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1575:4: otherlv_0= '=>'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleKardinalitaet1x3285); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet1xAccess().getEqualsSignGreaterThanSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1580:7: otherlv_1= '(1,*)'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleKardinalitaet1x3303); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet1xAccess().getLeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1584:2: ()
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1585:5: 
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


    // $ANTLR start "entryRuleAnnotation"
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1598:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1599:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1600:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation3349);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation3359); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1607:1: ruleAnnotation returns [EObject current=null] : (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge | this_Version_3= ruleVersion ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject this_Ignore_1 = null;

        EObject this_Merge_2 = null;

        EObject this_Version_3 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1610:28: ( (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge | this_Version_3= ruleVersion ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1611:1: (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge | this_Version_3= ruleVersion )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1611:1: (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge | this_Version_3= ruleVersion )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt30=1;
                }
                break;
            case 38:
                {
                alt30=2;
                }
                break;
            case 37:
                {
                alt30=3;
                }
                break;
            case 39:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1612:5: this_Name_0= ruleName
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getNameParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleName_in_ruleAnnotation3406);
                    this_Name_0=ruleName();

                    state._fsp--;

                     
                            current = this_Name_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1622:5: this_Ignore_1= ruleIgnore
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getIgnoreParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIgnore_in_ruleAnnotation3433);
                    this_Ignore_1=ruleIgnore();

                    state._fsp--;

                     
                            current = this_Ignore_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1632:5: this_Merge_2= ruleMerge
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getMergeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMerge_in_ruleAnnotation3460);
                    this_Merge_2=ruleMerge();

                    state._fsp--;

                     
                            current = this_Merge_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1642:5: this_Version_3= ruleVersion
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getVersionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleVersion_in_ruleAnnotation3487);
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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1658:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1659:2: (iv_ruleName= ruleName EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1660:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName3522);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName3532); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1667:1: ruleName returns [EObject current=null] : (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1670:28: ( (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1671:1: (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1671:1: (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1671:3: otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleName3569); 

                	newLeafNode(otherlv_0, grammarAccess.getNameAccess().getNameKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1675:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1676:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1676:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1677:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName3586); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1701:1: entryRuleMerge returns [EObject current=null] : iv_ruleMerge= ruleMerge EOF ;
    public final EObject entryRuleMerge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMerge = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1702:2: (iv_ruleMerge= ruleMerge EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1703:2: iv_ruleMerge= ruleMerge EOF
            {
             newCompositeNode(grammarAccess.getMergeRule()); 
            pushFollow(FOLLOW_ruleMerge_in_entryRuleMerge3627);
            iv_ruleMerge=ruleMerge();

            state._fsp--;

             current =iv_ruleMerge; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMerge3637); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1710:1: ruleMerge returns [EObject current=null] : (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMerge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1713:28: ( (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1714:1: (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1714:1: (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1714:3: otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleMerge3674); 

                	newLeafNode(otherlv_0, grammarAccess.getMergeAccess().getMergeKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1718:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1719:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1719:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1720:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMerge3691); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1744:1: entryRuleIgnore returns [EObject current=null] : iv_ruleIgnore= ruleIgnore EOF ;
    public final EObject entryRuleIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnore = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1745:2: (iv_ruleIgnore= ruleIgnore EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1746:2: iv_ruleIgnore= ruleIgnore EOF
            {
             newCompositeNode(grammarAccess.getIgnoreRule()); 
            pushFollow(FOLLOW_ruleIgnore_in_entryRuleIgnore3732);
            iv_ruleIgnore=ruleIgnore();

            state._fsp--;

             current =iv_ruleIgnore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIgnore3742); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1753:1: ruleIgnore returns [EObject current=null] : (otherlv_0= '@ignore' () ) ;
    public final EObject ruleIgnore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1756:28: ( (otherlv_0= '@ignore' () ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1757:1: (otherlv_0= '@ignore' () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1757:1: (otherlv_0= '@ignore' () )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1757:3: otherlv_0= '@ignore' ()
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleIgnore3779); 

                	newLeafNode(otherlv_0, grammarAccess.getIgnoreAccess().getIgnoreKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1761:1: ()
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1762:5: 
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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1775:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1776:2: (iv_ruleVersion= ruleVersion EOF )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1777:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion3824);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion3834); 

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
    // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1784:1: ruleVersion returns [EObject current=null] : (otherlv_0= '@version' ( (lv_version_1_0= RULE_VERSION_NUMBER ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_version_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1787:28: ( (otherlv_0= '@version' ( (lv_version_1_0= RULE_VERSION_NUMBER ) ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1788:1: (otherlv_0= '@version' ( (lv_version_1_0= RULE_VERSION_NUMBER ) ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1788:1: (otherlv_0= '@version' ( (lv_version_1_0= RULE_VERSION_NUMBER ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1788:3: otherlv_0= '@version' ( (lv_version_1_0= RULE_VERSION_NUMBER ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleVersion3871); 

                	newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getVersionKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1792:1: ( (lv_version_1_0= RULE_VERSION_NUMBER ) )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1793:1: (lv_version_1_0= RULE_VERSION_NUMBER )
            {
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1793:1: (lv_version_1_0= RULE_VERSION_NUMBER )
            // ../de.uniba.wiai.seda.fha.som.aws/src-gen/de/uniba/wiai/seda/fha/som/aws/parser/antlr/internal/InternalAws.g:1794:3: lv_version_1_0= RULE_VERSION_NUMBER
            {
            lv_version_1_0=(Token)match(input,RULE_VERSION_NUMBER,FOLLOW_RULE_VERSION_NUMBER_in_ruleVersion3888); 

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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA4_eotS =
        "\15\uffff";
    static final String DFA4_eofS =
        "\15\uffff";
    static final String DFA4_minS =
        "\1\4\1\uffff\3\4\1\5\2\uffff\1\17\1\uffff\3\4";
    static final String DFA4_maxS =
        "\1\47\1\uffff\1\4\1\31\1\4\1\5\2\uffff\1\43\1\uffff\3\31";
    static final String DFA4_acceptS =
        "\1\uffff\1\4\4\uffff\1\1\1\2\1\uffff\1\3\3\uffff";
    static final String DFA4_specialS =
        "\15\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\10\11\uffff\1\11\1\uffff\1\1\1\uffff\1\6\6\uffff\1\7\12"+
            "\uffff\1\2\1\4\1\3\1\5",
            "",
            "\1\12",
            "\1\7\15\uffff\1\6\6\uffff\1\7",
            "\1\13",
            "\1\14",
            "",
            "",
            "\1\11\14\uffff\4\7\2\uffff\2\7",
            "",
            "\1\7\15\uffff\1\6\6\uffff\1\7",
            "\1\7\15\uffff\1\6\6\uffff\1\7",
            "\1\7\15\uffff\1\6\6\uffff\1\7"
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
            return "()+ loopback of 262:1: ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )+";
        }
    }
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\15\uffff";
    static final String DFA6_minS =
        "\1\4\1\uffff\3\4\1\5\2\uffff\1\17\1\uffff\3\4";
    static final String DFA6_maxS =
        "\1\47\1\uffff\1\4\1\33\1\4\1\5\2\uffff\1\43\1\uffff\3\33";
    static final String DFA6_acceptS =
        "\1\uffff\1\4\4\uffff\1\1\1\2\1\uffff\1\3\3\uffff";
    static final String DFA6_specialS =
        "\15\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\10\13\uffff\1\1\1\11\1\uffff\3\6\3\uffff\3\7\10\uffff\1"+
            "\2\1\4\1\3\1\5",
            "",
            "\1\12",
            "\1\7\16\uffff\3\6\3\uffff\3\7",
            "\1\13",
            "\1\14",
            "",
            "",
            "\1\11\14\uffff\4\7\2\uffff\2\7",
            "",
            "\1\7\16\uffff\3\6\3\uffff\3\7",
            "\1\7\16\uffff\3\6\3\uffff\3\7",
            "\1\7\16\uffff\3\6\3\uffff\3\7"
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
            return "()+ loopback of 381:1: ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )+";
        }
    }
    static final String DFA9_eotS =
        "\13\uffff";
    static final String DFA9_eofS =
        "\13\uffff";
    static final String DFA9_minS =
        "\1\23\1\4\1\23\1\4\1\5\3\uffff\3\23";
    static final String DFA9_maxS =
        "\1\47\1\4\1\25\1\4\1\5\3\uffff\3\25";
    static final String DFA9_acceptS =
        "\5\uffff\1\1\1\2\1\3\3\uffff";
    static final String DFA9_specialS =
        "\13\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\5\1\6\1\7\16\uffff\1\1\1\3\1\2\1\4",
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

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "570:1: (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT )";
        }
    }
    static final String DFA18_eotS =
        "\13\uffff";
    static final String DFA18_eofS =
        "\13\uffff";
    static final String DFA18_minS =
        "\4\4\1\5\3\uffff\3\4";
    static final String DFA18_maxS =
        "\1\47\1\4\1\33\1\4\1\5\3\uffff\3\33";
    static final String DFA18_acceptS =
        "\5\uffff\1\1\1\2\1\3\3\uffff";
    static final String DFA18_specialS =
        "\13\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\5\24\uffff\1\5\1\6\1\7\10\uffff\1\1\1\3\1\2\1\4",
            "\1\10",
            "\1\5\24\uffff\1\5\1\6\1\7",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "\1\5\24\uffff\1\5\1\6\1\7",
            "\1\5\24\uffff\1\5\1\6\1\7",
            "\1\5\24\uffff\1\5\1\6\1\7"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1058:1: (this_Interacts_with_0= ruleInteracts_with | this_Is_a_1= ruleIs_a | this_Is_part_of_2= ruleIs_part_of )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAwS_in_entryRuleAwS75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwS85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAwS122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAwS139 = new BitSet(new long[]{0x0000000000026010L});
    public static final BitSet FOLLOW_13_in_ruleAwS157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_VERSION_NUMBER_in_ruleAwS174 = new BitSet(new long[]{0x0000000000026010L});
    public static final BitSet FOLLOW_ruleKOS_in_ruleAwS247 = new BitSet(new long[]{0x0000000000026012L});
    public static final BitSet FOLLOW_ruleVOS_in_ruleAwS322 = new BitSet(new long[]{0x0000000000026012L});
    public static final BitSet FOLLOW_ruleVOS_in_entryRuleVOS406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVOS416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleVOS460 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVOS496 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVOS514 = new BitSet(new long[]{0x000000F002066010L});
    public static final BitSet FOLLOW_ruleVOT_in_ruleVOS536 = new BitSet(new long[]{0x000000F002076010L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_ruleVOS563 = new BitSet(new long[]{0x000000F002076010L});
    public static final BitSet FOLLOW_ruleVOS_in_ruleVOS590 = new BitSet(new long[]{0x000000F002076010L});
    public static final BitSet FOLLOW_16_in_ruleVOS604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOS_in_entryRuleKOS640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKOS650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleKOS694 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKOS730 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleKOS748 = new BitSet(new long[]{0x000000F00E3A0010L});
    public static final BitSet FOLLOW_ruleKOT_in_ruleKOS770 = new BitSet(new long[]{0x000000F00E3B0010L});
    public static final BitSet FOLLOW_ruleBeziehung_in_ruleKOS797 = new BitSet(new long[]{0x000000F00E3B0010L});
    public static final BitSet FOLLOW_ruleKOS_in_ruleKOS824 = new BitSet(new long[]{0x000000F00E3B0010L});
    public static final BitSet FOLLOW_16_in_ruleKOS838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOT_in_entryRuleVOT876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVOT886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleVOT932 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVOT945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVOT962 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVOT979 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleVOT1001 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleVOT1028 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleVOT1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOT_in_entryRuleKOT1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKOT1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_ruleKOT1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_ruleKOT1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_ruleKOT1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_entryRuleOOT1224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOOT1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleOOT1280 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOOT1293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOOT1310 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOOT1327 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleOOT1349 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleOOT1376 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleOOT1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_entryRuleLOT1426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOT1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleLOT1482 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLOT1495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLOT1512 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLOT1529 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleLOT1551 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleLOT1578 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleLOT1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_entryRuleTOT1628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTOT1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTOT1684 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTOT1697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTOT1714 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTOT1731 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleTOT1753 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleTOT1780 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleTOT1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_entryRuleAttribut1830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribut1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribut1885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribut1903 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAttribut1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator1956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperator2008 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOperator2025 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperator2045 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleOperator2058 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOperator2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeziehung_in_entryRuleBeziehung2106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeziehung2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_ruleBeziehung2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_a_in_ruleBeziehung2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_ruleBeziehung2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with2252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteracts_with2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleInteracts_with2308 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleInteracts_with2322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteracts_with2344 = new BitSet(new long[]{0x0000000CF0000000L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_ruleInteracts_with2367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_ruleInteracts_with2386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_ruleInteracts_with2405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteracts_with2428 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleInteracts_with2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_a_in_entryRuleIs_a2476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_a2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleIs_a2532 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleIs_a2545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_a2565 = new BitSet(new long[]{0x0000000330000000L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_ruleIs_a2588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_ruleIs_a2607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_a2630 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIs_a2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of2678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_part_of2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleIs_part_of2734 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleIs_part_of2747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_part_of2767 = new BitSet(new long[]{0x0000000CF0000000L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_ruleIs_part_of2790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_ruleIs_part_of2809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_ruleIs_part_of2828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_part_of2851 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIs_part_of2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet012901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet012911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleKardinalitaet012949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleKardinalitaet012967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x3013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet0x3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleKardinalitaet0x3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleKardinalitaet0x3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet113125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet113135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleKardinalitaet113173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleKardinalitaet113191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x3237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet1x3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleKardinalitaet1x3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleKardinalitaet1x3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation3349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleAnnotation3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_ruleAnnotation3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_ruleAnnotation3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleAnnotation3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName3522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleName3569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_entryRuleMerge3627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMerge3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMerge3674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMerge3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_entryRuleIgnore3732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIgnore3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleIgnore3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion3824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVersion3871 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_VERSION_NUMBER_in_ruleVersion3888 = new BitSet(new long[]{0x0000000000000002L});

}
