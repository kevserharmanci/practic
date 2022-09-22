package day08_practice;

public class Q09_SurviveMonkey {
    /*
        There is a lonely monkey in the island
        He needs to eat 4 bananas every day
        there are just 165 bananas in that island
        Create following variables and find how many days
        monkey can survive.
        Use do while loop, increment and decrement and if statements
        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;
        */
    // bır adada bır maymun ve 165 adet muz var hergun 4 muz yerse maymun kac gun yasar
    public static void main(String[] args) {
        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;
        do{
            System.out.println( "maymunlar gunde 4 muz yer");
            numberOfBananas-=4;// toplam muzdan 4 azalır
            survivalDays++;// yasadıgı gun sayısını 1 artır
            if (numberOfBananas<4){// 4 den az muz kalırsa
                monkeyAlive=false;// maymun hayatta degıl
                System.out.println("bugun "+ survivalDays + "  .gun muz kalmadı,maymun sızlere omur..");
            }else {
                System.out.println("bugun" + survivalDays + " gun ,maymun halen hayatta...:");
            }
        } while(monkeyAlive);
        System.out.println("toplam yasadıgı gun sayısı :" + (survivalDays-1));
    }
}
