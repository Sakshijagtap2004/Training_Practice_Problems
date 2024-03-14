class A
{
  public static synchronized void print(String name){
    for(int i=0;i<3;i++){
      System.out.println("Batting="+name);
      try{
        Thread.sleep(500);
      }
      catch(InterruptedException ie){
        ie.printStackTrace();
      }
    }
  }
}
class Mythread1 extends Thread{
  public void run(){
    A.print("Sachin");
  }
}
class Mythread2 extends Thread{
  public void run(){
    A.print("Dohni");
  }
}
class Mythread3 extends Thread{
  public void run(){
    A.print("Virat");
  }
}