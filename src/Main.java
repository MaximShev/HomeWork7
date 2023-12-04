import java.sql.SQLOutput;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
// Задача 1
        int mounth = 0;
        int total = 0;
        int saving = 15000;
        int bid = 100;
        while (total <= 2_459_000) {
            total = total + total / bid;
            total = total + saving;
            out.println("Месяц " + mounth++ + ", сумма накомплений равна " + total + " рублей");
        }
// Задача 2
        int a = 0;
        while (a++ < 10) {
            out.print(a + " ");
        }
        out.println();
        for (int c = 10; c >= 1; c--) {
            out.print(c + " ");
        }
        out.println();
// Задача 3
        int population = 12_000_000;
        int birthRateOn1000 = 17;
        int mortalityOn1000 = 8;
        int year = 0;
        int birthRateInYear = population / 1000 * birthRateOn1000;
        int mortalityInYear = population / 1000 * mortalityOn1000;
        int populationChangeInYear = birthRateInYear - mortalityInYear;
        while (year <= 10) {
            System.out.println("Год " + year + ", численность населения состаляет " + population + " человек");
            population = populationChangeInYear + population;
            year = year + 1;
        }
// Задача 4
        int total1 = 15000;
        int bid1 = 7;
        int month = 0;
        for (; total1 <= 12_000_000; month++) {
            out.println("Месяц " + month + " сумма " + total1);
            total1 = total1 + (total1 * bid1 / 100);
        }
        out.println("Потребуется " + month + " месяцев");
// Задача 5
        int total2 = 15000;
        int bid2 = 7;
        int month1 = 0;
        for (; total2 <= 12_000_000; month1++) {
            total2 = total2 + (total2 * bid2 / 100);
            if (month1 % 6 == 0) {
                out.println("Месяц " + month1 + " сумма " + total2);
            }
        }
        out.println("Потребуется " + month1 + " месяцев");
// Задача 6
        int total3 = 15000;
        int bid3 = 7;
        int month2 = 0;
        for (; month2 <= 9*12; month2++) {
            total3 = total3 + (total3 * bid3 / 100);
            if (month2 % 6 == 0) {
                out.println("Месяц " + month2 + " сумма " + total3);
            }
        }
        out.println("За 9 лет Василий накопит " + total3 + " рублей");
// Задача 7
        int friday = 5;
        do {
            out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
            while (friday <= 31);
// Задача 8
        int thisYear = 2023;
        int cometHere = 79;
        int yearOfComing = 0;
        while (yearOfComing <= thisYear + 100 - cometHere) {
            yearOfComing = yearOfComing + cometHere;
            if (thisYear-200 < yearOfComing) {
                out.println(yearOfComing);
            }
        }
    }
}