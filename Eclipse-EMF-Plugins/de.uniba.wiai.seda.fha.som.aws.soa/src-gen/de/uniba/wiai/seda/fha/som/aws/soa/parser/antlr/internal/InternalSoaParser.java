package de.uniba.wiai.seda.fha.som.aws.soa.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uniba.wiai.seda.fha.som.aws.soa.services.SoaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSoaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VERSION_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SOA-AwS:'", "'v'", "'Vorgangsservice'", "'{'", "'}'", "'VOT'", "'Interface'", "'('", "');'", "'Workflow'", "')'", "'->'", "';'", "'.'", "'Entityservice'", "'KOT'", "'VOS'", "'KOS'", "'OOT'", "'LOT'", "'TOT'", "'interacts_with:'", "'is_a:'", "'is_part_of:'", "'--'", "'(0,1)'", "'(0,*)'", "'=='", "'(1,1)'", "'=>'", "'(1,*)'", "'@name'", "'@merge'", "'@ignore'", "'@version'"
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
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g"; }



     	private SoaGrammarAccess grammarAccess;
     	
        public InternalSoaParser(TokenStream input, SoaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SOA_AwS";	
       	}
       	
       	@Override
       	protected SoaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSOA_AwS"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:67:1: entryRuleSOA_AwS returns [EObject current=null] : iv_ruleSOA_AwS= ruleSOA_AwS EOF ;
    public final EObject entryRuleSOA_AwS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSOA_AwS = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:68:2: (iv_ruleSOA_AwS= ruleSOA_AwS EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:69:2: iv_ruleSOA_AwS= ruleSOA_AwS EOF
            {
             newCompositeNode(grammarAccess.getSOA_AwSRule()); 
            pushFollow(FOLLOW_ruleSOA_AwS_in_entryRuleSOA_AwS75);
            iv_ruleSOA_AwS=ruleSOA_AwS();

            state._fsp--;

             current =iv_ruleSOA_AwS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSOA_AwS85); 

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
    // $ANTLR end "entryRuleSOA_AwS"


    // $ANTLR start "ruleSOA_AwS"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:76:1: ruleSOA_AwS returns [EObject current=null] : (otherlv_0= 'SOA-AwS:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION_NUMBER ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) ) ) )+ {...}?) ) ) ( ( (lv_vorgangsservices_7_0= ruleVorgangsservice ) ) | ( (lv_entityservices_8_0= ruleEntityservice ) ) )* ) ;
    public final EObject ruleSOA_AwS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_version_3_0=null;
        EObject lv_vos_5_0 = null;

        EObject lv_kos_6_0 = null;

        EObject lv_vorgangsservices_7_0 = null;

        EObject lv_entityservices_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:79:28: ( (otherlv_0= 'SOA-AwS:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION_NUMBER ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) ) ) )+ {...}?) ) ) ( ( (lv_vorgangsservices_7_0= ruleVorgangsservice ) ) | ( (lv_entityservices_8_0= ruleEntityservice ) ) )* ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:80:1: (otherlv_0= 'SOA-AwS:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION_NUMBER ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) ) ) )+ {...}?) ) ) ( ( (lv_vorgangsservices_7_0= ruleVorgangsservice ) ) | ( (lv_entityservices_8_0= ruleEntityservice ) ) )* )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:80:1: (otherlv_0= 'SOA-AwS:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION_NUMBER ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) ) ) )+ {...}?) ) ) ( ( (lv_vorgangsservices_7_0= ruleVorgangsservice ) ) | ( (lv_entityservices_8_0= ruleEntityservice ) ) )* )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:80:3: otherlv_0= 'SOA-AwS:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION_NUMBER ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) ) ) )+ {...}?) ) ) ( ( (lv_vorgangsservices_7_0= ruleVorgangsservice ) ) | ( (lv_entityservices_8_0= ruleEntityservice ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleSOA_AwS122); 

                	newLeafNode(otherlv_0, grammarAccess.getSOA_AwSAccess().getSOAAwSKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:85:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSOA_AwS139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSOA_AwSAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSOA_AwSRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:102:2: (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION_NUMBER ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:102:4: otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION_NUMBER ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSOA_AwS157); 

                        	newLeafNode(otherlv_2, grammarAccess.getSOA_AwSAccess().getVKeyword_2_0());
                        
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:106:1: ( (lv_version_3_0= RULE_VERSION_NUMBER ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:107:1: (lv_version_3_0= RULE_VERSION_NUMBER )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:107:1: (lv_version_3_0= RULE_VERSION_NUMBER )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:108:3: lv_version_3_0= RULE_VERSION_NUMBER
                    {
                    lv_version_3_0=(Token)match(input,RULE_VERSION_NUMBER,FOLLOW_RULE_VERSION_NUMBER_in_ruleSOA_AwS174); 

                    			newLeafNode(lv_version_3_0, grammarAccess.getSOA_AwSAccess().getVersionVERSION_NUMBERTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSOA_AwSRule());
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

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:124:4: ( ( ( ( ({...}? => ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) ) ) )+ {...}?) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:126:1: ( ( ( ({...}? => ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) ) ) )+ {...}?) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:126:1: ( ( ( ({...}? => ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) ) ) )+ {...}?) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:127:2: ( ( ({...}? => ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3());
            	
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:130:2: ( ( ({...}? => ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) ) ) )+ {...}?)
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:131:3: ( ({...}? => ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) ) ) )+ {...}?
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:131:3: ( ({...}? => ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 ==RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 1) ) ) {
                    int LA2_5 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 0) ) {
                        alt2=1;
                    }
                    else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 1) ) {
                        alt2=2;
                    }


                }
                else if ( LA2_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:133:4: ({...}? => ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:133:4: ({...}? => ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:134:5: {...}? => ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSOA_AwS", "getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:134:104: ( ({...}? => ( (lv_vos_5_0= ruleVOS ) ) ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:135:6: ({...}? => ( (lv_vos_5_0= ruleVOS ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:138:6: ({...}? => ( (lv_vos_5_0= ruleVOS ) ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:138:7: {...}? => ( (lv_vos_5_0= ruleVOS ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSOA_AwS", "true");
            	    }
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:138:16: ( (lv_vos_5_0= ruleVOS ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:139:1: (lv_vos_5_0= ruleVOS )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:139:1: (lv_vos_5_0= ruleVOS )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:140:3: lv_vos_5_0= ruleVOS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSOA_AwSAccess().getVosVOSParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVOS_in_ruleSOA_AwS247);
            	    lv_vos_5_0=ruleVOS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSOA_AwSRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"vos",
            	            		lv_vos_5_0, 
            	            		"VOS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:163:4: ({...}? => ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:163:4: ({...}? => ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:164:5: {...}? => ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSOA_AwS", "getUnorderedGroupHelper().canSelect(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:164:104: ( ({...}? => ( (lv_kos_6_0= ruleKOS ) ) ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:165:6: ({...}? => ( (lv_kos_6_0= ruleKOS ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:168:6: ({...}? => ( (lv_kos_6_0= ruleKOS ) ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:168:7: {...}? => ( (lv_kos_6_0= ruleKOS ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSOA_AwS", "true");
            	    }
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:168:16: ( (lv_kos_6_0= ruleKOS ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:169:1: (lv_kos_6_0= ruleKOS )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:169:1: (lv_kos_6_0= ruleKOS )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:170:3: lv_kos_6_0= ruleKOS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSOA_AwSAccess().getKosKOSParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleKOS_in_ruleSOA_AwS322);
            	    lv_kos_6_0=ruleKOS();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSOA_AwSRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"kos",
            	            		lv_kos_6_0, 
            	            		"KOS");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleSOA_AwS", "getUnorderedGroupHelper().canLeave(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSOA_AwSAccess().getUnorderedGroup_3());
            	

            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:201:2: ( ( (lv_vorgangsservices_7_0= ruleVorgangsservice ) ) | ( (lv_entityservices_8_0= ruleEntityservice ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }
                else if ( (LA3_0==26) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:201:3: ( (lv_vorgangsservices_7_0= ruleVorgangsservice ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:201:3: ( (lv_vorgangsservices_7_0= ruleVorgangsservice ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:202:1: (lv_vorgangsservices_7_0= ruleVorgangsservice )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:202:1: (lv_vorgangsservices_7_0= ruleVorgangsservice )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:203:3: lv_vorgangsservices_7_0= ruleVorgangsservice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSOA_AwSAccess().getVorgangsservicesVorgangsserviceParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVorgangsservice_in_ruleSOA_AwS390);
            	    lv_vorgangsservices_7_0=ruleVorgangsservice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSOA_AwSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"vorgangsservices",
            	            		lv_vorgangsservices_7_0, 
            	            		"Vorgangsservice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:220:6: ( (lv_entityservices_8_0= ruleEntityservice ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:220:6: ( (lv_entityservices_8_0= ruleEntityservice ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:221:1: (lv_entityservices_8_0= ruleEntityservice )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:221:1: (lv_entityservices_8_0= ruleEntityservice )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:222:3: lv_entityservices_8_0= ruleEntityservice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSOA_AwSAccess().getEntityservicesEntityserviceParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntityservice_in_ruleSOA_AwS417);
            	    lv_entityservices_8_0=ruleEntityservice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSOA_AwSRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entityservices",
            	            		lv_entityservices_8_0, 
            	            		"Entityservice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleSOA_AwS"


    // $ANTLR start "entryRuleVorgangsservice"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:248:1: entryRuleVorgangsservice returns [EObject current=null] : iv_ruleVorgangsservice= ruleVorgangsservice EOF ;
    public final EObject entryRuleVorgangsservice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVorgangsservice = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:249:2: (iv_ruleVorgangsservice= ruleVorgangsservice EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:250:2: iv_ruleVorgangsservice= ruleVorgangsservice EOF
            {
             newCompositeNode(grammarAccess.getVorgangsserviceRule()); 
            pushFollow(FOLLOW_ruleVorgangsservice_in_entryRuleVorgangsservice457);
            iv_ruleVorgangsservice=ruleVorgangsservice();

            state._fsp--;

             current =iv_ruleVorgangsservice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVorgangsservice467); 

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
    // $ANTLR end "entryRuleVorgangsservice"


    // $ANTLR start "ruleVorgangsservice"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:257:1: ruleVorgangsservice returns [EObject current=null] : (otherlv_0= 'Vorgangsservice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_choreographieIF_3_0= ruleInterface ) ) ( (lv_vorgangsservicesElementar_4_0= ruleVorgangsserviceElementar ) )* ( (lv_workflow_5_0= ruleWorkflow ) ) otherlv_6= '}' ) ;
    public final EObject ruleVorgangsservice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_choreographieIF_3_0 = null;

        EObject lv_vorgangsservicesElementar_4_0 = null;

        EObject lv_workflow_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:260:28: ( (otherlv_0= 'Vorgangsservice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_choreographieIF_3_0= ruleInterface ) ) ( (lv_vorgangsservicesElementar_4_0= ruleVorgangsserviceElementar ) )* ( (lv_workflow_5_0= ruleWorkflow ) ) otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:261:1: (otherlv_0= 'Vorgangsservice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_choreographieIF_3_0= ruleInterface ) ) ( (lv_vorgangsservicesElementar_4_0= ruleVorgangsserviceElementar ) )* ( (lv_workflow_5_0= ruleWorkflow ) ) otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:261:1: (otherlv_0= 'Vorgangsservice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_choreographieIF_3_0= ruleInterface ) ) ( (lv_vorgangsservicesElementar_4_0= ruleVorgangsserviceElementar ) )* ( (lv_workflow_5_0= ruleWorkflow ) ) otherlv_6= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:261:3: otherlv_0= 'Vorgangsservice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_choreographieIF_3_0= ruleInterface ) ) ( (lv_vorgangsservicesElementar_4_0= ruleVorgangsserviceElementar ) )* ( (lv_workflow_5_0= ruleWorkflow ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleVorgangsservice504); 

                	newLeafNode(otherlv_0, grammarAccess.getVorgangsserviceAccess().getVorgangsserviceKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:265:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:266:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:266:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:267:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVorgangsservice521); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVorgangsserviceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVorgangsserviceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleVorgangsservice538); 

                	newLeafNode(otherlv_2, grammarAccess.getVorgangsserviceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:287:1: ( (lv_choreographieIF_3_0= ruleInterface ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:288:1: (lv_choreographieIF_3_0= ruleInterface )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:288:1: (lv_choreographieIF_3_0= ruleInterface )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:289:3: lv_choreographieIF_3_0= ruleInterface
            {
             
            	        newCompositeNode(grammarAccess.getVorgangsserviceAccess().getChoreographieIFInterfaceParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleInterface_in_ruleVorgangsservice559);
            lv_choreographieIF_3_0=ruleInterface();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVorgangsserviceRule());
            	        }
                   		set(
                   			current, 
                   			"choreographieIF",
                    		lv_choreographieIF_3_0, 
                    		"Interface");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:305:2: ( (lv_vorgangsservicesElementar_4_0= ruleVorgangsserviceElementar ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:306:1: (lv_vorgangsservicesElementar_4_0= ruleVorgangsserviceElementar )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:306:1: (lv_vorgangsservicesElementar_4_0= ruleVorgangsserviceElementar )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:307:3: lv_vorgangsservicesElementar_4_0= ruleVorgangsserviceElementar
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVorgangsserviceAccess().getVorgangsservicesElementarVorgangsserviceElementarParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVorgangsserviceElementar_in_ruleVorgangsservice580);
            	    lv_vorgangsservicesElementar_4_0=ruleVorgangsserviceElementar();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVorgangsserviceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"vorgangsservicesElementar",
            	            		lv_vorgangsservicesElementar_4_0, 
            	            		"VorgangsserviceElementar");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:323:3: ( (lv_workflow_5_0= ruleWorkflow ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:324:1: (lv_workflow_5_0= ruleWorkflow )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:324:1: (lv_workflow_5_0= ruleWorkflow )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:325:3: lv_workflow_5_0= ruleWorkflow
            {
             
            	        newCompositeNode(grammarAccess.getVorgangsserviceAccess().getWorkflowWorkflowParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleWorkflow_in_ruleVorgangsservice602);
            lv_workflow_5_0=ruleWorkflow();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVorgangsserviceRule());
            	        }
                   		set(
                   			current, 
                   			"workflow",
                    		lv_workflow_5_0, 
                    		"Workflow");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleVorgangsservice614); 

                	newLeafNode(otherlv_6, grammarAccess.getVorgangsserviceAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleVorgangsservice"


    // $ANTLR start "entryRuleVorgangsserviceElementar"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:353:1: entryRuleVorgangsserviceElementar returns [EObject current=null] : iv_ruleVorgangsserviceElementar= ruleVorgangsserviceElementar EOF ;
    public final EObject entryRuleVorgangsserviceElementar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVorgangsserviceElementar = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:354:2: (iv_ruleVorgangsserviceElementar= ruleVorgangsserviceElementar EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:355:2: iv_ruleVorgangsserviceElementar= ruleVorgangsserviceElementar EOF
            {
             newCompositeNode(grammarAccess.getVorgangsserviceElementarRule()); 
            pushFollow(FOLLOW_ruleVorgangsserviceElementar_in_entryRuleVorgangsserviceElementar650);
            iv_ruleVorgangsserviceElementar=ruleVorgangsserviceElementar();

            state._fsp--;

             current =iv_ruleVorgangsserviceElementar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVorgangsserviceElementar660); 

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
    // $ANTLR end "entryRuleVorgangsserviceElementar"


    // $ANTLR start "ruleVorgangsserviceElementar"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:362:1: ruleVorgangsserviceElementar returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'VOT' ( (otherlv_2= RULE_ID ) ) ( (lv_interface_3_0= ruleInterface ) ) ) ;
    public final EObject ruleVorgangsserviceElementar() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_interface_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:365:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'VOT' ( (otherlv_2= RULE_ID ) ) ( (lv_interface_3_0= ruleInterface ) ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:366:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'VOT' ( (otherlv_2= RULE_ID ) ) ( (lv_interface_3_0= ruleInterface ) ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:366:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'VOT' ( (otherlv_2= RULE_ID ) ) ( (lv_interface_3_0= ruleInterface ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:366:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'VOT' ( (otherlv_2= RULE_ID ) ) ( (lv_interface_3_0= ruleInterface ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:366:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:367:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:367:1: (lv_name_0_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:368:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVorgangsserviceElementar702); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVorgangsserviceElementarAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVorgangsserviceElementarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleVorgangsserviceElementar719); 

                	newLeafNode(otherlv_1, grammarAccess.getVorgangsserviceElementarAccess().getVOTKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:388:1: ( (otherlv_2= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:389:1: (otherlv_2= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:389:1: (otherlv_2= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:390:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVorgangsserviceElementarRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVorgangsserviceElementar739); 

            		newLeafNode(otherlv_2, grammarAccess.getVorgangsserviceElementarAccess().getKomponentenObjekttypVOTCrossReference_2_0()); 
            	

            }


            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:401:2: ( (lv_interface_3_0= ruleInterface ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:402:1: (lv_interface_3_0= ruleInterface )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:402:1: (lv_interface_3_0= ruleInterface )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:403:3: lv_interface_3_0= ruleInterface
            {
             
            	        newCompositeNode(grammarAccess.getVorgangsserviceElementarAccess().getInterfaceInterfaceParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleInterface_in_ruleVorgangsserviceElementar760);
            lv_interface_3_0=ruleInterface();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVorgangsserviceElementarRule());
            	        }
                   		set(
                   			current, 
                   			"interface",
                    		lv_interface_3_0, 
                    		"Interface");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleVorgangsserviceElementar"


    // $ANTLR start "entryRuleInterface"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:427:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:428:2: (iv_ruleInterface= ruleInterface EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:429:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface796);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface806); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:436:1: ruleInterface returns [EObject current=null] : ( ( (lv_name_0_0= 'Interface' ) ) otherlv_1= '{' ( (lv_methoden_2_0= ruleServiceMethode ) )+ otherlv_3= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_methoden_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:439:28: ( ( ( (lv_name_0_0= 'Interface' ) ) otherlv_1= '{' ( (lv_methoden_2_0= ruleServiceMethode ) )+ otherlv_3= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:440:1: ( ( (lv_name_0_0= 'Interface' ) ) otherlv_1= '{' ( (lv_methoden_2_0= ruleServiceMethode ) )+ otherlv_3= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:440:1: ( ( (lv_name_0_0= 'Interface' ) ) otherlv_1= '{' ( (lv_methoden_2_0= ruleServiceMethode ) )+ otherlv_3= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:440:2: ( (lv_name_0_0= 'Interface' ) ) otherlv_1= '{' ( (lv_methoden_2_0= ruleServiceMethode ) )+ otherlv_3= '}'
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:440:2: ( (lv_name_0_0= 'Interface' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:441:1: (lv_name_0_0= 'Interface' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:441:1: (lv_name_0_0= 'Interface' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:442:3: lv_name_0_0= 'Interface'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_18_in_ruleInterface849); 

                    newLeafNode(lv_name_0_0, grammarAccess.getInterfaceAccess().getNameInterfaceKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Interface");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleInterface874); 

                	newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:459:1: ( (lv_methoden_2_0= ruleServiceMethode ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:460:1: (lv_methoden_2_0= ruleServiceMethode )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:460:1: (lv_methoden_2_0= ruleServiceMethode )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:461:3: lv_methoden_2_0= ruleServiceMethode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceAccess().getMethodenServiceMethodeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceMethode_in_ruleInterface895);
            	    lv_methoden_2_0=ruleServiceMethode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methoden",
            	            		lv_methoden_2_0, 
            	            		"ServiceMethode");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleInterface908); 

                	newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleServiceMethode"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:489:1: entryRuleServiceMethode returns [EObject current=null] : iv_ruleServiceMethode= ruleServiceMethode EOF ;
    public final EObject entryRuleServiceMethode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceMethode = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:490:2: (iv_ruleServiceMethode= ruleServiceMethode EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:491:2: iv_ruleServiceMethode= ruleServiceMethode EOF
            {
             newCompositeNode(grammarAccess.getServiceMethodeRule()); 
            pushFollow(FOLLOW_ruleServiceMethode_in_entryRuleServiceMethode944);
            iv_ruleServiceMethode=ruleServiceMethode();

            state._fsp--;

             current =iv_ruleServiceMethode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceMethode954); 

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
    // $ANTLR end "entryRuleServiceMethode"


    // $ANTLR start "ruleServiceMethode"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:498:1: ruleServiceMethode returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameter_2_0= RULE_ID ) )* otherlv_3= ');' ) ;
    public final EObject ruleServiceMethode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_parameter_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:501:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameter_2_0= RULE_ID ) )* otherlv_3= ');' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:502:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameter_2_0= RULE_ID ) )* otherlv_3= ');' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:502:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameter_2_0= RULE_ID ) )* otherlv_3= ');' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:502:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_parameter_2_0= RULE_ID ) )* otherlv_3= ');'
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:502:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:503:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:503:1: (lv_name_0_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:504:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceMethode996); 

            			newLeafNode(lv_name_0_0, grammarAccess.getServiceMethodeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceMethodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleServiceMethode1013); 

                	newLeafNode(otherlv_1, grammarAccess.getServiceMethodeAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:524:1: ( (lv_parameter_2_0= RULE_ID ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:525:1: (lv_parameter_2_0= RULE_ID )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:525:1: (lv_parameter_2_0= RULE_ID )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:526:3: lv_parameter_2_0= RULE_ID
            	    {
            	    lv_parameter_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceMethode1030); 

            	    			newLeafNode(lv_parameter_2_0, grammarAccess.getServiceMethodeAccess().getParameterIDTerminalRuleCall_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getServiceMethodeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"parameter",
            	            		lv_parameter_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleServiceMethode1048); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceMethodeAccess().getRightParenthesisSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleServiceMethode"


    // $ANTLR start "entryRuleWorkflow"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:554:1: entryRuleWorkflow returns [EObject current=null] : iv_ruleWorkflow= ruleWorkflow EOF ;
    public final EObject entryRuleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:555:2: (iv_ruleWorkflow= ruleWorkflow EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:556:2: iv_ruleWorkflow= ruleWorkflow EOF
            {
             newCompositeNode(grammarAccess.getWorkflowRule()); 
            pushFollow(FOLLOW_ruleWorkflow_in_entryRuleWorkflow1084);
            iv_ruleWorkflow=ruleWorkflow();

            state._fsp--;

             current =iv_ruleWorkflow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflow1094); 

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
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:563:1: ruleWorkflow returns [EObject current=null] : (otherlv_0= 'Workflow' otherlv_1= '{' ( ( (lv_orchestrierung_2_0= ruleOrchestrierung ) ) | ( (lv_choreographie_3_0= ruleChoreographieLokal ) ) )+ otherlv_4= '}' ) ;
    public final EObject ruleWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_orchestrierung_2_0 = null;

        EObject lv_choreographie_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:566:28: ( (otherlv_0= 'Workflow' otherlv_1= '{' ( ( (lv_orchestrierung_2_0= ruleOrchestrierung ) ) | ( (lv_choreographie_3_0= ruleChoreographieLokal ) ) )+ otherlv_4= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:567:1: (otherlv_0= 'Workflow' otherlv_1= '{' ( ( (lv_orchestrierung_2_0= ruleOrchestrierung ) ) | ( (lv_choreographie_3_0= ruleChoreographieLokal ) ) )+ otherlv_4= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:567:1: (otherlv_0= 'Workflow' otherlv_1= '{' ( ( (lv_orchestrierung_2_0= ruleOrchestrierung ) ) | ( (lv_choreographie_3_0= ruleChoreographieLokal ) ) )+ otherlv_4= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:567:3: otherlv_0= 'Workflow' otherlv_1= '{' ( ( (lv_orchestrierung_2_0= ruleOrchestrierung ) ) | ( (lv_choreographie_3_0= ruleChoreographieLokal ) ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleWorkflow1131); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkflowAccess().getWorkflowKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleWorkflow1143); 

                	newLeafNode(otherlv_1, grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:575:1: ( ( (lv_orchestrierung_2_0= ruleOrchestrierung ) ) | ( (lv_choreographie_3_0= ruleChoreographieLokal ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:575:2: ( (lv_orchestrierung_2_0= ruleOrchestrierung ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:575:2: ( (lv_orchestrierung_2_0= ruleOrchestrierung ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:576:1: (lv_orchestrierung_2_0= ruleOrchestrierung )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:576:1: (lv_orchestrierung_2_0= ruleOrchestrierung )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:577:3: lv_orchestrierung_2_0= ruleOrchestrierung
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorkflowAccess().getOrchestrierungOrchestrierungParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrchestrierung_in_ruleWorkflow1165);
            	    lv_orchestrierung_2_0=ruleOrchestrierung();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"orchestrierung",
            	            		lv_orchestrierung_2_0, 
            	            		"Orchestrierung");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:594:6: ( (lv_choreographie_3_0= ruleChoreographieLokal ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:594:6: ( (lv_choreographie_3_0= ruleChoreographieLokal ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:595:1: (lv_choreographie_3_0= ruleChoreographieLokal )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:595:1: (lv_choreographie_3_0= ruleChoreographieLokal )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:596:3: lv_choreographie_3_0= ruleChoreographieLokal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorkflowAccess().getChoreographieChoreographieLokalParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChoreographieLokal_in_ruleWorkflow1192);
            	    lv_choreographie_3_0=ruleChoreographieLokal();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"choreographie",
            	            		lv_choreographie_3_0, 
            	            		"ChoreographieLokal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleWorkflow1206); 

                	newLeafNode(otherlv_4, grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleOrchestrierung"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:624:1: entryRuleOrchestrierung returns [EObject current=null] : iv_ruleOrchestrierung= ruleOrchestrierung EOF ;
    public final EObject entryRuleOrchestrierung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrchestrierung = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:625:2: (iv_ruleOrchestrierung= ruleOrchestrierung EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:626:2: iv_ruleOrchestrierung= ruleOrchestrierung EOF
            {
             newCompositeNode(grammarAccess.getOrchestrierungRule()); 
            pushFollow(FOLLOW_ruleOrchestrierung_in_entryRuleOrchestrierung1242);
            iv_ruleOrchestrierung=ruleOrchestrierung();

            state._fsp--;

             current =iv_ruleOrchestrierung; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrchestrierung1252); 

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
    // $ANTLR end "entryRuleOrchestrierung"


    // $ANTLR start "ruleOrchestrierung"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:633:1: ruleOrchestrierung returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_bedingung_1_0= ruleBedingung ) ) otherlv_2= ')' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ) ;
    public final EObject ruleOrchestrierung() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_bedingung_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:636:28: ( ( (otherlv_0= '(' ( (lv_bedingung_1_0= ruleBedingung ) ) otherlv_2= ')' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:637:1: ( (otherlv_0= '(' ( (lv_bedingung_1_0= ruleBedingung ) ) otherlv_2= ')' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:637:1: ( (otherlv_0= '(' ( (lv_bedingung_1_0= ruleBedingung ) ) otherlv_2= ')' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:637:2: (otherlv_0= '(' ( (lv_bedingung_1_0= ruleBedingung ) ) otherlv_2= ')' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';'
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:637:2: (otherlv_0= '(' ( (lv_bedingung_1_0= ruleBedingung ) ) otherlv_2= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:637:4: otherlv_0= '(' ( (lv_bedingung_1_0= ruleBedingung ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleOrchestrierung1290); 

                        	newLeafNode(otherlv_0, grammarAccess.getOrchestrierungAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:641:1: ( (lv_bedingung_1_0= ruleBedingung ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:642:1: (lv_bedingung_1_0= ruleBedingung )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:642:1: (lv_bedingung_1_0= ruleBedingung )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:643:3: lv_bedingung_1_0= ruleBedingung
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrchestrierungAccess().getBedingungBedingungParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBedingung_in_ruleOrchestrierung1311);
                    lv_bedingung_1_0=ruleBedingung();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrchestrierungRule());
                    	        }
                           		set(
                           			current, 
                           			"bedingung",
                            		lv_bedingung_1_0, 
                            		"Bedingung");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleOrchestrierung1323); 

                        	newLeafNode(otherlv_2, grammarAccess.getOrchestrierungAccess().getRightParenthesisKeyword_0_2());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:663:3: ( (otherlv_3= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:664:1: (otherlv_3= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:664:1: (otherlv_3= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:665:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOrchestrierungRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrchestrierung1345); 

            		newLeafNode(otherlv_3, grammarAccess.getOrchestrierungAccess().getMethode1ServiceMethodeCrossReference_1_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleOrchestrierung1357); 

                	newLeafNode(otherlv_4, grammarAccess.getOrchestrierungAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:680:1: ( (otherlv_5= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:681:1: (otherlv_5= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:681:1: (otherlv_5= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:682:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOrchestrierungRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrchestrierung1377); 

            		newLeafNode(otherlv_5, grammarAccess.getOrchestrierungAccess().getMethode2ServiceMethodeCrossReference_3_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleOrchestrierung1389); 

                	newLeafNode(otherlv_6, grammarAccess.getOrchestrierungAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleOrchestrierung"


    // $ANTLR start "entryRuleChoreographieLokal"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:705:1: entryRuleChoreographieLokal returns [EObject current=null] : iv_ruleChoreographieLokal= ruleChoreographieLokal EOF ;
    public final EObject entryRuleChoreographieLokal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoreographieLokal = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:706:2: (iv_ruleChoreographieLokal= ruleChoreographieLokal EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:707:2: iv_ruleChoreographieLokal= ruleChoreographieLokal EOF
            {
             newCompositeNode(grammarAccess.getChoreographieLokalRule()); 
            pushFollow(FOLLOW_ruleChoreographieLokal_in_entryRuleChoreographieLokal1425);
            iv_ruleChoreographieLokal=ruleChoreographieLokal();

            state._fsp--;

             current =iv_ruleChoreographieLokal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoreographieLokal1435); 

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
    // $ANTLR end "entryRuleChoreographieLokal"


    // $ANTLR start "ruleChoreographieLokal"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:714:1: ruleChoreographieLokal returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_bedingung_1_0= ruleBedingung ) ) otherlv_2= ')' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) ;
    public final EObject ruleChoreographieLokal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_bedingung_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:717:28: ( ( (otherlv_0= '(' ( (lv_bedingung_1_0= ruleBedingung ) ) otherlv_2= ')' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:718:1: ( (otherlv_0= '(' ( (lv_bedingung_1_0= ruleBedingung ) ) otherlv_2= ')' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:718:1: ( (otherlv_0= '(' ( (lv_bedingung_1_0= ruleBedingung ) ) otherlv_2= ')' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:718:2: (otherlv_0= '(' ( (lv_bedingung_1_0= ruleBedingung ) ) otherlv_2= ')' )? ( (otherlv_3= RULE_ID ) ) otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';'
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:718:2: (otherlv_0= '(' ( (lv_bedingung_1_0= ruleBedingung ) ) otherlv_2= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:718:4: otherlv_0= '(' ( (lv_bedingung_1_0= ruleBedingung ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleChoreographieLokal1473); 

                        	newLeafNode(otherlv_0, grammarAccess.getChoreographieLokalAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:722:1: ( (lv_bedingung_1_0= ruleBedingung ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:723:1: (lv_bedingung_1_0= ruleBedingung )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:723:1: (lv_bedingung_1_0= ruleBedingung )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:724:3: lv_bedingung_1_0= ruleBedingung
                    {
                     
                    	        newCompositeNode(grammarAccess.getChoreographieLokalAccess().getBedingungBedingungParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBedingung_in_ruleChoreographieLokal1494);
                    lv_bedingung_1_0=ruleBedingung();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getChoreographieLokalRule());
                    	        }
                           		set(
                           			current, 
                           			"bedingung",
                            		lv_bedingung_1_0, 
                            		"Bedingung");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleChoreographieLokal1506); 

                        	newLeafNode(otherlv_2, grammarAccess.getChoreographieLokalAccess().getRightParenthesisKeyword_0_2());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:744:3: ( (otherlv_3= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:745:1: (otherlv_3= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:745:1: (otherlv_3= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:746:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChoreographieLokalRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChoreographieLokal1528); 

            		newLeafNode(otherlv_3, grammarAccess.getChoreographieLokalAccess().getMethode1ServiceMethodeCrossReference_1_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleChoreographieLokal1540); 

                	newLeafNode(otherlv_4, grammarAccess.getChoreographieLokalAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:761:1: ( (otherlv_5= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:762:1: (otherlv_5= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:762:1: (otherlv_5= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:763:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChoreographieLokalRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChoreographieLokal1560); 

            		newLeafNode(otherlv_5, grammarAccess.getChoreographieLokalAccess().getService2ServiceCrossReference_3_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleChoreographieLokal1572); 

                	newLeafNode(otherlv_6, grammarAccess.getChoreographieLokalAccess().getFullStopKeyword_4());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:778:1: ( (otherlv_7= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:779:1: (otherlv_7= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:779:1: (otherlv_7= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:780:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChoreographieLokalRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChoreographieLokal1592); 

            		newLeafNode(otherlv_7, grammarAccess.getChoreographieLokalAccess().getMethode2ServiceMethodeCrossReference_5_0()); 
            	

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleChoreographieLokal1604); 

                	newLeafNode(otherlv_8, grammarAccess.getChoreographieLokalAccess().getSemicolonKeyword_6());
                

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
    // $ANTLR end "ruleChoreographieLokal"


    // $ANTLR start "entryRuleBedingung"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:803:1: entryRuleBedingung returns [EObject current=null] : iv_ruleBedingung= ruleBedingung EOF ;
    public final EObject entryRuleBedingung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBedingung = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:804:2: (iv_ruleBedingung= ruleBedingung EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:805:2: iv_ruleBedingung= ruleBedingung EOF
            {
             newCompositeNode(grammarAccess.getBedingungRule()); 
            pushFollow(FOLLOW_ruleBedingung_in_entryRuleBedingung1640);
            iv_ruleBedingung=ruleBedingung();

            state._fsp--;

             current =iv_ruleBedingung; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBedingung1650); 

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
    // $ANTLR end "entryRuleBedingung"


    // $ANTLR start "ruleBedingung"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:812:1: ruleBedingung returns [EObject current=null] : ( (lv_bedingung_0_0= RULE_ID ) ) ;
    public final EObject ruleBedingung() throws RecognitionException {
        EObject current = null;

        Token lv_bedingung_0_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:815:28: ( ( (lv_bedingung_0_0= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:816:1: ( (lv_bedingung_0_0= RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:816:1: ( (lv_bedingung_0_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:817:1: (lv_bedingung_0_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:817:1: (lv_bedingung_0_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:818:3: lv_bedingung_0_0= RULE_ID
            {
            lv_bedingung_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBedingung1691); 

            			newLeafNode(lv_bedingung_0_0, grammarAccess.getBedingungAccess().getBedingungIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBedingungRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"bedingung",
                    		lv_bedingung_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleBedingung"


    // $ANTLR start "entryRuleEntityservice"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:842:1: entryRuleEntityservice returns [EObject current=null] : iv_ruleEntityservice= ruleEntityservice EOF ;
    public final EObject entryRuleEntityservice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityservice = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:843:2: (iv_ruleEntityservice= ruleEntityservice EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:844:2: iv_ruleEntityservice= ruleEntityservice EOF
            {
             newCompositeNode(grammarAccess.getEntityserviceRule()); 
            pushFollow(FOLLOW_ruleEntityservice_in_entryRuleEntityservice1731);
            iv_ruleEntityservice=ruleEntityservice();

            state._fsp--;

             current =iv_ruleEntityservice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityservice1741); 

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
    // $ANTLR end "entryRuleEntityservice"


    // $ANTLR start "ruleEntityservice"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:851:1: ruleEntityservice returns [EObject current=null] : (otherlv_0= 'Entityservice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interface_3_0= ruleInterface ) ) ( (lv_entities_4_0= ruleEntity ) )* otherlv_5= '}' ) ;
    public final EObject ruleEntityservice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_interface_3_0 = null;

        EObject lv_entities_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:854:28: ( (otherlv_0= 'Entityservice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interface_3_0= ruleInterface ) ) ( (lv_entities_4_0= ruleEntity ) )* otherlv_5= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:855:1: (otherlv_0= 'Entityservice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interface_3_0= ruleInterface ) ) ( (lv_entities_4_0= ruleEntity ) )* otherlv_5= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:855:1: (otherlv_0= 'Entityservice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interface_3_0= ruleInterface ) ) ( (lv_entities_4_0= ruleEntity ) )* otherlv_5= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:855:3: otherlv_0= 'Entityservice' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interface_3_0= ruleInterface ) ) ( (lv_entities_4_0= ruleEntity ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleEntityservice1778); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityserviceAccess().getEntityserviceKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:859:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:860:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:860:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:861:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityservice1795); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityserviceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityserviceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEntityservice1812); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityserviceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:881:1: ( (lv_interface_3_0= ruleInterface ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:882:1: (lv_interface_3_0= ruleInterface )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:882:1: (lv_interface_3_0= ruleInterface )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:883:3: lv_interface_3_0= ruleInterface
            {
             
            	        newCompositeNode(grammarAccess.getEntityserviceAccess().getInterfaceInterfaceParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleInterface_in_ruleEntityservice1833);
            lv_interface_3_0=ruleInterface();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityserviceRule());
            	        }
                   		set(
                   			current, 
                   			"interface",
                    		lv_interface_3_0, 
                    		"Interface");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:899:2: ( (lv_entities_4_0= ruleEntity ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:900:1: (lv_entities_4_0= ruleEntity )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:900:1: (lv_entities_4_0= ruleEntity )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:901:3: lv_entities_4_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityserviceAccess().getEntitiesEntityParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleEntityservice1854);
            	    lv_entities_4_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityserviceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_4_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleEntityservice1867); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityserviceAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEntityservice"


    // $ANTLR start "entryRuleEntity"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:929:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:930:2: (iv_ruleEntity= ruleEntity EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:931:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1903);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1913); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:938:1: ruleEntity returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'KOT' ( (otherlv_2= RULE_ID ) ) ( (lv_interface_3_0= ruleInterface ) )? ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_interface_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:941:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'KOT' ( (otherlv_2= RULE_ID ) ) ( (lv_interface_3_0= ruleInterface ) )? ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:942:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'KOT' ( (otherlv_2= RULE_ID ) ) ( (lv_interface_3_0= ruleInterface ) )? )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:942:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'KOT' ( (otherlv_2= RULE_ID ) ) ( (lv_interface_3_0= ruleInterface ) )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:942:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'KOT' ( (otherlv_2= RULE_ID ) ) ( (lv_interface_3_0= ruleInterface ) )?
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:942:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:943:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:943:1: (lv_name_0_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:944:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1955); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleEntity1972); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getKOTKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:964:1: ( (otherlv_2= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:965:1: (otherlv_2= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:965:1: (otherlv_2= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:966:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1992); 

            		newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getKomponentenObjekttypKOTCrossReference_2_0()); 
            	

            }


            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:977:2: ( (lv_interface_3_0= ruleInterface ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:978:1: (lv_interface_3_0= ruleInterface )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:978:1: (lv_interface_3_0= ruleInterface )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:979:3: lv_interface_3_0= ruleInterface
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getInterfaceInterfaceParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterface_in_ruleEntity2013);
                    lv_interface_3_0=ruleInterface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		set(
                           			current, 
                           			"interface",
                            		lv_interface_3_0, 
                            		"Interface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleVOS"
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1007:1: entryRuleVOS returns [EObject current=null] : iv_ruleVOS= ruleVOS EOF ;
    public final EObject entryRuleVOS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVOS = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1008:2: (iv_ruleVOS= ruleVOS EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1009:2: iv_ruleVOS= ruleVOS EOF
            {
             newCompositeNode(grammarAccess.getVOSRule()); 
            pushFollow(FOLLOW_ruleVOS_in_entryRuleVOS2054);
            iv_ruleVOS=ruleVOS();

            state._fsp--;

             current =iv_ruleVOS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVOS2064); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1016:1: ruleVOS returns [EObject current=null] : ( ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )+ otherlv_6= '}' ) ;
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1019:28: ( ( ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )+ otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1020:1: ( ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )+ otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1020:1: ( ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )+ otherlv_6= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1020:2: ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )+ otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1020:2: ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1020:3: ( (lv_name_0_0= 'VOS' ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1020:3: ( (lv_name_0_0= 'VOS' ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1021:1: (lv_name_0_0= 'VOS' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1021:1: (lv_name_0_0= 'VOS' )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1022:3: lv_name_0_0= 'VOS'
                    {
                    lv_name_0_0=(Token)match(input,28,FOLLOW_28_in_ruleVOS2108); 

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
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1036:6: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1036:6: ( (lv_name_1_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1037:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1037:1: (lv_name_1_0= RULE_ID )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1038:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVOS2144); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleVOS2162); 

                	newLeafNode(otherlv_2, grammarAccess.getVOSAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1058:1: ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=4;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1058:2: ( (lv_objekttypen_3_0= ruleVOT ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1058:2: ( (lv_objekttypen_3_0= ruleVOT ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1059:1: (lv_objekttypen_3_0= ruleVOT )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1059:1: (lv_objekttypen_3_0= ruleVOT )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1060:3: lv_objekttypen_3_0= ruleVOT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVOSAccess().getObjekttypenVOTParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVOT_in_ruleVOS2184);
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
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1077:6: ( (lv_beziehungen_4_0= ruleInteracts_with ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1077:6: ( (lv_beziehungen_4_0= ruleInteracts_with ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1078:1: (lv_beziehungen_4_0= ruleInteracts_with )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1078:1: (lv_beziehungen_4_0= ruleInteracts_with )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1079:3: lv_beziehungen_4_0= ruleInteracts_with
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVOSAccess().getBeziehungenInteracts_withParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInteracts_with_in_ruleVOS2211);
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
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1096:6: ( (lv_gliederung_5_0= ruleVOS ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1096:6: ( (lv_gliederung_5_0= ruleVOS ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1097:1: (lv_gliederung_5_0= ruleVOS )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1097:1: (lv_gliederung_5_0= ruleVOS )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1098:3: lv_gliederung_5_0= ruleVOS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVOSAccess().getGliederungVOSParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVOS_in_ruleVOS2238);
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleVOS2252); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1126:1: entryRuleKOS returns [EObject current=null] : iv_ruleKOS= ruleKOS EOF ;
    public final EObject entryRuleKOS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKOS = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1127:2: (iv_ruleKOS= ruleKOS EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1128:2: iv_ruleKOS= ruleKOS EOF
            {
             newCompositeNode(grammarAccess.getKOSRule()); 
            pushFollow(FOLLOW_ruleKOS_in_entryRuleKOS2288);
            iv_ruleKOS=ruleKOS();

            state._fsp--;

             current =iv_ruleKOS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKOS2298); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1135:1: ruleKOS returns [EObject current=null] : ( ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )+ otherlv_6= '}' ) ;
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1138:28: ( ( ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )+ otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1139:1: ( ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )+ otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1139:1: ( ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )+ otherlv_6= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1139:2: ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )+ otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1139:2: ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1139:3: ( (lv_name_0_0= 'KOS' ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1139:3: ( (lv_name_0_0= 'KOS' ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1140:1: (lv_name_0_0= 'KOS' )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1140:1: (lv_name_0_0= 'KOS' )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1141:3: lv_name_0_0= 'KOS'
                    {
                    lv_name_0_0=(Token)match(input,29,FOLLOW_29_in_ruleKOS2342); 

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
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1155:6: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1155:6: ( (lv_name_1_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1156:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1156:1: (lv_name_1_0= RULE_ID )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1157:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKOS2378); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleKOS2396); 

                	newLeafNode(otherlv_2, grammarAccess.getKOSAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1177:1: ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=4;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1177:2: ( (lv_objekttypen_3_0= ruleKOT ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1177:2: ( (lv_objekttypen_3_0= ruleKOT ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1178:1: (lv_objekttypen_3_0= ruleKOT )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1178:1: (lv_objekttypen_3_0= ruleKOT )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1179:3: lv_objekttypen_3_0= ruleKOT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKOSAccess().getObjekttypenKOTParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleKOT_in_ruleKOS2418);
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
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1196:6: ( (lv_beziehungen_4_0= ruleBeziehung ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1196:6: ( (lv_beziehungen_4_0= ruleBeziehung ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1197:1: (lv_beziehungen_4_0= ruleBeziehung )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1197:1: (lv_beziehungen_4_0= ruleBeziehung )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1198:3: lv_beziehungen_4_0= ruleBeziehung
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKOSAccess().getBeziehungenBeziehungParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBeziehung_in_ruleKOS2445);
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
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1215:6: ( (lv_gliederung_5_0= ruleKOS ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1215:6: ( (lv_gliederung_5_0= ruleKOS ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1216:1: (lv_gliederung_5_0= ruleKOS )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1216:1: (lv_gliederung_5_0= ruleKOS )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1217:3: lv_gliederung_5_0= ruleKOS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKOSAccess().getGliederungKOSParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleKOS_in_ruleKOS2472);
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleKOS2486); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1247:1: entryRuleVOT returns [EObject current=null] : iv_ruleVOT= ruleVOT EOF ;
    public final EObject entryRuleVOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVOT = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1248:2: (iv_ruleVOT= ruleVOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1249:2: iv_ruleVOT= ruleVOT EOF
            {
             newCompositeNode(grammarAccess.getVOTRule()); 
            pushFollow(FOLLOW_ruleVOT_in_entryRuleVOT2524);
            iv_ruleVOT=ruleVOT();

            state._fsp--;

             current =iv_ruleVOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVOT2534); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1256:1: ruleVOT returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'VOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) ;
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1259:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'VOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1260:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'VOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1260:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'VOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1260:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'VOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1260:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=43 && LA16_0<=46)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1261:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1261:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1262:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getVOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleVOT2580);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleVOT2593); 

                	newLeafNode(otherlv_1, grammarAccess.getVOTAccess().getVOTKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1282:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1283:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1283:1: (lv_name_2_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1284:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVOT2610); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleVOT2627); 

                	newLeafNode(otherlv_3, grammarAccess.getVOTAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1304:1: ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==RULE_ID||LA17_2==24) ) {
                        alt17=1;
                    }
                    else if ( (LA17_2==19) ) {
                        alt17=2;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1304:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1304:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1305:1: (lv_attribute_4_0= ruleAttribut )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1305:1: (lv_attribute_4_0= ruleAttribut )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1306:3: lv_attribute_4_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleVOT2649);
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
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1323:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1323:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1324:1: (lv_operatoren_5_0= ruleOperator )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1324:1: (lv_operatoren_5_0= ruleOperator )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1325:3: lv_operatoren_5_0= ruleOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperator_in_ruleVOT2676);
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
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleVOT2690); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1353:1: entryRuleKOT returns [EObject current=null] : iv_ruleKOT= ruleKOT EOF ;
    public final EObject entryRuleKOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKOT = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1354:2: (iv_ruleKOT= ruleKOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1355:2: iv_ruleKOT= ruleKOT EOF
            {
             newCompositeNode(grammarAccess.getKOTRule()); 
            pushFollow(FOLLOW_ruleKOT_in_entryRuleKOT2726);
            iv_ruleKOT=ruleKOT();

            state._fsp--;

             current =iv_ruleKOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKOT2736); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1362:1: ruleKOT returns [EObject current=null] : (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT ) ;
    public final EObject ruleKOT() throws RecognitionException {
        EObject current = null;

        EObject this_OOT_0 = null;

        EObject this_LOT_1 = null;

        EObject this_TOT_2 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1365:28: ( (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1366:1: (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1366:1: (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1367:5: this_OOT_0= ruleOOT
                    {
                     
                            newCompositeNode(grammarAccess.getKOTAccess().getOOTParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOOT_in_ruleKOT2783);
                    this_OOT_0=ruleOOT();

                    state._fsp--;

                     
                            current = this_OOT_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1377:5: this_LOT_1= ruleLOT
                    {
                     
                            newCompositeNode(grammarAccess.getKOTAccess().getLOTParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLOT_in_ruleKOT2810);
                    this_LOT_1=ruleLOT();

                    state._fsp--;

                     
                            current = this_LOT_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1387:5: this_TOT_2= ruleTOT
                    {
                     
                            newCompositeNode(grammarAccess.getKOTAccess().getTOTParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTOT_in_ruleKOT2837);
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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1403:1: entryRuleOOT returns [EObject current=null] : iv_ruleOOT= ruleOOT EOF ;
    public final EObject entryRuleOOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOOT = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1404:2: (iv_ruleOOT= ruleOOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1405:2: iv_ruleOOT= ruleOOT EOF
            {
             newCompositeNode(grammarAccess.getOOTRule()); 
            pushFollow(FOLLOW_ruleOOT_in_entryRuleOOT2872);
            iv_ruleOOT=ruleOOT();

            state._fsp--;

             current =iv_ruleOOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOOT2882); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1412:1: ruleOOT returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'OOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) ;
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1415:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'OOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1416:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'OOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1416:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'OOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1416:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'OOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1416:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=43 && LA19_0<=46)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1417:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1417:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1418:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getOOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleOOT2928);
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleOOT2941); 

                	newLeafNode(otherlv_1, grammarAccess.getOOTAccess().getOOTKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1438:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1439:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1439:1: (lv_name_2_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1440:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOOT2958); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleOOT2975); 

                	newLeafNode(otherlv_3, grammarAccess.getOOTAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1460:1: ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==RULE_ID||LA20_2==24) ) {
                        alt20=1;
                    }
                    else if ( (LA20_2==19) ) {
                        alt20=2;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1460:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1460:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1461:1: (lv_attribute_4_0= ruleAttribut )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1461:1: (lv_attribute_4_0= ruleAttribut )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1462:3: lv_attribute_4_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleOOT2997);
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
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1479:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1479:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1480:1: (lv_operatoren_5_0= ruleOperator )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1480:1: (lv_operatoren_5_0= ruleOperator )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1481:3: lv_operatoren_5_0= ruleOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperator_in_ruleOOT3024);
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
            	    break loop20;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleOOT3038); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1509:1: entryRuleLOT returns [EObject current=null] : iv_ruleLOT= ruleLOT EOF ;
    public final EObject entryRuleLOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLOT = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1510:2: (iv_ruleLOT= ruleLOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1511:2: iv_ruleLOT= ruleLOT EOF
            {
             newCompositeNode(grammarAccess.getLOTRule()); 
            pushFollow(FOLLOW_ruleLOT_in_entryRuleLOT3074);
            iv_ruleLOT=ruleLOT();

            state._fsp--;

             current =iv_ruleLOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOT3084); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1518:1: ruleLOT returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'LOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) ;
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1521:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'LOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1522:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'LOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1522:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'LOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1522:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'LOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1522:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=43 && LA21_0<=46)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1523:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1523:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1524:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getLOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleLOT3130);
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

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleLOT3143); 

                	newLeafNode(otherlv_1, grammarAccess.getLOTAccess().getLOTKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1544:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1545:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1545:1: (lv_name_2_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1546:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLOT3160); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleLOT3177); 

                	newLeafNode(otherlv_3, grammarAccess.getLOTAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1566:1: ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    int LA22_2 = input.LA(2);

                    if ( (LA22_2==RULE_ID||LA22_2==24) ) {
                        alt22=1;
                    }
                    else if ( (LA22_2==19) ) {
                        alt22=2;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1566:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1566:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1567:1: (lv_attribute_4_0= ruleAttribut )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1567:1: (lv_attribute_4_0= ruleAttribut )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1568:3: lv_attribute_4_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleLOT3199);
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
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1585:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1585:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1586:1: (lv_operatoren_5_0= ruleOperator )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1586:1: (lv_operatoren_5_0= ruleOperator )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1587:3: lv_operatoren_5_0= ruleOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperator_in_ruleLOT3226);
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
            	    break loop22;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleLOT3240); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1615:1: entryRuleTOT returns [EObject current=null] : iv_ruleTOT= ruleTOT EOF ;
    public final EObject entryRuleTOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTOT = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1616:2: (iv_ruleTOT= ruleTOT EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1617:2: iv_ruleTOT= ruleTOT EOF
            {
             newCompositeNode(grammarAccess.getTOTRule()); 
            pushFollow(FOLLOW_ruleTOT_in_entryRuleTOT3276);
            iv_ruleTOT=ruleTOT();

            state._fsp--;

             current =iv_ruleTOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTOT3286); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1624:1: ruleTOT returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'TOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) ;
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1627:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'TOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1628:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'TOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1628:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'TOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1628:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'TOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )* otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1628:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=43 && LA23_0<=46)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1629:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1629:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1630:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getTOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleTOT3332);
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

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleTOT3345); 

                	newLeafNode(otherlv_1, grammarAccess.getTOTAccess().getTOTKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1650:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1651:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1651:1: (lv_name_2_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1652:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTOT3362); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleTOT3379); 

                	newLeafNode(otherlv_3, grammarAccess.getTOTAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1672:1: ( ( (lv_attribute_4_0= ruleAttribut ) ) | ( (lv_operatoren_5_0= ruleOperator ) ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==19) ) {
                        alt24=2;
                    }
                    else if ( (LA24_2==RULE_ID||LA24_2==24) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1672:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1672:2: ( (lv_attribute_4_0= ruleAttribut ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1673:1: (lv_attribute_4_0= ruleAttribut )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1673:1: (lv_attribute_4_0= ruleAttribut )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1674:3: lv_attribute_4_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTOTAccess().getAttributeAttributParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleTOT3401);
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
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1691:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1691:6: ( (lv_operatoren_5_0= ruleOperator ) )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1692:1: (lv_operatoren_5_0= ruleOperator )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1692:1: (lv_operatoren_5_0= ruleOperator )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1693:3: lv_operatoren_5_0= ruleOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTOTAccess().getOperatorenOperatorParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperator_in_ruleTOT3428);
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
            	    break loop24;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleTOT3442); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1721:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1722:2: (iv_ruleAttribut= ruleAttribut EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1723:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_ruleAttribut_in_entryRuleAttribut3478);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribut3488); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1730:1: ruleAttribut returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1733:28: ( ( ( (otherlv_0= RULE_ID ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1734:1: ( ( (otherlv_0= RULE_ID ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1734:1: ( ( (otherlv_0= RULE_ID ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1734:2: ( (otherlv_0= RULE_ID ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1734:2: ( (otherlv_0= RULE_ID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==RULE_ID) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1735:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1735:1: (otherlv_0= RULE_ID )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1736:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribut3533); 

                    		newLeafNode(otherlv_0, grammarAccess.getAttributAccess().getTypObjekttypCrossReference_0_0()); 
                    	

                    }


                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1747:3: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1748:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1748:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1749:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribut3551); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAttribut3568); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1777:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1778:2: (iv_ruleOperator= ruleOperator EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1779:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator3604);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator3614); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1786:1: ruleOperator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1789:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' otherlv_4= ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1790:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' otherlv_4= ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1790:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' otherlv_4= ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1790:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ')' otherlv_4= ';'
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1790:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1791:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1791:1: (lv_name_0_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1792:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperator3656); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleOperator3673); 

                	newLeafNode(otherlv_1, grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1812:1: ( (otherlv_2= RULE_ID ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1813:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1813:1: (otherlv_2= RULE_ID )
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1814:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperatorRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperator3693); 

            	    		newLeafNode(otherlv_2, grammarAccess.getOperatorAccess().getParameterObjekttypCrossReference_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleOperator3706); 

                	newLeafNode(otherlv_3, grammarAccess.getOperatorAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleOperator3718); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1841:1: entryRuleBeziehung returns [EObject current=null] : iv_ruleBeziehung= ruleBeziehung EOF ;
    public final EObject entryRuleBeziehung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeziehung = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1842:2: (iv_ruleBeziehung= ruleBeziehung EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1843:2: iv_ruleBeziehung= ruleBeziehung EOF
            {
             newCompositeNode(grammarAccess.getBeziehungRule()); 
            pushFollow(FOLLOW_ruleBeziehung_in_entryRuleBeziehung3754);
            iv_ruleBeziehung=ruleBeziehung();

            state._fsp--;

             current =iv_ruleBeziehung; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeziehung3764); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1850:1: ruleBeziehung returns [EObject current=null] : (this_Interacts_with_0= ruleInteracts_with | this_Is_a_1= ruleIs_a | this_Is_part_of_2= ruleIs_part_of ) ;
    public final EObject ruleBeziehung() throws RecognitionException {
        EObject current = null;

        EObject this_Interacts_with_0 = null;

        EObject this_Is_a_1 = null;

        EObject this_Is_part_of_2 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1853:28: ( (this_Interacts_with_0= ruleInteracts_with | this_Is_a_1= ruleIs_a | this_Is_part_of_2= ruleIs_part_of ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1854:1: (this_Interacts_with_0= ruleInteracts_with | this_Is_a_1= ruleIs_a | this_Is_part_of_2= ruleIs_part_of )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1854:1: (this_Interacts_with_0= ruleInteracts_with | this_Is_a_1= ruleIs_a | this_Is_part_of_2= ruleIs_part_of )
            int alt27=3;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1855:5: this_Interacts_with_0= ruleInteracts_with
                    {
                     
                            newCompositeNode(grammarAccess.getBeziehungAccess().getInteracts_withParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInteracts_with_in_ruleBeziehung3811);
                    this_Interacts_with_0=ruleInteracts_with();

                    state._fsp--;

                     
                            current = this_Interacts_with_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1865:5: this_Is_a_1= ruleIs_a
                    {
                     
                            newCompositeNode(grammarAccess.getBeziehungAccess().getIs_aParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIs_a_in_ruleBeziehung3838);
                    this_Is_a_1=ruleIs_a();

                    state._fsp--;

                     
                            current = this_Is_a_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1875:5: this_Is_part_of_2= ruleIs_part_of
                    {
                     
                            newCompositeNode(grammarAccess.getBeziehungAccess().getIs_part_ofParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIs_part_of_in_ruleBeziehung3865);
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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1891:1: entryRuleInteracts_with returns [EObject current=null] : iv_ruleInteracts_with= ruleInteracts_with EOF ;
    public final EObject entryRuleInteracts_with() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteracts_with = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1892:2: (iv_ruleInteracts_with= ruleInteracts_with EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1893:2: iv_ruleInteracts_with= ruleInteracts_with EOF
            {
             newCompositeNode(grammarAccess.getInteracts_withRule()); 
            pushFollow(FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with3900);
            iv_ruleInteracts_with=ruleInteracts_with();

            state._fsp--;

             current =iv_ruleInteracts_with; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteracts_with3910); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1900:1: ruleInteracts_with returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? (otherlv_1= 'interacts_with:' )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1903:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? (otherlv_1= 'interacts_with:' )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1904:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? (otherlv_1= 'interacts_with:' )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1904:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? (otherlv_1= 'interacts_with:' )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1904:2: ( (lv_annotation_0_0= ruleAnnotation ) )? (otherlv_1= 'interacts_with:' )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1904:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=43 && LA28_0<=46)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1905:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1905:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1906:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteracts_withAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleInteracts_with3956);
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

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1922:3: (otherlv_1= 'interacts_with:' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1922:5: otherlv_1= 'interacts_with:'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleInteracts_with3970); 

                        	newLeafNode(otherlv_1, grammarAccess.getInteracts_withAccess().getInteracts_withKeyword_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1926:3: ( (otherlv_2= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1927:1: (otherlv_2= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1927:1: (otherlv_2= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1928:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInteracts_withRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteracts_with3992); 

            		newLeafNode(otherlv_2, grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            	

            }


            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1939:2: ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1940:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1940:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1941:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1941:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 36:
            case 37:
                {
                alt30=1;
                }
                break;
            case 23:
            case 38:
                {
                alt30=2;
                }
                break;
            case 41:
            case 42:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1942:3: lv_kardinalitaet_3_1= ruleKardinalitaet01
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_ruleInteracts_with4015);
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
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1957:8: lv_kardinalitaet_3_2= ruleKardinalitaet0x
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_ruleInteracts_with4034);
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
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1972:8: lv_kardinalitaet_3_3= ruleKardinalitaet1x
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet1xParserRuleCall_3_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_ruleInteracts_with4053);
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

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1990:2: ( (otherlv_4= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1991:1: (otherlv_4= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1991:1: (otherlv_4= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1992:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInteracts_withRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteracts_with4076); 

            		newLeafNode(otherlv_4, grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleInteracts_with4088); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2015:1: entryRuleIs_a returns [EObject current=null] : iv_ruleIs_a= ruleIs_a EOF ;
    public final EObject entryRuleIs_a() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIs_a = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2016:2: (iv_ruleIs_a= ruleIs_a EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2017:2: iv_ruleIs_a= ruleIs_a EOF
            {
             newCompositeNode(grammarAccess.getIs_aRule()); 
            pushFollow(FOLLOW_ruleIs_a_in_entryRuleIs_a4124);
            iv_ruleIs_a=ruleIs_a();

            state._fsp--;

             current =iv_ruleIs_a; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_a4134); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2024:1: ruleIs_a returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_a:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2027:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_a:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2028:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_a:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2028:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_a:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2028:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_a:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2028:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=43 && LA31_0<=46)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2029:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2029:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2030:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_aAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleIs_a4180);
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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleIs_a4193); 

                	newLeafNode(otherlv_1, grammarAccess.getIs_aAccess().getIs_aKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2050:1: ( (otherlv_2= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2051:1: (otherlv_2= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2051:1: (otherlv_2= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2052:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_aRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_a4213); 

            		newLeafNode(otherlv_2, grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            	

            }


            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2063:2: ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2064:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2064:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2065:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2065:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=36 && LA32_0<=37)) ) {
                alt32=1;
            }
            else if ( ((LA32_0>=39 && LA32_0<=40)) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2066:3: lv_kardinalitaet_3_1= ruleKardinalitaet01
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_ruleIs_a4236);
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
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2081:8: lv_kardinalitaet_3_2= ruleKardinalitaet11
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet11ParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet11_in_ruleIs_a4255);
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

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2099:2: ( (otherlv_4= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2100:1: (otherlv_4= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2100:1: (otherlv_4= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2101:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_aRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_a4278); 

            		newLeafNode(otherlv_4, grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleIs_a4290); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2124:1: entryRuleIs_part_of returns [EObject current=null] : iv_ruleIs_part_of= ruleIs_part_of EOF ;
    public final EObject entryRuleIs_part_of() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIs_part_of = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2125:2: (iv_ruleIs_part_of= ruleIs_part_of EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2126:2: iv_ruleIs_part_of= ruleIs_part_of EOF
            {
             newCompositeNode(grammarAccess.getIs_part_ofRule()); 
            pushFollow(FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of4326);
            iv_ruleIs_part_of=ruleIs_part_of();

            state._fsp--;

             current =iv_ruleIs_part_of; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_part_of4336); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2133:1: ruleIs_part_of returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_part_of:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2136:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_part_of:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2137:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_part_of:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2137:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_part_of:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2137:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_part_of:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2137:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=43 && LA33_0<=46)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2138:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2138:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2139:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleIs_part_of4382);
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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleIs_part_of4395); 

                	newLeafNode(otherlv_1, grammarAccess.getIs_part_ofAccess().getIs_part_ofKeyword_1());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2159:1: ( (otherlv_2= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2160:1: (otherlv_2= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2160:1: (otherlv_2= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2161:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_part_ofRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_part_of4415); 

            		newLeafNode(otherlv_2, grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            	

            }


            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2172:2: ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2173:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2173:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2174:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2174:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 36:
            case 37:
                {
                alt34=1;
                }
                break;
            case 23:
            case 38:
                {
                alt34=2;
                }
                break;
            case 41:
            case 42:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2175:3: lv_kardinalitaet_3_1= ruleKardinalitaet01
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_ruleIs_part_of4438);
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
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2190:8: lv_kardinalitaet_3_2= ruleKardinalitaet0x
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_ruleIs_part_of4457);
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
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2205:8: lv_kardinalitaet_3_3= ruleKardinalitaet1x
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet1xParserRuleCall_3_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_ruleIs_part_of4476);
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

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2223:2: ( (otherlv_4= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2224:1: (otherlv_4= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2224:1: (otherlv_4= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2225:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_part_ofRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_part_of4499); 

            		newLeafNode(otherlv_4, grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleIs_part_of4511); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2250:1: entryRuleKardinalitaet01 returns [EObject current=null] : iv_ruleKardinalitaet01= ruleKardinalitaet01 EOF ;
    public final EObject entryRuleKardinalitaet01() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet01 = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2251:2: (iv_ruleKardinalitaet01= ruleKardinalitaet01 EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2252:2: iv_ruleKardinalitaet01= ruleKardinalitaet01 EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet01Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet014549);
            iv_ruleKardinalitaet01=ruleKardinalitaet01();

            state._fsp--;

             current =iv_ruleKardinalitaet01; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet014559); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2259:1: ruleKardinalitaet01 returns [EObject current=null] : ( (otherlv_0= '--' | otherlv_1= '(0,1)' ) () ) ;
    public final EObject ruleKardinalitaet01() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2262:28: ( ( (otherlv_0= '--' | otherlv_1= '(0,1)' ) () ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2263:1: ( (otherlv_0= '--' | otherlv_1= '(0,1)' ) () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2263:1: ( (otherlv_0= '--' | otherlv_1= '(0,1)' ) () )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2263:2: (otherlv_0= '--' | otherlv_1= '(0,1)' ) ()
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2263:2: (otherlv_0= '--' | otherlv_1= '(0,1)' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            else if ( (LA35_0==37) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2263:4: otherlv_0= '--'
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleKardinalitaet014597); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet01Access().getHyphenMinusHyphenMinusKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2268:7: otherlv_1= '(0,1)'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleKardinalitaet014615); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet01Access().getLeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2272:2: ()
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2273:5: 
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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2286:1: entryRuleKardinalitaet0x returns [EObject current=null] : iv_ruleKardinalitaet0x= ruleKardinalitaet0x EOF ;
    public final EObject entryRuleKardinalitaet0x() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet0x = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2287:2: (iv_ruleKardinalitaet0x= ruleKardinalitaet0x EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2288:2: iv_ruleKardinalitaet0x= ruleKardinalitaet0x EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet0xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x4661);
            iv_ruleKardinalitaet0x=ruleKardinalitaet0x();

            state._fsp--;

             current =iv_ruleKardinalitaet0x; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet0x4671); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2295:1: ruleKardinalitaet0x returns [EObject current=null] : ( (otherlv_0= '->' | otherlv_1= '(0,*)' ) () ) ;
    public final EObject ruleKardinalitaet0x() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2298:28: ( ( (otherlv_0= '->' | otherlv_1= '(0,*)' ) () ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2299:1: ( (otherlv_0= '->' | otherlv_1= '(0,*)' ) () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2299:1: ( (otherlv_0= '->' | otherlv_1= '(0,*)' ) () )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2299:2: (otherlv_0= '->' | otherlv_1= '(0,*)' ) ()
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2299:2: (otherlv_0= '->' | otherlv_1= '(0,*)' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            else if ( (LA36_0==38) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2299:4: otherlv_0= '->'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleKardinalitaet0x4709); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet0xAccess().getHyphenMinusGreaterThanSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2304:7: otherlv_1= '(0,*)'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleKardinalitaet0x4727); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet0xAccess().getLeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2308:2: ()
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2309:5: 
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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2322:1: entryRuleKardinalitaet11 returns [EObject current=null] : iv_ruleKardinalitaet11= ruleKardinalitaet11 EOF ;
    public final EObject entryRuleKardinalitaet11() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet11 = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2323:2: (iv_ruleKardinalitaet11= ruleKardinalitaet11 EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2324:2: iv_ruleKardinalitaet11= ruleKardinalitaet11 EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet11Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet114773);
            iv_ruleKardinalitaet11=ruleKardinalitaet11();

            state._fsp--;

             current =iv_ruleKardinalitaet11; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet114783); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2331:1: ruleKardinalitaet11 returns [EObject current=null] : ( (otherlv_0= '==' | otherlv_1= '(1,1)' ) () ) ;
    public final EObject ruleKardinalitaet11() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2334:28: ( ( (otherlv_0= '==' | otherlv_1= '(1,1)' ) () ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2335:1: ( (otherlv_0= '==' | otherlv_1= '(1,1)' ) () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2335:1: ( (otherlv_0= '==' | otherlv_1= '(1,1)' ) () )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2335:2: (otherlv_0= '==' | otherlv_1= '(1,1)' ) ()
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2335:2: (otherlv_0= '==' | otherlv_1= '(1,1)' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            else if ( (LA37_0==40) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2335:4: otherlv_0= '=='
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleKardinalitaet114821); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet11Access().getEqualsSignEqualsSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2340:7: otherlv_1= '(1,1)'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleKardinalitaet114839); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet11Access().getLeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2344:2: ()
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2345:5: 
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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2358:1: entryRuleKardinalitaet1x returns [EObject current=null] : iv_ruleKardinalitaet1x= ruleKardinalitaet1x EOF ;
    public final EObject entryRuleKardinalitaet1x() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet1x = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2359:2: (iv_ruleKardinalitaet1x= ruleKardinalitaet1x EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2360:2: iv_ruleKardinalitaet1x= ruleKardinalitaet1x EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet1xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x4885);
            iv_ruleKardinalitaet1x=ruleKardinalitaet1x();

            state._fsp--;

             current =iv_ruleKardinalitaet1x; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet1x4895); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2367:1: ruleKardinalitaet1x returns [EObject current=null] : ( (otherlv_0= '=>' | otherlv_1= '(1,*)' ) () ) ;
    public final EObject ruleKardinalitaet1x() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2370:28: ( ( (otherlv_0= '=>' | otherlv_1= '(1,*)' ) () ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2371:1: ( (otherlv_0= '=>' | otherlv_1= '(1,*)' ) () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2371:1: ( (otherlv_0= '=>' | otherlv_1= '(1,*)' ) () )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2371:2: (otherlv_0= '=>' | otherlv_1= '(1,*)' ) ()
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2371:2: (otherlv_0= '=>' | otherlv_1= '(1,*)' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            else if ( (LA38_0==42) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2371:4: otherlv_0= '=>'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleKardinalitaet1x4933); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet1xAccess().getEqualsSignGreaterThanSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2376:7: otherlv_1= '(1,*)'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleKardinalitaet1x4951); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet1xAccess().getLeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2380:2: ()
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2381:5: 
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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2394:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2395:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2396:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation4997);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation5007); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2403:1: ruleAnnotation returns [EObject current=null] : (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge | this_Version_3= ruleVersion ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject this_Ignore_1 = null;

        EObject this_Merge_2 = null;

        EObject this_Version_3 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2406:28: ( (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge | this_Version_3= ruleVersion ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2407:1: (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge | this_Version_3= ruleVersion )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2407:1: (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge | this_Version_3= ruleVersion )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt39=1;
                }
                break;
            case 45:
                {
                alt39=2;
                }
                break;
            case 44:
                {
                alt39=3;
                }
                break;
            case 46:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2408:5: this_Name_0= ruleName
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getNameParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleName_in_ruleAnnotation5054);
                    this_Name_0=ruleName();

                    state._fsp--;

                     
                            current = this_Name_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2418:5: this_Ignore_1= ruleIgnore
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getIgnoreParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIgnore_in_ruleAnnotation5081);
                    this_Ignore_1=ruleIgnore();

                    state._fsp--;

                     
                            current = this_Ignore_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2428:5: this_Merge_2= ruleMerge
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getMergeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMerge_in_ruleAnnotation5108);
                    this_Merge_2=ruleMerge();

                    state._fsp--;

                     
                            current = this_Merge_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2438:5: this_Version_3= ruleVersion
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getVersionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleVersion_in_ruleAnnotation5135);
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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2454:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2455:2: (iv_ruleName= ruleName EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2456:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName5170);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName5180); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2463:1: ruleName returns [EObject current=null] : (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2466:28: ( (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2467:1: (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2467:1: (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2467:3: otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleName5217); 

                	newLeafNode(otherlv_0, grammarAccess.getNameAccess().getNameKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2471:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2472:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2472:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2473:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName5234); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2497:1: entryRuleMerge returns [EObject current=null] : iv_ruleMerge= ruleMerge EOF ;
    public final EObject entryRuleMerge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMerge = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2498:2: (iv_ruleMerge= ruleMerge EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2499:2: iv_ruleMerge= ruleMerge EOF
            {
             newCompositeNode(grammarAccess.getMergeRule()); 
            pushFollow(FOLLOW_ruleMerge_in_entryRuleMerge5275);
            iv_ruleMerge=ruleMerge();

            state._fsp--;

             current =iv_ruleMerge; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMerge5285); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2506:1: ruleMerge returns [EObject current=null] : (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMerge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2509:28: ( (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2510:1: (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2510:1: (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2510:3: otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleMerge5322); 

                	newLeafNode(otherlv_0, grammarAccess.getMergeAccess().getMergeKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2514:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2515:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2515:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2516:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMerge5339); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2540:1: entryRuleIgnore returns [EObject current=null] : iv_ruleIgnore= ruleIgnore EOF ;
    public final EObject entryRuleIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnore = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2541:2: (iv_ruleIgnore= ruleIgnore EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2542:2: iv_ruleIgnore= ruleIgnore EOF
            {
             newCompositeNode(grammarAccess.getIgnoreRule()); 
            pushFollow(FOLLOW_ruleIgnore_in_entryRuleIgnore5380);
            iv_ruleIgnore=ruleIgnore();

            state._fsp--;

             current =iv_ruleIgnore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIgnore5390); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2549:1: ruleIgnore returns [EObject current=null] : (otherlv_0= '@ignore' () ) ;
    public final EObject ruleIgnore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2552:28: ( (otherlv_0= '@ignore' () ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2553:1: (otherlv_0= '@ignore' () )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2553:1: (otherlv_0= '@ignore' () )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2553:3: otherlv_0= '@ignore' ()
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleIgnore5427); 

                	newLeafNode(otherlv_0, grammarAccess.getIgnoreAccess().getIgnoreKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2557:1: ()
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2558:5: 
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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2571:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2572:2: (iv_ruleVersion= ruleVersion EOF )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2573:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion5472);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion5482); 

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
    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2580:1: ruleVersion returns [EObject current=null] : (otherlv_0= '@version' ( (lv_version_1_0= RULE_VERSION_NUMBER ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_version_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2583:28: ( (otherlv_0= '@version' ( (lv_version_1_0= RULE_VERSION_NUMBER ) ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2584:1: (otherlv_0= '@version' ( (lv_version_1_0= RULE_VERSION_NUMBER ) ) )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2584:1: (otherlv_0= '@version' ( (lv_version_1_0= RULE_VERSION_NUMBER ) ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2584:3: otherlv_0= '@version' ( (lv_version_1_0= RULE_VERSION_NUMBER ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleVersion5519); 

                	newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getVersionKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2588:1: ( (lv_version_1_0= RULE_VERSION_NUMBER ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2589:1: (lv_version_1_0= RULE_VERSION_NUMBER )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2589:1: (lv_version_1_0= RULE_VERSION_NUMBER )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2590:3: lv_version_1_0= RULE_VERSION_NUMBER
            {
            lv_version_1_0=(Token)match(input,RULE_VERSION_NUMBER,FOLLOW_RULE_VERSION_NUMBER_in_ruleVersion5536); 

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


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\4\1\uffff\1\4\1\27\1\26\2\4\1\30\2\uffff";
    static final String DFA7_maxS =
        "\1\23\1\uffff\1\4\1\27\1\26\2\4\1\31\2\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\3\6\uffff\1\2\1\1";
    static final String DFA7_specialS =
        "\12\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\3\13\uffff\1\1\2\uffff\1\2",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\3",
            "\1\11\1\10",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()+ loopback of 575:1: ( ( (lv_orchestrierung_2_0= ruleOrchestrierung ) ) | ( (lv_choreographie_3_0= ruleChoreographieLokal ) ) )+";
        }
    }
    static final String DFA13_eotS =
        "\15\uffff";
    static final String DFA13_eofS =
        "\15\uffff";
    static final String DFA13_minS =
        "\1\4\1\uffff\3\4\1\5\2\uffff\1\17\1\uffff\3\4";
    static final String DFA13_maxS =
        "\1\56\1\uffff\1\4\1\41\1\4\1\5\2\uffff\1\52\1\uffff\3\41";
    static final String DFA13_acceptS =
        "\1\uffff\1\4\4\uffff\1\1\1\2\1\uffff\1\3\3\uffff";
    static final String DFA13_specialS =
        "\15\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\10\13\uffff\1\1\1\6\12\uffff\1\11\4\uffff\1\7\11\uffff\1"+
            "\2\1\4\1\3\1\5",
            "",
            "\1\12",
            "\1\7\14\uffff\1\6\17\uffff\1\7",
            "\1\13",
            "\1\14",
            "",
            "",
            "\1\11\7\uffff\1\7\14\uffff\3\7\2\uffff\2\7",
            "",
            "\1\7\14\uffff\1\6\17\uffff\1\7",
            "\1\7\14\uffff\1\6\17\uffff\1\7",
            "\1\7\14\uffff\1\6\17\uffff\1\7"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1058:1: ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )+";
        }
    }
    static final String DFA15_eotS =
        "\15\uffff";
    static final String DFA15_eofS =
        "\15\uffff";
    static final String DFA15_minS =
        "\1\4\1\uffff\3\4\1\5\2\uffff\1\17\1\uffff\3\4";
    static final String DFA15_maxS =
        "\1\56\1\uffff\1\4\1\43\1\4\1\5\2\uffff\1\52\1\uffff\3\43";
    static final String DFA15_acceptS =
        "\1\uffff\1\4\4\uffff\1\1\1\2\1\uffff\1\3\3\uffff";
    static final String DFA15_specialS =
        "\15\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\10\13\uffff\1\1\14\uffff\1\11\3\6\3\7\7\uffff\1\2\1\4\1"+
            "\3\1\5",
            "",
            "\1\12",
            "\1\7\31\uffff\3\6\3\7",
            "\1\13",
            "\1\14",
            "",
            "",
            "\1\11\7\uffff\1\7\14\uffff\3\7\2\uffff\2\7",
            "",
            "\1\7\31\uffff\3\6\3\7",
            "\1\7\31\uffff\3\6\3\7",
            "\1\7\31\uffff\3\6\3\7"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1177:1: ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )+";
        }
    }
    static final String DFA18_eotS =
        "\13\uffff";
    static final String DFA18_eofS =
        "\13\uffff";
    static final String DFA18_minS =
        "\1\36\1\4\1\36\1\4\1\5\3\uffff\3\36";
    static final String DFA18_maxS =
        "\1\56\1\4\1\40\1\4\1\5\3\uffff\3\40";
    static final String DFA18_acceptS =
        "\5\uffff\1\1\1\2\1\3\3\uffff";
    static final String DFA18_specialS =
        "\13\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\5\1\6\1\7\12\uffff\1\1\1\3\1\2\1\4",
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
            return "1366:1: (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT )";
        }
    }
    static final String DFA27_eotS =
        "\13\uffff";
    static final String DFA27_eofS =
        "\13\uffff";
    static final String DFA27_minS =
        "\4\4\1\5\3\uffff\3\4";
    static final String DFA27_maxS =
        "\1\56\1\4\1\43\1\4\1\5\3\uffff\3\43";
    static final String DFA27_acceptS =
        "\5\uffff\1\1\1\2\1\3\3\uffff";
    static final String DFA27_specialS =
        "\13\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\5\34\uffff\1\5\1\6\1\7\7\uffff\1\1\1\3\1\2\1\4",
            "\1\10",
            "\1\5\34\uffff\1\5\1\6\1\7",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "\1\5\34\uffff\1\5\1\6\1\7",
            "\1\5\34\uffff\1\5\1\6\1\7",
            "\1\5\34\uffff\1\5\1\6\1\7"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1854:1: (this_Interacts_with_0= ruleInteracts_with | this_Is_a_1= ruleIs_a | this_Is_part_of_2= ruleIs_part_of )";
        }
    }
 

    public static final BitSet FOLLOW_ruleSOA_AwS_in_entryRuleSOA_AwS75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSOA_AwS85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSOA_AwS122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSOA_AwS139 = new BitSet(new long[]{0x0000000030002010L});
    public static final BitSet FOLLOW_13_in_ruleSOA_AwS157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_VERSION_NUMBER_in_ruleSOA_AwS174 = new BitSet(new long[]{0x0000000030002010L});
    public static final BitSet FOLLOW_ruleVOS_in_ruleSOA_AwS247 = new BitSet(new long[]{0x0000000034006012L});
    public static final BitSet FOLLOW_ruleKOS_in_ruleSOA_AwS322 = new BitSet(new long[]{0x0000000034006012L});
    public static final BitSet FOLLOW_ruleVorgangsservice_in_ruleSOA_AwS390 = new BitSet(new long[]{0x0000000004004002L});
    public static final BitSet FOLLOW_ruleEntityservice_in_ruleSOA_AwS417 = new BitSet(new long[]{0x0000000004004002L});
    public static final BitSet FOLLOW_ruleVorgangsservice_in_entryRuleVorgangsservice457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVorgangsservice467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleVorgangsservice504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVorgangsservice521 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVorgangsservice538 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleVorgangsservice559 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleVorgangsserviceElementar_in_ruleVorgangsservice580 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleWorkflow_in_ruleVorgangsservice602 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVorgangsservice614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVorgangsserviceElementar_in_entryRuleVorgangsserviceElementar650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVorgangsserviceElementar660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVorgangsserviceElementar702 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVorgangsserviceElementar719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVorgangsserviceElementar739 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleVorgangsserviceElementar760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleInterface849 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInterface874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleServiceMethode_in_ruleInterface895 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleInterface908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethode_in_entryRuleServiceMethode944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceMethode954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceMethode996 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleServiceMethode1013 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceMethode1030 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleServiceMethode1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflow_in_entryRuleWorkflow1084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflow1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleWorkflow1131 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWorkflow1143 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleOrchestrierung_in_ruleWorkflow1165 = new BitSet(new long[]{0x0000000000090010L});
    public static final BitSet FOLLOW_ruleChoreographieLokal_in_ruleWorkflow1192 = new BitSet(new long[]{0x0000000000090010L});
    public static final BitSet FOLLOW_16_in_ruleWorkflow1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrchestrierung_in_entryRuleOrchestrierung1242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrchestrierung1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOrchestrierung1290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBedingung_in_ruleOrchestrierung1311 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOrchestrierung1323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrchestrierung1345 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOrchestrierung1357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrchestrierung1377 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOrchestrierung1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoreographieLokal_in_entryRuleChoreographieLokal1425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoreographieLokal1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleChoreographieLokal1473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBedingung_in_ruleChoreographieLokal1494 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleChoreographieLokal1506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChoreographieLokal1528 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleChoreographieLokal1540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChoreographieLokal1560 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleChoreographieLokal1572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChoreographieLokal1592 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleChoreographieLokal1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBedingung_in_entryRuleBedingung1640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBedingung1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBedingung1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityservice_in_entryRuleEntityservice1731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityservice1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEntityservice1778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityservice1795 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntityservice1812 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleEntityservice1833 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleEntityservice1854 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleEntityservice1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1955 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEntity1972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1992 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleEntity2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOS_in_entryRuleVOS2054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVOS2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleVOS2108 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVOS2144 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVOS2162 = new BitSet(new long[]{0x0000780210020010L});
    public static final BitSet FOLLOW_ruleVOT_in_ruleVOS2184 = new BitSet(new long[]{0x0000780210030010L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_ruleVOS2211 = new BitSet(new long[]{0x0000780210030010L});
    public static final BitSet FOLLOW_ruleVOS_in_ruleVOS2238 = new BitSet(new long[]{0x0000780210030010L});
    public static final BitSet FOLLOW_16_in_ruleVOS2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOS_in_entryRuleKOS2288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKOS2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleKOS2342 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKOS2378 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleKOS2396 = new BitSet(new long[]{0x0000780FF0002010L});
    public static final BitSet FOLLOW_ruleKOT_in_ruleKOS2418 = new BitSet(new long[]{0x0000780FF0012010L});
    public static final BitSet FOLLOW_ruleBeziehung_in_ruleKOS2445 = new BitSet(new long[]{0x0000780FF0012010L});
    public static final BitSet FOLLOW_ruleKOS_in_ruleKOS2472 = new BitSet(new long[]{0x0000780FF0012010L});
    public static final BitSet FOLLOW_16_in_ruleKOS2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOT_in_entryRuleVOT2524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVOT2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleVOT2580 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVOT2593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVOT2610 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVOT2627 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleVOT2649 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleVOT2676 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleVOT2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOT_in_entryRuleKOT2726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKOT2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_ruleKOT2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_ruleKOT2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_ruleKOT2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_entryRuleOOT2872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOOT2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleOOT2928 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleOOT2941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOOT2958 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOOT2975 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleOOT2997 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleOOT3024 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleOOT3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_entryRuleLOT3074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOT3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleLOT3130 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLOT3143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLOT3160 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLOT3177 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleLOT3199 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleLOT3226 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleLOT3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_entryRuleTOT3276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTOT3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTOT3332 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleTOT3345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTOT3362 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTOT3379 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleTOT3401 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleTOT3428 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleTOT3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_entryRuleAttribut3478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribut3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribut3533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribut3551 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAttribut3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator3604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperator3656 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOperator3673 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperator3693 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleOperator3706 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOperator3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeziehung_in_entryRuleBeziehung3754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeziehung3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_ruleBeziehung3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_a_in_ruleBeziehung3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_ruleBeziehung3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with3900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteracts_with3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleInteracts_with3956 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_ruleInteracts_with3970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteracts_with3992 = new BitSet(new long[]{0x0000067000800000L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_ruleInteracts_with4015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_ruleInteracts_with4034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_ruleInteracts_with4053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteracts_with4076 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInteracts_with4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_a_in_entryRuleIs_a4124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_a4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleIs_a4180 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleIs_a4193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_a4213 = new BitSet(new long[]{0x000001B000000000L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_ruleIs_a4236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_ruleIs_a4255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_a4278 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIs_a4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of4326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_part_of4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleIs_part_of4382 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleIs_part_of4395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_part_of4415 = new BitSet(new long[]{0x0000067000800000L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_ruleIs_part_of4438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_ruleIs_part_of4457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_ruleIs_part_of4476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_part_of4499 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIs_part_of4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet014549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet014559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleKardinalitaet014597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleKardinalitaet014615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x4661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet0x4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleKardinalitaet0x4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleKardinalitaet0x4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet114773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet114783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleKardinalitaet114821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleKardinalitaet114839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x4885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet1x4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleKardinalitaet1x4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleKardinalitaet1x4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleAnnotation5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_ruleAnnotation5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_ruleAnnotation5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleAnnotation5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName5170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleName5217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_entryRuleMerge5275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMerge5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMerge5322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMerge5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_entryRuleIgnore5380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIgnore5390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleIgnore5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion5472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVersion5519 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_VERSION_NUMBER_in_ruleVersion5536 = new BitSet(new long[]{0x0000000000000002L});

}
