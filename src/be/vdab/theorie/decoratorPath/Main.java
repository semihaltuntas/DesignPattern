package be.vdab.theorie.decoratorPath;

import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        try (var reader = new LineNumberReader(Files.newBufferedReader(
                Path.of("/data/liedje.txt")))) {
            for (String line; (line = reader.readLine()) != null; ) {
                System.out.println(reader.getLineNumber());
                System.out.println(" : ");
                System.out.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
