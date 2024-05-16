public class ObjCount5B6 {
    static int cnt = 0;

    ObjCount5B6() {
        cnt++;
    }

    public static void main(String[] args) {
        ObjCount5B6 o1 = new ObjCount5B6();
        ObjCount5B6 o2 = new ObjCount5B6();
        System.out.println("Total objest : " + ObjCount5B6.cnt);
        ObjCount5B6 o3 = new ObjCount5B6();
        ObjCount5B6 o4 = new ObjCount5B6();
        System.out.println("Total objest : " + ObjCount5B6.cnt);
    }
}
