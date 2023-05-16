public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == 1) {
            System.out.println("Утановите версию приложения для Android по ссылке.");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOs = 0;
        int clientDeviceYear = 2015;
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Утановите версию приложения для iOS по ссылке.");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Утановите версию приложения для Android по ссылке.");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }
    public static void task4() {
            System.out.println("Задача 4");
            int deliveryDistance = 95;
            if (deliveryDistance < 20) {
                System.out.println("Потребуются сутки");
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Потребуется два дня");
            } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
                System.out.println("Потребуется три дня");
            } else if (deliveryDistance >= 100) {
                System.out.println("Досавки нет");
            }
        }
    public static void task5() {
         System.out.println("Задача 5");
         int monthNumber = 12;
         switch (monthNumber) {
           case 12:
           case 1:
           case 2:
             System.out.println("Зимний месяц");
             break;
           case 3:
           case 4:
           case 5:
              System.out.println("Весенний месяц");
              break;
           case 6:
           case 7:
           case 8:
              System.out.println("Летний месяц");
              break;
           case 9:
           case 10:
           case 11:
              System.out.println("Осенний месяц");
              break;
           default:
               System.out.println("Месяца не существует");
            }
        }
    }

