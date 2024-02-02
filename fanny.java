import java.util.*;
class String22{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = s.nextLine();
        s1 = s1.toLowerCase();
        System.out.println("Enter the character to be removed: ");
        char c = s.next().charAt(0);
        int i;
        int l= s1.length();

        String s2 = new String("");
        for(i=0;i<l;i++){
            if(s1.charAt(i)!=c){
                s2 = s2 + s1.charAt(i);
            }
        }
        System.out.println(s2);
    }
}