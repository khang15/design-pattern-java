package khangna.abstractfactory.address_type;

import khangna.abstractfactory.AddressAbstractFactory;
import khangna.abstractfactory.address_level.Street;
import khangna.abstractfactory.address_level.Ward;

public class CadastralFactory extends AddressAbstractFactory {
    @Override
    public Street createStreet() {
        return new CadastralStreet();
    }

    @Override
    public Ward createWard() {
        return new CadastralWard();
    }
}
