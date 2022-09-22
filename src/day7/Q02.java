package day7;

import com.sun.tools.javac.Main;

public class Q02 {
    public static void main(String[] args) {
        /*String[][] sayilar = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};
        double dolar = 0;
        double euro = 0;
        double toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (sayilar[i][j].contains("$")) {
                    String dolardanKurtul = sayilar[i][j].replace("$", "");
                    Double dolarCarpan = Double.parseDouble(dolardanKurtul);
                    dolar += 3.2 * dolarCarpan;
                } else if (sayilar[i][j].contains("€")) {
                    String eurodanKurtul = sayilar[i][j].replace("€", "");
                    Double euroCarpan = Double.parseDouble(eurodanKurtul);
                    euro += 4.2 * euroCarpan;
                }
            }
        }
        toplam=dolar+euro;
        System.out.println(dolar+ " $ "+ euro+ " € "+ toplam+ "= tl dir.");
     */
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        String [][] arr = {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        double toplam =0;
        for (int i = 0; i < 3; i++) { //outer for
            for (int j = 0; j < 3; j++) { //inner for
                if(arr[i][j].contains("$")){ //$ isareti iceriyorsa
                    toplam+=Double.parseDouble(arr[i][j].replace("$",""))*3.2;
                    //parantez icindeki replaceAll methodu ile $ isaretlerinden kurtulduk, sonra elimizde "12" var(data type :String)
                    //Double toplam variable ile isleme katmak icin data casting yapmak gerekir, bu yuzden Double.parseDouble() methodunu kullandik
                    //bu asamada 12 degeri -> data type :Double oldu, eklerken de 3.2 ile carpmamizi şistedigi icin carptik
                }else{
                    toplam+=Double.parseDouble(arr[i][j].replace("€",""))*4.2;
                }
            }
        }
        System.out.println("toplam = " + toplam); //374.6


    }
}
