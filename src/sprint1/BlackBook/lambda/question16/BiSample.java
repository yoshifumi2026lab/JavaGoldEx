package BlackBook.lambda.question16;

import java.util.function.BiPredicate;

public class BiSample {
    public static void main(String[] args) {
        BiPredicate<String, String> b = (str, suffix) -> str.endsWith(suffix);
        System.out.println(b.test("Sample.class", ".class"));
    }
}
