package be.vdab.regex;

import java.io.PrintStream;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern PATTERN = Pattern.compile("^(\\d{4})-(\\d{4})$");

    public static void main(String[] args) {
        var matcher = PATTERN.matcher("2001-2022");
        if (matcher.matches()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        } else {
            System.out.println("Verkeerd");
        }
    }
}
