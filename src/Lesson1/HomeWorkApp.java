package Lesson1;

/**
 * Created by Daria
 */

public class HomeWorkApp {
    // 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
    public static void main(String[] args) {

        printThreeWords();

        System.out.println("*******");

        if (checkSumSign(10, 5))
        {
            System.out.println("Sum positive");
        } else{
            System.out.println("Sum negative");
        }
        System.out.println("*******");
        int value;
        System.out.println(printColor(102));
        System.out.println(printColor(-5));
        System.out.println(printColor(50));

        System.out.println("*******");
        System.out.println(compareNumber(20, 15));


    }

    // 2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    private static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }
    // 3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
    //Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
    //то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static boolean checkSumSign(int a, int b) {
        return (a + b) >= 0; //10+5 >=0{
//
    }


    // 4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
//Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
//если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
//если больше 100 (100 исключительно) - “Зеленый”;
    private static String printColor(int value) {
        if (value <= 0 ) {
            return "Красный";
        } else if (value > 0 && value <= 100) {
            return "Желтый";
        } else {
            return "Зеленый";
        }
    }

    // 5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
    //и инициализируйте их любыми значениями, которыми захотите.
    //Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static String compareNumber(int a, int b) {
        if (a >= b) {
            return "a >= b";
        } else {
            return "a < b";
        }
    }



}









