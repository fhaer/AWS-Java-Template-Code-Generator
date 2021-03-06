package de.uniba.wiai.seda.somsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSomSLLexer extends Lexer {
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
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__33=33;
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

    public InternalSomSLLexer() {;} 
    public InternalSomSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSomSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:11:7: ( '(0,1)' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:11:9: '(0,1)'
            {
            match("(0,1)"); 


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
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:12:7: ( '--' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:12:9: '--'
            {
            match("--"); 


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
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:13:7: ( '(0,*)' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:13:9: '(0,*)'
            {
            match("(0,*)"); 


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
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:14:7: ( '->' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:14:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:15:7: ( '(1,1)' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:15:9: '(1,1)'
            {
            match("(1,1)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:16:7: ( '==' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:16:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:17:7: ( '(1,*)' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:17:9: '(1,*)'
            {
            match("(1,*)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:18:7: ( '=>' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:18:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:19:7: ( '{' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:19:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:20:7: ( '}' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:20:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:21:7: ( ';' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:21:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:22:7: ( 'DT' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:22:9: 'DT'
            {
            match("DT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:23:7: ( '(' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:23:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:24:7: ( ') {' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:24:9: ') {'
            {
            match(") {"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:25:7: ( '.' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:25:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:26:7: ( 'VOT' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:26:9: 'VOT'
            {
            match("VOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:27:7: ( 'OOT' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:27:9: 'OOT'
            {
            match("OOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:28:7: ( 'LOT' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:28:9: 'LOT'
            {
            match("LOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:29:7: ( 'TOT' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:29:9: 'TOT'
            {
            match("TOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:30:7: ( 'interacts_with:' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:30:9: 'interacts_with:'
            {
            match("interacts_with:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:31:7: ( 'is_a:' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:31:9: 'is_a:'
            {
            match("is_a:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:32:7: ( 'is_part_of:' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:32:9: 'is_part_of:'
            {
            match("is_part_of:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "RULE_ANNOTATION"
    public final void mRULE_ANNOTATION() throws RecognitionException {
        try {
            int _type = RULE_ANNOTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3264:17: ( '@' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3264:19: '@' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('@'); 
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3264:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3264:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop1;
                }
            } while (true);

            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3264:39: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3264:40: ( '\\r' )? '\\n'
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3264:40: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3264:40: '\\r'
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
    // $ANTLR end "RULE_ANNOTATION"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3266:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3266:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3266:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3266:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3266:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3268:10: ( ( '0' .. '9' )+ )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3268:12: ( '0' .. '9' )+
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3268:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3268:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3270:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3270:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3270:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3270:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3270:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3270:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3270:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3270:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3270:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3270:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3270:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3272:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3272:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3272:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3272:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3274:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3274:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3274:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3274:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3274:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3274:41: ( '\\r' )? '\\n'
                    {
                    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3274:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3274:41: '\\r'
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
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3276:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3276:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3276:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3278:16: ( . )
            // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:3278:18: .
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
        // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_ANNOTATION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=30;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:142: RULE_ANNOTATION
                {
                mRULE_ANNOTATION(); 

                }
                break;
            case 24 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:158: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:166: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:175: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:187: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:203: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:219: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // ../de.uniba.wiai.seda.somsl.ui/src-gen/de/uniba/wiai/seda/somsl/ui/contentassist/antlr/internal/InternalSomSL.g:1:227: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\32\2\27\3\uffff\1\43\1\27\1\uffff\5\43\1\uffff\1\27"+
        "\2\uffff\3\27\14\uffff\1\64\3\uffff\6\43\11\uffff\1\77\1\100\1\101"+
        "\1\102\2\43\10\uffff\4\43\1\uffff\14\43\1\uffff\3\43\1\uffff";
    static final String DFA15_eofS =
        "\131\uffff";
    static final String DFA15_minS =
        "\1\0\1\60\1\55\1\75\3\uffff\1\124\1\40\1\uffff\4\117\1\156\1\uffff"+
        "\1\101\2\uffff\2\0\1\52\2\uffff\2\54\10\uffff\1\60\3\uffff\4\124"+
        "\1\164\1\137\6\uffff\2\52\1\uffff\4\60\1\145\1\141\10\uffff\1\162"+
        "\1\72\2\141\1\uffff\1\162\1\143\2\164\1\137\1\163\1\157\1\137\1"+
        "\146\1\167\1\72\1\151\1\uffff\1\164\1\150\1\72\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\61\2\76\3\uffff\1\124\1\40\1\uffff\4\117\1\163\1\uffff"+
        "\1\172\2\uffff\2\uffff\1\57\2\uffff\2\54\10\uffff\1\172\3\uffff"+
        "\4\124\1\164\1\137\6\uffff\2\61\1\uffff\4\172\1\145\1\160\10\uffff"+
        "\1\162\1\72\2\141\1\uffff\1\162\1\143\2\164\1\137\1\163\1\157\1"+
        "\137\1\146\1\167\1\72\1\151\1\uffff\1\164\1\150\1\72\1\uffff";
    static final String DFA15_acceptS =
        "\4\uffff\1\11\1\12\1\13\2\uffff\1\17\5\uffff\1\27\1\uffff\1\30"+
        "\1\31\3\uffff\1\35\1\36\2\uffff\1\15\1\2\1\4\1\6\1\10\1\11\1\12"+
        "\1\13\1\uffff\1\30\1\16\1\17\6\uffff\1\27\1\31\1\32\1\33\1\34\1"+
        "\35\2\uffff\1\14\6\uffff\1\1\1\3\1\5\1\7\1\20\1\21\1\22\1\23\4\uffff"+
        "\1\25\14\uffff\1\26\3\uffff\1\24";
    static final String DFA15_specialS =
        "\1\0\22\uffff\1\2\1\1\104\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\23\4\27\1\24\1\1\1"+
            "\10\3\27\1\2\1\11\1\25\12\22\1\27\1\6\1\27\1\3\2\27\1\17\3\21"+
            "\1\7\7\21\1\14\2\21\1\13\4\21\1\15\1\21\1\12\4\21\3\27\1\20"+
            "\1\21\1\27\10\21\1\16\21\21\1\4\1\27\1\5\uff82\27",
            "\1\30\1\31",
            "\1\33\20\uffff\1\34",
            "\1\35\1\36",
            "",
            "",
            "",
            "\1\42",
            "\1\44",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52\4\uffff\1\53",
            "",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\0\56",
            "\0\56",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\6\uffff\1\73",
            "\1\76\6\uffff\1\75",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\103",
            "\1\104\16\uffff\1\105",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            ""
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_ANNOTATION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='(') ) {s = 1;}

                        else if ( (LA15_0=='-') ) {s = 2;}

                        else if ( (LA15_0=='=') ) {s = 3;}

                        else if ( (LA15_0=='{') ) {s = 4;}

                        else if ( (LA15_0=='}') ) {s = 5;}

                        else if ( (LA15_0==';') ) {s = 6;}

                        else if ( (LA15_0=='D') ) {s = 7;}

                        else if ( (LA15_0==')') ) {s = 8;}

                        else if ( (LA15_0=='.') ) {s = 9;}

                        else if ( (LA15_0=='V') ) {s = 10;}

                        else if ( (LA15_0=='O') ) {s = 11;}

                        else if ( (LA15_0=='L') ) {s = 12;}

                        else if ( (LA15_0=='T') ) {s = 13;}

                        else if ( (LA15_0=='i') ) {s = 14;}

                        else if ( (LA15_0=='@') ) {s = 15;}

                        else if ( (LA15_0=='^') ) {s = 16;}

                        else if ( ((LA15_0>='A' && LA15_0<='C')||(LA15_0>='E' && LA15_0<='K')||(LA15_0>='M' && LA15_0<='N')||(LA15_0>='P' && LA15_0<='S')||LA15_0=='U'||(LA15_0>='W' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='z')) ) {s = 17;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 18;}

                        else if ( (LA15_0=='\"') ) {s = 19;}

                        else if ( (LA15_0=='\'') ) {s = 20;}

                        else if ( (LA15_0=='/') ) {s = 21;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 22;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='*' && LA15_0<=',')||LA15_0==':'||LA15_0=='<'||(LA15_0>='>' && LA15_0<='?')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_20 = input.LA(1);

                        s = -1;
                        if ( ((LA15_20>='\u0000' && LA15_20<='\uFFFF')) ) {s = 46;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_19 = input.LA(1);

                        s = -1;
                        if ( ((LA15_19>='\u0000' && LA15_19<='\uFFFF')) ) {s = 46;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}