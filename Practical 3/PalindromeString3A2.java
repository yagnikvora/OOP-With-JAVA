import java.util.*;

public class PalindromeString3A2 {
    static void check(String str){
        String s = "";

        for(int i=str.length()-1 ; i>=0 ; i--)
            s += str.charAt(i);

        if(s.equals(str))
            System.out.println("string is palindrome");
        else    
            System.out.println("String is not palindrome");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to check :- ");
        String s = sc.nextLine();
        check(s);
    }
}
