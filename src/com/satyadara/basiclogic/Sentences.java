package com.satyadara.basiclogic;

import java.util.Scanner;

public class Sentences {
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
}
