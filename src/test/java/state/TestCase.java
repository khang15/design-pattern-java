package state;

import khangna.state.RealEstate;
import khangna.state.User;
import khangna.state.states.ActiveState;
import khangna.state.states.NotAvailableState;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCase {
    @Test
    public void userPay_withoutLockRealEstate() {
        User user = new User();
        RealEstate realEstate = new RealEstate();

        realEstate.changeState(new ActiveState());

        user.pay(realEstate);

        assertInstanceOf(ActiveState.class, realEstate.getRealEstateState());
    }

    @Test
    public void userPay_lockRealEstate() {
        User user = new User();
        RealEstate realEstate = new RealEstate();

        realEstate.changeState(new ActiveState());

        user.lock(realEstate);
        user.pay(realEstate);

        assertInstanceOf(NotAvailableState.class, realEstate.getRealEstateState());
    }

}
