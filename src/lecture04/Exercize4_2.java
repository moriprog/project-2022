package lecture04;

import java.util.Scanner;

public class Exercize4_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("名前;");
        String name=input.nextLine();
        System.out.print("口座番号;");
        String number=input.nextLine();

        Account account=new Account(name,number);
        ATM atm=new ATM();

        atm.existAccount(name,number);
        atm.registerAccount(name,number);
        atm.existAccount(name,number);

        while (true){
            System.out.print("入金したいなら1,引出したいなら2,終了させたいなら0を入力:");
            int n=input.nextInt();
            if(n==1){
                System.out.print("入金したい金額を入力:");
                long money= input.nextLong();
                atm.deposit(number,money);
            } else if (n==2) {
                System.out.println("引き出したい金額を入力");
                long money=input.nextLong();
                atm.withdraw(number,money);
            } else {
                System.out.println("終了しました");
                break;
            }
        }





    }
}
