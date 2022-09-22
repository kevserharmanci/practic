package praktic0507;

public class tekraredenreplit {
    public static void main(String[] args) {
       /* Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        Input :
        String str=“Javaisalsoeasy”
        Output: a s
         */
        String str = "Java cok guzel guzel";
        String karakter = "";
        String tekrarEden = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            karakter = str.substring(i, i + 1);
            int index = str.indexOf(karakter);// 0
            int sonindex = str.lastIndexOf(karakter);
            if (index != sonindex) {
                if (!(tekrarEden.contains(karakter))) {
                    tekrarEden += " "+karakter;
                }
            }
        }
        System.out.println("tekrar Eden = " + tekrarEden);
    }
}
