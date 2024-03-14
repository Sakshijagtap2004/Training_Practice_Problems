import java.util.*;
class HashSet1 {
  public static void main(String [] args){
    HashSet<String> h = new HashSet<String>();
    h.add("A");
    h.add("B");
    h.add("C");
    h.add("D");
    h.add("D");
    Iterator<String> itr = h.iterator();
    while (itr.hasNext())
    {
      String str = itr.next();
      System.out.println(str);
    }
    System.out.println(h);
  }
}