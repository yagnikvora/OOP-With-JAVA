
import java.util.*;
public class CircleArea5A1 {
    static double r;
    
    CircleArea5A1(double r){
        this.r = r;
    }
    public static double area(){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter redius :- ");
        double radius = sc.nextDouble();
        CircleArea5A1 c1 = new CircleArea5A1(radius);
        System.out.println("Area :- "+c1.area());
    }
}
