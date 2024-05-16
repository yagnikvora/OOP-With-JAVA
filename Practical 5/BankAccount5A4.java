import java.util.*;

class BankAccount5A4 {
    long acc_no;
    String username;
    String email;
    String acc_type;
    int balance;

    public void getAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account no :- ");
        acc_no = sc.nextLong();
        System.out.print("Enter Username :- ");
        username = sc.next();
        System.out.print("Enter Email :- ");
        email = sc.next();
        System.out.print("Enter Account type :- ");
        acc_type = sc.next();
        System.out.print("Enter Balance :- ");
        balance = sc.nextInt();
    }

    public void displayAccount() {
        System.out.println("\nAccount no is " + acc_no);
        System.out.println("Username is " + username);
        System.out.println("Email is " + email);
        System.out.println("Account Type is " + acc_type);
        System.out.println("Balance is " + balance);

    }
}

class Customer {
    public static void main(String[] args) {
        BankAccount5A4 b1 = new BankAccount5A4();
        b1.getAccount();
        b1.displayAccount();
    }
}
