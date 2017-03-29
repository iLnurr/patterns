public class Client {
    private AbstractFactory factory;
    private AbstractProductA productA;
    private AbstractProductB productB;

    public Client() {
    }

    public void createProduct(AbstractFactory aFactory){
        setFactory(aFactory);
        setProductA(aFactory.createProductA());
        setProductB(aFactory.createProductB());
    }

    public AbstractFactory getFactory() {
        return factory;
    }

    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }

    public AbstractProductA getProductA() {
        return factory.createProductA();
    }

    public void setProductA(AbstractProductA productA) {
        this.productA = productA;
    }

    public AbstractProductB getProductB() {
        return productB;
    }

    public void setProductB(AbstractProductB productB) {
        this.productB = productB;
    }

    public static void main(String[] args) {
        Client client = new Client();

        client.createProduct(new ConcreteFactory1());
        AbstractFactory factory1 = client.getFactory();
        AbstractProductA productA1 = client.getProductA();
        AbstractProductB productB1 = client.getProductB();
        System.out.println(factory1.toString() + " " + productA1 + " " + productB1);

        client.createProduct(new ConcreteFactory2());
        AbstractFactory factory2 = client.getFactory();
        AbstractProductA productA2 = client.getProductA();
        AbstractProductB productB2 = client.getProductB();
        System.out.println(factory2.toString() + " " + productA2 + " " + productB2);

    }
}
