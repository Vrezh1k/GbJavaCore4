package Lesson4;

import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phonesForLastName = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phonesForLastName.add(phoneNumber);
        phoneBook.put(lastName, phonesForLastName);
    }

    public ArrayList<String> get(String lastName) {
        return phoneBook.get(lastName);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "89500102066");
        phoneBook.add("Petrov", "89500234662");
        phoneBook.add("Sidorov", "89542346991");
        phoneBook.add("Ivanov", "88005553535");

        System.out.println(phoneBook.get("Petrov"));
    }
}
