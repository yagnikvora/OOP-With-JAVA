import java.util.*;

class Pettern2Extra{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int s = sc.nextInt();

        for(int i = 0; i<s-1; i++){
            for(int j=s;j>i;j--)
                System.out.print(" ");
            for(int j=0; j<=i; j++)
                if(j==0 || j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        for (int i = s - 1; i >= 0; i--) {
            for (int j = s; j > i; j--)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                if(j==0 || j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }
}