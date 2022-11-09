package lecture02;

public class Engine {
    int rmp;

    Engine(int rmp){
        this.rmp=rmp;
    }

    void start(){
        System.out.println("rmp="+rmp+"でエンジンを始動させました");
    }
}
