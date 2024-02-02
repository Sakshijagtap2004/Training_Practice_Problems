import java.util.*;
class Triangle{
  int a,b,c;
  public Triangle(){
    int a = 4;
    int b = 5;
    int c = 6;
    }
  public void area(){
    int areaOfTriangle = (1/2)*b*c;
    System.out.println(areaOfTriangle);
  }
  public void perimeter(){
    int perimeterOfTriangle = (a+b+c)/2;
    System.out.println(perimeterOfTriangle);
  }

  }


  class Java {
  public static void main(String[] args) {
    Triangle s = new Triangle();
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("1. Area 2.perimeter 3.exit ");
      System.out.println("enter your choice");
      int n = sc.nextInt();
      switch(n){
        case 1: s.area();
                break;
        case 2: s.perimeter();
                break;
        case 3: System.exit(0);
                break;
            }
    }



    }
  
}
