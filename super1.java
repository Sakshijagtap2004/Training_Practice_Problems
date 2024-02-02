class Vehical{
  int speed =170;

}
class Car extends Vehical{
  int speed = 12;
  void Display(){
  System.out.println(super.speed);
}}
class Test{
  public static void main(String [] args){
    Car s = new Car();
    s.Display();
  } 
}