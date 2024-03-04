package khangna.abstractfactory.address_type;

import khangna.abstractfactory.AddressAbstractFactory;
import khangna.abstractfactory.address_level.Street;
import khangna.abstractfactory.address_level.Ward;

public class CrawledFactory extends AddressAbstractFactory {
    @Override
    public Street createStreet() {
        return new CrawlerStreet();
    }

    @Override
    public Ward createWard() {
        return new CrawlerWard();
    }
}
