package elifH_2806;

public class dolar {
    public static void main(String[] args) {
        //Str seklinde verilen asagidaki fiyatlarin toplamini bulunuz
        //String str1="$13.99"
        //String str2="$10.55"
        //ipucu: Double.parseDouble() methodunu kullanabilirsiniz.
        /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space
    \\S   ==> space disindaki hersey  */
        String str1 ="$13.99";
        String str2 ="$10.55";
        str1=str1.replace("$","");
        str2=str2.replace("$","");
        double a = Double.parseDouble(str1);
        double b = Double.parseDouble(str2);
        System.out.println("$"+(a+b));
    }

}
