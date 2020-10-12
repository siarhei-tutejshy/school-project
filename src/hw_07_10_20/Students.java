package hw_07_10_20;
import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    String name;
    String surname;
    String dateOfBirthday;
    int course;

    public Students(String name, String surname, String dateOfBirthday, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getDateOfBirthday() {
        return dateOfBirthday;
    }
    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudent(ArrayList<Students> students, int course) {
        for (Students i : students) {
            if (i.getCourse() == course) {
                System.out.println(i.toString());
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("enter course");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Ivan", "Ivanov", "02.01.2001", 1));
        students.add(new Students("Fedor", "Pavlov", "25.03.97", 3));
        students.add(new Students("Valery", "Victorov", "15.03.1999", 2));
        students.add(new Students("Victor", "Petrov", "18.09.2000", 2));
        Students.printStudent(students, x);
    }
}

















