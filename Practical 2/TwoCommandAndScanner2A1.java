import java.util.*;
public class TwoCommandAndScanner2A1 {
    public static void main(String[] args) {
        int a1 = Integer.parseInt(args[0]);
        Scanner s = new Scanner(System.in);
        int a2;
        System.out.print("Enter number to generate sum with "+a1+" is :- ");
        a2 = s.nextInt();
        System.out.print("sum with "+a1+" is :- "+(a1 + a2));
    }
}
