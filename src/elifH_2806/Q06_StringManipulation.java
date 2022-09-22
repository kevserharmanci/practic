package elifH_2806;

import java.util.Locale;
import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz
        Scanner scan=new Scanner(System.in);
        System.out.println("1. degeri giriniz");
        String kelime1=scan.nextLine().toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println("2. degeri giriniz");
        String kelime2=scan.nextLine().toUpperCase(Locale.forLanguageTag("Tr"));
        String kelime3=kelime1.concat(kelime2);
        System.out.println(kelime3);
        String kelime1Gerikln=kelime1.substring(1);
        String kelime2Gerikln=kelime2.substring(1);
        /*
        String kelime4=kelime1.substring(1).concat(kelime2.substring(1));    tek satırda bu sekılde de yazabılırız

         */
        System.out.println(kelime1Gerikln+kelime2Gerikln);


    }
}
