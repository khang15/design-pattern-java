package khangna.abstractfactory.address_type;

import khangna.abstractfactory.address_level.Street;

public class CrawlerStreet implements Street {
    @Override
    public void create() {
        System.out.println("Street from crawl data");
    }
}
