import java.util.*;
class MyJava{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String name[] = new String[5];
        String password[] = new String[5];
        

        for(int i=0;i<5;i++){
          
            name[i]=s.next();
             System.out.println("Enter password: ");
            password[i] = s.next();
        }
        System.out.println("------login---------");
        System.out.println("enter the name :");
        String name1 = s.next();
        System.out.println("enter the password :");
        String pass1 = s.next();

        
    
        boolean flag = false;
        
        for (int i=0; i<5;i++){
          if(name[i].equals(name1) && password[i].equals(pass1) ){
              
              flag = true;
              
          }
        }
        if (flag==true){
          System.out.println("login successful");
          System.exit(0);

        }
        else{
          System.out.println("unsuccessful");
          System.exit(0);

        }


        }}