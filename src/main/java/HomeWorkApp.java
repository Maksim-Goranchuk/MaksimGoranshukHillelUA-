package HomeWorkApp;
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(less6_6(1, 9));
        less6_7(10);
        System.out.println(less6_8(9));
        less6_9("Брашпиль ", 3);
        System.out.println(less6_10(4));
    }
    public static void printThreeWords() {
        System.out.println("Apple");
        System.out.println("Orange");
        System.out.println("Banana");

    }
    public static void checkSumSign() {
        int a = -5;
        int b = 1;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 16;
        int b = 15;

        if (a >= b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }
    }
    public static boolean less6_6 (int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }
    public static void less6_7 (int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отприцательное");
        }
    }
    public static boolean less6_8 (int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void less6_9 (String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
    public static boolean less6_10 (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }

    }
}

