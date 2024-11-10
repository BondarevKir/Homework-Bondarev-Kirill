public class Employee {
    public static void main(String[] args) {
        Employee Ivan = new Employee("Иван", "Москаленко", "Андреевич", "Менеджер", "UncleIvan@mail.ru", 89280172452L, 50000, 56);
        Ivan.display();
    }

    String firstName;
    String lastName;
    String patronymic;
    String position;
    String email;
    long phoneNumber;
    int salary;
    int age;

    Employee(String firstName, String lastName, String patronymic, String position, String email, long phoneNumber, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.email = email;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void display() {
        System.out.println("Имя: " + firstName + "\nФамилия: " + lastName + "\nОтчество: " + patronymic + "\nEmail: " + email + "\nДолжность: " + position + "\nТелефон: " + phoneNumber + "\nЗарплата: " + salary + "\nВозраст: " + age);
    }
}
