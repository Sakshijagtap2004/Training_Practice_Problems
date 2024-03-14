class Mythread implements Runnable{
  public void run(){
    for (int i=0; i<=10; ++i){
      System.out.println("Child Thread");
    
    }
  }
}
class Threads2{
  public static void main(String [] args){
    Mythread m = new Mythread();
    Thread n = new Thread(m);
    n.start();

    for (int i=0;i<=10;++i){
      System.out.println("main thread");

    }
  }
}