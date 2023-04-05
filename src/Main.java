
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void chekYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год — високосный год.");
        } else {
            System.out.println(year + " год — невисокосный год.");
        }
    }

    public static void chekOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        chekYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int typeOs = 0; // 0 — iOS, 1 — Android
        int yearsOfIssue = 2010;
        chekOS(typeOs, yearsOfIssue);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        if (deliveryDays == 0) {
            System.out.println("Упс! Так далеко мы не возим");
        } else {
            System.out.println("Дней доставки: " + deliveryDays);
        }
    }
}