package BlackBook.streamApi.question8;

import java.util.Optional;

public class FlatMapTest {
    public static void main(String[] args) {
        Optional<String> a = Optional.of("Test");
        // Optional<Optional<String>>のため型不一致
        // Optional<String> b = a.map(str -> test(str));

        // T → Optional<R>の場合にflatMap
        Optional<String> b = a.flatMap(str -> test(str));
        System.out.println(b.get());
    }

    private static Optional<String> test(String str) {
        return Optional.of(str.toUpperCase());
    }
}
