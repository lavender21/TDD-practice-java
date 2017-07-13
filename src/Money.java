
abstract public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount,String currency){
        this.amount = amount;
        this.currency = currency;
    }

    static Dollar dollar(int amount){
        return  new Dollar(amount,"USD");
    }

    static France france(int amount){
        return new France(amount,"CHF");
    }

    abstract Money times(int multiplier);

    protected String currency(){
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money)o;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

}
