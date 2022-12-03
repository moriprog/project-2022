package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercize6_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try{
            System.out.print("小数を入力してください");
            double n=input.nextDouble();
            InputMismatchException inp =new InputMismatchException();
            System.out.println("入力した値:"+n);
        }
        catch (InputMismatchException e){
            System.out.println("エラー!");
        }
    }
}
