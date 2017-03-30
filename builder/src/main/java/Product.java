public class Product {
    private String title;
    private String name;
    private String part1;
    private Integer part2;

    public Product(String title, String name, String part1, Integer part2) {
        this.title = title;
        this.name = name;
        this.part1 = part1;
        this.part2 = part2;
    }

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part) {
        this.part1 = part;
    }

    public Integer getPart2() {
        return part2;
    }

    public void setPart2(Integer part2) {
        this.part2 = part2;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", part1='" + part1 + '\'' +
                ", part2=" + part2 +
                '}';
    }
}
