package day08_practice;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList {
    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    public static void main(String[] args) {
        int [] arr ={2,5,-9,45,43,11,8,102,102,47,0};
        int n=3;
        // bir liste olusturalım

        List<Integer>list= new ArrayList<>();
        //listeye elemanları ekleyelım
        for (int each: arr){
            list.add(each);
        }
        List<Integer>maxList= new ArrayList<>();
        // dongu olusturup kullanıcının soyledıgı n e kadar eklenecek fakat bır sayaca ıhtıyac var
        int countsayac=1;
        while (countsayac<=n){
            int max = list.get(0);// list in ilk elemanı max olsun

            for (int i = 0; i <list.size(); i++) {
                if (list.get(i)>max && ! (maxList.contains(list.get(i))) ) {//  listenin herhangi bir elemanı max dan buyukse
                    max=list.get(i);//max artık o eleman olsun


                }

            }
        maxList.add(max);// 102 eklendı
            //list.remove(list.indexOf(max));// max list e ekledıgım sayıyı artık lısteden kaldırıyoruz istersek kodun okunurlugu ıcın
            // yazada bılırız yazmaya da bılırız

            countsayac++;// sayacı artırdık

        }
        System.out.println("Array ın max " + n + "elemani" + maxList );

    }



}
