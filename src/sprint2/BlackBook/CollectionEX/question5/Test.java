package sprint2.BlackBook.CollectionEX.question5;
/*
*　要約
*  制限付き型パラメータ
*  Aクラス自身またはAのサブクラス
*  Xの親クラスも不可
*  extendsは「拡張する・継承する」という意味
*  つまり、TはAの機能を引き継いでいる型に限定する
*  A自身とAのサブクラスが指定できる
*/

public class Test<T extends A> {
    public void execute(T t) {
        t.hello();
    }
}
