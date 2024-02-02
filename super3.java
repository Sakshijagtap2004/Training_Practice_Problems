class Person{
  Person(){
    System.out.println("this is person class ");
  }
}
class Student extends Person{
  Student(){
    super();
    System.out.println("this is student mclass "); 
  }
}
class Test{
  public static void main(String[] args){
    Student s = new Student();
  }
}