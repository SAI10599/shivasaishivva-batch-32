package Assignment_11;

import java.util.Arrays;
import java.util.List;

public class Vowels {
    public static void main(String[] args) {
        String[] arr = {"shiva", "manohar", "sai", "vamshi"};

        Arrays.stream(arr)
                .filter(str -> str.matches(".*[aeiouAEIOU].*"))
                .forEach(c -> System.out.println(c + " Word with vowels: " + vowelCount(c)));
    }

    public static int vowelCount(String s) {
        String Vo = "aeiou";
        return (int) s.toLowerCase().chars()
                .filter(c -> Vo.contains(Character.toString(c)))
                .count();
    }
}

