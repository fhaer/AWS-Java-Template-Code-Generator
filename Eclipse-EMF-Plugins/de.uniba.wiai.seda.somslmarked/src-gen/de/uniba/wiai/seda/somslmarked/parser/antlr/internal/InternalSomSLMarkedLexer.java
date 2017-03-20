package de.uniba.wiai.seda.somslmarked.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSomSLMarkedLexer extends Lexer {
    public static final int T__40=40;
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
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_VERSION=5;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__39=39;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalSomSLMarkedLexer() {;} 
    public InternalSomSLMarkedLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSomSLMarkedLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:11:7: ( 'AwS:' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:11:9: 'AwS:'
            {
            match("AwS:"); 


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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:12:7: ( 'v' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:12:9: 'v'
            {
            match('v'); 

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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:13:7: ( 'KOS' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:13:9: 'KOS'
            {
            match("KOS"); 


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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:14:7: ( '{' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:14:9: '{'
            {
            match('{'); 

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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:15:7: ( '}' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:15:9: '}'
            {
            match('}'); 

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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:16:7: ( 'VOS' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:16:9: 'VOS'
            {
            match("VOS"); 


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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:17:7: ( 'DT' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:17:9: 'DT'
            {
            match("DT"); 


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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:18:7: ( ';' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:18:9: ';'
            {
            match(';'); 

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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:19:7: ( '(' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:19:9: '('
            {
            match('('); 

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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:20:7: ( ') {' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:20:9: ') {'
            {
            match(") {"); 


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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:21:7: ( '.' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:21:9: '.'
            {
            match('.'); 

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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:22:7: ( 'VOT' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:22:9: 'VOT'
            {
            match("VOT"); 


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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:23:7: ( 'OOT' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:23:9: 'OOT'
            {
            match("OOT"); 


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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:24:7: ( 'LOT' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:24:9: 'LOT'
            {
            match("LOT"); 


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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:25:7: ( 'TOT' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:25:9: 'TOT'
            {
            match("TOT"); 


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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:26:7: ( 'interacts_with:' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:26:9: 'interacts_with:'
            {
            match("interacts_with:"); 


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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:27:7: ( 'is_a:' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:27:9: 'is_a:'
            {
            match("is_a:"); 


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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:28:7: ( 'is_part_of:' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:28:9: 'is_part_of:'
            {
            match("is_part_of:"); 


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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:29:7: ( '--' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:29:9: '--'
            {
            match("--"); 


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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:30:7: ( '(0,1)' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:30:9: '(0,1)'
            {
            match("(0,1)"); 


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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:31:7: ( '->' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:31:9: '->'
            {
            match("->"); 


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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:32:7: ( '(0,*)' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:32:9: '(0,*)'
            {
            match("(0,*)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:33:7: ( '==' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:33:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:34:7: ( '(1,1)' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:34:9: '(1,1)'
            {
            match("(1,1)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:35:7: ( '=>' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:35:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:36:7: ( '(1,*)' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:36:9: '(1,*)'
            {
            match("(1,*)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:37:7: ( '@name' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:37:9: '@name'
            {
            match("@name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:38:7: ( '@merge' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:38:9: '@merge'
            {
            match("@merge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:39:7: ( '@ignore' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:39:9: '@ignore'
            {
            match("@ignore"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1912:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '<' | '>' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '<' | '>' )* )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1912:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '<' | '>' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '<' | '>' )*
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1912:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1912:11: '^'
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

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1912:48: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '<' | '>' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||LA2_0=='<'||LA2_0=='>'||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:
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

    // $ANTLR start "RULE_VERSION"
    public final void mRULE_VERSION() throws RecognitionException {
        try {
            int _type = RULE_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1914:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1914:16: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1914:16: ( '0' .. '9' )+
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
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1914:17: '0' .. '9'
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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1914:32: ( '0' .. '9' )+
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
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1914:33: '0' .. '9'
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
    // $ANTLR end "RULE_VERSION"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1916:10: ( ( '0' .. '9' )+ )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1916:12: ( '0' .. '9' )+
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1916:12: ( '0' .. '9' )+
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
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1916:13: '0' .. '9'
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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1918:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1918:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1918:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1918:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1918:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1918:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1918:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1918:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1918:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1918:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1918:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1920:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1920:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1920:24: ( options {greedy=false; } : . )*
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
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1920:52: .
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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1922:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1922:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1922:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1922:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1922:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1922:41: ( '\\r' )? '\\n'
                    {
                    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1922:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1922:41: '\\r'
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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1924:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1924:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1924:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:
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
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1926:16: ( . )
            // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1926:18: .
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
        // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_ID | RULE_VERSION | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=37;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:184: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:192: RULE_VERSION
                {
                mRULE_VERSION(); 

                }
                break;
            case 32 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:205: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 33 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:214: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:226: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:242: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:258: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // ../de.uniba.wiai.seda.somslmarked/src-gen/de/uniba/wiai/seda/somslmarked/parser/antlr/internal/InternalSomSLMarked.g:1:266: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\34\1\35\1\34\2\uffff\2\34\1\uffff\1\46\1\32\1\uffff"+
        "\4\34\4\32\1\uffff\1\67\3\32\2\uffff\1\34\2\uffff\1\34\2\uffff\1"+
        "\34\1\100\6\uffff\5\34\10\uffff\1\67\5\uffff\1\34\1\111\1\112\1"+
        "\113\3\uffff\1\120\1\121\1\122\2\34\13\uffff\4\34\1\uffff\14\34"+
        "\1\uffff\3\34\1\uffff";
    static final String DFA14_eofS =
        "\151\uffff";
    static final String DFA14_minS =
        "\1\0\1\167\1\60\1\117\2\uffff\1\117\1\124\1\uffff\1\60\1\40\1\uffff"+
        "\3\117\1\156\1\55\1\75\1\151\1\74\1\uffff\1\56\2\0\1\52\2\uffff"+
        "\1\123\2\uffff\1\123\2\uffff\1\123\1\60\1\uffff\2\54\3\uffff\3\124"+
        "\1\164\1\137\10\uffff\1\56\5\uffff\1\72\3\60\1\uffff\2\52\3\60\1"+
        "\145\1\141\13\uffff\1\162\1\72\2\141\1\uffff\1\162\1\143\2\164\1"+
        "\137\1\163\1\157\1\137\1\146\1\167\1\72\1\151\1\uffff\1\164\1\150"+
        "\1\72\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\167\1\172\1\117\2\uffff\1\117\1\124\1\uffff\1\61\1\40"+
        "\1\uffff\3\117\1\163\2\76\1\156\1\172\1\uffff\1\71\2\uffff\1\57"+
        "\2\uffff\1\123\2\uffff\1\123\2\uffff\1\124\1\172\1\uffff\2\54\3"+
        "\uffff\3\124\1\164\1\137\10\uffff\1\71\5\uffff\1\72\3\172\1\uffff"+
        "\2\61\3\172\1\145\1\160\13\uffff\1\162\1\72\2\141\1\uffff\1\162"+
        "\1\143\2\164\1\137\1\163\1\157\1\137\1\146\1\167\1\72\1\151\1\uffff"+
        "\1\164\1\150\1\72\1\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\4\1\5\2\uffff\1\10\2\uffff\1\13\10\uffff\1\36\4\uffff"+
        "\1\44\1\45\1\uffff\1\36\1\2\1\uffff\1\4\1\5\2\uffff\1\10\2\uffff"+
        "\1\11\1\12\1\13\5\uffff\1\23\1\25\1\27\1\31\1\33\1\34\1\35\1\37"+
        "\1\uffff\1\40\1\41\1\42\1\43\1\44\4\uffff\1\7\7\uffff\1\1\1\3\1"+
        "\6\1\14\1\24\1\26\1\30\1\32\1\15\1\16\1\17\4\uffff\1\21\14\uffff"+
        "\1\22\3\uffff\1\20";
    static final String DFA14_specialS =
        "\1\1\25\uffff\1\0\1\2\121\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\26\4\32\1\27\1\11\1"+
            "\12\3\32\1\20\1\13\1\30\12\25\1\32\1\10\1\24\1\21\1\24\1\32"+
            "\1\22\1\1\2\24\1\7\6\24\1\3\1\15\2\24\1\14\4\24\1\16\1\24\1"+
            "\6\4\24\3\32\1\23\1\24\1\32\10\24\1\17\14\24\1\2\4\24\1\4\1"+
            "\32\1\5\uff82\32",
            "\1\33",
            "\12\34\2\uffff\1\34\1\uffff\1\34\2\uffff\32\34\4\uffff\1\34"+
            "\1\uffff\32\34",
            "\1\36",
            "",
            "",
            "\1\41",
            "\1\42",
            "",
            "\1\44\1\45",
            "\1\47",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54\4\uffff\1\55",
            "\1\56\20\uffff\1\57",
            "\1\60\1\61",
            "\1\64\3\uffff\1\63\1\62",
            "\1\34\1\uffff\1\34\2\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\65\1\uffff\12\66",
            "\0\70",
            "\0\70",
            "\1\71\4\uffff\1\72",
            "",
            "",
            "\1\74",
            "",
            "",
            "\1\75",
            "",
            "",
            "\1\76\1\77",
            "\12\34\2\uffff\1\34\1\uffff\1\34\2\uffff\32\34\4\uffff\1\34"+
            "\1\uffff\32\34",
            "",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65\1\uffff\12\66",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "\12\34\2\uffff\1\34\1\uffff\1\34\2\uffff\32\34\4\uffff\1\34"+
            "\1\uffff\32\34",
            "\12\34\2\uffff\1\34\1\uffff\1\34\2\uffff\32\34\4\uffff\1\34"+
            "\1\uffff\32\34",
            "\12\34\2\uffff\1\34\1\uffff\1\34\2\uffff\32\34\4\uffff\1\34"+
            "\1\uffff\32\34",
            "",
            "\1\115\6\uffff\1\114",
            "\1\117\6\uffff\1\116",
            "\12\34\2\uffff\1\34\1\uffff\1\34\2\uffff\32\34\4\uffff\1\34"+
            "\1\uffff\32\34",
            "\12\34\2\uffff\1\34\1\uffff\1\34\2\uffff\32\34\4\uffff\1\34"+
            "\1\uffff\32\34",
            "\12\34\2\uffff\1\34\1\uffff\1\34\2\uffff\32\34\4\uffff\1\34"+
            "\1\uffff\32\34",
            "\1\123",
            "\1\124\16\uffff\1\125",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_ID | RULE_VERSION | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_22 = input.LA(1);

                        s = -1;
                        if ( ((LA14_22>='\u0000' && LA14_22<='\uFFFF')) ) {s = 56;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='A') ) {s = 1;}

                        else if ( (LA14_0=='v') ) {s = 2;}

                        else if ( (LA14_0=='K') ) {s = 3;}

                        else if ( (LA14_0=='{') ) {s = 4;}

                        else if ( (LA14_0=='}') ) {s = 5;}

                        else if ( (LA14_0=='V') ) {s = 6;}

                        else if ( (LA14_0=='D') ) {s = 7;}

                        else if ( (LA14_0==';') ) {s = 8;}

                        else if ( (LA14_0=='(') ) {s = 9;}

                        else if ( (LA14_0==')') ) {s = 10;}

                        else if ( (LA14_0=='.') ) {s = 11;}

                        else if ( (LA14_0=='O') ) {s = 12;}

                        else if ( (LA14_0=='L') ) {s = 13;}

                        else if ( (LA14_0=='T') ) {s = 14;}

                        else if ( (LA14_0=='i') ) {s = 15;}

                        else if ( (LA14_0=='-') ) {s = 16;}

                        else if ( (LA14_0=='=') ) {s = 17;}

                        else if ( (LA14_0=='@') ) {s = 18;}

                        else if ( (LA14_0=='^') ) {s = 19;}

                        else if ( (LA14_0=='<'||LA14_0=='>'||(LA14_0>='B' && LA14_0<='C')||(LA14_0>='E' && LA14_0<='J')||(LA14_0>='M' && LA14_0<='N')||(LA14_0>='P' && LA14_0<='S')||LA14_0=='U'||(LA14_0>='W' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='u')||(LA14_0>='w' && LA14_0<='z')) ) {s = 20;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 21;}

                        else if ( (LA14_0=='\"') ) {s = 22;}

                        else if ( (LA14_0=='\'') ) {s = 23;}

                        else if ( (LA14_0=='/') ) {s = 24;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 25;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<=',')||LA14_0==':'||LA14_0=='?'||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_23 = input.LA(1);

                        s = -1;
                        if ( ((LA14_23>='\u0000' && LA14_23<='\uFFFF')) ) {s = 56;}

                        else s = 26;

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