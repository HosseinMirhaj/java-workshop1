package kargah;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("yek adad vared konid:");
        int a;
        a = new Scanner(System.in).nextInt();
        if (a != 0) {
            if (a % 2 == 0) {
                System.out.println("adad vared shode zooj mibashad:");
            } else {
                System.out.println("adad vared shode fard mibashad:");
            }
        } else {

            System.out.println("adad shoma sefr mibashad");



        }
    }

}
