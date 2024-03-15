import java.util.*;
class Stacks{
  int top = -1;
  int data;
  final int capacity = 10;
  int stacks[] = new int [10];
  public boolean isFull(){
    if (top>=capacity){
      return true;
    }
    else {
      return false;
    }

  }
  public boolean isEmpty(){
    if (top==-1){
      return true;

    }
    else {
      return false;
    }
  }
  public void push(){
    if (isFull()){
      System.out.println("element can not be inserted stack is full");
    }
    else{
      Scanner t = new Scanner(System.in);
      System.out.println("enter the element:");
      int data = t.nextInt();
      top++;
      stacks[top]=data;


    }
    
  }
  public void pop(){
    if (isEmpty()){
      System.out.println("element can not be poped stack is empty");
    }
    else{
     System.out.println("enter the element at peek is  :"+stacks[top]);
     top--;
  }
  }
  public void peek(){
    System.out.println("enter the element at top is poped :"+stacks[top]);
  }
  public void traverse(){
    for (int i=top; i>=0; --i){
      System.out.println(stacks[i]);
    }
  }
public static void main(String[] args) {
        Stacks s = new Stacks();
        Scanner sc = new Scanner(System.in);
  while (true) {
            System.out.println("1. push 2. pop 3. peek 4.traverse 5.Exit ");
            System.out.println("Enter your choice");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.traverse();
                    break;
                case 5:
                    System.exit(0);
                   
                
            }
        }
    }
}
