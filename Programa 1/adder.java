/* adder.java */
/* Generated By:JavaCC: Do not edit this line. adder.java */
class adder implements adderConstants {
                        public static void main(String[]args)
                        throws ParseException, TokenMgrError{
                        adder parser=new adder(System.in);
                        parser.Start();
                                }

//Fin de estados léxicos

//Inicio de procedimientos para definir patrones
  final public void Start() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MAIN:{
      Block();
      break;
      }
    case NUMTYPES:
    case FLOATTYPE:
    case BOOLTYPE:{
      NumberTypes();
      break;
      }
    case LPAR:
    case RPAR:
    case LBRACE:
    case RBRACE:
    case SEMICOLON:{
      Symbols();
      break;
      }
    case FOR:
    case DO:
    case WHILE:{
      Loops();
      break;
      }
    case EQUALS:
    case SUM:
    case MINUS:
    case MULT:
    case DIVIDE:{
      AritmOp();
      break;
      }
    case AND:
    case OR:
    case SAMEAS:
    case GREATER:
    case LESSER:
    case GREATSAME:
    case LESSAME:
    case DIFFERENT:{
      RelatOp();
      break;
      }
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Block() throws ParseException {
    Main();
}

  final public void Main() throws ParseException {
    jj_consume_token(MAIN);
    jj_consume_token(LBRACE);
    Sentence();
    jj_consume_token(RBRACE);
}

  final public void Sentence() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NUMTYPES:{
      jj_consume_token(NUMTYPES);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(SEMICOLON);
      break;
      }
    case FLOATTYPE:{
      jj_consume_token(FLOATTYPE);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(SEMICOLON);
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void NumberTypes() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NUMTYPES:{
      jj_consume_token(NUMTYPES);
      break;
      }
    case FLOATTYPE:{
      jj_consume_token(FLOATTYPE);
      break;
      }
    case BOOLTYPE:{
      jj_consume_token(BOOLTYPE);
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Symbols() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LPAR:{
      jj_consume_token(LPAR);
      break;
      }
    case RPAR:{
      jj_consume_token(RPAR);
      break;
      }
    case LBRACE:{
      jj_consume_token(LBRACE);
      break;
      }
    case RBRACE:{
      jj_consume_token(RBRACE);
      break;
      }
    case SEMICOLON:{
      jj_consume_token(SEMICOLON);
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Loops() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case FOR:{
      jj_consume_token(FOR);
      break;
      }
    case DO:{
      jj_consume_token(DO);
      break;
      }
    case WHILE:{
      jj_consume_token(WHILE);
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void AritmOp() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case EQUALS:{
      jj_consume_token(EQUALS);
      break;
      }
    case SUM:{
      jj_consume_token(SUM);
      break;
      }
    case MINUS:{
      jj_consume_token(MINUS);
      break;
      }
    case MULT:{
      jj_consume_token(MULT);
      break;
      }
    case DIVIDE:{
      jj_consume_token(DIVIDE);
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void RelatOp() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AND:{
      jj_consume_token(AND);
      break;
      }
    case OR:{
      jj_consume_token(OR);
      break;
      }
    case SAMEAS:{
      jj_consume_token(SAMEAS);
      break;
      }
    case GREATER:{
      jj_consume_token(GREATER);
      break;
      }
    case LESSER:{
      jj_consume_token(LESSER);
      break;
      }
    case GREATSAME:{
      jj_consume_token(GREATSAME);
      break;
      }
    case LESSAME:{
      jj_consume_token(LESSAME);
      break;
      }
    case DIFFERENT:{
      jj_consume_token(DIFFERENT);
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  /** Generated Token Manager. */
  public adderTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[7];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0xffffee00,0x600,0xe00,0x7c000,0x380000,0x7c00000,0xf8000000,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x7,0x0,0x0,0x0,0x0,0x0,0x7,};
	}

  /** Constructor with InputStream. */
  public adder(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public adder(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new adderTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public adder(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new adderTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new adderTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public adder(adderTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(adderTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[35];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 7; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 35; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

                }
