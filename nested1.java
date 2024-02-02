import java.util.*;
class Java{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int year = sc.nextInt();
  if (year%100!=0){
    if (year%4 == 0){
        System.out.println("it is a leap year");
    }else{
      System.out.println("not a leap year");
    
    }
  }
  else {
    if (year%400==0){
      System.out.println("it is century leap year");

    }
    else {
      System.out.println("it is not a leap year");
    }
  }
  }}