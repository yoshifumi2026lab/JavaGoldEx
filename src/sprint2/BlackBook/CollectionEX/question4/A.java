package sprint2.BlackBook.CollectionEX.question4;

/**
 * 【コンストラクタと継承の要点】
 *
 * ・コンストラクタ未定義の場合、デフォルトコンストラクタが自動生成される。
 * ・各コンストラクタの先頭には、暗黙的にsuper()が挿入される。
 * ・super()は親クラスの引数なしコンストラクタを呼び出す。
 * ・親クラスに引数なしコンストラクタがない場合、
 * super(引数)を明示的に指定する必要がある。
 * ・子クラスのコンストラクタの引数の有無と、
 * 親クラスのコンストラクタの引数の有無は連動しない。
 */
public class A {
    private String value = "Hello A";

    public A() {
        System.out.println("constructor A");
    }

    public A(String value) {
        System.out.println("With arguments constructor" + value);
    }

    public String getValue() {
        return value;
    }
}
