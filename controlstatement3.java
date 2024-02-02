import java.util.*;
class Java{
  public static void main(String args[]){
  System.out.println("enter 3 paper marks ");
  Scanner sc = new Scanner(System.in);
  int p1 = sc.nextInt();
  int p2 = sc.nextInt();
  int p3 = sc.nextInt();
  //int total = p1+p2+p3
  if(p1<45 || p2 < 45 || p3 < 45){
    System.out.println("fail");
    }
  else { 
    System.out.println("Pass");
  }
  } 
  
  }
  