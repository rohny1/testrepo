package Java8Only;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingAscDesc {
    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
        decimalList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

        Integer arr[] = {99, 55, 203, 99, 4, 91 };
        //Arrays.parallelSort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        Arrays.stream(arr).forEach(System.out::println);

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "");

        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}

