package task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueValues {

    public static Set<String> getUniqueValues(List<String> list) {
        Set<String> uniqueValues = new HashSet<>(list);
        return uniqueValues;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana");
        list.add("apple");
        list.add("grape");

        Set<String> uniqueValues = getUniqueValues(list);

        System.out.println("Unique Values:");
        for (String value : uniqueValues) {
            System.out.println(value);
        }
    }
}