public class Utils {
    public static void viewAll(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
        System.out.println();
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

    public static double averageSalary(Employee[] employees) {
        return monthSum(employees) / employees.length;
    }

    public static void indexTheSalary(Employee[] employees, int arg) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * (1 + (double) arg / 100));
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

    public static double sumSalaryDepartment(Employee[] employees, int departmentNumber) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += departmentNumber == employee.getDepartment() ? employee.getSalary() : 0;
        }
        return sum;
    }

    public static double averageSalaryDepartment(Employee[] employees, int departmentNumber) {
        int count = 0;
        for (Employee employee : employees) {
            count += departmentNumber == employee.getDepartment() ? 1 : 0;
        }
        return sumSalaryDepartment(employees, departmentNumber) / count;
    }

    public static void indexTheSalaryDepartment(Employee[] employees, int departmentNumber, int arg) {
        for (Employee employee : employees) {
            if (departmentNumber == employee.getDepartment()) {
                employee.setSalary(employee.getSalary() * (1 + (double) arg / 100));
            }
        }
    }

    public static void printEmployeesDeportment(Employee[] employees, int departmentNumber) {
        System.out.println("Сотрудники отдела №" + departmentNumber + ":");
        for (Employee employee : employees) {
            if (departmentNumber == employee.getDepartment()) {
                System.out.printf("    " + employee.getId() + " " + employee.getLastName() + " " + employee.getFirstName() +
                        " " + employee.getPatronymic() + ", ЗП= %.2f%n", employee.getSalary());
            }
        }
        System.out.println();
    }

    public static void printSalaryIsLess(Employee[] employees, int parameter) {
        boolean isNone = true;
        System.out.println("Сотрудники с ЗП меньше " + parameter + ":");
        for (Employee employee : employees) {
            if (employee.getSalary() < parameter) {
                System.out.printf("    " + employee.getId() + " " + employee.getLastName() + " " + employee.getFirstName() +
                        " " + employee.getPatronymic() + ", ЗП= %.2f%n", employee.getSalary());
                isNone = false;
            }
        }
        if (isNone) {
            System.out.println("    Таких сотрудников нет");
        }
        System.out.println();
    }

    public static void printSalaryIsMore(Employee[] employees, int parameter) {
        boolean isNone = true;
        System.out.println("Сотрудники с ЗП больше " + parameter + ":");
        for (Employee employee : employees) {
            if (employee.getSalary() >= parameter) {
                System.out.printf("    " + employee.getId() + " " + employee.getLastName() + " " + employee.getFirstName() +
                        " " + employee.getPatronymic() + ", ЗП= %.2f%n", employee.getSalary());
                isNone = false;
            }
        }
        if (isNone) {
            System.out.println("    Таких сотрудников нет");
        }
        System.out.println();
    }
}

