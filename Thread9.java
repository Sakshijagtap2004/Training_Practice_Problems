class Mythread extends Thread{
  public void run()
  {
    for (int i =0;i<=10;i++){
      System.out.println("Daemon thread"+i);
      try{
        Thread.sleep(500);
      }
      catch (InterruptedException ie){
        ie.printStackTrace();
      
      }
    }
  }
}
class ThreadDemo{
  public static void main(String [] args){
    Mythread t = new Mythread();
    t.setDaemon(true);
    t.start();
    for (int i=0;i<5; i++){
      System.out.println("Main Thread"+i);
      try{
        Thread.sleep(500);
      }
      catch (InterruptedException ie){
        ie.printStackTrace();
      }
    }
  }
}