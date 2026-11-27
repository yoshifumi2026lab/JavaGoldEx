package sprint2.BlackBook.CollectionEX.question5.practice;

public class Test<T extends Animal> {
    public void execute(T value) {
        value.eat();
        // パターンマッチング 型チェックと変数代入を同時に実施
        if (value instanceof Dog dog) {
            dog.bark();
        }
    }
}
