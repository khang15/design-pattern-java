package khangna;

import khangna.state.RealEstate;
import khangna.state.User;
import khangna.state.states.ActiveState;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        User user2 = new User();

        RealEstate realEstate = new RealEstate();
        realEstate.changeState(new ActiveState());

        user.lock(realEstate);
        user.pay(realEstate);
        user2.pay(realEstate);
    }
}