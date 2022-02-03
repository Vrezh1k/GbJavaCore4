package Lessons.Lesson41;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExamples {

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(100);
        integerArrayList.add(123);
        integerArrayList.add(234);
        integerArrayList.add(123);
        integerArrayList.add(12);

        System.out.println(integerArrayList);
        integerArrayList.remove(Integer.valueOf(123));
        System.out.println(integerArrayList);
        integerArrayList.remove(Integer.valueOf(123));
        System.out.println(integerArrayList);

        System.out.println(integerArrayList.size());

        integerArrayList.set(1,999);
        System.out.println(integerArrayList);

        integerArrayList.add(1,888);
        System.out.println(integerArrayList);

        integerArrayList.get(1);

        System.out.println(integerArrayList.contains(new Integer(888)));
        System.out.println(integerArrayList.indexOf(new Integer(888)));

        ArrayList<Integer> integerArrayList1 = new ArrayList<>(Arrays.asList(123,888));
        integerArrayList.removeAll(integerArrayList1);

        System.out.println(integerArrayList);

        integerArrayList.addAll(integerArrayList1);
        System.out.println(integerArrayList);
    }
}
