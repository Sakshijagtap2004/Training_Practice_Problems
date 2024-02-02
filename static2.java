class StaticKeyword{
  static int n;
  public static void main (String args[]){
    n = 10;
    System.out.println("value of n:"+n);

  }
}/*static2.java:4: error: non-static variable n cannot be referenced from a static context   
    ^
static2.java:5: error: non-static variable n cannot be referenced from a static context
    System.out.println("value of n:"+n);
                                     ^
2 errors*/