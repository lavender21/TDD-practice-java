public class Dollar {
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }
    public boolean equals(Dollar dollar){
        return amount == dollar.amount;
    }
    int amount;
}
