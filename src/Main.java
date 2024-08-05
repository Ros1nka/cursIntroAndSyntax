
public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Машков", "Владимир", "Львович", 1, 89);
        employees[1] = new Employee("Хабенский", "Константин", "Юрьевич", 3, 87);
        employees[2] = new Employee("Яковлева", "Елена", "Алексеевна", 4, 71);
        employees[3] = new Employee("Петренко", "Игорь", "Петрович", 2, 75);
        employees[4] = new Employee("Агуреева", "Полина", "Владимировна", 2, 66);
        employees[5] = new Employee("Безруков", "Сергей", "Витальевич", 1, 94);
        employees[6] = new Employee("Боярская", "Елизавета", "Михайловна", 4, 73);
        employees[7] = new Employee("Меньшиков", "Олег", "Евгеньевич", 5, 87);
        employees[8] = new Employee("Ходченкова", "Светлана", "Викторовна", 5, 75);
        employees[9] = new Employee("Пересильд", "Юлия", "Сергеевна", 2, 91);


        Utils.viewAll(employees);
        System.out.println();

        System.out.println("Сумма затрат на ЗП в месяц = " + Utils.monthSum(employees));
        System.out.println();

        System.out.println("Сотрудник с минимальной ЗП: " + employees[Utils.minSalaryEmployee(employees)].getIdAndName());
        System.out.println();

        System.out.println("Сотрудник с максимальной ЗП: " + employees[Utils.maxSalaryEmployee(employees)].getIdAndName());
        System.out.println();

        System.out.println("Среднее значение зарплат = " + Utils.averageSalary(employees));
        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getPatronymic());
        }
        System.out.println();

        //Повышенная сложность
        int indexingPercentage = 10;
        Utils.indexTheSalary(employees, indexingPercentage);

        int departmentNumber = 2;
        System.out.println("Сотрудник с минимальной ЗП в отделе №" + departmentNumber +
                ": " + employees[Utils.minSalaryDepartment(employees, departmentNumber)].getIdAndName());
        System.out.println();

        System.out.println("Сотрудник с максимальной ЗП в отделе №" + departmentNumber +
                ": " + employees[Utils.maxSalaryDepartment(employees, departmentNumber)].getIdAndName());
        System.out.println();

        System.out.println("Сумма затрат на ЗП по отделу №" + departmentNumber +
                ": " + Utils.sumSalaryDepartment(employees, departmentNumber));
        System.out.println();

        System.out.println("Средняя ЗП по отделу №" + departmentNumber +
                ": " + Utils.averageSalaryDepartment(employees, departmentNumber));
        System.out.println();

        int indexingPercentageDepartment = 15;
        Utils.indexTheSalaryDepartment(employees, departmentNumber, indexingPercentageDepartment);

        Utils.printEmployeesDeportment(employees, departmentNumber);

        int parameter = 80;
        Utils.printSalaryIsLess(employees, parameter);
        Utils.printSalaryIsMore(employees, parameter);
    }
}