package BlackBook.streamApi.question2;

import java.util.Optional;

public class GetTest {
    public static void main(String[] args) {
        Optional<String> smaple = Optional.empty();
        // 値があればtrue
        if (smaple.isPresent()) {
            System.out.println(smaple.get());
        }
        // 空であればtrue
        if (smaple.isEmpty()) {
            System.out.println("empty");
            return;
        }
        System.out.println(smaple.get());
    }
}
