package Model;

public class WalletTransaction extends Transaction {
    private String accountNumber;

    public WalletTransaction(int transactionID, int amount, Product product, String accountNumber) {
        super(transactionID, amount, product);
        setAccountNumber(accountNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return super.toString() +"account number: "+getAccountNumber()+"\nType : Wallet";
    }
}
