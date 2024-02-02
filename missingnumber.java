import java.util.*;
class Missing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. ");
        int n = sc.nextInt();
        
        int arr [] = new int[10];
        System.out.println("Enter the no. ");
        for (int i = 0;i<n-1;i++){
           arr [i] =sc.nextInt();
        }
        int res= (( n * (n+1))/2);
        //System.out.println(res);
        int total=0;
        for (int i = 0 ; i<n; i++){
          total=total+arr[i];
        }
        //System.out.println(total);
        int missingno = res - total;
        System.out.println(missingno);

        
        
        
        }}

