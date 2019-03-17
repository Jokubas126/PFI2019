public class HandIn5 {
    public static void main(String[] args){
        Triangle tr = new Triangle(1.0,1.5,1.0);
        tr.setColor("yellow");
        tr.setFilled(true);
        System.out.println(tr.toString() + " " + tr.getArea() + " " + tr.getPerimeter());
    }
}
