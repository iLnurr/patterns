public class ConcreteBuilder implements Builder {
    private String title;
    private String name;
    private String part1;
    private Integer part2;

    public ConcreteBuilder(String title, String name) {
        this.title = title;
        this.name = name;
    }

    public Builder buildPart1(String part) {
        this.part1 = part;
        return this;
    }

    public Builder buildPart2(Integer part) {
        this.part2 = part;
        return this;
    }

    public Product getResult() {
        return new Product(title, name, part1, part2);
    }
}
