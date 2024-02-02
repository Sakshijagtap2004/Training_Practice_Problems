import java.util.*;
class BankAccount{
  int accno, balance=10000;
  String cname,city;
  Scanner sc = new Scanner(System.in);

  public void inputData(){
    System.out.println("enter the account no:");
    accno = sc.nextInt();
    System.out.println("enter the name:");
    cname = sc.next();
    System.out.println("enter the city");
    city = sc.next();
  


  }
  public void display(){
    System.out.println("account no: "+accno );
    System.out.println("Name: "+cname);
    System.out.println("City: "+city);
    System.out.println("balance: "+balance);


  }
  public void deposit(){
    System.out.println("enter the amount to deposite");
    int amount = sc.nextInt();
    balance = balance+amount; 

  }
  public void withdraw(){
     System.out.println("enter the amount to withdraw");
     int withd = sc.nextInt();
     balance = balance - withd;


  }
}
class SavingsAccount extends BankAccount { 
  public void withdraw(){
    if(balance<1000){
      System.out.println("balance is less than 1000");
    }
    else{
      super.withdraw();
    }

  }
}
class Test {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    while(true){
    System.out.println("enter your choice");
    System.out.println("1.inputdata 2. withdraw 3.display 4. deposit 5.exit");
    int ch = sc.nextInt();
    SavingsAccount obj = new SavingsAccount();
    
        switch(ch){
        
          case 1: obj.inputData();
                  break;
          case 2: obj.withdraw();
                  break;
          case 3: obj.display();
                  break;
            case 4: obj.deposit();
                    break;
            case 5: System.exit(0);


        }
    }

  }
}