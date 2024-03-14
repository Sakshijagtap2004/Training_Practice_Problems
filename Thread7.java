
class Mythread extends Thread{
  public void run(){
    try{
    for (int i=1; i<=10; i++)
    {
      System.out.println("child thread");
      
        Thread.sleep(1000);
    }}
      
      catch(InterruptedException ie){
        System.out.println("interrupt");
      }
    }
  }

class ThreadDemo{
  public static void main(String args [])
  throws InterruptedException{
   
    Mythread t = new Mythread();
    
    t.start();
    t.interrupt();

    for (int i=0;i<=10;++i){
    
      
      System.out.println(i);
      Thread.sleep(1000);
      
    }
  }
} 
  
