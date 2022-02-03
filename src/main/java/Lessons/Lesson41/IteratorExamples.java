package Lessons.Lesson41;

import java.util.*;

public class IteratorExamples {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 5));

        for (int i =0; i < integerArrayList.size(); i++) {
            if (i ==4) {
                integerArrayList.remove(i);
            }
        }
        System.out.println(integerArrayList);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("test1", 4);
        hashMap.put("test11", 4);
        hashMap.put("test13", 4);
        hashMap.put("test12", 4);

        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            String data = iterator.next().getKey();
            System.out.println(data);

            if (data.equals("test11")){
                iterator.remove();
            }
        }
        System.out.println(hashMap);
    }
}

