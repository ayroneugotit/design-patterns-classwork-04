public class InvoiceCreator extends ADocumentCreator {
    @Override
    public IDocument create(String message) {
        return new Invoice(message);
    }
}
