public class ResumeCreator extends ADocumentCreator {
    @Override
    public IDocument create(String message) {
        return new Resume(message);
    }
}
