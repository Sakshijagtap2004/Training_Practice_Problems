/*import java.util.*;
class Test{
    public static void main(String args[]){
      
      Scanner sc = new Scanner(System.in);
      System.out.println("enter num1");
      int n = sc.nextInt();
        
        int num1 [] = new int[10];
        System.out.println("Enter the no. ");
        for (int e = 0;e<n-1;e++){
           num1 [e] =sc.nextInt();
        }
        int num2 [] = new int[10];
        System.out.println("Enter the no. ");
        for (int m = 0;m<n-1;m++){
           num2 [m] =sc.nextInt();
        }
      int l1 = num1.length;
      int l2 = num2.length;
      int c [] = new int [10]; 
      for (int i=0;i<=l1;i++){
        for (int j=0; j<=l2;j++){
          if (num1[i]!=num2[j]){
            System.out.println(c[j]);
            
          


          }
        }


          
 
        }
      }
    }
*/


import java.util.*;

public class FindDiffOf2Arr {
    public static void main(String[] args) {
        int num1[]=new int[]{1,2,3};
        int num2[]=new int[]{2,4,6};
        int diff1[]=new int[10];
        int diff2[]=new int[10];
        int flag=0;
        int place=0;
        //to find if the numbers in array num1 exists in array num2 , if not add the number to diff1 array
        for (int i=0; i<num1.length; i++) {
            int temp = num1[i];
            for (int j=0; j<num2.length; j++) {
                if (temp==num2[j]) {
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                diff1[place]=temp;
                place++;
            }
            flag=0;
        }
        place=0;flag=0;
        for (int i=0; i<num2.length; i++) {
            int temp = num2[i];
            for (int j=0; j<num1.length; j++) {
                if (temp==num1[j]) {
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                diff2[place]=temp;
                place++;
            }
            flag=0;
        }
        //System.out.println(Arrays.toString(diff1));
        //System.out.println(Arrays.toString(diff2));

        int count1=0;
        int count2=0;
        for (int i=0; i<diff1.length; i++) {
            if(diff1[i]!=0)
            count1++;
        }
        for (int i=0; i<diff2.length; i++) {
            if(diff2[i]!=0)
            count2++;
        }

        int out[][]= new int[2][Math.max(count1, count2)];
        for (int i=0; i<count1; i++) {
            out[0][i] = diff1[i];
        }
        for (int i=0;i<count2; i++) {
            out[1][i] = diff2[i];
        }
        System.out.println(Arrays.deepToString(out));
    }
}