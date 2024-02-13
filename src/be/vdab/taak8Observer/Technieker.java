package be.vdab.taak8Observer;

public class Technieker implements Observer {
    private final long personeelsNummer;

    public Technieker(long serialNummer) {
        this.personeelsNummer = serialNummer;
    }

    @Override
    public void update(FotokopieMachine fotokopieMachine) {
        System.out.println("Technieker " + personeelsNummer + " noteert onderhoud voor machine" +
                fotokopieMachine.getSeriNummer());
    }
}
