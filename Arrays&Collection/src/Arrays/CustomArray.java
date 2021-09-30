package Arrays;

public class CustomArray {
    public static void main(String[] args) {
        Student ara[] = new Student[100];
        Student x1 = new Student( "mdshohed", "2019000000014", 1 );
        Student x2 = new Student( "Tusar", "2019000002344", 1 );
        Student x3 = new Student( "Joy", "20190000000894", 1 );
        Student x4 = new Student( "Mamun", "2019000000204", 1 );
        ara[0] = x1;
        ara[1] = x2;
        ara[2] = x3;
        ara[3] = x4;
        for (Student i:ara) {
            System.out.println(i.toString());
        }
    }

    /**
     * Student Class
     */
    static class Student {
        String name;
        String id;
        int section;
        public Student(String name, String id, int section) {
            this.name = name;
            this.id = id;
            this.section = section;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", id='" + id + '\'' +
                    ", section=" + section +
                    '}';
        }
    }
}

