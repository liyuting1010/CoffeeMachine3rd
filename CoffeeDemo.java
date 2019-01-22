public class CoffeeDemo {
    public static void main(String[] args){
        try{
            Coffee[] coffeeList = new Coffee[4];
            coffeeList[0] = new Latte(CupSize.small);
            coffeeList[1] = new Latte(CupSize.medium);
            coffeeList[2] = new Espresso(CupSize.large);
            coffeeList[3] = new Americano(CupSize.small);
            OrderList order = new OrderList(coffeeList);

            double expense = 50.00;
            Customer customer = new Customer(order, expense);
            customer.toDrink();
        }catch(NullPointerException e){
            System.out.println("Please choose again.");
        }
    }
}
