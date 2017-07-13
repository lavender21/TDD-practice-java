public class France extends Money{
    public France(int amount,String currency) {
        super(amount,currency);
    }

    public Money times(int multiplier){
        return Money.france(amount * multiplier);
    }
}
