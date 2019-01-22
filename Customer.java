public class Customer{
    private OrderList order;
    private double expense;

    public Customer(OrderList order, double expense){
        try{
            this.order = order;
            this.expense = expense;
            setPay(order);
        }catch (InsufficientPaidException e){
            System.out.println("Sorry, but you are short " + e.getExpense());
        }
    }

    public void setPay(OrderList order) throws InsufficientPaidException{
        double totalPrice = 0.00;
        for(int i = 0; i < order.getPriceList().length; i++){
            totalPrice += order.getPriceList()[i];
        }
        if(expense >= totalPrice){
            double changes = expense - totalPrice;
            System.out.println("Give you a change of " + changes + " dollars.");
        }
        else {
            double needs = totalPrice - expense;
            throw new InsufficientPaidException(needs);
        }
    }

    public void toDrink(){
        int i = 0;
        String[] nameList = order.getNameList();
        CupSize[] sizeList = order.getSizeList();
        for(String name : nameList){
            System.out.println("There is your " + sizeList[i].toString() + " cup of " + nameList[i] + ".");
            i ++;
        }
    }

    public double getExpense(){
        return expense;
    }
}
