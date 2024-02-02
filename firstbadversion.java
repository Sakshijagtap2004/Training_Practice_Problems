import java.util.*;
class Test1{
  int n1,bad1;
  public void isBadVersion(int n, int bad ){
    n1 = n;
    bad1 = bad;
    for (int i=1;i<=n;i++){
      if (i<bad1){
        
          System.out.println("false");
        
        
      }
      else {
       System.out.println("True");
      }
    }
    
  }
  }
class Test extends Test1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the range");
    int n = sc.nextInt();
    System.out.println("enter the bad version");
    int bad = sc.nextInt(); 
    Test t = new Test();
    t.isBadVersion(n,bad);
  }
}