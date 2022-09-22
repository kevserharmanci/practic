package day08_practice;

public class Q02_ForEach {
    // String[] list = {"fruits", "vegetables", "meat", "milk"};
// print array with for each loop
// print length of each element

// Part 2:
// Print all the elements from array using for eachLoop
// If an element starts with 'v' then quit the loop



// String[] liste = {"meyveler", "sebzeler", "et", "süt"};
// her döngü için diziyi yazdır
// her elemanın uzunluğunu yazdır
// Bölüm 2:
// for eachLoop kullanarak dizideki tüm öğeleri yazdırın
// Bir eleman 'v' ile başlıyorsa döngüden çık
public static void main(String[] args) {
    String[] list = {"fruits", "meat", "milk","vegetables"};
    for (String element:list) {
        System.out.println(element+ ":" + element.length() + " ");
    }
    System.out.println();
    for (String item:list) {
   if (item.startsWith("v")){
       break;
   }
        System.out.println(item);


    }

}
}
