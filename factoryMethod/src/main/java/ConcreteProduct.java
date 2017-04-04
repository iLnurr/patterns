public class ConcreteProduct implements Product{
    private String title;

    public ConcreteProduct(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "ConcreteProduct{" +
                "title='" + title + '\'' +
                '}';
    }
}
