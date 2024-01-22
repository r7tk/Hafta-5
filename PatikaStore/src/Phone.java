import java.util.ArrayList;
import java.util.Scanner;

public class Phone extends Product implements IOperation {


    private int camera;
    private int battery;
    private String color;

    static ArrayList<Phone> phoneList = new ArrayList<>();


    public Phone(int id, double price, double discountRate, int stock, String name, String brandName, String memo, String scrSize, int camera, int battery, String color) {
        super(id, price, discountRate, stock, name, brandName, memo, scrSize);
        this.camera = camera;
        this.battery = battery;
        this.color = color;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    static {
        phoneList.add(new Phone(1,14000,5,20,"Galaxy S5","Samsung","256 GB","6.7 inç",32,4000,"Uzay gri"));
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Phone() {

    }

    @Override
    public void runMenu() {
        System.out.println("Phone Yönetim Paneli");
        System.out.println("1 - Phone Ekleme ");
        System.out.println("2 - Phone Silme ");
        System.out.println("3 - ID'ye Göre Filtreleme ");
        System.out.println("4 - Markaya Göre Filtreleme ");
        System.out.println("5 - Phone Listeleme ");
        System.out.println("0 - Çıkış");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");

        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 0:
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

        //@Override


        @Override
        public void showProductList () {
            System.out.println();
        }

        @Override
        public void addProduct () {
            Phone newPhone = new Phone();

            System.out.println("Yeni Phone Ekleme Paneli");
            System.out.print("Ürün ID'si: ");
            int id = new Scanner(System.in).nextInt();
            newPhone.setId(id);

            System.out.print("Ürün Adı: ");
            String name = new Scanner(System.in).next();
            newPhone.setName(name);

            System.out.print("Ürün Fiyatı: ");
            double price = new Scanner(System.in).nextDouble();
            newPhone.setPrice(price);

            System.out.print("İndirim Oranı: ");
            double discountRate = new Scanner(System.in).nextDouble();
            newPhone.setDiscountRate(discountRate);

            System.out.print("Stok: ");
            int stock = new Scanner(System.in).nextInt();
            newPhone.setStock(stock);

            System.out.print("Ürün Markası: ");
            String brandName = new Scanner(System.in).next();
            newPhone.setBrandName(brandName);

            System.out.print("Ürün Notu: ");
            String memo = new Scanner(System.in).next();
            newPhone.setMemo(memo);

            System.out.print("Ekran Boyutu: ");
            String scrSize = new Scanner(System.in).next();
            newPhone.setScrSize(scrSize);

            System.out.print("Kamera: ");
            int camera = new Scanner(System.in).nextInt();
            newPhone.setCamera(camera);

            System.out.print("Battery: ");
            int battery = new Scanner(System.in).nextInt();
            newPhone.setBattery(battery);

            System.out.print("Renk: ");
            String color = new Scanner(System.in).next();
            newPhone.setColor(color);

            phoneList.add(newPhone);
        }

        @Override
        public void deleteProduct () {

        }

        @Override
        public void filterByProductId () {

        }

        @Override
        public void filterByProductBrand () {

        }
    }

