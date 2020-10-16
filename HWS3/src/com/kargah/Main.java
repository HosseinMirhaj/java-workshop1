package com.kargah;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu men = new Menu();
        Scanner input = new Scanner(System.in);
        System.out.println("please choose your number first : ");
        System.out.println("1.0912345554\t"+"2.0912345545\t"+"3.09123466587\t"+"4.0911341254\t"+"5.09355376379\t");
        int temp =input.nextInt();
        men.n = temp;
        switch (men.n){
            case 1 :
                men.sim1();
                temp = input.nextInt();
                men.x = temp;
                System.out.println("reply: ");
                men.sim1();
                break;
            case 2 :
                men.sim2();
                temp = input.nextInt();
                men.x = temp;
                System.out.println("reply: ");
                men.sim2();
                break;
            case 3 :
                men.sim3();
                temp = input.nextInt();
                men.x = temp;
                System.out.println("reply: ");
                men.sim3();
                break;
            case 4 :
                men.sim4();
                temp = input.nextInt();
                men.x = temp;
                System.out.println("reply: ");
                men.sim4();
                break;
            case 5 :
                men.sim5();
                temp = input.nextInt();
                men.x = temp;
                System.out.println("reply: ");
                men.sim5();
                break;


        }
    }
}
