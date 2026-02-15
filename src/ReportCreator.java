public class ReportCreator extends ADocumentCreator {
    @Override
    public IDocument create(String message) {
        return new Report(message);
    }
}
