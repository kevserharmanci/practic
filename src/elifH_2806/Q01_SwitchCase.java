package elifH_2806;

import java.util.Locale;

public class Q01_SwitchCase {
    public static void main(String[] args) {
 /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
        String gun = "sali";
        gun=gun.toLowerCase(Locale.forLanguageTag("Tr"));


        switch (gun) {
            case "pazartesi":
            case "sali":
                System.out.println("java dersi");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("Sql dersi");
                break;
            default:
                System.out.println("izin günü");
        }


    }
}
