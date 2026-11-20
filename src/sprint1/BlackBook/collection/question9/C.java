package BlackBook.collection.question9;

public class C extends B {

    private String message;

    public C(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public void hello() {
        System.out.println("C");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
