package bromans;

public class Dollar {

    protected int amount;

    Dollar(int amount){
        this.amount = amount;
    }
    
    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

}
