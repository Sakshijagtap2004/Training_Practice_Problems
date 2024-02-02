class Test{
  void m1(char ch,int...n ){
    System.out.println(ch);
    for(int a1:n){
       System.out.println(a1);
    }
  
  
  
  }
  public static void main(String[] args){
    Test t = new Test();
    
    t.m1('A');
    t.m1('B',20);
    t.m1('C',20,30);
    t.m1('C',20,30,40);
  }
}