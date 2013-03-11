// Calling Overridable Methods From Constructors
// =============================================

// What is the output of this program?
// a) x = 2
// b) x = 3
// c) compile-error
// d) runtime exception
// e) something else _____
abstract class Eggs {
  abstract void m();

  Eggs() {
    m();
  }
}

class Toast extends Eggs {
  private int x = 2;

  Toast() {
    x = 3;
  }

  public void m() {
    System.out.println("x = " + x);
  }

  public static void main(String[] args) {
    new Toast();
  }
}