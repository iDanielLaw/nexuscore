// Generated from d:/go/nexuscore/golang/nbql/Nexus.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NexusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, K_OVERWRITE=7, K_RESTORE=8, 
		K_SNAPSHOT=9, K_CREATE=10, K_CONFIG=11, K_PUSH=12, K_QUERY=13, K_REMOVE=14, 
		K_SHOW=15, K_SET=16, K_FROM=17, K_TO=18, K_AT=19, K_TAGGED=20, K_AGGREGATE=21, 
		K_BY=22, K_ON=23, K_LIMIT=24, K_SERIES=25, K_AFTER=26, K_EMPTY=27, K_WINDOWS=28, 
		K_METRICS=29, K_TAGS=30, K_TAG=31, K_KEYS=32, K_VALUES=33, K_WITH=34, 
		K_KEY=35, K_TIME=36, K_NOW=37, K_TRUE=38, K_FALSE=39, K_NULL=40, K_FLUSH=41, 
		K_MEMTABLE=42, K_DISK=43, K_ALL=44, K_ORDER=45, K_ASC=46, K_DESC=47, K_AS=48, 
		K_DT=49, K_RELATIVE=50, PLUS=51, MINUS=52, DURATION_LITERAL=53, NUMBER=54, 
		IDENTIFIER=55, STRING_LITERAL=56, WS=57, LINE_COMMENT=58;
	public static final int
		RULE_statement = 0, RULE_snapshotStatement = 1, RULE_restoreStatement = 2, 
		RULE_pushStatement = 3, RULE_createStatement = 4, RULE_queryStatement = 5, 
		RULE_time_range = 6, RULE_query_clauses = 7, RULE_removeStatement = 8, 
		RULE_showStatement = 9, RULE_flushStatement = 10, RULE_aggregation_spec_list = 11, 
		RULE_aggregation_spec = 12, RULE_series_specifier = 13, RULE_metric_name = 14, 
		RULE_tag_list = 15, RULE_tag_assignment = 16, RULE_tag_value = 17, RULE_field_list = 18, 
		RULE_field_assignment = 19, RULE_timestamp = 20, RULE_duration = 21, RULE_value = 22, 
		RULE_literal_value = 23, RULE_option_list = 24, RULE_option_assignment = 25, 
		RULE_option_value = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "snapshotStatement", "restoreStatement", "pushStatement", 
			"createStatement", "queryStatement", "time_range", "query_clauses", "removeStatement", 
			"showStatement", "flushStatement", "aggregation_spec_list", "aggregation_spec", 
			"series_specifier", "metric_name", "tag_list", "tag_assignment", "tag_value", 
			"field_list", "field_assignment", "timestamp", "duration", "value", "literal_value", 
			"option_list", "option_assignment", "option_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'='", "','", "'*'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "K_OVERWRITE", "K_RESTORE", 
			"K_SNAPSHOT", "K_CREATE", "K_CONFIG", "K_PUSH", "K_QUERY", "K_REMOVE", 
			"K_SHOW", "K_SET", "K_FROM", "K_TO", "K_AT", "K_TAGGED", "K_AGGREGATE", 
			"K_BY", "K_ON", "K_LIMIT", "K_SERIES", "K_AFTER", "K_EMPTY", "K_WINDOWS", 
			"K_METRICS", "K_TAGS", "K_TAG", "K_KEYS", "K_VALUES", "K_WITH", "K_KEY", 
			"K_TIME", "K_NOW", "K_TRUE", "K_FALSE", "K_NULL", "K_FLUSH", "K_MEMTABLE", 
			"K_DISK", "K_ALL", "K_ORDER", "K_ASC", "K_DESC", "K_AS", "K_DT", "K_RELATIVE", 
			"PLUS", "MINUS", "DURATION_LITERAL", "NUMBER", "IDENTIFIER", "STRING_LITERAL", 
			"WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Nexus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NexusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NexusParser.EOF, 0); }
		public PushStatementContext pushStatement() {
			return getRuleContext(PushStatementContext.class,0);
		}
		public CreateStatementContext createStatement() {
			return getRuleContext(CreateStatementContext.class,0);
		}
		public QueryStatementContext queryStatement() {
			return getRuleContext(QueryStatementContext.class,0);
		}
		public RemoveStatementContext removeStatement() {
			return getRuleContext(RemoveStatementContext.class,0);
		}
		public ShowStatementContext showStatement() {
			return getRuleContext(ShowStatementContext.class,0);
		}
		public FlushStatementContext flushStatement() {
			return getRuleContext(FlushStatementContext.class,0);
		}
		public SnapshotStatementContext snapshotStatement() {
			return getRuleContext(SnapshotStatementContext.class,0);
		}
		public RestoreStatementContext restoreStatement() {
			return getRuleContext(RestoreStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PUSH:
				{
				setState(54);
				pushStatement();
				}
				break;
			case K_CONFIG:
				{
				setState(55);
				createStatement();
				}
				break;
			case K_QUERY:
				{
				setState(56);
				queryStatement();
				}
				break;
			case K_REMOVE:
				{
				setState(57);
				removeStatement();
				}
				break;
			case K_SHOW:
				{
				setState(58);
				showStatement();
				}
				break;
			case K_FLUSH:
				{
				setState(59);
				flushStatement();
				}
				break;
			case K_SNAPSHOT:
				{
				setState(60);
				snapshotStatement();
				}
				break;
			case K_RESTORE:
				{
				setState(61);
				restoreStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(64);
				match(T__0);
				}
			}

			setState(67);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SnapshotStatementContext extends ParserRuleContext {
		public TerminalNode K_SNAPSHOT() { return getToken(NexusParser.K_SNAPSHOT, 0); }
		public SnapshotStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_snapshotStatement; }
	}

	public final SnapshotStatementContext snapshotStatement() throws RecognitionException {
		SnapshotStatementContext _localctx = new SnapshotStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_snapshotStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(K_SNAPSHOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RestoreStatementContext extends ParserRuleContext {
		public TerminalNode K_RESTORE() { return getToken(NexusParser.K_RESTORE, 0); }
		public TerminalNode K_FROM() { return getToken(NexusParser.K_FROM, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(NexusParser.STRING_LITERAL, 0); }
		public TerminalNode K_WITH() { return getToken(NexusParser.K_WITH, 0); }
		public TerminalNode K_OVERWRITE() { return getToken(NexusParser.K_OVERWRITE, 0); }
		public RestoreStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restoreStatement; }
	}

	public final RestoreStatementContext restoreStatement() throws RecognitionException {
		RestoreStatementContext _localctx = new RestoreStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_restoreStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(K_RESTORE);
			setState(72);
			match(K_FROM);
			setState(73);
			match(STRING_LITERAL);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(74);
				match(K_WITH);
				setState(75);
				match(K_OVERWRITE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PushStatementContext extends ParserRuleContext {
		public TerminalNode K_PUSH() { return getToken(NexusParser.K_PUSH, 0); }
		public Metric_nameContext metric_name() {
			return getRuleContext(Metric_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(NexusParser.K_SET, 0); }
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public TerminalNode K_TIME() { return getToken(NexusParser.K_TIME, 0); }
		public TimestampContext timestamp() {
			return getRuleContext(TimestampContext.class,0);
		}
		public TerminalNode K_TAGGED() { return getToken(NexusParser.K_TAGGED, 0); }
		public Tag_listContext tag_list() {
			return getRuleContext(Tag_listContext.class,0);
		}
		public PushStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pushStatement; }
	}

	public final PushStatementContext pushStatement() throws RecognitionException {
		PushStatementContext _localctx = new PushStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pushStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(K_PUSH);
			setState(79);
			metric_name();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TIME) {
				{
				setState(80);
				match(K_TIME);
				setState(81);
				timestamp();
				}
			}

			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TAGGED) {
				{
				setState(84);
				match(K_TAGGED);
				setState(85);
				tag_list();
				}
			}

			setState(88);
			match(K_SET);
			setState(89);
			field_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateStatementContext extends ParserRuleContext {
		public TerminalNode K_CONFIG() { return getToken(NexusParser.K_CONFIG, 0); }
		public TerminalNode K_METRICS() { return getToken(NexusParser.K_METRICS, 0); }
		public Metric_nameContext metric_name() {
			return getRuleContext(Metric_nameContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(NexusParser.K_WITH, 0); }
		public Option_listContext option_list() {
			return getRuleContext(Option_listContext.class,0);
		}
		public CreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStatement; }
	}

	public final CreateStatementContext createStatement() throws RecognitionException {
		CreateStatementContext _localctx = new CreateStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(K_CONFIG);
			setState(92);
			match(K_METRICS);
			setState(93);
			metric_name();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(94);
				match(K_WITH);
				setState(95);
				option_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryStatementContext extends ParserRuleContext {
		public TerminalNode K_QUERY() { return getToken(NexusParser.K_QUERY, 0); }
		public Metric_nameContext metric_name() {
			return getRuleContext(Metric_nameContext.class,0);
		}
		public Time_rangeContext time_range() {
			return getRuleContext(Time_rangeContext.class,0);
		}
		public TerminalNode K_TAGGED() { return getToken(NexusParser.K_TAGGED, 0); }
		public Tag_listContext tag_list() {
			return getRuleContext(Tag_listContext.class,0);
		}
		public Query_clausesContext query_clauses() {
			return getRuleContext(Query_clausesContext.class,0);
		}
		public QueryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStatement; }
	}

	public final QueryStatementContext queryStatement() throws RecognitionException {
		QueryStatementContext _localctx = new QueryStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_queryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(K_QUERY);
			setState(99);
			metric_name();
			setState(100);
			time_range();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TAGGED) {
				{
				setState(101);
				match(K_TAGGED);
				setState(102);
				tag_list();
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35184458072064L) != 0)) {
				{
				setState(105);
				query_clauses();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Time_rangeContext extends ParserRuleContext {
		public TerminalNode K_FROM() { return getToken(NexusParser.K_FROM, 0); }
		public List<TimestampContext> timestamp() {
			return getRuleContexts(TimestampContext.class);
		}
		public TimestampContext timestamp(int i) {
			return getRuleContext(TimestampContext.class,i);
		}
		public TerminalNode K_TO() { return getToken(NexusParser.K_TO, 0); }
		public TerminalNode K_RELATIVE() { return getToken(NexusParser.K_RELATIVE, 0); }
		public TerminalNode DURATION_LITERAL() { return getToken(NexusParser.DURATION_LITERAL, 0); }
		public Time_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_range; }
	}

	public final Time_rangeContext time_range() throws RecognitionException {
		Time_rangeContext _localctx = new Time_rangeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_time_range);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(K_FROM);
				setState(109);
				timestamp();
				setState(110);
				match(K_TO);
				setState(111);
				timestamp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(K_FROM);
				setState(114);
				match(K_RELATIVE);
				setState(115);
				match(T__1);
				setState(116);
				match(DURATION_LITERAL);
				setState(117);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_clausesContext extends ParserRuleContext {
		public TerminalNode K_AGGREGATE() { return getToken(NexusParser.K_AGGREGATE, 0); }
		public Aggregation_spec_listContext aggregation_spec_list() {
			return getRuleContext(Aggregation_spec_listContext.class,0);
		}
		public TerminalNode K_LIMIT() { return getToken(NexusParser.K_LIMIT, 0); }
		public TerminalNode NUMBER() { return getToken(NexusParser.NUMBER, 0); }
		public TerminalNode K_AFTER() { return getToken(NexusParser.K_AFTER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(NexusParser.STRING_LITERAL, 0); }
		public TerminalNode K_BY() { return getToken(NexusParser.K_BY, 0); }
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(NexusParser.K_WITH, 0); }
		public TerminalNode K_EMPTY() { return getToken(NexusParser.K_EMPTY, 0); }
		public TerminalNode K_WINDOWS() { return getToken(NexusParser.K_WINDOWS, 0); }
		public TerminalNode K_ORDER() { return getToken(NexusParser.K_ORDER, 0); }
		public TerminalNode K_ASC() { return getToken(NexusParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(NexusParser.K_DESC, 0); }
		public Query_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_clauses; }
	}

	public final Query_clausesContext query_clauses() throws RecognitionException {
		Query_clausesContext _localctx = new Query_clausesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_query_clauses);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_AGGREGATE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(120);
				match(K_AGGREGATE);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BY) {
					{
					setState(121);
					match(K_BY);
					setState(122);
					duration();
					}
				}

				setState(125);
				match(T__1);
				setState(126);
				aggregation_spec_list();
				setState(127);
				match(T__2);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITH) {
					{
					setState(128);
					match(K_WITH);
					setState(129);
					match(K_EMPTY);
					setState(130);
					match(K_WINDOWS);
					}
				}

				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_LIMIT) {
					{
					setState(133);
					match(K_LIMIT);
					setState(134);
					match(NUMBER);
					}
				}

				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AFTER) {
					{
					setState(137);
					match(K_AFTER);
					setState(138);
					match(STRING_LITERAL);
					}
				}

				}
				break;
			case K_ORDER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(141);
				match(K_ORDER);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(142);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_LIMIT) {
					{
					setState(145);
					match(K_LIMIT);
					setState(146);
					match(NUMBER);
					}
				}

				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AFTER) {
					{
					setState(149);
					match(K_AFTER);
					setState(150);
					match(STRING_LITERAL);
					}
				}

				}
				break;
			case K_LIMIT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(153);
				match(K_LIMIT);
				setState(154);
				match(NUMBER);
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AFTER) {
					{
					setState(156);
					match(K_AFTER);
					setState(157);
					match(STRING_LITERAL);
					}
				}

				}
				break;
			case K_AFTER:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(160);
				match(K_AFTER);
				setState(161);
				match(STRING_LITERAL);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RemoveStatementContext extends ParserRuleContext {
		public TerminalNode K_REMOVE() { return getToken(NexusParser.K_REMOVE, 0); }
		public Series_specifierContext series_specifier() {
			return getRuleContext(Series_specifierContext.class,0);
		}
		public List<TerminalNode> K_FROM() { return getTokens(NexusParser.K_FROM); }
		public TerminalNode K_FROM(int i) {
			return getToken(NexusParser.K_FROM, i);
		}
		public Metric_nameContext metric_name() {
			return getRuleContext(Metric_nameContext.class,0);
		}
		public TerminalNode K_TAGGED() { return getToken(NexusParser.K_TAGGED, 0); }
		public Tag_listContext tag_list() {
			return getRuleContext(Tag_listContext.class,0);
		}
		public TerminalNode K_AT() { return getToken(NexusParser.K_AT, 0); }
		public List<TimestampContext> timestamp() {
			return getRuleContexts(TimestampContext.class);
		}
		public TimestampContext timestamp(int i) {
			return getRuleContext(TimestampContext.class,i);
		}
		public TerminalNode K_TO() { return getToken(NexusParser.K_TO, 0); }
		public RemoveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeStatement; }
	}

	public final RemoveStatementContext removeStatement() throws RecognitionException {
		RemoveStatementContext _localctx = new RemoveStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_removeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(K_REMOVE);
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SERIES:
				{
				setState(165);
				series_specifier();
				}
				break;
			case K_FROM:
				{
				setState(166);
				match(K_FROM);
				setState(167);
				metric_name();
				setState(168);
				match(K_TAGGED);
				setState(169);
				tag_list();
				setState(177);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_AT:
					{
					setState(170);
					match(K_AT);
					setState(171);
					timestamp();
					}
					break;
				case K_FROM:
					{
					setState(172);
					match(K_FROM);
					setState(173);
					timestamp();
					setState(174);
					match(K_TO);
					setState(175);
					timestamp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShowStatementContext extends ParserRuleContext {
		public TerminalNode K_SHOW() { return getToken(NexusParser.K_SHOW, 0); }
		public TerminalNode K_METRICS() { return getToken(NexusParser.K_METRICS, 0); }
		public TerminalNode K_TAG() { return getToken(NexusParser.K_TAG, 0); }
		public TerminalNode K_KEYS() { return getToken(NexusParser.K_KEYS, 0); }
		public TerminalNode K_FROM() { return getToken(NexusParser.K_FROM, 0); }
		public Metric_nameContext metric_name() {
			return getRuleContext(Metric_nameContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(NexusParser.K_VALUES, 0); }
		public TerminalNode K_WITH() { return getToken(NexusParser.K_WITH, 0); }
		public TerminalNode K_KEY() { return getToken(NexusParser.K_KEY, 0); }
		public Tag_valueContext tag_value() {
			return getRuleContext(Tag_valueContext.class,0);
		}
		public ShowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStatement; }
	}

	public final ShowStatementContext showStatement() throws RecognitionException {
		ShowStatementContext _localctx = new ShowStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_showStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(K_SHOW);
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(182);
				match(K_METRICS);
				}
				break;
			case 2:
				{
				setState(183);
				match(K_TAG);
				setState(184);
				match(K_KEYS);
				setState(185);
				match(K_FROM);
				setState(186);
				metric_name();
				}
				break;
			case 3:
				{
				setState(187);
				match(K_TAG);
				setState(188);
				match(K_VALUES);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(189);
					match(K_FROM);
					setState(190);
					metric_name();
					}
				}

				setState(193);
				match(K_WITH);
				setState(194);
				match(K_KEY);
				setState(195);
				match(T__3);
				setState(196);
				tag_value();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FlushStatementContext extends ParserRuleContext {
		public TerminalNode K_FLUSH() { return getToken(NexusParser.K_FLUSH, 0); }
		public TerminalNode K_MEMTABLE() { return getToken(NexusParser.K_MEMTABLE, 0); }
		public TerminalNode K_DISK() { return getToken(NexusParser.K_DISK, 0); }
		public TerminalNode K_ALL() { return getToken(NexusParser.K_ALL, 0); }
		public FlushStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flushStatement; }
	}

	public final FlushStatementContext flushStatement() throws RecognitionException {
		FlushStatementContext _localctx = new FlushStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_flushStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(K_FLUSH);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) {
				{
				setState(200);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aggregation_spec_listContext extends ParserRuleContext {
		public List<Aggregation_specContext> aggregation_spec() {
			return getRuleContexts(Aggregation_specContext.class);
		}
		public Aggregation_specContext aggregation_spec(int i) {
			return getRuleContext(Aggregation_specContext.class,i);
		}
		public Aggregation_spec_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_spec_list; }
	}

	public final Aggregation_spec_listContext aggregation_spec_list() throws RecognitionException {
		Aggregation_spec_listContext _localctx = new Aggregation_spec_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_aggregation_spec_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			aggregation_spec();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(204);
				match(T__4);
				setState(205);
				aggregation_spec();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aggregation_specContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(NexusParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NexusParser.IDENTIFIER, i);
		}
		public TerminalNode K_AS() { return getToken(NexusParser.K_AS, 0); }
		public Aggregation_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_spec; }
	}

	public final Aggregation_specContext aggregation_spec() throws RecognitionException {
		Aggregation_specContext _localctx = new Aggregation_specContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aggregation_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(IDENTIFIER);
			setState(212);
			match(T__1);
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(214);
			match(T__2);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AS) {
				{
				setState(215);
				match(K_AS);
				setState(216);
				match(IDENTIFIER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Series_specifierContext extends ParserRuleContext {
		public TerminalNode K_SERIES() { return getToken(NexusParser.K_SERIES, 0); }
		public Metric_nameContext metric_name() {
			return getRuleContext(Metric_nameContext.class,0);
		}
		public TerminalNode K_TAGGED() { return getToken(NexusParser.K_TAGGED, 0); }
		public Tag_listContext tag_list() {
			return getRuleContext(Tag_listContext.class,0);
		}
		public Series_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_series_specifier; }
	}

	public final Series_specifierContext series_specifier() throws RecognitionException {
		Series_specifierContext _localctx = new Series_specifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_series_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(K_SERIES);
			setState(220);
			metric_name();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TAGGED) {
				{
				setState(221);
				match(K_TAGGED);
				setState(222);
				tag_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Metric_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NexusParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(NexusParser.STRING_LITERAL, 0); }
		public Metric_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metric_name; }
	}

	public final Metric_nameContext metric_name() throws RecognitionException {
		Metric_nameContext _localctx = new Metric_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_metric_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tag_listContext extends ParserRuleContext {
		public List<Tag_assignmentContext> tag_assignment() {
			return getRuleContexts(Tag_assignmentContext.class);
		}
		public Tag_assignmentContext tag_assignment(int i) {
			return getRuleContext(Tag_assignmentContext.class,i);
		}
		public Tag_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_list; }
	}

	public final Tag_listContext tag_list() throws RecognitionException {
		Tag_listContext _localctx = new Tag_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tag_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__1);
			setState(228);
			tag_assignment();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(229);
				match(T__4);
				setState(230);
				tag_assignment();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tag_assignmentContext extends ParserRuleContext {
		public Tag_valueContext tag_value() {
			return getRuleContext(Tag_valueContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NexusParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(NexusParser.STRING_LITERAL, 0); }
		public Tag_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_assignment; }
	}

	public final Tag_assignmentContext tag_assignment() throws RecognitionException {
		Tag_assignmentContext _localctx = new Tag_assignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tag_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(239);
			match(T__3);
			setState(240);
			tag_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tag_valueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(NexusParser.STRING_LITERAL, 0); }
		public Tag_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_value; }
	}

	public final Tag_valueContext tag_value() throws RecognitionException {
		Tag_valueContext _localctx = new Tag_valueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tag_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_listContext extends ParserRuleContext {
		public List<Field_assignmentContext> field_assignment() {
			return getRuleContexts(Field_assignmentContext.class);
		}
		public Field_assignmentContext field_assignment(int i) {
			return getRuleContext(Field_assignmentContext.class,i);
		}
		public Field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_list; }
	}

	public final Field_listContext field_list() throws RecognitionException {
		Field_listContext _localctx = new Field_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_field_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__1);
			setState(245);
			field_assignment();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(246);
				match(T__4);
				setState(247);
				field_assignment();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_assignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NexusParser.IDENTIFIER, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Field_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_assignment; }
	}

	public final Field_assignmentContext field_assignment() throws RecognitionException {
		Field_assignmentContext _localctx = new Field_assignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_field_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(IDENTIFIER);
			setState(256);
			match(T__3);
			setState(257);
			literal_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimestampContext extends ParserRuleContext {
		public TimestampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp; }
	 
		public TimestampContext() { }
		public void copyFrom(TimestampContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimestampNowContext extends TimestampContext {
		public TerminalNode K_NOW() { return getToken(NexusParser.K_NOW, 0); }
		public TimestampNowContext(TimestampContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimestampLiteralContext extends TimestampContext {
		public TerminalNode NUMBER() { return getToken(NexusParser.NUMBER, 0); }
		public TimestampLiteralContext(TimestampContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimestampDateTimeContext extends TimestampContext {
		public TerminalNode K_DT() { return getToken(NexusParser.K_DT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(NexusParser.STRING_LITERAL, 0); }
		public TimestampDateTimeContext(TimestampContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimestampNowRelativeContext extends TimestampContext {
		public TerminalNode K_NOW() { return getToken(NexusParser.K_NOW, 0); }
		public TerminalNode DURATION_LITERAL() { return getToken(NexusParser.DURATION_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(NexusParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NexusParser.MINUS, 0); }
		public TimestampNowRelativeContext(TimestampContext ctx) { copyFrom(ctx); }
	}

	public final TimestampContext timestamp() throws RecognitionException {
		TimestampContext _localctx = new TimestampContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_timestamp);
		int _la;
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new TimestampLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(NUMBER);
				}
				break;
			case 2:
				_localctx = new TimestampNowContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(K_NOW);
				setState(261);
				match(T__1);
				setState(262);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new TimestampNowRelativeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				match(K_NOW);
				setState(264);
				match(T__1);
				setState(265);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				match(DURATION_LITERAL);
				setState(267);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new TimestampDateTimeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(K_DT);
				setState(269);
				match(T__1);
				setState(270);
				match(STRING_LITERAL);
				setState(271);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DurationContext extends ParserRuleContext {
		public TerminalNode DURATION_LITERAL() { return getToken(NexusParser.DURATION_LITERAL, 0); }
		public DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration; }
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(DURATION_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NexusParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NexusParser.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(NexusParser.STRING_LITERAL, 0); }
		public TerminalNode K_TRUE() { return getToken(NexusParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(NexusParser.K_FALSE, 0); }
		public TerminalNode K_NULL() { return getToken(NexusParser.K_NULL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 90073916692758528L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Option_listContext extends ParserRuleContext {
		public List<Option_assignmentContext> option_assignment() {
			return getRuleContexts(Option_assignmentContext.class);
		}
		public Option_assignmentContext option_assignment(int i) {
			return getRuleContext(Option_assignmentContext.class,i);
		}
		public Option_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_list; }
	}

	public final Option_listContext option_list() throws RecognitionException {
		Option_listContext _localctx = new Option_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_option_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__1);
			setState(281);
			option_assignment();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(282);
				match(T__4);
				setState(283);
				option_assignment();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Option_assignmentContext extends ParserRuleContext {
		public Option_valueContext option_value() {
			return getRuleContext(Option_valueContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NexusParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(NexusParser.STRING_LITERAL, 0); }
		public Option_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_assignment; }
	}

	public final Option_assignmentContext option_assignment() throws RecognitionException {
		Option_assignmentContext _localctx = new Option_assignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_option_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(292);
			match(T__3);
			setState(293);
			option_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Option_valueContext extends ParserRuleContext {
		public TerminalNode DURATION_LITERAL() { return getToken(NexusParser.DURATION_LITERAL, 0); }
		public TerminalNode NUMBER() { return getToken(NexusParser.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(NexusParser.STRING_LITERAL, 0); }
		public TerminalNode K_TRUE() { return getToken(NexusParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(NexusParser.K_FALSE, 0); }
		public Option_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_value; }
	}

	public final Option_valueContext option_value() throws RecognitionException {
		Option_valueContext _localctx = new Option_valueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_option_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 99080016435871744L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u012a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000?\b\u0000\u0001\u0000\u0003\u0000B\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002M\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003S\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003W\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004a\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005h\b"+
		"\u0005\u0001\u0005\u0003\u0005k\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006w\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007|\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0084\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0088\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008c"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0090\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0094\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0098\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u009f\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a3\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b2\b\b\u0003\b\u00b4"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00c0\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c6"+
		"\b\t\u0001\n\u0001\n\u0003\n\u00ca\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00cf\b\u000b\n\u000b\f\u000b\u00d2\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00da\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00e0\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e8\b\u000f\n\u000f\f\u000f"+
		"\u00eb\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00f9\b\u0012\n\u0012\f\u0012\u00fc\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0111\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u011d\b\u0018\n\u0018\f\u0018\u0120\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0000\u0000\u001b\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000"+
		"\u0007\u0001\u0000./\u0001\u0000*,\u0002\u0000\u0006\u000677\u0001\u0000"+
		"78\u0001\u000034\u0003\u0000&(6688\u0003\u0000&\'5688\u0137\u0000>\u0001"+
		"\u0000\u0000\u0000\u0002E\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000"+
		"\u0000\u0006N\u0001\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000\nb\u0001"+
		"\u0000\u0000\u0000\fv\u0001\u0000\u0000\u0000\u000e\u00a2\u0001\u0000"+
		"\u0000\u0000\u0010\u00a4\u0001\u0000\u0000\u0000\u0012\u00b5\u0001\u0000"+
		"\u0000\u0000\u0014\u00c7\u0001\u0000\u0000\u0000\u0016\u00cb\u0001\u0000"+
		"\u0000\u0000\u0018\u00d3\u0001\u0000\u0000\u0000\u001a\u00db\u0001\u0000"+
		"\u0000\u0000\u001c\u00e1\u0001\u0000\u0000\u0000\u001e\u00e3\u0001\u0000"+
		"\u0000\u0000 \u00ee\u0001\u0000\u0000\u0000\"\u00f2\u0001\u0000\u0000"+
		"\u0000$\u00f4\u0001\u0000\u0000\u0000&\u00ff\u0001\u0000\u0000\u0000("+
		"\u0110\u0001\u0000\u0000\u0000*\u0112\u0001\u0000\u0000\u0000,\u0114\u0001"+
		"\u0000\u0000\u0000.\u0116\u0001\u0000\u0000\u00000\u0118\u0001\u0000\u0000"+
		"\u00002\u0123\u0001\u0000\u0000\u00004\u0127\u0001\u0000\u0000\u00006"+
		"?\u0003\u0006\u0003\u00007?\u0003\b\u0004\u00008?\u0003\n\u0005\u0000"+
		"9?\u0003\u0010\b\u0000:?\u0003\u0012\t\u0000;?\u0003\u0014\n\u0000<?\u0003"+
		"\u0002\u0001\u0000=?\u0003\u0004\u0002\u0000>6\u0001\u0000\u0000\u0000"+
		">7\u0001\u0000\u0000\u0000>8\u0001\u0000\u0000\u0000>9\u0001\u0000\u0000"+
		"\u0000>:\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000>=\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@B\u0005"+
		"\u0001\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CD\u0005\u0000\u0000\u0001D\u0001\u0001\u0000"+
		"\u0000\u0000EF\u0005\t\u0000\u0000F\u0003\u0001\u0000\u0000\u0000GH\u0005"+
		"\b\u0000\u0000HI\u0005\u0011\u0000\u0000IL\u00058\u0000\u0000JK\u0005"+
		"\"\u0000\u0000KM\u0005\u0007\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000M\u0005\u0001\u0000\u0000\u0000NO\u0005\f\u0000\u0000"+
		"OR\u0003\u001c\u000e\u0000PQ\u0005$\u0000\u0000QS\u0003(\u0014\u0000R"+
		"P\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000"+
		"\u0000TU\u0005\u0014\u0000\u0000UW\u0003\u001e\u000f\u0000VT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0005"+
		"\u0010\u0000\u0000YZ\u0003$\u0012\u0000Z\u0007\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u000b\u0000\u0000\\]\u0005\u001d\u0000\u0000]`\u0003\u001c\u000e"+
		"\u0000^_\u0005\"\u0000\u0000_a\u00030\u0018\u0000`^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000a\t\u0001\u0000\u0000\u0000bc\u0005\r"+
		"\u0000\u0000cd\u0003\u001c\u000e\u0000dg\u0003\f\u0006\u0000ef\u0005\u0014"+
		"\u0000\u0000fh\u0003\u001e\u000f\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ik\u0003\u000e\u0007\u0000"+
		"ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\u000b\u0001\u0000"+
		"\u0000\u0000lm\u0005\u0011\u0000\u0000mn\u0003(\u0014\u0000no\u0005\u0012"+
		"\u0000\u0000op\u0003(\u0014\u0000pw\u0001\u0000\u0000\u0000qr\u0005\u0011"+
		"\u0000\u0000rs\u00052\u0000\u0000st\u0005\u0002\u0000\u0000tu\u00055\u0000"+
		"\u0000uw\u0005\u0003\u0000\u0000vl\u0001\u0000\u0000\u0000vq\u0001\u0000"+
		"\u0000\u0000w\r\u0001\u0000\u0000\u0000x{\u0005\u0015\u0000\u0000yz\u0005"+
		"\u0016\u0000\u0000z|\u0003*\u0015\u0000{y\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005\u0002\u0000\u0000"+
		"~\u007f\u0003\u0016\u000b\u0000\u007f\u0083\u0005\u0003\u0000\u0000\u0080"+
		"\u0081\u0005\"\u0000\u0000\u0081\u0082\u0005\u001b\u0000\u0000\u0082\u0084"+
		"\u0005\u001c\u0000\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\u0018\u0000\u0000\u0086\u0088\u00056\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008b\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\u001a\u0000\u0000\u008a\u008c\u0005"+
		"8\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u00a3\u0001\u0000\u0000\u0000\u008d\u008f\u0005-\u0000"+
		"\u0000\u008e\u0090\u0007\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u0018\u0000\u0000\u0092\u0094\u00056\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u001a\u0000\u0000"+
		"\u0096\u0098\u00058\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0001\u0000\u0000\u0000\u0098\u00a3\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005\u0018\u0000\u0000\u009a\u009b\u00056\u0000\u0000\u009b\u009e"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u001a\u0000\u0000\u009d\u009f"+
		"\u00058\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a3\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005"+
		"\u001a\u0000\u0000\u00a1\u00a3\u00058\u0000\u0000\u00a2x\u0001\u0000\u0000"+
		"\u0000\u00a2\u008d\u0001\u0000\u0000\u0000\u00a2\u0099\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u000f\u0001\u0000\u0000"+
		"\u0000\u00a4\u00b3\u0005\u000e\u0000\u0000\u00a5\u00b4\u0003\u001a\r\u0000"+
		"\u00a6\u00a7\u0005\u0011\u0000\u0000\u00a7\u00a8\u0003\u001c\u000e\u0000"+
		"\u00a8\u00a9\u0005\u0014\u0000\u0000\u00a9\u00b1\u0003\u001e\u000f\u0000"+
		"\u00aa\u00ab\u0005\u0013\u0000\u0000\u00ab\u00b2\u0003(\u0014\u0000\u00ac"+
		"\u00ad\u0005\u0011\u0000\u0000\u00ad\u00ae\u0003(\u0014\u0000\u00ae\u00af"+
		"\u0005\u0012\u0000\u0000\u00af\u00b0\u0003(\u0014\u0000\u00b0\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b1\u00aa\u0001\u0000\u0000\u0000\u00b1\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00a5\u0001"+
		"\u0000\u0000\u0000\u00b3\u00a6\u0001\u0000\u0000\u0000\u00b4\u0011\u0001"+
		"\u0000\u0000\u0000\u00b5\u00c5\u0005\u000f\u0000\u0000\u00b6\u00c6\u0005"+
		"\u001d\u0000\u0000\u00b7\u00b8\u0005\u001f\u0000\u0000\u00b8\u00b9\u0005"+
		" \u0000\u0000\u00b9\u00ba\u0005\u0011\u0000\u0000\u00ba\u00c6\u0003\u001c"+
		"\u000e\u0000\u00bb\u00bc\u0005\u001f\u0000\u0000\u00bc\u00bf\u0005!\u0000"+
		"\u0000\u00bd\u00be\u0005\u0011\u0000\u0000\u00be\u00c0\u0003\u001c\u000e"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\"\u0000\u0000"+
		"\u00c2\u00c3\u0005#\u0000\u0000\u00c3\u00c4\u0005\u0004\u0000\u0000\u00c4"+
		"\u00c6\u0003\"\u0011\u0000\u00c5\u00b6\u0001\u0000\u0000\u0000\u00c5\u00b7"+
		"\u0001\u0000\u0000\u0000\u00c5\u00bb\u0001\u0000\u0000\u0000\u00c6\u0013"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005)\u0000\u0000\u00c8\u00ca\u0007"+
		"\u0001\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ca\u0015\u0001\u0000\u0000\u0000\u00cb\u00d0\u0003"+
		"\u0018\f\u0000\u00cc\u00cd\u0005\u0005\u0000\u0000\u00cd\u00cf\u0003\u0018"+
		"\f\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u0017\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u00057\u0000\u0000\u00d4\u00d5\u0005\u0002\u0000\u0000"+
		"\u00d5\u00d6\u0007\u0002\u0000\u0000\u00d6\u00d9\u0005\u0003\u0000\u0000"+
		"\u00d7\u00d8\u00050\u0000\u0000\u00d8\u00da\u00057\u0000\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u0019"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0019\u0000\u0000\u00dc\u00df"+
		"\u0003\u001c\u000e\u0000\u00dd\u00de\u0005\u0014\u0000\u0000\u00de\u00e0"+
		"\u0003\u001e\u000f\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0\u001b\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0007\u0003\u0000\u0000\u00e2\u001d\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005\u0002\u0000\u0000\u00e4\u00e9\u0003 \u0010\u0000\u00e5\u00e6\u0005"+
		"\u0005\u0000\u0000\u00e6\u00e8\u0003 \u0010\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0003"+
		"\u0000\u0000\u00ed\u001f\u0001\u0000\u0000\u0000\u00ee\u00ef\u0007\u0003"+
		"\u0000\u0000\u00ef\u00f0\u0005\u0004\u0000\u0000\u00f0\u00f1\u0003\"\u0011"+
		"\u0000\u00f1!\u0001\u0000\u0000\u0000\u00f2\u00f3\u00058\u0000\u0000\u00f3"+
		"#\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0002\u0000\u0000\u00f5\u00fa"+
		"\u0003&\u0013\u0000\u00f6\u00f7\u0005\u0005\u0000\u0000\u00f7\u00f9\u0003"+
		"&\u0013\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0005\u0003\u0000\u0000\u00fe%\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u00057\u0000\u0000\u0100\u0101\u0005\u0004\u0000\u0000"+
		"\u0101\u0102\u0003.\u0017\u0000\u0102\'\u0001\u0000\u0000\u0000\u0103"+
		"\u0111\u00056\u0000\u0000\u0104\u0105\u0005%\u0000\u0000\u0105\u0106\u0005"+
		"\u0002\u0000\u0000\u0106\u0111\u0005\u0003\u0000\u0000\u0107\u0108\u0005"+
		"%\u0000\u0000\u0108\u0109\u0005\u0002\u0000\u0000\u0109\u010a\u0007\u0004"+
		"\u0000\u0000\u010a\u010b\u00055\u0000\u0000\u010b\u0111\u0005\u0003\u0000"+
		"\u0000\u010c\u010d\u00051\u0000\u0000\u010d\u010e\u0005\u0002\u0000\u0000"+
		"\u010e\u010f\u00058\u0000\u0000\u010f\u0111\u0005\u0003\u0000\u0000\u0110"+
		"\u0103\u0001\u0000\u0000\u0000\u0110\u0104\u0001\u0000\u0000\u0000\u0110"+
		"\u0107\u0001\u0000\u0000\u0000\u0110\u010c\u0001\u0000\u0000\u0000\u0111"+
		")\u0001\u0000\u0000\u0000\u0112\u0113\u00055\u0000\u0000\u0113+\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u00056\u0000\u0000\u0115-\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0007\u0005\u0000\u0000\u0117/\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0005\u0002\u0000\u0000\u0119\u011e\u00032\u0019\u0000\u011a"+
		"\u011b\u0005\u0005\u0000\u0000\u011b\u011d\u00032\u0019\u0000\u011c\u011a"+
		"\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0121"+
		"\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0005\u0003\u0000\u0000\u01221\u0001\u0000\u0000\u0000\u0123\u0124\u0007"+
		"\u0003\u0000\u0000\u0124\u0125\u0005\u0004\u0000\u0000\u0125\u0126\u0003"+
		"4\u001a\u0000\u01263\u0001\u0000\u0000\u0000\u0127\u0128\u0007\u0006\u0000"+
		"\u0000\u01285\u0001\u0000\u0000\u0000\u001e>ALRV`gjv{\u0083\u0087\u008b"+
		"\u008f\u0093\u0097\u009e\u00a2\u00b1\u00b3\u00bf\u00c5\u00c9\u00d0\u00d9"+
		"\u00df\u00e9\u00fa\u0110\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}