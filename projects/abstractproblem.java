import java.util.*;
interface RBI{
  public void calculateInterest();
  //public void Intrest2();
  static final double s_i = 0.04;
  static final double c_i = 0.02;
}
abstract class BankAccount{
  static int accno, balance=10000;
  static String cname,city;
  static Scanner sc = new Scanner(System.in);

  public void inputData(){
    System.out.println("enter the account no:");
    accno = sc.nextInt();
    System.out.println("enter the name:");
    cname = sc.next();
    System.out.println("enter the city");
    city = sc.next();
  


  }
  public void display(int a){
    System.out.println("account no: "+accno );
    System.out.println("Name: "+cname);
    System.out.println("City: "+city);
    System.out.println("balance: "+balance);
    if (a==1){
     System.out.println("Account type:Saving "); 
    }
    else{
    System.out.println("Account type:current ");
    }


  }
  abstract void deposit();
  abstract void withdraw();
}
class CurrentAccount extends BankAccount { 
  public void withdraw(){


    if(balance<1000){
      System.out.println("balance is less than 1000");
    }
    else{
     
     System.out.println("enter the amount to withdraw");
     int withd = sc.nextInt();
     balance = balance - withd;


  
    }

  }
  public void deposit(){
    System.out.println("enter the amount to deposite");
    int amount = sc.nextInt();
    balance = balance+amount; 

  }
}
class SavingsAccount extends BankAccount{
  public void deposit(){
    System.out.println("enter the amount to deposite");
    int amount = sc.nextInt();
    balance = balance+amount; 

  }
    public void withdraw(){

    if(balance<1000){
      System.out.println("balance is less than 1000");
    }
    else{
     
     System.out.println("enter the amount to withdraw");
     int withd = sc.nextInt();
     if (withd>2000){
      System.out.println("Can't withdraw more than 2000");
      
     }
     else{
     balance = balance - withd;
     System.out.println("Amount is succesfully withdraw.");


  
    }}

  }
}
class Intrest1 extends SavingsAccount implements RBI{
  public void calculateInterest(){
    double rate_ca = 0.2;
    if(rate_ca>=s_i){
  double a = balance*rate_ca;
  System.out.println("Interest on SavingsAccount is "+a);
}
else {
  double a = balance*s_i ;
  System.out.println("Interest on SavingsAccount is "+a);

  }
}}
class Intrest2 extends CurrentAccount implements RBI{
  public void calculateInterest(){
    double rate_ca = 0.1;
  if(rate_ca>=c_i){
  double a = balance*rate_ca ;
  System.out.println("Interest on SavingsAccount is "+a);
  }
  else {
  double a = balance*c_i ;
  System.out.println("Interest on SavingsAccount is "+a);

  }
}}
class Test {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("choose your account type: 1. Saving 2.Current");
    int ch1 = sc.nextInt();
    //Test a = new Test();
    //a.display(ch1);
    switch(ch1){

    case 1:{
    while(true){
    System.out.println("enter your choice");
    System.out.println("1.inputdata 2. withdraw 3.display 4. deposit 5.Intrest 6.exit");
    int ch = sc.nextInt();
    SavingsAccount obj = new SavingsAccount();
    Intrest1 obj3 = new Intrest1();
    
    
        switch(ch){
        
          case 1: obj.inputData();
                  break;
          case 2: obj.withdraw();
                  break;
          case 3: obj.display(ch1);
                  break;
            case 4: obj.deposit();
                    break;
            case 5: obj3.calculateInterest();
                    break;        
            case 6: System.exit(0);


        }
    }

  }
  case 2:{
        
    while(true){
    System.out.println("enter your choice");
    System.out.println("1.inputdata 2. withdraw 3.display 4. deposit 5.exit");
    int ch = sc.nextInt();
    CurrentAccount obj1 = new CurrentAccount();
    Intrest2 obj4 = new Intrest2();
    
        switch(ch){
        
          case 1: obj1.inputData();
                  break;
          case 2: obj1.withdraw();
                  break;
          case 3: obj1.display(ch1);
                  break;
            case 4: obj1.deposit();
                    break;
           case 5: obj4.calculateInterest();
                    break;        
            case 6: System.exit(0);


        }
    }
  }
}}}