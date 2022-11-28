import java.util.Scanner;

public class Point {
    double x, y;

    void move (double dx, double dy){        // move - перемещение
        x += dx;
        y += dy;

    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = in.nextDouble();
        System.out.println("Enter y: ");
        double y = in.nextDouble();
        move(x, y);
    }

    double getDistance(Point a){
        return  Math.sqrt(Math.pow(x - a.x, 2) + Math.pow(y - a.y, 2));
    }

    @Override // Override'им значит переопределяем
    public String toString () {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }




}



