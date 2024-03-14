/*import java.util.*;
class MyJava{
  public static void main (String args[]){

    String arr[] = new arr[];
    Scanner sc = new Scanner(System.in);
   
    System.out.println("enter  5 email here");
    for (int i =0; i<5; i++){
      arr[i] = sc.next();

    }*/
import java.util.*;
class MyJava{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String email[] = new String[5];
        System.out.println("Enter 5 email ids: ");
        for(int i=0;i<5;i++){
            email[i]=s.next();
        }
        for(int i=0;i<5;i++){
            if(email[i].startsWith("raj")){
                System.out.println(email[i]);
            }
        }

    }
}
    
    
    
    
   
 
