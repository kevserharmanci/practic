package day10_practice.okul_proje;

public class BookClass {
    String adi, yazari;
    int yayinYili;

// class da body icinde sag click->
// Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
//2  ve 3 pm li const olusturun
//main method bu class da olsun
//main method icinde obj leri create edin iki const tu da kullanin
//yazdir isimli method create edin
//ve bu methodlar olusturdugunuz obj leri yazdirin

    public BookClass(String adi, String yazari, int yayinYili) {
        this.adi = adi;
        this.yazari = yazari;
        this.yayinYili = yayinYili;
    }



    public BookClass(String adi, int yayinYili) {
        this.adi = adi;
        this.yayinYili = yayinYili;

    }

    public static void main(String[] args) {
        BookClass obj1=new BookClass("java nedir?",2022);
        BookClass obj2=new BookClass("java nın ozellikleri","MEHMET BULUTLUOZ",2020);
        yazdir(obj1,obj2);
    }

    private static void yazdir(BookClass obj1, BookClass obj2) {
        System.out.println(obj1.adi+" "+obj1.yayinYili);
        System.out.println(obj2.adi+" "+obj2.yazari+" "+obj2.yayinYili);
    }
}
