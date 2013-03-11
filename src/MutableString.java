// Strings are Immutable, Right?
// =============================

// Looking only at the main method below, can you guarantee the output of the program?
import java.lang.reflect.Field;

public final class MutableString {
  private MutableString() {
    throw new UnsupportedOperationException();
  }

  public static void main(String[] args) {
    String s = "hello";
    System.out.println(s);
    method(s);
    System.out.println(s);
  }

  private static void method(String s) {
    try {
      Field f = String.class.getDeclaredField("value");
      mute(f, s);
      return;
    } catch (NoSuchFieldException ex) {
      Field[] all = String.class.getDeclaredFields();
      for (Field a : all) {
        if (a.getType().equals(char[].class)) {
          mute(a, s);
          return;
        }
      }
    }

    // can't do it
  }

  private static void mute(Field f, String s) {
    f.setAccessible(true);
    StringBuffer sb = new StringBuffer(s);
    sb.reverse();
    try {
      f.set(s, sb.toString().toCharArray());
    } catch (IllegalAccessException iae) {
      System.err.println(iae);
    }
  }
}
