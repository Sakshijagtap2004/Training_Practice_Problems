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
      String res;
        Scanner sc = new Scanner(System.in);
        MyJava s1 = new MyJava();

        System.out.println("enter a string");
        String str1 = sc.nextLine();
        for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i)!= ' '){
                
                    s1.push(str1.charAt(i));
                }
                else{
                        while (!s1.isEmpty()) {
                            System.out.print(s1.stack[s1.top]);
                            s1.pop();
                        }
                        System.out.print(" ");
                }
                
    
        }
        while (!s1.isEmpty()) {
            System.out.print(s1.stack[s1.top]);
            s1.pop();
                }
    }
}



/*
import java.util.*;

class MyJava {
    int top = -1;
    final int capacity = 10;
    String stack[] = new String[100];

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }

    public void push(String word) {
        if (!isFull()) {
            stack[++top] = word;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            top--; // Decrement top
        } else {
            System.out.println("Stack is empty");
        }
    }
}

class Stacks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        MyJava s1 = new MyJava();

        System.out.println("Enter a string:");
        String input = sc.nextLine(); // Read the whole line

        String[] words = input.split(" "); // Split the input string into words

        // Push each word onto the stack
        for (String word : words) {
            s1.push(word);
        }

        // Pop and print words from the stack
        while (!s1.isEmpty()) {
            System.out.print(s1.stack[s1.top] + " "); // Print each word separated by a space
            s1.pop();
        }
    }
} 
*/

