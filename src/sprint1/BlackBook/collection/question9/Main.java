package BlackBook.collection.question9;

public class Main {
    public static void main(String[] args) {
        Test<? super A> a = new Test<A>(new A());
        Test<? super B> b = new Test<B>(new B("メッセージ B"));

        a.setValue(new B("メッセージ B"));
        b.setValue(new C("メッセージ C"));

        B objB =(B) a.getValue();

        System.out.println(objB.getMessageA());
        System.out.println(objB.getMessage());

        B objBsub =(B) b.getValue();

        System.out.println(objBsub.getMessage());
        System.out.println(objBsub.getMessage());

        A aObj = (A)a.getValue();
        B bObj = (B)b.getValue();
    }
}
