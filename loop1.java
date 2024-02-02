import java.util.*;
class Java {
  public static void main(String args[]){
    System.out.println("enter a number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int i = 0;

    while (num>0){
      num = num/10;
      i++ ;
    }
    System.out.println(i);
    
  }
}