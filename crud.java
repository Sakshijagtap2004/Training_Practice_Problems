import java.util.*;
class Student{
  int rollno [] = new int[10];
  String name [] = new String[10];
  String city [] = new String [10];
  String mob [] = new String [10];
  int j = 0;
  Scanner sc = new Scanner(System.in);
  public void inputData(){
    System.out.println("enter roll no :");
    rollno[j] = sc.nextInt();
    System.out.println("enter name :");
    name[j] = sc.next();
    System.out.println("enter city :");
    city[j] = sc.next();
    System.out.println("enter mob no :");
    mob[j] = sc.next();
    ++j;

  } 
  public void showInfo(){
    System.out.println(" Roll no\tName\tCity\tmobile number");
    System.out.println(" ----------------------------------------------");
    for (int k=0;k<j;k++){
    System.out.println(rollno[k]+"\t\t"+name[k]+"\t"+city[k]+"\t"+mob[k]);

    }


  }
  public void deleteInfo(){
    System.out.println("Enter your roll no: ");
       int r = sc.nextInt();
        for(int e=0;e<=j;e++){
          if(r==rollno[e]){
            int loc = e;
            for(int i=loc; i<j ; i++){
            rollno[i] = rollno[i+1];
            name[i] = name[i+1];
            city[i] = city[i+1];
            mob[i] = mob[i+1];
            }
        }}
        --j;
        System.out.println("Data deleted");

    
  }
  public void updateData(){
    System.out.println("enter roll no.:");
    int rno = sc.nextInt();
    for (int i=0; i<rollno.length;i++){
      if (rno==rollno[i]){
       System.out.println(" roll no.:"+rollno[i]); 
       System.out.println(" Name.:"+name[i]); 
       System.out.println(" select choice to update");
       System.out.println(" 1. name 2. city 3. mob:");
       int ch = sc.nextInt();
       switch(ch){
        case 1: System.out.println(" eneter new name"); 
        String sname = sc.next();
        name[i]=sname;
        System.out.println("data updated");
        break;
        case 2: System.out.println(" eneter new city"); 
        String scity = sc.next();
        name[i]=scity;
        System.out.println("data updated");
        break;
        case 3: System.out.println(" eneter new mob"); 
        String smob = sc.next();
        name[i]=smob;
        System.out.println("data updated");
        break;
       } 
      }
    }
    
  }
  
}
class Java {
  public static void main(String[] args) {
    Student s = new Student();
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("1. Input Data 2.Show Data 3.Delete Student 4. Update data 5.exit ");
      System.out.println("enter your choice");
      int n = sc.nextInt();
      switch(n){
        case 1: s.inputData();
                break;
        case 2: s.showInfo();
                break;
        case 3: s.deleteInfo();
                break;
        case 4: s.updateData();
                break;
        case 5: System.exit(0);
      }
    }



    }
  
}