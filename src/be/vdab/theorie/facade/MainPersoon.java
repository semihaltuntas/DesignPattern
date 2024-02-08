package be.vdab.theorie.facade;

import java.math.BigDecimal;

public class MainPersoon {
    public static void main(String[] args) {

        var persoon = new Persoon(new Beroepsinkomsten(BigDecimal.valueOf(3_000)), new Rekening());
        if (persoon.getBeroepsinkomsten().getMaandWedde()
                .compareTo(BigDecimal.valueOf(2_500)) >= 0
                && persoon.getRekening().getSaldo().compareTo(BigDecimal.ZERO) > 0
                && persoon.getLeningen().isEmpty()) {
            System.out.println("Goedgekeurd");
        } else {
            System.out.println("Afgekeurd");
        }

        var persoon1 = new Persoon(new Beroepsinkomsten(BigDecimal.valueOf(3_000)), new Rekening());
        var versterker = new LeningVerstrekker();
        if (versterker.isLeningGoedgekeurd(persoon1)) {
            System.out.println("Goedgekeurd");
        } else {
            System.out.println("Afgekeurd");
        }
    }
}
