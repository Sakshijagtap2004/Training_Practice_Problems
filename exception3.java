//creating user define exception and check eligible or not
import java.util.*;
class InvalidAgeEligible extends Exception {
  public InvalidAgeEligible(){
    System.out.println("not eligible for marriage");
  }
}
class Userdefine{
  static void status(int age) throws InvalidAgeEligible{
    if (age>18){
      System.out.println("eligible for marriage");
    }
    else{
     throw new InvalidAgeEligible();
    }
  }
  public static void main(String [] args) throws InvalidAgeEligible{
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter age");
    int age = sc.nextInt();
    Userdefine.status(age);
  }
  }
