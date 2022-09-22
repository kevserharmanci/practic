package ödevpaylasım;

import java.time.LocalDate;
import java.util.Scanner;

public class artıkyıl {
    public static void main(String[] args) {


        // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız. Artik yili baza alarak yapin
        int ayNumarasi=2;
        int yil=2021;
        /*switch (ayNumarasi){
            case 1: System.out.print("Ocak 31 Gundur");break;
            case 2:
                if ((yil%4==0 && yil%100!=0 ) || (yil%400==0)) {
                    System.out.print("Subat 29 Gundur");
                    break;
                }else System.out.println("Subat 28 Gundur");
                break;
            case 3: System.out.print("Mart 31 Gundur");break;
            case 4: System.out.print("Nisan 30 Gundur");break;
            case 5: System.out.print("Mayis 31 Gundur");break;
            case 6: System.out.print("Haziran 30 Gundur");break;
            case 7: System.out.print("Temmuz 31 Gundur");break;
            case 8: System.out.print("Agustos 31 Gundur");break;
            case 9: System.out.print("Eylul 30 Gundur");break;
            case 10: System.out.print("Ekim 31 Gundur");break;
            case 11: System.out.print("Kasim 30 Gundur");break;
            case 12: System.out.print("Aralik 31 Gundur");break;
            default:break;*/

            Scanner scan=new Scanner(System.in);
            System.out.println("Lutfen ogrenmek istediginiz yili giriniz");
            int yill=scan.nextInt();
            System.out.println("Lutfen ogrenmek istediginiz ay numarasini giriniz");
            int ayy= scan.nextInt();
            LocalDate tarih=LocalDate.of(yill,ayy,1);
            tarih.isLeapYear();
            System.out.println(tarih.isLeapYear());
            switch (ayy){
                case  1: System.out.println(yil+"yili ocak ayi 31 gundur");break;
                case  2: if ((tarih.isLeapYear())) {
                    System.out.println(yill+"yili subat ayi 29 gundur");
                }else System.out.println(yil+"yili subat ayi 28 gundur");;break;
                case  3: System.out.println(yil+"yili mart ayi 31 gundur");break;
                case  4: System.out.println(yil+"yili nisan ayi 30 gundur");break;
                case  5: System.out.println(yil+"yili mayis ayi 31 gundur");break;
                case  6: System.out.println(yil+"yili haziran ayi 30 gundur");break;
                case  7: System.out.println(yil+"yili temmuz ayi 31 gundur");break;
                case  8: System.out.println(yil+"yili agustos ayi 31 gundur");break;
                case  9: System.out.println(yil+"yili eylul ayi 30 gundur");break;
                case  10: System.out.println(yil+"yili ekim ayi 31 gundur");break;
                case  11: System.out.println(yil+"yili kasim ayi 30 gundur");break;
                case  12: System.out.println(yil+"yili aralik ayi 31 gundur");break;
            }
        }
    }

