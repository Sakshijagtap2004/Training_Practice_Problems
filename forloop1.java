import java.util.*;
class Java {
  public static void main(String args[]){
    System.out.println("enter a number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int f0 = 0, f1=1 , f2;
    System.out.print(f0+" "+f1);
    for (int i=3 ; i<=num ; i++){
      f2 = f0+f1;
      System.out.print(" "+f2);
      f0 = f1;
      f1= f2;
    }}}