//program to use of blank final variable
class FinalDemo{
  final int Max;
  FinalDemo(){
    Max = 110;
    System.out.println(Max);
  }
  public static void main(String args[]){
    FinalDemo obj= new FinalDemo();
    //obj.me();
  }
}