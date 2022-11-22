public class MyCircle {
    /* Attributes/Data fields/Properties */
    private MyPoint center;
    private double radius;

    /* Constructor(s) */
    MyCircle () {
        this.center = new MyPoint();
        this.radius = 1;
    }

    /* Method(s) */
    // Getters and Setters
    public void setRadius(double radius) throws RadiusInputException{
        if (radius > 0) {
            this.radius = radius;
        }else throw new RadiusInputException("Radius cannot be less than or equal to zero!");
    }
    public double getRadius() {
        return radius;
    }
    public void setX(double x) {
        center.setX(x);
    }
    public double getX() {
        return center.getX();
    }
    public void setY(double y) {
        center.setY(y);
    }
    public double getY() {
        return center.getY();
    }
    // Other helpful methods
    public boolean contains(double x2, double y2) {
        double distance = Math.sqrt( Math.pow((x2 - center.getX()), 2) + Math.pow((y2 - center.getY()), 2) );
        return (distance <= getRadius());
    }
}
