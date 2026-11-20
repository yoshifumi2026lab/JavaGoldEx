package BlackBook.lambda.question22;

import java.util.function.BinaryOperator;

public class BiSample {
    public static void main(String[] args) {
        // 2つの値を処理して同じ型の結果を戻す処理
        BinaryOperator<String> b = (str, add) -> str.concat(add);
        System.out.println(b.apply("Hello, ", "Lambda"));

        BinaryOperator<Integer> op = OperatorFactory.add();
        System.out.println(op.apply(10, 20));
    }
}

class OperatorFactory {
    public static BinaryOperator<Integer> add() {
        return (a, b) -> a + b;
    }

    public static BinaryOperator<Integer> minus() {
        return (a, b) -> a - b;
    }
}