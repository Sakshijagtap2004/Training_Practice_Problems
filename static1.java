class StaticKeyword{
  static int num = staticMethod();
  static {
    System.out.println("inside static block");

  }
  static int staticMethod(){
    System.out.println("from staticMethod");
    return 40;
  }
  public static void main (String args []){
    System.out.println("num:" +num);
    System.out.println("from main");
  }
}