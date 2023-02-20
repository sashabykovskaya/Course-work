public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Петр Николаевич", 1, 80000);
        employees[1] = new Employee("Петров Семен Игнатьевич", 2, 72000);
        employees[2] = new Employee("Новиков Никита Леонидович", 3, 94000);
        employees[3] = new Employee("Краснова Мария Матвеевна", 4, 71000);
        employees[4] = new Employee("Смирнова Екатерина Павловна", 5, 68000);
        employees[5] = new Employee("Шаповалов Олег Олегович", 1, 63000);
        employees[6] = new Employee("Лебедева Татьяна Егоровна", 2, 96000);
        employees[7] = new Employee("Попов Владимир Данилович", 3, 76000);
        employees[8] = new Employee("Васильева Надежда Сергеевна", 4, 57000);
        employees[9] = new Employee("Кузнецов Валерий Витальевич", 5, 87000);
        printEmployees(employees);
        printNamesEmployees(employees);

        System.out.println("Сумма всех зарплат = " + getSalarySum(employees));
        System.out.println("Сотрудник с минимальной зарплатой: " + getMinSalary(employees));
        System.out.println("Сотрудник с максимальной зарплатой: " + getMaxSalary(employees));
        System.out.println("Средняя зарплата за месяц = " + getAverageSalary(employees));
    }

    private static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int getSalarySum(Employee[] employees) {
        int salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        return salarySum;
    }

    private static Employee getMinSalary(Employee[] employees) {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < result.getSalary()) {
                result = employee;
            }
        }
        return result;
    }

    private static Employee getMaxSalary(Employee[] employees) {
        Employee result2 = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > result2.getSalary()) {
                result2 = employee;
            }
        }
        return result2;
    }

    private static double getAverageSalary(Employee[] employees) {
        int salarySum = getSalarySum(employees);
        return (double) salarySum/employees.length;
    }

    private static void printNamesEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}