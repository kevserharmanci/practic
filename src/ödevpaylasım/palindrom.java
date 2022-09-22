package ödevpaylasım;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        /*
     Bir palindrom, madam veya racecar veya 10801 sayısı gibi
     ileriye doğru geriye doğru okuyan bir kelime, sayı,
      kelime öbeği veya diğer karakter dizisidir.
Girilecek kelimenin palindrom olup olmadığını
doğrulayacak bir Java Kodu yazın.
Test Data:
madam
Beklenen Çıktı:
True
     */
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen polindrom halini ogrenmek istediginiz ifadeyi giriniz");

        StringBuilder str=new StringBuilder(scan.nextLine().toLowerCase());

        StringBuilder strReverse=new StringBuilder(str.reverse());

        if (str.equals(strReverse)){
            System.out.println(str+" ifadesi polindromdur");
        }else {
            System.out.println(str+" ifadesi polindrom degildir");
        }

    }
}
