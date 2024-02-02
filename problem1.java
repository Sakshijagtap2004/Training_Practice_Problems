import java.util.*;
class Employee{
  static int esal;
  Scanner sc = new Scanner(System.in);
   int eno ;
  String ename ;
  String city ;
  
 public Employee(){
    super();

  }
  public Employee(int sal){
    esal = sal;

  }
  public void work(){
   System.out.println("this is employee working rn");
  }
  public void getSalary(){
    System.out.println("Salary of employee is "+esal);
  }
  public void addEmployee(){
   
  
    System.out.println("enter roll no :");
    eno = sc.nextInt();
    System.out.println("enter name :");
    ename = sc.next();
    System.out.println("enter city :");
    city = sc.next();
    
 

  } 
  }

class HRManager extends Employee{
  public HRManager(int sal){
    super(sal);


  }
  public void work(){
    System.out.println("come to the lobby rn");
  }
  public void showEmployee(){

    System.out.println(" eno\teName\tCity\t");
    System.out.println(" ----------------------------------------------");
    
    System.out.println(eno+"\t\t"+ename+"\t"+city+"\t");

    


  }
}
class Test{
  public static void main(String args[]){
    Employee obj1 = new Employee();
    obj1.addEmployee();

    obj1.work();
    HRManager obj2 = new HRManager(1000);
    obj2.showEmployee();
    obj1.getSalary();
    
    obj2.work();

  }
}