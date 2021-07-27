package Lesson4Hw;

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

    PhoneBook phoneBook = new PhoneBook();
    phoneBook.add("Petrov","89188233223");
    phoneBook.add("Sidorov","89188233465");
    phoneBook.add("Ivanov","89188289756");
    phoneBook.add("Petrov","89189485768");

    System.out.println(phoneBook.get("Petrov"));
}
