public class Americano extends Coffee{
    private double price;

    public Americano(){
        super("Americano", 8.50, CupSize.small);
    }

    public Americano(CupSize size){
        super("Americano", size);
        this.price = setPrice(size);
    }

    public Americano(double price, CupSize size){
        super("Americano", price, size);
    }

    public double setPrice(CupSize size){
        switch(size){
            case small: price = 8.50; break;
            case medium: price = 12.50; break;
            case large: price = 17.50; break;
            default: System.out.println("Choose the correct size");
        }
        return price;
    }

    public void toOrder(){
        System.out.println("You ordered a " + getSize() + " cup of " + getName() + ", you have to pay " + price + " dollars.");
    }
}
