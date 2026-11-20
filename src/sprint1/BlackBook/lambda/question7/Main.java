package BlackBook.lambda.question7;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // 型パラメータを２つ受け取り１つ目は引数、２つ目は戻り値型
        Function<String, Integer> func = (str) -> {
            return Integer.parseInt(str);
        };
        System.out.println(func.apply("100") * 2);
    }
}
