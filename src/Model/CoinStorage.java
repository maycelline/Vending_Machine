package Model;

public class CoinStorage {
    private int totalCoins;

    public CoinStorage(int totalCoins) {
        setTotalCoins(totalCoins);
    }

    public int getTotalCoins() {
        return totalCoins;
    }

    public void setTotalCoins(int totalCoins) {
        this.totalCoins = totalCoins;
    }

    public void addTotalCoins(int newCoins){
        this.totalCoins+=newCoins;
    }

    @Override
    public String toString() {
        return "CoinStorage{" +
                "totalCoins=" + getTotalCoins() +
                '}';
    }
}
