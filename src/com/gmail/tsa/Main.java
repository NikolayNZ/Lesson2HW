package com.gmail.tsa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Написать программу которая считывает 5-и значное число с
        //клавиатуры и выводит цифры из которого оно состоит.
        //Например : Считывается число 54698
        //Выводиться:
        //54698
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int number = sc.nextInt();
        int part1= number/10000;
        int part2= number%10000/1000;
        int part3= number%1000/100;
        int part4= number%100/10;
        int part5= number%10;
        System.out.println(part1);
        System.out.println(part2);
        System.out.println(part3);
        System.out.println(part4);
        System.out.println(part5);
    //Написать программу которая вычислит и выведет на экран
        //площадь треугольника если известны его стороны.
double sideA = 0.3;
double sideB = 0.4;
double sideC = 0.5;

double p = (sideA+sideB+sideC)/2;
double s = (Math.sqrt(p-(p-sideA)*(p-sideB)*(p-sideC)));

        System.out.println("Площа треугольника = "+ (float) s);
// Написать программу которая вычислит и выведет на экран
//длину окружности, если ее радиус считывается с клавиатуры.
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите длину окружности");
        double r = sc1.nextDouble();
        Double l = 2 * Math.PI * r;
        System.out.println (l);

    }
}
