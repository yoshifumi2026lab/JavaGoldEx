package BlackBook.lambda.question6;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Supplier(提供者) 引数を受け取らずに何らかの結果だけを戻す
        Supplier<String> func = () -> {
            return "Hello, Lamda";
        };
        System.out.println(func.get());
    }
}
