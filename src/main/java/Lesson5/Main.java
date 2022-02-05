package Lesson5;

import com.sun.istack.internal.NotNull;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        App appData = new App();
        appData.load("test.csv");

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));

        appData.save("test-1.csv");
    }
}
