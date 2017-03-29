import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by ilnur on 29.03.17.
 */
public class FactoryTest {
    private Client client;
    private AbstractFactory factory;


    @Before
    public void init(){
        factory = new ConcreteFactory1();
        client = new Client();
        client.createProduct(factory);
    }

    @Test
    public void factory1(){
        assertTrue(client.getFactory() instanceof ConcreteFactory1);
    }

    @Test
    public void productA1(){
        assertTrue("ProductA1".equals(client.getProductA().getTitle()));
    }

    @Test
    public void productB2(){
        assertTrue("ProductB1".equals(client.getProductB().getTitle()));
    }
}
