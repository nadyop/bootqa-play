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
        int menu, bil;

        do {
            System.out.println("BELAJAR");
            System.out.println("[1] Power");
            System.out.println("[2] Fibonacci");
            System.out.println("[3] Prime");
            System.out.println("[4] Reverse Stringg");
            System.out.println("[5] Bilangan Faktorial");
            System.out.println("[6] Pohon Faktor");
            System.out.println("[7] Segitiga Siku-Siku");
            System.out.println("[8] Java Formatter");
            System.out.println("[9] Plus Minus");
            System.out.println("[10] Segitiga siku-siku Kanan");
            System.out.println("[11] Min-Max Sum");
            System.out.println("[12] Birthday Cake");
            System.out.println("[13] Time Conversion");
            System.out.println("[14] Reverse String Counter");
            System.out.println("[15] Diagonal ");
            System.out.println("[16] Grading Students");
            System.out.println("[17] Bubble Sort");
            System.out.println("[18] Recursion");
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
                    System.out.println("Masukkan Bilangan: "); bil=in.nextInt();
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
                case 5:
                    System.out.println("*) Faktorial");
                    System.out.println("Masukkan Bilangan: "); bil=in.nextInt();
                    System.out.println("Hasil Rekursif: "+mathematics.bilanganFaktorial(bil));
                    System.out.println("Hasil For:"+mathematics.forBilanganFaktorial(bil));
                    break;
                case 6:
                    System.out.println("*) Pohon Faktor");
                    System.out.println("Masukan Bilangan: "); bil =in.nextInt();

                    break;
                case 7:
                    System.out.println("*) Segitiga Siku-Siku Pake Rekursif");
                    System.out.print(mathematics.segitigaSikuSikuRekursif(5));
                    break;
                case 8:
                    System.out.println("*) Java Formatter");
                    sentences.javaFormatter();
                    break;
                case 9:
                    System.out.println("*) Plus Minus");
                    mathematics.plusMinus();
                    break;
                case 10:
                    System.out.println("*) Segitiga siku-siku kanan");
                    mathematics.segitigaSikuSikuKanan();
                    break;
                case 11:
                    System.out.println("*) Min-Max Sum");
                    mathematics.minMaxSum();
                    break;
                case 12:
                    System.out.println("*) Birthday Cake");
                    mathematics.birthdayCakeCandles();
                    break;
                case 13:
                    System.out.println("*) Time Conversion");
                    mathematics.timeConversion();
                    break;
                case 14:
                    sentences.counterPalindrom();
                    break;
                case 15:
                    mathematics.diagonalInteger();;
                    break;
                case 16:
                    mathematics.gradingStudents();
                    break;
                case 17:
                    mathematics.bubblesort();
                    break;
                case 18:
                    break;
                case 0:
                    break;
            }
        }while (menu!=0);
    }


}
