
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача1");
        int clientOS = 1;
        int iOs = 0;
        int android = 1;
        if (clientOS == iOs) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("У вас другая операционная система");
        }
    }
    public static void task2 () {
        System.out.println("Задача2");
        int clientOS = 3;
        int clientDeviceYear = 2015;
        int iOs = 0;
        int android = 1;
        int checkYear = 2015;
        if (clientOS == iOs && clientDeviceYear >= checkYear) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS == iOs && clientDeviceYear < checkYear){
            System.out.println("Установите упрощённую версию приложения для iOS по ссылке");
        } else if (clientOS == android && clientDeviceYear >= checkYear) {
            System.out.println("Установите обычную версию приложения для android по ссылке");
        } else if (clientOS == android && clientDeviceYear < checkYear)  {
            System.out.println("Установите упрощённую версию приложения для android по ссылке");
        } else {
            System.out.println("У вас другая операционная система");
        }
    }
    public static void task3 () {
        System.out.println("Задача3");
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
    public static void task4 () {
        System.out.println("Задача4");
        byte deliveryDistance = 59;
        byte numberOfDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + numberOfDays);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (numberOfDays + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (numberOfDays + 2));
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5 () {
        System.out.println("Задача5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого сезона не существует");
        }
    }
}