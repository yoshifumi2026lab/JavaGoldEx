package BlackBook.streamApi.question3;

import java.util.Optional;

public class Sample {
    public static void main(String[] args) {
        Optional<String> sample = Optional.of("A");
        System.out.println(sample.orElse("B"));

        Optional<String> sample2 = Optional.empty();
        // 引数にsuplier型のラムダを受け取る
        System.out.println(sample.orElseGet(() -> "else"));

    }
}
