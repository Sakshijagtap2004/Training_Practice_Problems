class Static{
  static int n;
static{
  n++;
  System.out.println(n);
}
public static void main(String[] args){
  n++;
  System.out.println(n);
}
}