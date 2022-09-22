package elifH.Elif_2706;

import java.util.Scanner;

public class işcihavuz {
    public static void main(String[] args) {

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

        Scanner scan=new Scanner(System.in);
        System.out.println("isi bitirme süresini giriniz");
        int sure=scan.nextInt();
        System.out.println("isci sayısını giriniz");
        int isci =scan.nextInt();
        int isinBitmeS=sure/isci;
        System.out.println("isin bitme süresi" + isinBitmeS);





    }
}
