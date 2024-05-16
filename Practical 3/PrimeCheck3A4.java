import java.util.*;

public class PrimeCheck3A4 {
    static void checkPrime(int a){
        int c = 1;
        for(int i =2; i<a; i++)
            if(a%i == 0)
                c = 0;

        if(c == 1)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check prime or not :- ");
        int a = sc.nextInt();
        checkPrime(a);
    }
}
