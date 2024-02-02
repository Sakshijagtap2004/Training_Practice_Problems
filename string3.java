class Test{
  public static void main (String args[]){
    Test t1 = new Test();
    Test t2 = new Test();
    System.out.println(t1==t2);
    String str1 ="Ashish";
    String str2 ="Ashish";
    System.out.println(str1==str2);
    String s1 = new String ("helpcode");
    String s2 = new String ("helpcode");
    System.out.println(s1==s2);
  }

}