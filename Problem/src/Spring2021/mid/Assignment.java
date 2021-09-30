package Spring2021.mid;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sCount = scanner.nextInt();
        Faculty faculty = new Faculty();
        if (sCount>1 ) {
            Student student = new Student();

            Student s1 =  new Student();
            Student s2 =  new Student();
            Student s3 =  new Student();

            Student[] sGroup = {s1,s2,s3};

            student.setGroup(sGroup);

            student.send(student.getGroup(),faculty);
        }
        else {
            Student student = new Student();

            Student s1 =  new Student();
            Student s2 =  new Student();
            Student s3 =  new Student();

            Student[] sGroup = {s1,s2,s3};

            student.setGroup(sGroup);

            student.send(student.getGroup(),faculty);
        }
    }
}

class Faculty extends Person implements Notification {

    @Override
    public void send(Group group, Faculty faculty) {
        Arrays.stream(group.students).forEach(student -> {
            student.get(group, faculty);
        });
    }
    @Override
    public void get(Group group, Faculty faculty) {
        System.out.println( "Ok from student");
        send( group, faculty);
    }
}

class Student extends Person implements Notification {
    Group group;
    Random random;
    Student(){
        random = new Random();
    }
    public void setGroup(Student[] students) {
        group = new Group(String.valueOf(random.nextBoolean()), students);
    }
    public Group getGroup() {
        return this.group;
    }

    @Override
    public void send(Group group, Faculty faculty) {
        faculty.get(group, faculty);
    }
    @Override
    public void get(Group group, Faculty faculty) {
        System.out.println( "ok form faculty");
    }
}

class Person {

}

class Group {
    String gID;
    Student[] students;
    public Group(String gID, Student[] students) {
        this.gID = gID;
        this.students = students;
    }
}

interface Notification {
    void send(Group group, Faculty faculty);
    void get( Group group, Faculty faculty);
}

