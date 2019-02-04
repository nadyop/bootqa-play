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
            System.out.println("BELAJAR ASIQUE");
            System.out.println("[1] Power");
            System.out.println("[2] Fibonacci");
            System.out.println("[3] Prime");
            System.out.println("[4] Reverse Stringg");
            System.out.println("--------------------------");
            System.out.println("Input Menu >> "); menu=in.nextInt();
            System.out.println("menu="+menu);
            switch (menu){
                case 1:
                    System.out.println("Hasil: ");
                    mathematics.pow(2, 3);
                    break;
                case 2:
                    System.out.println("cek2");
                    mathematics.fibonacci(4);
                    break;
                case 3:
                    mathematics.isPrime(3, 2);
                    break;
                case 4:
                    sentences.reverseString("satya syahputra", 15);
                    break;
                case 0:
                    break;
            }
        }while (menu!=0);
    }


}
