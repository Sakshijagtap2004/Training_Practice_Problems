import java.util.*;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter cost price");
    int costprice = sc.nextInt();
    System.out.println("are you student (y/n)");
    char student = sc.next().charAt(0);
    double amount = 0;
    double discount = 0; 
    if (student == 'y'){
      if (costprice > 500){
        discount = (0.1*costprice);
        }
      else {
        discount =  (0.05*costprice);
      }
      }
    
    else {
      if (costprice > 500){
        discount =  (0.08*costprice);
        }
      else {
        discount =(0.02*costprice);
      }
      }
  amount = (costprice - discount);
    System.out.println("amount to be paid is " +amount);
    }
}

