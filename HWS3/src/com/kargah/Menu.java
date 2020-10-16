package com.kargah;

import java.util.Scanner;

public class Menu implements Sim {

    int x;
    int n;
    Charge k = new Charge();
    Qabz j = new Qabz();
    Internet p = new Internet();
    Scanner input = new Scanner(System.in);
    @Override
    public void sim1() {
        System.out.println("number : 0912345554" );
        System.out.println("...........menu..........");
        System.out.println("1.charge \t" + "2.qabz\t" + "3.internet");

        switch (x){
            case 1 :
                k.sim1();
                int temp1 = input.nextInt();
                k.price = temp1;
                System.out.println("reply: ");
                k.sim1();
                break;
            case 2 :
                j.sim1();
                temp1 = input.nextInt();
                j.y = temp1;
                System.out.println("reply: ");
                j.sim1();
                break;
            case 3 :
                p.sim1();
                temp1 = input.nextInt();
                p.baste = temp1;
                System.out.println("reply: ");
                j.sim1();
                break;
        }
    }


    @Override
    public void sim2() {
        System.out.println("number : 0912345545" );
        System.out.println("...........menu..........");
        System.out.println("1.charge\t " + "2.qabz\t" + "3.internet");

        switch (x){
            case 1 :
                k.sim2();
                int temp1 = input.nextInt();
                k.price = temp1;
                System.out.println("reply: ");
                k.sim2();
                break;
            case 2 :
                j.sim2();
                temp1 = input.nextInt();
                j.y = temp1;
                System.out.println("reply: ");
                j.sim2();
                break;
            case 3 :
                p.sim2();
                temp1 = input.nextInt();
                p.baste = temp1;
                System.out.println("reply: ");
                p.sim2();
                break;
        }
    }

    @Override
    public void sim3() {
        System.out.println("number : 09123466587" );
        //System.out.println("...........menu..........");
        System.out.println("1.charge\t" + "2.qabz\t" + "3.internet");
        switch (x){
            case 1 :
                k.sim3();
                int temp1 = input.nextInt();
                k.price = temp1;
                System.out.println("reply: ");
                k.sim3();
                break;
            case 2 :
                j.sim3();
                temp1 = input.nextInt();
                j.y = temp1;
                System.out.println("reply: ");
                j.sim3();
                break;
            case 3 :
                p.sim3();
                temp1 = input.nextInt();
                p.baste = temp1;
                System.out.println("reply: ");
                p.sim3();
                break;
        }
    }


    @Override
    public void sim4() {
        System.out.println("number : 0911341254" );
        System.out.println("...........menu..........");
        System.out.println("1.charge\t " + "2.qabz\t" + "3.internet");
        switch (x){
            case 1 :
                k.sim4();
                int temp1 = input.nextInt();
                k.price = temp1;
                System.out.println("reply: ");
                k.sim4();
                break;
            case 2 :
                j.sim4();
                temp1 = input.nextInt();
                j.y = temp1;
                System.out.println("reply: ");
                j.sim4();
                break;
            case 3 :
                p.sim4();
                temp1 = input.nextInt();
                p.baste = temp1;
                System.out.println("reply: ");
                p.sim4();
                break;
        }


    }

    @Override
    public void sim5() {
        System.out.println("number : 09355376379" );
        System.out.println("...........menu..........");
        System.out.println("1.charge\t" + "2.qabz\t" + "3.internet\t");
        switch (x){
            case 1 :
                k.sim5();
                int temp1 = input.nextInt();
                k.price = temp1;
                System.out.println("reply: ");
                k.sim5();
                break;
            case 2 :
                j.sim5();
                temp1 = input.nextInt();
                j.y = temp1;
                System.out.println("reply: ");
                j.sim5();
                break;
            case 3 :
                p.sim5();
                temp1 = input.nextInt();
                p.baste = temp1;
                System.out.println("reply: ");
                p.sim5();
                break;
        }
    }
}
