public class Resume implements IDocument {
    private String message;

    public Resume(String message) {
        this.message = message;
    }

    @Override
    public void open() {
        System.out.println("Opened resume with message:");
        System.out.println(message);
    }
}
