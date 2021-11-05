package Controller;

import Model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public ArrayList<Product> listProduct = new ArrayList<>();
    public ArrayList<Transaction> listTransaction = new ArrayList<>();
    public CoinStorage coinStorage = new CoinStorage(0);
    public VendingMachine vendingMachine = new VendingMachine(listProduct,listTransaction, coinStorage);

    public  VendingMachine GetVendingMachine(){
        return vendingMachine;
    }

    public Product AddNewProduct(String name, int stock, int price, Enum<ProductTypeEnum> type){
        Product newProduct = new Product(name, stock,price,type);
        listProduct.add(newProduct);
        return newProduct;
    }

    public void AddNewTransaction(int amount, Product product, String type, int numOfCoins, String accountNumber){
        int transactionID = listTransaction.size()+1;
        if(type.equalsIgnoreCase("Coin")){
            Transaction newCoinTransaction = new CoinTransaction(transactionID,amount,product,numOfCoins);
            listTransaction.add(newCoinTransaction);
            coinStorage.addTotalCoins(amount* product.getPrice());
            DisperseItem(amount, product);
        } else {
            Transaction newWalletTransaction = new WalletTransaction(transactionID,amount,product,accountNumber);
            listTransaction.add(newWalletTransaction);
            DisperseItem(amount, product);
        }
    }
    public CoinStorage InsertCoin(int newCoins){
        coinStorage.addTotalCoins(newCoins);
        return coinStorage;
    }

    public void RemoveProduct(String name){
        int index = -1;
        for (int i = 0; i < listProduct.size(); i++) {
            Product currProduct = listProduct.get(i);
            if (currProduct.getName().equalsIgnoreCase(name)){
                index = i;
            }
        }

        if(index!=-1){
            listProduct.remove(index);

        }
    }

    public String TapWallet(){
        System.out.println("Masukkan Nomor Account Number");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public void DisperseItem(int amount, Product product){
        int stockNOW = product.getStock();
        stockNOW -= amount;
        product.setStock(stockNOW);
    }

    public ArrayList<Product> getListProduct(){
        return listProduct;
    }

    public void ChooseProduct() {
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println((i + 1) + ". " + listProduct.get(i).getName());
        }
        System.out.println("Masukkan produk: ");
    }

    public void printAllTransaction(){
        System.out.println("===========");
        System.out.println("TRANSACTION");
        System.out.println("===========");
        //Print All Transaction
        for (Transaction transaction : listTransaction) {
            if (transaction instanceof WalletTransaction) {
                System.out.println("Wallet Transaction");
                System.out.println(transaction.toString());
                System.out.println();
            } else {
                System.out.println("Coin Transaction");
                System.out.println(transaction.toString());
                System.out.println();
            }

        }
    }

    public boolean AddStock(String cariBarang, int newStock){
        boolean add = false;
        for (Product product : listProduct) {
            if (product.getName().equalsIgnoreCase(cariBarang)) {
                int stockNow = product.getStock();
                stockNow += newStock;
                product.setStock(stockNow);
                add = true;
            }
        }
        return add;
    }






}
