package com.JavaList;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Weclome To My Implementation Of A List Structure in Java !! \n");
        BeenList bl = new BeenList();
        bl.append(1);
        bl.append(3);
        bl.print();
        System.out.println("Enter 'y' if output is correct, otherwise 'n' : ");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        if(s.equals("y")) {
            System.out.println("I am happy that you are happy :) ");
        } else {
            System.out.println("We will work on the bugs :) ");
        }
    }
}
