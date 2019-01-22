public class Cappuccino extends Coffee{
    private double price;

    public Cappuccino(){
        super("Cappuccino", 10.00, CupSize.small);
    }

    public Cappuccino(CupSize size){
        super("Cappuccino", size);
        this.price = setPrice(size);
    }

    public Cappuccino(double price, CupSize size){
        super("Cappuccino", price, size);
    }

    public double setPrice(CupSize size){
        switch(size){
            case small: price = 10.00; break;
            case medium: price = 15.00; break;
            case large: price = 20.00; break;
            default: System.out.println("Choose the correct size");
        }
        return price;
    }

    public void toOrder(){
        System.out.println("You ordered a " + getSize() + " cup of " + getName() + ", you have to pay " + price + " dollars.");
    }
}
