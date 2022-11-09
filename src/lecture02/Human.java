package lecture02;

public class Human {
    String name;
    int age;

    Human(String a,int b){
        this.name=a;
        this.age=b;

    }

    void print(){
        System.out.println(name+ age+"歳です");
    }


}
