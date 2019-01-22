public abstract class Coffee {
    private String name;
    private double price;
    private CupSize size;

//    public Coffee(String name){
//        this(name, CupSize.small);
//    }

    public Coffee(String name, CupSize size){
        this.name = name;
        this.size = size;
        this.price = getPrice();
        toOrder();
    }
//
//    public Coffee(String name, double price, CupSize size){
//        this.name = name;
//        this.price = price;
//        this.size = size;
//        toOrder();
//    }

    public String getName(){
        return name;
    }

    public CupSize getSize(){
        return size;
    }

    public void toOrder(){
        System.out.println("A " + size + " cup of " + name + ", " + price + " dollars.");
    }
    public abstract double getPrice();
}