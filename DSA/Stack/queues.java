import java.util.*;
class Queues{
  int front = 0;
  int rare = -1;


  
  int data;
  final int capacity = 10;
  int queues[] = new int [10];
  public boolean isFull(){
    if (rare>=capacity){
      return true;
    }
    else {
      return false;
    }

  }
  public boolean isEmpty(){
    if (rare==-1){
      return true;

    }
    else {
      return false;
    }
  }
  public void insert(){
    if (isFull()){
      System.out.println("element can not be inserted stack is full");
    }
    else{
      Scanner t = new Scanner(System.in);
      System.out.println("enter the element:");
      int data = t.nextInt();
      rare++;
      queues[rare]=data;


    }
    
  }
 /* public void delete(){
    if (isEmpty()){
      System.out.println("element can not be poped stack is empty");
    }
    else{
     System.out.println("enter the element at deleted is  :"+queues[front]);
     for (int i=1; i<=rare-1;i++){
      
    
     queues[i-1]=queues[i];
     
     }
     rare--;
  }
  }*/
  public void delete(){
        System.out.println("");
        if(isEmpty()){
            System.out.println("Element is already empty.");
        }
        else{
            System.out.println("Element deleted: "+queues[front]);
            for(int i=front+1;i<=rare;i++){
                queues[i-1] = queues[i];
            }
            rare--;
        }
        System.out.println("");
    }

  public void display(){
    for (int i=0; i<=rare; i++){
      System.out.print(queues[i]+"             ");
     // System.out.println(" ");

    }
  }
public static void main(String[] args) {
        Queues s = new Queues();
        Scanner sc = new Scanner(System.in);
  while (true) {
            System.out.println("1. insert 2. delete 3. display 4.Exit ");
            System.out.println("Enter your choice");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    s.insert();
                    break;
                case 2:
                    s.delete();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                   System.exit(0);
                
                
            }
        }
    }
}

