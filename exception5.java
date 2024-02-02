//creating user define exception and check eligible or not pass the message in arthemetic
import java.util.*;

class Userdefine{
  static void status(int age) throws ArithmeticException{
    if (age>18){
      System.out.println("eligible for marriage");
    }
    else{
     throw new ArithmeticException("not eligible for marriage");
    }
  }
  public static void main(String [] args) throws ArithmeticException{
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter age");
    int age = sc.nextInt();
    Userdefine.status(age);
  }
  }
