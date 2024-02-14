package be.vdab.taak11Leger;

public class Main {
    public static void main(String[] args) {
        Soldaat semih = new Soldaat("Altuntas");
        Soldaat mustafa = new Soldaat("Bozali");
        Peloton peloton1 = new Peloton(57);
        peloton1.addSoldaat(semih);
        peloton1.addSoldaat(mustafa);

        peloton1.trekTenStrijde();

        System.out.println("-----");

        Soldaat burak = new Soldaat("Yorulmaz");
        Soldaat alex = new Soldaat("Alex");
        Peloton peloton2 = new Peloton(34);
        peloton2.addSoldaat(burak);
        peloton2.addSoldaat(alex);

        peloton2.trekTenStrijde();
        System.out.println("------");

        Leger leger = new Leger();
        leger.addPeloton(peloton1);
        leger.addPeloton(peloton2);

        leger.trekTenStrijde();


    }
}
