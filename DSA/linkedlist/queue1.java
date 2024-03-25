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

    public void insert(){
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
    public void delete(){
        GetNode ptr1 = head;
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else if(ptr1.next == null){
            head = null;
            System.out.println("Node deleted");
        }
        else{
            head = ptr1.next;
            System.out.println("Node deleted");
        }
    }
    public void display(){
        GetNode ptr = head;
        while(ptr != null){
            System.out.print(ptr.data+"-->");
            ptr = ptr.next;
        }
    }
    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        Scanner sc = new Scanner(System.in);
  while (true) {
            System.out.println("\n1. insert 2. delete 3. display 4.Exit ");
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

