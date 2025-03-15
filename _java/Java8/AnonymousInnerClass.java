package _java.Java8;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Employee employee = new Employee() {
            @Override
            public String getSalary() {
                return "10000";
            }

            @Override
            public String getDesignation() {
                return "Developer";
            }
        };
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Designation: " + employee.getDesignation());
    }
}

interface Employee {
    String getSalary();

    String getDesignation();
}