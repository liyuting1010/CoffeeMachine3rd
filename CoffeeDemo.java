public class CoffeeDemo {
    public static void main(String[] args){
        Coffee[] coffeeList = new Coffee[4];
        coffeeList[0] = new Latte(CupSize.small);
        coffeeList[1] = new Latte(CupSize.medium);
        coffeeList[2] = new Espresso(CupSize.large);
        coffeeList[3] = new Americano(CupSize.small);
        OrderList order = new OrderList(coffeeList);
        Customer customer = new Customer(order, 100.00);
        customer.toDrink();
    }
}
