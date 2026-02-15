public class Report implements IDocument {
    private String message;

    public Report(String message) {
        this.message = message;
    }

    @Override
    public void open() {
        System.out.println("Opened report with message:");
        System.out.println(message);
    }
}
