public abstract class Product {
    private int id;
    private double price;
    private double discountRate;
    private int stock;
    private String name;
    private String brandName;
    private String memo;
    private String scrSize;

    public Product(int id, double price, double discountRate, int stock, String name, String brandName, String memo, String scrSize) {
        this.id = id;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.name = name;
        this.brandName = brandName;
        this.memo = memo;
        this.scrSize = scrSize;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getScrSize() {
        return scrSize;
    }

    public void setScrSize(String scrSize) {
        this.scrSize = scrSize;
    }
}
