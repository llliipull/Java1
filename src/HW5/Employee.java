package HW5;

public class Employee {

    String nameSurname;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String nameSurname, String position, String email,
                    String phoneNumber, int salary, int age) {

        this.nameSurname = nameSurname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

     public void printEmployeeInfo() {

        System.out.println("Имя и фамилия: " + nameSurname);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();

    }

}
