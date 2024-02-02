import java.util.*;
class Java {
  public static void main(String args[]){
    System.out.println("enter a number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int fact=1;
    for (int i=1 ; i<= num ; i++){
      fact = fact * i;
    }
    System.out.println(fact);
  }}