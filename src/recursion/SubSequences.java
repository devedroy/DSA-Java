package recursion;

import java.util.*;

public class SubSequences {
    public static void printSubSequences(int[] arr, int idx, ArrayList<Integer> holder) {

        if (idx >=  arr.length) {
            for (int i : holder) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        holder.add(arr[idx]);
        printSubSequences(arr, idx + 1, holder);
        holder.removeLast();
        printSubSequences(arr, idx + 1, holder);
    }

    public static List<List<Integer>> returnSubSequences(int[] arr, int idx, List<Integer> holder, List<List<Integer>> result) {

        if (idx >=  arr.length) {
            result.add(new ArrayList<>(holder));
        } else {
            holder.add(arr[idx]);
            returnSubSequences(arr, idx + 1, holder,result);
            holder.removeLast();
            returnSubSequences(arr, idx + 1, holder, result);
        }

        return result;
    }



    public static void main(String[] args){
        List<List<Integer>> result = returnSubSequences(new int[]{3, 1, 2}, 0, new ArrayList<>(), new ArrayList<>());

        for (List<Integer> list: result) {
            for (int i: list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}