public class CircleWithException {
    private double Radius;

    public CircleWithException(double radius) {
        this.Radius = radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.Radius, 2);
    }

    public double getDiameter() {
        return 2 * this.Radius;
    }

}
