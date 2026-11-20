package BlackBook.collection.question7;

public class Sample {
    public static void main(String[] args) {
        Test<?> test = new Test<>("Hello");
        String msg = (String) test.getValue();
        //<?>は型は分からないが、どの型のジェネリッククラスも受け取れるため共通処理に使用
        // test.setValue("Sample");
        // test.setValue(new Object());
        test.setValue(null);         
    }
}
