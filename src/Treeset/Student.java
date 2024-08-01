package Treeset;

public class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {

        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student other) {
        return this.course-other.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                '}';
    }
}
