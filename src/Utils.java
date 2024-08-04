public class Utils {
    public static void viewAll(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static double monthSum(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static int minSalaryEmployee(Employee[] employees) {
        double min = employees[0].getSalary();
        int id = 0;
        for (int i = 1; i < employees.length; i++) {
            if (min > employees[i].getSalary()) {
                min = employees[i].getSalary();
                id = i;
            }
        }
        return id;
    }

    public static int maxSalaryEmployee(Employee[] employees) {
        double max = employees[0].getSalary();
        int id = 0;
        for (int i = 1; i < employees.length; i++) {
            if (max < employees[i].getSalary()) {
                max = employees[i].getSalary();
                id = i;
            }
        }
        return id;
    }

    public static double averangeSalary(Employee[] employees) {
        return (double) monthSum(employees) / employees.length;
    }

    public static void indexOfSalary(Employee[] employees, int arg) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary(employees[i].getSalary() * (1 + (double) arg / 100));
        }
    }

    public static int minSalaryDepartment(Employee[] employees, int departmentNumber) {
        int id = 0;
        double min = Double.MAX_VALUE;
        for (int i = 1; i < employees.length; i++) {
            if (departmentNumber == employees[i].getDepartment() && min > employees[i].getSalary()) {
                min = employees[i].getSalary();
                id = employees[i].getId();
            }
        }
        return id;
    }

    public static int maxSalaryDepartment(Employee[] employees, int departmentNumber) {
        int id = 0;
        double max = Double.MIN_VALUE;
        for (int i = 1; i < employees.length; i++) {
            if (departmentNumber == employees[i].getDepartment() && max < employees[i].getSalary()) {
                max = employees[i].getSalary();
                id = employees[i].getId();
            }
        }
        return id;
    }
}
