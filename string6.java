import java.util.*;
class Java{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first string");
    String s11 = sc.next();
     System.out.println("enter second string");
    String s22 = sc.next();
    String s1 = s11.toLowerCase();
    String s2 = s22.toLowerCase();
    byte b1[] = s1.getBytes();
    byte b2[] = s2.getBytes();
    int total1=0;
    int total2=0;

    for (int i=0;i<b1.length;i++){
      total1 = total1+b1[i];
    } 
    for (int i=0;i<b2.length;i++){
      total2 = total2+b2[i];
    } 
    if (total1==total2){
       System.out.println("yes");
      
    }
    else{
       System.out.println("no");
    }
  }
}