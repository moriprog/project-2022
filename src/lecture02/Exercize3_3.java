package lecture02;

public class Exercize3_3 {
    public static void main(String[] args) {
        Tire[] tires=new Tire[4];
        for(int i=0;i<4;i++){
            tires[i]=new Tire(64);
        }
        Engine engine=new Engine(4000);
        Car car=new Car(tires,engine);
        GasStation gas=new GasStation();

        gas.refuel(car);
        car.startEngine();
        car.run();
    }


}
