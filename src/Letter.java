public class Letter implements IDocument {
    private String message;

    public Letter(String message) {
        this.message = message;
    }

    @Override
    public void open() {
        System.out.println("Opened letter with message:");
        System.out.println(message);
    }
}
