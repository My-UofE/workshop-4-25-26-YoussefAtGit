public class Circle {
  private double radius;
  private double originX;
  private double originY;

  public Circle(double radius, double originX, double originY) {
    this.radius = radius;
    this.originX = originX;
    this.originY = originY;
  }

  public Circle(double radius) {
    this(radius, 0, 0);
  }

  public Circle() {
    this(1, 0, 0);
  }

  public double getRadius() { return radius; }
  public double getOriginX() { return originX; }
  public double getOriginY() { return originY; }

  public void setRadius(double radius) {
    if (radius >= 0) this.radius = radius;
  }

  public void setOriginX(double originX) { this.originX = originX; }
  public void setOriginY(double originY) { this.originY = originY; }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getCircumference() {
    return 2 * Math.PI * radius;
  }

  public void move(double dx, double dy) {
    originX += dx;
    originY += dy;
  }

  public void scale(double factor) {
    setRadius(radius * factor);
  }

  public boolean isOverlappedWith(Circle other) {
    double dx = this.originX - other.originX;
    double dy = this.originY - other.originY;
    double dist = Math.sqrt(dx * dx + dy * dy);
    return dist <= (this.radius + other.radius);
  }

  public boolean isEnclosedBy(Circle other) {
    double dx = this.originX - other.originX;
    double dy = this.originY - other.originY;
    double dist = Math.sqrt(dx * dx + dy * dy);
    return dist + this.radius <= other.radius;
  }

  public String toString() {
    return "Circle[x=" + originX + ",y=" + originY + ",r=" + radius + "]";
  }
}
