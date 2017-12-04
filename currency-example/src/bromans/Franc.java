package bromans;

/**
 * Created by Michele Romani on 04/12/2017.
 */
public class Franc extends Money {

    Franc(int amount, String currency){
        super(amount, currency);
    }

    String currency(){
        return currency;
    }

}
