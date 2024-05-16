interface A {
    final int a = 10;

    void mathodA();
}

interface A1 extends A {
    final int a1 = 20;

    void mathodA1();
}

interface A2 extends A {
    final int a2 = 30;

    void mathodA2();
}

interface A12 extends A1, A2 {
    final int a12 = 40;

    void mathodA12();
}

class B implements A12 {
    public void mathodA() {
        System.out.println("a = " + a);
    }

    public void mathodA1() {
        System.out.println("a1 = " + a1);
    }

    public void mathodA2() {
        System.out.println("a2 = " + a2);
    }

    public void mathodA12() {
        System.out.println("a12 = " + a12);
    }
}

class Interface7A2 {
    public static void main(String[] args) {
        B b = new B();
        b.mathodA();
        b.mathodA1();
        b.mathodA2();
        b.mathodA12();
    }
}