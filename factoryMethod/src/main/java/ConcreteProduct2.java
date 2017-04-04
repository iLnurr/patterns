/**
 * Created by ilnur on 04.04.17.
 */
public class ConcreteProduct2 implements Product {
    private String title;

    public ConcreteProduct2(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "ConcreteProduct2{" +
                "title='" + title + '\'' +
                '}';
    }
}
