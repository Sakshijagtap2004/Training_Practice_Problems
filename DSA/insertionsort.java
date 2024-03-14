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
    
    
   
 
int temp;

System.out.println("final arr");
for (int i=0;i<n-1;i++){
  for (int j=i+1; j<n;j++){
    temp = arr[i];
    if(arr[i]>arr[j]){
      
      arr[i]= arr[j];
      arr[j]=temp;
    }
  }
}

    for(int i=0;i<n;i++ ){
    System.out.println(arr[i]);

    }
  }}