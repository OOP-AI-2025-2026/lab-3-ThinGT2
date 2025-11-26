public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }


    private void setLength(double length) {
        validate(length, "Length");
        this.length = length;
    }

    private void setWidth(double width) {
        validate(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        validate(height, "Height");
        this.height = height;
    }

 
    private void validate(double value, String name) {
        if (value <= 0) {
            throw new IllegalArgumentException(name + " більше ніж 0 ");
        }
    }

 
    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

 
    public double getLateralSurfaceArea() {
        return 2 * (length * height + width * height);
    }

    public double getVolume() {
        return length * width * height;
    }
}
