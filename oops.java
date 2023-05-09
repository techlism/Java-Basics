class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //Constructor (Non Parameterized)
    Student(){
        System.out.println("Constructor Called");
    }
    //Parameterized Constructor
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    //Copy Constructor (user defined)
    //We pass another object in the constructor
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    
    //Constructor can be private / public and protected.
}

public class oops {
    public static void main(String[] args) {
        //pen() is a constructor which is created by Java by default if not specified.
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();
        Pen pen2 = new Pen();
        pen2.color="green";
        pen2.type="ball-pen";
        pen1.printColor();
        pen2.printColor();

        //This is how we intialize an object in parameterized constructor
        Student s1 = new Student();
        s1.name="Kundan";
        s1.age=20;
        Student s2=new Student(s1);
        s2.printInfo();
    }
}