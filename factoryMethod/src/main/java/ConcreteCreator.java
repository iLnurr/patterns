/**
 * Created by ilnur on 04.04.17.
 */
public class ConcreteCreator implements Creator {
    public Product factoryMethod() {
        return new ConcreteProduct("product #1");
    }
}
