package elifH_2806;

public class Q10_nestedifTernery {
    public static void main(String[] args) {
        /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */
     char finalNotu = 'd';
     String result= finalNotu=='A' ? "Gayet basarili"
             : finalNotu=='B' ? "basarili"
             : finalNotu=='C' ? "ha gayret"
             :" digerleri";
        System.out.println("result= " + result);


 if (finalNotu=='A'){
     System.out.println("Gayet basarili");
 }else if ( finalNotu=='B'){
     System.out.println( "basarili");
 }else if (finalNotu=='C') {
     System.out.println("ha gayret");
 } else System.out.println("digerleri");




    }
}
