import java.util.*;

public class ConsonantsVowel4A1 {
    static void check(String str) {
        String s = str.toLowerCase();
        int c = 0;
        int v = 0;

        for (int i = 0; i < str.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                v++;
            else
                c++;
        }
        System.out.println("Total Vowels :- " + v + "\nTotal Consonants :- " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :- ");
        String s = sc.nextLine();
        check(s);
    }
}
