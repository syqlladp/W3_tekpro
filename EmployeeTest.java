public class EmployeeTest {

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // 🔹 Panggil compare
        int hasil = staff[0].compare(staff[1]);

        if (hasil < 0)
            System.out.println("Staff[0] gajinya lebih kecil dari Staff[1]");
        else if (hasil > 0)
            System.out.println("Staff[0] gajinya lebih besar dari Staff[1]");
        else
            System.out.println("Gaji Staff[0] dan Staff[1] sama");

        // 🔹 Naikkan gaji 5%
        for (int i = 0; i < 3; i++) {
            staff[i].raiseSalary(5);
        }

        System.out.println("\nSetelah kenaikan gaji:");
        for (int i = 0; i < 3; i++) {
            staff[i].print();
        }

        // 🔹 Sorting berdasarkan salary
        Sortable.shell_sort(staff);

        System.out.println("\nSetelah diurutkan:");
        for (int i = 0; i < 3; i++) {
            staff[i].print();
        }
    }
}