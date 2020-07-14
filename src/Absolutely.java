// Which argument(s), when passed to this program,
// produce the output: true?
public final class Absolutely {
  private Absolutely() throws UnsupportedOperationException {
    throw new UnsupportedOperationException();
  }

  public static void main(final String[] args) {
    absolutely(Integer.parseInt(args[0]));
  }

  static void absolutely(int n) {
    System.out.println(Math.abs(n) == n && n < 0);
  }
}
