import java.util.*;

class MatrixSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int res[][] = new int[3][3];


        System.out.print("Enter first array elemets \n\n");
        for(int i=0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                System.out.print("Enter a["+i+"]["+j+"] : -");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("\n\nEnter first array elemets \n\n");
        for(int i=0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                System.out.print("Enter b["+i+"]["+j+"] : -");
                b[i][j] = sc.nextInt();
            }
        }
          
        for(int i=0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                res[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of two Matrix");
        for(int i = 0; i<res.length; i++){
            for(int j = 0; j<res.length; j++){
                System.out.print(res[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
