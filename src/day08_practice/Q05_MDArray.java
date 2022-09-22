package day08_practice;

public class Q05_MDArray {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        int arr[] []= {{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        System.out.println("elemanSayisi(arr) = " + elemanSayisi(arr));

    }

    private static int elemanSayisi(int[][] arr) {
        int sayac =0;
        for (int i = 0; i <arr.length ; i++) { //outer for
            for (int j = 0; j < arr[i].length ; j++) { // inner for
                sayac++;
            }
        }
            return sayac;
        }
    }

