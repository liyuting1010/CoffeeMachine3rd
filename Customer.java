public class Customer{
    private OrderList order;
    private double expense;

    public Customer(OrderList order, double expense){
        this.order = order;
        this.expense = expense;
    }

    public void payOrder() throws InsufficientPaidException{
        double totalPrice = order.getTotalPrice();
        if(expense >= totalPrice){
            double changes = expense - totalPrice;
            System.out.println("Give you a change of " + changes + " dollars.");
        }
        else {
            double needs = totalPrice - expense;
            throw new InsufficientPaidException(needs);
        }
    }

    public void toDrink() {
        String[] nameList = order.getNameList();
        CupSize[] sizeList = order.getSizeList();
        for (int i = 0; i < order.getNameList().length; i++) {
            System.out.println("There is your " + sizeList[i].toString() + " cup of " + nameList[i] + ".");
        }
    }

    public double getExpense(){
        return expense;
    }
}
