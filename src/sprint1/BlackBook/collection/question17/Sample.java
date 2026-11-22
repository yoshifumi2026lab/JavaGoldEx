package sprint1.BlackBook.collection.question17;

import java.util.Arrays;
import java.util.List;

import sprint1.BlackBook.collection.question16.Item;

public class Sample {
    // 数字 → Integer.compare(o1, o2)
    // 文字列 → o1.compareTo(o2)
    public static void main(String[] args) {
        Item a = new Item("apple", 100);
        Item b = new Item("orange", 120);
        Item c = new Item("banana", 80);

        List<Item> list = Arrays.asList(a, b, c);

        list.sort(new ItemNameComparator());

        list.forEach(System.out::println);
    }
}
