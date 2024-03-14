class SetName extends Thread{
  public void run(){
    System.out.println("run() method");

  }

public static void main( String args []){
  SetName t1 = new SetName();
  SetName t2 = new SetName();
  System.out.println("Name of t1 :"+t1.getName());
  System.out.println("Name of t1 :"+t2.getName());
  Thread currentThread = Thread.currentThread();
  t1.start();
  t2.start();
  t1.setName("Sakshi");
  System.out.println("after changing name of thread 1 :"+t1.getName());
  System.out.println("after changing name of thread 1 :"+t2.getName());
  System.out.println("thread:" +currentThread.getName());

}
}
