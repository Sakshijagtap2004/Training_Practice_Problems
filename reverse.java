import java.util.*;
class Java {
  public static void main(String args[]){
    System.out.println("enter a number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int res = 0;
    int nsave = num;
    while (num>0){
      int rem = num % 10;
      res = res * 10 + rem;
      num = num/10;
    }
    if (res==nsave){
      System.out.println("it is a palindrome");
    }
    else {
      System.out.println("its not");
    }
  }}