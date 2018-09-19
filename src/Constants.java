import static java.lang.System.out;

// Constants
// =========

// What does this program output?
// You will need to understand Java constants to answer this question.
class S {
  static final int I = 7;

  static {
    out.println("S");
  }
}

class T {
  static final Object S = null;

  static {
    out.println("T");
  }
}

class U {
  static final Object S = "s";

  static {
    out.println("U");
  }
}

class V {
  static final String S = "s";

  static {
    out.println("V");
  }
}

class W {
  static final String S = new String("s");

  static {
    out.println("W");
  }
}

class X {
  static final int I = 7;

  static {
    out.println("X");
  }
}

class Y {
  static final int I;

  static {
    I = 8;
    out.println("Y");
  }
}

class Z {
  static final Integer I = new Integer(7);

  static {
    out.println("Z");
  }
}

class Constants {
  public static void main(String[] args) {
    int s = new S().I;
    Object t = T.S;
    Object u = U.S;
    String v = V.S;
    String w = W.S;
    int x = X.I;
    int y = Y.I;
    Integer z = Z.I;
  }
}