package TH_comparator;

import java.util.Comparator;

public class Age implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getAge() > s2.getAge()){
            return 1;
        }else if(s1.getAge() == s2.getAge()){
            return 0;
        }
        return -1;
    }
}
