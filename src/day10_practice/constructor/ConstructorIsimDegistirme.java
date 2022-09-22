package day10_practice.constructor;

import java.util.Scanner;

public class ConstructorIsimDegistirme {

// class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)

    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin

     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni
     *  bilgileri
     * yazdirsin

     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin

     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak
     *  "soyisim"
      variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini
      istesin ve
      eski soyismi degistirsin.

     * Not :Instance variable'lar object'lere aittir ve diger adi object
     * variable'dir
     */
    String isim;
    String soyIsim;
    public ConstructorIsimDegistirme(String isim, String soyIsim) {
        this.isim = isim;
        this.soyIsim = soyIsim;
    }

    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        ConstructorIsimDegistirme obj1=new ConstructorIsimDegistirme("Ali","Veli");
        System.out.println("obje olustuktan sonra "+obj1.isim+" "+obj1.soyIsim);
        isimDegistir(obj1.isim, obj1.soyIsim );
        System.out.println("isimdegistirden sonra "+obj1.isim);
        System.out.println("isimdegistirden sonra "+obj1.soyIsim);
        soyIsimDegistir(obj1.soyIsim);
        System.out.println("Soy isim degistirden sonra "+obj1.soyIsim);
    }
    private static void soyIsimDegistir(String soyIsim) {
        System.out.println("Yeni soy ismi giriniz");
        soyIsim=scan.nextLine();
        System.out.println(soyIsim);
    }
    private static void isimDegistir(String isim, String soyIsim) {
        isim="Yusuf";
        soyIsim="Kartal";
        System.out.println(isim);
        System.out.println(soyIsim);

        


}

}






