public class Latte extends Coffee{
    private double price;

    public Latte(){
        super("Latte", 10.00, CupSize.small);
    }

    public Latte(CupSize size){
        super("Latte", size);
        this.price = setPrice(size);
    }

    public Latte(double price, CupSize size){
        super("Latte", price, size);
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
