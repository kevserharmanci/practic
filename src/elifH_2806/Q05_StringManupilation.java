package elifH_2806;

import java.util.Locale;
import java.util.Scanner;

public class Q05_StringManupilation {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin,
// sonrasinda konsola tam ismini buyuk harfler ile yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi girin");
        String isim=scan.nextLine().toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println("lütfen soyisminizi girin");
        String soyisim=scan.nextLine().toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println("isim ve soyisminiz :" +isim + " " + soyisim);



    }
}
