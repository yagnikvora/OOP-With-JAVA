import java.util.*;

public class HalfString4A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        System.out.print("Enter String :- ");
        String str = sc.nextLine();
        System.out.println("Length od String = " + str.length());
        for (int i = str.length() / 2; i < str.length(); i++) {
            s += str.charAt(i);
        }
        System.out.print("Half String is " + s);
    }
}
