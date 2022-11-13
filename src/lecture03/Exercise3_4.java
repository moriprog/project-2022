package lecture03;
import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {
        ArrayList<Vegetable> Vegetable =new ArrayList<>();
        Vegetable.add(new Vegetable("にんじん",117));
        Vegetable.add(new Vegetable("たまねぎ",120));
        Vegetable.add(new Vegetable("じゃがいも",154));

        for(Vegetable yasai:Vegetable){
            System.out.println(yasai.name+"は"+yasai.value+"円");
        }

    }
}
