package org.example;

import java.util.Scanner;

public class TaskTen {
    public static void runTaskTen() {
        var scanner = new Scanner(System.in);

        System.out.println("Введите длину первой стороны треугольника.");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите длину второй стороны треугольника.");
        int secondNumber = scanner.nextInt();

        System.out.println("Введите длину третьей стороны треугольника.");
        int thirdNumber = scanner.nextInt();

        //теорема Пифагора a^2 + b^2 = c^2
        //гипотенуза всегда длиннее катета

        //определяем самое большое число и принимаем его за гипотенузу
        int[] triangleSides = {firstNumber, secondNumber, thirdNumber};
        int hypotenuse = 0;
        int hypotenuseIndex = -1;

        for (int i = 0; i < triangleSides.length; i ++) {
            if (triangleSides[i] > hypotenuse) {
                hypotenuse = triangleSides[i];
                hypotenuseIndex = i;
            }
        }


        //теперь мы знаем гипотенузу и ее индекс в массиве
        //вытаскиваем катеты

        int[] catheti = new int[2];
        int cathetusIndex = 0;

        for (int i = 0; i < triangleSides.length; i++) {
            if (i != hypotenuseIndex) {
                catheti[cathetusIndex++] = triangleSides[i];
            }
        }
        //проверяем теорему Пифагора
         if (hypotenuse * hypotenuse == catheti[0] * catheti[0] + catheti[1] * catheti[1]) {
             System.out.println("Это прямоугольный треугольник");
         } else {
             System.out.println("Это не прямоугольный треугольник");
         }


        }
    }

//10) Даны 3 числа. Определить, является ли треугольник с такими сторонами прямогульным.
//Например: 3,4,5 - ответ да. 4,4,11 - ответ нет.