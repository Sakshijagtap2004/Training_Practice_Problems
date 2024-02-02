import java.util.*;
class A {
  public  void showA(){
    System.out.println("class A");
  }
}
class B extends A {
  public  void showB(){
    System.out.println("class b"); 
  }
}
class C extends B {
  public  void showC(){
    System.out.println("class c"); 
    
  }
}
class Java{
  public static void main(String args[]){
    B obj1 = new B();
    C obj2 = new C();
    obj1.showA();
    obj1.showB();
    obj2.showA();
    obj2.showB();
    obj2.showC();

  }
}