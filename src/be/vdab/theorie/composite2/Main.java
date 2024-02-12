package be.vdab.theorie.composite2;

public class Main {
    public static void main(String[] args) {

        Line line = new Line();

        Circle circle = new Circle();

        Picture picture = new Picture();

        picture.add(line);
        picture.add(circle);

        picture.draw();
    }
}
