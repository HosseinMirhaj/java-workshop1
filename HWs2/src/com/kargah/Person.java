package com.kargah;

import java.util.Random;
import java.util.Scanner;

public class Person {
    String name;
    int shenase;
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    public void karbar1(){
        System.out.println("enter  name of karbare1:");
        String temp = input.nextLine();
        shenase = random.nextInt();
        System.out.println("shenaseye\t" +   temp   + "\tis:\t " + shenase);
    }
    public void karbar2(){
        System.out.println("enter  name of karbare2:");
        String temp = input.nextLine();
        shenase = random.nextInt();
        System.out.println("shenaseye\t" +  temp   + " \tis:\t" + shenase);
    }
}
