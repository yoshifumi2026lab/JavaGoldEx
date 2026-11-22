package sprint2.BlackBook.CollectionEX.question4;

/**
 * 要点
 * ジェネリックスの型パラメータは不変
 * × Item<A> ItemA = new Item<B>(new B());
 * B は A のサブクラス
 * しかし Item<B> は Item<A> のサブクラスではない
 */
public class Main {
    public static void main(String[] args) {
        Item<A> ItemA = new Item<A>();

        A a1 = ItemA.getValue();
        System.out.println(a1.getValue());
    }
}
