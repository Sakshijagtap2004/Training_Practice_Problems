/*import java.util.*;
class Java{
  public static void main (String args[]){
    Scanner sc = Scanner(System.in);
    System.out.println("enter the no of element:");
    int n = sc.nextInt;
    int arr[] = new arr[];
    for (int i=0; i<n-1; i++){
      arr [i] =sc.nextInt();
    }
    String flag ='False';  
  }

}*/
public class NotUnique {
    public static void main(String[] args) {
        int arr[] = new int[]{7,1,2,3,4,5,6,7};
        int flag=0;
        //to check if any number occurs atleast twice , if so then print true else print false
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag=1;
                    break;
                }
            }
        }
        if (flag==1)
            System.out.println("True");
        else
            System.out.println("False");
    }
}