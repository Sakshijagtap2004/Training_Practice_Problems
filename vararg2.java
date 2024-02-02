class Test{
  void m1(int...a){
    System.out.println("variable argument ="+a);

  }
  void m1(int a){
    System.out.println("normal argument ="+a);
    
  }
  public static void main (String args[]){
    Test t = new Test();
    t.m1(10);
  }
}