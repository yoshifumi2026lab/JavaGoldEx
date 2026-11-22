package sprint1.BlackBook.collection.question16;

public class Item implements Comparable<Item> {
    private String name;
    private int price;

    public Item(String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Item other) {
        if (this.price < other.price) {
            return -1;
        }
        if (other.price < this.price) {
            return 1;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + price + "]";
    }
}
