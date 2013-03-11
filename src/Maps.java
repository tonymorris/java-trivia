// Maps and Equality
// =================

// What is the output of this program?
import java.util.Map;
import java.util.IdentityHashMap;

public final class Maps {
  private Maps() {

  }

  public static void main(String... args) {
    Map<Integer, Integer> m = new IdentityHashMap<Integer, Integer>();
    m.put(7, 8);
    m.put(777, 888);
    System.out.println(m.containsKey(7));
    System.out.println(m.containsKey(new Integer(7)));
    System.out.println(m.containsKey(777));
    System.out.println(m.containsKey(new Integer(777)));
  }
}