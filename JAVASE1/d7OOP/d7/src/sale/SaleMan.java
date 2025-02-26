package sale;

public class SaleMan {
    public String name;
    public char sex;
    public String tel;

    public Car saleCar(double money){
        System.out.println("销售人员" + name + "收到" + money);
        Car car = new Car();
        car.name = "BYD";
        car.price = 998;
        return car;
    }
}
