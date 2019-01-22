public abstract class Coffee {
    private String name;
    private double price;
    private CupSize size;

    public Coffee(String name){
        this.name = name;
        this.size = CupSize.small;
        this.price = setPrice(size);
    }

    public Coffee(String name, CupSize size){
        this.name = name;
        this.size = size;
        this.price = setPrice(size);
    }

    public Coffee(String name, double price, CupSize size){
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName(){
        return name;
    }

    public CupSize getSize(){
        return size;
    }

    public double getPrice() { return price; }

    public abstract void toOrder();
    public abstract double setPrice(CupSize size);
}