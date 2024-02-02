import java.util.*;
class Java {
  public static void main(String args[]){
    System.out.println("enter a number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    double sum = 1;
    int fact = 1;
    for (int i = 1; i<=num; i++ ){
      
      for (int j=1;j<=i; j++){
        fact= fact*j;
}   
      sum = sum + (Math.pow(num,i)/fact); }
    System.out.print(sum);
      }}