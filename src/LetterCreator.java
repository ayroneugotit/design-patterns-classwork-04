public class LetterCreator extends ADocumentCreator {
    @Override
    public IDocument create(String message) {
        return new Letter(message);
    }
}
