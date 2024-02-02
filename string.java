class StringDemo
{
  public static void main(String args []){
    //to add something
    String str = " I Love Java ";
    str = str+2;
    System.out.println(str);
    //to check what is the character at that index we use charAt(int Index)
    System.out.println(str.charAt(5));
    System.out.println(str.charAt(3));
    System.out.println(str.charAt(4));
    // to check the length of a string we use lenght()
    System.out.println(str.length());
    // to check the index of particular character we use indexOf(char ch)
    int i = str.indexOf('L');
    System.out.println(i);
    //to lastindex of char
    System.out.println(str.lastIndexOf('L'));
    //to check from what it is start we use startsWith(string str)
    System.out.println(str.startsWith(" i"));
    System.out.println(str.startsWith(" I"));
    System.out.println(str.startsWith(" I Love"));
    //to check from what it is end we have endsWith(string str)
    System.out.println(str.endsWith("a "));
    System.out.println(str.endsWith("Java  "));
    //boolean equals to check whether strings are equal
    String s1 = "Sakshi";
    String s2 = "Jagatap";
    boolean b = s1.equals(s2);
    // boolean equal ingnore cases equalsIgnoreCase()
    String s3 = "sakshi";
    boolean b1 = s1.equalsIgnoreCase(s3);
    // trim to trim the white spaces from left and right both
    String s4 = str.trim();
    System.out.println(s4);
    //replace function is to replace the character replace()
    String s5 ="Gungun";
     System.out.println(s5);
     System.out.println(s5.replace("u","i"));
     



  }
}