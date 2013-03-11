// Nullify
// =======

// What is the output of this program?
public final class Nullify {
  private static String s;

  private Nullify() {

  }

  public static void main(String[] args) {
    Nullify n = null;
    n.s = "null!";
    System.out.println(n.s);
  }
}