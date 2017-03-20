package de.uniba.wiai.seda.fha.swarchitektur.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uniba.wiai.seda.fha.swarchitektur.services.SwarchitekturGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSwarchitekturParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'JavaEEArchitektur:'", "'v'", "'package'", "'{'", "'}'", "'BusinessInterface'", "'();'", "'StatefulSessionBean'", "';'", "'()'", "'.'", "'StatelessSessionBean'", "'JPAEntity'", "'MessageDrivenBean'", "'SingletonSessionBean'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSwarchitekturParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSwarchitekturParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSwarchitekturParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g"; }



     	private SwarchitekturGrammarAccess grammarAccess;
     	
        public InternalSwarchitekturParser(TokenStream input, SwarchitekturGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Architektur";	
       	}
       	
       	@Override
       	protected SwarchitekturGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleArchitektur"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:67:1: entryRuleArchitektur returns [EObject current=null] : iv_ruleArchitektur= ruleArchitektur EOF ;
    public final EObject entryRuleArchitektur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitektur = null;


        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:68:2: (iv_ruleArchitektur= ruleArchitektur EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:69:2: iv_ruleArchitektur= ruleArchitektur EOF
            {
             newCompositeNode(grammarAccess.getArchitekturRule()); 
            pushFollow(FOLLOW_ruleArchitektur_in_entryRuleArchitektur75);
            iv_ruleArchitektur=ruleArchitektur();

            state._fsp--;

             current =iv_ruleArchitektur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitektur85); 

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
    // $ANTLR end "entryRuleArchitektur"


    // $ANTLR start "ruleArchitektur"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:76:1: ruleArchitektur returns [EObject current=null] : (otherlv_0= 'JavaEEArchitektur:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_ID ) ) )? ( (lv_pakete_4_0= rulePackage ) )* ) ;
    public final EObject ruleArchitektur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_version_3_0=null;
        EObject lv_pakete_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:79:28: ( (otherlv_0= 'JavaEEArchitektur:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_ID ) ) )? ( (lv_pakete_4_0= rulePackage ) )* ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:80:1: (otherlv_0= 'JavaEEArchitektur:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_ID ) ) )? ( (lv_pakete_4_0= rulePackage ) )* )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:80:1: (otherlv_0= 'JavaEEArchitektur:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_ID ) ) )? ( (lv_pakete_4_0= rulePackage ) )* )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:80:3: otherlv_0= 'JavaEEArchitektur:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'v' ( (lv_version_3_0= RULE_ID ) ) )? ( (lv_pakete_4_0= rulePackage ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleArchitektur122); 

                	newLeafNode(otherlv_0, grammarAccess.getArchitekturAccess().getJavaEEArchitekturKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:85:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArchitektur139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getArchitekturAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArchitekturRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:102:2: (otherlv_2= 'v' ( (lv_version_3_0= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:102:4: otherlv_2= 'v' ( (lv_version_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleArchitektur157); 

                        	newLeafNode(otherlv_2, grammarAccess.getArchitekturAccess().getVKeyword_2_0());
                        
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:106:1: ( (lv_version_3_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:107:1: (lv_version_3_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:107:1: (lv_version_3_0= RULE_ID )
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:108:3: lv_version_3_0= RULE_ID
                    {
                    lv_version_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArchitektur174); 

                    			newLeafNode(lv_version_3_0, grammarAccess.getArchitekturAccess().getVersionIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArchitekturRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"version",
                            		lv_version_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:124:4: ( (lv_pakete_4_0= rulePackage ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:125:1: (lv_pakete_4_0= rulePackage )
            	    {
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:125:1: (lv_pakete_4_0= rulePackage )
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:126:3: lv_pakete_4_0= rulePackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArchitekturAccess().getPaketePackageParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackage_in_ruleArchitektur202);
            	    lv_pakete_4_0=rulePackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArchitekturRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pakete",
            	            		lv_pakete_4_0, 
            	            		"Package");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleArchitektur"


    // $ANTLR start "entryRulePackage"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:150:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:151:2: (iv_rulePackage= rulePackage EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:152:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage239);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage249); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:159:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_komponenten_3_0= ruleEJB ) ) | ( (lv_entities_4_0= ruleJPAEntity ) ) | ( (lv_pakete_5_0= rulePackage ) ) )+ otherlv_6= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_komponenten_3_0 = null;

        EObject lv_entities_4_0 = null;

        EObject lv_pakete_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:162:28: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_komponenten_3_0= ruleEJB ) ) | ( (lv_entities_4_0= ruleJPAEntity ) ) | ( (lv_pakete_5_0= rulePackage ) ) )+ otherlv_6= '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:163:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_komponenten_3_0= ruleEJB ) ) | ( (lv_entities_4_0= ruleJPAEntity ) ) | ( (lv_pakete_5_0= rulePackage ) ) )+ otherlv_6= '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:163:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_komponenten_3_0= ruleEJB ) ) | ( (lv_entities_4_0= ruleJPAEntity ) ) | ( (lv_pakete_5_0= rulePackage ) ) )+ otherlv_6= '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:163:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_komponenten_3_0= ruleEJB ) ) | ( (lv_entities_4_0= ruleJPAEntity ) ) | ( (lv_pakete_5_0= rulePackage ) ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePackage286); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:167:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:168:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:168:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:169:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage303); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_rulePackage320); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:189:1: ( ( (lv_komponenten_3_0= ruleEJB ) ) | ( (lv_entities_4_0= ruleJPAEntity ) ) | ( (lv_pakete_5_0= rulePackage ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 16:
                case 18:
                case 22:
                case 24:
                case 25:
                    {
                    alt3=1;
                    }
                    break;
                case 23:
                    {
                    alt3=2;
                    }
                    break;
                case 13:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:189:2: ( (lv_komponenten_3_0= ruleEJB ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:189:2: ( (lv_komponenten_3_0= ruleEJB ) )
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:190:1: (lv_komponenten_3_0= ruleEJB )
            	    {
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:190:1: (lv_komponenten_3_0= ruleEJB )
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:191:3: lv_komponenten_3_0= ruleEJB
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getKomponentenEJBParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEJB_in_rulePackage342);
            	    lv_komponenten_3_0=ruleEJB();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"komponenten",
            	            		lv_komponenten_3_0, 
            	            		"EJB");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:208:6: ( (lv_entities_4_0= ruleJPAEntity ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:208:6: ( (lv_entities_4_0= ruleJPAEntity ) )
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:209:1: (lv_entities_4_0= ruleJPAEntity )
            	    {
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:209:1: (lv_entities_4_0= ruleJPAEntity )
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:210:3: lv_entities_4_0= ruleJPAEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getEntitiesJPAEntityParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJPAEntity_in_rulePackage369);
            	    lv_entities_4_0=ruleJPAEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_4_0, 
            	            		"JPAEntity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:227:6: ( (lv_pakete_5_0= rulePackage ) )
            	    {
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:227:6: ( (lv_pakete_5_0= rulePackage ) )
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:228:1: (lv_pakete_5_0= rulePackage )
            	    {
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:228:1: (lv_pakete_5_0= rulePackage )
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:229:3: lv_pakete_5_0= rulePackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getPaketePackageParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackage_in_rulePackage396);
            	    lv_pakete_5_0=rulePackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pakete",
            	            		lv_pakete_5_0, 
            	            		"Package");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_rulePackage410); 

                	newLeafNode(otherlv_6, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleEJB"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:257:1: entryRuleEJB returns [EObject current=null] : iv_ruleEJB= ruleEJB EOF ;
    public final EObject entryRuleEJB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJB = null;


        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:258:2: (iv_ruleEJB= ruleEJB EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:259:2: iv_ruleEJB= ruleEJB EOF
            {
             newCompositeNode(grammarAccess.getEJBRule()); 
            pushFollow(FOLLOW_ruleEJB_in_entryRuleEJB446);
            iv_ruleEJB=ruleEJB();

            state._fsp--;

             current =iv_ruleEJB; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEJB456); 

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
    // $ANTLR end "entryRuleEJB"


    // $ANTLR start "ruleEJB"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:266:1: ruleEJB returns [EObject current=null] : (this_SessionBean_0= ruleSessionBean | this_MessageDrivenBean_1= ruleMessageDrivenBean | this_BusinessInterface_2= ruleBusinessInterface ) ;
    public final EObject ruleEJB() throws RecognitionException {
        EObject current = null;

        EObject this_SessionBean_0 = null;

        EObject this_MessageDrivenBean_1 = null;

        EObject this_BusinessInterface_2 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:269:28: ( (this_SessionBean_0= ruleSessionBean | this_MessageDrivenBean_1= ruleMessageDrivenBean | this_BusinessInterface_2= ruleBusinessInterface ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:270:1: (this_SessionBean_0= ruleSessionBean | this_MessageDrivenBean_1= ruleMessageDrivenBean | this_BusinessInterface_2= ruleBusinessInterface )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:270:1: (this_SessionBean_0= ruleSessionBean | this_MessageDrivenBean_1= ruleMessageDrivenBean | this_BusinessInterface_2= ruleBusinessInterface )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
            case 22:
            case 25:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:271:5: this_SessionBean_0= ruleSessionBean
                    {
                     
                            newCompositeNode(grammarAccess.getEJBAccess().getSessionBeanParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSessionBean_in_ruleEJB503);
                    this_SessionBean_0=ruleSessionBean();

                    state._fsp--;

                     
                            current = this_SessionBean_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:281:5: this_MessageDrivenBean_1= ruleMessageDrivenBean
                    {
                     
                            newCompositeNode(grammarAccess.getEJBAccess().getMessageDrivenBeanParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMessageDrivenBean_in_ruleEJB530);
                    this_MessageDrivenBean_1=ruleMessageDrivenBean();

                    state._fsp--;

                     
                            current = this_MessageDrivenBean_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:291:5: this_BusinessInterface_2= ruleBusinessInterface
                    {
                     
                            newCompositeNode(grammarAccess.getEJBAccess().getBusinessInterfaceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBusinessInterface_in_ruleEJB557);
                    this_BusinessInterface_2=ruleBusinessInterface();

                    state._fsp--;

                     
                            current = this_BusinessInterface_2; 
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
    // $ANTLR end "ruleEJB"


    // $ANTLR start "entryRuleSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:307:1: entryRuleSessionBean returns [EObject current=null] : iv_ruleSessionBean= ruleSessionBean EOF ;
    public final EObject entryRuleSessionBean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSessionBean = null;


        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:308:2: (iv_ruleSessionBean= ruleSessionBean EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:309:2: iv_ruleSessionBean= ruleSessionBean EOF
            {
             newCompositeNode(grammarAccess.getSessionBeanRule()); 
            pushFollow(FOLLOW_ruleSessionBean_in_entryRuleSessionBean592);
            iv_ruleSessionBean=ruleSessionBean();

            state._fsp--;

             current =iv_ruleSessionBean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSessionBean602); 

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
    // $ANTLR end "entryRuleSessionBean"


    // $ANTLR start "ruleSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:316:1: ruleSessionBean returns [EObject current=null] : (this_StatelessSessionBean_0= ruleStatelessSessionBean | this_StatefulSessionBean_1= ruleStatefulSessionBean | this_SingletonSessionBean_2= ruleSingletonSessionBean ) ;
    public final EObject ruleSessionBean() throws RecognitionException {
        EObject current = null;

        EObject this_StatelessSessionBean_0 = null;

        EObject this_StatefulSessionBean_1 = null;

        EObject this_SingletonSessionBean_2 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:319:28: ( (this_StatelessSessionBean_0= ruleStatelessSessionBean | this_StatefulSessionBean_1= ruleStatefulSessionBean | this_SingletonSessionBean_2= ruleSingletonSessionBean ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:320:1: (this_StatelessSessionBean_0= ruleStatelessSessionBean | this_StatefulSessionBean_1= ruleStatefulSessionBean | this_SingletonSessionBean_2= ruleSingletonSessionBean )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:320:1: (this_StatelessSessionBean_0= ruleStatelessSessionBean | this_StatefulSessionBean_1= ruleStatefulSessionBean | this_SingletonSessionBean_2= ruleSingletonSessionBean )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 25:
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
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:321:5: this_StatelessSessionBean_0= ruleStatelessSessionBean
                    {
                     
                            newCompositeNode(grammarAccess.getSessionBeanAccess().getStatelessSessionBeanParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStatelessSessionBean_in_ruleSessionBean649);
                    this_StatelessSessionBean_0=ruleStatelessSessionBean();

                    state._fsp--;

                     
                            current = this_StatelessSessionBean_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:331:5: this_StatefulSessionBean_1= ruleStatefulSessionBean
                    {
                     
                            newCompositeNode(grammarAccess.getSessionBeanAccess().getStatefulSessionBeanParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStatefulSessionBean_in_ruleSessionBean676);
                    this_StatefulSessionBean_1=ruleStatefulSessionBean();

                    state._fsp--;

                     
                            current = this_StatefulSessionBean_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:341:5: this_SingletonSessionBean_2= ruleSingletonSessionBean
                    {
                     
                            newCompositeNode(grammarAccess.getSessionBeanAccess().getSingletonSessionBeanParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSingletonSessionBean_in_ruleSessionBean703);
                    this_SingletonSessionBean_2=ruleSingletonSessionBean();

                    state._fsp--;

                     
                            current = this_SingletonSessionBean_2; 
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
    // $ANTLR end "ruleSessionBean"


    // $ANTLR start "entryRuleBusinessInterface"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:357:1: entryRuleBusinessInterface returns [EObject current=null] : iv_ruleBusinessInterface= ruleBusinessInterface EOF ;
    public final EObject entryRuleBusinessInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessInterface = null;


        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:358:2: (iv_ruleBusinessInterface= ruleBusinessInterface EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:359:2: iv_ruleBusinessInterface= ruleBusinessInterface EOF
            {
             newCompositeNode(grammarAccess.getBusinessInterfaceRule()); 
            pushFollow(FOLLOW_ruleBusinessInterface_in_entryRuleBusinessInterface738);
            iv_ruleBusinessInterface=ruleBusinessInterface();

            state._fsp--;

             current =iv_ruleBusinessInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessInterface748); 

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
    // $ANTLR end "entryRuleBusinessInterface"


    // $ANTLR start "ruleBusinessInterface"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:366:1: ruleBusinessInterface returns [EObject current=null] : (otherlv_0= 'BusinessInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methoden_3_0= ruleMethodensignatur ) )* otherlv_4= '}' ) ;
    public final EObject ruleBusinessInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_methoden_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:369:28: ( (otherlv_0= 'BusinessInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methoden_3_0= ruleMethodensignatur ) )* otherlv_4= '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:370:1: (otherlv_0= 'BusinessInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methoden_3_0= ruleMethodensignatur ) )* otherlv_4= '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:370:1: (otherlv_0= 'BusinessInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methoden_3_0= ruleMethodensignatur ) )* otherlv_4= '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:370:3: otherlv_0= 'BusinessInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methoden_3_0= ruleMethodensignatur ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleBusinessInterface785); 

                	newLeafNode(otherlv_0, grammarAccess.getBusinessInterfaceAccess().getBusinessInterfaceKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:374:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:375:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:375:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:376:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessInterface802); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBusinessInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBusinessInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleBusinessInterface819); 

                	newLeafNode(otherlv_2, grammarAccess.getBusinessInterfaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:396:1: ( (lv_methoden_3_0= ruleMethodensignatur ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:397:1: (lv_methoden_3_0= ruleMethodensignatur )
            	    {
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:397:1: (lv_methoden_3_0= ruleMethodensignatur )
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:398:3: lv_methoden_3_0= ruleMethodensignatur
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBusinessInterfaceAccess().getMethodenMethodensignaturParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethodensignatur_in_ruleBusinessInterface840);
            	    lv_methoden_3_0=ruleMethodensignatur();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBusinessInterfaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methoden",
            	            		lv_methoden_3_0, 
            	            		"Methodensignatur");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleBusinessInterface853); 

                	newLeafNode(otherlv_4, grammarAccess.getBusinessInterfaceAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleBusinessInterface"


    // $ANTLR start "entryRuleMethodensignatur"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:426:1: entryRuleMethodensignatur returns [EObject current=null] : iv_ruleMethodensignatur= ruleMethodensignatur EOF ;
    public final EObject entryRuleMethodensignatur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodensignatur = null;


        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:427:2: (iv_ruleMethodensignatur= ruleMethodensignatur EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:428:2: iv_ruleMethodensignatur= ruleMethodensignatur EOF
            {
             newCompositeNode(grammarAccess.getMethodensignaturRule()); 
            pushFollow(FOLLOW_ruleMethodensignatur_in_entryRuleMethodensignatur889);
            iv_ruleMethodensignatur=ruleMethodensignatur();

            state._fsp--;

             current =iv_ruleMethodensignatur; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodensignatur899); 

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
    // $ANTLR end "entryRuleMethodensignatur"


    // $ANTLR start "ruleMethodensignatur"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:435:1: ruleMethodensignatur returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '();' ) ;
    public final EObject ruleMethodensignatur() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:438:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '();' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:439:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '();' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:439:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '();' )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:439:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '();'
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:439:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:440:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:440:1: (lv_name_0_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:441:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodensignatur941); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMethodensignaturAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodensignaturRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleMethodensignatur958); 

                	newLeafNode(otherlv_1, grammarAccess.getMethodensignaturAccess().getLeftParenthesisRightParenthesisSemicolonKeyword_1());
                

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
    // $ANTLR end "ruleMethodensignatur"


    // $ANTLR start "entryRuleStatefulSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:469:1: entryRuleStatefulSessionBean returns [EObject current=null] : iv_ruleStatefulSessionBean= ruleStatefulSessionBean EOF ;
    public final EObject entryRuleStatefulSessionBean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatefulSessionBean = null;


        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:470:2: (iv_ruleStatefulSessionBean= ruleStatefulSessionBean EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:471:2: iv_ruleStatefulSessionBean= ruleStatefulSessionBean EOF
            {
             newCompositeNode(grammarAccess.getStatefulSessionBeanRule()); 
            pushFollow(FOLLOW_ruleStatefulSessionBean_in_entryRuleStatefulSessionBean994);
            iv_ruleStatefulSessionBean=ruleStatefulSessionBean();

            state._fsp--;

             current =iv_ruleStatefulSessionBean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatefulSessionBean1004); 

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
    // $ANTLR end "entryRuleStatefulSessionBean"


    // $ANTLR start "ruleStatefulSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:478:1: ruleStatefulSessionBean returns [EObject current=null] : (otherlv_0= 'StatefulSessionBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribut ) )* ( (lv_methode_4_0= ruleMethode ) )* otherlv_5= '}' ) ;
    public final EObject ruleStatefulSessionBean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_attribute_3_0 = null;

        EObject lv_methode_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:481:28: ( (otherlv_0= 'StatefulSessionBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribut ) )* ( (lv_methode_4_0= ruleMethode ) )* otherlv_5= '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:482:1: (otherlv_0= 'StatefulSessionBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribut ) )* ( (lv_methode_4_0= ruleMethode ) )* otherlv_5= '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:482:1: (otherlv_0= 'StatefulSessionBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribut ) )* ( (lv_methode_4_0= ruleMethode ) )* otherlv_5= '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:482:3: otherlv_0= 'StatefulSessionBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribut ) )* ( (lv_methode_4_0= ruleMethode ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleStatefulSessionBean1041); 

                	newLeafNode(otherlv_0, grammarAccess.getStatefulSessionBeanAccess().getStatefulSessionBeanKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:486:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:487:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:487:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:488:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatefulSessionBean1058); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStatefulSessionBeanAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStatefulSessionBeanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleStatefulSessionBean1075); 

                	newLeafNode(otherlv_2, grammarAccess.getStatefulSessionBeanAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:508:1: ( (lv_attribute_3_0= ruleAttribut ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==RULE_ID) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:509:1: (lv_attribute_3_0= ruleAttribut )
            	    {
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:509:1: (lv_attribute_3_0= ruleAttribut )
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:510:3: lv_attribute_3_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatefulSessionBeanAccess().getAttributeAttributParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleStatefulSessionBean1096);
            	    lv_attribute_3_0=ruleAttribut();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatefulSessionBeanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_3_0, 
            	            		"Attribut");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:526:3: ( (lv_methode_4_0= ruleMethode ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:527:1: (lv_methode_4_0= ruleMethode )
            	    {
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:527:1: (lv_methode_4_0= ruleMethode )
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:528:3: lv_methode_4_0= ruleMethode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatefulSessionBeanAccess().getMethodeMethodeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethode_in_ruleStatefulSessionBean1118);
            	    lv_methode_4_0=ruleMethode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatefulSessionBeanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methode",
            	            		lv_methode_4_0, 
            	            		"Methode");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleStatefulSessionBean1131); 

                	newLeafNode(otherlv_5, grammarAccess.getStatefulSessionBeanAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleStatefulSessionBean"


    // $ANTLR start "entryRuleAttribut"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:556:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:557:2: (iv_ruleAttribut= ruleAttribut EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:558:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_ruleAttribut_in_entryRuleAttribut1167);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribut1177); 

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
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:565:1: ruleAttribut returns [EObject current=null] : ( ( (lv_typ_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token lv_typ_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:568:28: ( ( ( (lv_typ_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:569:1: ( ( (lv_typ_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:569:1: ( ( (lv_typ_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:569:2: ( (lv_typ_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:569:2: ( (lv_typ_0_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:570:1: (lv_typ_0_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:570:1: (lv_typ_0_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:571:3: lv_typ_0_0= RULE_ID
            {
            lv_typ_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribut1219); 

            			newLeafNode(lv_typ_0_0, grammarAccess.getAttributAccess().getTypIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"typ",
                    		lv_typ_0_0, 
                    		"ID");
            	    

            }


            }

            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:587:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:588:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:588:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:589:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribut1241); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleAttribut1258); 

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


    // $ANTLR start "entryRuleMethode"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:617:1: entryRuleMethode returns [EObject current=null] : iv_ruleMethode= ruleMethode EOF ;
    public final EObject entryRuleMethode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethode = null;


        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:618:2: (iv_ruleMethode= ruleMethode EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:619:2: iv_ruleMethode= ruleMethode EOF
            {
             newCompositeNode(grammarAccess.getMethodeRule()); 
            pushFollow(FOLLOW_ruleMethode_in_entryRuleMethode1294);
            iv_ruleMethode=ruleMethode();

            state._fsp--;

             current =iv_ruleMethode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethode1304); 

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
    // $ANTLR end "entryRuleMethode"


    // $ANTLR start "ruleMethode"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:626:1: ruleMethode returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '()' otherlv_2= '{' ( (lv_aufruf_3_0= ruleAufruf ) )* otherlv_4= '}' ) ;
    public final EObject ruleMethode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_aufruf_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:629:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '()' otherlv_2= '{' ( (lv_aufruf_3_0= ruleAufruf ) )* otherlv_4= '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:630:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '()' otherlv_2= '{' ( (lv_aufruf_3_0= ruleAufruf ) )* otherlv_4= '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:630:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '()' otherlv_2= '{' ( (lv_aufruf_3_0= ruleAufruf ) )* otherlv_4= '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:630:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '()' otherlv_2= '{' ( (lv_aufruf_3_0= ruleAufruf ) )* otherlv_4= '}'
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:630:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:631:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:631:1: (lv_name_0_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:632:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethode1346); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleMethode1363); 

                	newLeafNode(otherlv_1, grammarAccess.getMethodeAccess().getLeftParenthesisRightParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleMethode1375); 

                	newLeafNode(otherlv_2, grammarAccess.getMethodeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:656:1: ( (lv_aufruf_3_0= ruleAufruf ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:657:1: (lv_aufruf_3_0= ruleAufruf )
            	    {
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:657:1: (lv_aufruf_3_0= ruleAufruf )
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:658:3: lv_aufruf_3_0= ruleAufruf
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodeAccess().getAufrufAufrufParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAufruf_in_ruleMethode1396);
            	    lv_aufruf_3_0=ruleAufruf();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"aufruf",
            	            		lv_aufruf_3_0, 
            	            		"Aufruf");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleMethode1409); 

                	newLeafNode(otherlv_4, grammarAccess.getMethodeAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleMethode"


    // $ANTLR start "entryRuleAufruf"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:686:1: entryRuleAufruf returns [EObject current=null] : iv_ruleAufruf= ruleAufruf EOF ;
    public final EObject entryRuleAufruf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAufruf = null;


        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:687:2: (iv_ruleAufruf= ruleAufruf EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:688:2: iv_ruleAufruf= ruleAufruf EOF
            {
             newCompositeNode(grammarAccess.getAufrufRule()); 
            pushFollow(FOLLOW_ruleAufruf_in_entryRuleAufruf1445);
            iv_ruleAufruf=ruleAufruf();

            state._fsp--;

             current =iv_ruleAufruf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAufruf1455); 

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
    // $ANTLR end "entryRuleAufruf"


    // $ANTLR start "ruleAufruf"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:695:1: ruleAufruf returns [EObject current=null] : ( ( ( (lv_objekt_0_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_methode_2_0= ruleMethodensignatur ) ) ) ;
    public final EObject ruleAufruf() throws RecognitionException {
        EObject current = null;

        Token lv_objekt_0_0=null;
        Token otherlv_1=null;
        EObject lv_methode_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:698:28: ( ( ( ( (lv_objekt_0_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_methode_2_0= ruleMethodensignatur ) ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:699:1: ( ( ( (lv_objekt_0_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_methode_2_0= ruleMethodensignatur ) ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:699:1: ( ( ( (lv_objekt_0_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_methode_2_0= ruleMethodensignatur ) ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:699:2: ( ( (lv_objekt_0_0= RULE_ID ) ) otherlv_1= '.' )? ( (lv_methode_2_0= ruleMethodensignatur ) )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:699:2: ( ( (lv_objekt_0_0= RULE_ID ) ) otherlv_1= '.' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==21) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:699:3: ( (lv_objekt_0_0= RULE_ID ) ) otherlv_1= '.'
                    {
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:699:3: ( (lv_objekt_0_0= RULE_ID ) )
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:700:1: (lv_objekt_0_0= RULE_ID )
                    {
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:700:1: (lv_objekt_0_0= RULE_ID )
                    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:701:3: lv_objekt_0_0= RULE_ID
                    {
                    lv_objekt_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAufruf1498); 

                    			newLeafNode(lv_objekt_0_0, grammarAccess.getAufrufAccess().getObjektIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAufrufRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"objekt",
                            		lv_objekt_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAufruf1515); 

                        	newLeafNode(otherlv_1, grammarAccess.getAufrufAccess().getFullStopKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:721:3: ( (lv_methode_2_0= ruleMethodensignatur ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:722:1: (lv_methode_2_0= ruleMethodensignatur )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:722:1: (lv_methode_2_0= ruleMethodensignatur )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:723:3: lv_methode_2_0= ruleMethodensignatur
            {
             
            	        newCompositeNode(grammarAccess.getAufrufAccess().getMethodeMethodensignaturParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMethodensignatur_in_ruleAufruf1538);
            lv_methode_2_0=ruleMethodensignatur();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAufrufRule());
            	        }
                   		set(
                   			current, 
                   			"methode",
                    		lv_methode_2_0, 
                    		"Methodensignatur");
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
    // $ANTLR end "ruleAufruf"


    // $ANTLR start "entryRuleStatelessSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:747:1: entryRuleStatelessSessionBean returns [EObject current=null] : iv_ruleStatelessSessionBean= ruleStatelessSessionBean EOF ;
    public final EObject entryRuleStatelessSessionBean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatelessSessionBean = null;


        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:748:2: (iv_ruleStatelessSessionBean= ruleStatelessSessionBean EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:749:2: iv_ruleStatelessSessionBean= ruleStatelessSessionBean EOF
            {
             newCompositeNode(grammarAccess.getStatelessSessionBeanRule()); 
            pushFollow(FOLLOW_ruleStatelessSessionBean_in_entryRuleStatelessSessionBean1574);
            iv_ruleStatelessSessionBean=ruleStatelessSessionBean();

            state._fsp--;

             current =iv_ruleStatelessSessionBean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatelessSessionBean1584); 

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
    // $ANTLR end "entryRuleStatelessSessionBean"


    // $ANTLR start "ruleStatelessSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:756:1: ruleStatelessSessionBean returns [EObject current=null] : (otherlv_0= 'StatelessSessionBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methode_3_0= ruleMethode ) )* otherlv_4= '}' ) ;
    public final EObject ruleStatelessSessionBean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_methode_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:759:28: ( (otherlv_0= 'StatelessSessionBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methode_3_0= ruleMethode ) )* otherlv_4= '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:760:1: (otherlv_0= 'StatelessSessionBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methode_3_0= ruleMethode ) )* otherlv_4= '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:760:1: (otherlv_0= 'StatelessSessionBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methode_3_0= ruleMethode ) )* otherlv_4= '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:760:3: otherlv_0= 'StatelessSessionBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methode_3_0= ruleMethode ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleStatelessSessionBean1621); 

                	newLeafNode(otherlv_0, grammarAccess.getStatelessSessionBeanAccess().getStatelessSessionBeanKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:764:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:765:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:765:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:766:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatelessSessionBean1638); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStatelessSessionBeanAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStatelessSessionBeanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleStatelessSessionBean1655); 

                	newLeafNode(otherlv_2, grammarAccess.getStatelessSessionBeanAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:786:1: ( (lv_methode_3_0= ruleMethode ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:787:1: (lv_methode_3_0= ruleMethode )
            	    {
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:787:1: (lv_methode_3_0= ruleMethode )
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:788:3: lv_methode_3_0= ruleMethode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatelessSessionBeanAccess().getMethodeMethodeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethode_in_ruleStatelessSessionBean1676);
            	    lv_methode_3_0=ruleMethode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatelessSessionBeanRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methode",
            	            		lv_methode_3_0, 
            	            		"Methode");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleStatelessSessionBean1689); 

                	newLeafNode(otherlv_4, grammarAccess.getStatelessSessionBeanAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleStatelessSessionBean"


    // $ANTLR start "entryRuleJPAEntity"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:816:1: entryRuleJPAEntity returns [EObject current=null] : iv_ruleJPAEntity= ruleJPAEntity EOF ;
    public final EObject entryRuleJPAEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJPAEntity = null;


        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:817:2: (iv_ruleJPAEntity= ruleJPAEntity EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:818:2: iv_ruleJPAEntity= ruleJPAEntity EOF
            {
             newCompositeNode(grammarAccess.getJPAEntityRule()); 
            pushFollow(FOLLOW_ruleJPAEntity_in_entryRuleJPAEntity1725);
            iv_ruleJPAEntity=ruleJPAEntity();

            state._fsp--;

             current =iv_ruleJPAEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJPAEntity1735); 

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
    // $ANTLR end "entryRuleJPAEntity"


    // $ANTLR start "ruleJPAEntity"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:825:1: ruleJPAEntity returns [EObject current=null] : (otherlv_0= 'JPAEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribut ) )* ( (lv_methode_4_0= ruleMethode ) )* otherlv_5= '}' ) ;
    public final EObject ruleJPAEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_attribute_3_0 = null;

        EObject lv_methode_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:828:28: ( (otherlv_0= 'JPAEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribut ) )* ( (lv_methode_4_0= ruleMethode ) )* otherlv_5= '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:829:1: (otherlv_0= 'JPAEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribut ) )* ( (lv_methode_4_0= ruleMethode ) )* otherlv_5= '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:829:1: (otherlv_0= 'JPAEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribut ) )* ( (lv_methode_4_0= ruleMethode ) )* otherlv_5= '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:829:3: otherlv_0= 'JPAEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribut ) )* ( (lv_methode_4_0= ruleMethode ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleJPAEntity1772); 

                	newLeafNode(otherlv_0, grammarAccess.getJPAEntityAccess().getJPAEntityKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:833:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:834:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:834:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:835:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJPAEntity1789); 

            			newLeafNode(lv_name_1_0, grammarAccess.getJPAEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJPAEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleJPAEntity1806); 

                	newLeafNode(otherlv_2, grammarAccess.getJPAEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:855:1: ( (lv_attribute_3_0= ruleAttribut ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==RULE_ID) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:856:1: (lv_attribute_3_0= ruleAttribut )
            	    {
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:856:1: (lv_attribute_3_0= ruleAttribut )
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:857:3: lv_attribute_3_0= ruleAttribut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJPAEntityAccess().getAttributeAttributParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribut_in_ruleJPAEntity1827);
            	    lv_attribute_3_0=ruleAttribut();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJPAEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_3_0, 
            	            		"Attribut");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:873:3: ( (lv_methode_4_0= ruleMethode ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:874:1: (lv_methode_4_0= ruleMethode )
            	    {
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:874:1: (lv_methode_4_0= ruleMethode )
            	    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:875:3: lv_methode_4_0= ruleMethode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJPAEntityAccess().getMethodeMethodeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethode_in_ruleJPAEntity1849);
            	    lv_methode_4_0=ruleMethode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJPAEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methode",
            	            		lv_methode_4_0, 
            	            		"Methode");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleJPAEntity1862); 

                	newLeafNode(otherlv_5, grammarAccess.getJPAEntityAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleJPAEntity"


    // $ANTLR start "entryRuleMessageDrivenBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:903:1: entryRuleMessageDrivenBean returns [EObject current=null] : iv_ruleMessageDrivenBean= ruleMessageDrivenBean EOF ;
    public final EObject entryRuleMessageDrivenBean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDrivenBean = null;


        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:904:2: (iv_ruleMessageDrivenBean= ruleMessageDrivenBean EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:905:2: iv_ruleMessageDrivenBean= ruleMessageDrivenBean EOF
            {
             newCompositeNode(grammarAccess.getMessageDrivenBeanRule()); 
            pushFollow(FOLLOW_ruleMessageDrivenBean_in_entryRuleMessageDrivenBean1898);
            iv_ruleMessageDrivenBean=ruleMessageDrivenBean();

            state._fsp--;

             current =iv_ruleMessageDrivenBean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageDrivenBean1908); 

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
    // $ANTLR end "entryRuleMessageDrivenBean"


    // $ANTLR start "ruleMessageDrivenBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:912:1: ruleMessageDrivenBean returns [EObject current=null] : (otherlv_0= 'MessageDrivenBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleMessageDrivenBean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:915:28: ( (otherlv_0= 'MessageDrivenBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:916:1: (otherlv_0= 'MessageDrivenBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:916:1: (otherlv_0= 'MessageDrivenBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:916:3: otherlv_0= 'MessageDrivenBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleMessageDrivenBean1945); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageDrivenBeanAccess().getMessageDrivenBeanKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:920:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:921:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:921:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:922:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageDrivenBean1962); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMessageDrivenBeanAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageDrivenBeanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleMessageDrivenBean1979); 

                	newLeafNode(otherlv_2, grammarAccess.getMessageDrivenBeanAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleMessageDrivenBean1991); 

                	newLeafNode(otherlv_3, grammarAccess.getMessageDrivenBeanAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleMessageDrivenBean"


    // $ANTLR start "entryRuleSingletonSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:954:1: entryRuleSingletonSessionBean returns [EObject current=null] : iv_ruleSingletonSessionBean= ruleSingletonSessionBean EOF ;
    public final EObject entryRuleSingletonSessionBean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingletonSessionBean = null;


        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:955:2: (iv_ruleSingletonSessionBean= ruleSingletonSessionBean EOF )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:956:2: iv_ruleSingletonSessionBean= ruleSingletonSessionBean EOF
            {
             newCompositeNode(grammarAccess.getSingletonSessionBeanRule()); 
            pushFollow(FOLLOW_ruleSingletonSessionBean_in_entryRuleSingletonSessionBean2027);
            iv_ruleSingletonSessionBean=ruleSingletonSessionBean();

            state._fsp--;

             current =iv_ruleSingletonSessionBean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingletonSessionBean2037); 

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
    // $ANTLR end "entryRuleSingletonSessionBean"


    // $ANTLR start "ruleSingletonSessionBean"
    // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:963:1: ruleSingletonSessionBean returns [EObject current=null] : (otherlv_0= 'SingletonSessionBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleSingletonSessionBean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:966:28: ( (otherlv_0= 'SingletonSessionBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:967:1: (otherlv_0= 'SingletonSessionBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:967:1: (otherlv_0= 'SingletonSessionBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:967:3: otherlv_0= 'SingletonSessionBean' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleSingletonSessionBean2074); 

                	newLeafNode(otherlv_0, grammarAccess.getSingletonSessionBeanAccess().getSingletonSessionBeanKeyword_0());
                
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:971:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:972:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:972:1: (lv_name_1_0= RULE_ID )
            // ../de.uniba.wiai.seda.fha.swarchitektur/src-gen/de/uniba/wiai/seda/fha/swarchitektur/parser/antlr/internal/InternalSwarchitektur.g:973:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingletonSessionBean2091); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSingletonSessionBeanAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingletonSessionBeanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSingletonSessionBean2108); 

                	newLeafNode(otherlv_2, grammarAccess.getSingletonSessionBeanAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSingletonSessionBean2120); 

                	newLeafNode(otherlv_3, grammarAccess.getSingletonSessionBeanAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleSingletonSessionBean"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleArchitektur_in_entryRuleArchitektur75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitektur85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleArchitektur122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArchitektur139 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_ruleArchitektur157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArchitektur174 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleArchitektur202 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePackage286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage303 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackage320 = new BitSet(new long[]{0x0000000003C52000L});
    public static final BitSet FOLLOW_ruleEJB_in_rulePackage342 = new BitSet(new long[]{0x0000000003C5A000L});
    public static final BitSet FOLLOW_ruleJPAEntity_in_rulePackage369 = new BitSet(new long[]{0x0000000003C5A000L});
    public static final BitSet FOLLOW_rulePackage_in_rulePackage396 = new BitSet(new long[]{0x0000000003C5A000L});
    public static final BitSet FOLLOW_15_in_rulePackage410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEJB_in_entryRuleEJB446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEJB456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSessionBean_in_ruleEJB503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageDrivenBean_in_ruleEJB530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessInterface_in_ruleEJB557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSessionBean_in_entryRuleSessionBean592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSessionBean602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatelessSessionBean_in_ruleSessionBean649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatefulSessionBean_in_ruleSessionBean676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingletonSessionBean_in_ruleSessionBean703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessInterface_in_entryRuleBusinessInterface738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessInterface748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBusinessInterface785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessInterface802 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBusinessInterface819 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleMethodensignatur_in_ruleBusinessInterface840 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleBusinessInterface853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodensignatur_in_entryRuleMethodensignatur889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodensignatur899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodensignatur941 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMethodensignatur958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatefulSessionBean_in_entryRuleStatefulSessionBean994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatefulSessionBean1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleStatefulSessionBean1041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatefulSessionBean1058 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStatefulSessionBean1075 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleStatefulSessionBean1096 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleMethode_in_ruleStatefulSessionBean1118 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleStatefulSessionBean1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribut_in_entryRuleAttribut1167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribut1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribut1219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribut1241 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAttribut1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethode_in_entryRuleMethode1294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethode1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethode1346 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMethode1363 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMethode1375 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleAufruf_in_ruleMethode1396 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleMethode1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAufruf_in_entryRuleAufruf1445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAufruf1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAufruf1498 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAufruf1515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMethodensignatur_in_ruleAufruf1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatelessSessionBean_in_entryRuleStatelessSessionBean1574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatelessSessionBean1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleStatelessSessionBean1621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatelessSessionBean1638 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStatelessSessionBean1655 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleMethode_in_ruleStatelessSessionBean1676 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleStatelessSessionBean1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJPAEntity_in_entryRuleJPAEntity1725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJPAEntity1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleJPAEntity1772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJPAEntity1789 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleJPAEntity1806 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleAttribut_in_ruleJPAEntity1827 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleMethode_in_ruleJPAEntity1849 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleJPAEntity1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageDrivenBean_in_entryRuleMessageDrivenBean1898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageDrivenBean1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleMessageDrivenBean1945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageDrivenBean1962 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMessageDrivenBean1979 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMessageDrivenBean1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingletonSessionBean_in_entryRuleSingletonSessionBean2027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingletonSessionBean2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSingletonSessionBean2074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingletonSessionBean2091 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSingletonSessionBean2108 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSingletonSessionBean2120 = new BitSet(new long[]{0x0000000000000002L});

}