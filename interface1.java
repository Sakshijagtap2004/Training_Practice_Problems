//program to achieve multiple inheritance


interface Abc{
  public void show();

}
class Pqr{
  static int i=20;
}
class Xyz extends Pqr implements Abc{
  public void show(){
    System.out.println("Im in abc");

  }
  public static void main(String[] args) {
    Abc a;
    Xyz z = new Xyz();
    a=z;
    a.show();
    System.out.println(i);
  }
}