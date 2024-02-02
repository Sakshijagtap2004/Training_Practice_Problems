interface I1{
  void m1();
  interface I2{
    void m2();
  }
}
class Test implements I1,I1.I2{
  public void m1(){
    System.out.println("m1 method");
  }
  public void m2(){
    System.out.println("m2 method");
  }
  public static void main(String [] args)
  {
    Test t = new Test();
    t.m1();
    t.m2();
  }
}