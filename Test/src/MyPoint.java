public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint obj){
        double d = Math.sqrt((obj.getX()-x)*(obj.getX()-x)+(obj.getY()-y)*(obj.getY()-y));
        return d;
    }


    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}
