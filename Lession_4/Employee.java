package Lession_4;

public class Employee {
    public String firstName;
    public String lastName;
    public String patronymic;
    public String position;
    public String email;
    public long phoneNumber;
    public int salary;
    public int age;

    public Employee(String firstName, String lastName, String patronymic, String position, String email, long phoneNumber, int salary, int age) {
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
