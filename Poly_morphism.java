
class Student{
    String name ; 
    int age;

    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(String name,int age){
        System.out.println(name + " "+ age);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
}

public class Poly_morphism {

    public static void main(String args[]){
         Student s1 = new Student();
         s1.name = "Rupali";
         s1.age = 22;

         s1.printinfo("rupali",22);
    }
   


}
