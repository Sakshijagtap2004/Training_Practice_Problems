import java.util.*;
class Java{
  public static void main(String args[]){
  System.out.println("enter 3 paper marks ");
  //System.out.println("enter gender for male (m) and female (f) ");
  Scanner sc = new Scanner(System.in);
  int p1 = sc.nextInt();
  int p2 = sc.nextInt();
  int p3 = sc.nextInt();
  int p4 = sc.nextInt();
  //char gender = sc.next().charAt(0);
  int total = p1+p2+p3+p4;
  int pre = (total /4);
  if (pre >= 90){
    System.out.println("Grade A");
  }
  else if(pre >= 80 && pre< 90){
    System.out.println("Grade B");
  }
  else if(pre >= 70 && pre< 80 ){
    System.out.println("Grade c");
  }
  else if(pre >= 60 && pre< 70){
    System.out.println("Grade D");
  }
  else if(pre >= 40 && pre< 60){
    System.out.println("Grade E");
  }
  else {
    System.out.println("Fail");
  }
  }}