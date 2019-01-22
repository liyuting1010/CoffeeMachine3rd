public class Cappuccino extends Coffee{

//    public Cappuccino(){
//        super("Cappuccino");
//    }

    public Cappuccino(CupSize size){
        super("Cappuccino", size);
    }

//    public Cappuccino(double price, CupSize size){
//        super("Cappuccino", price, size);
//    }

    public double getPrice(){
        double price = 0.00;
        switch(getSize()){
            case small: price = 10.00; break;
            case medium: price = 15.00; break;
            case large: price = 20.00; break;
            default: System.out.println("Choose the correct size");
        }
        return price;
    }
}
