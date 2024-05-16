final class A{ // final class cannot inherita
    //this is final class
}
class B{
    final int a = 10; // final variable cannot change during the programe

    void disp(){
        System.out.println("Final variable a :- "+a);
    }

    final void finalMathof(){ // final mathod cannot override in child class
        System.out.println("This is final mathod");
    }
}

public class FinalKeyword6A6 {
    public static void main(String[] args) {
        B b = new B();
        b.disp();
    }
}
