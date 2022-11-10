package lecture03;

import java.util.Scanner;

public class Exercize3_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input_str=new Scanner(System.in);


        System.out.println("何行分入力しますか");
        int count=input.nextInt();
        String[] gyou=new String[2];
        for(int i=0;i<count;i++){
            System.out.println(i + "行目");
            gyou[i]=input_str.nextLine();
        }
        System.out.println("入力した文字列");
        for(String str: gyou){
            int i=0;
            System.out.println("["+i+"]"+str);

        }
    }
}
