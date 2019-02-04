package com.satyadara.basiclogic;

import java.util.ArrayList;
import java.util.List;

class Mathematics {
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

}
