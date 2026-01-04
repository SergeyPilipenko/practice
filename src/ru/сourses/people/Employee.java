package ru.сourses.people;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        if (name.equals(department.getBoss().getName())) {
            return String.format("%s начальник отдела %s", name, department.getName());
        }
        return String.format("%s работает в %s", name, department);
    }
}
