import java.util.*;
class ArrayListDemo2
{
  public static void main(String [] args){
    ArrayList<String> color_list = new ArrayList<>(4);
    color_list.add("white");
    color_list.add("black");
    color_list.add("Red");
    color_list.add("White");
    System.out.println("color list________________");
    for (int i =0;i<4;i++){
      System.out.println(color_list.get(i).toString());
    }
    ArrayList<String> sample = new ArrayList<>(3);
    sample.add("yellow");
    sample.add("Red");
    sample.add("white");
    color_list.addAll(sample);
    System.out.println("___colorlist__");
    for(int i =0; i< color_list.size();i++)
    {
      System.out.println(color_list.get(i).toString());
    }
  }
}