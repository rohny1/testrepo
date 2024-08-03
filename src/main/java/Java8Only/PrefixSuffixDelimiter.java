package Java8Only;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixSuffixDelimiter {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Java","SpringBoot","MicroServices","Kafka","Kafka","Java");
        //stringList.stream().collect(Collectors.joining(",","[","]"));
        String joinedString = stringList.stream().collect(Collectors.joining());
        System.out.println(joinedString);
    }
}
