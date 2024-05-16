import java.util.*;

public class Time5A2 {
    static int hour, min;

    Time5A2(int h, int m) {
        hour = h;
        min = m;
    }

    public static void addTime(Time5A2 t1, Time5A2 t2) {
        int h = t1.hour + t2.hour;
        int m = t1.min + t2.min;                                        
        h += (m / 60);
        m = m % 60;
        System.out.println("Hours :- " + h + "\nMin :- " + m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First hour :- ");
        int h1 = sc.nextInt();
        System.out.print("Enter First Min :- ");
        int m1 = sc.nextInt();
        System.out.print("Enter Second hour :- ");
        int h2 = sc.nextInt();
        System.out.print("Enter Second Min :- ");
        int m2 = sc.nextInt();
        Time5A2 t1 = new Time5A2(h1, m1);
        Time5A2 t2 = new Time5A2(h2, m2);
        addTime(t1, t2);
    }
}
