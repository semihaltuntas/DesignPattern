package be.vdab.taak3simplefactory;

import java.math.BigDecimal;

public enum SpeelGoedFactory {
    INSTANCE;

    SpeelGoed kiesSpeelGoed(int leeftijd) {
        if (leeftijd < 6) {
            return new Pop(BigDecimal.valueOf(15));
        }
        if (leeftijd < 13) {
            return new Gezelschapsspel(BigDecimal.valueOf(25));
        }
        return new Boekenbon(BigDecimal.valueOf(27));
    }
}
