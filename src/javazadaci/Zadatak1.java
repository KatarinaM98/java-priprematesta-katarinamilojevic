package javazadaci;

import java.util.Scanner;

/*
Za uneta tri različita pozitivna broja A, B, i C otkriti i ispisati vrednost koja se nalazi između druge dve.
Primer: Unesite prvi broj:  5
	Unesite drugi broj: 15
	Unesite treci broj: 2
	Rezultat je: 5

 */
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesi a");
        int a = s.nextInt();
        System.out.println("Unesi b");
        int b = s.nextInt();
        System.out.println("Unesi c");
        int c = s.nextInt();

        if (a < b && a > c || a < c && a > b ) {
            System.out.println("Srednja vrednost je a : " + a); }
         else if (b < a && b > c || b < c && b > a) {
            System.out.println("Srednja vrednost je b : " + b);
        } else{
            System.out.println("Srednja vrednost je c " + c);
        }

        }


    }



