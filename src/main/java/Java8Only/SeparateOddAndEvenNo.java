package Java8Only;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SeparateOddAndEvenNo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,35,65,88,90,66,45,34,43,87,187,226);
        integerList.stream().filter(i->i%2==0).forEach(System.out::println);

        //first ten even numbers
        IntStream.rangeClosed(1,10).map(i->i*2).forEach(System.out::println);
    }
}
