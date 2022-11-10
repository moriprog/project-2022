package lecture03;

import java.util.Scanner;

public class Exercize3_1 {
    public static void main(String[] args) {
        String name;
        Scanner input=new Scanner(System.in);
        System.out.println("任意の文字列を入力してください:");
        name=input.nextLine();
        System.out.println(""+name+"と出力されました");
    }
}
