/*import java.util.*;
class Stacks{
 
  
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
 
    public void push(int temp){
    if (isFull()){
      System.out.println("element can not be inserted stack is full");
    }
    else{
   
     
      top++;
      stacksA[top]=data;


    }
    
  }
  public void pop(){
    if (isEmpty()){
      System.out.println("element can not be poped stack is empty");
    }
    else{
     
     top--;
  }
  }
  
  public void traverse(){
    for (int i=top; i>=0; --i){
      System.out.println(stacks[i]);
    }
  }
public static void main(String[] args) {
   int top = -1;
  int data;
  final int capacity = 3;
        Stacks s = new Stacks();
        int temp;
        int stacksA[] = new int [10];
        int stacksB[] = new int [10];
        int stacksC[] = new int [10];
        Scanner sc = new Scanner(System.in);
        for(int i=1; i>=3;i++){
          stacksA.s.push(i);
        }
        stacksA.s.traverse();
        temp = stacksA[top];
        stacksC.s.push(temp);
        stacksA.s.pop();
        stacksA.s.traverse();
        stacksC.s.traverse();
        temp = stacksA[top];
        stacksB.s.push(temp);
        stacksA.s.pop();
        stacksA.s.traverse();
        stacksB.s.traverse();
        stacksC.s.traverse();
        //step4
        temp = stacksC[top];
        stacksB.s.push(temp);
        stacksC.s.pop();
        stacksA.s.traverse();
        stacksB.s.traverse();
        stacksC.s.traverse();
        //step 5
        temp = stacksA[top];
        stacksC.s.push(temp);
        stacksA.s.pop();
        stacksA.s.traverse();
        stacksB.s.traverse();
        stacksC.s.traverse();
        //step6
        temp = stacksB[top];
        stacksA.s.push(temp);
        stacksB.s.pop();
        stacksA.s.traverse();
        stacksB.s.traverse();
        stacksC.s.traverse();
        //step7
        temp = stacksB[top];
        stacksC.s.push(temp);
        stacksB.s.pop();
        stacksA.s.traverse();
        stacksB.s.traverse();
        stacksC.s.traverse();
         //step8
        temp = stacksA[top];
        stacksC.s.push(temp);
        stacksA.s.pop();
        stacksA.s.traverse();
        stacksB.s.traverse();
        stacksC.s.traverse();









        






                
            }
        }*/
 /*       import java.util.*;

class Stacks {
    private int top;
    private int[] stacks;
    private final int capacity;

    public Stacks(int capacity) {
        this.top = -1;
        this.stacks = new int[capacity];
        this.capacity = capacity;
    }

    public boolean isFull() {
        return top >= capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Element cannot be inserted, stack is full");
        } else {
            top++;
            stacks[top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Element cannot be popped, stack is empty");
            return -1; // Return some default value or throw an exception
        } else {
            int temp = stacks[top];
            top--;
            return temp;
        }
    }

    public void traverse() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stacks[i]);
        }
    }

    public static void main(String[] args) {
        Stacks stacksA = new Stacks(10);
        Stacks stacksB = new Stacks(10);
        Stacks stacksC = new Stacks(10);
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            stacksA.push(i);
        }
       

        int temp = stacksA.pop();
        stacksC.push(temp);
        

        temp = stacksA.pop();
        stacksB.push(temp);
       
       

        // Move from C to B (Step 4)
        temp = stacksC.pop();
        stacksB.push(temp);
        System.out.println("After moving from C to B:");
        System.out.println("Stack A:");
        stacksA.traverse();
        System.out.println("Stack B:");
        stacksB.traverse();
        System.out.println("Stack C:");
        stacksC.traverse();

        // Move from A to C (Step 5)
        temp = stacksA.pop();
        stacksC.push(temp);
        System.out.println("After moving from A to C:");
        System.out.println("Stack A:");
        stacksA.traverse();
        System.out.println("Stack B:");
        stacksB.traverse();
        System.out.println("Stack C:");
        stacksC.traverse();

        // Move from B to A (Step 6)
        temp = stacksB.pop();
        stacksA.push(temp);
        System.out.println("After moving from B to A:");
        System.out.println("Stack A:");
        stacksA.traverse();
        System.out.println("Stack B:");
        stacksB.traverse();
        System.out.println("Stack C:");
        stacksC.traverse();

        // Move from B to C (Step 7)
        temp = stacksB.pop();
        stacksC.push(temp);
        System.out.println("After moving from B to C:");
        System.out.println("Stack A:");
        stacksA.traverse();
        System.out.println("Stack B:");
        stacksB.traverse();
        System.out.println("Stack C:");
        stacksC.traverse();

        // Move from A to C (Step 8)
        temp = stacksA.pop();
        stacksC.push(temp);
        System.out.println("After moving from A to C:");
        System.out.println("Stack A:");
        stacksA.traverse();
        System.out.println("Stack B:");
        stacksB.traverse();
        System.out.println("Stack C:");
        stacksC.traverse();
    }
}
*/
//Tower of Hanoi Code




class Stacks{
    final int capacity=10;
    int stack[] = new int[capacity];
    int top =-1;

    public boolean isEmpty() {
        if (top ==-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if (top == capacity-1){
            return true;
        }else{
            return false;
        }
    }

    public void push(int val){
        if (!isFull()){
            stack[++top] = val;
        }else{
            System.out.println("Stack is full");
        }
    }

    public void pop(){
        if (!isEmpty()){
            stack[top] = 0;
            top--;
        }else{
            System.out.println("Stack is empty");
        }
    }

    public void peek(){
        System.out.println("Element peeked on stack top: "+stack[top]);
    }
}


class towerofHanoi {
    int itr = 1;
    Stacks s1 = new Stacks();
    Stacks s2 = new Stacks();
    Stacks s3 = new Stacks();

    public void show(){
        System.out.println("\t\tIteration: "+itr++);
        System.out.println("\tTower 1 \tTower 2 \tTower 3");
        for (int i=2;i>=0;i--){
            System.out.println("|\t"+s1.stack[i]+"\t|\t"+s2.stack[i]+"\t|\t"+s3.stack[i]+"\t|");
            System.out.println("-------------------------------------------------");
        }
        
    }
    public static void main(String[] args) {
        towerofHanoi h = new towerofHanoi();

        //itr 1
        h.s1.push(3);
        h.s1.push(2);
        h.s1.push(1);
        h.show();

        //itr 2+
        h.s1.pop();
        h.s3.push(1);
        h.show();

        //itr 3
        h.s1.pop();
        h.s2.push(2);
        h.show();

        //itr 4
        h.s3.pop();
        h.s2.push(1);
        h.show();

        //itr 5
        h.s1.pop();
        h.s3.push(3);
        h.show();

        //itr 6
        h.s2.pop();
        h.s1.push(1);
        h.show();

        //itr 7
        h.s2.pop();
        h.s3.push(2);
        h.show();

        //itr 8
        h.s1.pop();
        h.s3.push(1);
        h.show();
    }
}
    

