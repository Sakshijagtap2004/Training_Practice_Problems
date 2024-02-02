import java.util.*;
class Java {
  public static void main(String args[]){
    System.out.println("enter a number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    double sum = 0;
    double nsave = num;
    int n1 = num;
    while (n1>0){
      n1 = n1/10;
      sum ++;
    }
    while (num>0){
      int rem = num % 10;
      sum = sum + Math.pow(rem , sum);
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