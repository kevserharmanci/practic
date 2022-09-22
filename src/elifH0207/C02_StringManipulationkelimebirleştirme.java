package elifH0207;

import java.util.Scanner;

public class C02_StringManipulationkelimebirleştirme {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
//yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 1. kelimeyi giriniz");
        String str1=scan.nextLine();
        System.out.println("lütfen 2. kelimeyi giriniz");
        String str2=scan.nextLine();
        System.out.println("1.yöntem: "+ str1+" "+str2);
        System.out.println("2.yöntem: "+str1.concat(" ")+str2);
        System.out.println(str1.substring(1)+ " "+str2.substring(1));
        //2.cozum
        String str1index=str1.substring(1);
        String str2index=str2.substring(1);
        System.out.println("işlem sonrası birlesim: "+ str1index+""+str2index);

    }
}
