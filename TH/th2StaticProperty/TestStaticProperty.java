package bai5_AcessModifier.TH.th2StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Marda 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 =  new Car("Mazda 6 " , "Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
