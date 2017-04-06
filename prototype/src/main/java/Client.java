public class Client {
    public static void main(String[] args) {
        PrototypeFactory factory;
        Prototype prototype;

        factory = new PrototypeFactoryImpl(new ConcretePrototype1());
        prototype = factory.createPrototype();
        System.out.println(prototype);

        factory = new PrototypeFactoryImpl(new ConcretePrototype2());
        prototype = factory.createPrototype();
        System.out.println(prototype);
    }
}
