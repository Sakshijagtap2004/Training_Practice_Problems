import java.util.*;
class Java {
  public static void main(String args[]){
    System.out.println("enter a number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;
    int nsave = num;
    while (num>0){
      int rem = num % 10;
      sum = sum + (rem*rem*rem);
      num = num/10;
    }
    System.out.println(sum);
    if (sum==nsave){
      System.out.println("it is a armstrong");
    }
    else {
      System.out.println("its not");
    }
  }}