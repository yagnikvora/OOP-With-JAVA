class ComplexNo{
    int real,imaginary;
    ComplexNo(){
        real = 0;
        imaginary = 0;
    }
    ComplexNo(int a){
        real = imaginary = a;
    }
    ComplexNo(int a, int b){
        real = a;
        imaginary = b;
    }

    public static void add(ComplexNo c1, ComplexNo c2){
        ComplexNo sum = new ComplexNo();
        sum.real = c1.real + c2.real;
        sum.imaginary = c1.imaginary + c2.imaginary;
        System.out.println(sum.real + " + " + sum.imaginary + "i");
    }
}

public class ComplexNo5B5{
    public static void main(String[] args) {
        ComplexNo co1 = new ComplexNo(10, 20);
        ComplexNo co2 = new ComplexNo(20);
        ComplexNo.add(co1,co2);
    }
}