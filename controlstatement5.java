import java.util.*;
class Java{
  public static void main(String args[]){
    System.out.println("enter day (mon,tue,wed,thu,fri,sat,sun) ");
    Scanner sc = new Scanner(System.in);
    String day = sc.next();
    if (day.equals("sun") || day.equals("sat")){
      System.out.println("its a weekend");
    }
    else {
      System.out.println("its a working day");
    }
  }}