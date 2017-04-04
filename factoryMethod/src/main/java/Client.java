public class Client {
    public static void main(String[] args) {

        /** create product #1
         */
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        System.out.println(product);

        /** create product #2
         */
        Creator creator2 = new ConcreteCreator2();
        Product product2 = creator2.factoryMethod();
        System.out.println(product2);
    }
}
