package BlackBook.streamApi.question7;

import java.util.Optional;

public class MapTest {
    public static void main(String[] args) {
        Optional<String> sample = Optional.ofNullable(null);
        // インスタンスが空の場合、新たに空のOptionalのインスタンスを生成
        Optional<String> result = sample.map(str -> str.toUpperCase(null));
        System.out.println(result.isEmpty());
    }
}
