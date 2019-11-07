import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Integer> certificates=new ArrayList<>(); //this is the collections of subject IDs that the student has obtained.

    //subclass constructor to initialise name, age, gender and certificates
    Student(String name, char gender, int age) {
        super(name, gender, age);
    }

    //method that adds the ID of the subject tot the collections of certificates
    void graduate(Subject subject){
        this.certificates.add(subject.getID());
    }

    //getter method that returns the ArrayList of certificates obtained by students
    ArrayList<Integer> getCertificates(){
        return certificates;
    }

    //method that checks whether or not the student has already obtained the certificate for the input subject
    boolean hasCertificate(Subject subject) {
        if(this.certificates.contains(subject.getID())) {
            return true;
        }else{
            return false;
        }
    }
}
