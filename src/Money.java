
abstract public class Money {

    protected int amount;

    static Dollar dollar(int amount){
        return  new Dollar(amount);
    }

    static France france(int amount){
        return new France(amount);
    }

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object o) {
        Money money = (Money)o;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

}
