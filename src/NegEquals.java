// Negation is Equivalent
// ======================

// What argument(s) when passed to this program produces the output: true?
public final class NegEquals {
  private NegEquals() {

  }

  public static void printNegXEqualsX(int x) {
    System.out.println(-x == x);
  }

  public static void main(String[] args) {
    printNegXEqualsX(Integer.parseInt(args[0]));
  }
}
