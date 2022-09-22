package practic2906;

public class sorusuz3 {
    public static void main(String[] args) {
        String str1 ="$13.99";
        String str2 ="$10.55";
        str1=str1.replace("$","");
        str2=str2.replace("$","");
        double a = Double.parseDouble(str1);
        double b = Double.parseDouble(str2);
        double c = (a+b);
        String d=String.valueOf(c);
        String e="$";
        System.out.println(e.concat(d));
        /////////////////////////////////
        /*
        String str1 ="$13.99";
        String str2 ="$10.55";
        str1=str1.replace("$","");
        str2=str2.replace("$","");
        double a = Double.parseDouble(str1);
        double b = Double.parseDouble(str2);
        double c = (a+b);
        System.out.println("$"+c);
         */

    }
}
