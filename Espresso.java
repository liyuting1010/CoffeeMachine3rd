public class Espresso extends Coffee{
    private double price;

    public Espresso(){
        super("Espresso", 11.50, CupSize.small);
    }

    public Espresso(CupSize size){
        super("Espresso", size);
        this.price = setPrice(size);
    }

    public Espresso(double price, CupSize size){
        super("Espresso", price, size);
    }

    public double setPrice(CupSize size){
        switch(size){
            case small: price = 11.50; break;
            case medium: price = 16.50; break;
            case large: price = 21.50; break;
            default: System.out.println("Choose the correct size");
        }
        return price;
    }

    public void toOrder(){
        System.out.println("You ordered a " + getSize() + " cup of " + getName() + ", you have to pay " + price + " dollars.");
    }
}
