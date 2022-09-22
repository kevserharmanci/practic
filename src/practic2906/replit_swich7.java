package practic2906;

public class replit_swich7 {
    public static void main(String[] args) {

        // 2 kelime oluşturun: isim1 ve isim2

// isim1 çift sayıda karakter içeriyorsa,

        // ikinci kelimeyi ilk adın ortasına yerleştirin

        // ilk kelime tek sayida karakter iceriyorsa

        // “isim1, isim2 ye eklenemiyor” yazdırın

        // Örneğin:
        // isim1= mehmet
        // isim2= ahmet
        // Yazdır ==> mehahmetmet

        // isim1= memet
        // isim2= ahmet
        // Yazdır ==> isim1, isim2 ye eklenemiyor
        String isim1="mevlüt";
        String isim2="java";
        //ıkıye bolumunu bulmak için % yapmalıyız
        //metinden substring ile metin alıyoruz fakat yarısını alabılmek ıcın length /2 yapıyoruz
        //daha sonra isim2 yı eklıyoruz daha sonra ısım1 ın dıger yarısını almak ıcın
        //substring kullanıp ıcıne length ile isim1 in geriye kalan yarısını yazdırıyoruz.
        if(isim1.length()%2==0){
            System.out.println(isim1.substring(0,isim1.length()/2)+isim2+isim1.substring(isim1.length()/2,isim1.length()));

        }else {
            System.out.println("isim1, isim2 ye eklenemiyor");
        }


    }
}
