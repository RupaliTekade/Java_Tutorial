import java.util.*;

class shape{
    public void area(){
        System.out.println("dispalys area");
    }
}

class Triangle extends shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

public class inheritance{
    public static void main(String args[])
    {
      
        Triangle t1 = new Triangle();
        t1.area(3,5);
        
    }
}