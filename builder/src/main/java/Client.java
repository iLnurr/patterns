/**
 * Created by ilnur on 30.03.17.
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder("titleOfProduct", "nameOfProduct");
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getResult();
        System.out.println(product);
    }
}
