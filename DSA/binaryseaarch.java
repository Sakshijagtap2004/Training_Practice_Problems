/*import java.util.*;
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
    Arrays.sort(arr);
    
    System.out.println("enter the element key of ");
    int key = sc.nextInt();
    
    int beg=0; int end = n-1;
    int mid = (beg + end)/2;
    while(key != arr[mid] && beg<end){

      if(key<arr[mid]){
        end = mid-1;

      }
      else{
        end = mid +1;

      }
      mid = (beg + end)/2;
    }
    if(key==arr[mid]){
       System.out.println("element found at index :" + mid);
    }
    else{
       System.out.println("element not found ");
    }
    }
}*/

import java.util.*;
class MyJava{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = s.nextInt();
        int sub[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;++i){
            sub[i]=s.nextInt();
        }
        System.out.println("Enter the key which is to be searched: ");
        int num = s.nextInt();
        Arrays.sort(sub);
        int lb = 0;
        int ub = size-1;
        int mid = (ub+lb)/2;
        while(num != sub[mid] && lb<ub){
            if(num > sub[mid]){
                lb = mid+1;
            }
            else{
                ub = mid-1;
            }
            mid=(ub+lb)/2;
        }
        if(num == sub[mid]){
            System.out.println("Element found at location: "+mid);
        }
        else{
            System.out.println("Element not found.");
        }
    }
}