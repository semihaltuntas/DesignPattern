package be.vdab.taak9Strategy;

public class Main {
    public static void main(String[] args) {
        var vervoer = new Vervoer();
        vervoer.doeEenOversteek(()-> System.out.println("Schaatsen over het ijs"));
        System.out.println();
        vervoer.doeEenOversteek(()-> System.out.println("Zeilen over het meer!"));
    }
}
