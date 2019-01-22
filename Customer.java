public class Customer{
    private OrderList order;
    private double expense;

    public Customer(OrderList order, double expense){
        try{
            this.order = order;
            this.expense = expense;
            setPay();
        }catch (InsufficientPaidException e){
            System.out.println("Sorry, but you are short " + e.getExpense());
            this.order = new OrderList();
        }
    }

    public double getPrice(){
        double totalPrice = 0.00;
        for(int i = 0; i < order.getPriceList().length; i++){
            totalPrice += order.getPriceList()[i];
        }
        return totalPrice;
    }

    public void setPay() throws InsufficientPaidException{
        double totalPrice = getPrice();
        if(expense >= totalPrice){
            double changes = expense - totalPrice;
            System.out.println("Give you a change of " + changes + " dollars.");
        }
        else {
            double needs = totalPrice - expense;
            throw new InsufficientPaidException(needs);
        }
    }

    public void toDrink() throws NullPointerException{
        if(order != null){
            int i = 0;
            String[] nameList = order.getNameList();
            CupSize[] sizeList = order.getSizeList();
            for(String name : nameList){
                System.out.println("There is your " + sizeList[i].toString() + " cup of " + nameList[i] + ".");
                i ++;
            }
        }else{
            throw new NullPointerException();
        }
    }

    public double getExpense(){
        return expense;
    }
}
