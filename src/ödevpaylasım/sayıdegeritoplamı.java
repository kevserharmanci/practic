package ödevpaylasım;

public class sayıdegeritoplamı {
    public static void main(String[] args) {
        // 1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.
        //Test Data
        // 34
        //Beklenen Çıktı
        //7
        //       *********************************************************************
        int sayi1 = 1234;
        int toplam = 0;
// 2 basamaklı olan ıcın for daha dınamık olsun dersek do..
        /*for (int i = 0; i < sayi1; i++) {
            toplam += sayi1 % 10;
            sayi1 = sayi1 / 10;
            if (sayi1 == 0) break;
            {

            }
        }
        System.out.println("toplam = " + toplam);*/

        do {
            toplam += sayi1 % 10;
            sayi1 = sayi1 / 10;
        } while (sayi1 > 0);
        System.out.println("toplam = " + toplam);
    }
}
