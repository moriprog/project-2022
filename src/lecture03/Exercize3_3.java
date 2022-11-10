package lecture03;

import java.util.Scanner;
import java.util.SortedMap;


public class Exercize3_3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("xを入力");
        String x=input.nextLine();
        System.out.println("yを入力");
        String y=input.nextLine();

        int xi=Integer.parseInt(x);
        int yi=Integer.parseInt(y);

        int sum=xi+yi;

        System.out.println("和"+sum);
    }



}
