package khangna.abstractfactory;

import khangna.abstractfactory.address_level.Street;
import khangna.abstractfactory.address_level.Ward;

public abstract class AddressAbstractFactory {
    public abstract Street createStreet();
    public abstract Ward createWard();
}
