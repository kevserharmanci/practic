package day09_practice2507;

public class BatchConstructor {
    /*
    burda obje creat edıcez
    methodcall yapıcaz
    calıstırıcaz
     */
    // obje olustur
    public static void main(String[] args) {
        Batch batch = new Batch();
        System.out.println("batch.str1= " + batch.str1);
        batch.batch();// method call yaptık
// bu class da oynama yapmaya gerek kalmadan batch class ında degısıklık yaparız
    }
}
