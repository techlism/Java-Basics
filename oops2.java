// Garbage Collector - A mechanism which is used by java to save memory or to destruct the object that are not in being used in the program.
// oops 2 - Inheritance
// It is the mechanism in java by which one class is allowed to inherit the features(fields and methods) of another class.
// In Java, inheritance means creating new classes based on existing ones. 
// A class that inherits from another class can reuse the methods and fields of that class.
class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}
//Single level inheritance
class Triangle extends Shape{
    //Now in Triangle we can directly use the properties of Shape class
    //Here Shape is base (parent) class and Triangle is sub(child) class.
    public void area(int l,int h){
        System.out.println((0.5)*l*h);
    }
}

//Multilevel inheritance
class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}

//Hierarichal inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14 * r * r);
    }
}

// Types of inheritance in Java :
// 1. Single inheritance
// 2. Multilevel inheritance
// 3. Hierarichal inheritance: one parent and multiple children.
// 4. Hybrid inheritance : Combination of single and multilevel.
// 5. Multiple inheritance (interfaces)

public class oops2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(12,15);
    }
}
//packages - group of similar types of classes interfaces and sub-packages.
//for example - import java.util.*; 