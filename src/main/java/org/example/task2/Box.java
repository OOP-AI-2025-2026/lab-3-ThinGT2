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
        if (length <= 0) throw new IllegalArgumentException("Довжина більше 0");
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0) throw new IllegalArgumentException("Ширина більше 0");
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0) throw new IllegalArgumentException("Висота більше 0");
        this.height = height;
    }

 

 
    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

 
    public double getLateralSurfaceArea() {
        return 2 * height * (length + width);
    }

    public double getVolume() {
        return length * width * height;
    }
}
