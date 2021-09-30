package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomCollection {
    public static void main(String[] args) {
        List<Student> ara = new ArrayList<>();
        
        Student student = new Student();
        student.name = "mdshohed"; 
        student.id = "2019000000103";
        student.section = 3;
        ara.add(student);

        Student student1 = new Student();
        student1.name = "Nadim";
        student1.id = "2019000000050";
        student1.section = 2;
        ara.add(student1);

        Collections.sort(ara);

        for(Student i:ara) {
            System.out.println(i.toString());
        }
    }

    /**
     * Student Class
     */
    static class Student implements Comparable<Student> {
        String name;
        String id;
        int section;
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", id='" + id + '\'' +
                    ", section=" + section +
                    '}';
        }

        /**
         * @param o object parameter
         * @return sort Function
         */
        @Override
        public int compareTo(Student o) {
            return Integer.compare(o.section,section);
        }
    }
}
