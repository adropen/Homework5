
void main() {
    System.out.println("задача 1");
    int clientOS = 0;
    if (clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (clientOS == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");

    }
    System.out.println("Задача 2");
    int clientDeviceYear = 2010;
    if (clientOS == 0 && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (clientOS == 0 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else if (clientOS == 1 && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для Android по ссылке");
    } else {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }
    System.out.println("Задача 3");
    int year = 400;
    if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println(year + " год является високосным");
    } else {
        System.out.println(year + " год не является високосным");
    } //я понимаю, что третья задача решена не верна, ну или решена, но только частично, не могли бы вы объяснить, как решить её правильно?
    System.out.println("Задача 4");
    int deliveryDistance = 95;
    if (deliveryDistance <= 20) {
        System.out.println("Потребуется один день");
    }else if (deliveryDistance > 20 && deliveryDistance <= 60) {
        System.out.println("Потребуется два дня");
    }else if (deliveryDistance > 60 && deliveryDistance <= 100) {
        System.out.println("Потребуется три дня");
    }else {
        System.out.println("Доставки нет");
    } //понимаю, что это задание не выполнил до конца, но не понимаю,
    // как сделать чтоб с каждым следующим интервалом доставки срок увеличивается на 1 день.
    // в теории ни где об этом не описывается, может я конечно не просмотрел некоторые уроки
    System.out.println("Задача 5");
    int monthNumber = 65;
    switch (monthNumber) {
        case 7, 6, 8 -> System.out.println("Лето");
        case 9, 10, 11  -> System.out.println("Осень");
        case 12, 1, 2  -> System.out.println("Зима");
        case 3, 4, 5  -> System.out.println("Весна");
        default -> System.out.println("Такого месяца нет");
    }
}
