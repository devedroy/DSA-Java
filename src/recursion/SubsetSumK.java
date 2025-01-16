package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetSumK {
    public static void printSubsetSumK(int[] arr, int k, int idx, int sum, List<Integer> holder) {
        if (idx >= arr.length) {
            if (sum == k) {
                for (int i: holder) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            return;
        }
        holder.add(arr[idx]);
        printSubsetSumK(arr, k, idx + 1, sum + arr[idx], holder);
        holder.removeLast();
        printSubsetSumK(arr, k, idx + 1, sum, holder);
    }

    public static boolean printOnlyOneSubSetSumK(int[] arr, int k, int idx, int sum, List<Integer> holder) {
        if (idx >= arr.length) {
            if (sum == k) {
                for (int i:  holder) {
                    System.out.print(i + " ");
                }
                System.out.println();
                return true;
            }
            return false;
        }

        holder.add(arr[idx]);
        if (printOnlyOneSubSetSumK(arr, k, idx + 1, sum + arr[idx], holder)) {
            return true;
        }
        holder.removeLast();

        if (printOnlyOneSubSetSumK(arr, k, idx + 1, sum , holder)) {
            return  true;
        }

        return false;
    }

    public static int countOfSubSetSumK(int[] arr, int k, int idx, int sum) {
        if (idx >= arr.length) {
            if (sum == k) {
                return 1;
            } else {
                return 0;
            }
        }
        int l = countOfSubSetSumK(arr,k, idx + 1, sum + arr[idx]);
        int r = countOfSubSetSumK(arr,k, idx + 1, sum);
        return l + r;
    }

    public static void main(String[] args){
        int[] arr = new int[] {1,1,1};
        int reqSum = 2;
        ArrayList<Integer> holder = new ArrayList<>();
//      printSubsetSumK(arr, reqSum, 0, 0, holder);
//        printOnlyOneSubSetSumK(arr, reqSum, 0, 0, holder);
        int result = countOfSubSetSumK(arr, reqSum, 0, 0);
        System.out.println(result);
    }
}