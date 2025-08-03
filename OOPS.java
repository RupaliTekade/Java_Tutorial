class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("write something");

    }
    public void printcolor() {
         System.out.println(this.color);  //this  keyword tells which function called it
    }
}

class Student {

    String  name;
    int age;

    public void printInfo(){
        System.out.println();
        System.out.println("STUDENT INFORMATION ");
        System.out.println();
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age){
        this.name = name;
        this.age = age; 
    }
}

public class OOPS {
    
    public static void main(String args[]){

        Student s1 = new Student("rupss",22);

        s1.printInfo();
    }
}
