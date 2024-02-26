package khangna.state.states;

import khangna.state.RealEstate;
import khangna.state.RealEstateState;

public class LockState implements RealEstateState {
    @Override
    public void onLock(RealEstate realEstate) {
        System.out.println("Permission");
    }

    @Override
    public void onPay(RealEstate realEstate) {
        realEstate.changeState(new NotAvailableState());
        System.out.println("Successfully pay this real-estate");
    }

    @Override
    public void onUnlock(RealEstate realEstate) {
        realEstate.changeState(new ActiveState());
        System.out.println("Successfully unlock this real-estate");
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
