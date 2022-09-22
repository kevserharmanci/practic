package praktic0507;

public class ebobekok {
    public static void main(String[] args) {
        int ebob=0;
        int sayi1=40;
        int sayi2=30;
        for (int i = 1; i <= sayi1; i++) {
            if (sayi1%i==0&&sayi2%i==0){
                ebob=i;
            }
        }
        System.out.println(sayi1+" ve "+sayi2+" icin GCD = "+ebob);
        int ekok=0;
        int max=sayi1*sayi2;
        for (int i = max; i > 0 ; i--) {
            if (i%sayi1==0&&i%sayi2==0){
                ekok=i;
            }
        }
        System.out.println(sayi1+" ve "+sayi2+" icin LMC = "+ekok);
        // ebob kısmı
        /*
          //veerilen bir pozitif tam sayinin
        //pozitif tam bolenlerini yazdiralim
        int input1 = 20;
        int input2 = 30;
        int sonuc = 0;
        int ebob = 0;
        if (input1==0 || input2==0){
            System.out.println("Lutfen sifirdan buyuk bir sayi giriniz");
        }else if (input1 <= input2) {
            for (int i = 1; i <= input1; i++) {
                if (input1 % i == 0 && input2 % i == 0) {
                    ebob = i - sonuc;
                }
            }
            System.out.println("ebob("+input1+","+input2+") = "+ebob);
        }else if (input1>input2){
            for (int i = 1; i <= input2; i++) {
                if (input1 % i == 0 && input2 % i == 0) {
                    ebob = i - sonuc;
                }
            }
            System.out.println("ebob("+input1+","+input2+") = "+ebob);
         */

    }
}
