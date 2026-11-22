package sprint1.BlackBook.collection.question9;

public class B extends A {

    private String message;

    public B(String message) {
        super();
        this.message = message;
    }

    @Override
    public void hello() {
        System.out.println("B");
    }

    public String getMessage() {
        return message;
    }
}
