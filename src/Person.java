public class Person {
    private String name;
    private char gender;
    private int age;

    //constructor that initialisez name, gender, age
    Person(String name, char gender, int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    //getter method that returns name
    String getName(){
        return name;
    }

    //getter methd that returns gender
    char getGender(){
        return gender;
    }

    //setter method to set the age of the person
    void setAge(int age){
        this.age=age;
    }

    //getter method to return the age of the person
    int getAge(){
        return age;
    }




}
