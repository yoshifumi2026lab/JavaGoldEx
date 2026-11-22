package sprint1.BlackBook.collection.question17;

import sprint1.BlackBook.collection.question16.Item;
import java.util.Comparator;

public class ItemNameComparator implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        return a.getName().compareTo(b.getName());
    }
}
