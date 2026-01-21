import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};

        int[] c = new int[a.length + b.length];

        int k = 0;
        for (int x : a) c[k++] = x;
        for (int x : b) c[k++] = x;

        Arrays.sort(c);

        System.out.println("Merged sorted array:");
        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}
