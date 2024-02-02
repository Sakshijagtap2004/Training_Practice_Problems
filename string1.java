import java.util.*;
class Java {
  public static void main(String args[]){
    System.out.println("enter a string 1:");
    int count=0;
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    System.out.println("enter a string 2:");
    String str2 = sc.next();
    if (str2.length()>str1.length()){
      int res = str2.length() - str1.length();
      System.out.println(res);
    }
    else if (str1.length()>str2.length()){
      int res = str1.length() - str2.length();
      System.out.println(res);
    }
    
    else if (str1.length()==str2.length()){
      for (int i=0;i<=str1.length();i++){
        if (str1.charAt(i)!=str2.charAt(i)){
              count++;
        }
    
      }
}

    
    
  }
  }
