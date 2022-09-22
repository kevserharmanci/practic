package ödevpaylasım;

public class kgyiGramacevır {
    public static void main(String[] args) {
        /*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */
        double saat = 5;
        double mil = 5.0;
        double kg = 5;
        cevirme(saat, mil, kg);
    }
    private static void cevirme(double saat, double mil, double kg) {
        System.out.println( saat + " saat "+ saat*3600 + " saniyedir");
        System.out.println( mil + " mil "+ mil*1.6 + " km dir ");
        System.out.println( kg  + " kg "+ kg*1000+ " g dir ");
    }
}

