package be.vdab.taak8Observer;

public class Main {
    public static void main(String[] args) {

        FotokopieMachine fotokopieMachine = new FotokopieMachine(123);
        Technieker technieker1 = new Technieker(12);
        Technieker technieker2 = new Technieker(5);

        fotokopieMachine.addObserver(technieker1);
        fotokopieMachine.addObserver(technieker2);
        fotokopieMachine.kopieer(5_000);
        fotokopieMachine.kopieer(5_000);
        fotokopieMachine.kopieer(3000);


    }
}
