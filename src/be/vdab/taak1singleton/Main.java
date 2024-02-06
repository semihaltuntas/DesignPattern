package be.vdab.taak1singleton;

public class Main {
    public static void main(String[] args) {
        try{
            Versnellingsbak.INSTANCE.hoger();
            Versnellingsbak.INSTANCE.hoger();
            Versnellingsbak.INSTANCE.hoger();
            Versnellingsbak.INSTANCE.hoger();
            Versnellingsbak.INSTANCE.hoger();

            Versnellingsbak.INSTANCE.lager();
            Versnellingsbak.INSTANCE.lager();
            Versnellingsbak.INSTANCE.lager();
            Versnellingsbak.INSTANCE.lager();


        }catch (VerkeerdeVersnellingException ex){
            System.out.println("verkeerde versnelling !");
        }
    }
}
