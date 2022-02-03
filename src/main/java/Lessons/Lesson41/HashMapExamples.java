package Lessons.Lesson41;

import java.util.HashMap;

public class HashMapExamples {
    public static void main(String[] args) {
      /*  HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "One");
        System.out.println(hashMap);
        hashMap.put("2", "Two");
        System.out.println(hashMap);
        hashMap.put("1","Two");
        System.out.println(hashMap);*/


        HashMap<Integer, String> passports = new HashMap<>();

        passports.put(123456, "Andriy");
        passports.put(123457, "Ilia");
        passports.put(123458, "Xan");
        passports.put(123459, "Trish");

        System.out.println(passports);

        passports.remove(123458);

        System.out.println(passports);
        System.out.println(passports.get(123456));

        for (Integer passNum : passports.keySet()) {
            if (passNum == 123456) {
                passports.remove(passNum);
            }
        }

        System.out.println(passports);

    }
}
