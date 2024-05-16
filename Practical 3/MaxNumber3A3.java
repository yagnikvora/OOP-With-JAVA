import java.util.*;

public class MaxNumber3A3 {
    static int checkMax(int a,int b,int c){
        if(a>c || a>b){
            return a;
        }else if(b>c){
            return b;
        }else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :- ");
        int a = sc.nextInt();
        System.out.println("Enter first number :- ");
        int b = sc.nextInt();
        System.out.println("Enter first number :- ");
        int c = sc.nextInt();

        System.out.println("Max is :- "+checkMax(a, b, c));
    }
}
