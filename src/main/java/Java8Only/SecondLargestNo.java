package Java8Only;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestNo {
    public static void main(String[] args) {
        int[] i = new int[]{1,2,53,76,98,97,57,86};
       int i2 = Arrays.stream(i).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(i2);
    }
}
