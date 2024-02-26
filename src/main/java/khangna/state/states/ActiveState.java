package khangna.state.states;

import khangna.state.RealEstate;
import khangna.state.RealEstateState;

public class ActiveState implements RealEstateState {
    @Override
    public void onLock(RealEstate realEstate) {
        realEstate.changeState(new LockState());
        System.out.println("Lock this real estate successfully");
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
        realEstate.changeState(new InactiveState());
        System.out.println("Deactive this real estate successfully");
    }

    @Override
    public void onActivate(RealEstate realEstate) {

        System.out.println("Permission");
    }
}
