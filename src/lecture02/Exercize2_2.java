package lecture02;

public class Exercize2_2 {
    public static void main(String[] args) {
        Car car=new Car();
        GasStation gas=new GasStation();

        car.run();
        gas.refuel(car);
        car.run();
    }
}
