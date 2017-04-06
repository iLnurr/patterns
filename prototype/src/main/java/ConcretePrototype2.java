/**
 * Created by ilnur on 06.04.17.
 */
public class ConcretePrototype2 extends Prototype {
    public ConcretePrototype2() {
    }

    public Object clone() throws CloneNotSupportedException {
        return new ConcretePrototype2();
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{}";
    }
}
