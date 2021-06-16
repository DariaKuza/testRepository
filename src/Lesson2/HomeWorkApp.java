package Lesson2;

/**
 * Created by Daria
 *
 */
public class HomeWorkApp {
    public static void main(String[] args) {

        System.out.println("Рузельтат задания 1 > " + checkNumbers(1, 10));
        System.out.println("************");

        isPositive1(-20);
        System.out.println("************");

        System.out.println(doThree(-1));
        System.out.println("************");

        methodPrintStringCount("Hello string", 5);
        System.out.println("************");

        doFive(2021);
        System.out.println("************");


    }


    //  1. Написать метод, принимающий на вход два целых числа и проверяющий,
    //  что их сумма лежит в пределах от 10 до 20 (включительно), //
    //  если да – вернуть true, в противном случае – false.
    public static boolean checkNumbers(int first, int second) {
        return (first + second <= 20) && (first + second >= 10);
    }

    // 2. Написать метод, которому в качестве параметра передается целое число,
//* метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//* Замечание: ноль считаем положительным числом.
    public static void isPositive1(int variable) {
        if (variable >= 0) {
            System.out.println(variable + "is positive");
        } else {
            System.out.println(variable + "is negative");
        }
    }


    // 3. Написать метод, которому в качестве параметра передается целое число.
    //* Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    static boolean doThree(int a) {
        System.out.println("\nЗадание 3.");
        if (a < 0) return true;
        return false;
    }

    // 4. Написать метод, которому в качестве аргументов передается строка и число,
    //* метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void methodPrintStringCount(String value, int count) {
        for (int i = 0; i <= count; i++) {
            System.out.println("String #" + i + ": " + value);
        }
    }

    // 5. Написать метод, который определяет, является ли год високосным,
//* и возвращает boolean (високосный - true, не високосный - false).
//* Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void doFive(int year) {
        System.out.println("\nЗадание 5.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }


}
