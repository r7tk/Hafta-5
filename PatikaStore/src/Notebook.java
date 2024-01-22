import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Notebook extends Product implements IOperation {
    Scanner scanner = new Scanner(System.in);


    public Notebook(int id, double price, double discountRate, int stock, String name, String brandName, String memo, String scrSize) {
        super(id, price, discountRate, stock, name, brandName, memo, scrSize);

    }


    public Notebook() {

    }

    @Override
    public void runMenu() {
        System.out.println();
        System.out.println("Notebook Yönetim Paneli");
        System.out.println("1 - Notebook Ekleme ");
        System.out.println("2 - Notebook Silme ");
        System.out.println("3 - ID'ye Göre Filtreleme ");
        System.out.println("4 - Markaya Göre Filtreleme ");
        System.out.println("5 - Notebook Listeleme ");
        System.out.println("0 - Çıkış");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        System.out.println();

        switch (scanner.nextInt()){
            case 0 :
                break;
            case 1:
                addProduct();
                break;
            case 2:
                deleteProduct();
                break;
            case 3:
                filterByProductId();
                break;
            case 4:
                filterByProductBrand();
                break;
            case 5:
                showProductList();
                break;
        }
    }







    @Override
    public void showProductList() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterByProductId() {

    }

    @Override
    public void filterByProductBrand() {

    }
}
