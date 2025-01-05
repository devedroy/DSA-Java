package array;

import java.util.HashSet;

public class UniqueElements {
    public static int removeDuplicates(int[] arr,int n) {
        HashSet<Integer> uniqueElements = new HashSet<>();

        for (int i = 0; i< n; i++) {
            uniqueElements.add(i);
        }

        return uniqueElements.size();
    }

    public static void main(String[] args){
        int [] arr = new int[] {1,2,2,3,3,3,4,4,5,5 };
      System.out.println(removeDuplicates(arr, arr.length));
    }
}