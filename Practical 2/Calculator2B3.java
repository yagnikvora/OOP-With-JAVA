import java.util.*;

public class Calculator2B3 {
    public static void main(String[] args) {
        int a,b;
        char c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number :- ");
        a = s.nextInt();
        System.out.print("Enter second number :- ");
        b = s.nextInt();
        System.out.print("Enter operation(+,-,*,/) :- ");
        c = s.next().charAt(0);

        switch (c) {
            case '+':
                System.out.print("Answer is :- "+(a+b));
                break;
            case '-':
                System.out.print("Answer is :- "+(a-b));
                break;
            case '*':
                System.out.print("Answer is :- "+(a*b));
                break;
            case '/':
                System.out.print("Answer is :- "+((float)a/(float)b));
                break;
            default:
                break;
        }
    }
}
