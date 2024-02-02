/*mport java.util.*;
class Test{
  public static void main(String args [])
  {
    int arr[] = {1,3,2,4};
    int arrs[] = new int[4];
    for (int i=0;i<arr.lenght;i++){
      for (int j=i+1;j<arr.lenght;j++){
        if (arr[i]<arr[j]){
          

          arrs[i]=arr[j];
          break;
        }
        for (int i=0;i<arrs.lenght;i++){
          if(arrs[i]==0){
            arrs[i]=-1;
          }


        }
        System.out.println(Arrays.toString(arrs));
    }}}}*/


import java.util.*;
class NextLarger{
    public static void main(String args[]){
        int arr[] = {1,3,2,4};
        int i,j;
        int narr[] = new int[4];
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    narr[i]=arr[j];
                    break;
                }
            }
        }
        for(i=0;i<narr.length;i++){
            if(narr[i]==0){
                    narr[i]=-1;
            }
        }
        System.out.println(Arrays.toString(narr));
    }
}