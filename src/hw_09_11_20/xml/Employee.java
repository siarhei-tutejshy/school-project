package hw_09_11_20.xml;

public class Employee {
    private String name, surname, departmentPosition, expirience, departmentName;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDepartmentPosition() {
        return departmentPosition;
    }

    public String getExpirience() {
        return expirience;
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public Employee(String name, String surname, String departmentPosition, String expirience, String departmentName) {
        this.name = name;
        this.surname = surname;
        this.departmentPosition = departmentPosition;
        this.expirience = expirience;
        this.departmentName = departmentName;

    }
}
