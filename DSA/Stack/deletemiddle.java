/*import java.util.*;
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
        MyJava s2 = new MyJava();
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] str1 = new int[n]; 
int mid = n/2;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array element " + (i + 1) + ":");
            str1[i] = sc.nextInt();
        }
     
        for (int i = 0; i < n; i++) {
            s1.push(str1[i]);
            System.out.print(s1.stack[s1.top]);
            
            
        }

        System.out.println();


        for (int i = 0; i < mid; i++) {
            int data = s1.stack[s1.top] ; 
            s2.push(data);
            s1.pop();
            
        }
         s1.pop();
       while (!s2.isEmpty()){
           int data = s2.stack[s2.top] ; 
           s1.push(data);
            s2.pop();
          
        }
        for (int i = s1.top; i >= 0; i--) {
            
                System.out.print(s1.stack[i]);
            
        }
        //System.out.print(s1.stack[s1.top]);


    }
}

  */
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
        MyJava s2 = new MyJava();
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] str1 = new int[n];
        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter array element " + (i + 1) + ":");
            str1[i] = sc.nextInt();
        }

        // Push elements into s1
        for (int i = 0; i < n; i++) {
            s1.push(str1[i]);
            System.out.print(s1.stack[s1.top]);
        }

        System.out.println();

       

        System.out.println();

        // Move the first half of elements from s1 to s2
        for (int i = 0; i < mid; i++) {
            int data = s1.stack[s1.top]; 
            s2.push(data);
            s1.pop();
        }

        // Pop the middle element from s1
        s1.pop();

        // Move remaining elements from s1 to s2
        while (!s1.isEmpty()) {
            int data = s1.stack[s1.top]; 
            s2.push(data);
            s1.pop();
        }

        // Move elements back from s2 to s1
        while (!s2.isEmpty()) {
            int data = s2.stack[s2.top]; 
            s1.push(data);
            s2.pop();
        }

        // Print the stack s1 after removing the middle element
       System.out.print("After: ");
for (int i = 0; i <= s1.top; i++) {
    System.out.print(s1.stack[i]);
}
    }
}
