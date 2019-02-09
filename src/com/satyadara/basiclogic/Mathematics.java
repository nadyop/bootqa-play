package com.satyadara.basiclogic;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Mathematics {

    private static final Scanner scanner = new Scanner(System.in);
    // angka=5, pangkat=2
    int pow(int angka, int pangkat) {
        return pangkat == 0 ? 1 : angka * pow(angka, pangkat - 1);
    }

    int fibonacci(int n) {
        return n == 0 ? 0 : n == 1 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }
    // numb =1
    boolean isPrime(int number, int div) {
        if (number <= 2)
            return number == 2; // ini returnnya false
        if (number % div == 0)
            return false;
        if (div * div > number)
            return true;

        return isPrime(number, div + 1);
    }

    int bilanganFaktorial(int bilangan) {
        if(bilangan == 0)
            return 1;
        else
            return bilangan * bilanganFaktorial(bilangan-1);
    }

//    int pohonFakto
    int forBilanganFaktorial(int bilangan) {
        int temp=1;
        for (int i=0; i<bilangan; i++) {
            temp = temp * (i+1);
        }
        return temp;
    }

//    String segitigaSikuSiku(int row, int column){
//
//
//    }
    void segitigaSikuSiku(){
        int jumlah = 5;
        for(int i=1;i<=jumlah;i++){
            for (int j=0;j<i;j++){
                System.out.print("0");
            }
            System.out.println();
        }
    }

    String segitigaSikuSikuRekursif(int bilangan) {
        int i=0, j=0;
        // i kesamping, j kebawah
        if(j==0)
            return "*";
        else {
            return "*\n" + segitigaSikuSikuRekursif(bilangan-1);
        }
    }

    boolean apakahBilanganPrima(int bilangan, int div) {
        if (bilangan<=2) // 0 dan 1
            return bilangan == 2;
        if (bilangan % div == 0) // buat yg genap dan ganjil yg bukan prima
            return false;
        if (div*div > bilangan) // buat ganjil yg prima
            return true;
        return apakahBilanganPrima(bilangan, div+1);
    }

    void plusMinus(){
      int[] arr = new int[6];

      for (int i = 0; i < arr.length; i++) {
        System.out.println("input ke-0"+(i+1)+" : "); int n= scanner.nextInt();
        arr[i] = n;
      }

      plusMinusFunction(arr);
    }

    void plusMinusFunction(int[] arr){
      int counterZero=0, counterPositive=0, counterNegative=0, arrLength=0;
      for(int i=0; i<arr.length; i++){
        if(arr[i]==0){
          counterZero++;

        } else if(arr[i]<0){
          counterNegative++;

        } else if(arr[i]>0){
          counterPositive++;

        }
      }
      arrLength = arr.length;
      double zero = (double) Double.valueOf(counterZero) / Double.valueOf(arrLength);
      double positive = (double) Double.valueOf(counterPositive) / Double.valueOf(arrLength);
      double negative = (double) Double.valueOf(counterNegative) / Double.valueOf(arrLength) ;

      System.out.printf("%.6f\n",positive);
      System.out.printf("%.6f\n",negative);
      System.out.printf("%.6f\n",zero);
    }

    void segitigaSikuSikuKanan(){
      int n=6;
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          if(j<(n-(i+1))){
            System.out.print(" ");
          } else {
            System.out.print("#");
          }
        }
        System.out.print("\n");
      }
    }

    void minMaxSum(){
      int[] arr = new int[]{3,2,5,1,4};
      Arrays.sort(arr);
      int sumMin = arr[0]+arr[1]+arr[2]+arr[3];
      int sumMax = arr[4]+arr[1]+arr[2]+arr[3];
      System.out.println("sumMin = "+sumMin+"\nsumMax= "+sumMax);

      System.out.println("Jumlah count sum min-max: "); int sum = scanner.nextInt();
      System.out.println("Masukkan Jumlah Array: "); int array = scanner.nextInt();
      int[] arrBaru= new int[array];
      for (int i=0; i<array; i++){
        arrBaru[i] = scanner.nextInt();
      }

      Arrays.sort(arrBaru);
      int sumMinResult=0;
      int sumMaxResult=0;
      for (int i=0; i<sum; i++){
        sumMinResult += arrBaru[i];
        sumMaxResult += arrBaru[arrBaru.length-(i+1)];
      }
      System.out.println(sumMinResult+" "+sumMaxResult);
    }

    void birthdayCakeCandles() {
      System.out.println("Masukkan Jumlah Usia [Array]: "); int arrUsia = scanner.nextInt();
      int[] arrCandles = new int[arrUsia];
      for (int i=0; i<arrUsia;i++) {
        arrCandles[i] = scanner.nextInt();
      }
      Arrays.sort(arrCandles);
      int getBiggest = arrCandles[arrUsia-1];
      int counter=0;
      int i=arrUsia-1;
      while (i>=0){
        if(arrCandles[i] == getBiggest){
          counter++;
        } else {
          i=-1;
        }
        i--;
      }
      System.out.println("Counter: "+counter);
    }

    void timeConversion(){
      System.out.println("Input: "); String input = scanner.next();
      String jamAwal = input.charAt(0) +""+input.charAt(1);
      String jamFormat = input.charAt(input.length()-2) + ""+input.charAt(input.length()-1);

      if(jamFormat.equalsIgnoreCase("am")) {
        if(jamAwal.equalsIgnoreCase("12")){
          jamAwal = "00";
        }
      } else {
        if(!jamAwal.equalsIgnoreCase("12")){
          int parseIntJamAwal = Integer.parseInt(jamAwal) + 12;
          jamAwal = ""+parseIntJamAwal;
        }
      }
      String hasil = String.valueOf(jamAwal)+ input.substring(2, 8);
      System.out.println("Hasilnya:"+hasil);
    }
}
