package BlackBook.streamApi.question2;

import java.util.Optional;

public class OfTest {
    public static void main(String[] args) {
        Optional<String> smaple = Optional.ofNullable(null);
        // 空のOptinal ⇒ NoSuchElementException
        System.out.println(smaple.get());
    }
}
