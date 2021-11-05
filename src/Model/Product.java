package Model;

public class Product {
    private String name;
    private int stock;
    private int price;
    Enum<ProductTypeEnum> type;

    public Product(String name, int stock, int price, Enum<ProductTypeEnum> type) {
        setName(name);
        setStock(stock);
        setPrice(price);
        setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Enum<ProductTypeEnum> getType() {
        return type;
    }

    public void setType(Enum<ProductTypeEnum> type) {
        this.type = type;
    }

    public void addStock() {
        this.price+=1;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + getName() + '\'' +
                ", stock=" + getStock() +
                ", price=" + getPrice() +
                ", type=" + getType() +
                '}';
    }
}

