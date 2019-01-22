public class Americano extends Coffee{

    public Americano(){
        super("Americano");
    }

    public Americano(CupSize size){
        super("Americano", size);
        toPrice(size);
    }

//    public Americano(double price, CupSize size){
//        super("Americano", price, size);
//    }

    public double toPrice(CupSize size){
        double price = 0.00;
        switch(size){
            case small: price = 8.50; break;
            case medium: price = 12.50; break;
            case large: price = 17.50; break;
            default: System.out.println("Choose the correct size");
        }
        return price;
    }
}
