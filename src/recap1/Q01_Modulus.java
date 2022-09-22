package recap1;

import java.util.Scanner;

public class Q01_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        // 1. sayıyı 1000 e bolersek  bolum alırız
        //2.sayıyı 100  boler ve kalan alırız modulus ıslemı

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 5 basamaklı bir sayı giriniz :");
        int num=scan.nextInt();

        int ilkIkısayı= num /1000;
        int sonIkısayı= num % 100;// 100 e bolumunden kalanı verır
        int ilkIkitop=(ilkIkısayı/10) + (ilkIkısayı) % 10;
        System.out.println("ilkIkitop :"+ ilkIkitop);
        int sonIkitop= (sonIkısayı/10) + (sonIkısayı) % 10;
        System.out.println("sonIkitop :"+ sonIkitop);
        System.out.println("sayilarin toplami :" + (ilkIkitop+sonIkitop));



    }
}
