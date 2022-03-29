package HW5;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Иванов Иван", "junior janitor", "ivanov@mail.test",
                "123456", 10000, 20);
        employee1.printEmployeeInfo();


        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов Иван", "junior janitor", "ivanov@mail.test",
                "123456", 10000, 34);
        employeeArray[1] = new Employee("Петров Петр", "middle janitor", "petrov@mail.test",
                "132213", 15000, 56);
        employeeArray[2] = new Employee("Сидоров Сидор", "senior janitor", "sidorov@mail.test",
                "234324", 20000, 21);
        employeeArray[3] = new Employee("Николаев Николай", "cleaning architect", "nikolaev@mail.test",
                "4324324", 25000, 43);
        employeeArray[4] = new Employee("Васильев Василий", "CEO", "vasiliev@mail.test",
                "324322", 30000, 40);

        for (int i = 0; i < employeeArray.length; i++) {

            if (employeeArray[i].age > 40){
                employeeArray[i].printEmployeeInfo();
            }
            
        }



    }
}
