package Java8Only;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String string = "HKHDFDFDKJKYDSFDJJDSDFJKHDDFFJJKF";
        Map<Character,Long> list =string.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(list);

    }
}
