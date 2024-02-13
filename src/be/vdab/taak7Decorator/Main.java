package be.vdab.taak7Decorator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Arrangement bungalow = new Bungalow();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Barbecue j/n:");
        if ("j".equals(scanner.next())) {
            bungalow = new MetBarbecue(bungalow);
        }

        System.out.println("Fietsen j/n:");
        if ("j".equals(scanner.next())) {
            bungalow = new MetFietsen(bungalow);
        }

        System.out.println("Bungalow taken = " + bungalow.getTaken());
    }
}
