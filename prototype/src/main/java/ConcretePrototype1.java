/**
 * Created by ilnur on 06.04.17.
 */
public class ConcretePrototype1 extends Prototype {
    public ConcretePrototype1() {
    }

    public Object clone() throws CloneNotSupportedException {
        return new ConcretePrototype1();
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{}";
    }
}
