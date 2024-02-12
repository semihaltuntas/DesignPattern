package be.vdab.theorie.decorator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var eenvoudig = new EenvoudigeKoffie();
        System.out.println(eenvoudig.getKost());
        System.out.println(eenvoudig.getBereidingswijze());
        System.out.println("---");

        var metMelk = new MetMelk(new EenvoudigeKoffie());
        System.out.println(metMelk.getKost());
        System.out.println(metMelk.getBereidingswijze());
        System.out.println("---");

        var metChocolate = new MetChocolate(new EenvoudigeKoffie());
        System.out.println(metChocolate.getKost());
        System.out.println(metChocolate.getBereidingswijze());
        System.out.println("---");

        var metMelkEnChocolate = new MetSuiker(new MetMelk(new MetChocolate(new EenvoudigeKoffie())));
        System.out.println(metMelkEnChocolate.getKost());
        System.out.println(metMelkEnChocolate.getBereidingswijze());
        System.out.println("---------Ja/Nee Vragen--------------");

        Koffie koffie = new EenvoudigeKoffie();
        var scanner = new Scanner(System.in);
        System.out.print("Melk (j/n):");
        if ("j".equals(scanner.next())) {
            koffie = new MetMelk(koffie);
        }
        System.out.print("Chocolade (j/n):");
        if ("j".equals(scanner.next())) {
            koffie = new MetChocolate(koffie);
        }
        System.out.println("Suiker (j/n):");
        if ("j".equals(scanner.next())) {
            koffie = new MetSuiker(koffie);
        }
        System.out.println(koffie.getKost());
        System.out.println(koffie.getBereidingswijze());
    }

}

