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
  int min=arr[i];
  int loc = i;
  for (int j=i+1; j<n;j++){
    if (min>arr[j]){
      min = arr[j];
      loc = j;
    }
  }
   if (loc != i){
    temp = arr[i];
    arr[i] = arr[loc];
    arr[loc] = temp;
   }
    
  }
  for(int p=0;p<n;p++ ){
    System.out.println(arr[p]);

    }}}
