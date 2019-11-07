import java.util.ArrayList;

public class Course {
    Subject subject;
    private int daysUntilStarts;
    private int daysToRun;
    private Student enrolled[] = new Student[3];

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
        }
    }

    boolean enrolStudent(Student student){
        for (int i = 0; i < enrolled.length; i++)
            enrolled[i] = student;

        if(this.enrolled.length == 3){
            return false;
        }else if(daysUntilStarts<=0){
            return false;
        }else{
            return true;
        }
    }

    //getter method to return the number of students enrolled in the course
    int getSize(){
        return this.enrolled.length;
    }


}
