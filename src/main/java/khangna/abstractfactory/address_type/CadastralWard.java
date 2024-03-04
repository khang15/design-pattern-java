package khangna.abstractfactory.address_type;

import khangna.abstractfactory.address_level.Ward;

public class CadastralWard implements Ward {
    @Override
    public void create() {
        System.out.println("Ward from cadastral data");
    }
}
