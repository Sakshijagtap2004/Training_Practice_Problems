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

    public int pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty");
            return -1; // Indicate empty stack
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is empty");
            return -1; // Indicate empty stack
        }
    }

    public void traverse() {
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

public void sortStack() {
    MyJava tempStack = new MyJava();

    while (!isEmpty()) {
        int temp = pop();

        while (!tempStack.isEmpty() && tempStack.peek() < temp) {
            push(tempStack.pop());
        }

        tempStack.push(temp);
    }

    while (!tempStack.isEmpty()) {
        push(tempStack.pop());
    }
}
public void traverseReverse() {
    System.out.print("Stack elements in reverse order: ");
    for (int i = 0; i <= top; i++) {
        System.out.print(stack[i] + " ");
    }
    System.out.println();
}
}

class Stackss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyJava s = new MyJava();

        System.out.print("Enter an element in the stack/type -1 to stop: ");
        int num = sc.nextInt();

        while (num != -1) {
            s.push(num);
            System.out.print("Enter an element in the stack/type -1 to stop: ");
            num = sc.nextInt();
        }

        System.out.println("Stack before sorting:");
        s.traverse();

        // Sorting the stack
        s.sortStack();

        System.out.println("Stack after sorting:");
    s.traverseReverse();
    }
}

