package be.vdab.theorie.simplefactory;

public class MainSimpleFactory {
    public static void main(String[] args) {
        var factory = new DocumentFactory();
        var document = factory.open("liedje.docx");
        var document1 = factory.open("vluegel.xlsx");
        document.printPreview();
        document.print();

        document1.printPreview();
        document1.print();

        System.out.println("--Met Singleton--");
        var documentSingleton = DocumentFactoryEnum.INSTANCE.open("liedje.pptx");
        documentSingleton.printPreview();
        documentSingleton.print();

    }
}
