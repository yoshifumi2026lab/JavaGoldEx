package sprint1.BlackBook.collection.question6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
        // 何かの型のListだよ。でも具体的な型は秘密！
        // 型がわからないから不可
        // list.add("こんにちは");
        Object obj = list.get(0);

        // 何型だったとしても Object では受け取れる
    }

}
