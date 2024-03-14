import java.util.*;
class MyJava{
  public static void main (String args[]){

    int arr [] = new int [100];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of arr");
    int n = sc.nextInt();
    System.out.println("enter the element of arr");
    for (int i =0; i<n; i++){
      arr[i] = sc.nextInt();

    }
    System.out.println("enter the element location of arr to be delete");
    int location = sc.nextInt();
    
    for (int i=location; i<n-1;i++){
      arr[i]=arr[i+1];
      
    }
    System.out.println("final arr");
    for(int i=0;i<n-1;i++ ){
    System.out.println(arr[i]);

    }
  }
}