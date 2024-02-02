import java.util.*;
class Java{
  public static void main(String args[]){
    System.out.println("enter two numbers");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.println("enter choice 1.Additiion 2. Subtraction 3.Multiplication 4. division 5. exit");
    int n = sc.nextInt();
    int res = 0;
    switch(n) {
      case 1: res = num1 + num2;
              System.out.println(res) ;
              break;
      case 2: res = num1 - num2;
              System.out.println(res) ;
              break;
      case 3: res = num1 * num2;
              System.out.println(res) ;
              break;
      case 4: res = num1 / num2;
              System.out.println(res) ;
              break;
      case 5: System.exit(0);
    }
  }
} 
