// $ANTLR 3.5.2 nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g 2017-12-22 16:45:45

	package org.apache.nifi.record.path;
	import org.apache.nifi.record.path.exception.RecordPathException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class RecordPathParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHILD_SEPARATOR", "COMMA", "CONTAINS", 
		"CONTAINS_REGEX", "CURRENT_FIELD", "DESCENDANT_SEPARATOR", "ENDS_WITH", 
		"EQUAL", "ESC", "GREATER_THAN", "GREATER_THAN_EQUAL", "IDENTIFIER", "IS_BLANK", 
		"IS_EMPTY", "LBRACKET", "LESS_THAN", "LESS_THAN_EQUAL", "LPAREN", "MATCHES_REGEX", 
		"NOT", "NOT_EQUAL", "NUMBER", "QUOTE", "RANGE", "RBRACKET", "RPAREN", 
		"SPACE", "STARTS_WITH", "STRING_LITERAL", "WHITESPACE", "WILDCARD", "ARGUMENTS", 
		"ARRAY_INDEX", "CHILD_REFERENCE", "DESCENDANT_REFERENCE", "FIELD_NAME", 
		"FUNCTION", "MAP_KEY", "NUMBER_LIST", "NUMBER_RANGE", "OPERATOR", "PARENT_REFERENCE", 
		"PATH", "PATH_EXPRESSION", "PREDICATE", "RELATIVE_PATH", "ROOT_REFERENCE", 
		"STRING_LIST"
	};
	public static final int EOF=-1;
	public static final int CHILD_SEPARATOR=4;
	public static final int COMMA=5;
	public static final int CONTAINS=6;
	public static final int CONTAINS_REGEX=7;
	public static final int CURRENT_FIELD=8;
	public static final int DESCENDANT_SEPARATOR=9;
	public static final int ENDS_WITH=10;
	public static final int EQUAL=11;
	public static final int ESC=12;
	public static final int GREATER_THAN=13;
	public static final int GREATER_THAN_EQUAL=14;
	public static final int IDENTIFIER=15;
	public static final int IS_BLANK=16;
	public static final int IS_EMPTY=17;
	public static final int LBRACKET=18;
	public static final int LESS_THAN=19;
	public static final int LESS_THAN_EQUAL=20;
	public static final int LPAREN=21;
	public static final int MATCHES_REGEX=22;
	public static final int NOT=23;
	public static final int NOT_EQUAL=24;
	public static final int NUMBER=25;
	public static final int QUOTE=26;
	public static final int RANGE=27;
	public static final int RBRACKET=28;
	public static final int RPAREN=29;
	public static final int SPACE=30;
	public static final int STARTS_WITH=31;
	public static final int STRING_LITERAL=32;
	public static final int WHITESPACE=33;
	public static final int WILDCARD=34;
	public static final int ARGUMENTS=35;
	public static final int ARRAY_INDEX=36;
	public static final int CHILD_REFERENCE=37;
	public static final int DESCENDANT_REFERENCE=38;
	public static final int FIELD_NAME=39;
	public static final int FUNCTION=40;
	public static final int MAP_KEY=41;
	public static final int NUMBER_LIST=42;
	public static final int NUMBER_RANGE=43;
	public static final int OPERATOR=44;
	public static final int PARENT_REFERENCE=45;
	public static final int PATH=46;
	public static final int PATH_EXPRESSION=47;
	public static final int PREDICATE=48;
	public static final int RELATIVE_PATH=49;
	public static final int ROOT_REFERENCE=50;
	public static final int STRING_LIST=51;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public RecordPathParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public RecordPathParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return RecordPathParser.tokenNames; }
	@Override public String getGrammarFileName() { return "nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g"; }


	  public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
	  	final StringBuilder sb = new StringBuilder();
	    if ( e.token == null ) {
	    	sb.append("Unrecognized token ");
	    } else {
	    	sb.append("Unexpected token '").append(e.token.getText()).append("' ");
	    }
	    sb.append("at line ").append(e.line);
	    if ( e.approximateLineInfo ) {
	    	sb.append(" (approximately)");
	    }
	    sb.append(", column ").append(e.charPositionInLine);
	    sb.append(". Query: ").append(e.input.toString());

	    throw new RecordPathException(sb.toString());
	  }

	  public void recover(final RecognitionException e) {
	  	final StringBuilder sb = new StringBuilder();
	    if ( e.token == null ) {
	    	sb.append("Unrecognized token ");
	    } else {
	    	sb.append("Unexpected token '").append(e.token.getText()).append("' ");
	    }
	    sb.append("at line ").append(e.line);
	    if ( e.approximateLineInfo ) {
	    	sb.append(" (approximately)");
	    }
	    sb.append(", column ").append(e.charPositionInLine);
	    sb.append(". Query: ").append(e.input.toString());

	    throw new RecordPathException(sb.toString());
	  }


	public static class multipleStringLiterals_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multipleStringLiterals"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:90:1: multipleStringLiterals : STRING_LITERAL ( COMMA ! STRING_LITERAL )* ;
	public final RecordPathParser.multipleStringLiterals_return multipleStringLiterals() throws RecognitionException {
		RecordPathParser.multipleStringLiterals_return retval = new RecordPathParser.multipleStringLiterals_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING_LITERAL1=null;
		Token COMMA2=null;
		Token STRING_LITERAL3=null;

		Object STRING_LITERAL1_tree=null;
		Object COMMA2_tree=null;
		Object STRING_LITERAL3_tree=null;

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:90:24: ( STRING_LITERAL ( COMMA ! STRING_LITERAL )* )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:90:26: STRING_LITERAL ( COMMA ! STRING_LITERAL )*
			{
			root_0 = (Object)adaptor.nil();


			STRING_LITERAL1=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_multipleStringLiterals124); 
			STRING_LITERAL1_tree = (Object)adaptor.create(STRING_LITERAL1);
			adaptor.addChild(root_0, STRING_LITERAL1_tree);

			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:90:41: ( COMMA ! STRING_LITERAL )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==COMMA) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:90:42: COMMA ! STRING_LITERAL
					{
					COMMA2=(Token)match(input,COMMA,FOLLOW_COMMA_in_multipleStringLiterals127); 
					STRING_LITERAL3=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_multipleStringLiterals130); 
					STRING_LITERAL3_tree = (Object)adaptor.create(STRING_LITERAL3);
					adaptor.addChild(root_0, STRING_LITERAL3_tree);

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multipleStringLiterals"


	public static class stringList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stringList"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:92:1: stringList : multipleStringLiterals -> ^( STRING_LIST multipleStringLiterals ) ;
	public final RecordPathParser.stringList_return stringList() throws RecognitionException {
		RecordPathParser.stringList_return retval = new RecordPathParser.stringList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope multipleStringLiterals4 =null;

		RewriteRuleSubtreeStream stream_multipleStringLiterals=new RewriteRuleSubtreeStream(adaptor,"rule multipleStringLiterals");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:92:12: ( multipleStringLiterals -> ^( STRING_LIST multipleStringLiterals ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:92:14: multipleStringLiterals
			{
			pushFollow(FOLLOW_multipleStringLiterals_in_stringList140);
			multipleStringLiterals4=multipleStringLiterals();
			state._fsp--;

			stream_multipleStringLiterals.add(multipleStringLiterals4.getTree());
			// AST REWRITE
			// elements: multipleStringLiterals
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 92:37: -> ^( STRING_LIST multipleStringLiterals )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:93:2: ^( STRING_LIST multipleStringLiterals )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRING_LIST, "STRING_LIST"), root_1);
				adaptor.addChild(root_1, stream_multipleStringLiterals.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stringList"


	public static class rawOrLiteral_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "rawOrLiteral"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:95:1: rawOrLiteral : ( IDENTIFIER | STRING_LITERAL );
	public final RecordPathParser.rawOrLiteral_return rawOrLiteral() throws RecognitionException {
		RecordPathParser.rawOrLiteral_return retval = new RecordPathParser.rawOrLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set5=null;

		Object set5_tree=null;

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:95:14: ( IDENTIFIER | STRING_LITERAL )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set5=input.LT(1);
			if ( input.LA(1)==IDENTIFIER||input.LA(1)==STRING_LITERAL ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set5));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rawOrLiteral"


	public static class mapKey_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mapKey"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:103:1: mapKey : stringList -> ^( MAP_KEY stringList ) ;
	public final RecordPathParser.mapKey_return mapKey() throws RecognitionException {
		RecordPathParser.mapKey_return retval = new RecordPathParser.mapKey_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stringList6 =null;

		RewriteRuleSubtreeStream stream_stringList=new RewriteRuleSubtreeStream(adaptor,"rule stringList");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:103:8: ( stringList -> ^( MAP_KEY stringList ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:103:10: stringList
			{
			pushFollow(FOLLOW_stringList_in_mapKey175);
			stringList6=stringList();
			state._fsp--;

			stream_stringList.add(stringList6.getTree());
			// AST REWRITE
			// elements: stringList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 103:21: -> ^( MAP_KEY stringList )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:104:2: ^( MAP_KEY stringList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MAP_KEY, "MAP_KEY"), root_1);
				adaptor.addChild(root_1, stream_stringList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mapKey"


	public static class range_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "range"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:106:1: range : NUMBER RANGE NUMBER -> ^( NUMBER_RANGE NUMBER NUMBER ) ;
	public final RecordPathParser.range_return range() throws RecognitionException {
		RecordPathParser.range_return retval = new RecordPathParser.range_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER7=null;
		Token RANGE8=null;
		Token NUMBER9=null;

		Object NUMBER7_tree=null;
		Object RANGE8_tree=null;
		Object NUMBER9_tree=null;
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleTokenStream stream_RANGE=new RewriteRuleTokenStream(adaptor,"token RANGE");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:106:7: ( NUMBER RANGE NUMBER -> ^( NUMBER_RANGE NUMBER NUMBER ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:106:9: NUMBER RANGE NUMBER
			{
			NUMBER7=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range192);  
			stream_NUMBER.add(NUMBER7);

			RANGE8=(Token)match(input,RANGE,FOLLOW_RANGE_in_range194);  
			stream_RANGE.add(RANGE8);

			NUMBER9=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range196);  
			stream_NUMBER.add(NUMBER9);

			// AST REWRITE
			// elements: NUMBER, NUMBER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 106:29: -> ^( NUMBER_RANGE NUMBER NUMBER )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:107:2: ^( NUMBER_RANGE NUMBER NUMBER )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NUMBER_RANGE, "NUMBER_RANGE"), root_1);
				adaptor.addChild(root_1, stream_NUMBER.nextNode());
				adaptor.addChild(root_1, stream_NUMBER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "range"


	public static class numberOrRange_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "numberOrRange"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:109:1: numberOrRange : ( NUMBER | range );
	public final RecordPathParser.numberOrRange_return numberOrRange() throws RecognitionException {
		RecordPathParser.numberOrRange_return retval = new RecordPathParser.numberOrRange_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER10=null;
		ParserRuleReturnScope range11 =null;

		Object NUMBER10_tree=null;

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:109:15: ( NUMBER | range )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==NUMBER) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==RANGE) ) {
					alt2=2;
				}
				else if ( (LA2_1==COMMA||LA2_1==RBRACKET) ) {
					alt2=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:109:17: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER10=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_numberOrRange215); 
					NUMBER10_tree = (Object)adaptor.create(NUMBER10);
					adaptor.addChild(root_0, NUMBER10_tree);

					}
					break;
				case 2 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:109:26: range
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_range_in_numberOrRange219);
					range11=range();
					state._fsp--;

					adaptor.addChild(root_0, range11.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "numberOrRange"


	public static class multipleIndices_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multipleIndices"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:111:1: multipleIndices : numberOrRange ( COMMA numberOrRange )* -> ^( NUMBER_LIST numberOrRange ( numberOrRange )* ) ;
	public final RecordPathParser.multipleIndices_return multipleIndices() throws RecognitionException {
		RecordPathParser.multipleIndices_return retval = new RecordPathParser.multipleIndices_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA13=null;
		ParserRuleReturnScope numberOrRange12 =null;
		ParserRuleReturnScope numberOrRange14 =null;

		Object COMMA13_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_numberOrRange=new RewriteRuleSubtreeStream(adaptor,"rule numberOrRange");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:111:17: ( numberOrRange ( COMMA numberOrRange )* -> ^( NUMBER_LIST numberOrRange ( numberOrRange )* ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:111:19: numberOrRange ( COMMA numberOrRange )*
			{
			pushFollow(FOLLOW_numberOrRange_in_multipleIndices227);
			numberOrRange12=numberOrRange();
			state._fsp--;

			stream_numberOrRange.add(numberOrRange12.getTree());
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:111:33: ( COMMA numberOrRange )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMMA) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:111:34: COMMA numberOrRange
					{
					COMMA13=(Token)match(input,COMMA,FOLLOW_COMMA_in_multipleIndices230);  
					stream_COMMA.add(COMMA13);

					pushFollow(FOLLOW_numberOrRange_in_multipleIndices232);
					numberOrRange14=numberOrRange();
					state._fsp--;

					stream_numberOrRange.add(numberOrRange14.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			// AST REWRITE
			// elements: numberOrRange, numberOrRange
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 111:56: -> ^( NUMBER_LIST numberOrRange ( numberOrRange )* )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:112:2: ^( NUMBER_LIST numberOrRange ( numberOrRange )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NUMBER_LIST, "NUMBER_LIST"), root_1);
				adaptor.addChild(root_1, stream_numberOrRange.nextTree());
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:112:30: ( numberOrRange )*
				while ( stream_numberOrRange.hasNext() ) {
					adaptor.addChild(root_1, stream_numberOrRange.nextTree());
				}
				stream_numberOrRange.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multipleIndices"


	public static class arrayIndex_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arrayIndex"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:114:1: arrayIndex : multipleIndices -> ^( ARRAY_INDEX multipleIndices ) ;
	public final RecordPathParser.arrayIndex_return arrayIndex() throws RecognitionException {
		RecordPathParser.arrayIndex_return retval = new RecordPathParser.arrayIndex_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope multipleIndices15 =null;

		RewriteRuleSubtreeStream stream_multipleIndices=new RewriteRuleSubtreeStream(adaptor,"rule multipleIndices");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:114:12: ( multipleIndices -> ^( ARRAY_INDEX multipleIndices ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:114:14: multipleIndices
			{
			pushFollow(FOLLOW_multipleIndices_in_arrayIndex254);
			multipleIndices15=multipleIndices();
			state._fsp--;

			stream_multipleIndices.add(multipleIndices15.getTree());
			// AST REWRITE
			// elements: multipleIndices
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 114:30: -> ^( ARRAY_INDEX multipleIndices )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:115:2: ^( ARRAY_INDEX multipleIndices )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY_INDEX, "ARRAY_INDEX"), root_1);
				adaptor.addChild(root_1, stream_multipleIndices.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayIndex"


	public static class indexOrKey_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "indexOrKey"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:117:1: indexOrKey : ( mapKey | arrayIndex | WILDCARD );
	public final RecordPathParser.indexOrKey_return indexOrKey() throws RecognitionException {
		RecordPathParser.indexOrKey_return retval = new RecordPathParser.indexOrKey_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WILDCARD18=null;
		ParserRuleReturnScope mapKey16 =null;
		ParserRuleReturnScope arrayIndex17 =null;

		Object WILDCARD18_tree=null;

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:117:12: ( mapKey | arrayIndex | WILDCARD )
			int alt4=3;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt4=1;
				}
				break;
			case NUMBER:
				{
				alt4=2;
				}
				break;
			case WILDCARD:
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
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:117:14: mapKey
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_mapKey_in_indexOrKey271);
					mapKey16=mapKey();
					state._fsp--;

					adaptor.addChild(root_0, mapKey16.getTree());

					}
					break;
				case 2 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:117:23: arrayIndex
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_arrayIndex_in_indexOrKey275);
					arrayIndex17=arrayIndex();
					state._fsp--;

					adaptor.addChild(root_0, arrayIndex17.getTree());

					}
					break;
				case 3 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:117:36: WILDCARD
					{
					root_0 = (Object)adaptor.nil();


					WILDCARD18=(Token)match(input,WILDCARD,FOLLOW_WILDCARD_in_indexOrKey279); 
					WILDCARD18_tree = (Object)adaptor.create(WILDCARD18);
					adaptor.addChild(root_0, WILDCARD18_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indexOrKey"


	public static class index_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "index"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:119:1: index : LBRACKET ! indexOrKey RBRACKET !;
	public final RecordPathParser.index_return index() throws RecognitionException {
		RecordPathParser.index_return retval = new RecordPathParser.index_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACKET19=null;
		Token RBRACKET21=null;
		ParserRuleReturnScope indexOrKey20 =null;

		Object LBRACKET19_tree=null;
		Object RBRACKET21_tree=null;

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:119:7: ( LBRACKET ! indexOrKey RBRACKET !)
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:119:9: LBRACKET ! indexOrKey RBRACKET !
			{
			root_0 = (Object)adaptor.nil();


			LBRACKET19=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_index287); 
			pushFollow(FOLLOW_indexOrKey_in_index290);
			indexOrKey20=indexOrKey();
			state._fsp--;

			adaptor.addChild(root_0, indexOrKey20.getTree());

			RBRACKET21=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_index292); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "index"


	public static class operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operator"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:127:1: operator : ( LESS_THAN | LESS_THAN_EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | EQUAL | NOT_EQUAL );
	public final RecordPathParser.operator_return operator() throws RecognitionException {
		RecordPathParser.operator_return retval = new RecordPathParser.operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set22=null;

		Object set22_tree=null;

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:127:10: ( LESS_THAN | LESS_THAN_EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | EQUAL | NOT_EQUAL )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set22=input.LT(1);
			if ( input.LA(1)==EQUAL||(input.LA(1) >= GREATER_THAN && input.LA(1) <= GREATER_THAN_EQUAL)||(input.LA(1) >= LESS_THAN && input.LA(1) <= LESS_THAN_EQUAL)||input.LA(1)==NOT_EQUAL ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set22));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operator"


	public static class literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:129:1: literal : ( NUMBER | STRING_LITERAL );
	public final RecordPathParser.literal_return literal() throws RecognitionException {
		RecordPathParser.literal_return retval = new RecordPathParser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set23=null;

		Object set23_tree=null;

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:129:9: ( NUMBER | STRING_LITERAL )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set23=input.LT(1);
			if ( input.LA(1)==NUMBER||input.LA(1)==STRING_LITERAL ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set23));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literal"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:131:1: expression : ( path | literal | function );
	public final RecordPathParser.expression_return expression() throws RecognitionException {
		RecordPathParser.expression_return retval = new RecordPathParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path24 =null;
		ParserRuleReturnScope literal25 =null;
		ParserRuleReturnScope function26 =null;


		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:131:12: ( path | literal | function )
			int alt5=3;
			switch ( input.LA(1) ) {
			case CHILD_SEPARATOR:
			case CURRENT_FIELD:
			case DESCENDANT_SEPARATOR:
			case RANGE:
				{
				alt5=1;
				}
				break;
			case NUMBER:
			case STRING_LITERAL:
				{
				alt5=2;
				}
				break;
			case IDENTIFIER:
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
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:131:14: path
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_in_expression347);
					path24=path();
					state._fsp--;

					adaptor.addChild(root_0, path24.getTree());

					}
					break;
				case 2 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:131:21: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_expression351);
					literal25=literal();
					state._fsp--;

					adaptor.addChild(root_0, literal25.getTree());

					}
					break;
				case 3 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:131:31: function
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_in_expression355);
					function26=function();
					state._fsp--;

					adaptor.addChild(root_0, function26.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class operation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operation"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:133:1: operation : expression operator ^ expression ;
	public final RecordPathParser.operation_return operation() throws RecognitionException {
		RecordPathParser.operation_return retval = new RecordPathParser.operation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression27 =null;
		ParserRuleReturnScope operator28 =null;
		ParserRuleReturnScope expression29 =null;


		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:133:11: ( expression operator ^ expression )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:133:13: expression operator ^ expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_operation363);
			expression27=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression27.getTree());

			pushFollow(FOLLOW_operator_in_operation365);
			operator28=operator();
			state._fsp--;

			root_0 = (Object)adaptor.becomeRoot(operator28.getTree(), root_0);
			pushFollow(FOLLOW_expression_in_operation368);
			expression29=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression29.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operation"


	public static class filter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "filter"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:135:1: filter : ( filterFunction | operation );
	public final RecordPathParser.filter_return filter() throws RecognitionException {
		RecordPathParser.filter_return retval = new RecordPathParser.filter_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope filterFunction30 =null;
		ParserRuleReturnScope operation31 =null;


		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:135:8: ( filterFunction | operation )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( ((LA6_0 >= CONTAINS && LA6_0 <= CONTAINS_REGEX)||LA6_0==ENDS_WITH||(LA6_0 >= IS_BLANK && LA6_0 <= IS_EMPTY)||(LA6_0 >= MATCHES_REGEX && LA6_0 <= NOT)||LA6_0==STARTS_WITH) ) {
				alt6=1;
			}
			else if ( (LA6_0==CHILD_SEPARATOR||(LA6_0 >= CURRENT_FIELD && LA6_0 <= DESCENDANT_SEPARATOR)||LA6_0==IDENTIFIER||LA6_0==NUMBER||LA6_0==RANGE||LA6_0==STRING_LITERAL) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:135:10: filterFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_filterFunction_in_filter376);
					filterFunction30=filterFunction();
					state._fsp--;

					adaptor.addChild(root_0, filterFunction30.getTree());

					}
					break;
				case 2 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:135:27: operation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operation_in_filter380);
					operation31=operation();
					state._fsp--;

					adaptor.addChild(root_0, operation31.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "filter"


	public static class predicate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "predicate"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:137:1: predicate : LBRACKET filter RBRACKET -> ^( PREDICATE filter ) ;
	public final RecordPathParser.predicate_return predicate() throws RecognitionException {
		RecordPathParser.predicate_return retval = new RecordPathParser.predicate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LBRACKET32=null;
		Token RBRACKET34=null;
		ParserRuleReturnScope filter33 =null;

		Object LBRACKET32_tree=null;
		Object RBRACKET34_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleSubtreeStream stream_filter=new RewriteRuleSubtreeStream(adaptor,"rule filter");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:137:11: ( LBRACKET filter RBRACKET -> ^( PREDICATE filter ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:137:13: LBRACKET filter RBRACKET
			{
			LBRACKET32=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_predicate388);  
			stream_LBRACKET.add(LBRACKET32);

			pushFollow(FOLLOW_filter_in_predicate390);
			filter33=filter();
			state._fsp--;

			stream_filter.add(filter33.getTree());
			RBRACKET34=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_predicate392);  
			stream_RBRACKET.add(RBRACKET34);

			// AST REWRITE
			// elements: filter
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 137:38: -> ^( PREDICATE filter )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:138:2: ^( PREDICATE filter )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREDICATE, "PREDICATE"), root_1);
				adaptor.addChild(root_1, stream_filter.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "predicate"


	public static class argument_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "argument"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:145:1: argument : expression ;
	public final RecordPathParser.argument_return argument() throws RecognitionException {
		RecordPathParser.argument_return retval = new RecordPathParser.argument_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression35 =null;


		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:145:10: ( expression )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:145:12: expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_argument414);
			expression35=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression35.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "argument"


	public static class optionalArgument_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "optionalArgument"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:147:1: optionalArgument : ( argument )? ;
	public final RecordPathParser.optionalArgument_return optionalArgument() throws RecognitionException {
		RecordPathParser.optionalArgument_return retval = new RecordPathParser.optionalArgument_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope argument36 =null;


		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:147:18: ( ( argument )? )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:147:20: ( argument )?
			{
			root_0 = (Object)adaptor.nil();


			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:147:20: ( argument )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==CHILD_SEPARATOR||(LA7_0 >= CURRENT_FIELD && LA7_0 <= DESCENDANT_SEPARATOR)||LA7_0==IDENTIFIER||LA7_0==NUMBER||LA7_0==RANGE||LA7_0==STRING_LITERAL) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:147:20: argument
					{
					pushFollow(FOLLOW_argument_in_optionalArgument422);
					argument36=argument();
					state._fsp--;

					adaptor.addChild(root_0, argument36.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "optionalArgument"


	public static class argumentList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "argumentList"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:149:1: argumentList : optionalArgument ( COMMA argument )* -> ^( ARGUMENTS optionalArgument ( argument )* ) ;
	public final RecordPathParser.argumentList_return argumentList() throws RecognitionException {
		RecordPathParser.argumentList_return retval = new RecordPathParser.argumentList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA38=null;
		ParserRuleReturnScope optionalArgument37 =null;
		ParserRuleReturnScope argument39 =null;

		Object COMMA38_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
		RewriteRuleSubtreeStream stream_optionalArgument=new RewriteRuleSubtreeStream(adaptor,"rule optionalArgument");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:149:14: ( optionalArgument ( COMMA argument )* -> ^( ARGUMENTS optionalArgument ( argument )* ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:149:16: optionalArgument ( COMMA argument )*
			{
			pushFollow(FOLLOW_optionalArgument_in_argumentList431);
			optionalArgument37=optionalArgument();
			state._fsp--;

			stream_optionalArgument.add(optionalArgument37.getTree());
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:149:33: ( COMMA argument )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:149:34: COMMA argument
					{
					COMMA38=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentList434);  
					stream_COMMA.add(COMMA38);

					pushFollow(FOLLOW_argument_in_argumentList436);
					argument39=argument();
					state._fsp--;

					stream_argument.add(argument39.getTree());
					}
					break;

				default :
					break loop8;
				}
			}

			// AST REWRITE
			// elements: argument, optionalArgument
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 149:51: -> ^( ARGUMENTS optionalArgument ( argument )* )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:150:2: ^( ARGUMENTS optionalArgument ( argument )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);
				adaptor.addChild(root_1, stream_optionalArgument.nextTree());
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:150:31: ( argument )*
				while ( stream_argument.hasNext() ) {
					adaptor.addChild(root_1, stream_argument.nextTree());
				}
				stream_argument.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "argumentList"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:152:1: function : IDENTIFIER LPAREN argumentList RPAREN -> ^( FUNCTION IDENTIFIER argumentList ) ;
	public final RecordPathParser.function_return function() throws RecognitionException {
		RecordPathParser.function_return retval = new RecordPathParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER40=null;
		Token LPAREN41=null;
		Token RPAREN43=null;
		ParserRuleReturnScope argumentList42 =null;

		Object IDENTIFIER40_tree=null;
		Object LPAREN41_tree=null;
		Object RPAREN43_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_argumentList=new RewriteRuleSubtreeStream(adaptor,"rule argumentList");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:152:10: ( IDENTIFIER LPAREN argumentList RPAREN -> ^( FUNCTION IDENTIFIER argumentList ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:152:12: IDENTIFIER LPAREN argumentList RPAREN
			{
			IDENTIFIER40=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function458);  
			stream_IDENTIFIER.add(IDENTIFIER40);

			LPAREN41=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function460);  
			stream_LPAREN.add(LPAREN41);

			pushFollow(FOLLOW_argumentList_in_function462);
			argumentList42=argumentList();
			state._fsp--;

			stream_argumentList.add(argumentList42.getTree());
			RPAREN43=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function464);  
			stream_RPAREN.add(RPAREN43);

			// AST REWRITE
			// elements: IDENTIFIER, argumentList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 152:50: -> ^( FUNCTION IDENTIFIER argumentList )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:153:2: ^( FUNCTION IDENTIFIER argumentList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, stream_argumentList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class filterFunctionNames_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "filterFunctionNames"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:156:1: filterFunctionNames : ( CONTAINS | CONTAINS_REGEX | ENDS_WITH | STARTS_WITH | IS_BLANK | IS_EMPTY | MATCHES_REGEX );
	public final RecordPathParser.filterFunctionNames_return filterFunctionNames() throws RecognitionException {
		RecordPathParser.filterFunctionNames_return retval = new RecordPathParser.filterFunctionNames_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set44=null;

		Object set44_tree=null;

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:156:21: ( CONTAINS | CONTAINS_REGEX | ENDS_WITH | STARTS_WITH | IS_BLANK | IS_EMPTY | MATCHES_REGEX )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set44=input.LT(1);
			if ( (input.LA(1) >= CONTAINS && input.LA(1) <= CONTAINS_REGEX)||input.LA(1)==ENDS_WITH||(input.LA(1) >= IS_BLANK && input.LA(1) <= IS_EMPTY)||input.LA(1)==MATCHES_REGEX||input.LA(1)==STARTS_WITH ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set44));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "filterFunctionNames"


	public static class filterArgument_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "filterArgument"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:158:1: filterArgument : ( expression | filterFunction );
	public final RecordPathParser.filterArgument_return filterArgument() throws RecognitionException {
		RecordPathParser.filterArgument_return retval = new RecordPathParser.filterArgument_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression45 =null;
		ParserRuleReturnScope filterFunction46 =null;


		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:158:16: ( expression | filterFunction )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==CHILD_SEPARATOR||(LA9_0 >= CURRENT_FIELD && LA9_0 <= DESCENDANT_SEPARATOR)||LA9_0==IDENTIFIER||LA9_0==NUMBER||LA9_0==RANGE||LA9_0==STRING_LITERAL) ) {
				alt9=1;
			}
			else if ( ((LA9_0 >= CONTAINS && LA9_0 <= CONTAINS_REGEX)||LA9_0==ENDS_WITH||(LA9_0 >= IS_BLANK && LA9_0 <= IS_EMPTY)||(LA9_0 >= MATCHES_REGEX && LA9_0 <= NOT)||LA9_0==STARTS_WITH) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:158:18: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_filterArgument516);
					expression45=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression45.getTree());

					}
					break;
				case 2 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:158:31: filterFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_filterFunction_in_filterArgument520);
					filterFunction46=filterFunction();
					state._fsp--;

					adaptor.addChild(root_0, filterFunction46.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "filterArgument"


	public static class optionalFilterArgument_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "optionalFilterArgument"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:160:1: optionalFilterArgument : ( filterArgument )? ;
	public final RecordPathParser.optionalFilterArgument_return optionalFilterArgument() throws RecognitionException {
		RecordPathParser.optionalFilterArgument_return retval = new RecordPathParser.optionalFilterArgument_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope filterArgument47 =null;


		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:160:24: ( ( filterArgument )? )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:160:26: ( filterArgument )?
			{
			root_0 = (Object)adaptor.nil();


			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:160:26: ( filterArgument )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==CHILD_SEPARATOR||(LA10_0 >= CONTAINS && LA10_0 <= ENDS_WITH)||(LA10_0 >= IDENTIFIER && LA10_0 <= IS_EMPTY)||(LA10_0 >= MATCHES_REGEX && LA10_0 <= NOT)||LA10_0==NUMBER||LA10_0==RANGE||(LA10_0 >= STARTS_WITH && LA10_0 <= STRING_LITERAL)) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:160:26: filterArgument
					{
					pushFollow(FOLLOW_filterArgument_in_optionalFilterArgument528);
					filterArgument47=filterArgument();
					state._fsp--;

					adaptor.addChild(root_0, filterArgument47.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "optionalFilterArgument"


	public static class filterArgumentList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "filterArgumentList"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:162:1: filterArgumentList : optionalFilterArgument ( COMMA filterArgument )* -> ^( ARGUMENTS optionalFilterArgument ( filterArgument )* ) ;
	public final RecordPathParser.filterArgumentList_return filterArgumentList() throws RecognitionException {
		RecordPathParser.filterArgumentList_return retval = new RecordPathParser.filterArgumentList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA49=null;
		ParserRuleReturnScope optionalFilterArgument48 =null;
		ParserRuleReturnScope filterArgument50 =null;

		Object COMMA49_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_optionalFilterArgument=new RewriteRuleSubtreeStream(adaptor,"rule optionalFilterArgument");
		RewriteRuleSubtreeStream stream_filterArgument=new RewriteRuleSubtreeStream(adaptor,"rule filterArgument");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:162:20: ( optionalFilterArgument ( COMMA filterArgument )* -> ^( ARGUMENTS optionalFilterArgument ( filterArgument )* ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:162:22: optionalFilterArgument ( COMMA filterArgument )*
			{
			pushFollow(FOLLOW_optionalFilterArgument_in_filterArgumentList537);
			optionalFilterArgument48=optionalFilterArgument();
			state._fsp--;

			stream_optionalFilterArgument.add(optionalFilterArgument48.getTree());
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:162:45: ( COMMA filterArgument )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==COMMA) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:162:46: COMMA filterArgument
					{
					COMMA49=(Token)match(input,COMMA,FOLLOW_COMMA_in_filterArgumentList540);  
					stream_COMMA.add(COMMA49);

					pushFollow(FOLLOW_filterArgument_in_filterArgumentList542);
					filterArgument50=filterArgument();
					state._fsp--;

					stream_filterArgument.add(filterArgument50.getTree());
					}
					break;

				default :
					break loop11;
				}
			}

			// AST REWRITE
			// elements: optionalFilterArgument, filterArgument
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 162:69: -> ^( ARGUMENTS optionalFilterArgument ( filterArgument )* )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:163:2: ^( ARGUMENTS optionalFilterArgument ( filterArgument )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);
				adaptor.addChild(root_1, stream_optionalFilterArgument.nextTree());
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:163:37: ( filterArgument )*
				while ( stream_filterArgument.hasNext() ) {
					adaptor.addChild(root_1, stream_filterArgument.nextTree());
				}
				stream_filterArgument.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "filterArgumentList"


	public static class simpleFilterFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simpleFilterFunction"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:165:1: simpleFilterFunction : filterFunctionNames LPAREN filterArgumentList RPAREN -> ^( FUNCTION filterFunctionNames filterArgumentList ) ;
	public final RecordPathParser.simpleFilterFunction_return simpleFilterFunction() throws RecognitionException {
		RecordPathParser.simpleFilterFunction_return retval = new RecordPathParser.simpleFilterFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN52=null;
		Token RPAREN54=null;
		ParserRuleReturnScope filterFunctionNames51 =null;
		ParserRuleReturnScope filterArgumentList53 =null;

		Object LPAREN52_tree=null;
		Object RPAREN54_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_filterArgumentList=new RewriteRuleSubtreeStream(adaptor,"rule filterArgumentList");
		RewriteRuleSubtreeStream stream_filterFunctionNames=new RewriteRuleSubtreeStream(adaptor,"rule filterFunctionNames");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:165:22: ( filterFunctionNames LPAREN filterArgumentList RPAREN -> ^( FUNCTION filterFunctionNames filterArgumentList ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:165:24: filterFunctionNames LPAREN filterArgumentList RPAREN
			{
			pushFollow(FOLLOW_filterFunctionNames_in_simpleFilterFunction564);
			filterFunctionNames51=filterFunctionNames();
			state._fsp--;

			stream_filterFunctionNames.add(filterFunctionNames51.getTree());
			LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_simpleFilterFunction566);  
			stream_LPAREN.add(LPAREN52);

			pushFollow(FOLLOW_filterArgumentList_in_simpleFilterFunction568);
			filterArgumentList53=filterArgumentList();
			state._fsp--;

			stream_filterArgumentList.add(filterArgumentList53.getTree());
			RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_simpleFilterFunction570);  
			stream_RPAREN.add(RPAREN54);

			// AST REWRITE
			// elements: filterFunctionNames, filterArgumentList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 165:77: -> ^( FUNCTION filterFunctionNames filterArgumentList )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:166:2: ^( FUNCTION filterFunctionNames filterArgumentList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_filterFunctionNames.nextTree());
				adaptor.addChild(root_1, stream_filterArgumentList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleFilterFunction"


	public static class simpleFilterFunctionOrOperation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simpleFilterFunctionOrOperation"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:168:1: simpleFilterFunctionOrOperation : ( simpleFilterFunction | operation );
	public final RecordPathParser.simpleFilterFunctionOrOperation_return simpleFilterFunctionOrOperation() throws RecognitionException {
		RecordPathParser.simpleFilterFunctionOrOperation_return retval = new RecordPathParser.simpleFilterFunctionOrOperation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simpleFilterFunction55 =null;
		ParserRuleReturnScope operation56 =null;


		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:168:33: ( simpleFilterFunction | operation )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( ((LA12_0 >= CONTAINS && LA12_0 <= CONTAINS_REGEX)||LA12_0==ENDS_WITH||(LA12_0 >= IS_BLANK && LA12_0 <= IS_EMPTY)||LA12_0==MATCHES_REGEX||LA12_0==STARTS_WITH) ) {
				alt12=1;
			}
			else if ( (LA12_0==CHILD_SEPARATOR||(LA12_0 >= CURRENT_FIELD && LA12_0 <= DESCENDANT_SEPARATOR)||LA12_0==IDENTIFIER||LA12_0==NUMBER||LA12_0==RANGE||LA12_0==STRING_LITERAL) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:168:35: simpleFilterFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleFilterFunction_in_simpleFilterFunctionOrOperation589);
					simpleFilterFunction55=simpleFilterFunction();
					state._fsp--;

					adaptor.addChild(root_0, simpleFilterFunction55.getTree());

					}
					break;
				case 2 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:168:58: operation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operation_in_simpleFilterFunctionOrOperation593);
					operation56=operation();
					state._fsp--;

					adaptor.addChild(root_0, operation56.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleFilterFunctionOrOperation"


	public static class notFunctionArgList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "notFunctionArgList"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:170:1: notFunctionArgList : simpleFilterFunctionOrOperation -> ^( ARGUMENTS simpleFilterFunctionOrOperation ) ;
	public final RecordPathParser.notFunctionArgList_return notFunctionArgList() throws RecognitionException {
		RecordPathParser.notFunctionArgList_return retval = new RecordPathParser.notFunctionArgList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simpleFilterFunctionOrOperation57 =null;

		RewriteRuleSubtreeStream stream_simpleFilterFunctionOrOperation=new RewriteRuleSubtreeStream(adaptor,"rule simpleFilterFunctionOrOperation");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:170:20: ( simpleFilterFunctionOrOperation -> ^( ARGUMENTS simpleFilterFunctionOrOperation ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:170:22: simpleFilterFunctionOrOperation
			{
			pushFollow(FOLLOW_simpleFilterFunctionOrOperation_in_notFunctionArgList601);
			simpleFilterFunctionOrOperation57=simpleFilterFunctionOrOperation();
			state._fsp--;

			stream_simpleFilterFunctionOrOperation.add(simpleFilterFunctionOrOperation57.getTree());
			// AST REWRITE
			// elements: simpleFilterFunctionOrOperation
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 170:54: -> ^( ARGUMENTS simpleFilterFunctionOrOperation )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:171:2: ^( ARGUMENTS simpleFilterFunctionOrOperation )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);
				adaptor.addChild(root_1, stream_simpleFilterFunctionOrOperation.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "notFunctionArgList"


	public static class notFilterFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "notFilterFunction"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:173:1: notFilterFunction : NOT LPAREN notFunctionArgList RPAREN -> ^( FUNCTION NOT notFunctionArgList ) ;
	public final RecordPathParser.notFilterFunction_return notFilterFunction() throws RecognitionException {
		RecordPathParser.notFilterFunction_return retval = new RecordPathParser.notFilterFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT58=null;
		Token LPAREN59=null;
		Token RPAREN61=null;
		ParserRuleReturnScope notFunctionArgList60 =null;

		Object NOT58_tree=null;
		Object LPAREN59_tree=null;
		Object RPAREN61_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_notFunctionArgList=new RewriteRuleSubtreeStream(adaptor,"rule notFunctionArgList");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:173:19: ( NOT LPAREN notFunctionArgList RPAREN -> ^( FUNCTION NOT notFunctionArgList ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:173:21: NOT LPAREN notFunctionArgList RPAREN
			{
			NOT58=(Token)match(input,NOT,FOLLOW_NOT_in_notFilterFunction618);  
			stream_NOT.add(NOT58);

			LPAREN59=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_notFilterFunction620);  
			stream_LPAREN.add(LPAREN59);

			pushFollow(FOLLOW_notFunctionArgList_in_notFilterFunction622);
			notFunctionArgList60=notFunctionArgList();
			state._fsp--;

			stream_notFunctionArgList.add(notFunctionArgList60.getTree());
			RPAREN61=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_notFilterFunction624);  
			stream_RPAREN.add(RPAREN61);

			// AST REWRITE
			// elements: NOT, notFunctionArgList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 173:58: -> ^( FUNCTION NOT notFunctionArgList )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:174:2: ^( FUNCTION NOT notFunctionArgList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_NOT.nextNode());
				adaptor.addChild(root_1, stream_notFunctionArgList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "notFilterFunction"


	public static class filterFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "filterFunction"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:176:1: filterFunction : ( simpleFilterFunction | notFilterFunction );
	public final RecordPathParser.filterFunction_return filterFunction() throws RecognitionException {
		RecordPathParser.filterFunction_return retval = new RecordPathParser.filterFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simpleFilterFunction62 =null;
		ParserRuleReturnScope notFilterFunction63 =null;


		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:176:16: ( simpleFilterFunction | notFilterFunction )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= CONTAINS && LA13_0 <= CONTAINS_REGEX)||LA13_0==ENDS_WITH||(LA13_0 >= IS_BLANK && LA13_0 <= IS_EMPTY)||LA13_0==MATCHES_REGEX||LA13_0==STARTS_WITH) ) {
				alt13=1;
			}
			else if ( (LA13_0==NOT) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:176:18: simpleFilterFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleFilterFunction_in_filterFunction644);
					simpleFilterFunction62=simpleFilterFunction();
					state._fsp--;

					adaptor.addChild(root_0, simpleFilterFunction62.getTree());

					}
					break;
				case 2 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:176:41: notFilterFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_notFilterFunction_in_filterFunction648);
					notFilterFunction63=notFilterFunction();
					state._fsp--;

					adaptor.addChild(root_0, notFilterFunction63.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "filterFunction"


	public static class fieldName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fieldName"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:184:1: fieldName : rawOrLiteral -> ^( FIELD_NAME rawOrLiteral ) ;
	public final RecordPathParser.fieldName_return fieldName() throws RecognitionException {
		RecordPathParser.fieldName_return retval = new RecordPathParser.fieldName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope rawOrLiteral64 =null;

		RewriteRuleSubtreeStream stream_rawOrLiteral=new RewriteRuleSubtreeStream(adaptor,"rule rawOrLiteral");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:184:11: ( rawOrLiteral -> ^( FIELD_NAME rawOrLiteral ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:184:13: rawOrLiteral
			{
			pushFollow(FOLLOW_rawOrLiteral_in_fieldName663);
			rawOrLiteral64=rawOrLiteral();
			state._fsp--;

			stream_rawOrLiteral.add(rawOrLiteral64.getTree());
			// AST REWRITE
			// elements: rawOrLiteral
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 184:26: -> ^( FIELD_NAME rawOrLiteral )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:185:2: ^( FIELD_NAME rawOrLiteral )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELD_NAME, "FIELD_NAME"), root_1);
				adaptor.addChild(root_1, stream_rawOrLiteral.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldName"


	public static class wildcardFieldName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "wildcardFieldName"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:187:1: wildcardFieldName : ( fieldName | WILDCARD );
	public final RecordPathParser.wildcardFieldName_return wildcardFieldName() throws RecognitionException {
		RecordPathParser.wildcardFieldName_return retval = new RecordPathParser.wildcardFieldName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WILDCARD66=null;
		ParserRuleReturnScope fieldName65 =null;

		Object WILDCARD66_tree=null;

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:187:19: ( fieldName | WILDCARD )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==IDENTIFIER||LA14_0==STRING_LITERAL) ) {
				alt14=1;
			}
			else if ( (LA14_0==WILDCARD) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:187:21: fieldName
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fieldName_in_wildcardFieldName680);
					fieldName65=fieldName();
					state._fsp--;

					adaptor.addChild(root_0, fieldName65.getTree());

					}
					break;
				case 2 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:187:33: WILDCARD
					{
					root_0 = (Object)adaptor.nil();


					WILDCARD66=(Token)match(input,WILDCARD,FOLLOW_WILDCARD_in_wildcardFieldName684); 
					WILDCARD66_tree = (Object)adaptor.create(WILDCARD66);
					adaptor.addChild(root_0, WILDCARD66_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "wildcardFieldName"


	public static class childReference_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "childReference"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:189:1: childReference : CHILD_SEPARATOR wildcardFieldName -> ^( CHILD_REFERENCE wildcardFieldName ) ;
	public final RecordPathParser.childReference_return childReference() throws RecognitionException {
		RecordPathParser.childReference_return retval = new RecordPathParser.childReference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CHILD_SEPARATOR67=null;
		ParserRuleReturnScope wildcardFieldName68 =null;

		Object CHILD_SEPARATOR67_tree=null;
		RewriteRuleTokenStream stream_CHILD_SEPARATOR=new RewriteRuleTokenStream(adaptor,"token CHILD_SEPARATOR");
		RewriteRuleSubtreeStream stream_wildcardFieldName=new RewriteRuleSubtreeStream(adaptor,"rule wildcardFieldName");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:189:16: ( CHILD_SEPARATOR wildcardFieldName -> ^( CHILD_REFERENCE wildcardFieldName ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:189:18: CHILD_SEPARATOR wildcardFieldName
			{
			CHILD_SEPARATOR67=(Token)match(input,CHILD_SEPARATOR,FOLLOW_CHILD_SEPARATOR_in_childReference692);  
			stream_CHILD_SEPARATOR.add(CHILD_SEPARATOR67);

			pushFollow(FOLLOW_wildcardFieldName_in_childReference694);
			wildcardFieldName68=wildcardFieldName();
			state._fsp--;

			stream_wildcardFieldName.add(wildcardFieldName68.getTree());
			// AST REWRITE
			// elements: wildcardFieldName
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 189:52: -> ^( CHILD_REFERENCE wildcardFieldName )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:190:2: ^( CHILD_REFERENCE wildcardFieldName )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CHILD_REFERENCE, "CHILD_REFERENCE"), root_1);
				adaptor.addChild(root_1, stream_wildcardFieldName.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "childReference"


	public static class descendantReference_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "descendantReference"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:192:1: descendantReference : DESCENDANT_SEPARATOR wildcardFieldName -> ^( DESCENDANT_REFERENCE wildcardFieldName ) ;
	public final RecordPathParser.descendantReference_return descendantReference() throws RecognitionException {
		RecordPathParser.descendantReference_return retval = new RecordPathParser.descendantReference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DESCENDANT_SEPARATOR69=null;
		ParserRuleReturnScope wildcardFieldName70 =null;

		Object DESCENDANT_SEPARATOR69_tree=null;
		RewriteRuleTokenStream stream_DESCENDANT_SEPARATOR=new RewriteRuleTokenStream(adaptor,"token DESCENDANT_SEPARATOR");
		RewriteRuleSubtreeStream stream_wildcardFieldName=new RewriteRuleSubtreeStream(adaptor,"rule wildcardFieldName");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:192:21: ( DESCENDANT_SEPARATOR wildcardFieldName -> ^( DESCENDANT_REFERENCE wildcardFieldName ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:192:23: DESCENDANT_SEPARATOR wildcardFieldName
			{
			DESCENDANT_SEPARATOR69=(Token)match(input,DESCENDANT_SEPARATOR,FOLLOW_DESCENDANT_SEPARATOR_in_descendantReference711);  
			stream_DESCENDANT_SEPARATOR.add(DESCENDANT_SEPARATOR69);

			pushFollow(FOLLOW_wildcardFieldName_in_descendantReference713);
			wildcardFieldName70=wildcardFieldName();
			state._fsp--;

			stream_wildcardFieldName.add(wildcardFieldName70.getTree());
			// AST REWRITE
			// elements: wildcardFieldName
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 192:62: -> ^( DESCENDANT_REFERENCE wildcardFieldName )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:193:2: ^( DESCENDANT_REFERENCE wildcardFieldName )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DESCENDANT_REFERENCE, "DESCENDANT_REFERENCE"), root_1);
				adaptor.addChild(root_1, stream_wildcardFieldName.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "descendantReference"


	public static class rootReference_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "rootReference"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:195:1: rootReference : CHILD_SEPARATOR -> ^( CHILD_REFERENCE ) ;
	public final RecordPathParser.rootReference_return rootReference() throws RecognitionException {
		RecordPathParser.rootReference_return retval = new RecordPathParser.rootReference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CHILD_SEPARATOR71=null;

		Object CHILD_SEPARATOR71_tree=null;
		RewriteRuleTokenStream stream_CHILD_SEPARATOR=new RewriteRuleTokenStream(adaptor,"token CHILD_SEPARATOR");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:195:15: ( CHILD_SEPARATOR -> ^( CHILD_REFERENCE ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:195:17: CHILD_SEPARATOR
			{
			CHILD_SEPARATOR71=(Token)match(input,CHILD_SEPARATOR,FOLLOW_CHILD_SEPARATOR_in_rootReference730);  
			stream_CHILD_SEPARATOR.add(CHILD_SEPARATOR71);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 195:33: -> ^( CHILD_REFERENCE )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:196:2: ^( CHILD_REFERENCE )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CHILD_REFERENCE, "CHILD_REFERENCE"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rootReference"


	public static class selfReference_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "selfReference"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:198:1: selfReference : CHILD_SEPARATOR ! CURRENT_FIELD ;
	public final RecordPathParser.selfReference_return selfReference() throws RecognitionException {
		RecordPathParser.selfReference_return retval = new RecordPathParser.selfReference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CHILD_SEPARATOR72=null;
		Token CURRENT_FIELD73=null;

		Object CHILD_SEPARATOR72_tree=null;
		Object CURRENT_FIELD73_tree=null;

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:198:15: ( CHILD_SEPARATOR ! CURRENT_FIELD )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:198:17: CHILD_SEPARATOR ! CURRENT_FIELD
			{
			root_0 = (Object)adaptor.nil();


			CHILD_SEPARATOR72=(Token)match(input,CHILD_SEPARATOR,FOLLOW_CHILD_SEPARATOR_in_selfReference745); 
			CURRENT_FIELD73=(Token)match(input,CURRENT_FIELD,FOLLOW_CURRENT_FIELD_in_selfReference748); 
			CURRENT_FIELD73_tree = (Object)adaptor.create(CURRENT_FIELD73);
			adaptor.addChild(root_0, CURRENT_FIELD73_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "selfReference"


	public static class parentReference_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parentReference"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:200:1: parentReference : CHILD_SEPARATOR RANGE -> ^( PARENT_REFERENCE ) ;
	public final RecordPathParser.parentReference_return parentReference() throws RecognitionException {
		RecordPathParser.parentReference_return retval = new RecordPathParser.parentReference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CHILD_SEPARATOR74=null;
		Token RANGE75=null;

		Object CHILD_SEPARATOR74_tree=null;
		Object RANGE75_tree=null;
		RewriteRuleTokenStream stream_CHILD_SEPARATOR=new RewriteRuleTokenStream(adaptor,"token CHILD_SEPARATOR");
		RewriteRuleTokenStream stream_RANGE=new RewriteRuleTokenStream(adaptor,"token RANGE");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:200:17: ( CHILD_SEPARATOR RANGE -> ^( PARENT_REFERENCE ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:200:19: CHILD_SEPARATOR RANGE
			{
			CHILD_SEPARATOR74=(Token)match(input,CHILD_SEPARATOR,FOLLOW_CHILD_SEPARATOR_in_parentReference756);  
			stream_CHILD_SEPARATOR.add(CHILD_SEPARATOR74);

			RANGE75=(Token)match(input,RANGE,FOLLOW_RANGE_in_parentReference758);  
			stream_RANGE.add(RANGE75);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 200:41: -> ^( PARENT_REFERENCE )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:201:2: ^( PARENT_REFERENCE )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARENT_REFERENCE, "PARENT_REFERENCE"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parentReference"


	public static class nonSelfFieldRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nonSelfFieldRef"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:203:1: nonSelfFieldRef : ( childReference | descendantReference | selfReference | parentReference );
	public final RecordPathParser.nonSelfFieldRef_return nonSelfFieldRef() throws RecognitionException {
		RecordPathParser.nonSelfFieldRef_return retval = new RecordPathParser.nonSelfFieldRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope childReference76 =null;
		ParserRuleReturnScope descendantReference77 =null;
		ParserRuleReturnScope selfReference78 =null;
		ParserRuleReturnScope parentReference79 =null;


		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:203:17: ( childReference | descendantReference | selfReference | parentReference )
			int alt15=4;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==CHILD_SEPARATOR) ) {
				switch ( input.LA(2) ) {
				case CURRENT_FIELD:
					{
					alt15=3;
					}
					break;
				case RANGE:
					{
					alt15=4;
					}
					break;
				case IDENTIFIER:
				case STRING_LITERAL:
				case WILDCARD:
					{
					alt15=1;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA15_0==DESCENDANT_SEPARATOR) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:203:19: childReference
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_childReference_in_nonSelfFieldRef773);
					childReference76=childReference();
					state._fsp--;

					adaptor.addChild(root_0, childReference76.getTree());

					}
					break;
				case 2 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:203:36: descendantReference
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_descendantReference_in_nonSelfFieldRef777);
					descendantReference77=descendantReference();
					state._fsp--;

					adaptor.addChild(root_0, descendantReference77.getTree());

					}
					break;
				case 3 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:203:58: selfReference
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_selfReference_in_nonSelfFieldRef781);
					selfReference78=selfReference();
					state._fsp--;

					adaptor.addChild(root_0, selfReference78.getTree());

					}
					break;
				case 4 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:203:74: parentReference
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_parentReference_in_nonSelfFieldRef785);
					parentReference79=parentReference();
					state._fsp--;

					adaptor.addChild(root_0, parentReference79.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nonSelfFieldRef"


	public static class fieldRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fieldRef"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:205:1: fieldRef : ( nonSelfFieldRef | CURRENT_FIELD );
	public final RecordPathParser.fieldRef_return fieldRef() throws RecognitionException {
		RecordPathParser.fieldRef_return retval = new RecordPathParser.fieldRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CURRENT_FIELD81=null;
		ParserRuleReturnScope nonSelfFieldRef80 =null;

		Object CURRENT_FIELD81_tree=null;

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:205:10: ( nonSelfFieldRef | CURRENT_FIELD )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==CHILD_SEPARATOR||LA16_0==DESCENDANT_SEPARATOR) ) {
				alt16=1;
			}
			else if ( (LA16_0==CURRENT_FIELD) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:205:12: nonSelfFieldRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nonSelfFieldRef_in_fieldRef793);
					nonSelfFieldRef80=nonSelfFieldRef();
					state._fsp--;

					adaptor.addChild(root_0, nonSelfFieldRef80.getTree());

					}
					break;
				case 2 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:205:30: CURRENT_FIELD
					{
					root_0 = (Object)adaptor.nil();


					CURRENT_FIELD81=(Token)match(input,CURRENT_FIELD,FOLLOW_CURRENT_FIELD_in_fieldRef797); 
					CURRENT_FIELD81_tree = (Object)adaptor.create(CURRENT_FIELD81);
					adaptor.addChild(root_0, CURRENT_FIELD81_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldRef"


	public static class subPath_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subPath"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:207:1: subPath : ( fieldRef | index | predicate );
	public final RecordPathParser.subPath_return subPath() throws RecognitionException {
		RecordPathParser.subPath_return retval = new RecordPathParser.subPath_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope fieldRef82 =null;
		ParserRuleReturnScope index83 =null;
		ParserRuleReturnScope predicate84 =null;


		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:207:9: ( fieldRef | index | predicate )
			int alt17=3;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==CHILD_SEPARATOR||(LA17_0 >= CURRENT_FIELD && LA17_0 <= DESCENDANT_SEPARATOR)) ) {
				alt17=1;
			}
			else if ( (LA17_0==LBRACKET) ) {
				switch ( input.LA(2) ) {
				case STRING_LITERAL:
					{
					int LA17_3 = input.LA(3);
					if ( (LA17_3==COMMA||LA17_3==RBRACKET) ) {
						alt17=2;
					}
					else if ( (LA17_3==EQUAL||(LA17_3 >= GREATER_THAN && LA17_3 <= GREATER_THAN_EQUAL)||(LA17_3 >= LESS_THAN && LA17_3 <= LESS_THAN_EQUAL)||LA17_3==NOT_EQUAL) ) {
						alt17=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case NUMBER:
					{
					int LA17_4 = input.LA(3);
					if ( (LA17_4==COMMA||(LA17_4 >= RANGE && LA17_4 <= RBRACKET)) ) {
						alt17=2;
					}
					else if ( (LA17_4==EQUAL||(LA17_4 >= GREATER_THAN && LA17_4 <= GREATER_THAN_EQUAL)||(LA17_4 >= LESS_THAN && LA17_4 <= LESS_THAN_EQUAL)||LA17_4==NOT_EQUAL) ) {
						alt17=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case WILDCARD:
					{
					alt17=2;
					}
					break;
				case CHILD_SEPARATOR:
				case CONTAINS:
				case CONTAINS_REGEX:
				case CURRENT_FIELD:
				case DESCENDANT_SEPARATOR:
				case ENDS_WITH:
				case IDENTIFIER:
				case IS_BLANK:
				case IS_EMPTY:
				case MATCHES_REGEX:
				case NOT:
				case RANGE:
				case STARTS_WITH:
					{
					alt17=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:207:11: fieldRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fieldRef_in_subPath805);
					fieldRef82=fieldRef();
					state._fsp--;

					adaptor.addChild(root_0, fieldRef82.getTree());

					}
					break;
				case 2 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:207:22: index
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_index_in_subPath809);
					index83=index();
					state._fsp--;

					adaptor.addChild(root_0, index83.getTree());

					}
					break;
				case 3 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:207:30: predicate
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_predicate_in_subPath813);
					predicate84=predicate();
					state._fsp--;

					adaptor.addChild(root_0, predicate84.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subPath"


	public static class pathSegment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pathSegment"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:215:1: pathSegment : fieldRef ( subPath )* -> ^( PATH fieldRef ( subPath )* ) ;
	public final RecordPathParser.pathSegment_return pathSegment() throws RecognitionException {
		RecordPathParser.pathSegment_return retval = new RecordPathParser.pathSegment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope fieldRef85 =null;
		ParserRuleReturnScope subPath86 =null;

		RewriteRuleSubtreeStream stream_fieldRef=new RewriteRuleSubtreeStream(adaptor,"rule fieldRef");
		RewriteRuleSubtreeStream stream_subPath=new RewriteRuleSubtreeStream(adaptor,"rule subPath");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:215:13: ( fieldRef ( subPath )* -> ^( PATH fieldRef ( subPath )* ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:215:15: fieldRef ( subPath )*
			{
			pushFollow(FOLLOW_fieldRef_in_pathSegment827);
			fieldRef85=fieldRef();
			state._fsp--;

			stream_fieldRef.add(fieldRef85.getTree());
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:215:24: ( subPath )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==CHILD_SEPARATOR||(LA18_0 >= CURRENT_FIELD && LA18_0 <= DESCENDANT_SEPARATOR)||LA18_0==LBRACKET) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:215:24: subPath
					{
					pushFollow(FOLLOW_subPath_in_pathSegment829);
					subPath86=subPath();
					state._fsp--;

					stream_subPath.add(subPath86.getTree());
					}
					break;

				default :
					break loop18;
				}
			}

			// AST REWRITE
			// elements: fieldRef, subPath
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 215:33: -> ^( PATH fieldRef ( subPath )* )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:216:2: ^( PATH fieldRef ( subPath )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATH, "PATH"), root_1);
				adaptor.addChild(root_1, stream_fieldRef.nextTree());
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:216:18: ( subPath )*
				while ( stream_subPath.hasNext() ) {
					adaptor.addChild(root_1, stream_subPath.nextTree());
				}
				stream_subPath.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pathSegment"


	public static class absolutePathSegment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "absolutePathSegment"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:218:1: absolutePathSegment : nonSelfFieldRef ( subPath )* -> ^( PATH nonSelfFieldRef ( subPath )* ) ;
	public final RecordPathParser.absolutePathSegment_return absolutePathSegment() throws RecognitionException {
		RecordPathParser.absolutePathSegment_return retval = new RecordPathParser.absolutePathSegment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope nonSelfFieldRef87 =null;
		ParserRuleReturnScope subPath88 =null;

		RewriteRuleSubtreeStream stream_subPath=new RewriteRuleSubtreeStream(adaptor,"rule subPath");
		RewriteRuleSubtreeStream stream_nonSelfFieldRef=new RewriteRuleSubtreeStream(adaptor,"rule nonSelfFieldRef");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:218:21: ( nonSelfFieldRef ( subPath )* -> ^( PATH nonSelfFieldRef ( subPath )* ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:218:23: nonSelfFieldRef ( subPath )*
			{
			pushFollow(FOLLOW_nonSelfFieldRef_in_absolutePathSegment850);
			nonSelfFieldRef87=nonSelfFieldRef();
			state._fsp--;

			stream_nonSelfFieldRef.add(nonSelfFieldRef87.getTree());
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:218:39: ( subPath )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==CHILD_SEPARATOR||(LA19_0 >= CURRENT_FIELD && LA19_0 <= DESCENDANT_SEPARATOR)||LA19_0==LBRACKET) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:218:39: subPath
					{
					pushFollow(FOLLOW_subPath_in_absolutePathSegment852);
					subPath88=subPath();
					state._fsp--;

					stream_subPath.add(subPath88.getTree());
					}
					break;

				default :
					break loop19;
				}
			}

			// AST REWRITE
			// elements: subPath, nonSelfFieldRef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 218:48: -> ^( PATH nonSelfFieldRef ( subPath )* )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:219:2: ^( PATH nonSelfFieldRef ( subPath )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATH, "PATH"), root_1);
				adaptor.addChild(root_1, stream_nonSelfFieldRef.nextTree());
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:219:25: ( subPath )*
				while ( stream_subPath.hasNext() ) {
					adaptor.addChild(root_1, stream_subPath.nextTree());
				}
				stream_subPath.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "absolutePathSegment"


	public static class absolutePath_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "absolutePath"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:221:1: absolutePath : ( rootReference | absolutePathSegment );
	public final RecordPathParser.absolutePath_return absolutePath() throws RecognitionException {
		RecordPathParser.absolutePath_return retval = new RecordPathParser.absolutePath_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope rootReference89 =null;
		ParserRuleReturnScope absolutePathSegment90 =null;


		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:221:14: ( rootReference | absolutePathSegment )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==CHILD_SEPARATOR) ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1==CURRENT_FIELD||LA20_1==IDENTIFIER||LA20_1==RANGE||LA20_1==STRING_LITERAL||LA20_1==WILDCARD) ) {
					alt20=2;
				}
				else if ( (LA20_1==EOF||LA20_1==COMMA||LA20_1==EQUAL||(LA20_1 >= GREATER_THAN && LA20_1 <= GREATER_THAN_EQUAL)||(LA20_1 >= LESS_THAN && LA20_1 <= LESS_THAN_EQUAL)||LA20_1==NOT_EQUAL||(LA20_1 >= RBRACKET && LA20_1 <= RPAREN)) ) {
					alt20=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA20_0==DESCENDANT_SEPARATOR) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:221:16: rootReference
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_rootReference_in_absolutePath873);
					rootReference89=rootReference();
					state._fsp--;

					adaptor.addChild(root_0, rootReference89.getTree());

					}
					break;
				case 2 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:221:32: absolutePathSegment
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_absolutePathSegment_in_absolutePath877);
					absolutePathSegment90=absolutePathSegment();
					state._fsp--;

					adaptor.addChild(root_0, absolutePathSegment90.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "absolutePath"


	public static class relativePathSegment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relativePathSegment"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:223:1: relativePathSegment : nonSelfFieldRef ( subPath )* -> ^( RELATIVE_PATH nonSelfFieldRef ( subPath )* ) ;
	public final RecordPathParser.relativePathSegment_return relativePathSegment() throws RecognitionException {
		RecordPathParser.relativePathSegment_return retval = new RecordPathParser.relativePathSegment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope nonSelfFieldRef91 =null;
		ParserRuleReturnScope subPath92 =null;

		RewriteRuleSubtreeStream stream_subPath=new RewriteRuleSubtreeStream(adaptor,"rule subPath");
		RewriteRuleSubtreeStream stream_nonSelfFieldRef=new RewriteRuleSubtreeStream(adaptor,"rule nonSelfFieldRef");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:223:21: ( nonSelfFieldRef ( subPath )* -> ^( RELATIVE_PATH nonSelfFieldRef ( subPath )* ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:223:23: nonSelfFieldRef ( subPath )*
			{
			pushFollow(FOLLOW_nonSelfFieldRef_in_relativePathSegment885);
			nonSelfFieldRef91=nonSelfFieldRef();
			state._fsp--;

			stream_nonSelfFieldRef.add(nonSelfFieldRef91.getTree());
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:223:39: ( subPath )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==CHILD_SEPARATOR||(LA21_0 >= CURRENT_FIELD && LA21_0 <= DESCENDANT_SEPARATOR)||LA21_0==LBRACKET) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:223:39: subPath
					{
					pushFollow(FOLLOW_subPath_in_relativePathSegment887);
					subPath92=subPath();
					state._fsp--;

					stream_subPath.add(subPath92.getTree());
					}
					break;

				default :
					break loop21;
				}
			}

			// AST REWRITE
			// elements: nonSelfFieldRef, subPath
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 223:48: -> ^( RELATIVE_PATH nonSelfFieldRef ( subPath )* )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:224:2: ^( RELATIVE_PATH nonSelfFieldRef ( subPath )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_PATH, "RELATIVE_PATH"), root_1);
				adaptor.addChild(root_1, stream_nonSelfFieldRef.nextTree());
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:224:34: ( subPath )*
				while ( stream_subPath.hasNext() ) {
					adaptor.addChild(root_1, stream_subPath.nextTree());
				}
				stream_subPath.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relativePathSegment"


	public static class initialParentReference_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "initialParentReference"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:226:1: initialParentReference : RANGE -> ^( PARENT_REFERENCE ) ;
	public final RecordPathParser.initialParentReference_return initialParentReference() throws RecognitionException {
		RecordPathParser.initialParentReference_return retval = new RecordPathParser.initialParentReference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RANGE93=null;

		Object RANGE93_tree=null;
		RewriteRuleTokenStream stream_RANGE=new RewriteRuleTokenStream(adaptor,"token RANGE");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:226:24: ( RANGE -> ^( PARENT_REFERENCE ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:226:26: RANGE
			{
			RANGE93=(Token)match(input,RANGE,FOLLOW_RANGE_in_initialParentReference908);  
			stream_RANGE.add(RANGE93);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 226:32: -> ^( PARENT_REFERENCE )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:227:2: ^( PARENT_REFERENCE )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARENT_REFERENCE, "PARENT_REFERENCE"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "initialParentReference"


	public static class currentOrParent_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "currentOrParent"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:229:1: currentOrParent : ( CURRENT_FIELD | initialParentReference );
	public final RecordPathParser.currentOrParent_return currentOrParent() throws RecognitionException {
		RecordPathParser.currentOrParent_return retval = new RecordPathParser.currentOrParent_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CURRENT_FIELD94=null;
		ParserRuleReturnScope initialParentReference95 =null;

		Object CURRENT_FIELD94_tree=null;

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:229:17: ( CURRENT_FIELD | initialParentReference )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==CURRENT_FIELD) ) {
				alt22=1;
			}
			else if ( (LA22_0==RANGE) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:229:19: CURRENT_FIELD
					{
					root_0 = (Object)adaptor.nil();


					CURRENT_FIELD94=(Token)match(input,CURRENT_FIELD,FOLLOW_CURRENT_FIELD_in_currentOrParent923); 
					CURRENT_FIELD94_tree = (Object)adaptor.create(CURRENT_FIELD94);
					adaptor.addChild(root_0, CURRENT_FIELD94_tree);

					}
					break;
				case 2 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:229:35: initialParentReference
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_initialParentReference_in_currentOrParent927);
					initialParentReference95=initialParentReference();
					state._fsp--;

					adaptor.addChild(root_0, initialParentReference95.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "currentOrParent"


	public static class relativePath_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relativePath"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:231:1: relativePath : currentOrParent ( relativePathSegment )? -> ^( RELATIVE_PATH currentOrParent ( relativePathSegment )? ) ;
	public final RecordPathParser.relativePath_return relativePath() throws RecognitionException {
		RecordPathParser.relativePath_return retval = new RecordPathParser.relativePath_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope currentOrParent96 =null;
		ParserRuleReturnScope relativePathSegment97 =null;

		RewriteRuleSubtreeStream stream_relativePathSegment=new RewriteRuleSubtreeStream(adaptor,"rule relativePathSegment");
		RewriteRuleSubtreeStream stream_currentOrParent=new RewriteRuleSubtreeStream(adaptor,"rule currentOrParent");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:231:14: ( currentOrParent ( relativePathSegment )? -> ^( RELATIVE_PATH currentOrParent ( relativePathSegment )? ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:231:16: currentOrParent ( relativePathSegment )?
			{
			pushFollow(FOLLOW_currentOrParent_in_relativePath935);
			currentOrParent96=currentOrParent();
			state._fsp--;

			stream_currentOrParent.add(currentOrParent96.getTree());
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:231:32: ( relativePathSegment )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==CHILD_SEPARATOR||LA23_0==DESCENDANT_SEPARATOR) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:231:32: relativePathSegment
					{
					pushFollow(FOLLOW_relativePathSegment_in_relativePath937);
					relativePathSegment97=relativePathSegment();
					state._fsp--;

					stream_relativePathSegment.add(relativePathSegment97.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: currentOrParent, relativePathSegment
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 231:53: -> ^( RELATIVE_PATH currentOrParent ( relativePathSegment )? )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:232:2: ^( RELATIVE_PATH currentOrParent ( relativePathSegment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIVE_PATH, "RELATIVE_PATH"), root_1);
				adaptor.addChild(root_1, stream_currentOrParent.nextTree());
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:232:34: ( relativePathSegment )?
				if ( stream_relativePathSegment.hasNext() ) {
					adaptor.addChild(root_1, stream_relativePathSegment.nextTree());
				}
				stream_relativePathSegment.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relativePath"


	public static class path_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "path"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:234:1: path : ( absolutePath | relativePath );
	public final RecordPathParser.path_return path() throws RecognitionException {
		RecordPathParser.path_return retval = new RecordPathParser.path_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope absolutePath98 =null;
		ParserRuleReturnScope relativePath99 =null;


		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:234:6: ( absolutePath | relativePath )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==CHILD_SEPARATOR||LA24_0==DESCENDANT_SEPARATOR) ) {
				alt24=1;
			}
			else if ( (LA24_0==CURRENT_FIELD||LA24_0==RANGE) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:234:8: absolutePath
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_absolutePath_in_path958);
					absolutePath98=absolutePath();
					state._fsp--;

					adaptor.addChild(root_0, absolutePath98.getTree());

					}
					break;
				case 2 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:234:23: relativePath
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_relativePath_in_path962);
					relativePath99=relativePath();
					state._fsp--;

					adaptor.addChild(root_0, relativePath99.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "path"


	public static class pathOrFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pathOrFunction"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:236:1: pathOrFunction : ( path | function );
	public final RecordPathParser.pathOrFunction_return pathOrFunction() throws RecognitionException {
		RecordPathParser.pathOrFunction_return retval = new RecordPathParser.pathOrFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope path100 =null;
		ParserRuleReturnScope function101 =null;


		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:236:16: ( path | function )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==CHILD_SEPARATOR||(LA25_0 >= CURRENT_FIELD && LA25_0 <= DESCENDANT_SEPARATOR)||LA25_0==RANGE) ) {
				alt25=1;
			}
			else if ( (LA25_0==IDENTIFIER) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:236:18: path
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_path_in_pathOrFunction970);
					path100=path();
					state._fsp--;

					adaptor.addChild(root_0, path100.getTree());

					}
					break;
				case 2 :
					// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:236:25: function
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_in_pathOrFunction974);
					function101=function();
					state._fsp--;

					adaptor.addChild(root_0, function101.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pathOrFunction"


	public static class pathExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pathExpression"
	// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:238:1: pathExpression : pathOrFunction EOF -> ^( PATH_EXPRESSION pathOrFunction ) ;
	public final RecordPathParser.pathExpression_return pathExpression() throws RecognitionException {
		RecordPathParser.pathExpression_return retval = new RecordPathParser.pathExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF103=null;
		ParserRuleReturnScope pathOrFunction102 =null;

		Object EOF103_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_pathOrFunction=new RewriteRuleSubtreeStream(adaptor,"rule pathOrFunction");

		try {
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:238:16: ( pathOrFunction EOF -> ^( PATH_EXPRESSION pathOrFunction ) )
			// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:238:18: pathOrFunction EOF
			{
			pushFollow(FOLLOW_pathOrFunction_in_pathExpression982);
			pathOrFunction102=pathOrFunction();
			state._fsp--;

			stream_pathOrFunction.add(pathOrFunction102.getTree());
			EOF103=(Token)match(input,EOF,FOLLOW_EOF_in_pathExpression984);  
			stream_EOF.add(EOF103);

			// AST REWRITE
			// elements: pathOrFunction
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 238:37: -> ^( PATH_EXPRESSION pathOrFunction )
			{
				// nifi-commons/nifi-record-path/src/main/antlr3/org/apache/nifi/record/path/RecordPathParser.g:239:2: ^( PATH_EXPRESSION pathOrFunction )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATH_EXPRESSION, "PATH_EXPRESSION"), root_1);
				adaptor.addChild(root_1, stream_pathOrFunction.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pathExpression"

	// Delegated rules



	public static final BitSet FOLLOW_STRING_LITERAL_in_multipleStringLiterals124 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_multipleStringLiterals127 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_multipleStringLiterals130 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_multipleStringLiterals_in_stringList140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringList_in_mapKey175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_range192 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RANGE_in_range194 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_NUMBER_in_range196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_numberOrRange215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_in_numberOrRange219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numberOrRange_in_multipleIndices227 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_multipleIndices230 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_numberOrRange_in_multipleIndices232 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_multipleIndices_in_arrayIndex254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mapKey_in_indexOrKey271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayIndex_in_indexOrKey275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WILDCARD_in_indexOrKey279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_index287 = new BitSet(new long[]{0x0000000502000000L});
	public static final BitSet FOLLOW_indexOrKey_in_index290 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RBRACKET_in_index292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_in_expression347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_expression351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_expression355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_operation363 = new BitSet(new long[]{0x0000000001186800L});
	public static final BitSet FOLLOW_operator_in_operation365 = new BitSet(new long[]{0x000000010A008310L});
	public static final BitSet FOLLOW_expression_in_operation368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_filterFunction_in_filter376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operation_in_filter380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_predicate388 = new BitSet(new long[]{0x000000018AC387D0L});
	public static final BitSet FOLLOW_filter_in_predicate390 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RBRACKET_in_predicate392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_argument414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argument_in_optionalArgument422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_optionalArgument_in_argumentList431 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_argumentList434 = new BitSet(new long[]{0x000000010A008310L});
	public static final BitSet FOLLOW_argument_in_argumentList436 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function458 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LPAREN_in_function460 = new BitSet(new long[]{0x000000010A008330L});
	public static final BitSet FOLLOW_argumentList_in_function462 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_function464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_filterArgument516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_filterFunction_in_filterArgument520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_filterArgument_in_optionalFilterArgument528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_optionalFilterArgument_in_filterArgumentList537 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_filterArgumentList540 = new BitSet(new long[]{0x000000018AC387D0L});
	public static final BitSet FOLLOW_filterArgument_in_filterArgumentList542 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_filterFunctionNames_in_simpleFilterFunction564 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LPAREN_in_simpleFilterFunction566 = new BitSet(new long[]{0x000000018AC387F0L});
	public static final BitSet FOLLOW_filterArgumentList_in_simpleFilterFunction568 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_simpleFilterFunction570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleFilterFunction_in_simpleFilterFunctionOrOperation589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operation_in_simpleFilterFunctionOrOperation593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleFilterFunctionOrOperation_in_notFunctionArgList601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_notFilterFunction618 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_LPAREN_in_notFilterFunction620 = new BitSet(new long[]{0x000000018A4387D0L});
	public static final BitSet FOLLOW_notFunctionArgList_in_notFilterFunction622 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_notFilterFunction624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleFilterFunction_in_filterFunction644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_notFilterFunction_in_filterFunction648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rawOrLiteral_in_fieldName663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldName_in_wildcardFieldName680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WILDCARD_in_wildcardFieldName684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHILD_SEPARATOR_in_childReference692 = new BitSet(new long[]{0x0000000500008000L});
	public static final BitSet FOLLOW_wildcardFieldName_in_childReference694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DESCENDANT_SEPARATOR_in_descendantReference711 = new BitSet(new long[]{0x0000000500008000L});
	public static final BitSet FOLLOW_wildcardFieldName_in_descendantReference713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHILD_SEPARATOR_in_rootReference730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHILD_SEPARATOR_in_selfReference745 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CURRENT_FIELD_in_selfReference748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHILD_SEPARATOR_in_parentReference756 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RANGE_in_parentReference758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_childReference_in_nonSelfFieldRef773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_descendantReference_in_nonSelfFieldRef777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selfReference_in_nonSelfFieldRef781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parentReference_in_nonSelfFieldRef785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonSelfFieldRef_in_fieldRef793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CURRENT_FIELD_in_fieldRef797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRef_in_subPath805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_in_subPath809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_subPath813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldRef_in_pathSegment827 = new BitSet(new long[]{0x0000000000040312L});
	public static final BitSet FOLLOW_subPath_in_pathSegment829 = new BitSet(new long[]{0x0000000000040312L});
	public static final BitSet FOLLOW_nonSelfFieldRef_in_absolutePathSegment850 = new BitSet(new long[]{0x0000000000040312L});
	public static final BitSet FOLLOW_subPath_in_absolutePathSegment852 = new BitSet(new long[]{0x0000000000040312L});
	public static final BitSet FOLLOW_rootReference_in_absolutePath873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_absolutePathSegment_in_absolutePath877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonSelfFieldRef_in_relativePathSegment885 = new BitSet(new long[]{0x0000000000040312L});
	public static final BitSet FOLLOW_subPath_in_relativePathSegment887 = new BitSet(new long[]{0x0000000000040312L});
	public static final BitSet FOLLOW_RANGE_in_initialParentReference908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CURRENT_FIELD_in_currentOrParent923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_initialParentReference_in_currentOrParent927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_currentOrParent_in_relativePath935 = new BitSet(new long[]{0x0000000000000212L});
	public static final BitSet FOLLOW_relativePathSegment_in_relativePath937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_absolutePath_in_path958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relativePath_in_path962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_path_in_pathOrFunction970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_pathOrFunction974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pathOrFunction_in_pathExpression982 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_pathExpression984 = new BitSet(new long[]{0x0000000000000002L});
}
