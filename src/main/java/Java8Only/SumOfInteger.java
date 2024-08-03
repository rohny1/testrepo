package Java8Only;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfInteger {
    public static void main(String[] args) {
        int i = 15623;

        int sum = String.valueOf(i).chars()
                .map(Character::getNumericValue)
                .sum();


        System.out.println("Sum of digits: " + sum);
        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

        System.out.println(sumOfDigits);

        int sum1 = IntStream.range(1, 11).sum();

        System.out.println(sum1);
    }

}
