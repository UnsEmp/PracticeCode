package day11.demo6;

public class Circle implements ShapePara{
    double radius;
    private double x;
    private double y;

    public Circle(double radius) {
        this.radius = radius;
        this.x = 0;
        this.y = 0;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public int getCircumference() {
        return 0;
    }

    public static void main(String[] args) {
        Circle ci = new Circle(10);

        System.out.println("周长为：" + Circle.PI * 2 * ci.radius);
        System.out.println("面积为： " + Circle.PI * ci.radius * ci.radius);
    }
}
