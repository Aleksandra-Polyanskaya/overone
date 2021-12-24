package Lesson17;

public class Student extends Person{
String university;

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    void printStudentAndUniver(){
        System.out.println(getName() + university);
    }
}
