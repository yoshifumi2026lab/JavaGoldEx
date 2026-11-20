package BlackBook.lambda.question1;

public class Sample {
    public static void main(String[] args) {
        // 中カッコなし 処理１つ
        // 戻り値あり ※return省略
        Function f1 = (name) -> "hello," + name;
        // 引数１の場合は()省略
        Function f2 = name -> "hello," + name;

        // 中カッコあり 複数処理
        // 戻り値ありreturn必要
        Function f3 = (name) -> {
            System.out.println("文字数" + name.length());
            String message = "hello," + name;
            return message;
        };
    }

    private static interface Function {
        String test(String name);
    }
}
