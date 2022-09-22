package day09_practice2507.restourant;

public class müşteri {
    public static void main(String[] args) {

        mutfak menu = new mutfak();
        System.out.println("menu.toString()= " + menu.toString());
        mutfak siparisim = new mutfak("adanakebap", "mercimek", "kunefe", "salgam");
        System.out.println("siparişlerim = " + siparisim);

    }
}
