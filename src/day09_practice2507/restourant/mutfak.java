package day09_practice2507.restourant;

public class mutfak {


    // ana yemek,arasıcak,tatlı,icecekler
    // parametresız olması ıcın to strıng olusturmalıyız
    public String yemekler ="adanakebap,urfacıger,kusbası,kusleme";
    public String arasıcak ="yaylacorba,mercimek,duguncorba,corba";
    public String tatlilar ="baklava,sutlac,gullac,kazandıbı,kunefe";
    public String içecekler ="ayran,salgam,kola";

    public mutfak() {

    }

    public mutfak(String adanakebap, String mercimek, String kunefe, String salgam) {
      this.yemekler = adanakebap;
      this.arasıcak= mercimek;
      this.tatlilar= kunefe;
      this.içecekler= salgam;



    }

    @Override
    public String toString() {
        return "\nmutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                "\narasıcak='" + arasıcak + '\'' +
                "\ntatlilar='" + tatlilar + '\'' +
                "\niçecekler='" + içecekler + '\'' +
                '}';
    }
}
