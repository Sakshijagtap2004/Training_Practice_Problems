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
  public static void main(String [] args){
    MyJava s = new MyJava();
    Scanner sc = new Scanner(System.in); 
    System.out.println("enter the number of nodes want to insert");
    int k = sc.nextInt();
    for (int i=0;i<=k-1;i++){
    s.insert();
    }     
    System.out.println("enter the key");
    int key = sc.nextInt();
    GetNode ptr = head;
    for (int i=0;i<key;i++){
      ptr= ptr.next;
      

    }
    while(ptr != null){
            System.out.print(ptr.data);
            ptr = ptr.next;
        }
        GetNode ptr1 = head;
    for (int i=0;i<key;i++){
      
      System.out.print(ptr1.data);
      ptr1= ptr1.next;

    }
    



  }
}