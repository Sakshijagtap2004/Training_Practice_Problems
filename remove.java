import java.util.*;
class Java{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first string");
    String s11 = sc.nextLine();
     System.out.println("enter character to be removed");
    String s12 = sc.next();
    String s1 = s11.toLowerCase();
    String s2 = s12.toLowerCase();
    //char s2 = s22.charAt(0);
    byte b1[] = s1.getBytes();
    byte b[] = s2.getBytes();
    int total1=0;
    int total2=0;
    int l= s1.length();
    String a = new String ("");
    for (int i=0;i<l;i++){
      if(b[0]!=b1[i]){
        a= a + s1.charAt(i);
         // System.out.print(a);
      }
      
    }
    System.out.print(a);
}
}