package khangna.factory.users;

import khangna.factory.User;

public class Admin implements User {

    @Override
    public void viewPermission() {
        System.out.print("Permissions: User manage");
    }
}
