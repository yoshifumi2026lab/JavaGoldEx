package sprint2.BlackBook.CollectionEX.question3;

import java.util.ArrayList;
import java.util.List;

/**
 * 要点
 * 型変数 型を受け取るための仮の名前 T
 * 型引数 実際に指定する型 String
 * 重要：クラス宣言時には型変数を <T> で宣言する必要がある。
 * <> だけでは型変数を宣言できない。
 */
public class Main {
    public static void main(String[] args) {
        // 変数への代入
        Value<String> value = new Value<>("Hello");

        List<String> testList = test();
        // メソッド呼び出しの引数
        execute(new ArrayList<>());

    }

    private static List<String> test() {
        // メソッドの戻り値
        return new ArrayList<>();
    }

    // メソッド呼び出しの引数
    private static void execute(List<String> list) {
        System.out.println(list);
    }
}
