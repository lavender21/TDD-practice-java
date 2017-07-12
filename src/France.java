public class France extends Money{
    public France(int amount) {
        this.amount = amount;
    }

    public France times(int multiplier){
        return new France(amount * multiplier);
    }
}
