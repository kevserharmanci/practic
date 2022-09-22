package elifH_2806;

import java.util.Scanner;

public class Q06_Scanner {
/*  Problem Tanımı
    Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
    hesaplayan kodu yazınız.
    Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
    Buna göre 2 işçi aynı işi kaç günde yapar?

    Örnek Ekran Çıktısı
     Bir işçi işi kaç günde bitirmektedir? 10
     Toplam kaç işçi çalışacak? 2
    İşin bitme süresi 5 gündür.
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir isci isi kac günde bitirmektedir?");
        double birIscivermeSuresi = scan.nextDouble();
        System.out.println("toplam kac isci calısacak?");
        double isci_Sayısı = scan.nextDouble();
        double cokluBitirmeS = birIscivermeSuresi / isci_Sayısı;
        System.out.println("cokluBitirmeS :" + cokluBitirmeS);

    }


}
