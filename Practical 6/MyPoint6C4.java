class MyPoint {
    double x,y;
    MyPoint(){
        x = y = 0;
    }
    MyPoint(double x,double y){
        this.x = x;
        this.y = y;
    }
    void distance(MyPoint mp){
        double dis = Math.sqrt(Math.pow(mp.x - x,2) + Math.pow(mp.y - y,2));
        System.out.println("Distance between two points is : "+dis);
    }
}
class ThreeDPoint extends MyPoint{
    double z;
    ThreeDPoint(){
        super();
        z = 0;
    }
    ThreeDPoint(double x,double y,double z){
        super(x,y);
        this.z = z;
    }
    void getZ(){
        System.out.println("Z is "+z);
    }
    void distance(MyPoint mp){
        ThreeDPoint td = (ThreeDPoint)mp;
        double dis = Math.sqrt(Math.pow(x - td.x,2) + Math.pow(y - td.y,2) + Math.pow(z - td.z, 2));
        System.out.println("Distance between three dimensional points is : "+dis);
    }
}
class MyPoint6C4{
    public static void main(String[] args) {
        ThreeDPoint p1 = new ThreeDPoint();
        ThreeDPoint p2 = new ThreeDPoint(10, 30, 25.5);
        p1.distance(p2);
    }
}
