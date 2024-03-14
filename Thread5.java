//yeild method
class Mythread extends Thread{
  public void run(){
    for (int i=1; i<=10; i++)
    {
      System.out.println("child thread");
    
    }
  }
}
class Demo{
  public static void main(String args []){
   
    Mythread t = new Mythread();
    
    t.start();
    

    for (int i=0;i<=10;++i){
       t.yield();
      
      System.out.println("main thread");
      
    }
  }
} 
  
