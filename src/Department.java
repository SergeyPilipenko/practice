public class Department {
    private String name;
    private Employee boss;

    public Department(String name) {
        this.name = name;
    }

    public Department(String name, Employee boss) {
        this.name = name;
        this.boss = boss;
        this.boss.setDepartment(this);
    }

    public String getName() {
        return name;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
        this.boss.setDepartment(this);
    }

    public Employee getBoss() {
        return boss;
    }

    @Override
    public String toString() {
        return String.format("%s, начальник которого %s", name, boss.getName());
    }
}
