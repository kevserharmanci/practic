package elifH_2806;

import java.util.Scanner;

public class Q07_BMISiniflama {
    public static void main(String[] args) {
        /*
 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
 *
BMI = kilo(kg) /(boy*boy)(cm)
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.

 */
        Scanner scan = new Scanner(System.in);
        System.out.println("boyunuzu cm olarak giriniz");
        double boy=scan.nextDouble()/100;
        System.out.println("kilonuzu kg olarak giriniz");
        double kg=scan.nextDouble();

        double bmi=kg/(boy*boy);

        if (bmi<=20) {
            System.out.println("bmi indexiniz " +bmi+ "oldukca zayıfsınız");
        } else if (bmi<=25) {
            System.out.println("bmi indexiniz " +bmi+ "normal sınırlardasınız");
        }else if (bmi<=30) {
            System.out.println("bmi indexiniz " +bmi+ "sisman kategorisindesiniz");
        }else if (bmi>30){
            System.out.println("bmi indexiniz " +bmi+ "obez grubundasınız");
        }

    }
}
