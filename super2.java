class Vehical{
  void message(){
    System.out.println("im vehical class");
  }

}
class Car extends Vehical{
  int speed = 12;
  void message(){
  System.out.println("im car class");

}
  void Display(){
    message();
    super.message();
  }}
class Test{
  public static void main(String [] args){
    Car s = new Car();
    s.Display();
  } 
}