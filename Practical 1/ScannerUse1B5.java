import java.util.*;

public class ScannerUse1B5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.print("Enter number to print :- ");
        a = s.nextInt();
        System.out.print("\n\nYour number :- "+a);
        s.close();
    }
}

