import java.util.*;
class Java {
  public static void main(String args[]){
    System.out.println("enter a number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 1;
    
    while (num>0){
      int i = num%10;
      num = num/10;
      sum = sum*i;
    }
    System.out.println(sum);
  }}
