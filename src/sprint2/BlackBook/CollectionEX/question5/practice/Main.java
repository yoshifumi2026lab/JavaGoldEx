package sprint2.BlackBook.CollectionEX.question5.practice;

public class Main {
    public static void main(String[] args) {
        Test<Animal> animal = new Test<>();
        // Test<Car> car = new Test<>(); Animalを継承なし コンパイルエラー
        animal.execute(new Animal());
        animal.execute(new Dog()); // ポリモーフィズム Animalのインスタンス生成している
    }
}
