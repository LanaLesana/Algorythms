package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Решето Эратосфена
public class TaskFive {
    public static List<Integer> runTaskFive() {
        var scanner = new Scanner(System.in);
        System.out.println("Введите число больше нуля.");
        int number = scanner.nextInt();

        boolean isPrime[] =new boolean[number+1]; //создаем булин массив для определения простых чисел
        List<Integer> primes = new ArrayList<>(); //создаем лист, куда закинем простые числа

        for (int i =2; i <= number; i++) { //сначала допускаем, что все числа до N простые
            isPrime[i] = true; //номер индекса в массиве соответствует числу
        }

        //проверяем числа по порядку. 0 и 1 не являются простыми числами. значит начинаем с 2.
        // т.к. все числа проверяются в естественном порядке, имеет смысл начинать с квадрата числа и далее
        for (int factor = 2; factor * factor <= number; factor++ ) { //мы ведем цикл до factor * factor <= number;
            //потому что все меньшие числа уже проверены предыдущей итерацией цикла
            if(isPrime[factor]) {
                for (int j = factor * factor; j < number; j += factor ) { //мы добавляем factor к j,
                    // потому что это гарантирует, что j будет кратно factor, а значит не простое число
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= number; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;


    }
}
//5) Дано число N > 0. Вывести все простые числа от 0 до N.
//Простое число - это число, которое делится само на себя и на 1 только