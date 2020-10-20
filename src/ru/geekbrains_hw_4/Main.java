package ru.geekbrains_hw_4;

public class Main {
    public static void main(String[] args) { sortEmployeeByAge(employeeGenerator());}

    public static Employee[] employeeGenerator(){
        Employee employee1 = new Employee();
        employee1.setName("Tom");
        employee1.setSurname("Ford");
        employee1.setAge(35);
        employee1.setSalary(40000);

        Employee employee2 = new Employee("Kate", "Floo", 42, 40000);
        Employee employee3 = new Employee("John", "Fell", 40, 40000);
        Employee employee4 = new Employee("Deen", "Doo", 30, 85000);
        Employee employee5 = new Employee("Lena", "Moore", 52, 100000);

        Employee[] emArray = new Employee[5];
        emArray[0] = employee1;
        emArray[1] = employee2;
        emArray[2] = employee3;
        emArray[3] = employee4;
        emArray[4] = employee5;
        return emArray;

    }
    public static void sortEmployeeByAge (Employee [] employees){
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println("Возраст больше 40 лет " + employee.getName());
            }
        }
    }
}