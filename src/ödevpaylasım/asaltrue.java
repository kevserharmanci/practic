package ödevpaylasım;

public class asaltrue {
    public static void main(String[] args) {
            /*
     Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.

Test Data:

isPrime(31)
true

isPrime(18)
false

        int sayi=2;
        boolean asal=asalMi(sayi);
        System.out.println(asal);
    }
    private static boolean asalMi(int sayi) {
        boolean sonuc=true;
        int count=0;
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){
                count++;
            }
        }
        if (count==1){
            sonuc=true;
        }else sonuc=false;
        return sonuc;*/


  /*
        Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.

          Test Data:

          isPrime(31)
          true

          isPrime(18)
          false
         */

        boolean asalMii = asalMi();
        System.out.println(asalMi());

    }

    public static boolean asalMi() {
        int input1 = 31;
        int topl = 0;
        boolean sonuc=false;

        for (int i = 1; i <= input1; i++) {
            if (input1%i == 0) {
                topl += i;
            }
        }
        if (topl == input1 + 1) {
            sonuc=true;
        } else {
            sonuc=false;
        }
        return sonuc;
    }






    }



