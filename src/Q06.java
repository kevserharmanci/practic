import java.util.Scanner;

public class Q06 {

      /*

   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/
      public static void main(String[] args) {
          farkinibul();

      }

    private static void farkinibul() {
        Scanner scan=new Scanner(System.in);
        System.out.print("array uzunlugunu giriniz :");
    int uzunluk = scan.nextInt();
    int arr[] = new int[uzunluk];

    for (int i=0; i< uzunluk; i++) {
        System.out.println("arrayin" +(i+1) + ".elemanınızı giriniz :");//i -> oldugunda 0.eleman diyecek
    }


      }
}
