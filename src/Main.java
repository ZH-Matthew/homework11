import java.util.Scanner;

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
            System.out.println(year + " год — не високосный год.");
        }
    }

    public static void chekOS(int clientOS, int clientDeviceYear) {
        System.out.println("Установите " + (clientDeviceYear < 2015 ? "облегченную" : "") + " версию приложения для " + (clientOS == 1 ? "Android" : "iOS") + " по ссылке");
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        chekYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Какая ОС на вашем телефоне? Если iOS - введите 0 , если Android введите 1");
        int typeOs = sc.nextInt(); // 0 — iOS, 1 — Android
        System.out.println("Какого года выпуска ваш телефон?");
        int yearsOfIssue = sc.nextInt();
        chekOS(typeOs, yearsOfIssue);
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

    public static void task3() {
        System.out.println("Задача 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Для рассчета времени доставки введите, пожалуйста, удаленность от склада в киллометрах:");
        int deliveryDistance = sc.nextInt();
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        if (deliveryDays == 0) {
            System.out.println("Упс! Так далеко мы не возим");
        } else {
            System.out.println("Дней доставки: " + deliveryDays);
        }
        sc.close();
    }
}