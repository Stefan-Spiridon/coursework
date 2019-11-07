import java.util.ArrayList;

public class Course {
    Subject subject;
    private int daysUntilStarts;
    private int daysToRun;
    private ArrayList<Student> enrolled = new ArrayList<>();

    Course(Subject sub, int days){
        this.subject=sub;
        this.daysUntilStarts=days;
        this.daysToRun=subject.getDuration();
    }

    Subject getSubject(){
        return subject;
    }

    int getStatus(){
        if(daysToRun==0){
            return 0;
        }

        if(daysUntilStarts>0){
            return (-daysUntilStarts);
        }else{
            return daysToRun;
        }
    }

    void aDayPasses(){
        daysUntilStarts--;
        if(daysUntilStarts<0){
            while (daysToRun>0) {
                daysToRun--;
                break;
            }
            if(daysToRun==0){
                for(Student student : enrolled){
                    student.graduate(this.subject);
                }
            }
        }
    }

    boolean enrolStudent(Student student){
        if(this.enrolled.size() == 3){
            return false;
        }else if(daysUntilStarts<=0){
            return false;
        }else{
            this.enrolled.add(student);
            return true;
        }
    }

    //getter method to return the number of students enrolled in the course
    int getSize(){
        return this.enrolled.size();
    }

    //getter method that returns the Student[] array of students enrolled in the course
    Student[] getStudents(){
        Student[] Student = new Student[this.enrolled.size()];
        Student=enrolled.toArray(Student);
        return Student;
    }



}
