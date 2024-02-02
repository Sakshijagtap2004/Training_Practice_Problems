class Java {
  public static void main(String args[]){
    String str = "sakshi";
    int len = str.length();
    char str1[] = str.toCharArray();
    for(int i= len-1 ;i>=0;i--){
      System.out.print(str1[i]);
    }
  }
}