package com.satyadara.basiclogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sentences {
  Scanner scanner = new Scanner(System.in);
    String reverseString(String original, int size) {
        return size == 0 ? "" : original.charAt(size - 1) + reverseString(original, size - 1);
    }

    void javaFormatter() {
      Scanner sc = new Scanner(System.in);
      System.out.println("================================");
      for(int i = 0; i < 3; i++){
        String s1 = sc.next();
        int x = sc.nextInt();
        System.out.printf("%-15s%03d\n", s1, x);
      }
      System.out.println("================================");
    }

    void counterPalindrom() {
      List<String> inputWords = new ArrayList<>();
      int cekInput=0;
      do{
        System.out.println("Masukkan Kalimat : ");
        String inputString = scanner.nextLine();
        inputWords.add(inputString);
        System.out.println("Masih Mau Input? 1. Ya, 0. Tidak : "); cekInput = scanner.nextInt();
        scanner.nextLine();
      }while (cekInput != 0);

      int counterCekPalindrom = 0;
      for (int i=0; i<inputWords.size(); i++){
        String temp = reverseStringGege(inputWords.get(i), inputWords.get(i).length());
        System.out.println("hasil="+temp);
        if(inputWords.get(i).equalsIgnoreCase(temp)){
          counterCekPalindrom++;
        }
      }


      System.out.println("Banyak Kalimat Yang Palindrom Adalah: "+counterCekPalindrom);
    }

    String reverseStringGege (String kalimat, int size) {
      if(size == 0)
        return "";
      else
        return kalimat.charAt(size-1) + reverseStringGege(kalimat, size-1);
    }
}
