package Assignment_14;

import java.util.LinkedHashSet;

    public class RemoveDup {
        public static void main(String[] args) {
            String input = "Hello, World!";
            String result = remove(input);
            System.out.println("Original string: " + input);
            System.out.println("after removing duplicates: " + result);
        }

        public static String remove(String input) {

            char[] characters = input.toCharArray();
            LinkedHashSet<Character> character = new LinkedHashSet<>();

            for (char ch : characters) {
                character.add(ch);
            }


            StringBuilder sb = new StringBuilder();
            for (Character ch : character) {
                sb.append(ch);
            }

            return sb.toString();
        }
    }


