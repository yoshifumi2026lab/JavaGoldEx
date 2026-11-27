package sprint2.BlackBook.CollectionEX.question5;

public class Main {
    public static void main(String[] args) {
        Test<A> testA = new Test<>();
        Test<B> testB = new Test<>();
        Test<D> testD = new Test<>(); // ※DはBを継承しており、BはAを継承しているため可能
        // Test<C> testC = new Test<>(); 継承関係なし コンパイルエラー
        // Test<X> testX = new Test<>(); 親クラス コンパイルエラー
        testA.execute(new A());
        testA.execute(new B()); // A型の引数にBを渡せるため ポリモーフィズム

        // testB.execute(new A()); コンパイルエラー
        testB.execute(new B());
        testD.execute(new D());
    }
}
