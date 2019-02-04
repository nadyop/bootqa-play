package com.satyadara.basiclogic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        Mathematics mathematics = new Mathematics();
        Sentences sentences = new Sentences();
        int menu;

        do {
            System.out.println("BELAJAR");
            System.out.println("[1] Power");
            System.out.println("[2] Fibonacci");
            System.out.println("[3] Prime");
            System.out.println("[4] Reverse Stringg");
            System.out.println("--------------------------");
            System.out.println("Input Menu >> "); menu=in.nextInt();
            System.out.println("menu="+menu);
            switch (menu){
                case 1:
                    System.out.println("*) Power");
                    System.out.println("Hasil: "+mathematics.pow(2, 3));
                    break;
                case 2:
                    System.out.println("*) Fibonacci");
                    System.out.println("Masukkan Bilangan: "); int bil=in.nextInt();
                    System.out.println("Hasil: "+mathematics.fibonacci(bil));
                    break;
                case 3:
                    System.out.println("*) Bilangan Prima");
                    System.out.println("Masukkan bilangan: "); int bilangan = in.nextInt();
                    System.out.println("Hasil: "+mathematics.isPrime(bilangan, 2));
                    break;
                case 4:
                    System.out.println("*) Reverse String");
                    System.out.println("Hasil:"+sentences.reverseString("satya syahputra", 15));
                    break;
                case 0:
                    break;
            }
        }while (menu!=0);
    }


}
