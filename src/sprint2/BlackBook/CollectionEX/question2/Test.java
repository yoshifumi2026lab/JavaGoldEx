package sprint2.BlackBook.CollectionEX.question2;

/**
 * 要点
 * ・左辺の型引数を指定しないとraw type（生型）になる。
 * ・右辺で型引数を指定しても、
 * 左辺がraw typeなら取得した値はObject型として扱われる。
 */
public class Test {
    public static void main(String[] args) {
        // raw type 生データ raw type = ジェネリクスの型引数を指定せずに使う古い形式
        Value v = new Value("Hello");
        Object a = v.getVal();
    }
}
