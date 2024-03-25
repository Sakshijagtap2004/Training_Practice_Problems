import java.util.*;
class MyJava{
  java.util.Scanner s = new java.util.Scanner(System.in);
    class GetNode{
        int data;
        GetNode next;
        public GetNode(){
            next = null;
        }
    }
    static GetNode head = null;

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
    public void deleteNode(int num){
        //System.out.print("Enter the data of node to be deleted: ");
       // int num = s.nextInt();
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
            for (int i =0;i<num;i++){
            //while(ptr.data != num){
                prev = ptr;
                ptr = ptr.next;
            }
            prev.next = ptr.next;
            System.out.println("Node Deleted");
        }
    }
    public void traverse(){
    
    GetNode ptr = head;
    
          while(ptr != null){
            System.out.print(ptr.data+"--->");
            ptr = ptr.next;
          } 
  }
  public static void main(String [] args){
    MyJava s = new MyJava();
    Scanner sc = new Scanner(System.in); 
    System.out.println("enter the number of nodes want to insert");
    int k = sc.nextInt();
    int mid = k/2;
    for (int i=0;i<=k-1;i++){
    s.insert();
    }     
    s.deleteNode(mid);
    s.traverse();


    
    



  }
}