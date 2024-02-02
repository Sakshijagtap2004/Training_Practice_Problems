import java.util.*;
class Java{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  char ch = sc.next().charAt(0);
  if(ch >= 65 && ch <=90 ){
    System.out.println("upper case");
  }
  else if (ch>=97 && ch <= 122){
    System.out.println("lower case");
  }
  else if(ch>=48 && ch<=57){
    System.out.println("digit");
  }
  else {
    System.out.println("special character");
  }
  }
}