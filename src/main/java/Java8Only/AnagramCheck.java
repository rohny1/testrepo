package Java8Only;

import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "Virat is Greatest";
        String s2 = "Greatest is Virat";

        boolean areAnagrams = s1.chars().sorted().mapToObj(c -> (char) c)
                .collect(Collectors.toList())
                .equals(s2.chars().sorted().mapToObj(c -> (char) c)
                        .collect(Collectors.toList()));

        if (areAnagrams) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
