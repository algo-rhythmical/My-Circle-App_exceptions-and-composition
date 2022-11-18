public class MyPoint {
    private double x;
    private double y;

    MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void setX (double x) {
        this.x = x;
    }

    void setY (double y) {
        this.y = y;
    }

    double getX () {
        return this.x;
    }

    double getY () {
        return this.y;
    }
}
