import java.util.*;

class Pettern4C7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size : ");
        // int s = sc.nextInt();
        int s = 3;

        for(int i = 0; i<s; i++){
            for(int j=s;j>i;j--)
                System.out.print(" ");
            for(int j=0; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i = s; i >=0; i--) {
            for (int j = s; j > i; j--)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}