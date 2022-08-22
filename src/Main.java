import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    //Задание 1
    public static void printLeapYear (int leapYear) {
        System.out.println(leapYear + " год является високосным");
    }
    static void printNotLeapYear (int notLeapYear) {
        System.out.println(notLeapYear + " год не является високосным");
    }

    public static void task1() {
        // Здесь пишем код первого задания
        int year = 2022;

        if (year %4==0 && year %100 > 0 || year %400==0) {
            printLeapYear(year);
        } else {
            printNotLeapYear(year);
        }
    }

    //Задание 2
    static void printClient (int clientOS, int currentYear, int clientDeviceYear) {

        if (clientOS == 1 && clientDeviceYear > currentYear) {
            System.out.println("Установите lite-версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > currentYear) {
            System.out.println("Установите lite-версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task2() {

        int clientOS = 1;
        int clientDeviceYear = 2017;
        int currentYear = LocalDate.now().getYear();

        printClient(clientOS, clientDeviceYear, currentYear);
    }

    //Задание 3
    static int dayDeliveryDistancePrint (int deliveryDistance, int day) {
            int dayDelivery = day;

            if (deliveryDistance > 20) {
                dayDelivery++;
            }
            if (deliveryDistance > 60) {
                dayDelivery++;
            }
            System.out.println(dayDelivery);
            return dayDelivery;
    }

    public static void task3() {
        int deliveryDistance = 95;
        int day=1;

        dayDeliveryDistancePrint(deliveryDistance, day);

    }

}