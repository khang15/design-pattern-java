package khangna.factory.users;

import khangna.factory.User;

public class Guest implements User {

    @Override
    public void viewPermission() {
        System.out.println("Permissions: View products");
    }
}
