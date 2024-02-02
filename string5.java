import java.util.*;
class String19{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        int i,j;
        double narr[] = new double[n];
        System.out.println("Enter elements of the array: ");
        for(i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        for(i=0;i<n;i++){
            if(i==0){
                narr[i]=1;
            }
            else{
                if(arr[i]<arr[i-1]){
                    narr[i]=1;
                }
                else{
                    narr[i]=2;
                }
            }
        }
        for(i=0;i<n;i++){
            narr[i] = Math.pow(narr[i],3);
            System.out.print((int)narr[i]);
        }
    }
}