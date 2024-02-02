class Static{
  int i = 10;
  static{
      int i = 10;
    System.out.println(i);
  }

public static void main(String[] args){
  int j = 20;
  System.out.println(j);
}}
/*static3.java:2: error: cannot find symbol
  ing i = 10;
  ^
  symbol:   class ing
  location: class Static
static3.java:4: error: non-static variable i cannot be referenced from a static context   
    System.out.println(i);
                       ^
2 errors*/