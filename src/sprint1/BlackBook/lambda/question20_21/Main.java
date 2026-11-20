package BlackBook.lambda.question20_21;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    // 一律処理 元の値は変更するが、型そのものは変更しない
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        UnaryOperator<String> unaryOperator = x -> x.toUpperCase();
        list.replaceAll(unaryOperator);

        // replaceAllがUnaryOpertor型の引数を受け取る
        list.replaceAll(x -> x.toUpperCase());
        for (String str : list) {
            System.out.println(str);
        }

        // 下記を短く記載しているだけlist.replaceAll(x -> x.toUpperCase())
        UnaryOperator<String> operator = new UnaryOperator<String>() {

            @Override
            public String apply(String x) {
                return x.toUpperCase();
            }
        };

        list.replaceAll(operator);
    }
}
