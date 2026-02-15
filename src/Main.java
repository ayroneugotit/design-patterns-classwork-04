import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Basic usage

        ADocumentCreator reportCreator = new ReportCreator();
        ADocumentCreator resumeCreator = new ResumeCreator();
        ADocumentCreator letterCreator = new LetterCreator();
        ADocumentCreator invoiceCreator = new InvoiceCreator();

        IDocument report = reportCreator.create("Sample report message");
        IDocument resume = resumeCreator.create("Sample resume message");
        IDocument letter = letterCreator.create("Sample letter message");
        IDocument invoice = invoiceCreator.create("Sample invoice message");

        report.open();
        resume.open();
        letter.open();
        invoice.open();

        // Advanced usage

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which document you want to create?");
        System.out.println("[1] - Report");
        System.out.println("[2] - Resume");
        System.out.println("[3] - Letter");
        System.out.println("[4] - Invoice");
        int documentType = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter a message:");
        String documentMessage = scanner.nextLine();

        IDocument document = null;

        switch (documentType) {
            case 1:
                document = reportCreator.create(documentMessage);
                break;
            case 2:
                document = resumeCreator.create(documentMessage);
                break;
            case 3:
                document = letterCreator.create(documentMessage);
                break;
            case 4:
                document = invoiceCreator.create(documentMessage);
        }

        if (document == null) return;
        document.open();
    }
}
