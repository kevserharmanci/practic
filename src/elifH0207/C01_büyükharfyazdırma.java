package elifH0207;

import java.util.Scanner;

public class C01_büyükharfyazdırma {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin,
        // sonrasinda konsola tam ismini buyuk harfler ile yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi ve soyisminizi giriniz");
        String firstName=scan.nextLine(),lastName=scan.nextLine();//multiple declarations
        String fullName=firstName.concat(" "+ lastName).toUpperCase();
        System.out.println("fullName = " + fullName);

    }
}
