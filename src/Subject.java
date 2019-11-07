public class Subject {

    private int id;
    private int specialism;
    private int duration;
    private String description;

    Subject(int id, int specialism, int duration){
        this.id=id;
        this.specialism=specialism;
        this.duration=duration;
    }

    int getID(){
        return id;
    }

    int getSpecialism(){
        return specialism;
    }

    int getDuration(){
        return duration;
    }

    String getDescription(){
        return description;
    }

    void setDescription(String desc){
        description=desc;
    }


}
