package khangna.state.states;

import khangna.state.RealEstate;
import khangna.state.RealEstateState;

public class InactiveState implements RealEstateState {
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
        realEstate.changeState(new ActiveState());
        System.out.println("Successfully activated this real estate");
    }
}
