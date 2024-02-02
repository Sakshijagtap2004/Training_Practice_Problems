class Static{
  static{
    System.out.println("i am static block1");
  }
  static{
    System.out.println("i am static block2");
  }
  public static void main(String[] args){
        System.out.println("i am main");

  }
  static{
        System.out.println("i am static block2");

  }
}