package BlackBook.streamApi.question1;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<String> result = getFromArry(new String[] { "A", "B", null }, 3);
        if (result.isEmpty()) {
            System.out.println("empty");
            return;
        }
        System.out.println(result.get());
    }

    public static <T> Optional<T> getFromArry(T[] array, int index) {
        if (array == null) {
            return Optional.empty();
        }
        try {
            return Optional.ofNullable(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            return Optional.empty();
        }
    }
}
