import java.util.*;
class NumberPettern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int s = sc.nextInt();

        for(int i = 0; i<s; i++){
            for(int j=s;j>i;j--)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print(j+" ");
            System.out.println();
        }
        for (int i = s; i >=0; i--) {
            for (int j = s; j > i; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}