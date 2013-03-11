// Are Private Constructors Overridden?
// ====================================

// What is the output of this program? (1)
// a) m
// b) main
// c) compile-error
// d) runtime exception
// e) something else ______
//
// Now change the access modifier on the printS method to anything but private.
// What is the output of the program now? (2)
// a) m
// b) main
// c) compile-error
// d) runtime exception
// e) something else ______
class PrivateCtorOverride {
  private final String s;

  private void printS() {
    System.out.println(s);
  }

  PrivateCtorOverride(String s) {
    this.s = s;
  }

  public static void main(String[] args) {
    new PrivateCtorOverride("main").m();
  }

  private void m() {
    new PrivateCtorOverride("m") {
      void method() {
        printS();
      }
    }.method();
  }
}
