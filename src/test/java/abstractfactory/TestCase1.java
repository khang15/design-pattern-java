package abstractfactory;


import khangna.abstractfactory.AddressAbstractFactory;
import khangna.abstractfactory.AddressFactory;
import khangna.abstractfactory.address_level.Ward;
import org.junit.jupiter.api.Test;

public class TestCase1 {

    @Test
    public void testAbstractFactory() {
        AddressAbstractFactory addressAbstractFactory = AddressFactory.getFactory("crawled");
        Ward ward = addressAbstractFactory.createWard();
        ward.create();
    }
}
