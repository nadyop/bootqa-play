package com.satyadara.basiclogic;

class Mathematics {
    int pow(int num, int n) {
        return n == 0 ? 1 : num * pow(num, n - 1);
    }

    int fibonacci(int n) {
        return n == 0 ? 0 : n == 1 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }

    boolean isPrime(int number, int div) {
        if (number <= 2)
            return number == 2;
        if (number % div == 0)
            return false;
        if (div * div > number)
            return true;

        return isPrime(number, div + 1);
    }


}
