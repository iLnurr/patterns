/**
 * Created by ilnur on 04.04.17.
 */
public class ConcreteCreator2 implements Creator {
    public Product factoryMethod() {
        return new ConcreteProduct2("product #2");
    }
}
