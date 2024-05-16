import java.util.Scanner;

class FizzBuzzDemo extends Thread {
    int size;

    FizzBuzzDemo(int n) {
        size = n;
        start();
    }

    public void run() {
        try {
            for (int i = 1; i <= size; i++) {
                check(i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void check(int j) {
        if (j % 3 == 0 && j % 5 == 0)
            printFizzBuzz();
        else if (j % 3 == 0 && j % 5 != 0)
            printFizz();
        else if (j % 3 != 0 && j % 5 == 0)
            printBuzz();
        else if (j % 3 != 0 && j % 5 != 0)
            printNumber(j);
    }

    public void printFizz() {
        System.out.print("fizz,");
    }

    public void printBuzz() {
        System.out.print("buzz,");
    }

    public void printFizzBuzz() {
        System.out.print("fizzbuzz,");
    }

    public void printNumber(int val) {
        System.out.print(val + ",");
    }

}

class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        FizzBuzzDemo fb1 = new FizzBuzzDemo(n);
    }

}
