import java.util.Scanner;

// Shape class
abstract class Shape {
    abstract double calculateArea();
    abstract double calculateVolume();
}

// Triangle class
class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    double calculateVolume() {
        return 0;
    }
}

// Circle class
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculateVolume() {
        return 0;
    }
}

// Rectangle class
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculateVolume() {
        return 0;
    }
}

// Sphere class
class Sphere extends Shape {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

// Cube class
class Cube extends Shape {
    private double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return 6 * side * side;
    }

    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a shape:");
        System.out.println("1. Triangle");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle");
        System.out.println("4. Sphere");
        System.out.println("5. Cube");
        int choice = scanner.nextInt();
        
        double area, volume;
        
        
        switch (choice) {
            case 1:
                System.out.print("Enter base length of triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height);
                area = triangle.calculateArea();
                volume = triangle.calculateVolume();
                break;
            case 2:
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                area = circle.calculateArea();
                volume = circle.calculateVolume();
                break;
            case 3:
                System.out.print("Enter length of rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of rectangle: ");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                area = rectangle.calculateArea();
                volume = rectangle.calculateVolume();
                break;
            case 4:
                System.out.print("Enter radius of sphere: ");
                radius = scanner.nextDouble();
                Sphere sphere = new Sphere(radius);
                area = sphere.calculateArea();
                volume = sphere.calculateVolume();
                break;
            case 5:
                System.out.print("Enter side length of cube: ");
                double side = scanner.nextDouble();
                Cube cube = new Cube(side);
                area = cube.calculateArea();
                volume = cube.calculateVolume();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        
        System.out.println("Area: " + area);
        if (choice >= 4) {
            System.out.println("Volume: " + volume);
        }
        scanner.close();
    }
}
