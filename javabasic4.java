import java.util.*;
class Java{
  public static void main(String args[]){
  System.out.println("enter any number");
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int num1 = a % 10;
   a = a/10;
  int num2 = a % 10;
  a = a/10 ;
  int num3 = a % 10;
  int num4 = a/10;  
  int res = num1*1000+num2*100+num3*10+num4*1;
  System.out.println(res);

  }
}