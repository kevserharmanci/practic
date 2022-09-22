package elifH_2806;

public class Q04_NestedIfandTernary {
    public static void main(String[] args) {
        /*
   0 ~ 9 arasındaki sayilari kelimelere cevirebilen bir java programi yazin 4=dört gibi
 , sayı 9'dan buyuk veya sifirdan kucukse,
  cikis "Gecersiz" olmalidir
  NestedIf ve Ternary kullanarak 2 yolla da cozunuz
*/
        int sayi = 0;
        String sonuc = "";// bi string ifadenin ne old bilmedigimde hıclıge atarım
        if (sayi >= 0 && sayi <= 9) {
            if (sayi == 9) {
                sonuc = "dokuz";
            } else if (sayi == 8) {
                sonuc = "sekiz";
            } else if (sayi == 7) {
                sonuc = "yedi";
            } else if (sayi == 6) {
                sonuc = "altı";
            } else if (sayi == 5) {
                sonuc = "bes";
            } else if (sayi == 4) {
                sonuc = "dört";
            } else if (sayi == 3) {
                sonuc = "üc";
            } else if (sayi == 2) {
                sonuc = "iki";
            } else if (sayi == 1) {
                sonuc = "bir";
            } else sonuc = "sıfır";


        } else sonuc = "gecersiz";
        System.out.println("sonuc = " + sonuc);


// ternary
        int n = 10;
        String result = n == 9 ? "dokuz" :
                n == 8 ? "sekiz" :
                        n == 7 ? "yedi" :
                                n == 6 ? "altı" :
                                        n == 5 ? "bes" :
                                                n == 4 ? "dört" :
                                                        n == 3 ? "üc" :
                                                                n == 2 ? "iki" :
                                                                        n == 1 ? "bir" :
                                                                                n==0 ? "sifir":"gecersiz";
        System.out.println("result: " + result);


    }
}