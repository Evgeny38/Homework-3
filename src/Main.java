public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задача 1
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else {
            System.out.println("Установите приложение для Android по ссылке");
        }

        // Задача 2
        int phoneReleaseDate = 2014;
        if (clientOs == 0 && phoneReleaseDate >= 2015) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else {
            if (clientOs == 0 && phoneReleaseDate < 2015) {
                System.out.println("Установите облегченное приложение для iOS по ссылке");
            }
        }
        if (clientOs == 1 && phoneReleaseDate >= 2015) {
            System.out.println("Установите приложение для Android по ссылке");
        } else {
            if (clientOs == 1 && phoneReleaseDate < 2015) {
                System.out.println("Установите облегченное приложение для Android по ссылке");
            }


        }

        // Задача 3
        int year = 2100;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        // Задача 4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance <=20 ) {
            deliveryDays = 1;
        }else{
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval) ;
        }
        System.out.println("Потребуется дней : " + deliveryDays);

        //Задача 5
        int monthNumber = 3;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
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
        }
    }
}

