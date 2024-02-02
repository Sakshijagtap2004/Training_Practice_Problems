import java.util.*;
class Test{
  public static void main (String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the rat");
  int r = sc.nextInt();
  System.out.println("enter the unit");
  int u = sc.nextInt();
  System.out.println("enter no. of element in arr");
  int n = sc.nextInt();
  int arr [] = new int[n];
        System.out.println("Enter the no. ");
        for (int k = 0;k<n-1;k++){
          arr [k] =sc.nextInt();
        }
 

  int count = 0;
  int food =0;
  if(arr.length==0){
            System.out.println("-1");
        }
  else{
    int foodreq = r * u;
    for(int i=0 ; i<arr.length ; i++){
    food = food + arr[i];
    count++;
    if(food >= foodreq){
                    break;
                }
  }
  if(count>n){
                System.out.println("0");
            }
            else{
                System.out.println(count);
            }
 


}}}

