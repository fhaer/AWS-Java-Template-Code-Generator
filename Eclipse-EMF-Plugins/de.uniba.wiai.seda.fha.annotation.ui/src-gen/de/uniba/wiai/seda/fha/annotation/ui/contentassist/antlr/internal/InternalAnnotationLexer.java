package de.uniba.wiai.seda.fha.annotation.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotationLexer extends Lexer {
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

    public InternalAnnotationLexer() {;} 
    public InternalAnnotationLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAnnotationLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:11:7: ( '@name' )
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:11:9: '@name'
            {
            match("@name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:12:7: ( '@merge' )
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:12:9: '@merge'
            {
            match("@merge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:13:7: ( '@ignore' )
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:13:9: '@ignore'
            {
            match("@ignore"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:14:7: ( '@version' )
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:14:9: '@version'
            {
            match("@version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:537:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '<' | '>' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '<' | '>' )* )
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:537:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '<' | '>' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '<' | '>' )*
            {
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:537:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:537:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='<'||input.LA(1)=='>'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:537:48: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '<' | '>' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||LA2_0=='<'||LA2_0=='>'||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='<'||input.LA(1)=='>'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_VERSION_NUMBER"
    public final void mRULE_VERSION_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_VERSION_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:539:21: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:539:23: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:539:23: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:539:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            match('.'); 
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:539:39: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:539:40: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERSION_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:541:10: ( ( '0' .. '9' )+ )
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:541:12: ( '0' .. '9' )+
            {
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:541:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:541:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:543:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:543:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:543:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:543:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:543:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:543:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:543:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:543:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:543:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:543:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:543:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:545:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:545:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:545:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:545:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:547:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:547:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:547:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:547:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:547:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:547:41: ( '\\r' )? '\\n'
                    {
                    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:547:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:547:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:549:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:549:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:549:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:551:16: ( . )
            // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:551:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1:8: ( T__12 | T__13 | T__14 | T__15 | RULE_ID | RULE_VERSION_NUMBER | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=12;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1:34: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 6 :
                // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1:42: RULE_VERSION_NUMBER
                {
                mRULE_VERSION_NUMBER(); 

                }
                break;
            case 7 :
                // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1:62: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 8 :
                // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1:71: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 9 :
                // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1:83: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 10 :
                // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1:99: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 11 :
                // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1:115: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // ../de.uniba.wiai.seda.fha.annotation.ui/src-gen/de/uniba/wiai/seda/fha/annotation/ui/contentassist/antlr/internal/InternalAnnotation.g:1:123: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\2\11\1\uffff\1\21\3\11\10\uffff\1\21\5\uffff";
    static final String DFA14_eofS =
        "\26\uffff";
    static final String DFA14_minS =
        "\1\0\1\151\1\74\1\uffff\1\56\2\0\1\52\10\uffff\1\56\5\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\166\1\172\1\uffff\1\71\2\uffff\1\57\10\uffff\1\71\5"+
        "\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\5\4\uffff\1\13\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff"+
        "\1\7\1\10\1\11\1\12\1\13";
    static final String DFA14_specialS =
        "\1\0\4\uffff\1\1\1\2\17\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\11\2\10\2\11\1\10\22\11\1\10\1\11\1\5\4\11\1\6\7\11\1\7"+
            "\12\4\2\11\1\3\1\11\1\3\1\11\1\1\32\3\3\11\1\2\1\3\1\11\32\3"+
            "\uff85\11",
            "\1\14\3\uffff\1\13\1\12\7\uffff\1\15",
            "\1\16\1\uffff\1\16\2\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\17\1\uffff\12\20",
            "\0\22",
            "\0\22",
            "\1\23\4\uffff\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\17\1\uffff\12\20",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | RULE_ID | RULE_VERSION_NUMBER | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='@') ) {s = 1;}

                        else if ( (LA14_0=='^') ) {s = 2;}

                        else if ( (LA14_0=='<'||LA14_0=='>'||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {s = 3;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 4;}

                        else if ( (LA14_0=='\"') ) {s = 5;}

                        else if ( (LA14_0=='\'') ) {s = 6;}

                        else if ( (LA14_0=='/') ) {s = 7;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 8;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<=';')||LA14_0=='='||LA14_0=='?'||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 9;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_5 = input.LA(1);

                        s = -1;
                        if ( ((LA14_5>='\u0000' && LA14_5<='\uFFFF')) ) {s = 18;}

                        else s = 9;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_6 = input.LA(1);

                        s = -1;
                        if ( ((LA14_6>='\u0000' && LA14_6<='\uFFFF')) ) {s = 18;}

                        else s = 9;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}