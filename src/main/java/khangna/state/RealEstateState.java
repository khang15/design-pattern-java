package khangna.state;

public interface RealEstateState {

    public void onLock(RealEstate realEstate);
    public void onPay(RealEstate realEstate);
    public void onUnlock(RealEstate realEstate);

    public void onDeactivate(RealEstate realEstate);

    public void onActivate(RealEstate realEstate);

}
