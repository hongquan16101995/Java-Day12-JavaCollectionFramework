package TH_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 39, "HT" );
        Student student3 = new Student("Tung", 37, "HT" );
        Student student4 = new Student("Linh", 37, "HT" );

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);

        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }

        Age age = new Age();
        Collections.sort(lists,age);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}
