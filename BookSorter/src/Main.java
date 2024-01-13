import java.util.TreeSet;
import java.util.*;
class Kitap implements Comparable<Kitap>{
    private String title;
    private int sayfaSay;
    private String author;
    private String yayinTarihi;

    public Kitap(String title, int sayfaSay, String author, String yayinTarihi) {
        this.title = title;
        this.sayfaSay = sayfaSay;
        this.author = author;
        this.yayinTarihi = yayinTarihi;
    }

    @Override
    public int compareTo(Kitap o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "KİTAPLAR {" +
                "Kitap Başlığı ='" + title + '\'' +
                ", Sayfa Sayısı =" + sayfaSay +
                ", Yazar ='" + author + '\'' +
                ", Yayınlanma Tarihi ='" + yayinTarihi + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSayfaSay() {
        return sayfaSay;
    }

    public void setSayfaSay(int sayfaSay) {
        this.sayfaSay = sayfaSay;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(String yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }
}


public class Main {
    public static void main(String[] args) {
        Set<Kitap> kitapSet = new TreeSet<>();

        kitapSet.add(new Kitap("BLOCKCHAİN", 235, "DARON DEDEOĞLU", "2022"));
        kitapSet.add(new Kitap("Kali Linux", 340, "ABDULAZİZ ALTUNTAŞ", "2017"));
        kitapSet.add(new Kitap("SQL SERVER 2019", 252, "SELÇUK ÖZDEMİR", "2020"));
        kitapSet.add(new Kitap("VERİ YÖNETİMİ", 225, "ASİL MUTLU", "2018"));
        kitapSet.add(new Kitap("Algoritma ve Programlama Mantığı", 300, "H.BURAK TUNGUT", "2021"));

        for (Kitap kitap : kitapSet) {
            System.out.println(kitap);
        }
        Set<Kitap> kitapSayfaSay = new TreeSet<>(Comparator.comparingInt(Kitap::getSayfaSay));
        kitapSayfaSay.addAll(kitapSet);

        System.out.println("\nKitaplar Sayfa sayısına göre sırala: ");
        for (Kitap kitap : kitapSayfaSay) {
            System.out.println(kitap);
        }
        // BİR YERDE HATA VAR REVERSEORDER DÜZGÜN ÇALIŞTIRAMADIM.
        Set<Kitap> kitapSayfaSayAzalt = new TreeSet<>(Comparator.reverseOrder());
        kitapSayfaSayAzalt.addAll(kitapSet);



        /*System.out.println("\nKitaplar Sayfa sayısına göre sırala: Çoktan > Azalt ");
        for (Kitap kitap : kitapSayfaSayAzalt) {
            System.out.println(kitap);*/
        }

    }
