package TH_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Kien", 40, "HT", 1);
        Student student1 = new Student("Nam", 26, "HN", 2);
        Student student2 = new Student("Nam", 39, "HT", 3);
        Student student3 = new Student("Tung", 37, "HT", 4);
        Student student4 = new Student("Linh", 37, "HT", 5);

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);

//        Collections.sort(lists);
//        for(Student st : lists){
//            System.out.println(st.toString());
//        }


        Collections.sort(lists, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getName().equals(s2.getName())) {
                    return s1.getId() - s2.getId();
                }
                return s2.getAge() - s1.getAge();
            }
        });
        System.out.println("So sanh theo tuoi:");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}

