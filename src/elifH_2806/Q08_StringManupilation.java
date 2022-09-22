package elifH_2806;

import java.util.Locale;
import java.util.Scanner;

public class Q08_StringManupilation {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scan.nextLine().toLowerCase(Locale.forLanguageTag("Tr"));
        String sonIkiHarf=kelime.substring(kelime.length()-2);
        if (kelime.length()>=3){
            System.out.println(sonIkiHarf+sonIkiHarf+sonIkiHarf);
        }else System.out.println(kelime);
    }
}
