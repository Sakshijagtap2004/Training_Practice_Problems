import java.util.*;

class MyJava {
    int top = -1;
    final int capacity = 10;
    char stack[] = new char[100];

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }

    public void push(char ch) {
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

class Stacks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        MyJava s1 = new MyJava();

        System.out.println("enter a string");
        String str1 = sc.next();
       
        for (int i = 0; i < str1.length(); i++) { 
            s1.push(str1.charAt(i));
        }
        for (int i = 0; i < str1.length(); i++) { 
            System.out.print(s1.stack[s1.top]);
            s1.pop();
        }
    }
}
