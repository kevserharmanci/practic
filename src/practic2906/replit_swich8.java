package practic2906;

public class replit_swich8 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

        Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

                INPUT : Mustafa

        OUTPUT : fafafa*/

        String isim="i";

        if (isim.length()>=2){

            String sonIki=(isim.substring(isim.length()-2));

            System.out.println(sonIki.concat(sonIki).concat(sonIki));
        }else {
            System.out.println("iki harften daha uzun giriniz");
        }

    }
}
