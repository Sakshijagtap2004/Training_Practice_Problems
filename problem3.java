import java.util.*;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String s = sc.next().charAt(0);
    int l = s.length();
  } int i =1;
  int count = 1;
  while(i<l){
    if(s.charAt(i)==s.charAt(i+1)){
      count ++;
    }
    else {
      System.out.println(charAt(i));
      System.out.println(count);

    }
  }

}
import java.util.*;
class Cap{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = s.next();
        int j,i=0,c=1;
        String res ="";
        while(i<str.length()){
            for(j=i+1;j<str.length();j++){
                if(str.charAt(j-1)==str.charAt(j)){
                    c=c+1;
                }
                else{
                    break;
                }
            }
            res = res + str.charAt(j-1) + c;
            i=j;
            c=1;
        }
        System.out.println(res);
    }
}