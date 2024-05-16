import java.util.*;
class ReverseArray4A3{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size :- ");
        int s = sc.nextInt();
        int a[] = new int[s];
        
        for(int i = 0;i<s;i++){
            System.out.print("Enter a["+i+"] element :- ");
            a[i] = sc.nextInt();
        }
        for(int i = a.length -1; i>=0 ; i--)
            System.out.println("a["+i+"] = " +a[i]);
    }
}