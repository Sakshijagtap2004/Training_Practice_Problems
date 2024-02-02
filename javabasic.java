import java.util.*;
class Java{
  public static void main(String args[]){
  System.out.println("enter any number");
  Scanner sc = new Scanner(System.in);
  int input = sc.nextInt();
  int num = input % 10;
  int num1 = input/10;
  int res = num+num1;
  System.out.println(res);

  }
}