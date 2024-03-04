package khangna.abstractfactory;

import khangna.abstractfactory.AddressAbstractFactory;
import khangna.abstractfactory.address_level.Street;
import khangna.abstractfactory.address_level.Ward;
import khangna.abstractfactory.address_type.CadastralStreet;
import khangna.abstractfactory.address_type.CadastralWard;

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
