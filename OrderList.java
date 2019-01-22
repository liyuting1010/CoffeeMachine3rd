public class OrderList {
    private String[] coffeeName;
    private CupSize[] coffeeSize;
    private double[] coffeePrice;

    public OrderList(Coffee[] coffeeList){
        getList(coffeeList);
        System.out.println("Total cost: " + getTotalPrice() + " dollars.");
    }

    public void getList(Coffee[] coffeeList){
        int counts = coffeeList.length;
        String[] nameList = new String[counts];
        CupSize[] sizeList = new CupSize[counts];
        double[] priceList = new double[counts];
        for(int i = 0; i < counts; i++){
            nameList[i] = coffeeList[i].getName();
            sizeList[i] = coffeeList[i].getSize();
            priceList[i] = coffeeList[i].getPrice();
        }
        this.coffeeName = nameList;
        this.coffeeSize = sizeList;
        this.coffeePrice = priceList;
    }

    public String[] getNameList(){
        return coffeeName;
    }
    public CupSize[] getSizeList(){
        return coffeeSize;
    }
//    public double[] getPriceList(){
//        return coffeePrice;
//    }

    public double getTotalPrice(){
        double totalPrice = 0.00;
        for(int i = 0; i < coffeePrice.length; i++){
            totalPrice += coffeePrice[i];
        }
        return totalPrice;
    }
}
