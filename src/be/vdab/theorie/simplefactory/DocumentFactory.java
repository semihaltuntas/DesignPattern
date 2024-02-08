package be.vdab.theorie.simplefactory;

public class DocumentFactory {
    Document open(String bestandNaam){
        var extensie = bestandNaam.substring(bestandNaam.length()-4);
        return switch (extensie){
            case "docx"-> new Tekst(bestandNaam);
            case "xlsx"-> new Rekenblad(bestandNaam);
            case "pptx"-> new Presentatie(bestandNaam);
            default -> throw new IllegalArgumentException();
        };
    }
}
