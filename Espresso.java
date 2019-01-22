public class Espresso extends Coffee{
//    private double price;

//    public Espresso(){
//        super("Espresso");
//    }

    public Espresso(CupSize size){
        super("Espresso", size);
    }

//    public Espresso(double price, CupSize size){
//        super("Espresso", price, size);
//    }

    public double getPrice(){
        double price = 0.00;
        switch(getSize()){
            case small: price = 11.50; break;
            case medium: price = 16.50; break;
            case large: price = 21.50; break;
            default: System.out.println("Choose the correct size");
        }
        return price;
    }
}
