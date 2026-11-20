package BlackBook.streamApi.question5;

import java.util.Optional;

public class Sample {
    public static void main(String[] args) {
        Optional<String> sample = Optional.of("test");
        // Counsumer型のラムダ式を受け取る
        sample.ifPresent((str) -> System.out.println(str));
    }
}
