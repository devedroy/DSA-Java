package array;

//REF: https://www.naukri.com/code360/problems/ninja-and-the-second-order-elements_6581960

public class Second {

    private static int findSecondLargest(int n, int[] a) {
        int largest = a[0];
        int sLargest = Integer.MIN_VALUE;

        for(int i = 1; i < a.length; i++) {
            if(a[i] > largest) {
                sLargest = largest;
                largest = a[i];
            }
            if(a[i] != largest && a[i] > sLargest) {
                sLargest = a[i];
            }
        }
        return sLargest;
    }

    private static int findSecondSmallest(int n, int[] a) {
        int smallest = a[0];
        int sSmallest = Integer.MAX_VALUE;

        for(int i = 1; i < a.length; i++) {
            if(a[i] < smallest) {
                sSmallest = smallest;
                smallest = a[i];
            }
            if(a[i] != smallest && a[i] < sSmallest) {
                sSmallest = a[i];
            }
        }
        System.out.println("Second smallest:"+smallest);
        return sSmallest;
    }

    public static int[] getSecondOrderElements(int n, int []a) {
        int sLargest = findSecondLargest(n, a);
        int sSmallest = findSecondSmallest(n, a);

        return new int[] {sLargest, sSmallest};
    }

    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        int[] result = getSecondOrderElements(arr.length, arr);
      System.out.println(result[0] +" "+ result[1]);
    }
}