package practic2906;

import java.util.Scanner;

public class replit_if_Switch1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen  kilonuzu giriniz");
        double kilo =scan.nextDouble();
        System.out.println("lutfen cm cinsinden boyunuzu giriniz");
        int boy =scan.nextInt()/100;
        double vki=kilo/(boy*boy);
        if (vki<=18.5){
            System.out.println("zayıfsınız");
        } else if (vki<=25) {
            System.out.println(" kilonuz idealdir");
        }
        else if (vki<=30) {
            System.out.println("şişmansınız");
        }
        else {
            System.out.println("obez");
        }

    }
}

