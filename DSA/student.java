import java.util.*;
class MyJava{
  public static void main (String args[]){

    int arr [] = new int [100];
    int result[]={70,60,90,88,155,96,76,72,81};
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of arr");
    int n = sc.nextInt();
    System.out.println("enter  10 students percentage");
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
  }
  int topper = arr[n-1];
  Arrays.sort(result);
        int lb = 0;
        int ub = n-1;
        int mid = (ub+lb)/2;
        while(topper != result[mid] && lb<ub){
            if(topper > result[mid]){
                lb = mid+1;
            }
            else{
                ub = mid-1;
            }
            mid=(ub+lb)/2;
        }
        if(topper == result[mid]){
            System.out.println(" found ");
        }
        else{
            System.out.println(" not found.");
        }
    }
}
    
