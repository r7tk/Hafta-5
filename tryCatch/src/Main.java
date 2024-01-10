import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(10);
        arrayList.add("ELMA");
        arrayList.add("ARMUT");
        arrayList.add("PORTAKAL");
        arrayList.add("KİWİ");
        arrayList.add("MUZ");
        arrayList.add("ANANAS");
        arrayList.add("KARPUZ");
        arrayList.add("ANTEP FISTIK");
        arrayList.add("KABAK ÇEKİRDEĞİ");
        arrayList.add("SİYAH ÇEKİRDEK");
        arrayList.add("FASULYE");
        arrayList.add("ÜZÜM");

        //System.out.println(arrayList);

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Lütfen indis giriniz");
            int indeks = scanner.nextInt();
            try {
                System.out.println(arrayList.get(indeks));
            }catch (IndexOutOfBoundsException e){
                System.out.println("Girdiğiniz veriler indeks kapasitesini aşıyor");
            }
        }
    }
}