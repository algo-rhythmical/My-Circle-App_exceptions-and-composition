import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyCircle circle = new MyCircle();
        MyPoint testPoint = new MyPoint();

        System.out.print("Let's create the circle!" +"\n"+
                "Enter 2 numbers for X and Y value, respectively, for center of circle: ");
        circle.setX(input.nextDouble());
        circle.setY(input.nextDouble());

        boolean success = false;
        while (!success) {
            System.out.println("Enter a positive number for radius of circle: ");
            try {
                circle.setRadius(input.nextDouble());
                success = true;
            } catch (RadiusInputException e) {
                System.out.println(e);
            }
        }

        System.out.print("Let's create a point and test if it lies in our circle!" +"\n"+
                "Enter 2 numbers for X and Y value, respectively, for our point location: ");
        testPoint.setX(input.nextDouble());
        testPoint.setY(input.nextDouble());

        System.out.println("Our circle attributes are: Center: (" +circle.getX()+ ", " +circle.getY()+ "), Radius: " +circle.getRadius());
        System.out.println("Is our point: (" +testPoint.getX()+ ", " +testPoint.getY()+ ") inside the circle?");

        double x = testPoint.getX();
        double y = testPoint.getY();

        if (circle.contains(x, y)) {
            System.out.println("Yes!");
        } else System.out.println("No!");


    }
}
