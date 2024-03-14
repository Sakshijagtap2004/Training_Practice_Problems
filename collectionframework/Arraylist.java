import java.util.*;
class ArrayListDemo{
  public static void main(String [] args){
    ArrayList al = new ArrayList();
    al.add("R");
    al.add(120);
    al.add("R");
    al.add(null);
    System.out.println(al);
    al.remove(2);
    System.out.println(al);
    al.add(2,"M");
    al.add("N");
    System.out.println(al);
    al.removeAll(al);
    System.out.println(al);
    al.add(3,"c");
    System.out.println(al);
  }
}