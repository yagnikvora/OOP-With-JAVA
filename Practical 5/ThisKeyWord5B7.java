public class ThisKeyWord5B7 {
    int a;
    static int b; 

    ThisKeyWord5B7(int a,int b) {
        this.a = a;
        this.b = b;
    }

    public void display()
    {
        System.out.println("a = "+a+"\nb = "+b);
    }
}

class Show {
    public static void main(String[] args) {
        ThisKeyWord5B7 t = new ThisKeyWord5B7(5,6);
        t.display();
    }
}
