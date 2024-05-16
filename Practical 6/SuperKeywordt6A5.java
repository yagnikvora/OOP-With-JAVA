class A {
    int a;

    A(int a) {
        this.a = a;
    }

    void display() {
        System.out.println("In class A value of a is " + a);
    }
}

class B extends A {
    int a;

    B(int a, int b) {
        super(a); // to call perent class constructor
        this.a = b;
    }

    void display() {
        super.display();// to call perent class mathod
        System.out.println("In class B value of class A's variable a is " + super.a);
        System.out.println("In class B value of a is "+a);
    }
}

public class SuperKeywordt6A5 {
    public static void main(String[] args) {
        B b = new B(10,20);
        b.display();
    }
}
