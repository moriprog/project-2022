package lecture04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercize4_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("名前;");
        String name=input.nextLine();
        System.out.print("口座番号");
        String number=input.nextLine();

        Account account=new Account(name,number);
        ATM atm=new ATM();

        atm.existAccount(name,number);
        atm.registerAccount(name,number);
        atm.existAccount(name,number);

        atm.deposit(number,1000);
        atm.withdraw(number,2000);
        atm.withdraw(number,500);





    }
}
