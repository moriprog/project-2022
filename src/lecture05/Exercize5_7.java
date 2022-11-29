package lecture05;

public class Exercize5_7 {
    public static void main(String[] args) {
        Insect insect=new Insect();
        Butterfly tyou=new Butterfly();
        Locust batta=new Locust();
        SwallowtailButterfly ageha=new SwallowtailButterfly();

        Insect[] list=new Insect[4];

        list[0]=insect;
        list[1]=tyou;
        list[2]=batta;
        list[3]=ageha;

        for(Insect i:list){
            i.setName();
            i.move();
        }
    }
}
