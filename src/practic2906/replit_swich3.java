package practic2906;

public class replit_swich3 {
    public static void main(String[] args) {
       /*Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
       Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
       Ornek:
       INPUT :
       25
       46
       OUTPUT :
       Numaralarin Toplami:
       71*/
        long sayi1=25;
        long sayi2=1000000010;
        if ((sayi1+sayi2)<1000000000){
            System.out.println("Numaraların toplami:"+(sayi1+sayi2));

        }else System.out.println("OverFlow");


        //long sayi1=999999981;
        //        long sayi2=46;
        //        if (sayi1>999999999 || sayi2>999999999) {
        //            System.out.println("OwerFlow");
        //        } else if ((sayi1+sayi2)>1000000000) {
        //            System.out.println("OwerFlow2");
        //        }else if ((sayi1+sayi2)<1000000000) {
        //            System.out.println("Numaralarin Toplami: "+(sayi1+sayi2));
        //        }

    }
}
