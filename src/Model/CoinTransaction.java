package Model;

public class CoinTransaction extends Transaction {
    private int numOfCoins;

    public CoinTransaction(int transactionID, int amount, Product product,int numOfCoins) {
        super(transactionID, amount, product);
        setNumOfCoins(numOfCoins);
    }

    public int getNumOfCoins() {
        return numOfCoins;
    }

    public void setNumOfCoins(int numOfCoins) {
        this.numOfCoins = numOfCoins;
    }

    @Override
    public String toString() {
        return super.toString()+"\nNum of coins: "+getNumOfCoins()+"\nType : Coin";
    }
}
