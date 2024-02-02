class Rectangle{
  int m, n;
  public Rectangle(int a , int b){
     m = a;
     n = b;
  }
  public void area(){
    System.out.println("a is:"+m);
        System.out.println("b is:"+n);
            System.out.println("area is:"+m*n);



  }
}
class Java{
  public static void main (String args []){
    Rectangle rc = new Rectangle(4,5);
    Rectangle rs = new Rectangle(5,8);
    rc.area();
    rs.area();
  }}