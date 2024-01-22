import java.util.Iterator;
import java.util.TreeSet;

public class Marka implements Comparable<Marka> {
    private int id;
    private String name;
    private static int idCounter = 1;

    private static TreeSet<Marka> markaList = new TreeSet<>();

    public Marka(String name) {
        this.id = idCounter++;
        this.name = name;
    }

    public Marka() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static {
        markaList.add(new Marka("Samsung"));
        markaList.add(new Marka("Lenovo"));
        markaList.add(new Marka("Apple"));
        markaList.add(new Marka("Huawei"));
        markaList.add(new Marka("Casper"));
        markaList.add(new Marka("Asus"));
        markaList.add(new Marka("HP"));
        markaList.add(new Marka("Xiaomi"));
        markaList.add(new Marka("Monster"));
        System.out.println();

    }

    @Override
    public int compareTo(Marka o) {
        return this.name.compareTo(o.getName());

    }

    public void printMarka() {

        for (Marka marka : markaList) {
            System.out.println("- " + marka.getName());

        }
    }
}


// DESCENDİNG ile tersten ascending ile normal sıralama

/* Iterator<Marka> descendingIterator = markaList.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next().getName());
        } */