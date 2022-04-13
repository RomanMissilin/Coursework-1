package ru.skypro;

public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Егор Петров Алексеевич ", 300, 1);
        employees[1] = new Employee("Иван Иванов Иванович ", 530, 2);
        employees[2] = new Employee("Светлана Аркадьевна Андреевна ", 120, 3);
        employees[3] = new Employee("Сергей Родин Николаевич ", 500, 2);
        employees[4] = new Employee("Елизавета Пернчук Артёмовна ", 250, 4);
        employees[5] = new Employee("Артём Панин Романович ", 290, 3);
        employees[6] = new Employee("настасия Антовнов Петрович ", 680, 5);
        employees[7] = new Employee("Аркадий Миронов Абдулаиевич ", 940, 5);
        employees[8] = new Employee("Анатолий Сирновер Сергеевич ", 330, 4);
        employees[9] = new Employee("София Акимовна Адовна ", 430, 1);

        printEmployees();
        System.out.println(minSalary());
        System.out.println(maxSalary());
        System.out.println(printAverageSalary());
        System.out.println(printSalaryEmployees());
        System.out.println("Имя сотрудника - " + nameEmployees());
    }

    public static void printEmployees() {

        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public static Employee minSalary() {

        int min = employees[0].getSalary();
        Employee Employees = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() < min) {
                min = e.getSalary();
                Employees = e;
            }
        }
        return Employees;
    }

    public static Employee maxSalary() {

        int min = employees[0].getSalary();
        Employee Employees = employees[0];
        for (Employee i : employees) {
            if (i.getSalary() > min) {
                min = i.getSalary();
                Employees = i;
            }
        }
        return Employees;
    }

    public static Employee printAverageSalary() {

        int mean = employees[0].getSalary();
        Employee Employees = employees[0];
        for (Employee employee : employees) {
            mean += employee.getSalary();
            Employees = employee;
        }
        return Employees;
    }

    public static int printSalaryEmployees() {

        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static String nameEmployees() {

        StringBuilder name = new StringBuilder(employees[0].getName());
        for (Employee employee : employees) {
            name.append(employee.getName());
        }
        return name.toString();
    }
}