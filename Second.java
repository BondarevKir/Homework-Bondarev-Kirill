public class Second {
    String name;
    String position;
    String email;
    long phoneNumber;
    int salary;
    int age;

    Person(String name, String position, String email, long phoneNumber, int salary, int age) {
        this.name = name;
        this.email = email;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Dege Legg", "Driver", "dleg@gmail.com", 89682402768L, 35000, 61);
        persArray[1] = new Person("Pavel Fedorov", "Teacher", "pavelpavel.mail.ru", 89087341189L, 44000, 23);
        persArray[2] = new Person("Vasily Kislov", "Security", "VKislov@gmail.com", 89519825052L, 17750, 34);
        persArray[3] = new Person("Danil Grankin", "Director", "GDRankin@yanex.ru", 89186122783L, 85000, 50);
        persArray[4] = new Person("Yuri Katinsky", "Secretary", "YuriKatinsky@gmail.com", 89289546539L, 46000, 29);
    }
}
