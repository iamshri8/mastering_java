package session4.lecture;


enum CoffeeSize {BIG, HUGE, OVERWHELMING} //cannot be private or protected

class Coffee {
    CoffeeSize size;
}

public class CoffeeTest1 {
    public static void main(String[] args) {
        Coffee drink = new Coffee();
        drink.size = CoffeeSize.BIG;
    }
}
