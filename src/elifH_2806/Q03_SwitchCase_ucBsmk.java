package elifH_2806;

import java.util.Scanner;

public class Q03_SwitchCase_ucBsmk {
    public static void main(String[] args) {
        // girilen 3 haneli sayının okunusunu yazı ıle yazdırın
        Scanner scan = new Scanner(System.in);

        System.out.println("3 basamaklı bir sayi giriniz");
        int sayi = scan.nextInt();
        // sayı / ½ 10 birler basamagını verir= sayı%10
        // sayıyı once 10 a bolup sonra bolumu de % 10 yapıcaz  (sayı/10)%10
        // yuzler basamagını bulmak ıcın sayı /100


        int birlerBas = sayi % 10, onlarBas = (sayi / 10) % 10, yuzlerBas = sayi / 100;
        if (sayi > 99 && sayi < 1000) {
            switch (yuzlerBas) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("yuz\t");
                    break;
                case 2:
                    System.out.println("ikiyuz\t");
                    break;
                case 3:
                    System.out.println("ucyuz\t");
                    break;
                case 4:
                    System.out.println("dortyuz\t");
                    break;
                case 5:
                    System.out.println("besyuz\t");
                    break;
                case 6:
                    System.out.println("altıyuz\t");
                    break;
                case 7:
                    System.out.println("yediyuz\t");
                    break;
                case 8:
                    System.out.println("sekizyuz\t");
                    break;
                case 9:
                    System.out.println("dokuzyuz\t");
                    break;

            }


            switch (onlarBas) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("on\t");
                    break;
                case 2:
                    System.out.println("yirmi\t");
                    break;
                case 3:
                    System.out.println("otuz\t");
                    break;
                case 4:
                    System.out.println("kırk\t");
                    break;
                case 5:
                    System.out.println("ellı\t");
                    break;
                case 6:
                    System.out.println("altmıs\t");
                    break;
                case 7:
                    System.out.println("yetmis\t");
                    break;
                case 8:
                    System.out.println("seksen\t");
                    break;
                case 9:
                    System.out.println("doksan\t");
                    break;

            }

            switch (birlerBas) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üc");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("altı");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;

            }}else{
                System.out.println("3 basamaklı sayı giriniz");

            }



    }
}
