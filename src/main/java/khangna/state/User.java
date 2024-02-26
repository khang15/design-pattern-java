package khangna.state;

public class User {
    public void pay(RealEstate realEstate) {
        realEstate.onPay();
    }

    public void lock(RealEstate realEstate) {
        realEstate.onLock();
    }
}
