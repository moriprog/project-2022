package lecture02;

public class Car {
    int fuel;
    Tire[] tires;
    Engine engine;

    Car(Tire[] tires,Engine engine){
        this.fuel=0;
        this.tires=tires;
        this.engine=engine;
    }

    void run(){
        fuel=fuel-1;

        if(fuel<=0){
            System.out.println("車は走れません");
        }
        else{
            System.out.println("燃料を1消費して走りました。");
        }
    }

    void startEngine(){
        engine.start();
    }


}
