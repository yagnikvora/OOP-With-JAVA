import java.util.*;

public class Patter4B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :- ");
        String s = sc.next();
        
        for(int i =0 ; i<s.length() ; i++){
            for(int j = 0 ; j<s.length()-i-1 ; j++)
                System.out.print(" ");
            for(int j = 0 ; j<=i ; j++)
                System.out.print(s.charAt(j)+" ");
            System.out.println();
        }
    }
}
