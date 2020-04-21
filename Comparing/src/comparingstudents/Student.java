package comparingstudents;

import comparingstudents.mycomparing.CompareInterface;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author janvit
 */
public class Student implements CompareInterface, Comparable<Student>{
    private String firstName;
    private String lastName;
    private int studentNumber;
    ArrayList<Integer> grades = new ArrayList<>();

    public Student(String firstName, String lastName, int studentNumber,int [] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;

        for (int i = 0;i< grades.length;i++){
            insertGrade(grades[i]);
        }
    }

    public void insertGrade(int grade){
        if(grade < 6 && grade > 0){
            grades.add(grade);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
    
    //TODO calculateAverage - COMPLETE
    public double getAverage(){
        double average = 0;
        for(int grade : grades){
            average += grade;
        }
        return average / grades.size();
    }
    
    @Override
    public String toString() {
        return String.format("%10s%10s%10d",firstName, lastName, studentNumber);
    }

    public boolean isBigger(Student student) {
        return this.studentNumber > student.studentNumber;
    }

    //potrebne pro MyComparing
    @Override
    public boolean isBigger(CompareInterface o) {
        return this.studentNumber > ((Student)o).studentNumber;
    }

    /*@Override
    public int compareTo(Object o) {
        return this.studentNumber - ((Student)o).studentNumber;
    }*/

    //potrebne pro Comparing
    @Override
    public int compareTo(Student o) {
        return this.studentNumber - o.studentNumber;
    }
    
    //pri zmene equals zmenit i hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.firstName);
        hash = 97 * hash + Objects.hashCode(this.lastName);
        hash = 97 * hash + this.studentNumber;
        return hash;
    }
    
    //default in Object 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.studentNumber != other.studentNumber) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return true;
    }
}
