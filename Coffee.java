public abstract class Coffee {
    private String name;
    private CupSize size;

    public Coffee(String name, CupSize size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public CupSize getSize() {
        return size;
    }

    public abstract double getPrice();

    public void toDrink() {
        System.out.println("A " + size + " cup of " + name + ", " + getPrice() + " dollars.");
    }
}