import java.util.*;
class Test{
  public static void main(String args [])
  {
    int marks[] = (72,55,37,49);
    int marks1[] = (1,2,3);
    Arrays.sort(marks);
    System.out.println(Array.toString(marks));
    System.out.println(Array.equals(marks,marks1));
  }
}