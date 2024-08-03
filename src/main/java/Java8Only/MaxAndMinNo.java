package Java8Only;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNo {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int max= listOfIntegers.stream().max(Integer::compare).get();
        int min = listOfIntegers.stream().min(Integer::compare).get();
        System.out.println(max);
        System.out.println(min);
        System.out.println("//////////////");
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
