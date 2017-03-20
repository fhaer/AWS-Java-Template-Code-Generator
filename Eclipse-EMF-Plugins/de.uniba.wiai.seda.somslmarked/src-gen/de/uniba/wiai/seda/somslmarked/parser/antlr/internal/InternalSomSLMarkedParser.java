package de.uniba.wiai.seda.somslmarked.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uniba.wiai.seda.somslmarked.services.SomSLMarkedGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSomSLMarkedParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VERSION", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AwS:'", "'v'", "'KOS'", "'{'", "'}'", "'VOS'", "'DT'", "';'", "'('", "') {'", "'.'", "'VOT'", "'OOT'", "'LOT'", "'TOT'", "'interacts_with:'", "'is_a:'", "'is_part_of:'", "'--'", "'(0,1)'", "'->'", "'(0,*)'", "'=='", "'(1,1)'", "'=>'", "'(1,*)'", "'@name'", "'@merge'", "'@ignore'"
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
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g"; }



     	private SomSLMarkedGrammarAccess grammarAccess;
     	
        public InternalSomSLMarkedParser(TokenStream input, SomSLMarkedGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AwS";	
       	}
       	
       	@Override
       	protected SomSLMarkedGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAwS"
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:67:1: entryRuleAwS returns [EObject current=null] : iv_ruleAwS= ruleAwS EOF ;
    public final EObject entryRuleAwS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAwS = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:68:2: (iv_ruleAwS= ruleAwS EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:69:2: iv_ruleAwS= ruleAwS EOF
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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:76:1: ruleAwS returns [EObject current=null] : (otherlv_0= 'AwS:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) ) ) ) ;
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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:79:28: ( (otherlv_0= 'AwS:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) ) ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:80:1: (otherlv_0= 'AwS:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) ) ) )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:80:1: (otherlv_0= 'AwS:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:80:3: otherlv_0= 'AwS:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleAwS122); 

                	newLeafNode(otherlv_0, grammarAccess.getAwSAccess().getAwSKeyword_0());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:85:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:86:3: lv_name_1_0= RULE_ID
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

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:102:2: (otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:102:4: otherlv_2= 'v' ( (lv_version_3_0= RULE_VERSION ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAwS157); 

                        	newLeafNode(otherlv_2, grammarAccess.getAwSAccess().getVKeyword_2_0());
                        
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:106:1: ( (lv_version_3_0= RULE_VERSION ) )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:107:1: (lv_version_3_0= RULE_VERSION )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:107:1: (lv_version_3_0= RULE_VERSION )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:108:3: lv_version_3_0= RULE_VERSION
                    {
                    lv_version_3_0=(Token)match(input,RULE_VERSION,FOLLOW_RULE_VERSION_in_ruleAwS174); 

                    			newLeafNode(lv_version_3_0, grammarAccess.getAwSAccess().getVersionVERSIONTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAwSRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"version",
                            		lv_version_3_0, 
                            		"VERSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:124:4: ( ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:126:1: ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:126:1: ( ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:127:2: ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getAwSAccess().getUnorderedGroup_3());
            	
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:130:2: ( ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?)
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:131:3: ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+ {...}?
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:131:3: ( ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) {
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
                else if ( LA2_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:133:4: ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:133:4: ({...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) ) )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:134:5: {...}? => ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAwS", "getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:134:100: ( ({...}? => ( (lv_kos_5_0= ruleKOS ) ) ) )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:135:6: ({...}? => ( (lv_kos_5_0= ruleKOS ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:138:6: ({...}? => ( (lv_kos_5_0= ruleKOS ) ) )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:138:7: {...}? => ( (lv_kos_5_0= ruleKOS ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAwS", "true");
            	    }
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:138:16: ( (lv_kos_5_0= ruleKOS ) )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:139:1: (lv_kos_5_0= ruleKOS )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:139:1: (lv_kos_5_0= ruleKOS )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:140:3: lv_kos_5_0= ruleKOS
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
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:163:4: ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:163:4: ({...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) ) )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:164:5: {...}? => ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAwS", "getUnorderedGroupHelper().canSelect(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:164:100: ( ({...}? => ( (lv_vos_6_0= ruleVOS ) ) ) )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:165:6: ({...}? => ( (lv_vos_6_0= ruleVOS ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getAwSAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:168:6: ({...}? => ( (lv_vos_6_0= ruleVOS ) ) )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:168:7: {...}? => ( (lv_vos_6_0= ruleVOS ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAwS", "true");
            	    }
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:168:16: ( (lv_vos_6_0= ruleVOS ) )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:169:1: (lv_vos_6_0= ruleVOS )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:169:1: (lv_vos_6_0= ruleVOS )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:170:3: lv_vos_6_0= ruleVOS
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


    // $ANTLR start "entryRuleKOS"
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:211:1: entryRuleKOS returns [EObject current=null] : iv_ruleKOS= ruleKOS EOF ;
    public final EObject entryRuleKOS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKOS = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:212:2: (iv_ruleKOS= ruleKOS EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:213:2: iv_ruleKOS= ruleKOS EOF
            {
             newCompositeNode(grammarAccess.getKOSRule()); 
            pushFollow(FOLLOW_ruleKOS_in_entryRuleKOS406);
            iv_ruleKOS=ruleKOS();

            state._fsp--;

             current =iv_ruleKOS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKOS416); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:220:1: ruleKOS returns [EObject current=null] : ( ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )* otherlv_6= '}' ) ;
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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:223:28: ( ( ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )* otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:224:1: ( ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )* otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:224:1: ( ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )* otherlv_6= '}' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:224:2: ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )* otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:224:2: ( ( (lv_name_0_0= 'KOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) )
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
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:224:3: ( (lv_name_0_0= 'KOS' ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:224:3: ( (lv_name_0_0= 'KOS' ) )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:225:1: (lv_name_0_0= 'KOS' )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:225:1: (lv_name_0_0= 'KOS' )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:226:3: lv_name_0_0= 'KOS'
                    {
                    lv_name_0_0=(Token)match(input,14,FOLLOW_14_in_ruleKOS460); 

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
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:240:6: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:240:6: ( (lv_name_1_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:241:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:241:1: (lv_name_1_0= RULE_ID )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:242:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKOS496); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleKOS514); 

                	newLeafNode(otherlv_2, grammarAccess.getKOSAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:262:1: ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )*
            loop4:
            do {
                int alt4=4;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:262:2: ( (lv_objekttypen_3_0= ruleKOT ) )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:262:2: ( (lv_objekttypen_3_0= ruleKOT ) )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:263:1: (lv_objekttypen_3_0= ruleKOT )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:263:1: (lv_objekttypen_3_0= ruleKOT )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:264:3: lv_objekttypen_3_0= ruleKOT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKOSAccess().getObjekttypenKOTParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleKOT_in_ruleKOS536);
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
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:281:6: ( (lv_beziehungen_4_0= ruleBeziehung ) )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:281:6: ( (lv_beziehungen_4_0= ruleBeziehung ) )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:282:1: (lv_beziehungen_4_0= ruleBeziehung )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:282:1: (lv_beziehungen_4_0= ruleBeziehung )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:283:3: lv_beziehungen_4_0= ruleBeziehung
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKOSAccess().getBeziehungenBeziehungParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBeziehung_in_ruleKOS563);
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
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:300:6: ( (lv_gliederung_5_0= ruleKOS ) )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:300:6: ( (lv_gliederung_5_0= ruleKOS ) )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:301:1: (lv_gliederung_5_0= ruleKOS )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:301:1: (lv_gliederung_5_0= ruleKOS )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:302:3: lv_gliederung_5_0= ruleKOS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKOSAccess().getGliederungKOSParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleKOS_in_ruleKOS590);
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
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleKOS604); 

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


    // $ANTLR start "entryRuleVOS"
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:330:1: entryRuleVOS returns [EObject current=null] : iv_ruleVOS= ruleVOS EOF ;
    public final EObject entryRuleVOS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVOS = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:331:2: (iv_ruleVOS= ruleVOS EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:332:2: iv_ruleVOS= ruleVOS EOF
            {
             newCompositeNode(grammarAccess.getVOSRule()); 
            pushFollow(FOLLOW_ruleVOS_in_entryRuleVOS640);
            iv_ruleVOS=ruleVOS();

            state._fsp--;

             current =iv_ruleVOS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVOS650); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:339:1: ruleVOS returns [EObject current=null] : ( ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )* otherlv_6= '}' ) ;
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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:342:28: ( ( ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )* otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:343:1: ( ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )* otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:343:1: ( ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )* otherlv_6= '}' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:343:2: ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) ) otherlv_2= '{' ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )* otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:343:2: ( ( (lv_name_0_0= 'VOS' ) ) | ( (lv_name_1_0= RULE_ID ) ) )
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
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:343:3: ( (lv_name_0_0= 'VOS' ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:343:3: ( (lv_name_0_0= 'VOS' ) )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:344:1: (lv_name_0_0= 'VOS' )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:344:1: (lv_name_0_0= 'VOS' )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:345:3: lv_name_0_0= 'VOS'
                    {
                    lv_name_0_0=(Token)match(input,17,FOLLOW_17_in_ruleVOS694); 

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
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:359:6: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:359:6: ( (lv_name_1_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:360:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:360:1: (lv_name_1_0= RULE_ID )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:361:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVOS730); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleVOS748); 

                	newLeafNode(otherlv_2, grammarAccess.getVOSAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:381:1: ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )*
            loop6:
            do {
                int alt6=4;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:381:2: ( (lv_objekttypen_3_0= ruleVOT ) )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:381:2: ( (lv_objekttypen_3_0= ruleVOT ) )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:382:1: (lv_objekttypen_3_0= ruleVOT )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:382:1: (lv_objekttypen_3_0= ruleVOT )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:383:3: lv_objekttypen_3_0= ruleVOT
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVOSAccess().getObjekttypenVOTParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVOT_in_ruleVOS770);
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
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:400:6: ( (lv_beziehungen_4_0= ruleInteracts_with ) )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:400:6: ( (lv_beziehungen_4_0= ruleInteracts_with ) )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:401:1: (lv_beziehungen_4_0= ruleInteracts_with )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:401:1: (lv_beziehungen_4_0= ruleInteracts_with )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:402:3: lv_beziehungen_4_0= ruleInteracts_with
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVOSAccess().getBeziehungenInteracts_withParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInteracts_with_in_ruleVOS797);
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
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:419:6: ( (lv_gliederung_5_0= ruleVOS ) )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:419:6: ( (lv_gliederung_5_0= ruleVOS ) )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:420:1: (lv_gliederung_5_0= ruleVOS )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:420:1: (lv_gliederung_5_0= ruleVOS )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:421:3: lv_gliederung_5_0= ruleVOS
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVOSAccess().getGliederungVOSParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVOS_in_ruleVOS824);
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
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleVOS838); 

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


    // $ANTLR start "entryRuleAttribut"
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:451:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:452:2: (iv_ruleAttribut= ruleAttribut EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:453:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_ruleAttribut_in_entryRuleAttribut876);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribut886); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:460:1: ruleAttribut returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_datentyp_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:463:28: ( ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:464:1: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:464:1: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:464:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:464:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:464:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:464:3: ( (otherlv_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:465:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:465:1: (otherlv_0= RULE_ID )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:466:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribut932); 

                    		newLeafNode(otherlv_0, grammarAccess.getAttributAccess().getObjekttypObjekttypCrossReference_0_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:478:6: (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:478:6: (otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) ) )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:478:8: otherlv_1= 'DT' ( (lv_datentyp_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAttribut951); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributAccess().getDTKeyword_0_1_0());
                        
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:482:1: ( (lv_datentyp_2_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:483:1: (lv_datentyp_2_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:483:1: (lv_datentyp_2_0= RULE_ID )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:484:3: lv_datentyp_2_0= RULE_ID
                    {
                    lv_datentyp_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribut968); 

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

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:500:4: ( (lv_name_3_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:501:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:501:1: (lv_name_3_0= RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:502:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribut992); 

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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleAttribut1009); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:530:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:531:2: (iv_ruleOperator= ruleOperator EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:532:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleOperator_in_entryRuleOperator1045);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperator1055); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:539:1: ruleOperator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ') {' ( (lv_anweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' ) ;
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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:542:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ') {' ( (lv_anweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:543:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ') {' ( (lv_anweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:543:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ') {' ( (lv_anweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:543:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) )* otherlv_3= ') {' ( (lv_anweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}'
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:543:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:544:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:544:1: (lv_name_0_0= RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:545:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperator1097); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleOperator1114); 

                	newLeafNode(otherlv_1, grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_1());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:565:1: ( (otherlv_2= RULE_ID ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:566:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:566:1: (otherlv_2= RULE_ID )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:567:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperatorRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperator1134); 

            	    		newLeafNode(otherlv_2, grammarAccess.getOperatorAccess().getParameterObjekttypCrossReference_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleOperator1147); 

                	newLeafNode(otherlv_3, grammarAccess.getOperatorAccess().getRightParenthesisSpaceLeftCurlyBracketKeyword_3());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:582:1: ( (lv_anweisungen_4_0= ruleAnweisung ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:583:1: (lv_anweisungen_4_0= ruleAnweisung )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:583:1: (lv_anweisungen_4_0= ruleAnweisung )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:584:3: lv_anweisungen_4_0= ruleAnweisung
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOperatorAccess().getAnweisungenAnweisungParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnweisung_in_ruleOperator1168);
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
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleOperator1181); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:612:1: entryRuleAnweisung returns [EObject current=null] : iv_ruleAnweisung= ruleAnweisung EOF ;
    public final EObject entryRuleAnweisung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnweisung = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:613:2: (iv_ruleAnweisung= ruleAnweisung EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:614:2: iv_ruleAnweisung= ruleAnweisung EOF
            {
             newCompositeNode(grammarAccess.getAnweisungRule()); 
            pushFollow(FOLLOW_ruleAnweisung_in_entryRuleAnweisung1217);
            iv_ruleAnweisung=ruleAnweisung();

            state._fsp--;

             current =iv_ruleAnweisung; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnweisung1227); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:621:1: ruleAnweisung returns [EObject current=null] : ( ( ( (lv_kontrollstruktur_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_bedingung_2_0= ruleAnweisung ) ) otherlv_3= ') {' ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' ) | ( ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )? ( (lv_operator_8_0= RULE_ID ) ) ) ) ;
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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:624:28: ( ( ( ( (lv_kontrollstruktur_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_bedingung_2_0= ruleAnweisung ) ) otherlv_3= ') {' ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' ) | ( ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )? ( (lv_operator_8_0= RULE_ID ) ) ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:625:1: ( ( ( (lv_kontrollstruktur_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_bedingung_2_0= ruleAnweisung ) ) otherlv_3= ') {' ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' ) | ( ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )? ( (lv_operator_8_0= RULE_ID ) ) ) )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:625:1: ( ( ( (lv_kontrollstruktur_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_bedingung_2_0= ruleAnweisung ) ) otherlv_3= ') {' ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' ) | ( ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )? ( (lv_operator_8_0= RULE_ID ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==RULE_ID||LA12_1==16||(LA12_1>=21 && LA12_1<=22)) ) {
                    alt12=2;
                }
                else if ( (LA12_1==20) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:625:2: ( ( (lv_kontrollstruktur_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_bedingung_2_0= ruleAnweisung ) ) otherlv_3= ') {' ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:625:2: ( ( (lv_kontrollstruktur_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_bedingung_2_0= ruleAnweisung ) ) otherlv_3= ') {' ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}' )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:625:3: ( (lv_kontrollstruktur_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_bedingung_2_0= ruleAnweisung ) ) otherlv_3= ') {' ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )* otherlv_5= '}'
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:625:3: ( (lv_kontrollstruktur_0_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:626:1: (lv_kontrollstruktur_0_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:626:1: (lv_kontrollstruktur_0_0= RULE_ID )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:627:3: lv_kontrollstruktur_0_0= RULE_ID
                    {
                    lv_kontrollstruktur_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnweisung1270); 

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

                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleAnweisung1287); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnweisungAccess().getLeftParenthesisKeyword_0_1());
                        
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:647:1: ( (lv_bedingung_2_0= ruleAnweisung ) )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:648:1: (lv_bedingung_2_0= ruleAnweisung )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:648:1: (lv_bedingung_2_0= ruleAnweisung )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:649:3: lv_bedingung_2_0= ruleAnweisung
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnweisungAccess().getBedingungAnweisungParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnweisung_in_ruleAnweisung1308);
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

                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleAnweisung1320); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnweisungAccess().getRightParenthesisSpaceLeftCurlyBracketKeyword_0_3());
                        
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:669:1: ( (lv_bedigteAnweisungen_4_0= ruleAnweisung ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:670:1: (lv_bedigteAnweisungen_4_0= ruleAnweisung )
                    	    {
                    	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:670:1: (lv_bedigteAnweisungen_4_0= ruleAnweisung )
                    	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:671:3: lv_bedigteAnweisungen_4_0= ruleAnweisung
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnweisungAccess().getBedigteAnweisungenAnweisungParserRuleCall_0_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnweisung_in_ruleAnweisung1341);
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
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleAnweisung1354); 

                        	newLeafNode(otherlv_5, grammarAccess.getAnweisungAccess().getRightCurlyBracketKeyword_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:692:6: ( ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )? ( (lv_operator_8_0= RULE_ID ) ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:692:6: ( ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )? ( (lv_operator_8_0= RULE_ID ) ) )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:692:7: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )? ( (lv_operator_8_0= RULE_ID ) )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:692:7: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= '.' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) ) {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1==22) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:692:8: ( (otherlv_6= RULE_ID ) ) otherlv_7= '.'
                            {
                            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:692:8: ( (otherlv_6= RULE_ID ) )
                            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:693:1: (otherlv_6= RULE_ID )
                            {
                            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:693:1: (otherlv_6= RULE_ID )
                            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:694:3: otherlv_6= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getAnweisungRule());
                            	        }
                                    
                            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnweisung1383); 

                            		newLeafNode(otherlv_6, grammarAccess.getAnweisungAccess().getObjektObjekttypCrossReference_1_0_0_0()); 
                            	

                            }


                            }

                            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleAnweisung1395); 

                                	newLeafNode(otherlv_7, grammarAccess.getAnweisungAccess().getFullStopKeyword_1_0_1());
                                

                            }
                            break;

                    }

                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:709:3: ( (lv_operator_8_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:710:1: (lv_operator_8_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:710:1: (lv_operator_8_0= RULE_ID )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:711:3: lv_operator_8_0= RULE_ID
                    {
                    lv_operator_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnweisung1414); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:735:1: entryRuleKOT returns [EObject current=null] : iv_ruleKOT= ruleKOT EOF ;
    public final EObject entryRuleKOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKOT = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:736:2: (iv_ruleKOT= ruleKOT EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:737:2: iv_ruleKOT= ruleKOT EOF
            {
             newCompositeNode(grammarAccess.getKOTRule()); 
            pushFollow(FOLLOW_ruleKOT_in_entryRuleKOT1456);
            iv_ruleKOT=ruleKOT();

            state._fsp--;

             current =iv_ruleKOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKOT1466); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:744:1: ruleKOT returns [EObject current=null] : (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT ) ;
    public final EObject ruleKOT() throws RecognitionException {
        EObject current = null;

        EObject this_OOT_0 = null;

        EObject this_LOT_1 = null;

        EObject this_TOT_2 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:747:28: ( (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:748:1: (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:748:1: (this_OOT_0= ruleOOT | this_LOT_1= ruleLOT | this_TOT_2= ruleTOT )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 24:
                        {
                        alt13=1;
                        }
                        break;
                    case 26:
                        {
                        alt13=3;
                        }
                        break;
                    case 25:
                        {
                        alt13=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 7, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt13=3;
                    }
                    break;
                case 24:
                    {
                    alt13=1;
                    }
                    break;
                case 25:
                    {
                    alt13=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }

                }
                break;
            case 39:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 26:
                        {
                        alt13=3;
                        }
                        break;
                    case 24:
                        {
                        alt13=1;
                        }
                        break;
                    case 25:
                        {
                        alt13=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 8, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt13=1;
                }
                break;
            case 25:
                {
                alt13=2;
                }
                break;
            case 26:
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
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:749:5: this_OOT_0= ruleOOT
                    {
                     
                            newCompositeNode(grammarAccess.getKOTAccess().getOOTParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOOT_in_ruleKOT1513);
                    this_OOT_0=ruleOOT();

                    state._fsp--;

                     
                            current = this_OOT_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:759:5: this_LOT_1= ruleLOT
                    {
                     
                            newCompositeNode(grammarAccess.getKOTAccess().getLOTParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLOT_in_ruleKOT1540);
                    this_LOT_1=ruleLOT();

                    state._fsp--;

                     
                            current = this_LOT_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:769:5: this_TOT_2= ruleTOT
                    {
                     
                            newCompositeNode(grammarAccess.getKOTAccess().getTOTParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTOT_in_ruleKOT1567);
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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:785:1: entryRuleVOT returns [EObject current=null] : iv_ruleVOT= ruleVOT EOF ;
    public final EObject entryRuleVOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVOT = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:786:2: (iv_ruleVOT= ruleVOT EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:787:2: iv_ruleVOT= ruleVOT EOF
            {
             newCompositeNode(grammarAccess.getVOTRule()); 
            pushFollow(FOLLOW_ruleVOT_in_entryRuleVOT1602);
            iv_ruleVOT=ruleVOT();

            state._fsp--;

             current =iv_ruleVOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVOT1612); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:794:1: ruleVOT returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'VOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' ) ;
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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:797:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'VOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:798:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'VOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:798:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'VOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:798:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'VOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:798:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=38 && LA14_0<=40)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:799:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:799:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:800:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getVOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleVOT1658);
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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleVOT1671); 

                	newLeafNode(otherlv_1, grammarAccess.getVOTAccess().getVOTKeyword_1());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:820:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:821:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:821:1: (lv_name_2_0= RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:822:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVOT1688); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleVOT1705); 

                	newLeafNode(otherlv_3, grammarAccess.getVOTAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:842:1: ( (lv_attribute_4_0= ruleAttribut ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==RULE_ID) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:843:1: (lv_attribute_4_0= ruleAttribut )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:843:1: (lv_attribute_4_0= ruleAttribut )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:844:3: lv_attribute_4_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVOTAccess().getAttributeAttributParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleVOT1726);
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
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:860:3: ( (lv_operatoren_5_0= ruleOperator ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:861:1: (lv_operatoren_5_0= ruleOperator )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:861:1: (lv_operatoren_5_0= ruleOperator )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:862:3: lv_operatoren_5_0= ruleOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVOTAccess().getOperatorenOperatorParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperator_in_ruleVOT1748);
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
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleVOT1761); 

                	newLeafNode(otherlv_6, grammarAccess.getVOTAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:890:1: entryRuleOOT returns [EObject current=null] : iv_ruleOOT= ruleOOT EOF ;
    public final EObject entryRuleOOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOOT = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:891:2: (iv_ruleOOT= ruleOOT EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:892:2: iv_ruleOOT= ruleOOT EOF
            {
             newCompositeNode(grammarAccess.getOOTRule()); 
            pushFollow(FOLLOW_ruleOOT_in_entryRuleOOT1797);
            iv_ruleOOT=ruleOOT();

            state._fsp--;

             current =iv_ruleOOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOOT1807); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:899:1: ruleOOT returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'OOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' ) ;
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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:902:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'OOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:903:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'OOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:903:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'OOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:903:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'OOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:903:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=38 && LA17_0<=40)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:904:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:904:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:905:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getOOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleOOT1853);
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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleOOT1866); 

                	newLeafNode(otherlv_1, grammarAccess.getOOTAccess().getOOTKeyword_1());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:925:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:926:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:926:1: (lv_name_2_0= RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:927:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOOT1883); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleOOT1900); 

                	newLeafNode(otherlv_3, grammarAccess.getOOTAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:947:1: ( (lv_attribute_4_0= ruleAttribut ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_ID) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==18) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:948:1: (lv_attribute_4_0= ruleAttribut )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:948:1: (lv_attribute_4_0= ruleAttribut )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:949:3: lv_attribute_4_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOOTAccess().getAttributeAttributParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleOOT1921);
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
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:965:3: ( (lv_operatoren_5_0= ruleOperator ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:966:1: (lv_operatoren_5_0= ruleOperator )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:966:1: (lv_operatoren_5_0= ruleOperator )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:967:3: lv_operatoren_5_0= ruleOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOOTAccess().getOperatorenOperatorParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperator_in_ruleOOT1943);
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
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleOOT1956); 

                	newLeafNode(otherlv_6, grammarAccess.getOOTAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:995:1: entryRuleLOT returns [EObject current=null] : iv_ruleLOT= ruleLOT EOF ;
    public final EObject entryRuleLOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLOT = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:996:2: (iv_ruleLOT= ruleLOT EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:997:2: iv_ruleLOT= ruleLOT EOF
            {
             newCompositeNode(grammarAccess.getLOTRule()); 
            pushFollow(FOLLOW_ruleLOT_in_entryRuleLOT1992);
            iv_ruleLOT=ruleLOT();

            state._fsp--;

             current =iv_ruleLOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOT2002); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1004:1: ruleLOT returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'LOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' ) ;
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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1007:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'LOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1008:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'LOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1008:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'LOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1008:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'LOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1008:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=38 && LA20_0<=40)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1009:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1009:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1010:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getLOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleLOT2048);
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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleLOT2061); 

                	newLeafNode(otherlv_1, grammarAccess.getLOTAccess().getLOTKeyword_1());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1030:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1031:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1031:1: (lv_name_2_0= RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1032:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLOT2078); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleLOT2095); 

                	newLeafNode(otherlv_3, grammarAccess.getLOTAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1052:1: ( (lv_attribute_4_0= ruleAttribut ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==RULE_ID) ) {
                        alt21=1;
                    }


                }
                else if ( (LA21_0==18) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1053:1: (lv_attribute_4_0= ruleAttribut )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1053:1: (lv_attribute_4_0= ruleAttribut )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1054:3: lv_attribute_4_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLOTAccess().getAttributeAttributParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleLOT2116);
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
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1070:3: ( (lv_operatoren_5_0= ruleOperator ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1071:1: (lv_operatoren_5_0= ruleOperator )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1071:1: (lv_operatoren_5_0= ruleOperator )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1072:3: lv_operatoren_5_0= ruleOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLOTAccess().getOperatorenOperatorParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperator_in_ruleLOT2138);
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
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleLOT2151); 

                	newLeafNode(otherlv_6, grammarAccess.getLOTAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1100:1: entryRuleTOT returns [EObject current=null] : iv_ruleTOT= ruleTOT EOF ;
    public final EObject entryRuleTOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTOT = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1101:2: (iv_ruleTOT= ruleTOT EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1102:2: iv_ruleTOT= ruleTOT EOF
            {
             newCompositeNode(grammarAccess.getTOTRule()); 
            pushFollow(FOLLOW_ruleTOT_in_entryRuleTOT2187);
            iv_ruleTOT=ruleTOT();

            state._fsp--;

             current =iv_ruleTOT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTOT2197); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1109:1: ruleTOT returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'TOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' ) ;
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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1112:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'TOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1113:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'TOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1113:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'TOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1113:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'TOT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attribute_4_0= ruleAttribut ) )* ( (lv_operatoren_5_0= ruleOperator ) )* otherlv_6= '}'
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1113:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=38 && LA23_0<=40)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1114:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1114:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1115:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getTOTAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleTOT2243);
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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleTOT2256); 

                	newLeafNode(otherlv_1, grammarAccess.getTOTAccess().getTOTKeyword_1());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1135:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1136:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1136:1: (lv_name_2_0= RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1137:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTOT2273); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleTOT2290); 

                	newLeafNode(otherlv_3, grammarAccess.getTOTAccess().getLeftCurlyBracketKeyword_3());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1157:1: ( (lv_attribute_4_0= ruleAttribut ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==RULE_ID) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==18) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1158:1: (lv_attribute_4_0= ruleAttribut )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1158:1: (lv_attribute_4_0= ruleAttribut )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1159:3: lv_attribute_4_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTOTAccess().getAttributeAttributParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleTOT2311);
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
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1175:3: ( (lv_operatoren_5_0= ruleOperator ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1176:1: (lv_operatoren_5_0= ruleOperator )
            	    {
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1176:1: (lv_operatoren_5_0= ruleOperator )
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1177:3: lv_operatoren_5_0= ruleOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTOTAccess().getOperatorenOperatorParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperator_in_ruleTOT2333);
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
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleTOT2346); 

                	newLeafNode(otherlv_6, grammarAccess.getTOTAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1205:1: entryRuleBeziehung returns [EObject current=null] : iv_ruleBeziehung= ruleBeziehung EOF ;
    public final EObject entryRuleBeziehung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeziehung = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1206:2: (iv_ruleBeziehung= ruleBeziehung EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1207:2: iv_ruleBeziehung= ruleBeziehung EOF
            {
             newCompositeNode(grammarAccess.getBeziehungRule()); 
            pushFollow(FOLLOW_ruleBeziehung_in_entryRuleBeziehung2382);
            iv_ruleBeziehung=ruleBeziehung();

            state._fsp--;

             current =iv_ruleBeziehung; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeziehung2392); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1214:1: ruleBeziehung returns [EObject current=null] : (this_Is_a_0= ruleIs_a | this_Interacts_with_1= ruleInteracts_with | this_Is_part_of_2= ruleIs_part_of ) ;
    public final EObject ruleBeziehung() throws RecognitionException {
        EObject current = null;

        EObject this_Is_a_0 = null;

        EObject this_Interacts_with_1 = null;

        EObject this_Is_part_of_2 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1217:28: ( (this_Is_a_0= ruleIs_a | this_Interacts_with_1= ruleInteracts_with | this_Is_part_of_2= ruleIs_part_of ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1218:1: (this_Is_a_0= ruleIs_a | this_Interacts_with_1= ruleInteracts_with | this_Is_part_of_2= ruleIs_part_of )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1218:1: (this_Is_a_0= ruleIs_a | this_Interacts_with_1= ruleInteracts_with | this_Is_part_of_2= ruleIs_part_of )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 28:
                        {
                        alt26=1;
                        }
                        break;
                    case RULE_ID:
                    case 27:
                        {
                        alt26=2;
                        }
                        break;
                    case 29:
                        {
                        alt26=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 7, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt26=1;
                    }
                    break;
                case RULE_ID:
                case 27:
                    {
                    alt26=2;
                    }
                    break;
                case 29:
                    {
                    alt26=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }

                }
                break;
            case 39:
                {
                int LA26_3 = input.LA(2);

                if ( (LA26_3==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 28:
                        {
                        alt26=1;
                        }
                        break;
                    case 29:
                        {
                        alt26=3;
                        }
                        break;
                    case RULE_ID:
                    case 27:
                        {
                        alt26=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 8, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 3, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
            case 27:
                {
                alt26=2;
                }
                break;
            case 29:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1219:5: this_Is_a_0= ruleIs_a
                    {
                     
                            newCompositeNode(grammarAccess.getBeziehungAccess().getIs_aParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIs_a_in_ruleBeziehung2439);
                    this_Is_a_0=ruleIs_a();

                    state._fsp--;

                     
                            current = this_Is_a_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1229:5: this_Interacts_with_1= ruleInteracts_with
                    {
                     
                            newCompositeNode(grammarAccess.getBeziehungAccess().getInteracts_withParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInteracts_with_in_ruleBeziehung2466);
                    this_Interacts_with_1=ruleInteracts_with();

                    state._fsp--;

                     
                            current = this_Interacts_with_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1239:5: this_Is_part_of_2= ruleIs_part_of
                    {
                     
                            newCompositeNode(grammarAccess.getBeziehungAccess().getIs_part_ofParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIs_part_of_in_ruleBeziehung2493);
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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1255:1: entryRuleInteracts_with returns [EObject current=null] : iv_ruleInteracts_with= ruleInteracts_with EOF ;
    public final EObject entryRuleInteracts_with() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteracts_with = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1256:2: (iv_ruleInteracts_with= ruleInteracts_with EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1257:2: iv_ruleInteracts_with= ruleInteracts_with EOF
            {
             newCompositeNode(grammarAccess.getInteracts_withRule()); 
            pushFollow(FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with2528);
            iv_ruleInteracts_with=ruleInteracts_with();

            state._fsp--;

             current =iv_ruleInteracts_with; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteracts_with2538); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1264:1: ruleInteracts_with returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? (otherlv_1= 'interacts_with:' )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleInteracts_with() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_kardinalitaet_3_1 = null;

        EObject lv_kardinalitaet_3_2 = null;

        EObject lv_kardinalitaet_3_3 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1267:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? (otherlv_1= 'interacts_with:' )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1268:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? (otherlv_1= 'interacts_with:' )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1268:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? (otherlv_1= 'interacts_with:' )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1268:2: ( (lv_annotation_0_0= ruleAnnotation ) )? (otherlv_1= 'interacts_with:' )? ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1268:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=38 && LA27_0<=40)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1269:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1269:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1270:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteracts_withAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleInteracts_with2584);
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

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1286:3: (otherlv_1= 'interacts_with:' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1286:5: otherlv_1= 'interacts_with:'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleInteracts_with2598); 

                        	newLeafNode(otherlv_1, grammarAccess.getInteracts_withAccess().getInteracts_withKeyword_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1290:3: ( (otherlv_2= RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1291:1: (otherlv_2= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1291:1: (otherlv_2= RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1292:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInteracts_withRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteracts_with2620); 

            		newLeafNode(otherlv_2, grammarAccess.getInteracts_withAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            	

            }


            }

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1303:2: ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1304:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1304:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1305:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1305:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
                {
                alt29=1;
                }
                break;
            case 32:
            case 33:
                {
                alt29=2;
                }
                break;
            case 36:
            case 37:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1306:3: lv_kardinalitaet_3_1= ruleKardinalitaet01
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_ruleInteracts_with2643);
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
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1321:8: lv_kardinalitaet_3_2= ruleKardinalitaet0x
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_ruleInteracts_with2662);
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
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1336:8: lv_kardinalitaet_3_3= ruleKardinalitaet1x
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteracts_withAccess().getKardinalitaetKardinalitaet1xParserRuleCall_3_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_ruleInteracts_with2681);
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

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1354:2: ( (otherlv_4= RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1355:1: (otherlv_4= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1355:1: (otherlv_4= RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1356:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInteracts_withRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInteracts_with2704); 

            		newLeafNode(otherlv_4, grammarAccess.getInteracts_withAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            	

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1375:1: entryRuleIs_a returns [EObject current=null] : iv_ruleIs_a= ruleIs_a EOF ;
    public final EObject entryRuleIs_a() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIs_a = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1376:2: (iv_ruleIs_a= ruleIs_a EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1377:2: iv_ruleIs_a= ruleIs_a EOF
            {
             newCompositeNode(grammarAccess.getIs_aRule()); 
            pushFollow(FOLLOW_ruleIs_a_in_entryRuleIs_a2740);
            iv_ruleIs_a=ruleIs_a();

            state._fsp--;

             current =iv_ruleIs_a; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_a2750); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1384:1: ruleIs_a returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_a:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) ) ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleIs_a() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_kardinalitaet_3_1 = null;

        EObject lv_kardinalitaet_3_2 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1387:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_a:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) ) ( (otherlv_4= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1388:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_a:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) ) ( (otherlv_4= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1388:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_a:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) ) ( (otherlv_4= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1388:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_a:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) ) ( (otherlv_4= RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1388:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=38 && LA30_0<=40)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1389:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1389:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1390:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_aAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleIs_a2796);
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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleIs_a2809); 

                	newLeafNode(otherlv_1, grammarAccess.getIs_aAccess().getIs_aKeyword_1());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1410:1: ( (otherlv_2= RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1411:1: (otherlv_2= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1411:1: (otherlv_2= RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1412:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_aRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_a2829); 

            		newLeafNode(otherlv_2, grammarAccess.getIs_aAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            	

            }


            }

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1423:2: ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1424:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1424:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1425:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1425:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet11 )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=30 && LA31_0<=31)) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=34 && LA31_0<=35)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1426:3: lv_kardinalitaet_3_1= ruleKardinalitaet01
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_ruleIs_a2852);
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
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1441:8: lv_kardinalitaet_3_2= ruleKardinalitaet11
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_aAccess().getKardinalitaetKardinalitaet11ParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet11_in_ruleIs_a2871);
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

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1459:2: ( (otherlv_4= RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1460:1: (otherlv_4= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1460:1: (otherlv_4= RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1461:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_aRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_a2894); 

            		newLeafNode(otherlv_4, grammarAccess.getIs_aAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            	

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1480:1: entryRuleIs_part_of returns [EObject current=null] : iv_ruleIs_part_of= ruleIs_part_of EOF ;
    public final EObject entryRuleIs_part_of() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIs_part_of = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1481:2: (iv_ruleIs_part_of= ruleIs_part_of EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1482:2: iv_ruleIs_part_of= ruleIs_part_of EOF
            {
             newCompositeNode(grammarAccess.getIs_part_ofRule()); 
            pushFollow(FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of2930);
            iv_ruleIs_part_of=ruleIs_part_of();

            state._fsp--;

             current =iv_ruleIs_part_of; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIs_part_of2940); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1489:1: ruleIs_part_of returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_part_of:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleIs_part_of() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_kardinalitaet_3_1 = null;

        EObject lv_kardinalitaet_3_2 = null;

        EObject lv_kardinalitaet_3_3 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1492:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_part_of:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1493:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_part_of:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1493:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_part_of:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1493:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'is_part_of:' ( (otherlv_2= RULE_ID ) ) ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) ) ( (otherlv_4= RULE_ID ) )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1493:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=38 && LA32_0<=40)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1494:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1494:1: (lv_annotation_0_0= ruleAnnotation )
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1495:3: lv_annotation_0_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleIs_part_of2986);
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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleIs_part_of2999); 

                	newLeafNode(otherlv_1, grammarAccess.getIs_part_ofAccess().getIs_part_ofKeyword_1());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1515:1: ( (otherlv_2= RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1516:1: (otherlv_2= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1516:1: (otherlv_2= RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1517:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_part_ofRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_part_of3019); 

            		newLeafNode(otherlv_2, grammarAccess.getIs_part_ofAccess().getObjekttyp1ObjekttypCrossReference_2_0()); 
            	

            }


            }

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1528:2: ( ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1529:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1529:1: ( (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1530:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1530:1: (lv_kardinalitaet_3_1= ruleKardinalitaet01 | lv_kardinalitaet_3_2= ruleKardinalitaet0x | lv_kardinalitaet_3_3= ruleKardinalitaet1x )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
                {
                alt33=1;
                }
                break;
            case 32:
            case 33:
                {
                alt33=2;
                }
                break;
            case 36:
            case 37:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1531:3: lv_kardinalitaet_3_1= ruleKardinalitaet01
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet01ParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet01_in_ruleIs_part_of3042);
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
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1546:8: lv_kardinalitaet_3_2= ruleKardinalitaet0x
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet0xParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet0x_in_ruleIs_part_of3061);
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
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1561:8: lv_kardinalitaet_3_3= ruleKardinalitaet1x
                    {
                     
                    	        newCompositeNode(grammarAccess.getIs_part_ofAccess().getKardinalitaetKardinalitaet1xParserRuleCall_3_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleKardinalitaet1x_in_ruleIs_part_of3080);
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

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1579:2: ( (otherlv_4= RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1580:1: (otherlv_4= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1580:1: (otherlv_4= RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1581:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIs_part_ofRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIs_part_of3103); 

            		newLeafNode(otherlv_4, grammarAccess.getIs_part_ofAccess().getObjekttyp2ObjekttypCrossReference_4_0()); 
            	

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1602:1: entryRuleKardinalitaet01 returns [EObject current=null] : iv_ruleKardinalitaet01= ruleKardinalitaet01 EOF ;
    public final EObject entryRuleKardinalitaet01() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet01 = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1603:2: (iv_ruleKardinalitaet01= ruleKardinalitaet01 EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1604:2: iv_ruleKardinalitaet01= ruleKardinalitaet01 EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet01Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet013141);
            iv_ruleKardinalitaet01=ruleKardinalitaet01();

            state._fsp--;

             current =iv_ruleKardinalitaet01; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet013151); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1611:1: ruleKardinalitaet01 returns [EObject current=null] : ( (otherlv_0= '--' | otherlv_1= '(0,1)' ) () ) ;
    public final EObject ruleKardinalitaet01() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1614:28: ( ( (otherlv_0= '--' | otherlv_1= '(0,1)' ) () ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1615:1: ( (otherlv_0= '--' | otherlv_1= '(0,1)' ) () )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1615:1: ( (otherlv_0= '--' | otherlv_1= '(0,1)' ) () )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1615:2: (otherlv_0= '--' | otherlv_1= '(0,1)' ) ()
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1615:2: (otherlv_0= '--' | otherlv_1= '(0,1)' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==30) ) {
                alt34=1;
            }
            else if ( (LA34_0==31) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1615:4: otherlv_0= '--'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleKardinalitaet013189); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet01Access().getHyphenMinusHyphenMinusKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1620:7: otherlv_1= '(0,1)'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleKardinalitaet013207); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet01Access().getLeftParenthesisDigitZeroCommaDigitOneRightParenthesisKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1624:2: ()
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1625:5: 
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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1638:1: entryRuleKardinalitaet0x returns [EObject current=null] : iv_ruleKardinalitaet0x= ruleKardinalitaet0x EOF ;
    public final EObject entryRuleKardinalitaet0x() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet0x = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1639:2: (iv_ruleKardinalitaet0x= ruleKardinalitaet0x EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1640:2: iv_ruleKardinalitaet0x= ruleKardinalitaet0x EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet0xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x3253);
            iv_ruleKardinalitaet0x=ruleKardinalitaet0x();

            state._fsp--;

             current =iv_ruleKardinalitaet0x; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet0x3263); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1647:1: ruleKardinalitaet0x returns [EObject current=null] : ( (otherlv_0= '->' | otherlv_1= '(0,*)' ) () ) ;
    public final EObject ruleKardinalitaet0x() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1650:28: ( ( (otherlv_0= '->' | otherlv_1= '(0,*)' ) () ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1651:1: ( (otherlv_0= '->' | otherlv_1= '(0,*)' ) () )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1651:1: ( (otherlv_0= '->' | otherlv_1= '(0,*)' ) () )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1651:2: (otherlv_0= '->' | otherlv_1= '(0,*)' ) ()
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1651:2: (otherlv_0= '->' | otherlv_1= '(0,*)' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                alt35=1;
            }
            else if ( (LA35_0==33) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1651:4: otherlv_0= '->'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleKardinalitaet0x3301); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet0xAccess().getHyphenMinusGreaterThanSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1656:7: otherlv_1= '(0,*)'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleKardinalitaet0x3319); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet0xAccess().getLeftParenthesisDigitZeroCommaAsteriskRightParenthesisKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1660:2: ()
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1661:5: 
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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1674:1: entryRuleKardinalitaet11 returns [EObject current=null] : iv_ruleKardinalitaet11= ruleKardinalitaet11 EOF ;
    public final EObject entryRuleKardinalitaet11() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet11 = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1675:2: (iv_ruleKardinalitaet11= ruleKardinalitaet11 EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1676:2: iv_ruleKardinalitaet11= ruleKardinalitaet11 EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet11Rule()); 
            pushFollow(FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet113365);
            iv_ruleKardinalitaet11=ruleKardinalitaet11();

            state._fsp--;

             current =iv_ruleKardinalitaet11; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet113375); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1683:1: ruleKardinalitaet11 returns [EObject current=null] : ( (otherlv_0= '==' | otherlv_1= '(1,1)' ) () ) ;
    public final EObject ruleKardinalitaet11() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1686:28: ( ( (otherlv_0= '==' | otherlv_1= '(1,1)' ) () ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1687:1: ( (otherlv_0= '==' | otherlv_1= '(1,1)' ) () )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1687:1: ( (otherlv_0= '==' | otherlv_1= '(1,1)' ) () )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1687:2: (otherlv_0= '==' | otherlv_1= '(1,1)' ) ()
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1687:2: (otherlv_0= '==' | otherlv_1= '(1,1)' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==34) ) {
                alt36=1;
            }
            else if ( (LA36_0==35) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1687:4: otherlv_0= '=='
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleKardinalitaet113413); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet11Access().getEqualsSignEqualsSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1692:7: otherlv_1= '(1,1)'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleKardinalitaet113431); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet11Access().getLeftParenthesisDigitOneCommaDigitOneRightParenthesisKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1696:2: ()
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1697:5: 
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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1710:1: entryRuleKardinalitaet1x returns [EObject current=null] : iv_ruleKardinalitaet1x= ruleKardinalitaet1x EOF ;
    public final EObject entryRuleKardinalitaet1x() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKardinalitaet1x = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1711:2: (iv_ruleKardinalitaet1x= ruleKardinalitaet1x EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1712:2: iv_ruleKardinalitaet1x= ruleKardinalitaet1x EOF
            {
             newCompositeNode(grammarAccess.getKardinalitaet1xRule()); 
            pushFollow(FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x3477);
            iv_ruleKardinalitaet1x=ruleKardinalitaet1x();

            state._fsp--;

             current =iv_ruleKardinalitaet1x; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKardinalitaet1x3487); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1719:1: ruleKardinalitaet1x returns [EObject current=null] : ( (otherlv_0= '=>' | otherlv_1= '(1,*)' ) () ) ;
    public final EObject ruleKardinalitaet1x() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1722:28: ( ( (otherlv_0= '=>' | otherlv_1= '(1,*)' ) () ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1723:1: ( (otherlv_0= '=>' | otherlv_1= '(1,*)' ) () )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1723:1: ( (otherlv_0= '=>' | otherlv_1= '(1,*)' ) () )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1723:2: (otherlv_0= '=>' | otherlv_1= '(1,*)' ) ()
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1723:2: (otherlv_0= '=>' | otherlv_1= '(1,*)' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            else if ( (LA37_0==37) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1723:4: otherlv_0= '=>'
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleKardinalitaet1x3525); 

                        	newLeafNode(otherlv_0, grammarAccess.getKardinalitaet1xAccess().getEqualsSignGreaterThanSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1728:7: otherlv_1= '(1,*)'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleKardinalitaet1x3543); 

                        	newLeafNode(otherlv_1, grammarAccess.getKardinalitaet1xAccess().getLeftParenthesisDigitOneCommaAsteriskRightParenthesisKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1732:2: ()
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1733:5: 
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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1746:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1747:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1748:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation3589);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation3599); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1755:1: ruleAnnotation returns [EObject current=null] : (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;

        EObject this_Ignore_1 = null;

        EObject this_Merge_2 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1758:28: ( (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1759:1: (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1759:1: (this_Name_0= ruleName | this_Ignore_1= ruleIgnore | this_Merge_2= ruleMerge )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt38=1;
                }
                break;
            case 40:
                {
                alt38=2;
                }
                break;
            case 39:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1760:5: this_Name_0= ruleName
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getNameParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleName_in_ruleAnnotation3646);
                    this_Name_0=ruleName();

                    state._fsp--;

                     
                            current = this_Name_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1770:5: this_Ignore_1= ruleIgnore
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getIgnoreParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIgnore_in_ruleAnnotation3673);
                    this_Ignore_1=ruleIgnore();

                    state._fsp--;

                     
                            current = this_Ignore_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1780:5: this_Merge_2= ruleMerge
                    {
                     
                            newCompositeNode(grammarAccess.getAnnotationAccess().getMergeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMerge_in_ruleAnnotation3700);
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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1796:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1797:2: (iv_ruleName= ruleName EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1798:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName3735);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName3745); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1805:1: ruleName returns [EObject current=null] : (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1808:28: ( (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1809:1: (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1809:1: (otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1809:3: otherlv_0= '@name' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleName3782); 

                	newLeafNode(otherlv_0, grammarAccess.getNameAccess().getNameKeyword_0());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1813:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1814:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1814:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1815:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName3799); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1839:1: entryRuleMerge returns [EObject current=null] : iv_ruleMerge= ruleMerge EOF ;
    public final EObject entryRuleMerge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMerge = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1840:2: (iv_ruleMerge= ruleMerge EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1841:2: iv_ruleMerge= ruleMerge EOF
            {
             newCompositeNode(grammarAccess.getMergeRule()); 
            pushFollow(FOLLOW_ruleMerge_in_entryRuleMerge3840);
            iv_ruleMerge=ruleMerge();

            state._fsp--;

             current =iv_ruleMerge; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMerge3850); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1848:1: ruleMerge returns [EObject current=null] : (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMerge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1851:28: ( (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1852:1: (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1852:1: (otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1852:3: otherlv_0= '@merge' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleMerge3887); 

                	newLeafNode(otherlv_0, grammarAccess.getMergeAccess().getMergeKeyword_0());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1856:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1857:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1857:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1858:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMerge3904); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1882:1: entryRuleIgnore returns [EObject current=null] : iv_ruleIgnore= ruleIgnore EOF ;
    public final EObject entryRuleIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnore = null;


        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1883:2: (iv_ruleIgnore= ruleIgnore EOF )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1884:2: iv_ruleIgnore= ruleIgnore EOF
            {
             newCompositeNode(grammarAccess.getIgnoreRule()); 
            pushFollow(FOLLOW_ruleIgnore_in_entryRuleIgnore3945);
            iv_ruleIgnore=ruleIgnore();

            state._fsp--;

             current =iv_ruleIgnore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIgnore3955); 

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
    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1891:1: ruleIgnore returns [EObject current=null] : (otherlv_0= '@ignore' () ) ;
    public final EObject ruleIgnore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1894:28: ( (otherlv_0= '@ignore' () ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1895:1: (otherlv_0= '@ignore' () )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1895:1: (otherlv_0= '@ignore' () )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1895:3: otherlv_0= '@ignore' ()
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleIgnore3992); 

                	newLeafNode(otherlv_0, grammarAccess.getIgnoreAccess().getIgnoreKeyword_0());
                
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1899:1: ()
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1900:5: 
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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA4_eotS =
        "\13\uffff";
    static final String DFA4_eofS =
        "\13\uffff";
    static final String DFA4_minS =
        "\1\4\1\uffff\3\4\2\uffff\1\17\1\uffff\2\4";
    static final String DFA4_maxS =
        "\1\50\1\uffff\1\4\1\35\1\4\2\uffff\1\45\1\uffff\2\35";
    static final String DFA4_acceptS =
        "\1\uffff\1\4\3\uffff\1\1\1\2\1\uffff\1\3\2\uffff";
    static final String DFA4_specialS =
        "\13\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\7\11\uffff\1\10\1\uffff\1\1\7\uffff\3\5\3\6\10\uffff\1\2"+
            "\1\4\1\3",
            "",
            "\1\11",
            "\1\6\23\uffff\3\5\3\6",
            "\1\12",
            "",
            "",
            "\1\10\16\uffff\4\6\2\uffff\2\6",
            "",
            "\1\6\23\uffff\3\5\3\6",
            "\1\6\23\uffff\3\5\3\6"
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
            return "()* loopback of 262:1: ( ( (lv_objekttypen_3_0= ruleKOT ) ) | ( (lv_beziehungen_4_0= ruleBeziehung ) ) | ( (lv_gliederung_5_0= ruleKOS ) ) )*";
        }
    }
    static final String DFA6_eotS =
        "\13\uffff";
    static final String DFA6_eofS =
        "\13\uffff";
    static final String DFA6_minS =
        "\1\4\1\uffff\3\4\2\uffff\1\17\1\uffff\2\4";
    static final String DFA6_maxS =
        "\1\50\1\uffff\1\4\1\33\1\4\2\uffff\1\45\1\uffff\2\33";
    static final String DFA6_acceptS =
        "\1\uffff\1\4\3\uffff\1\1\1\2\1\uffff\1\3\2\uffff";
    static final String DFA6_specialS =
        "\13\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\7\13\uffff\1\1\1\10\5\uffff\1\5\3\uffff\1\6\12\uffff\1\2"+
            "\1\4\1\3",
            "",
            "\1\11",
            "\1\6\22\uffff\1\5\3\uffff\1\6",
            "\1\12",
            "",
            "",
            "\1\10\16\uffff\4\6\2\uffff\2\6",
            "",
            "\1\6\22\uffff\1\5\3\uffff\1\6",
            "\1\6\22\uffff\1\5\3\uffff\1\6"
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
            return "()* loopback of 381:1: ( ( (lv_objekttypen_3_0= ruleVOT ) ) | ( (lv_beziehungen_4_0= ruleInteracts_with ) ) | ( (lv_gliederung_5_0= ruleVOS ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleAwS_in_entryRuleAwS75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwS85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAwS122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAwS139 = new BitSet(new long[]{0x0000000000026010L});
    public static final BitSet FOLLOW_13_in_ruleAwS157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_VERSION_in_ruleAwS174 = new BitSet(new long[]{0x0000000000026010L});
    public static final BitSet FOLLOW_ruleKOS_in_ruleAwS247 = new BitSet(new long[]{0x0000000000026012L});
    public static final BitSet FOLLOW_ruleVOS_in_ruleAwS322 = new BitSet(new long[]{0x0000000000026012L});
    public static final BitSet FOLLOW_ruleKOS_in_entryRuleKOS406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKOS416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleKOS460 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKOS496 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleKOS514 = new BitSet(new long[]{0x000001C03F014010L});
    public static final BitSet FOLLOW_ruleKOT_in_ruleKOS536 = new BitSet(new long[]{0x000001C03F014010L});
    public static final BitSet FOLLOW_ruleBeziehung_in_ruleKOS563 = new BitSet(new long[]{0x000001C03F014010L});
    public static final BitSet FOLLOW_ruleKOS_in_ruleKOS590 = new BitSet(new long[]{0x000001C03F014010L});
    public static final BitSet FOLLOW_16_in_ruleKOS604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOS_in_entryRuleVOS640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVOS650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVOS694 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVOS730 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVOS748 = new BitSet(new long[]{0x000001C008836010L});
    public static final BitSet FOLLOW_ruleVOT_in_ruleVOS770 = new BitSet(new long[]{0x000001C008836010L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_ruleVOS797 = new BitSet(new long[]{0x000001C008836010L});
    public static final BitSet FOLLOW_ruleVOS_in_ruleVOS824 = new BitSet(new long[]{0x000001C008836010L});
    public static final BitSet FOLLOW_16_in_ruleVOS838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_entryRuleAttribut876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribut886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribut932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18_in_ruleAttribut951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribut968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribut992 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAttribut1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperator1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperator1097 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOperator1114 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperator1134 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_ruleOperator1147 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAnweisung_in_ruleOperator1168 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleOperator1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnweisung_in_entryRuleAnweisung1217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnweisung1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnweisung1270 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAnweisung1287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnweisung_in_ruleAnweisung1308 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAnweisung1320 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleAnweisung_in_ruleAnweisung1341 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleAnweisung1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnweisung1383 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAnweisung1395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnweisung1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKOT_in_entryRuleKOT1456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKOT1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_ruleKOT1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_ruleKOT1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_ruleKOT1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVOT_in_entryRuleVOT1602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVOT1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleVOT1658 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleVOT1671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVOT1688 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVOT1705 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleVOT1726 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleVOT1748 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleVOT1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOOT_in_entryRuleOOT1797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOOT1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleOOT1853 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOOT1866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOOT1883 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOOT1900 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleOOT1921 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleOOT1943 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleOOT1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOT_in_entryRuleLOT1992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOT2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleLOT2048 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLOT2061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLOT2078 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLOT2095 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleLOT2116 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleLOT2138 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleLOT2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOT_in_entryRuleTOT2187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTOT2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTOT2243 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTOT2256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTOT2273 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTOT2290 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleTOT2311 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleTOT2333 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleTOT2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeziehung_in_entryRuleBeziehung2382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeziehung2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_a_in_ruleBeziehung2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_ruleBeziehung2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_ruleBeziehung2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteracts_with_in_entryRuleInteracts_with2528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteracts_with2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleInteracts_with2584 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_ruleInteracts_with2598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteracts_with2620 = new BitSet(new long[]{0x00000033C0000000L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_ruleInteracts_with2643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_ruleInteracts_with2662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_ruleInteracts_with2681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInteracts_with2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_a_in_entryRuleIs_a2740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_a2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleIs_a2796 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleIs_a2809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_a2829 = new BitSet(new long[]{0x0000000CC0000000L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_ruleIs_a2852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_ruleIs_a2871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_a2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIs_part_of_in_entryRuleIs_part_of2930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIs_part_of2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleIs_part_of2986 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleIs_part_of2999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_part_of3019 = new BitSet(new long[]{0x00000033C0000000L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_ruleIs_part_of3042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_ruleIs_part_of3061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_ruleIs_part_of3080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIs_part_of3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet01_in_entryRuleKardinalitaet013141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet013151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleKardinalitaet013189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleKardinalitaet013207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet0x_in_entryRuleKardinalitaet0x3253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet0x3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleKardinalitaet0x3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleKardinalitaet0x3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet11_in_entryRuleKardinalitaet113365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet113375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleKardinalitaet113413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleKardinalitaet113431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKardinalitaet1x_in_entryRuleKardinalitaet1x3477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKardinalitaet1x3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleKardinalitaet1x3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleKardinalitaet1x3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation3589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleAnnotation3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_ruleAnnotation3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_ruleAnnotation3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName3735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleName3782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMerge_in_entryRuleMerge3840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMerge3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleMerge3887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMerge3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIgnore_in_entryRuleIgnore3945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIgnore3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleIgnore3992 = new BitSet(new long[]{0x0000000000000002L});

}
