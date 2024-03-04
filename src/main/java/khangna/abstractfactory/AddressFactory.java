package khangna.abstractfactory;

import khangna.abstractfactory.address_type.CadastralFactory;
import khangna.abstractfactory.address_type.CrawledFactory;

public class AddressFactory {
    public static AddressAbstractFactory getFactory(String addressType) {
        switch (addressType) {
            case "crawled":
                return new CrawledFactory();
            case "cadastral":
                return new CadastralFactory();
            default:
                throw new UnsupportedOperationException("This furniture is unsupported ");
        }
    }
}
