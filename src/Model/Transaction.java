package Model;

public abstract class Transaction {
    private int transactionID;
    private int amount;
    private Product product;


    public Transaction(int transactionID, int amount, Product product) {
        setTransactionID(transactionID);
        setAmount(amount);
        setProduct(product);
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    @Override
    public String toString() {
        return "\nTransactionID= " + getTransactionID() +
                "\namount= " + getAmount() +
                "\nproduct= " + getProduct().getName() +
                "\nprice= "+ getProduct().getPrice();
    }
}
