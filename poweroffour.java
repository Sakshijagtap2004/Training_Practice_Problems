import java.util.*;
class Test{
  public static void main(String args[]){
    System.out.println("enter the n");
    Scanner sc = new Scanner(System.in);
    double n = sc.nextInt();
    int c=0;
    for (double i=0;i<=n;i++){
      double power = Math.pow(4,i);
      if (power == n ){
         c=1;
         break;
      }
    
      
    }
    if (c==1){
       System.out.println("true");
    }
    else{
       System.out.println("false");
    }
   
  }
}