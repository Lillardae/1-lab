import java.util.Scanner;

public class Point {
    private double x;
    private double y;
    private double z;

    public void init(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void read() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите x: ");
        this.x = scan.nextDouble();
        System.out.print("Введите y: ");
        this.y = scan.nextDouble();
        System.out.print("Введите z: ");
        this.z = scan.nextDouble();
    }

    public void display() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double distanceToOrigin() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public static Point add(Point a, Point b) {
        Point result = new Point();
        result.init(a.x + b.x, a.y + b.y, a.z + b.z);
        return result;
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        System.out.println("Введите координаты первой точки:");
        p1.read();

        System.out.println("\nВведите координаты второй точки:");
        p2.read();

        System.out.print("\nПервая точка: ");
        p1.display();

        System.out.print("Вторая точка: ");
        p2.display();

        System.out.println("\nМеняем x у первой точки на 10...");
        p1.setX(10);
        System.out.println("Теперь p1.x = " + p1.getX());

        System.out.println("\nРасстояние p1 до начала координат: " + p1.distanceToOrigin());
        System.out.println("Расстояние p2 до начала координат: " + p2.distanceToOrigin());

        Point sum = Point.add(p1, p2);
        System.out.print("\nСумма двух точек: ");
        sum.display();
    }
}
