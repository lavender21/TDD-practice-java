
public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money france(int amount) {
        return new Money(amount, "CHF");
    }

    public Money times(int multiplier){
        return new Money(amount * multiplier,currency);
    }

    protected String currency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount
                && currency().equals(money.currency());
    }

    public Money plus(Money money){
        return new Money(amount+money.amount,currency);
    }
    public String toString() {
        return amount + ' ' + currency;
    }
}
