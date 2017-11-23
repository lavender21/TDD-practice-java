
public class Money implements Expression  {

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

    public Expression plus(Money addend){
        return new Sum(this, addend);
    }

    public Money reduce(String to) {
        return this;
    }
    public String toString() {
        return amount + ' ' + currency;
    }
}
