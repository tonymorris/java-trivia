// String References
// =================

// What is the output of this program?
// a) s1 == s2: true
// b) s1 == s2: false
// c) compile-error
// d) runtime exception
// e) something else _____
public final class StringReference {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";
    System.out.println("s1 == s2: " + s1 == s2);
  }
}