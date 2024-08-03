package Java8Only;


import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveAndFindDuplicateElement {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Java","SpringBoot","MicroServices","Kafka","Kafka","Java");
        stringList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);


        List<String> duplicates =stringList.stream()
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream()
                        .filter(e->e.getValue()>1)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());
        System.out.println("Duplicate strings: " + duplicates);

        List<Integer> integerList = Arrays.asList(1,3,56,56,45,3,89,54,89,23);
        integerList.stream().distinct().forEach(System.out::println);

        List<Integer> duplicateIntList = integerList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Duplicate Integers"+ duplicateIntList);
        Set<Integer> set = new HashSet<>();
List<Integer> integers = integerList.stream().filter(r->!set.add(r)).collect(Collectors.toList());
        System.out.println("duplicate Int" + integers);


    }
}
