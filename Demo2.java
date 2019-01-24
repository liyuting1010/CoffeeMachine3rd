public class Demo2 {
    public static void coffeeDrink(Coffee[] coffees) {
        for (Coffee c : coffees) {
            c.toDrink();
        }
    }

    public static void main(String[] args) {
        Coffee[] coffeeList = {
                new Latte(CupSize.small),
                new Latte(CupSize.medium),
                new Espresso(CupSize.large),
                new Americano(CupSize.small),
                new Cappuccino(CupSize.medium)
        };
        coffeeDrink(coffeeList);
    }
}
