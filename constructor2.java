import java.util.*;
class Area{
  int m, n;
  public Area(int a , int b){
     m = a;
     n = b;
  }
  public void returnArea(){
    System.out.println("a is:"+m);
        System.out.println("b is:"+n);
            System.out.println("area is:"+m*n);



  }
}

class Java {
  public static void main(String[] args) {
    while (true){
    Scanner sc = new Scanner(System.in);
      System.out.println("eneter the length");
      int k = sc.nextInt();
      System.out.println("eneter the breadth");
      int l = sc.nextInt();
      Area rc = new Area(k,l);
 
    rc.returnArea();
  }}}