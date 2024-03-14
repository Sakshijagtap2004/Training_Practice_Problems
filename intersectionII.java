import java.util.*;

class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    a.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        // Convert ArrayList to array of Integer type
        Integer[] array = a.toArray(new Integer[0]);
        // Convert Integer array to int array
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Intersect obj = new Intersect();
        int[] nums1 = {1, 2, 2, 1}; // i = 1
        int[] nums2 = {2, 2}; // j = 2 , j = 2

        int[] result = obj.intersect(nums1, nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}