import java.util.*;
class Student{
  
  Scanner sc = new Scanner(System.in);
  public void factorial(){
    System.out.println("enter a number:");
    int a = sc.nextInt();
    int fact = 1;
    for(int i = a; i>=1; --i){
      fact = fact*i;

    }
    System.out.println(fact);
  }
  public void power(){
    System.out.println("enter first number:");
    int b = sc.nextInt();
    System.out.println("enter Second number:");
    int c = sc.nextInt();
    double d = (double) Math.pow(b,c);
    System.out.println(d);

  }
  }
class Java {
  public static void main(String[] args) {
    Student s = new Student();
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("1. factorial 2.power 3.exit ");
      System.out.println("enter your choice");
      int n = sc.nextInt();
      switch(n){
        case 1: s.factorial();
                break;
        case 2: s.power();
                break;
        case 3: System.exit(0);
                break;
            }
    }



    }
  
}
