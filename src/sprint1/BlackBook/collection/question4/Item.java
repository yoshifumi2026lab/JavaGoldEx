package sprint1.BlackBook.collection.question4;

public class Item<T> {
    private T value;

    public Item(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
