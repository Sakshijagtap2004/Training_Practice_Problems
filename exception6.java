import java.io.*;
class  ExceptionDemo {
  void method1(ArithmeticException ae){
    System.out.println("ae");
  }
  void method1(IOException ae){
    System.out.println("ae");
  }


  public static void main(String [] args) {
    ExceptionDemo e = new ExceptionDemo();
    e.method1(new ArithmeticException());
    e.method1(new IOException());
   
  }
  }
