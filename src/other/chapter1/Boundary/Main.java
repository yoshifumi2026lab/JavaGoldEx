package other.chapter1.Boundary;

class Foo<T extends Number>{}
class Bar<T,x extends T>{}

public class Main {
    public static void main(String[] args){
        Foo<Integer> foo = new Foo<>();
        Bar<Number,Double>bar = new Bar();
    }
}
