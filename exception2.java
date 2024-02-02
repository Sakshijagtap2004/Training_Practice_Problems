class Java{
  public static void main(String args []){
    try{
    int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[2]);
     int c = a/b;
     System.out.println(c);
  }
  catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("result "+(5+3));

  }
  catch (ArithmeticException e) {
    System.out.println("result "+(5+4));

  }catch (NumberFormatException e) {
    System.out.println("result "+(5+5));

  }
  }
}