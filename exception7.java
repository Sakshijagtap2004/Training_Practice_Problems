import java.util.*;
class InvalidUsernamePasswordException extends Exception {
  public InvalidUsernamePasswordException(){
    System.out.println("invalid username and password");
  }
}
class Userdefine{
  static void status(String username , int password ) throws InvalidUsernamePasswordException{
    if (username.equals("Sakshi") && password==(12345)){
      System.out.println("Successful");
    }
    else{
     throw new InvalidUsernamePasswordException();
    }
  }
  public static void main(String [] args) throws InvalidUsernamePasswordException {
    
    Scanner sc = new Scanner(System.in);
     System.out.println("enter Username");
     String username = sc.next();
    System.out.println("enter password ");
    int password = sc.nextInt();
    Userdefine.status(username,password);
  }
  }
