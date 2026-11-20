package BlackBook.lambda.question10;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {
    // 引数を受け取り、その値を使用して処理だけ実施
    // ※結果は戻さない
    // Consumer(消費者)
    public static void main(String[] args) {
        Consumer<String> func = str -> {
            System.out.println("Hello" + str);
        };
        // accept (受け取る)
        func.accept("Java");

        // 引数を２つ受け取る
        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> bi = (k, v) -> map.put(k, v);
        // メソッド参照
        BiConsumer<String, Integer> b2 = map::put;

        bi.accept("apple", 3);
        bi.accept("orange", 2);

        System.out.println(map);
    }
}
