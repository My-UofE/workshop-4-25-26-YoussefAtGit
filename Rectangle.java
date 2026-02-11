// A Rectangle class
public class Rectangle {

  // 4 instance attributes
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor (4 args)
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  // second constructor (2 args)
  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  // third constructor (0 args)
  public Rectangle() {
    this(1, 1, 0, 0);
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
    originX += dx;
    originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }

  // method: compute the perimeter of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  // getters
  public double getWidth() { return width; }
  public double getHeight() { return height; }
  public double getOriginX() { return originX; }
  public double getOriginY() { return originY; }

  // setters (disallow negative width/height)
  public void setWidth(double width) {
    if (width >= 0) this.width = width;
  }

  public void setHeight(double height) {
    if (height >= 0) this.height = height;
  }

  public void setOriginX(double originX) { this.originX = originX; }
  public void setOriginY(double originY) { this.originY = originY; }

  public String toString() {
    return "Rectangle[x=" + originX + ",y=" + originY + ",w=" + width + ",h=" + height + "]";
  }

  public String toString() {
    return "Rectangle[x=" + originX + ",y=" + originY + ",w=" + width + ",h=" + height + "]";
  }

}
