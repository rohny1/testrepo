package Java8Only;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergingOfArrayAndSort {
    public static void main(String[] args) {
        int[] i1 = new int[]{1,54,787,3,56};
        int[] i2 = new int[]{778,98,4,87,78,34,56,98};
        int[] i3 = IntStream.concat(Arrays.stream(i1),Arrays.stream(i2)).sorted().toArray();
        //int[] i4 = IntStream.concat(Arrays.stream(i1),Arrays.stream(i2)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(i3));
    }
}
