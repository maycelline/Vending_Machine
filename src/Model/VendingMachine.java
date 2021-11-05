package Model;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Product> products;
    private ArrayList<Transaction> transactions;
    private CoinStorage coinStorage;

    public VendingMachine(ArrayList<Product> products, ArrayList<Transaction> transactions, CoinStorage coinStorage) {
        setProducts(products);
        setTransactions(transactions);
        setCoinStorage(coinStorage);
    }

    public CoinStorage getCoinStorage() {
        return coinStorage;
    }

    public void setCoinStorage(CoinStorage coinStorage) {
        this.coinStorage = coinStorage;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "VendingMachine" +
                "\nproducts= " + getProducts() +
                "\ntransactions= " + getTransactions() +
                "\ncoin storage= " + getCoinStorage().getTotalCoins()
                ;
    }
}
