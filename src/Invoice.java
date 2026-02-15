public class Invoice implements IDocument {
    private String message;

    public Invoice(String message) {
        this.message = message;
    }

    @Override
    public void open() {
        System.out.println("Opened invoice with message:");
        System.out.println(message);
    }
}
