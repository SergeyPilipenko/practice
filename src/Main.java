public class Main {
    public static void main(String[] args) {

        Employee Serg = new Employee("Serg");
        Department dep1 = new Department("dep1", Serg);
        Employee Alex = new Employee("Alex");
        Alex.setDepartment(dep1);

        Department dep2 = new Department("dep2");
        Employee Petr = new Employee("Petr", dep2);
        Employee Vlad = new Employee("Vlad");
        dep2.setBoss(Vlad);

        System.out.println(Serg);
        System.out.println(Alex);
        System.out.println(Petr);
        System.out.println(Vlad);

        Serg.setDepartment(dep2);
        dep1.setBoss(Petr);

        System.out.println("------------------------");

        System.out.println(Serg);
        System.out.println(Alex);
        System.out.println(Petr);
        System.out.println(Vlad);
    }
}
