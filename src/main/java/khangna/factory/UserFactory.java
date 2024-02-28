package khangna.factory;

import khangna.factory.users.Admin;
import khangna.factory.users.Guest;

public class UserFactory {
    public UserFactory() {};

    public static User getUserPermission(UserType userType) {
        switch (userType) {
            case ADMIN:
                return new Admin();

            case GUEST:
                return new Guest();

            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
