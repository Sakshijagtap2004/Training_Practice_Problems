
import java.util.*;
class SingleLinkedList{
    java.util.Scanner s = new java.util.Scanner(System.in);
    class GetNode{
        int data;
        GetNode next;
        public GetNode(){
            next = null;
        }
    }
    GetNode head = null;

    public void push(){
        System.out.print("Enter the data for new node: ");
        int data = s.nextInt();
        GetNode newNode = new GetNode();
        newNode.data = data;
        if(newNode == null){
            System.out.println("Memory is not available");
        }
        else if(head == null){
            head = newNode;
            System.out.println(data+" is added.");
        }
        else{
            GetNode ptr = head;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = newNode;
            System.out.println(data+" is added.");
        }
    }
    
    public void pop(){
        GetNode ptr1 = head;
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else if(ptr1.next == null){
            head = null;
            System.out.println("Node deleted");
        }
        else{
            GetNode ptr,prev;
            ptr = head;
            prev=ptr;
            while(ptr.next != null){
                prev = ptr;
                ptr = ptr.next;
            }
            prev.next = null;
            System.out.println("Node deleted");
        }
    }

    
    public void traverse(){
        GetNode ptr = head;
        while(ptr != null){
            System.out.println("|"+ptr.data+"|");
            ptr = ptr.next;
        }
    }
    public void peek(){
       GetNode ptr = head;
        while(ptr.next!= null){
            
            ptr = ptr.next;
        }
        System.out.print(ptr.data+"-->");
        
    }
   public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
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
