import java.util.*;
class Java {
  public static void main(String args[]){
    System.out.println("enter a number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    double sum = 1;
    for (int i = 1; i<=num; i++ ){
      sum = sum + (Math.pow(num,i)/i);
    }
    System.out.print(sum);
  }}