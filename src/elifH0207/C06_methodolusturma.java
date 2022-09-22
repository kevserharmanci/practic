package elifH0207;

import java.util.Scanner;

public class C06_methodolusturma {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true
         * degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str = scan.nextLine().toLowerCase();
        xyzVarmi(str);
        System.out.println(xyzVarmi(str));
    }

    public static boolean xyzVarmi(String str) {
        if (str.contains("xyz")) {
            return true;
        } else {
            return false;
            //2.cozum
            /*
              String str="asxyzsdf";

    String result=xyzYazdir(str);
}

public static String xyzYazdir(String str) {

    if (str.contains("xyz")){
        System.out.println("True");

    }else {
        System.out.println("false");
    }
    return str;
             */
        }

    }
}
