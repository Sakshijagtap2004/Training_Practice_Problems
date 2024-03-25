class Water{
  public int  capacity1 = 5;
  public int  capacity2 = 3;

  public int stack1[] = new int[5];
  public int stack2[] = new int[3];

  public boolean isEmpty(int top) {
    if (top ==-1){
        return true;
    }else{
        return false;
    }
  }

  public boolean isFull(int top , int capacity){
    if (top == capacity-1){
        return true;
    }else{
        return false;
    }
  }

  public int push(int top , int capacity, int stack[]){
    if (!isFull(top, capacity)){
        stack[++top] = 1;
    }else{
        System.out.println("Stack is full");
    }
    return top;
  }

  public int pop(int top , int stack[]){
    if (!isEmpty(top)){
        stack[top] = 0;
        top--;
    }else{
        System.out.println("Stack is empty");
    }
    return top;
  }

  public static void main(String args[]){
    Water s1 = new Water();

    int top1 =-1;
    int top2 =-1;
 
    for(int i =0;i<=5;i++){
      top1 =s1.push(s1.top1,s1.stack1);
    }
    System.out.println(s1.top1);

  }
}