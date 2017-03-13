package de.uniba.wiai.seda.fha.som.aws.soa.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSoaLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=11;
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

    public InternalSoaLexer() {;} 
    public InternalSoaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSoaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:11:7: ( 'SOA-AwS:' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:11:9: 'SOA-AwS:'
            {
            match("SOA-AwS:"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:12:7: ( 'v' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:12:9: 'v'
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:13:7: ( 'Vorgangsservice' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:13:9: 'Vorgangsservice'
            {
            match("Vorgangsservice"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:14:7: ( '{' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:14:9: '{'
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:15:7: ( '}' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:15:9: '}'
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:16:7: ( 'VOT' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:16:9: 'VOT'
            {
            match("VOT"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:17:7: ( 'Interface' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:17:9: 'Interface'
            {
            match("Interface"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:18:7: ( '(' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:18:9: '('
            {
            match('('); 

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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:19:7: ( ');' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:19:9: ');'
            {
            match(");"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:20:7: ( 'Workflow' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:20:9: 'Workflow'
            {
            match("Workflow"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:21:7: ( ')' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:21:9: ')'
            {
            match(')'); 

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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:22:7: ( '->' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:22:9: '->'
            {
            match("->"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:23:7: ( ';' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:23:9: ';'
            {
            match(';'); 

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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:24:7: ( '.' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:24:9: '.'
            {
            match('.'); 

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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:25:7: ( 'Entityservice' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:25:9: 'Entityservice'
            {
            match("Entityservice"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:26:7: ( 'KOT' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:26:9: 'KOT'
            {
            match("KOT"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:27:7: ( 'VOS' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:27:9: 'VOS'
            {
            match("VOS"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:28:7: ( 'KOS' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:28:9: 'KOS'
            {
            match("KOS"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:29:7: ( 'OOT' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:29:9: 'OOT'
            {
            match("OOT"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:30:7: ( 'LOT' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:30:9: 'LOT'
            {
            match("LOT"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:31:7: ( 'TOT' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:31:9: 'TOT'
            {
            match("TOT"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:32:7: ( 'interacts_with:' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:32:9: 'interacts_with:'
            {
            match("interacts_with:"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:33:7: ( 'is_a:' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:33:9: 'is_a:'
            {
            match("is_a:"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:34:7: ( 'is_part_of:' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:34:9: 'is_part_of:'
            {
            match("is_part_of:"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:35:7: ( '--' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:35:9: '--'
            {
            match("--"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:36:7: ( '(0,1)' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:36:9: '(0,1)'
            {
            match("(0,1)"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:37:7: ( '(0,*)' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:37:9: '(0,*)'
            {
            match("(0,*)"); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:38:7: ( '==' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:38:9: '=='
            {
            match("=="); 


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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:39:7: ( '(1,1)' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:39:9: '(1,1)'
            {
            match("(1,1)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:40:7: ( '=>' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:40:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:41:7: ( '(1,*)' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:41:9: '(1,*)'
            {
            match("(1,*)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:42:7: ( '@name' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:42:9: '@name'
            {
            match("@name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:43:7: ( '@merge' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:43:9: '@merge'
            {
            match("@merge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:44:7: ( '@ignore' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:44:9: '@ignore'
            {
            match("@ignore"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:45:7: ( '@version' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:45:9: '@version'
            {
            match("@version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2613:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '<' | '>' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '<' | '>' )* )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2613:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '<' | '>' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '<' | '>' )*
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2613:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2613:11: '^'
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

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2613:48: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '<' | '>' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||LA2_0=='<'||LA2_0=='>'||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2615:21: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2615:23: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2615:23: ( '0' .. '9' )+
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
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2615:24: '0' .. '9'
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2615:39: ( '0' .. '9' )+
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
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2615:40: '0' .. '9'
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2617:10: ( ( '0' .. '9' )+ )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2617:12: ( '0' .. '9' )+
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2617:12: ( '0' .. '9' )+
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
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2617:13: '0' .. '9'
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2619:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2619:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2619:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2619:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2619:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2619:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2619:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2619:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2619:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2619:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2619:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2621:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2621:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2621:24: ( options {greedy=false; } : . )*
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
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2621:52: .
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2623:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2623:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2623:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2623:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2623:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2623:41: ( '\\r' )? '\\n'
                    {
                    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2623:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2623:41: '\\r'
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2625:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2625:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2625:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:
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
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2627:16: ( . )
            // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:2627:18: .
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
        // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_ID | RULE_VERSION_NUMBER | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=43;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:220: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:228: RULE_VERSION_NUMBER
                {
                mRULE_VERSION_NUMBER(); 

                }
                break;
            case 38 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:248: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:257: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:269: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:285: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:301: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // ../de.uniba.wiai.seda.fha.som.aws.soa/src-gen/de/uniba/wiai/seda/fha/som/aws/soa/parser/antlr/internal/InternalSoa.g:1:309: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\36\1\37\1\36\2\uffff\1\36\1\47\1\51\1\36\1\34\2\uffff"+
        "\6\36\3\34\1\uffff\1\74\3\34\2\uffff\1\36\2\uffff\2\36\2\uffff\1"+
        "\36\5\uffff\1\36\4\uffff\7\36\10\uffff\1\74\4\uffff\2\36\1\125\1"+
        "\126\1\36\2\uffff\2\36\1\136\1\137\1\140\1\141\1\142\2\36\1\uffff"+
        "\1\36\2\uffff\1\36\4\uffff\2\36\5\uffff\10\36\1\uffff\17\36\1\u0081"+
        "\4\36\1\u0086\1\uffff\4\36\1\uffff\6\36\1\uffff\4\36\1\u0095\2\36"+
        "\1\uffff\1\36\1\u0099\2\uffff";
    static final String DFA14_eofS =
        "\u009a\uffff";
    static final String DFA14_minS =
        "\1\0\1\117\1\60\1\117\2\uffff\1\156\1\60\1\73\1\157\1\55\2\uffff"+
        "\1\156\4\117\1\156\1\75\1\151\1\74\1\uffff\1\56\2\0\1\52\2\uffff"+
        "\1\101\2\uffff\1\162\1\123\2\uffff\1\164\2\54\3\uffff\1\162\4\uffff"+
        "\1\164\1\123\3\124\1\164\1\137\10\uffff\1\56\4\uffff\1\55\1\147"+
        "\2\60\1\145\2\52\1\153\1\151\5\60\1\145\1\141\1\uffff\1\141\2\uffff"+
        "\1\162\4\uffff\1\146\1\164\5\uffff\1\162\1\72\1\141\1\156\1\146"+
        "\1\154\1\171\1\141\1\uffff\1\162\1\147\1\141\1\157\1\163\1\143\1"+
        "\164\1\163\1\143\1\167\1\145\1\164\1\137\1\163\1\145\1\60\1\162"+
        "\1\163\1\157\1\145\1\60\1\uffff\1\166\1\137\1\146\1\162\1\uffff"+
        "\1\151\1\167\1\72\1\166\1\143\1\151\1\uffff\1\151\1\145\1\164\1"+
        "\143\1\60\1\150\1\145\1\uffff\1\72\1\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\117\1\172\1\157\2\uffff\1\156\1\61\1\73\1\157\1\76\2"+
        "\uffff\1\156\4\117\1\163\1\76\1\166\1\172\1\uffff\1\71\2\uffff\1"+
        "\57\2\uffff\1\101\2\uffff\1\162\1\124\2\uffff\1\164\2\54\3\uffff"+
        "\1\162\4\uffff\1\164\4\124\1\164\1\137\10\uffff\1\71\4\uffff\1\55"+
        "\1\147\2\172\1\145\2\61\1\153\1\151\5\172\1\145\1\160\1\uffff\1"+
        "\141\2\uffff\1\162\4\uffff\1\146\1\164\5\uffff\1\162\1\72\1\141"+
        "\1\156\1\146\1\154\1\171\1\141\1\uffff\1\162\1\147\1\141\1\157\1"+
        "\163\1\143\1\164\1\163\1\143\1\167\1\145\1\164\1\137\1\163\1\145"+
        "\1\172\1\162\1\163\1\157\1\145\1\172\1\uffff\1\166\1\137\1\146\1"+
        "\162\1\uffff\1\151\1\167\1\72\1\166\1\143\1\151\1\uffff\1\151\1"+
        "\145\1\164\1\143\1\172\1\150\1\145\1\uffff\1\72\1\172\2\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\4\1\5\5\uffff\1\15\1\16\11\uffff\1\44\4\uffff\1\52\1"+
        "\53\1\uffff\1\44\1\2\2\uffff\1\4\1\5\3\uffff\1\10\1\11\1\13\1\uffff"+
        "\1\14\1\31\1\15\1\16\7\uffff\1\34\1\36\1\40\1\41\1\42\1\43\1\46"+
        "\1\45\1\uffff\1\47\1\50\1\51\1\52\20\uffff\1\1\1\uffff\1\6\1\21"+
        "\1\uffff\1\32\1\33\1\35\1\37\2\uffff\1\20\1\22\1\23\1\24\1\25\10"+
        "\uffff\1\27\25\uffff\1\12\4\uffff\1\7\6\uffff\1\30\7\uffff\1\17"+
        "\2\uffff\1\26\1\3";
    static final String DFA14_specialS =
        "\1\1\27\uffff\1\0\1\2\u0080\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\30\4\34\1\31\1\7\1"+
            "\10\3\34\1\12\1\14\1\32\12\27\1\34\1\13\1\26\1\23\1\26\1\34"+
            "\1\24\4\26\1\15\3\26\1\6\1\26\1\16\1\20\2\26\1\17\3\26\1\1\1"+
            "\21\1\26\1\3\1\11\3\26\3\34\1\25\1\26\1\34\10\26\1\22\14\26"+
            "\1\2\4\26\1\4\1\34\1\5\uff82\34",
            "\1\35",
            "\12\36\2\uffff\1\36\1\uffff\1\36\2\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\1\41\37\uffff\1\40",
            "",
            "",
            "\1\44",
            "\1\45\1\46",
            "\1\50",
            "\1\52",
            "\1\54\20\uffff\1\53",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64\4\uffff\1\65",
            "\1\66\1\67",
            "\1\72\3\uffff\1\71\1\70\7\uffff\1\73",
            "\1\36\1\uffff\1\36\2\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\75\1\uffff\12\76",
            "\0\77",
            "\0\77",
            "\1\100\4\uffff\1\101",
            "",
            "",
            "\1\103",
            "",
            "",
            "\1\104",
            "\1\106\1\105",
            "",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "\1\112",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\115\1\114",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\75\1\uffff\12\76",
            "",
            "",
            "",
            "",
            "\1\123",
            "\1\124",
            "\12\36\2\uffff\1\36\1\uffff\1\36\2\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\12\36\2\uffff\1\36\1\uffff\1\36\2\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\1\127",
            "\1\131\6\uffff\1\130",
            "\1\133\6\uffff\1\132",
            "\1\134",
            "\1\135",
            "\12\36\2\uffff\1\36\1\uffff\1\36\2\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\12\36\2\uffff\1\36\1\uffff\1\36\2\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\12\36\2\uffff\1\36\1\uffff\1\36\2\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\12\36\2\uffff\1\36\1\uffff\1\36\2\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\12\36\2\uffff\1\36\1\uffff\1\36\2\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\1\143",
            "\1\144\16\uffff\1\145",
            "",
            "\1\146",
            "",
            "",
            "\1\147",
            "",
            "",
            "",
            "",
            "\1\150",
            "\1\151",
            "",
            "",
            "",
            "",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\12\36\2\uffff\1\36\1\uffff\1\36\2\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\36\2\uffff\1\36\1\uffff\1\36\2\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\36\2\uffff\1\36\1\uffff\1\36\2\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\u0098",
            "\12\36\2\uffff\1\36\1\uffff\1\36\2\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_ID | RULE_VERSION_NUMBER | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_24 = input.LA(1);

                        s = -1;
                        if ( ((LA14_24>='\u0000' && LA14_24<='\uFFFF')) ) {s = 63;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='S') ) {s = 1;}

                        else if ( (LA14_0=='v') ) {s = 2;}

                        else if ( (LA14_0=='V') ) {s = 3;}

                        else if ( (LA14_0=='{') ) {s = 4;}

                        else if ( (LA14_0=='}') ) {s = 5;}

                        else if ( (LA14_0=='I') ) {s = 6;}

                        else if ( (LA14_0=='(') ) {s = 7;}

                        else if ( (LA14_0==')') ) {s = 8;}

                        else if ( (LA14_0=='W') ) {s = 9;}

                        else if ( (LA14_0=='-') ) {s = 10;}

                        else if ( (LA14_0==';') ) {s = 11;}

                        else if ( (LA14_0=='.') ) {s = 12;}

                        else if ( (LA14_0=='E') ) {s = 13;}

                        else if ( (LA14_0=='K') ) {s = 14;}

                        else if ( (LA14_0=='O') ) {s = 15;}

                        else if ( (LA14_0=='L') ) {s = 16;}

                        else if ( (LA14_0=='T') ) {s = 17;}

                        else if ( (LA14_0=='i') ) {s = 18;}

                        else if ( (LA14_0=='=') ) {s = 19;}

                        else if ( (LA14_0=='@') ) {s = 20;}

                        else if ( (LA14_0=='^') ) {s = 21;}

                        else if ( (LA14_0=='<'||LA14_0=='>'||(LA14_0>='A' && LA14_0<='D')||(LA14_0>='F' && LA14_0<='H')||LA14_0=='J'||(LA14_0>='M' && LA14_0<='N')||(LA14_0>='P' && LA14_0<='R')||LA14_0=='U'||(LA14_0>='X' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='u')||(LA14_0>='w' && LA14_0<='z')) ) {s = 22;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 23;}

                        else if ( (LA14_0=='\"') ) {s = 24;}

                        else if ( (LA14_0=='\'') ) {s = 25;}

                        else if ( (LA14_0=='/') ) {s = 26;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 27;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<=',')||LA14_0==':'||LA14_0=='?'||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_25 = input.LA(1);

                        s = -1;
                        if ( ((LA14_25>='\u0000' && LA14_25<='\uFFFF')) ) {s = 63;}

                        else s = 28;

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