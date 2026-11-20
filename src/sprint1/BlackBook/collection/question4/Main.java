package BlackBook.collection.question4;

public class Main {
    public static void main(String[] args) {

        Item<A> ItemA = new Item<A>(new A());
        //ジェネリックスの型パラメータは不変
        //Item<A> ItemA = new Item<B>(new B());

        A a1 = ItemA.getValue();
        System.out.println(a1.getValue()); 
    }
}
