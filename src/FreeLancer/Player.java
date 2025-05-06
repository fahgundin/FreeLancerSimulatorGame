package FreeLancer;

public class Player {
    public String name;
    public int bit_coins;
    public int exp;

    public void addCoin(int value) {
        this.bit_coins = this.bit_coins + value;
    }
    public void setCoin(int value) {
        this.bit_coins = value;
    }

    public int getCoin(){
        return this.bit_coins;
    }
    public void takeCoin(int value){
        this.bit_coins = this.bit_coins - value;

    }


}