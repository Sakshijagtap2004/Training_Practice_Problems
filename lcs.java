import java.util.*;
class Test{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. ");
        int n = sc.nextInt();
        
        int arr [] = new int[10];
        System.out.println("Enter the no. ");
        for (int i = 0;i<n-1;i++){
           arr [i] =sc.nextInt();
        }
       Arrays.sort(arr);
        int count = 0;
        for (int i=1; i<n; i++){
          if(i==arr[i]){
            count ++;
          }
          else{
            break;
          }
      
        }
          System.out.println(count);
        }

}