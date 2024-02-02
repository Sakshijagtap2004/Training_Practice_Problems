class Parent{
  int cash , gold;
  public void propeties(){
    System.out.println("propeties");

  }
  public void bike(){
     System.out.println("splender");
  }
}
class Child extends Parent{
   public void bike(){
     System.out.println("hb");
  }
}
class Java{
  public static void main(String args[]){
    Child obj = new Child();
    obj.bike();
    obj.propeties();
  }
}