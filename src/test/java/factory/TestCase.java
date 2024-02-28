package factory;

import khangna.factory.User;
import khangna.factory.UserFactory;
import khangna.factory.UserType;
import org.junit.jupiter.api.Test;

public class TestCase {
    @Test
    public void testFactory() {
        User user = UserFactory.getUserPermission(UserType.ADMIN);
        user.viewPermission();
    }
}
