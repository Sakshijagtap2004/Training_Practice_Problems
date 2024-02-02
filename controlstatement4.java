import java.util.*;
class Java{
  public static void main(String args[]){
  System.out.println("enter 3 paper marks ");
  System.out.println("enter gender for male (m) and female (f) ");
  Scanner sc = new Scanner(System.in);
  int p1 = sc.nextInt();
  int p2 = sc.nextInt();
  int p3 = sc.nextInt();
  char gender = sc.next().charAt(0);
  int total = p1+p2+p3;
  int pre = (total /300)*100;
  if(pre<= 82 && gender == 'f' ){
    System.out.println("can take Admission");
    }
  //else { 
    //System.out.println("not eligible");
  //}
  else if(pre<= 62 && gender == 'm' ){
    System.out.println("can take Admission");
    }
  else { 
    System.out.println("not eligible");
  }
  } 
  
  }