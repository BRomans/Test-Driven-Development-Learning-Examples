package bromans;

public interface Expression {

    Money reduce(Bank bank, String to);
}
