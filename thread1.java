import java.util.*;
class Java{
  public static void main(String args[]) throws InterruptedException{
    int i;
    for (i=1;i<=10;i++){
      System.out.println(i);
      Thread.sleep(200);
    }
  }
}