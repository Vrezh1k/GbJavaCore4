package Lessons.four;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String[] numbers = {"One", "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "One", "Two", "Three"};

        HashMap<String, Integer> uniqueNumbers = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (uniqueNumbers.containsKey(numbers[i])) {
                uniqueNumbers.put(numbers[i], uniqueNumbers.get(numbers[i]) +1);
            } else {
                uniqueNumbers.put(numbers[i], 1);
            }
        }

        System.out.println(uniqueNumbers);
    }
}
