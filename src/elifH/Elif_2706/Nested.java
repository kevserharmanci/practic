package elifH.Elif_2706;

import jdk.swing.interop.SwingInterOpUtils;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
          /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Final notunuzu harf cinsinden giriniz: ");
        char fnl = scan.next().charAt(0);
        String sonuc = (fnl == ('A')) ? ("Gayet Basarili") :
                (fnl == ('B')) ? ("Basarili") :
                        (fnl == ('C')) ? ("Ha gayret") :
                                "Digerleri";
        System.out.println(sonuc);
        //String finalNot="C";
        //          System.out.println (finalNot.equals("A") ? "Gayet Basarili" :
        //                            finalNot.equals("B") ? "Basarili" :
        //                  finalNot.equals("C" ) ?  "Ha gayret" : "gecerli harf giriniz" );
        //Collapse





    }
}
