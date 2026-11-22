package sprint2.BlackBook.CollectionEX.question4;

/**
 * 要点
 * コンストラクタを定義していない場合、
 * コンパイラがデフォルトコンストラクタを用意する。
 *
 * BはAを継承しているため、
 * デフォルトコンストラクタ内で暗黙的にsuper()が呼ばれる。
 */
public class B extends A {
    private String value = "Hello B";

    public String getValue() {
        return value;
    }
}
