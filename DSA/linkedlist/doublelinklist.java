/*class DoubleLinkedList{
    java.util.Scanner s = new java.util.Scanner(System.in);
    class GetNode{
        int data;
        GetNode left,right;
        public GetNode(){
            left = null;
            right = null;
        }
    }
    GetNode head = null;

    public void append(){
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
            while(ptr.right != null){
                ptr = ptr.right;
            }
            ptr.right = newNode;
            System.out.println(data+" is added.");
        }
    }
    public void appendBeg(){
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
            newNode.right = head;
            head.left = newNode;   //
            head = newNode;
            System.out.println(data+" is added.");
        }
    }
    public void appendBet(){
        System.out.print("Enter the data of node after which node has to be inserted: ");
        int num = s.nextInt();
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
            GetNode ptr1 = ptr;
            GetNode ptr2 = ptr.left;
            while(ptr.data != num){
                ptr = ptr.right;
                ptr1 = ptr1.right;
            }
            newNode.right = ptr.left;  
            ptr1.right = newNode;
            System.out.println(data+" is added.");
        }    
    }
    public void delete(){
        GetNode ptr1 = head;
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else if(ptr1.right == null){
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
    public void deleteNode(){
        System.out.print("Enter the data of node to be deleted: ");
        int num = s.nextInt();
        GetNode ptr1 = head;
        GetNode ptr2 = ptr1;
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else if(ptr1.right == null){
            head = null;
            System.out.println("Node deleted");
        }
        else{
            GetNode ptr,prev;
            ptr = head;
            prev=ptr;
            while(ptr.data != num){
                
                ptr = ptr.right;
                prev = ptr;
            }
            ptr.left = null;
            prev.right = null;
            newNode.right = ptr.left;
            newNode.left = prev.right ;

            
            System.out.println("Node Deleted");
        }
    }
    public void deleteBeg(){
        GetNode ptr1 = head;
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else if(ptr1.right == null){
            head = null;
            System.out.println("Node deleted");
        }
        else{
            head = ptr1.right;
            System.out.println("Node deleted");
        }
    }
    public void traverse(){
        GetNode ptr = head;
        while(ptr != null){
            System.out.print(ptr.data+"-->");
            ptr = ptr.right;
        }
    }
    public static void main(String args[]){
        DoubleLinkedList s1 = new DoubleLinkedList();
        while(true){
            System.out.println("\n--------Stack Menu---------");
            System.out.println("1. Apppend (add at end)");
            System.out.println("2. Append (add at begin)");
            System.out.println("3. Append (add after)");
            System.out.println("4. Delete at end");
            System.out.println("5. Delete any node");
            System.out.println("6. Delete at beginning");
            System.out.println("7. Traverse");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");
            int ch = s1.s.nextInt();
            switch(ch){
                case 1: s1.append();
                        break;
                
                case 2: s1.appendBeg();
                        break;

                case 3: s1.appendBet();
                        break;

                case 4: s1.delete();
                        break;

                case 5: s1.deleteNode();
                        break;

                case 6: s1.deleteBeg();
                        break;

                case 7: s1.traverse();
                        break;

                case 8: System.exit(0);
            }
        }
    }
}*/
class DoubleLinkedList{
    java.util.Scanner s = new java.util.Scanner(System.in);
    class GetNode{
        int data;
        GetNode left;
        GetNode right;
        public GetNode(){
            right = null;
            left = null;
        }
    }
    GetNode head = null;
    public void append(){
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
            while(ptr.right != null){
                ptr = ptr.right;
            }
            ptr.right = newNode;
            newNode.left = ptr;
            System.out.println(data+" is added.");
        }
    }
    public void appendBeg(){
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
            newNode.right = head;
            head.left = newNode;
            head = newNode;
            System.out.println(data+" is added.");
        }
    }
    public void appendBet(){
        System.out.print("Enter the data of node after which node has to be inserted: ");
        int num = s.nextInt();
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
            while(ptr.data != num){
                ptr = ptr.right;
            }
            GetNode ptr1 = ptr.right;
            newNode.left = ptr;
            newNode.right = ptr.right;
            ptr.right = newNode;
            ptr1.left = newNode;
            System.out.println(data+" is added.");
        }    
    }
    public void delete(){
        GetNode ptr1 = head;
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else if(ptr1.right == null){
            head = null;
            System.out.println("Node deleted");
        }
        else{
            GetNode ptr,prev;
            ptr = head;
            while(ptr.right != null){
                ptr = ptr.right;
            }
            prev = ptr.left;
            prev.right = null;
            System.out.println("Node deleted");
        }
    }
    public void deleteNode(){
        System.out.print("Enter the data of node to be deleted: ");
        int num = s.nextInt();
        GetNode ptr1 = head;
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else if(ptr1.right == null){
            head = null;
            System.out.println("Node deleted");
        }
        else{
            GetNode ptr,prev,next;
            ptr = head;
            while(ptr.data != num){
                ptr = ptr.right;
            }
            prev = ptr.left;
            next = ptr.right;
            prev.right = next;
            next.left = prev;
            System.out.println("Node Deleted");
        }
    }
    public void deleteBeg(){
        GetNode ptr1 = head;
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else if(ptr1.right == null){
            head = null;
            System.out.println("Node deleted");
        }
        else{
            GetNode next = ptr1.right;
            head = ptr1.right;
            next.left = null;
            System.out.println("Node deleted");
        }
    }
    public void traverse_r(){
        GetNode ptr = head;
        while(ptr != null){
            System.out.print(ptr.data+"-->");
            ptr = ptr.right;
        }
    }
    public void traverse_l(){
        GetNode ptr = head;
        while(ptr.right != null){
            ptr = ptr.right;
        }
        while(ptr != null){
            System.out.print(ptr.data+"-->");
            ptr = ptr.left;
        }
    }
    public static void main(String args[]){
        DoubleLinkedList s1 = new DoubleLinkedList();
        while(true){
            System.out.println("\n--------LinkedList Menu---------");
            System.out.println("1. Apppend (add at end)");
            System.out.println("2. Append (add at begin)");
            System.out.println("3. Append (add after)");
            System.out.println("4. Delete at end");
            System.out.println("5. Delete any node");
            System.out.println("6. Delete at beginning");
            System.out.println("7. Traverse Right");
            System.out.println("8. Traverse Left");
            System.out.println("9. Exit");
            System.out.println("Enter your choice: ");
            int ch = s1.s.nextInt();
            switch(ch){
                case 1: s1.append();
                        break;
                
                case 2: s1.appendBeg();
                        break;

                case 3: s1.appendBet();
                        break;

                case 4: s1.delete();
                        break;

                case 5: s1.deleteNode();
                        break;

                case 6: s1.deleteBeg();
                        break;

                case 7: s1.traverse_r();
                        break;

                case 8: s1.traverse_l();
                        break;

                case 9: System.exit(0);
            }
        }
    }
}