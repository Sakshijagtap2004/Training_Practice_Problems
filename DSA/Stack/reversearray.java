import java.util.*;

class MyJava {
    int top = -1;
    final int capacity = 10;
    int stack[] = new int[100];

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }

    public void push(int ch) {
        if (!isFull()) {
            stack[++top] = ch;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            stack[top--] = '\0'; // Decrement top before setting to '\0'
        } else {
            System.out.println("Stack is empty");
        }
    }
}

class Stackss {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        MyJava s1 = new MyJava();
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] str1 = new int[n]; 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter array element " + (i + 1) + ":");
            str1[i] = sc.nextInt();
        }
       
        for (int i = 0; i < n; i++) {
            s1.push(str1[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(s1.stack[s1.top] ); 
            s1.pop();
        }
    }
}
