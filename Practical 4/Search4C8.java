import java.util.*;

public class Search4C8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :- ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter elements in ascending order......");
        for(int i =0 ; i<size; i++){
            System.out.print("a["+i+"] :- ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter pivot :- ");
        int pivot = sc.nextInt();
        int temp[] = new int[size];
        
        if(pivot > a.length){
            System.out.println("wrong pivot entered!!!!");
            System.exit(0);
        }

        int i=0;
        for(int j = pivot; j<size; j++){
            temp[i] = a[j];
            i++;
        }
        for(int j =0; j<pivot ;j++){
            temp[i] = a[j];
            i++;
        }
        a=temp;
        for(int j:a){
            System.out.print(j+",");
        }
        System.out.println("\nEnter element to search :- ");
        int search = sc.nextInt();
        for(int j =0; j<size ; j++){
            if(a[j] == search){
                System.out.println("Location of "+search+" is "+j);
                System.exit(0);
            }
        }
        System.out.println("-1");
    }
}
