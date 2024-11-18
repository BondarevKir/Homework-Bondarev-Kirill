package Lession_4;

public class Main {
    public static void main(String[] args) {
        Employee Ivan = new Employee("Иван", "Москаленко", "Андреевич", "Менеджер", "UncleIvan@mail.ru", 89280172452L, 50000, 56);
        Ivan.display();

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Dege Legg", "Driver", "dleg@gmail.com", 89682402768L, 35000, 61);
        persArray[1] = new Person("Pavel Fedorov", "Teacher", "pavelpavel.mail.ru", 89087341189L, 44000, 23);
        persArray[2] = new Person("Vasily Kislov", "Security", "VKislov@gmail.com", 89519825052L, 17750, 34);
        persArray[3] = new Person("Danil Grankin", "Director", "GDRankin@yanex.ru", 89186122783L, 85000, 50);
        persArray[4] = new Person("Yuri Katinsky", "Secretary", "YuriKatinsky@gmail.com", 89289546539L, 46000, 29);

        Park.Attraction attraction1 = new Park().new Attraction("Американские горки", 18, 600, 20);
        Park.Attraction attraction2 = new Park().new Attraction("Ладья", 7, 400, 54);
        Park.Attraction attraction3 = new Park().new Attraction("Вечный двигатель", 16, 500, 24);
        Park.Attraction attraction4 = new Park().new Attraction("Квантовый Скачок", 16, 500, 32);
        Park.Attraction attraction5 = new Park().new Attraction("Катапульта", 10, 400, 20);
        attraction1.attractionDisplay();
        attraction2.attractionDisplay();
        attraction3.attractionDisplay();
        attraction4.attractionDisplay();
        attraction5.attractionDisplay();
    }
}
