import java.util.*;

class CountVow {
    String str;
    int count, a, e, i, o, u, j;
    Scanner sc = new Scanner(System.in);
    public void countVewels(String s) {
        str = s;
        while (true) {
            if (str.equals("quit"))
                break;
            else {
                a = e = i = o = u = 0;
                for (j=0;j < str.length();j++) {
                    if (str.charAt(j) == 'a' || str.charAt(j) == 'A')
                        a++;
                    if (str.charAt(j) == 'e' || str.charAt(j) == 'E')
                        e++;
                    if (str.charAt(j) == 'i' || str.charAt(j) == 'I')
                        i++;
                    if (str.charAt(j) == 'o' || str.charAt(j) == 'O')
                        o++;
                    if (str.charAt(j) == 'u' || str.charAt(j) == 'U')
                        u++;
                }
                System.out.println("a is :- " + a);
                System.out.println("e is :- " + e);
                System.out.println("i is :- " + i);
                System.out.println("o is :- " + o);
                System.out.println("u is :- " + u);
                System.out.print("Enter String :- ");
                str = sc.nextLine();
            }
            // countVewels(str);
        }

    }
}

public class CountVowels5A3 {
    public static void main(String[] args) {
        CountVow c = new CountVow();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String :- ");
        String strr = sc.nextLine();
        c.countVewels(strr);

    }
}
