/**
 * Created by ilnur on 06.04.17.
 */
public class PrototypeFactoryImpl implements PrototypeFactory {
    private Prototype prototype;

    public PrototypeFactoryImpl(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype createPrototype() {
        try{
            return (Prototype) prototype.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
