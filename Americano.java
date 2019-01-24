public class Americano extends Coffee{
    public Americano(CupSize size){
        super("Americano", size);
    }
    public double getPrice(){
        double price = 0.00;
        switch(getSize()){
            case small: price = 8.50; break;
            case medium: price = 12.50; break;
            case large: price = 17.50; break;
            default: System.out.println("Choose the correct size");
        }
        return price;
    }
}
