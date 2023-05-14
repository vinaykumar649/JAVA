import java.util.*;
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle : ");
        int r = sc.nextInt();
        Circle circle = new Circle(r);
        System.out.println("Radius of the circle: " + circle.getRadius());
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Perimeter of the circle: " + circle.calculatePerimeter());
}
}
    

