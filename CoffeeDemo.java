public class CoffeeDemo {
    public static void main(String[] args){
        try{
            Coffee[] coffeeList = new Coffee[4];
            System.out.println("Your order:\n ****");
            coffeeList[0] = new Latte(CupSize.small);
            coffeeList[1] = new Latte(CupSize.medium);
            coffeeList[2] = new Espresso(CupSize.large);
            coffeeList[3] = new Americano(CupSize.small);
            OrderList order = new OrderList(coffeeList);
            System.out.println("****");

            double expense = 100.00;
            Customer customer = new Customer(order, expense);
            customer.payOrder();
            customer.toDrink();
        }catch(InsufficientPaidException e){
            System.out.println("Sorry, but you are short " + e.getExpense() + " dollars.");
        }
    }
}
