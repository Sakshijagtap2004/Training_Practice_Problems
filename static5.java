class Static{
  static int i = 10;
  public static void show(){
    System.out.println(i);

  }
  static{
    show();
  }
  public static void main(String[] args){
    i++;
    System.out.println(i);
  }
}
/*static5.java:8: error: non-static method show() cannot be referenced from a static context
    show();
    ^
1 error*/