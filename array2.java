//duplicate element in an array
class Test{
  public static void main(Stringcargs[]){
    String[] strArray = {"Sakshi","prakruti","Sakshi","Ashish" ,"rahul"};
    for (int i = 0 ;i<strArray.lenght-1;i++){
      for (int j = i+1;j<strArray;j++){
        if(strArray[i].eqauls(strArray[j]))
      }
    }
  }
}