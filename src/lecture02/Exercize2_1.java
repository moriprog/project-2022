package lecture02;

import java.util.Scanner;

public class Exercize2_1 {
    public static void main(String[] args) {
        Human human1=new Human("たかし",18);
        System.out.print("生徒:");
        human1.print();

        Human human2=new Human("ひろし",20);
        System.out.print("学生:");
        human2.print();
    }
}
