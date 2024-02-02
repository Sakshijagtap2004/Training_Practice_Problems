class Test{
  void m1(int...n ){
    System.out.println("Sakshi");
  
  }
  public static void main(String[] args){
    Test t = new Test();
    t.m1();
    t.m1(10);
    t.m1(10,20);
    t.m1(10,20,30);
  }
}