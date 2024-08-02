public class Main {
    public static void main(String[] args) {

        Employee[] staff = new Employee[10];

        staff[0] = new Employee("Машков", "Владимир", "Львович", 1, 99);
        staff[1] = new Employee("Хабенский", "Константин", "Юрьевич", 3, 87);
        staff[2] = new Employee("Яковлева", "Елена", "Алексеевна", 4, 71);
        staff[3] = new Employee("Петренко", "Игорь", "Петрович", 2, 75);
        staff[4] = new Employee("Агуреева", "Полина", "Владимировна", 2, 75);
        staff[5] = new Employee("Безруков", "Сергей", "Витальевич", 2, 75);


        for (int i =0 ; i < staff.length; i++) {
            System.out.println(staff[i].toString());
        }
    }
}