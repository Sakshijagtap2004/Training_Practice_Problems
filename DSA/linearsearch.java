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
    System.out.println("enter the element key of ");
    int key = sc.nextInt();
    boolean flag = false;
    int loc=0;
    for (int i=0; i<n;i++){
      if(key == arr[i]){
          loc = i;
          flag = true;
          
      }
    }
    if (flag==true){
      System.out.println("element found at index :" + loc);
      System.exit(0);

    }
    else{
       System.out.println("element found not found");
       System.exit(0);

    }
      
  }}
    