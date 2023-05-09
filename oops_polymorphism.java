//Compile time and run time

//Function Overloading and Operator Overloading
//Function overloading - create functions with same name in a same class.
class NewStudent extends Student{
    //This is an example of function overloading
    //Return type cannot be same
    //If return type is same then arguments should be different.
    public void printInfo(String name) {
        System.out.println(name);
    }
    public void printInfo(int age) {
        System.out.println(age);
    }
    public void printInfo(String name,int age) {
        System.out.println(name+" "+ age);
    }        
}

class Double {
    int a;
    double b;
    public void sum(int a,int b){
        System.out.println("1st function "+(a+b));
    }
    public void sum(int a,double b){
        System.out.println("2nd function "+(a+b));
    }
    public void sum(double a,double b){
        System.out.println("3rd function "+(a+b));
    }
}

public class oops_polymorphism {
    public static void main(String[] args) {
        NewStudent s1 = new NewStudent();
        s1.age=20;
        s1.name="Kundan";
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.name,s1.age);
        Double num = new Double();
        num.a=1;
        num.b=12;
        num.sum(num.a,num.b);

    }
}
