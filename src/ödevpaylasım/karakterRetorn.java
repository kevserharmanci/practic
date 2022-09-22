package ödevpaylasım;

public class karakterRetorn {
    public static void main(String[] args) {
        // String girildiginde ilk iki karakteri haric string return eden java method ayaziniz ancak
        // ilk karakter g veya ikinci karakter h ise bu karakterleride return edin
        // input kalem output lem
        // input photo output hoto
        String str="goto";
        ilkIkıHaric(str);
        System.out.println(ilkIkıHaric(str));
    }
    private static String ilkIkıHaric(String str) {
        char ilkHarf=str.charAt(0);
        char ikinciHarf=str.charAt(1);
        String str2="";
        if (ilkHarf=='g'){
            str2=ilkHarf+str.substring(2);
        }
        else if (ikinciHarf=='h'){
            str2=ikinciHarf+str.substring(2);
        }
        else if
        (ilkHarf != 'g' || ikinciHarf != 'h'){
            str2 = str.substring(2);
        }
        if (ilkHarf=='g' && ikinciHarf=='h') {
            str2 = str;
        }
        return str2;
    }
    }

