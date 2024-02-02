import java.util.*;
class Java{
  public static void main(String args[]){
    System.out.println("enter character");
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    switch(ch) {
      case 'a' : System.out.println("its a vowel");
                  break;
      case 'e':
              System.out.println("its a vowel") ;
              break;
      case 'i': 
              System.out.println("its a vowel") ;
              break;
      case 'o': 
              System.out.println("its a vowel") ;
              break;
      case 'u': 
              System.out.println("its a vowel") ;
              break;        
     
    }
    System.out.println("its not a vowel") ;
  }
} 
