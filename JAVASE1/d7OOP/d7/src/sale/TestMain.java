package sale;

public class TestMain {
    public static void main(String[] args) {
        Customer customer = new Customer();
        double money = customer.giveMoney();

        SaleMan saleMan = new SaleMan();
        saleMan.name = "007";
        Car car = saleMan.saleCar(money);
        customer.fetchCar(car);
    }
}
