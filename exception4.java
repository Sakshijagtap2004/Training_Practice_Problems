//creating user define exception and check eligible or not passing parameter
import java.util.*;
class InvalidAgeEligible extends Exception {
  public InvalidAgeEligible(String str){
    System.out.println(str);
  }
}
class Userdefine{
  static void status(int age) throws InvalidAgeEligible{
    if (age>18){
      System.out.println("eligible for marriage");
    }
    else{
     throw new InvalidAgeEligible("not eligible for marriage");
    }
  }
  public static void main(String [] args) throws InvalidAgeEligible{
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter age");
    int age = sc.nextInt();
    Userdefine.status(age);
  }
  }
