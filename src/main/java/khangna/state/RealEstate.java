package khangna.state;

public class RealEstate {
    private Long id;

    private RealEstateState realEstateState;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void changeState(RealEstateState realEstateState) {
        this.realEstateState = realEstateState;
    }

    public void onPay() {
        this.realEstateState.onPay(this);
    }

    public void onActive() {
        this.realEstateState.onActivate(this);
    }

    public void onDeactivate() {
        this.realEstateState.onDeactivate(this);
    }

    public void onLock() {
        this.realEstateState.onLock(this);
    }

    public void onUnlock() {
        this.realEstateState.onUnlock(this);
    }
}
