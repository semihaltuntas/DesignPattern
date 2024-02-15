package be.vdab.taak3simplefactory;

import javax.swing.*;
import java.math.BigDecimal;

public enum SpeelGoedFactory {
    INSTANCE;

    SpeelGoed kiesSpeelGoed(int leeftijd) {
        switch (leeftijd) {
            case 0, 1, 2, 3, 4, 5 -> {
                return new Pop(BigDecimal.valueOf(15));
            }

            case 6, 7, 8, 9, 10, 11, 12 -> {
                return new Gezelschapsspel(BigDecimal.valueOf(25));
            }

            default -> {
                return new Boekenbon(BigDecimal.valueOf(27));
            }
        }
    }
    //
//  if (leeftijd < 6) {
//        return new Pop(BigDecimal.valueOf(15));
//        }
//        if (leeftijd < 13) {
//        return new Gezelschapsspel(BigDecimal.valueOf(25));
//        }
//        return new Boekenbon(BigDecimal.valueOf(27));
}
