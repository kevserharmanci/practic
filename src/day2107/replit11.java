package day2107;

import java.util.Scanner;

public class replit11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        String isim=in.next().toLowerCase();
        String sesliHarfler="a,e,i,o,u";
        char harf=isim.charAt(0);
        if (isim.length()!=1){
            System.out.println("Hatali giris, lutfen harf giriniz");
        }else if(!(harf>='a' && harf<='z')){
            System.out.println("Hatali giris, lutfen harf giriniz");
        }else if(sesliHarfler.contains(isim)){
            System.out.println(harf+" sesli harf");
        }else{
            System.out.println(harf+" sessiz harf");
    }
}
}