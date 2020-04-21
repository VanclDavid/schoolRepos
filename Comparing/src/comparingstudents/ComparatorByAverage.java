package comparingstudents;

import java.util.Comparator;


public class ComparatorByAverage implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getAverage() > o2.getAverage()) ? 1 : 0;
    }
}
