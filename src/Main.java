import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    //Задание 1
    private static void printLeapYear (int leapYear) {
        System.out.println(leapYear + " год является високосным");
    }
    private static void printNotLeapYear (int notLeapYear) {
        System.out.println(notLeapYear + " год не является високосным");
    }

    private static void task1() {
        // Здесь пишем код первого задания
        int year = 2022;

        if (year %4==0 && year %100 > 0 || year %400==0) {
            printLeapYear(year);
        } else {
            printNotLeapYear(year);
        }
    }

    //Задание 2
    private static void printClient (int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

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

    private static void task2() {

        int clientOS = 1;
        int clientDeviceYear = 2017;

        printClient(clientOS, clientDeviceYear);
    }

    //Задание 3
    private static int dayDeliveryDistance (int deliveryDistance, int day) {
            int dayDelivery = day;

            if (deliveryDistance > 20) {
                dayDelivery++;
            }
            if (deliveryDistance > 60) {
                dayDelivery++;
            }
            return dayDelivery;
    }

    private static void task3() {
        int deliveryDistance = 95;
        int day=1;

        dayDeliveryDistance(deliveryDistance, day);

        int resultDay = dayDeliveryDistance(deliveryDistance, day);
        System.out.println(resultDay);
    }

}