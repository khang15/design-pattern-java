package khangna.state.states;

import khangna.state.RealEstate;
import khangna.state.RealEstateState;

public class NotAvailableState implements RealEstateState {
    @Override
    public void onLock(RealEstate realEstate) {
        System.out.println("Permission");
    }

    @Override
    public void onPay(RealEstate realEstate) {
        System.out.println("Permission");
    }

    @Override
    public void onUnlock(RealEstate realEstate) {
        System.out.println("Permission");
    }

    @Override
    public void onDeactivate(RealEstate realEstate) {
        System.out.println("Permission");
    }

    @Override
    public void onActivate(RealEstate realEstate) {
        System.out.println("Permission");
    }
}
