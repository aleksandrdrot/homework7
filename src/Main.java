public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int total = 0;
        int month = 0;
        int sum = 15000;
        while (total <= 2459000){
            month++;
            total += sum;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");

        int i = 1;
        while (i <= 10){
            System.out.printf("%d ", i);
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--){
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        int children = 17 - 8; // рождается 9 детей на 1000 человек в год
        int population = 12000000;
        int allPopulation = population + ((population/1000)*children);
        int year = 1;
        while (year <= 10){
            System.out.println("Год " + year + ", численность населения составляет " + allPopulation);
            allPopulation += (allPopulation/1000)*children;
            year++;
        }

    }

    public static void task4() {
        System.out.println("Задача 4");

        int sum = 15000;
        int month = 0;
        while (sum <= 12000000){
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            sum += (15000*0.07);
        }

    }

    public static void task5() {
        System.out.println("Задача 5");

        int sum = 15000;
        int month = 0;
        while (sum <= 12000000){
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
            sum += (15000*0.07);
        }

    }

    public static void task6() {
        System.out.println("Задача 6");

        int sum = 15000;
        int month = 0;
        int year = 1;
        while (year <= 9){
            month++;
            if (month % 12 == 0){ year++;}
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
            sum += (15000*0.07);
        }

    }

    public static void task7() {
        System.out.println("Задача 7");

        int day = 1;
        int friday = 4;
        while (day <= 31){
            if (day == friday){
                System.out.println("Сегодня пятница, "+ day +"-е число. Необходимо подготовить отчет");
                friday +=7;
            }
            day++;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int year = 2010;
        int firstYear = year - 200;
        int lastYear = year + 100;
        while (firstYear < lastYear){
            if (firstYear % 79 == 0) {
                System.out.println(firstYear);
            }
            firstYear++;
        }
    }
}