package lecture01;

import java.util.Scanner;

public class kadai3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("年齢を入力");
        int age=input.nextInt();

        if(age>=20){
            System.out.println("I am " + age + " years old so I can drink liquor.");
        }
        else if (age<20){
            System.out.println("I am " + age + " years old so I cannot drink liquor.");

        }
    }



}
