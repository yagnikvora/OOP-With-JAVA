import java.util.*;
public class PalindromeNumber3A2 {
    public static void main(String[] args) {
        int a,digit;
        Scanner s = new Scanner( System.in);
        System.out.print("Enter number :- ");
        a = s.nextInt();
        int temp = a;
        int rev=0;
        while(a>0){
            digit = a%10;
            rev = rev*10 + digit;
            a = a / 10;
        }
        if(temp == rev){
            System.out.println("Number is pelindrome");
        }else{
            System.out.println("Number is not pelindrome");
        }
    }
}
