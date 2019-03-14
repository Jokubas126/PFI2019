public class Test {
    public static void main(String[] args){
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
        System.out.println(p1.distance(p2));
        System.out.println(dis(p1,p2));
    }
    public static double dis(MyPoint obj1, MyPoint obj2){
        double d = Math.sqrt((obj1.getX()-obj2.getX())*(obj1.getX()-obj2.getX())+(obj1.getY()-obj2.getY())*(obj1.getY()-obj2.getY()));
        return d;
    }
}
