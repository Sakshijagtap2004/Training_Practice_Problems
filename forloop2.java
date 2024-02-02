import java.util.*;
class Java {
  public static void main(String args[]){
    System.out.println("enter a number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0; 
    for (int i = 1; i<=num ; i++){ // have to add = because to consider 20 AS WELL
      if (i%2==0){
        sum = sum+ i;
      }
    }
    System.out.println(sum);
    }}