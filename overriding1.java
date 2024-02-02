class Parent{
  int a=10;

  public void bike(){
     System.out.println(a);
  }
}
class Child extends Parent{
    //int a=11;
 public void bike(){
     System.out.println(a);
  }

}
class Java{
  public static void main(String args[]){
    Child obj = new Child();
    obj.bike();
   
  }
}