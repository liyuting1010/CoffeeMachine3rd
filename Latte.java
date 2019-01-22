public class Latte extends Coffee{
//    public Latte(){
//        super("Latte");
//    }

    public Latte(CupSize size){
        super("Latte", size);
    }

//    public Latte(double price, CupSize size){
//        super("Latte", price, size);
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
