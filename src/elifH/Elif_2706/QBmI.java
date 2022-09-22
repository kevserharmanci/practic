package elifH.Elif_2706;

import java.util.Scanner;

public class QBmI {
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
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen boyunuzu giriniz");
        double boy= scan.nextDouble();
        boy/=100;
        System.out.println("lutfen kilonuzu giriniz");
        double kilo= scan.nextDouble();
        double bmi=kilo/(boy*boy);


        if (bmi<=20) {
            System.out.println("oldukca zayifsiniz");
        } else if (bmi>20 && bmi<=25) {
            System.out.println("normal sinirlardasiniz");
        } else if (bmi>25 && bmi<=30) {
            System.out.println("Sisman kategorisindesiniz");
        }else {
            System.out.println("Obez grubundasiniz.");
        }








    }
}
