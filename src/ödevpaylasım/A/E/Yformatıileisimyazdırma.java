package ödevpaylasım.A.E;

import java.util.Arrays;

public class Yformatıileisimyazdırma {
    public static void main(String[] args) {
      /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */
        String isim="Ahmet Emin Yılmaz";
        String arr[]=isim.split(" ");
        System.out.println(Arrays.toString(arr));  //[Ahmet, Emin, Yılmaz]
        System.out.println(arr[0].charAt(0) +"."+ arr[1].charAt(0) +"."+ arr[2].charAt(0)+".");  //A.E.Y.
        char ilkHarf=isim.charAt(0);
        char ikinciHarf=isim.charAt(isim.indexOf(" ")+1);
        char ucncHarf=isim.charAt(isim.lastIndexOf(" ")+1);
        String sonuc=""+ilkHarf+"."+ikinciHarf+"."+ucncHarf+".";
        System.out.println(sonuc.toUpperCase());
    }
}
