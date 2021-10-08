public class Person {

    private String name;
    private int rollNo;

    Person(String name, int rollNo){

        this.name = name;
        this.rollNo = rollNo;

    }

    public String toString(){
         
        return "Name: " + this.name + "Roll No: " + this.rollNo; 

    }
    
}
