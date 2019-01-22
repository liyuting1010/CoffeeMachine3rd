public class OrderList {
    private String[] coffeeName;
    private CupSize[] coffeeSize;
    private double[] coffeePrice;

    public OrderList(){
    }
    public OrderList(Coffee[] coffeeList){
        getList(coffeeList);
    }

    public void getList(Coffee[] coffeeList){
        int counts = coffeeList.length;
        String[] nameList = new String[counts];
        CupSize[] sizeList = new CupSize[counts];
        double[] priceList = new double[counts];
        for(int i = 0; i < counts; i++){
            nameList[i] = coffeeList[i].getName();
            sizeList[i] = coffeeList[i].getSize();
            priceList[i] = coffeeList[i].setPrice(sizeList[i]);
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
    public double[] getPriceList(){
        return coffeePrice;
    }
}
