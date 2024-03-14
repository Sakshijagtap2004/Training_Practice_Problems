//yeild method
class Mythread extends Thread{
  public void run(){
    for (int i=1; i<=10; i++)
    {
      System.out.println("child thread");
      try{
        Thread.sleep(100);
      }
      catch(InterruptedException ie){}
    }
  }
}
class ThreadDemo{
  public static void main(String args [])
  throws InterruptedException{
   
    Mythread t = new Mythread();
    
    t.start();
    t.join();

    for (int i=0;i<=10;++i){
    
      
      System.out.println(i);
      Thread.sleep(600);
      
    }
  }
} 
  
