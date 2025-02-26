package encapsulate;

public class Student {
    private String stuNO;
    private String name;
    private int age;
    private String address;

    public String getStuNO() {
        return stuNO;
    }

    public void setStuNO(String stuNO) {
        this.stuNO = stuNO;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge(int i) {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 190) {
            this.age = age;
        }else {
            System.out.println("非法的年龄");
        }
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
