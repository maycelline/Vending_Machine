package View;

import Controller.Controller;
import Model.*;
import java.util.Scanner;

public class MainScreen {
    Controller c = new Controller();
    public MainScreen() {
        Scanner scan = new Scanner(System.in);
        //add Products to vending machine
        Product product1 = c.AddNewProduct("Fanta", 5, 7000, ProductTypeEnum.DRINKS);
        Product product2 = c.AddNewProduct("Coca-cola", 10, 10000, ProductTypeEnum.DRINKS);
        Product product3 = c.AddNewProduct("Nissin", 15, 5000, ProductTypeEnum.FOODS);
        Product product4 = c.AddNewProduct("Beng-beng", 7, 3000, ProductTypeEnum.FOODS);
        Product product5 = c.AddNewProduct("Vaseline Lip Therapy Rose", 34, 34000, ProductTypeEnum.GOODS);
        Product product6 = c.AddNewProduct("Vaseline Lip Therapy Original", 30, 30000, ProductTypeEnum.GOODS);

        System.out.println(c.getListProduct());

        //add Transaction and Disperse Item
        c.AddNewTransaction(3, product1, "Wallet", 0, "AEX7782671");
        c.AddNewTransaction(2, product5, "Coin", product5.getPrice() * 2, "");
        c.AddNewTransaction(3,product3,"coin", product3.getPrice()*3,"");

        //Remove Product
        c.RemoveProduct(product2.getName());


        System.out.println(c.GetVendingMachine());

        int menu;
        do {
            System.out.println("Menu: \n1. Pilih Product\n2. Lihat Transaksi\n3. Add Stock\n4. Lihat daftar Barang");
            menu = scan.nextInt();
            switch (menu){
                case 1:
                    c.ChooseProduct();
                    System.out.println("Masukkan nama barang: ");
                    scan.next();
                    break;
                case 2:
                    c.printAllTransaction();
                    break;
                case 3:
                    System.out.println("Masukkan nama barang: ");
                    String barangAddStock = scan.next();
                    System.out.println("Masukkan jumlah: ");
                    int jumlah = scan.nextInt();
                    boolean added= c.AddStock(barangAddStock, jumlah);
                    if(added){
                        System.out.println("New Stok added");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    System.out.println(c.getListProduct());

            }
        } while (menu!=5);

    }


}
