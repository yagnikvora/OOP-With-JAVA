abstract class Vegetable{
    abstract void toStringm();
}
class Potato extends Vegetable{
    String color;
    void toStringm(){
        System.out.println("Potato is brown");
    }
}
class Brinjal extends Vegetable{
    String color;
    void toStringm(){
        System.out.println("Brinjal is purple");
    }
}
class Tomato extends Vegetable{
    String color;
    void toStringm(){
        System.out.println("Tometo is red");
    }
}
class Vegetable7A1{
    public static void main(String[] args) {
        Potato p = new Potato();
        Brinjal b = new Brinjal();
        Tomato t = new Tomato();

        p.toStringm();
        b.toStringm();
        t.toStringm();
    }
}