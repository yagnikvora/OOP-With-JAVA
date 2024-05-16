import java.util.*;

public class Result3A1 {
    public static void main(String[] args) {
        String name;
        int a1,a2,a3,a4,a5;
        float p;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name :- ");
        name = s.nextLine();
        System.out.print("Enter first marks :- ");
        a1 = s.nextInt();
        System.out.print("Enter second  marks :- ");
        a2 = s.nextInt();
        System.out.print("Enter third marks :- ");
        a3 = s.nextInt();
        System.out.print("Enter fourth marks :- ");
        a4 = s.nextInt();
        System.out.print("Enter fifth marks :- ");
        a5 = s.nextInt();
        p = (float)(a1+a2+a3+a4+a5)/(float)5.0;

        if(p>=60.00){
            System.out.println(name+" got First Division");
        }else if(p>=50.00 && p<=59.00){
            System.out.println(name+" got Second Division");
        }else if(p>=40.00 && p<=49.00){
            System.out.println(name+" got Third Division");
        }else if(p<40.00){
            System.out.println(name+" is Failed");
        }
    }
}

