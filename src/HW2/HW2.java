package HW2;

public class HW2 {

    public static void main(String[] args) {
        System.out.println(twoNumbers(2, 999)); //в задании написан только возврат, но для наглядности вывел в консоль

        isPositiveInConsole(-9999999);

        System.out.println(isPositiveBoolean(33333));// так же для наглядности вывел в консоль

        stringAndNumber("it's a java", 3);

        System.out.println(detectYear(2007)); //так же для наглядности вывел в консоль
    }


    public static boolean twoNumbers(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void isPositiveInConsole(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isPositiveBoolean(int a) {
        return a >= 0;
    }

    public static void stringAndNumber(String str, int num) {

        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }

    public static boolean detectYear(int year) {

        return year % 4 == 0 || year % 100 == 0 || year % 400 == 0;

    }
}

