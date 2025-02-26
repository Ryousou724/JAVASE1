package sale;

public class Customer {
    public String name;
    public char sex;
    public String tel;

    public double giveMoney(){
        return 999;
    }
    public void fetchCar(Car car){
        System.out.println("取车：" + car.name + "价格：" + car.price);
    }
}
