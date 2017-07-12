public class France {
    public France(int amount) {
        this.amount = amount;
    }

    public France times(int multiplier){
        return new France(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        France dollar = (France)o;
        return amount == dollar.amount;
    }

    private int amount;
}
